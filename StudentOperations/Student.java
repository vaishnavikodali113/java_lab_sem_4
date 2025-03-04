public class Student {
    private String name;
    private long prn;
    private String Dept;
    private String Batch;
    private double CGPA;

    public Student(String name, int prn, String Dept, String Batch, double CGPA) {
        this.name = name;
        this.prn = prn;
	    this.Dept = Dept;
	    this.Batch = Batch;
	    this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPRN() {
        return prn;
    }

    public void setPRN(int prn) {
        this.prn = prn;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
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
