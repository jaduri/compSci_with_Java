
public class Student{

  //attributes
  protected String name;
  protected int physics;
  protected int chemistry;
  protected int math;
  protected float average;

  //constructors
  public Student(){
    this.name = "name";
    this.physics = 0;
    this.chemistry = 0;
    this.math = 0;
    this.average = 0.0f;
  }

  public Student(String name, int physics, int chemistry, int math){
    this.name = name;
    this.physics = physics;
    this.chemistry = chemistry;
    this.math = math;
    this.average = average();
  }

  //accessors and mutators
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getPhysics(){
    return this.physics;
  }
  public void setPhysics(int physics){
    this.physics = physics;
  }
  public int getChemistry(){
    return this.chemistry;
  }
  public void setChemistry(int chemistry){
    this.chemistry = chemistry;
  }
  public int getMath(){
    return this.math;
  }
  public void setMath(int math){
    this.math = math;
  }

  //methods
  private float average(){
    return Math.round(((float)(this.physics + this.math + this.chemistry)/3)*100)/100.0f;
  }

  public Student[] sortStudents(Student[] students){
    return sort(students, 0, students.length-1);
  }

//Same as quick sort array but with dot notation to compare attributes
//Also type changed from int to Student
  private Student[] sort(Student[] array, int min, int max){

    if(min >= max){
      return array;
    }else{
      int pivot = partition(array, min, max);
      sort(array, min, pivot-1);
      sort(array, pivot+1, max);
    }
    return array;
  }

  private int partition(Student[] array, int min, int max){
    int tracker = min-1;
    //compare other values when prior values are equal
    for(int i = min; i < max; i++){
      boolean swap = false;
      if(array[i].average > array[max].average){
        swap = true;
      }else if(array[i].average == array[max].average){
        if(array[i].physics > array[max].physics){
          swap = true;
        }else if(array[i].physics == array[max].physics){
          if(array[i].chemistry > array[max].chemistry){
            swap = true;
          }else if(array[i].chemistry == array[max].chemistry){
            if(array[i].math > array[max].math){
              swap = true;
            }else if(array[i].math == array[max].math){
              if(array[i].name.charAt(0) < array[max].name.charAt(0)){
                swap = true;
              }
            }
          }
        }
      }
      if(swap == true){
        tracker++;
        Student temp = array[i];
        array[i] = array[tracker];
        array[tracker] = temp;
      }
    }

    Student temp = array[tracker+1];
    array[tracker+1] = array[max];
    array[max] = temp;

    return tracker+1;
  }

}
