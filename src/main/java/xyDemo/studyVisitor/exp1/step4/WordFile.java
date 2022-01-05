package xyDemo.studyVisitor.exp1.step4;

public class WordFile extends ResourceFile{
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
