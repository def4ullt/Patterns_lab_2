package CreationalPatterns.Prototype;

public class ConcretePrototype implements Prototype {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ConcretePrototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void display() {
        System.out.println("Id: " + id + ", Name: " + name);
    }
}
