package xyDemo.study2Factory.factoryMethod;


import xyDemo.study2Factory.IRuleConfigParser;
import xyDemo.study2Factory.IRuleConfigParserFactory;
import xyDemo.study2Factory.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
