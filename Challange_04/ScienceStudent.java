package challange_04;
import java.io.*;
public class ScienceStudent extends Student {

    private int attendance;
    private int project;
    private int midterm;
    private int finalExam;

    public void setMarks(String[] marks){

      this.attendance = Integer.parseInt(marks[1]);
      this.project = Integer.parseInt(marks[2]);
      this.midterm = Integer.parseInt(marks[3]);
      this.finalExam = Integer.parseInt(marks[4]);

    }

    public double getAvarageMark(){

        double avarageMark = attendance*0.1+project*0.3+midterm*0.3+finalExam*0.3;

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
