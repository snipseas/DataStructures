package lab1;

import java.util.ArrayList;

class Student{
    String firstname, lastname;
    int id;

    public Student(String f, String l, int id){
        firstname = f;
        lastname = l;
        this.id = id;
    }

    @Override
    public String toString(){
        return firstname + " " + lastname + " ID:" + id;
    }

    public boolean equals(Object o){
        return this.id == ((Student)o).id;
    }

}

public class UnsortedArray12 {
    int itemcount;
    ArrayList<Student> array;

    public UnsortedArray12(int maxsize){
        itemcount = 0;
        array = new ArrayList<Student>(maxsize);
    }

    public void insert(Student x){
        array.add(x);
        itemcount++;
    }

    public int linearSearch(Student x){

        for(int i = 0; i < array.size(); i++){
            if(array.get(i).equals(x)){
                return i;
            }
        }
        return -1;
    }

    public void delete(Student x){
        int pos = this.linearSearch(x);
        if(pos == -1){
            System.out.println("Element not found");
        }
        else{
            array.remove(pos);
            itemcount--;
        }
    }

    public void displayArray(){
        System.out.println("Array: ");
        System.out.println();
        array.forEach((n) -> System.out.println(n));
    }




}
