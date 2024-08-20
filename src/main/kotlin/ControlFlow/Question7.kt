package ControlFlow

import java.util.Scanner

//Write a Kotlin program to calculate the sum of all numbers between two given numbers.

fun main(){
    val sc=Scanner(System.`in`)
    print("Enter The First Number :- ")
    val num1=sc.nextInt()
    print("Enter The Second Number :- ")
    val num2=sc.nextInt()
    var total=0;
    for (i in num1..num2)
    {
        total+=i
    }
    print("Total is :- ${total}")
}