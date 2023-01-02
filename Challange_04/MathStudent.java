package challange_04;
import java.io.*;
public class MathStudent extends Student {
    
    private int quiz01;
    private int quiz02;
    private int quiz03;
    private int quiz04;
    private int quiz05;
    private int test01;
    private int test02;
    private int finalExam;
    
    
    public void setMarks(String[] marks){

    this.quiz01 = Integer.parseInt(marks[1]);
    this.quiz02 = Integer.parseInt(marks[2]);
    this.quiz03 = Integer.parseInt(marks[3]);
    this.quiz04 = Integer.parseInt(marks[4]);
    this.quiz05 = Integer.parseInt(marks[5]);
    this.test01 =Integer.parseInt( marks[6]);
    this.test02 = Integer.parseInt(marks[7]);
    this.finalExam =Integer.parseInt( marks[8]);

    }
    

    public double getAvarageMark(){

        double quizAvgMarks = this.quiz01+this.quiz02+this.quiz03+this.quiz04+this.quiz05*0.15;

        double avarageMark = quizAvgMarks+this.test01*0.3+this.test02*0.2+this.finalExam*0.35;

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
