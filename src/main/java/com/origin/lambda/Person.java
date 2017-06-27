package com.origin.lambda;

/**
 * 类  bean
 * Created by panther on 17-6-27.
 */
public class Person {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void go(Person person, Moveable moveable) {
        moveable.move(person);
    }

    interface Moveable {
        public void move(Person person);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setName("Lyong");


        //内部类实现
        person.go(person, new Moveable() {

            @Override
            public void move(Person person) {
                System.out.println(person.getName() + " 正在行动 !!");
            }
        });

        //Lambda实现方式
        person.go(person, person1 -> {
            System.out.println(person1.getName() + " 正在行动! ");
        });

    }
}
