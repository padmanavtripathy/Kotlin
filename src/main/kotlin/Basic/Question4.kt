package Basic

import java.util.Properties
import java.util.Scanner

//Write a Kotlin program to take user input and display it.
fun main(args:Array<String>){
//    if(args.isNotEmpty()){
//        val name=args[0]
//        print("My name is : ${name}")
//    }
//    val name= readLine()//read string with null sefty
//    print(name)
//    var age= readln()//read string without null sefty

    var sc=Scanner(System.`in`)
    print("Enter your Age :- ")
    var age=sc.nextInt()
    print("Enter Your name :- ")
    var name=sc.next()
    print("Enter Your Address :- ")
    var address=sc.next()
    print("Enter your longitude:- ")
    var longitude=sc.nextFloat()

    print(age)
    print(name)
    print(address)
    print(longitude)
    print(age)
}