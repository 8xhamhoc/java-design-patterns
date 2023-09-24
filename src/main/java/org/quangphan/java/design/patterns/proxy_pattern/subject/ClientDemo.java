package org.quangphan.java.design.patterns.proxy_pattern.subject;

public class ClientDemo {

    public static void main(String[] args) {

        Subject proxy = new ProxySubject();

        proxy.doSomething();
    }
}
