package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 2 - 仓库处理中
 */
public class WarehouseProcessing implements PackageState  {

    //Singleton
    private static WarehouseProcessing instance = new WarehouseProcessing();

    private WarehouseProcessing() {}

    public static WarehouseProcessing instance() {
        return instance;
    }


    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("2 - Package is WarehouseProcessing");
        ctx.setCurrentState(InTransition.instance());
    }
}
