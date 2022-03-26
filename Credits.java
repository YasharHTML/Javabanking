package project;

public class Credits {
    private Person person;
    private int amount;
    private Date date;
    private String description;
    private String type;
    private String status;
    private ID id;

    public Person getPerson() {
        return this.person;
    }

    public int getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        return this.status;
    }

    public ID getID() {
        return this.id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        if (type.equals("student loan") || type.equals("car loan") || type.equals("credit card")
                || type.equals("home loan")) {
            this.type = type;
        }
    }

    public void setStatus(String status) {
        if (status.equals("PAID") || status.equals("UNPAID")) {
            this.status = status;
        }
    }

    public void setID() {
        this.id.setID(this.person.getID());
    }

    public Credits() {
    }

    public Credits(Person person, int amount, Date date, String description, String type, String status) {
        this.person = person;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.id = new ID();
        this.id.setID();
    }
}
