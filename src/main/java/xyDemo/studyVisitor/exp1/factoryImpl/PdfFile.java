package xyDemo.studyVisitor.exp1.factoryImpl;

/**
 * pdf文件类
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.PDF;
    }
    //...
}
