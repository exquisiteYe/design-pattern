package xyDemo.studyVisitor.exp1.step3;


/**
 * 文件父类，提供文件操作的抽象方法，提取和压缩。
 */
public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Extractor extractor);
    abstract public void accept(Compressor compressor);
}


