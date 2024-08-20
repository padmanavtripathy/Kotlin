package ControlFlow

import java.util.Scanner

//Write a Kotlin program to print the Pascal's triangle of a given number of rows.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter The Number of rows :- ")
    var rows=sc.nextInt()
    var array= arrayOf(1)
    for (i in 0..rows){
        for (j in 0..rows)
        {
            if (j<=i){
                print(array)
            }
        }
        print("\n")
    }
}