// Class representing a student with attributes such as name, PRN, department, batch, and CGPA.
public class Student {
    private String name;
    private long prn;
    private String dept;
    private String batch;
    private double cgpa;

    // Constructor to initialize student attributes
    public Student(String name, long prn, String dept, String batch, double cgpa) {
        this.name = name;
        this.prn = prn;
        this.dept = dept;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    // Getter and setter methods for student attributes
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public long getPrn() { 
        return prn; 
    }
    
    public void setPrn(long prn) { 
        this.prn = prn; 
    }

    public String getDept() { 
        return dept; 
    }
    
    public void setDept(String dept) { 
        this.dept = dept; 
    }

    public String getBatch() { 
       return batch; 
    }
    
    public void setBatch(String batch) { 
        this.batch = batch; 
    }

    public double getCgpa() { 
        return cgpa; 
    }
    
    public void setCgpa(double cgpa) { 
        this.cgpa = cgpa; 
    }

    public void display() {
        System.out.println("Name: " + name + ", PRN: " + prn + ", Department: " + dept + ", Batch: " + batch + ", CGPA: " + cgpa);
    }
}
