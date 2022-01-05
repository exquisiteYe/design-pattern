package xyDemo.studyVisitor.exp1.factoryImpl;


public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    public abstract ResourceFileType getType();
}
