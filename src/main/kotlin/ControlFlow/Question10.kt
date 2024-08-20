package ControlFlow

import java.util.Scanner

//Write a Kotlin program to find the GCD (Greatest Common Divisor) of two numbers.

fun main(){
    val sc=Scanner(System.`in`)
    print("Enter The First Number :-")
    val num1=sc.nextInt()
    print("Entter The Second Number :-")
    val num2=sc.nextInt()
    var greter=if (num1>num2)
    {
        num2
    }
    else
        num1
    var gcd=1
    for (i in 2..greter){
        if(greter%i==0)
            gcd=i
    }
    print("GCD Of Two Number ${num1} and ${num2} is :- ${gcd}")
}