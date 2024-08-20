package ControlFlow
//Write a Kotlin program to check if a given number is positive, negative, or zero.
import java.util.Scanner

fun main(){
    var sc=Scanner(System.`in`)
    print("Enter the number :- ")
    var num=sc.nextInt()
    var type=if(num>0){
        "Positive"
    }else if (num == 0){
        "Zero"
    }
    else
    {
        "Negative"
    }
    print("The given number ${num} is a ${type} number")
}