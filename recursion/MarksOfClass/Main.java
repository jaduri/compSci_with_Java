
import java.io.File;
import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    //populate array of students
    Student[] arr = readData("students.txt");

    Student aClass = new Student();

    aClass.sortStudents(arr);
    printStudents(arr);
  }

  private static Student[] readData(String filename){
    Student[] students = new Student[20];//create array to store students
    try{//read the file
      File file = new File(".\\"+filename);
      Scanner textFile = new Scanner(file);
      int index = 0;

      while (textFile.hasNext()){//for each character group store in a related student attribute
        String name = textFile.next();
        int physics = textFile.nextInt();
        int math = textFile.nextInt();
        int chemistry = textFile.nextInt();
        students[index] = new Student(name, physics, math, chemistry);
        index++;
      }
    }catch(Exception e){//catch any errors
      System.out.println(e);
    }
    return students;
  }

  //method to print to screen
  public static void printStudents(Student[] students){
    System.out.println("  Student    AverageScore   Physic   Chemistry   Maths");
    for(int i=0; i<students.length; i++){
      System.out.printf("%8s %15.2f %8d %8d %8d\n",students[i].name,students[i].average,students[i].physics,students[i].chemistry,students[i].math);
    }
  }

}
