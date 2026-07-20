package L2.Examples.Inheritance;

public class Registeration {

    public static void main(String[] args) {
        Student st = new Student();
        st.firstname = "Ali";
        st.secondname = "Kadhim";
        st.cname = "CS & Maths";

        System.out.print(st.getInfo());
    }

}
