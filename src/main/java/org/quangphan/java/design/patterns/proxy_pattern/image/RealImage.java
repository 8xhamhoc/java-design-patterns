package org.quangphan.java.design.patterns.proxy_pattern.image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
    }

    @Override
    public void display() {
        System.out.println("Display image with name: " + fileName);
    }
}
