public class Student {
    private String name;
    private String prn;
    private int age;

    public Student(String name, String prn, int age) {
        this.name = name;
        this.prn = prn;
        this.age = age;
    }

    // Getters & Setters
    public String getName() { 
        return name; 
    }
    public String getPrn() { 
        return prn; 
    }
    public int getAge() { 
        return age; 
    }

    public void setName(String name) { this.name = name; }
    public void setPrn(String prn) { this.prn = prn; }
    public void setAge(int age) { this.age = age; }


    
