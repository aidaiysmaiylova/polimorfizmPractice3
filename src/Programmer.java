public class Programmer {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\'' +
                "Surname: " + surname + '\'' +
                "Age: " + age;
    }

    public Programmer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public static void met(){
        System.out.println("Coding");
    }
    public static void met(String word){
        System.out.println("Coding "+word);
    }
}
