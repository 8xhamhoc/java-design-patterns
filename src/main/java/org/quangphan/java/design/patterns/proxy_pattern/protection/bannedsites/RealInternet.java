package org.quangphan.java.design.patterns.proxy_pattern.protection.bannedsites;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
}
