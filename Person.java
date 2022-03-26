package project;

public class Person {
    private String name;
    private String age;
    private String password;
    private Bank bank;
    private ID id;

    public Person(String name, String age, Bank bank) {
        this.name = name;
        this.age = age;
        this.id = new ID();
        this.id.setID();
        this.bank = bank;
        this.password = bank.generatePassword(this);
    }

    public Person() {
        this.name = "";
    }

    private String getBankName() {
        return this.bank.getName();
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public String getID() {
        return this.id.getID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setID() {
        this.id.setID();
    }

    public String getPassword() {
        return this.password;
    }
    
    

}
