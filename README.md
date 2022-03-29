# qex-jenkins-plugin
## How to Build
* Update src/main/java/io/shopee/jenkins/plugins/utils/HttpPostQex.java with your QEX server
    *  https://github.com/luohuahuang/qex
* Install JDK11
* `mvn verify`
* If you want to run it from local, `mvn hpi:run`
* Then login Jenkins to import the .hpi as a plugin
