package xyDemo.testWeb;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    Dog(){}

    public String getDogName() {
        return "Doge's is " + name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
