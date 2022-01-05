package xyDemo.studyVisitor.exp1.factoryImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * 提取工厂，将 文件类型 跟对应的 文件提取对象 做映射缓存。
 */
public class ExtractorFactory {
    private static final Map<ResourceFileType, Extractor> extractors = new HashMap<>();

    static {
        extractors.put(ResourceFileType.PDF, new PdfExtractor());
        extractors.put(ResourceFileType.PPT, new PPTExtractor());
        extractors.put(ResourceFileType.WORD, new WordExtractor());
    }

    public static Extractor getExtractor(ResourceFileType type) {
        return extractors.get(type);
    }
}
