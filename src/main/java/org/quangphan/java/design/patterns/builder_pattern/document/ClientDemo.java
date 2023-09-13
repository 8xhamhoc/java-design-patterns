package org.quangphan.java.design.patterns.builder_pattern.document;

public class ClientDemo {

    public static void main(String[] args) {

        DocumentBuilder documentBuilder = new SimpleDocumentBuilder();
        DocumentDirector documentDirector = new DocumentDirector(documentBuilder);
        documentDirector.construct("A", "B");
        Document document = documentBuilder.buildDocument();
        document.print();
    }
}
