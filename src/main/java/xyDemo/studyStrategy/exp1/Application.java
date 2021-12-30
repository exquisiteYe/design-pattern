package xyDemo.studyStrategy.exp1;

import java.io.FileInputStream;
import java.util.Properties;

// 运行时动态确定，根据配置文件的配置决定使用哪种策略
public class Application {
    public static void main(String[] args) throws Exception {
        Strategy evictionStrategy = null;
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("eviction_type");
        evictionStrategy = StrategyFactory.getStrategy(type);
        UserCache userCache = new UserCache(evictionStrategy);
        //...
    }
}
