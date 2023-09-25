package org.quangphan.java.design.patterns.decorator_pattern.text;

public class UnderlineTextDecorator implements TextDecorator {

    protected Text text;

    public UnderlineTextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return "<i>" + text.getContent() + "</i>";
    }
}
