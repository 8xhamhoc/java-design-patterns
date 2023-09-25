package org.quangphan.java.design.patterns.decorator_pattern.text;

public class PlainText implements Text {

    protected String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
