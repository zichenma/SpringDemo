package Spring_IOC;

// Bean:
// <beans>
    // <bean id="person1" class="Spring_IOC.Person">
    //     <property name="name" value="Tom"></property>
    // </bean>
// </beans>
public class Person {
    private String name;
    private String gender;


    public Person(){}
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    // getter and setter


    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

