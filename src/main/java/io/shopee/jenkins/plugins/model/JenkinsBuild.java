package io.shopee.jenkins.plugins.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author huanglh
 */
public class JenkinsBuild {

    /**
     * @return the jiraNum
     */
    public String getJiraNum() {
        return jiraNum;
    }

    /**
     * @param jiraNum the jiraNum to set
     */
    public void setJiraNum(String jiraNum) {
        this.jiraNum = jiraNum;
    }

    /**
     * @return the qapNum
     */
    public String getQapNum() {
        return qapNum;
    }

    /**
     * @param qapNum the qapNum to set
     */
    public void setQapNum(String qapNum) {
        this.qapNum = qapNum;
    }
    @SerializedName(value = "job_name")
    private String jobName;
    
    @SerializedName(value = "build_num")
    private String buildNum;
    
    @SerializedName(value = "node_name")
    private String nodeName;
    
    @SerializedName(value = "build_cause")
    private String buildCause;
    
    @SerializedName(value = "git_branch")
    private String gitBranch;
    
    @SerializedName(value = "build_url")
    private String buildUrl;

    @SerializedName(value = "jira_num")
    private String jiraNum;
    
    @SerializedName(value = "qap_num")
    private String qapNum;
    
    /**
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName the jobName to set
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return the buildNum
     */
    public String getBuildNum() {
        return buildNum;
    }

    /**
     * @param buildNum the buildNum to set
     */
    public void setBuildNum(String buildNum) {
        this.buildNum = buildNum;
    }

    /**
     * @return the nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * @param nodeName the nodeName to set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * @return the buildCause
     */
    public String getBuildCause() {
        return buildCause;
    }

    /**
     * @param buildCause the buildCause to set
     */
    public void setBuildCause(String buildCause) {
        this.buildCause = buildCause;
    }

    /**
     * @return the gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    /**
     * @param gitBranch the gitBranch to set
     */
    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    /**
     * @return the buildUrl
     */
    public String getBuildUrl() {
        return buildUrl;
    }

    /**
     * @param buildUrl the buildUrl to set
     */
    public void setBuildUrl(String buildUrl) {
        this.buildUrl = buildUrl;
    }
}
