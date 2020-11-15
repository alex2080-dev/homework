package Lessons;

public class LessonSix {


    public static void main(String[] args) {
        Cat cat1 = new Cat("барсик", "рыжий", 4, 150, 0, 2);
        Dog dog1 = new Dog("барбос", "черный", 5, 400, 10, 1);
        Dog dog2 = new Dog("барбарис", "серый", 6, 600, 20, 0.5);
        cat1.runAction(143.5);
        dog2.runAction(401);
        dog1.swimAction(11);
    }

}