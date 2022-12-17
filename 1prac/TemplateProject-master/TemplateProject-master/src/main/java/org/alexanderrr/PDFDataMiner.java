package org.alexanderrr;

import java.io.File;

public class PDFDataMiner extends DataMiner{

    @Override
    public File openFile(String path) {
        System.out.println("Открыли PDF файл");
        return(new File(path));
    }

    @Override
    public void closeFile(File file) {
        //closeFile(file);
        System.out.println("Закрыли PDF файл");
    }

    @Override
    public String[] extractData(File file) {
        System.out.println("Считали данные из PDF файла");
        return new String[5];
    }
}
