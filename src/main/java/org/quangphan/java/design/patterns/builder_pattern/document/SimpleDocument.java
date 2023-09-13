package org.quangphan.java.design.patterns.builder_pattern.document;

public class SimpleDocument implements Document {

    String title;
    String content;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}
