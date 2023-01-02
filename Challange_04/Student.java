package challange_04;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Student{

    private String firstName;
    private String lastName;
    private double avarageMark;

    void setStudent(String[] name){

        this.firstName =name[0];
        this.lastName =name[1];
        

    }

    String getStudent(){

        return this.firstName+" "+this.lastName;
        

    }


}
