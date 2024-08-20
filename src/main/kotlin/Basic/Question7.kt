package Basic

import java.util.Scanner

//Write a Kotlin program to find the maximum and minimum of three numbers.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter The First Number :- ")
    var num1=sc.nextInt()
    print("Enter The Second Number :- ")
    var num2=sc.nextInt()
    print("Enter The Third Number :- ")
    var num3=sc.nextInt()
    var greater=if (num1>num2&&num1>num3){
        print("${num1}")
    }
    else if (num2>num1&&num2>num3){
        print("${num2}")
    }
    else
    {
        print("${num3}")
    }
    print("The Greatest Number is :- ${greater}")
}