public class Student {
    private String name, address;
    private int numCourse;
    private String courses[];
    private int[] grades;
    private final int MAX_COURSE = 30;
    public Student(String name, String address){
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSE];
        grades = new int[MAX_COURSE];
        numCourse = 0;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return name + "(" + address + ")";
    }

    public void addCourse(String course, int grade){
        courses[numCourse] = course;
        grades[numCourse] = grade;
        numCourse++;
    }

    public void printGrades(){
        System.out.println(name);
        for (int i = 0; i < numCourse; i++) {
            System.out.println(" " + courses[i] + ":" + grades[i]);
        }
    }

    public double getAverage(){
        int sum = 0;
        for (int i = 0; i < numCourse; i++) {
            sum += grades[i];
        }
        return (double)sum / numCourse;
    }
}