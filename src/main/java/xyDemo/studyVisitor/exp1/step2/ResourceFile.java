package xyDemo.studyVisitor.exp1.step2;


public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Extractor extractor);
}


