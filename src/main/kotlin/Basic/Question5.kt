package Basic

fun main(args:Array<String>){
    while (true) {
        print("Enter The first Number :- ")
        var num1 = readln()
        print("Enter The Second Number:- ")
        var num2 = readln()

        print("Enter The Operetor")
        var operator = readln()
        when (operator) {
            "+" -> println("Adition is : ${num1.toInt() + num2.toInt()}")
            "-" -> println("Substraction is :- ${num1.toInt() - num2.toInt()}")
            "*" -> println("Multiplication is :- ${num1.toInt() * num2.toInt()}")
            "/" -> println("Division is :- ${num1.toInt() / num2.toInt()}")
        }
    }
}