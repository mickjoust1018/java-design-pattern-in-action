package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 包裹得我上下文信息类
 */
public class PackageContext {

    private PackageState currentState;
    private String packageId;

    public PackageContext(PackageState currentState, String packageId) {
        this.currentState = currentState;
        this.packageId = packageId;
        if(currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update() {
        currentState.updateState(this);
    }

}
