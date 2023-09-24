package org.quangphan.java.design.patterns.proxy_pattern.protection.bannedsites;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {

        if (bannedSites.contains(serverHost)) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }
}
