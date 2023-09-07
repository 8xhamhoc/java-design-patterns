package org.quangphan.java.design.patterns.prototype_pattern.phone;

public class CustomPhoneCase implements PhoneCase {

    private String design;
    private String phoneModel;

    public CustomPhoneCase() {
        this.design = "Default Design";
        this.phoneModel = "Default Model";
    }

    @Override
    public PhoneCase clone() {
        CustomPhoneCase clone = new CustomPhoneCase();
        clone.customizeDesign(this.design);
        clone.fitPhoneModel(this.phoneModel);
        return clone;
    }

    @Override
    public void customizeDesign(String design) {
        this.design = design;
    }

    @Override
    public void fitPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    @Override
    public void printDetails() {
        System.out.println("Custom Phone Case - Design: " + design + ", Phone Model: " + phoneModel);
    }
}
