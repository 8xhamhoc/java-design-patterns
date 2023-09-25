package org.quangphan.java.design.patterns.decorator_pattern.text;

public class BoldDecorator implements TextDecorator {

    protected Text text;

    public BoldDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return "<b>" + text.getContent() + "</b>";
    }
}
