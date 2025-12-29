package Lab2;
import java.util.Arrays;
public class Student {

    String name;
    int ID;
    double GPA;

    Student(String n, int i, double g){
        name = n;
        ID = i;
        GPA = g;
    }

    public String toString(){
        return "Name: " + name + "ID: " + ID + "GPA: " + GPA;
    }

    public static void swap(Student[] s, int i){
        Student temp = s[i];
        s[i] = s[i+1];
        s[i+1] = temp;
    }

    public static void sortById(Student[] s){
        for(int i = 0; i < s.length-1;i++){
            for(int j = 0; j < s.length-1; j++){
                if(s[j] == null || s[j+1] == null ){
                    break;
                }
                else {
                    if(s[j].ID > s[j+1].ID){
                        swap(s,j);
                    }
                }
            }
        }
    }

    public static void sortByName(Student[] s){
        for(int i = 0; i < s.length-1;i++){
            for(int j = 0; j < s.length-1; j++){
                if(s[j] == null || s[j+1] == null ){
                    break;
                }
                else {
                    if((s[j].name.compareToIgnoreCase(s[j+1].name)) > 0){
                        swap(s,j);
                    }
                }
            }
        }



    }

}
