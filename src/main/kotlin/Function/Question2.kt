package Function

//Write a Kotlin function that takes an array of integers and prints only even numbers.
fun main(){
    print("Enter The Array Size :-")
    var size= readLine()!!
    val arr = arrayOfNulls<Int>(size.toInt())
    var even= mutableListOf(checkEven(arr))
    print("Even Numbers Are :- ${even}")
}
fun checkEven(arr: Array<Int?>): MutableList<Int> {

    for(i in 0..arr.size-1){
        print("Enter The ${i}th Element :-")
        arr[i]= readLine()!!.toInt()
    }
    val even = mutableListOf<Int>()
    for(num in arr){
        if (num != null) {
            if (num%2==0){
               even.add(num)
            }
        }
    }
    return even
}