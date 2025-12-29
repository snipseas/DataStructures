package Lab4;
//4-1
public class Student4 {
String firstName;
String lastName;
double gpa;
int age;

Student4(String f, String l, double g, int a){
    firstName = f;
    lastName = l;
    gpa = g;
    age = a;
    }
}

 class AverageGPA{

    public static double averageGPA(StackObj student){
        double sum = 0.0;
        int count = 0;
        while(!student.isEmpty()){
            Student4 tmp = (Student4) student.pop();
            sum +=tmp.gpa;
            count++;
        }
        return(sum/count);
    }

    

}

