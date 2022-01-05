package xyDemo.studyVisitor.exp1.step4;

/**
 * 功能类。
 * 通过实现visitor接口，来完成对三种文件类型的压缩。之前是硬写的
 */
public class Compressor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        //...
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Compress PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //...
        System.out.println("Compress WORD.");
    }

}
