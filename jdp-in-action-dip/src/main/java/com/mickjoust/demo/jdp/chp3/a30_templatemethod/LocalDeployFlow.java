package com.mickjoust.demo.jdp.chp3.a30_templatemethod;

/**
 * @author mickjoust(huangjingfeng)
 * @since 2021/6/14
 **/
public class LocalDeployFlow extends DeployFlow{

    @Override
    public void pullCodeFromGitlab() {
        System.out.println("手动将代码拉取到本地电脑......");
    }

    @Override
    public void compileAndPackage() {
        System.out.println("在本地电脑上手动执行 编译&打包......");
    }

    @Override
    public void copyToTestServer() {
        System.out.println("手动通过 SSH 上传包 到 本地的测试服务......");
    }

    @Override
    public void testing() {
        System.out.println("执行手工测试......");
    }
}
