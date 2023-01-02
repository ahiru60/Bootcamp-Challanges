package challange_04;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StudentProfileCreator {

    
    
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            int numberOfStudents= Integer.parseInt(reader.readLine());

            String outputEng="";
            String outputMath="";
            String outputSci="";

            for(int i=0;i<numberOfStudents;i++){
                
               String nameRead = reader.readLine();
               
            String[] name = Arrays.stream(nameRead.split(",")).toArray(size -> new String[size]);
               String marksRead =  reader.readLine();

            String[] marks = Arrays.stream(marksRead.split(" ")).toArray(size -> new String[size]);
                   
            switch (marks[0].toUpperCase()) {
                case "ENGLISH":
                EnglishStudent studentsEng = new EnglishStudent();
                studentsEng.setStudent(name);
                studentsEng.setMarks(marks);
                System.out.println("sci exed");
                outputEng += studentsEng.getStudent()+" English "+studentsEng.getAvarageMark()+" "+studentsEng.getFinalTestMark()+"/n";
                //writer.write(studentsEng.getStudent()+" English "+studentsEng.getAvarageMark()+" "+studentsEng.getFinalTestMark()+"/n");
                    break;
                case "SCIENCE":
                ScienceStudent studentsSci = new ScienceStudent();
                studentsSci.setStudent(name);
                studentsSci.setMarks(marks);
                
                //writer.write(studentsSci.getStudent()+" Science "+studentsSci.getAvarageMark()+" "+studentsSci.getFinalTestMark()+"/n");
                outputSci += studentsSci.getStudent()+" Science "+studentsSci.getAvarageMark()+" "+studentsSci.getFinalTestMark()+"/n";
                    break;
                case "MATHS":
                MathStudent studentsMath = new MathStudent();
                studentsMath.setStudent(name);
                studentsMath.setMarks(marks);
                //writer.write(studentsMath.getStudent()+" Maths "+studentsMath.getAvarageMark()+" "+studentsMath.getFinalTestMark()+"/n"); 
                outputMath += studentsMath.getStudent()+" Maths "+studentsMath.getAvarageMark()+" "+studentsMath.getFinalTestMark()+"/n"; 
                    break;
            
                default:
                    break;
            }
            writer.write(outputEng);
            writer.write(outputSci);
            writer.write(outputMath);
               writer.close();
            }
            
        reader.close();
        } catch (IOException e) {
            // TODO: handle exception
        }
        
        

    }
}

