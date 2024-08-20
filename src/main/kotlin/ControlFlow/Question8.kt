package ControlFlow

import java.util.Scanner

//Write a Kotlin program to generate the multiplication table of a given number.
fun main(){
    print("Enter The Number :- ")
    val sc=Scanner(System.`in`)
    val num=sc.nextInt()
    for (i in 1..10){
        print("${num} * ${i} = ${num*i}\n")
    }
}