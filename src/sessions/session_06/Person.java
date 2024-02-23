package sessions.session_06;

import sessions.Session;

public class Person extends Session {
    private String name;
    private int age;
    private String NID;

    public Person() {
        getData("Name: ");
        name = this.input;

        getData("Age: ");
        age = Integer.parseInt(this.input);

        getData("NID: ");
        NID = this.input;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getNID() { return NID; }
    public void setNID(String NID) { this.NID = NID; }

    public String toString() {
        return "{" +
                "name: \"" + name + '"' +
                ", age: " + age +
                ", NID: \"" + NID + '"' +
                '}';
    }

    public boolean isLegalAge() { return age > 18; }
}
