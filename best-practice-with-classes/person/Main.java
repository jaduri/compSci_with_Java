
public class Main{
    public static void main(String[] args){
        double[] marksArray = {100.00, 98.00, 99.00, 96.00};
        String[] dispArray = {"Computer Science", "Engineering Communication", "Project Management", "All round awesomeness"};

        Student joseph = new Student("Joseph", "Aduwari", 26, "male", "Nigerian", marksArray, dispArray);

        System.out.println(joseph.getGivenName());
        System.out.println(joseph.getLastName());
        System.out.println(joseph.getCitizenship());
        System.out.println(joseph.averageMarks());
        joseph.displayDisciplines();
    }
}
