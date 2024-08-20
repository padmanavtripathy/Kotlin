package Basic

import java.util.Scanner

//Write a Kotlin program to convert temperature from Celsius to Fahrenheit and vice versa.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter The Tempereture in celsius:- ")
    var celsius=sc.nextFloat()
    print("The Tempereture in Fahrenheit is :- ${celsius*9/5+32} F \n")
    print("The Tempereture in Celsius is :- ${((celsius*9/5+32)-32)*5/9} c")

}
