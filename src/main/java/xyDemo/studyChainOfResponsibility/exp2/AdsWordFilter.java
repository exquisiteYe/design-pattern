package xyDemo.studyChainOfResponsibility.exp2;

public class AdsWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        return false;
    }
}
