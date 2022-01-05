package xyDemo.studyVisitor.exp1.factoryImpl;

public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.PPT;
    }
}
