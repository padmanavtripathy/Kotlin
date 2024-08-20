package ControlFlow

import java.util.Scanner

//Write a Kotlin program to check if a given character is a vowel or a consonant.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter the charecter :- ")
    var charecter= sc.nextLine()
    var vowles= arrayOf('A','E','I','O','U','a','e','i','o','u')
    var type=if(vowles.contains(charecter[0])){
        "vowel"
    }
    else
        "consonant"
    print("The Given Charecter Is a ${type}")
}