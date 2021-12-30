package xyDemo.designPack.flyweight.exp2;

/**
 * 面向用户的【文字】类
 */
public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
