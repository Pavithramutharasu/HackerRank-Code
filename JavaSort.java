import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code

class StudentComp implements Comparator<Student>{
    public int compare(Student a1, Student a2){
        if(Double.compare(a2.getCgpa(),a1.getCgpa()) != 0){
            return Double.compare(a2.getCgpa(), a1.getCgpa());
        }
        else if (!a1.getFname().equals(a2.getFname())){
            return a1.getFname().compareTo(a2.getFname());
        }
        else {
            return Integer.compare(a1.getId(), a2.getId());
    }
}
}

public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }
        
        studentList.sort(new StudentComp());
        
      
          for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}
