package ControlFlow

import java.util.Scanner

//Write a Kotlin program to check if a given number is divisible by 7.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter the number :- ")
    var num=sc.nextInt()
    if(num%7==0)
    {
        print("Divisible")
    }
    else{
        print("Not Divisible")
    }
}