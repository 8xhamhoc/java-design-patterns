package org.quangphan.java.design.patterns.prototype_pattern.phone;

public class ClientDemo {

    public static void main(String[] args) {

        // Create prototype phone cases
        PhoneCase caseWithFloralDesign = new CustomPhoneCase();
        caseWithFloralDesign.customizeDesign("Floral Pattern");
        caseWithFloralDesign.fitPhoneModel("iPhone X");

        PhoneCase caseWithGeometricDesign = new CustomPhoneCase();
        caseWithGeometricDesign.customizeDesign("Geometric Pattern");
        caseWithGeometricDesign.fitPhoneModel("Samsung Galaxy S21");

        // Customers place orders
        CustomPhoneCaseOrder order1 = new CustomPhoneCaseOrder(caseWithFloralDesign);
        PhoneCase customCase1 = order1.createPhone();
        customCase1.printDetails();

        CustomPhoneCaseOrder order2 = new CustomPhoneCaseOrder(caseWithGeometricDesign);
        PhoneCase customCase2 = order2.createPhone();
        customCase2.printDetails();
    }
}
