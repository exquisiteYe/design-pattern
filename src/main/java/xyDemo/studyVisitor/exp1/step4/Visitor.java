package xyDemo.studyVisitor.exp1.step4;

/**
 * visitor 接口 ，用于集中管理pdf、ppt、word等文件的处理（2txt、压缩等）
 */
public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}
