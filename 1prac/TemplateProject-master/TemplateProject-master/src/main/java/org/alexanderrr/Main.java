package org.alexanderrr;

public class Main {
    public static void main(String[] args) {
        DataMiner pdfDataMiner = new PDFDataMiner();
        DataMiner txtDataMiner = new TXTDataMiner();
        pdfDataMiner.mine("url");
        txtDataMiner.mine("url");
    }
}