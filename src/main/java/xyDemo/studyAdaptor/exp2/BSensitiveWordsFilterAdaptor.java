package xyDemo.studyAdaptor.exp2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * BSensitiveWordsFilter 的适配器类
 */
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter{
    @Autowired
    private BSensitiveWordsFilter bSensitiveWordsFilter;

    @Override
    public String filter(String text) {
        return bSensitiveWordsFilter.filter(text);
    }
}
