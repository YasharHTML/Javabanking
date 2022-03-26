package project;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank {
    Random random = new Random();
    private String name;
    private String address;
    private String phone;
    private ID id;
    private Person[] users;
    private Credits[] credits;

    public String getAddress() {
        return this.address;
    }

    public String generatePassword(Person person) {
        int length = 16;
        this.addUser(person);
        String alphabet = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getID() {
        return this.id.getID();
    }

    public Person[] getUsers() {
        return this.users;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setID() {
        this.id.setID();
    }

    public void setUsers(Person[] users) {
        this.users = users;
    }

    public Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.id = new ID();
        this.id.setID();
        this.users = new Person[0];
        this.credits = new Credits[0];
    }

    public void addUser(Person user) {
        Person[] newUsers = new Person[this.users.length + 1];
        for (int i = 0; i < this.users.length; i++) {
            newUsers[i] = this.users[i];
        }
        newUsers[this.users.length] = user;
        this.users = newUsers;
    }

    public void removeUser(Person user) {
        Person[] newUsers = new Person[this.users.length - 1];
        int j = 0;
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i] != user) {
                newUsers[j] = this.users[i];
                j++;
            }
        }
        this.users = newUsers;
    }

    public void printUsers() {
        Logger logger = Logger.getLogger(Main.class.getName());
        for (int i = 0; i < this.users.length; i++) {
            logger.log(Level.INFO, this.users[i].getName());
        }
    }

    public Bank() {
    }

    // public void appendToCredit(Credits cred) {
    //     Credits[] newCredits = new Credits[this.credits.length + 1];
    //     for (int i = 0; i < this.credits.length; i++) {
    //         newCredits[i] = this.credits[i];
    //     }
    //     newCredits[this.credits.length] = cred;
    //     this.credits = newCredits;
    // }

    public Credits[] returnCredits(String id2) {
        Credits[] newCredits = new Credits[this.credits.length];
        Logger logger = Logger.getLogger(Main.class.getName());
        int j = 0;
        for (int i = 1; i < this.credits.length; i++) {
            if (this.credits[i].getID().equals(id2)) {
                newCredits[j] = this.credits[i];
                j++;
            }
        }
        logger.log(Level.INFO, "Hello {0}",this.credits);
        return newCredits;
    }

    public void getALoan(Person person, int money, String description, Date date, String type) {
        // new Credits(this, money, date, description, type, "UNPAID");
        Credits c = new Credits();
        c.setPerson(person);
        c.setAmount(money);
        c.setDate(date);
        c.setDescription(description);
        c.setType(type);
        c.setStatus("UNPAID");
        Credits[] newCredits = new Credits[this.credits.length + 1];
        for (int i = 0; i < this.credits.length; i++) {
            newCredits[i] = this.credits[i];
        }
        newCredits[this.credits.length] = c;
        this.credits = newCredits;
    }
}