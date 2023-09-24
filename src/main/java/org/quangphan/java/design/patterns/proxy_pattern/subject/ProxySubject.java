package org.quangphan.java.design.patterns.proxy_pattern.subject;

public class ProxySubject extends Subject {

    private Subject subject;

    public ProxySubject() {
        if (subject == null) {
            subject = new ConcreteSubject();
        }
    }

    @Override
    public void doSomething() {
        System.out.println("Proxy subject do something");
        subject.doSomething();
    }
}
