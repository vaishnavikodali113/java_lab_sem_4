public class Student {
    private String name;
    private long prn;
    private String dept;
    private String batch;
    private double cgpa;

    public Student(String name, long prn, String dept, String batch, double cgpa) {
        this.name = name;
        this.prn = prn;
        this.dept = dept;
        this.batch = batch;
        this.cgpa = cgpa;
    }

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
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Name: " + name + ", PRN: " + prn+", Department: "+Dept+", Batch: "+Batch+", CGPA: "+CGPA);
    }
}
