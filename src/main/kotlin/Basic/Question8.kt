package Basic

import java.util.Scanner

//Write a Kotlin program to find the factorial of a given number.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter the Number :- ")
    var num=sc.nextInt()
    print("The Factorial of the Number ${num} is :- ${fact(num)}")
}
fun fact(num: Int):Int{
    if(num == 0){
        return 1;
    }
    return num * ( fact(num-1))
}