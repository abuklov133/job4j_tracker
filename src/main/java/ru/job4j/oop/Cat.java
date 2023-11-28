package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There's guv's food");
        Cat guv = new Cat();
        guv.giveNick("Guv");
        guv.eat("котлета");
        guv.show();
        Cat black = new Cat();
        System.out.println("There's black's food");
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
