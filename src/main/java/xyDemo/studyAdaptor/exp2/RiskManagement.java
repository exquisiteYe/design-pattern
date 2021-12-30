package xyDemo.studyAdaptor.exp2;

import java.util.ArrayList;
import java.util.List;

/**
 * 采用适配器后的调用
 * 扩展性更好，更加符合开闭原则，如果添加一个新的敏感词过滤系统
 * 这个类完全不需要改动；而且基于接口而非实现编程，代码的可测试性更好。
 */
public class RiskManagement {
    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
        filters.add(filter);
    }

    public String filterSensitiveWords(String text) {
        String maskedText = text;
        // 遍历，统一管理。
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }
}
