package challange_04;
public class MathStudent extends Student {
    
    private int quiz01;
    private int quiz02;
    private int quiz03;
    private int quiz04;
    private int quiz05;
    private int test01;
    private int test02;
    private int finalExam;
    
    
    public void setMarks(int[] marks){

    this.quiz01 = marks[0];
    this.quiz02 = marks[1];
    this.quiz03 = marks[2];
    this.quiz04 = marks[3];
    this.quiz05 = marks[4];
    this.test01 = marks[5];
    this.test02 = marks[6];
    this.finalExam = marks[7];

    }
    

    public double getFinalmark(){

        double quizAvgMarks = this.quiz01+this.quiz02+this.quiz03+this.quiz04+this.quiz05*0.15;

        double finalMark = quizAvgMarks+this.test01*0.3+this.test02*0.2+this.finalExam*0.35;

        return finalMark;
    }

    public static void main(String[] args) {
        MathStudent ms =new MathStudent();
    }

}
