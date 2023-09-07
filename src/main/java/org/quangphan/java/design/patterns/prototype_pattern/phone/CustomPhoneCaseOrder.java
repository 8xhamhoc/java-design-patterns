package org.quangphan.java.design.patterns.prototype_pattern.phone;

public class CustomPhoneCaseOrder {

    private PhoneCase phoneCase;

    public CustomPhoneCaseOrder(PhoneCase phoneCase) {
        this.phoneCase = phoneCase;
    }

    public PhoneCase createPhone() {
        return this.phoneCase.clone();
    }
}
