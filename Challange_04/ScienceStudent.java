package challange_04;
public class ScienceStudent extends Student {

    private int attendance;
    private int project;
    private int midterm;
    private int finalExam;

    setMarks(int[] marks){

      this.attendance = marks[0];
      this.project = marks[1];
      this.midterm = marks[2];
      this.finalExam = marks[3];

    }

    double getFinalmark(){

        double finalMark = attendance*0.1+project*0.3+midterm*0.3+finalExam*0.3;

        return finalMark;

    }

    
}
