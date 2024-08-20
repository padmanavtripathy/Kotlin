package ControlFlow

import java.util.Scanner

//Write a Kotlin program to print the Fibonacci series up to a given number.
fun main(){
    val sc=Scanner(System.`in`)
    print("Enter the number :- ")
    var limit=sc.nextInt()
    var fibonanciArray= mutableListOf(1)
    var num1=0
    var num2=fibonanciArray[0]
    for(i in 2..limit){
        fibonanciArray.add(num1+num2)
        if (i>=2){
            num1=fibonanciArray[i-2]
            num2=fibonanciArray[i-1]
        }
    }
    print("The Fibonacci series of the numbers is :- ${fibonanciArray}")

}