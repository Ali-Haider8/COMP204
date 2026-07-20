package L2.Examples.Inheritance;

public class Student extends College {
    public String firstname;
    public String secondname;

    String getInfo() {
        return (firstname + " " + secondname + "\nStudying in: " + cname);
    }
}
