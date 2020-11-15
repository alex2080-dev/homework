package Lessons;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    protected double run;
    protected double swim;
    protected double jump;

    public Animal(String name, String color, int age, double run, double swim, double jump) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public boolean runAction(double distance) {
        if (this.run >= distance) {
            System.out.println(this.name + " может " + distance + " метр(-ов, -а) пробежать"); return true;
        }
        else {
            System.out.println(this.name + " не может " + distance + " метр(-ов, -а) пробежать"); return false;
        }
    }

    public boolean swimAction(double distance) {
        if (this.swim >= distance) {
            System.out.println(this.name + " может " + distance + " метр(-ов, -а) проплыть"); return true;
        }
        else {
            System.out.println(this.name + " не может " + distance + " метр(-ов, -а) проплыть"); return false;
        }
    }

    public boolean jumpAction(double distance) {
        if (this.jump >= distance) {
            System.out.println(this.name + " может " + distance + " метр(-ов, -а) перепрыгнуть"); return true;
        }
        else {
            System.out.println(this.name + " не может " + distance + " метр(-ов, -а) перепрыгнуть"); return false;
        }
    }

}