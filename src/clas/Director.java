package clas;

public class Director {
    private String name;
    private String lastName;


    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Director() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director { " +
                "name: " + name + '\'' +
                ", lastName: " + lastName + '\'' +
                "" ;
    }
}
