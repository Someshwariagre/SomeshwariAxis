package exception;

public class Employee {

    int id;
    String name;
    int DOJ;
    int age;

    public Employee(int id, String name, int DOJ, int age) {
        this.id = id;
        this.name = name;
        this.DOJ = DOJ;
        this.age = age;
    }

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

    public int getDOJ() {
        return DOJ;
    }

    public void setDOJ(int DOJ) {
        this.DOJ = DOJ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOJ=" + DOJ +
                ", age=" + age +
                '}';
    }

    void work(){
      System.out.println("Employee is working in good company");
  }
}
