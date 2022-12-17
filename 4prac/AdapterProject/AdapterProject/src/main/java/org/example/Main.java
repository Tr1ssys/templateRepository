package org.example;


public class Main {
    public static void main(String[] args) {
        String XMLData = new DataProvider().takeInformation();
        String JSONData = new XMLtoJSONAdapter().XMLtoJSON(XMLData);
        CheckData checkData = new CheckData();
        checkData.dataAnalyze(JSONData);
        checkData.dataAnalyze(XMLData);
    }

}

class DataProvider {
    public String takeInformation(){
        System.out.println("Возвращаем дату в XML");
        return "XMLData";
    }
}

class XMLtoJSONAdapter{
    public String XMLtoJSON(String data){
        System.out.println("Конвертировали данные из XML в JSON");
        return "JSONData";
    }
}

class CheckData{
    public void dataAnalyze(String data){
        if (data.equals("JSONData")){
            System.out.println("Приняли данные в виде JSON");
        }
        else{
            System.out.println("Формат данных не подходит, передайте данные в виде JSON");
        }
    }
}