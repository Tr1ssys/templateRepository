package org.alexanderrr;

import java.io.File;

abstract class DataMiner { //ParseData, AnalyzeData, SendReport - Шаги с реализацией по умолчанию
    public final void mine(String path){
        File file = openFile(path);
        String[] rawData = extractData(file);
        String[] data = parseData(rawData);
        String analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }
    public abstract File openFile(String path);

    public abstract void closeFile(File file);
    public abstract String[] extractData(File file);
    public String[] parseData(String[] rawData){
        System.out.println("Подготовили данные к анализу");
        return(new String[5]);
    }
    public String analyzeData(String[] data){
        System.out.println("Проанализировали данные");
        return ("Анализ данных");
    }
    public void sendReport(String analysis){
        //Отправляем отчёт
        System.out.println("Отчёт отправлен");
    }
}