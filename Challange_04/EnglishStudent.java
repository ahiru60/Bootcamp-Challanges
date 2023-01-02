package challange_04;
import java.io.*;
public class EnglishStudent extends Student {

   
    private int termPaper;
    private int midterm;
    private int finalExam;

    public void setMarks(String[] marks){

      
      this.termPaper = Integer.parseInt(marks[1]);
      this.midterm = Integer.parseInt(marks[2]);
      this.finalExam = Integer.parseInt(marks[3]);

    }

    public double getAvarageMark(){

        double avarageMark = termPaper*0.3+midterm*0.3+finalExam*0.4;

        

        try {
          BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
          writer.write("");
        } catch (Exception e) {
          // TODO: handle exception
        }
        

        return avarageMark;

    }

    public double getFinalTestMark(){

      return finalExam;

    }

    
}
