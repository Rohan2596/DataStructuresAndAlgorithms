package com.practice.datastructure.Arrays;



class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}
public class ArrayExample2 {

    public static void main(String[] args) {
        Student studentArray[]=new Student[3];
        studentArray[0]=new Student(1,"John");
        studentArray[1]=new Student(2,"Ferd");
        studentArray[2]=new Student(3,"Nick");

        for (int i=0;i<studentArray.length;i++){
            System.out.println("Elements at index:- " + i +"  name :-"  + studentArray[i].name +"   rollNo:-"+ studentArray[i].roll_no);
        }

    }
}
