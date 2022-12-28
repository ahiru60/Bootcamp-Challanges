package challange_04;
public class EnglishStudent extends Student {

   
    private int termPaper;
    private int midterm;
    private int finalExam;

    setMarks(int[] marks){

      
      this.termPaper = marks[1];
      this.midterm = marks[2];
      this.finalExam = marks[3];

    }

    double getFinalmark(){

        double finalMark = termpaper*0.3+midterm*0.3+finalExam*0.4;

        BufferedWriter writer = new BufferedReader(new FileWriter("output.txt"));

        

        return finalMark;

    }

    
}
