package com.mickjoust.demo.jdp.chp3.a30_templatemethod;

/**
 * @author mickjoust(huangjingfeng)
 * @since 2021/6/14
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("开始本地 手动发布流程======");

        DeployFlow localDeployFlow = new LocalDeployFlow();
        localDeployFlow.buildFlow();

        System.out.println("********************");

        System.out.println("开始 CICD 发布流程======");


        DeployFlow cicdDeployFlow = new CicdDeployFlow();
        cicdDeployFlow.buildFlow();
    }
}
