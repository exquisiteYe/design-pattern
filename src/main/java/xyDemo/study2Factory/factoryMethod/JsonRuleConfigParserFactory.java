package xyDemo.study2Factory.factoryMethod;

import xyDemo.study2Factory.IRuleConfigParser;
import xyDemo.study2Factory.IRuleConfigParserFactory;
import xyDemo.study2Factory.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
