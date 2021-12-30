package xyDemo.designPack.flyweight.exp2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 操作Character的 类
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
