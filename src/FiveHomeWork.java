public class FiveHomeWork {
    public static void main(String[]args){
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Smirnov Victor", "designer", "smvictor@mailbox.com", 892312377, 32000, 29);
        persArray[2] = new Person("Andreev Andrey", "accountant", "anandrey@mailbox.com", 892312567, 28000, 32);
        persArray[3] = new Person("Bogdanov Bogdan", "master", "bobogdan@mailbox.com", 892312890, 30000, 44);
        persArray[4] = new Person("Petrov Petr", "employee", "pepetr@mailbox.com", 892312000, 35000, 48);

        System.out.println("Список сотрудников:");
        for(int i = 0; i < persArray.length; i++){
            System.out.print("Сотрудник " + (i + 1) + ": ");
            persArray[i].printInfoPerson();
        }
        System.out.println();

        System.out.println("Сотрудники старше 40:");
        for(int i = 0; i < persArray.length; i++){
            persArray[i].printAgeMore40();
        }
    }
}
