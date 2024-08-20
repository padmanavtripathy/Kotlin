package Function

import com.sun.jdi.IntegerType

//Write a Kotlin function `countVowels` that counts the number of vowels in a given string.
fun main(){
    print("Enter The String :- ")
    var string= readLine()!!
    var counts=stringvalue(string)
    print("Number Of Vowels , consonents and numbers in the String ${string} is ${counts[0]} , ${counts[1]} and ${counts[2]}")

}
fun stringvalue(string:String): Array<Int> {
    val vowles= arrayOf('A','E','I','O','U','a','e','i','o','u')
    var vowlecount=0
    var consonentcount=0
    var numbercount=0
    for(str in string){
        if (vowles.contains(str))
        {
            vowlecount++
        }
        else if (str. <=9){

            numbercount++
        }
        else
            consonentcount++
    }
    return arrayOf<Int>(vowlecount,consonentcount,numbercount)
}