package com.mickjoust.demo.jdp.chp3.a30_templatemethod;

import sun.security.pkcs11.P11Util;

/**
 * @author mickjoust(huangjingfeng)
 * @since 2021/6/14
 **/
public abstract class DeployFlow {

    //使用final关键在来约束步骤不能轻易修改
    public final void buildFlow() {
        pullCodeFromGitlab(); //从gitlab上拉去代码
        compileAndPackage();  //编译打包
        copyToTestServer();   //部署测试环境
        testing();            //测试
        copyToRemoteServer(); //上传包到线上环境
        startApp();           //启动程序
    }

    public abstract void pullCodeFromGitlab();
    public abstract void compileAndPackage();
    public abstract void copyToTestServer();
    public abstract void testing();

    private void copyToRemoteServer() {
        System.out.println("统一自动上传 启动APP包到对应线上服务器");
    }

    private void startApp() {
        System.out.println("统一自动 启动线上APP");
    }

}
