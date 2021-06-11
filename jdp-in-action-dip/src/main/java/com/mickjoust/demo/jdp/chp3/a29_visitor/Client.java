package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 */
public class Client {
    public static void main(String[] args) {
        LinuxRouterVisitor linuxRouterVisitor = new LinuxRouterVisitor();
        WindowsRouterVisitor windowsRouterVisitor = new WindowsRouterVisitor();

        DLinkRouter dLinkRouter = new DLinkRouter();
        dLinkRouter.accept(linuxRouterVisitor);
        dLinkRouter.accept(windowsRouterVisitor);

        TPLinkRouter tpLinkRouter = new TPLinkRouter();
        tpLinkRouter.accept(linuxRouterVisitor);
        tpLinkRouter.accept(windowsRouterVisitor);
    }
}
