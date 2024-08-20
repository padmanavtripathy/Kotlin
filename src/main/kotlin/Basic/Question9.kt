package Basic

import java.util.Scanner

//Write a Kotlin program to check if a given year is a leap year.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter The Year :- ")
    var year=sc.nextInt()
    var checkvalue=if(year%4==0){
        if (year%100==0&&year%400==0){
            "Not A Leap Year"
        }
        else{
            "Leap Year"
        }
    }
    else{
        "Not A Leap Year"
    }
    print("The given year ${year} is :- ${checkvalue}")
}