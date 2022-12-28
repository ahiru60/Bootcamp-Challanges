import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StudentProfileCreator {
    
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            //System.out.println(reader.readLine());
            int numberOfStudents= Integer.parseInt(reader.readLine());

            for(int i=0;i<numberOfStudents;i++){
                
               String nameRead = reader.readLine();
               
            String[] name = Arrays.stream(nameRead.split(",")).toArray(size -> new String[size]);
            //System.out.println(Arrays.toString(name));
               String marksRead =  reader.readLine();
            String[] marks = Arrays.stream(marksRead.split(" ")).toArray(size -> new String[size]);
               //System.out.println(marks[0].toUpperCase());
               EnglishStudent[] studentsEng = new EnglishStudent[];
               ScienceStudent[] studentsSci = new ScienceStudent[];
               MathStudent[] studentsMath = new MathStudent[];
            switch (marks[0].toUpperCase()) {
                case "ENGLISH":
                studentsEng[i] = new EnglishStudent();
                studentsEng[i].setStudent(name[0],name[1]);
                studentsEng[i].setMarks(marks[1],marks[2],marks[3]);
                    break;
                case "SCIENCE":
                studentsSci[i] = new EnglishStudent();
                studentsSci[i].setStudent(name[0],name[1]);
                studentsSci[i].setMarks(marks[1],marks[2],marks[3],marks[4]);
                
                    break;
                case "MATHS":
                studentsMath[i] = new EnglishStudent();
                studentsMath[i].setStudent(name[0],name[1]);
                studentsMath[i].setMarks(marks[1],marks[2],marks[3],marks[4],marks[5],marks[6],marks[7],marks[8]);
                    
                    break;
            
                default:
                    break;
            }
               
            }
            
        reader.close();
        } catch (IOException e) {
            // TODO: handle exception
        }
        
        

    }
    
}
