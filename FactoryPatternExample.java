interface Document{
 void createDocument();
}
class WordDocument implements Document{
    public void createDocument(){
        System.out.println("Doc type is Word");
}
}
class PdfDocument implements Document{
    public void createDocument(){
        System.out.println("Doc type is PDF");
}}
class ExcelDocument implements Document{
    public void createDocument(){
    System.out.println("Doc type is Excel");
}
}

class DocumentFactory{

    public static Document getDocument(String type){

        if(type.equals("WORD"))
            return new WordDocument();

        else if(type.equals("PDF"))
            return new PdfDocument();

        else
            return new ExcelDocument();
    }
}

public class FactoryPatternExample{
public static void main(String[] args){

    Document d = DocumentFactory.getDocument("PDF");

    d.createDocument();
}
}
