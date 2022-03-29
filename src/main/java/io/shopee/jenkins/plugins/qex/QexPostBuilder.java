package io.shopee.jenkins.plugins.qex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hudson.EnvVars;
import hudson.Launcher;
import hudson.Extension;
import hudson.FilePath;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Publisher;
import hudson.tasks.Recorder;
import io.shopee.jenkins.plugins.model.JenkinsBuild;
import io.shopee.jenkins.plugins.utils.HttpPostQex;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.IOException;
import jenkins.tasks.SimpleBuildStep;
import org.jenkinsci.Symbol;

public class QexPostBuilder extends Recorder implements SimpleBuildStep {

    @DataBoundConstructor
    public QexPostBuilder() {
    }

    @Override
    public void perform(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws InterruptedException, IOException {
        EnvVars env = run.getEnvironment(listener);
        JenkinsBuild build = new JenkinsBuild();
        build.setBuildCause(env.get("BUILD_CAUSE"));
        build.setBuildNum(env.get("BUILD_NUMBER"));
        build.setBuildUrl(env.get("BUILD_URL") + "/api/json");
        build.setGitBranch(env.get("GIT_BRANCH"));
        build.setJiraNum(env.get("JIRA_NUM"));
        build.setJobName(env.get("JOB_NAME"));
        build.setNodeName(env.get("NODE_NAME"));
        build.setQapNum(env.get("QAP_NUM"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        listener.getLogger().println(gson.toJson(build));
        listener.getLogger().println(HttpPostQex.sendWithBody(gson.toJson(build)));
    }

    @Symbol("qex")
    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Publisher> {

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return Messages.QexPostBuilder_DescriptorImpl_DisplayName();
        }

    }

}
