package Lessons;

public class Cat extends Animal {


    public Cat (String name, String color, int age,  double run, double swim, double jump) {
        super(name, color, age, run, swim, jump);// если характеристики животных одни на всех,
                                                 // здесь run, swim, jump указываем точным значением,
                                                 // а из аргументов убираем
    }

}

