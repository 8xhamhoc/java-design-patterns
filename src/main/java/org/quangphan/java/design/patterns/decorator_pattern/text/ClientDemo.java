package org.quangphan.java.design.patterns.decorator_pattern.text;

public class ClientDemo {

    public static void main(String[] args) {

        Text plainText = new PlainText("Hello");
        Text underlineText = new UnderlineTextDecorator(plainText);
        Text boldText = new BoldDecorator(underlineText);
        System.out.println(boldText.getContent());
    }
}
