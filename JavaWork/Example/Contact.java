package JavaWork.Example;

public class Contact {
    private Integer id;
    private String name;
    private String number;

    public Contact(Integer id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getContactRows() {
        return String.format("%s\n%s\n%s\n\n", this.id, this.name, this.number);
    }

    public String getContactRow() {
        return String.format("%s %s %s\n\n", this.id, this.name, this.number);
    }
}
