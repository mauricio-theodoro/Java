class Student{
    String name;
    int grade;
    public Student setName(String name){
        this.name =  name;
        return this;
    }
    public Student setGrade(int grade){
        this.grade = grade;
        return this;
    }

}

public class Main {
    public static void main(String[] args) {
        String a = "Layla";
        System.out.println(a.toLowerCase().charAt(0));
        int b = a.concat(" is a dog").chars().toArray()[0];
        System.out.println(b);
        Student student = new Student();
        //student.setGrade(99);
        //student.setName("Layla");
        student.setGrade(99).setName("Layla");
        System.out.println(student.name +" "+ student.grade);

    }
}