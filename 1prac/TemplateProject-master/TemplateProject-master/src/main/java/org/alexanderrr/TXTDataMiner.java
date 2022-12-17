package org.alexanderrr;

import java.io.File;

public class TXTDataMiner extends DataMiner{
    @Override
    public File openFile(String path) {
        System.out.println("Открыли txt файл");
        return(new File(path));
    }

    @Override
    public void closeFile(File file) {
        //closeFile(file);
        System.out.println("Закрыли txt файл");
    }

    @Override
    public String[] extractData(File file) {
        System.out.println("Считали данные из txt файла");
        return new String[5];
    }
}
