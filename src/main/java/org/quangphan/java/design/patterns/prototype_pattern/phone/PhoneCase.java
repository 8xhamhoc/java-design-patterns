package org.quangphan.java.design.patterns.prototype_pattern.phone;

public interface PhoneCase {

    PhoneCase clone();
    void customizeDesign(String design);
    void fitPhoneModel(String phoneModel);
    void printDetails();
}
