public class Person {
    String name;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    Person(String name, String position, String email, int phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfoPerson(){
        System.out.println(this.name + " " + this.position + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
    }

    void printAgeMore40() {
        if(this.age > 40){
            System.out.println(this.name + " " + this.position + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
        }
    }
}
