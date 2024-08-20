package ControlFlow

import java.util.Scanner

//Write a Kotlin program to count the number of even and odd elements in an array.
fun main(){
    val array= Array(15,{i->i*1})
    for(values in array){
        if (values%2==0){
            print("${values} is even\n")
        }
        else
        {
            print("${values} is odd\n")
        }
    }
}