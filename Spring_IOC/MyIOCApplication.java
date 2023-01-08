package Spring_IOC;

public class MyIOCApplication {
    public static void main(String[] args) {
        // IOC + DI
        // IOC: the control of the object
        // DI: the properties of the object

        Person person = MySpringContainer.getBean("person2");

        System.out.println(person.toString());

    }
}
