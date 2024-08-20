package Basic

import java.util.Scanner

//Write a Kotlin program to calculate the area and perimeter of a circle.
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter Redious Of The Circle :- ")
    var redious=sc.nextFloat()
    print("Area of the circle :- ${3.141*redious*redious} \n")
    print("Perimiter of the circle :- ${2*3.141*redious}")
}