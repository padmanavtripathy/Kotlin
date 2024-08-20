package Basic//Write a Kotlin program to display the current date and time.
import java.text.SimpleDateFormat
import java.util.Date

fun main(args: Array<String>) {
   val date=Date()
    val dateformter= SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formateddate=dateformter.format(date)
    print("Todays Date is : ${formateddate}")
}