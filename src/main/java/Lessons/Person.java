package Lessons;

public class Person {
    private final String fio;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final byte age;


    public Person (String name, String position, String email, String phone, int salary, byte age) {
      this.fio = name;
      this.position = position;
      this.email = email;
      this.phone = phone;
      this.salary = salary;
      this.age = age;
  }

  public void printPerson() {
      System.out.println("Сотрудник " + this.fio);
      System.out.println("Должность " + this.position);
      System.out.println("E-mail " + this.email);
      System.out.println("Телефон " + this.phone);
      System.out.println("Заработная плата " + this.salary);
      System.out.println("Возраст " + this.age);
      System.out.println(" ");

  }

  public void printPersonFourty() {
           if (this.age >= 40) {
              System.out.println("Сотрудник " + this.fio);
              System.out.println("Должность " + this.position);
              System.out.println("E-mail " + this.email);
              System.out.println("Телефон " + this.phone);
              System.out.println("Заработная плата " + this.salary);
              System.out.println("Возраст " + this.age);
              System.out.println(" ");

          }
      }


    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Kirienko Alexandr", "Java developer", "alex.kirienko2080@gmail.com", "89232461427", 130000, (byte) 36);
        personArray[1] = new Person("Ivanov Alexandr", "Java developer", "ivanov@gmail.com", "89242461427", 120000, (byte) 35);
        personArray[2] = new Person("Petrov Alexandr", "Java developer", "petrov@gmail.com", "89252461427", 110000, (byte) 34);
        personArray[3] = new Person("Sidorov Alexandr", "Java developer", "sidorov@gmail.com", "89262461427", 100000, (byte) 33);
        personArray[4] = new Person("Tupin Alexandr", "Java developer", "tupin@gmail.com", "89272461427", 130000, (byte) 42);

        personArray[0].printPerson();

        for (Person person : personArray) {
            person.printPersonFourty();
        }





            }
}




