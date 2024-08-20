package Basic

import java.util.Scanner

//Write a Kotlin program to check if a given number is even or odd.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter a number")
    var num=sc.nextInt()
    var greter=5;
        if (num%2==0){
        print("Even") }
    else{
        "odd"
    }
    print("The number is : ${greter}")

}