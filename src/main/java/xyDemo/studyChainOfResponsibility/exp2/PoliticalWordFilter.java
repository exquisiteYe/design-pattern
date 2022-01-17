package xyDemo.studyChainOfResponsibility.exp2;

public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        return false;
    }
}
