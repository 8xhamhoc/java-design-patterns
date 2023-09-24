package org.quangphan.java.design.patterns.proxy_pattern.subject;

public class ConcreteSubject extends Subject {

    @Override
    public void doSomething() {
        System.out.println("Concrete subject do something");
    }
}
