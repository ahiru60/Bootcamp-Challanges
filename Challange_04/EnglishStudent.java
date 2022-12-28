package challange_04;
public class EnglishStudent extends Student {

   
    private int termPaper;
    private int midterm;
    private int finalExam;

    setMarks(int[] marks){

      
      this.termPaper = marks[0];
      this.midterm = marks[1];
      this.finalExam = marks[2];

    }

    double getFinalmark(){

        double finalMark = termpaper*0.3+midterm*0.3+finalExam*0.4;

        return finalMark;

    }

    
}
