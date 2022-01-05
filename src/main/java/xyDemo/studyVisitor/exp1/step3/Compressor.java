package xyDemo.studyVisitor.exp1.step3;

public class Compressor {
    public void compress(PdfFile file){
        System.out.println("compress pdf file");
    }

    public void compress(PPTFile file){
        System.out.println("compress ppt file");
    }

    public void compress(WordFile file){
        System.out.println("compress word file");
    }

}
