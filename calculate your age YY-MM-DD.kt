/*

This file was created on 10/06/2018 through Ahmed Elshimy-pc and all rights reserved to him
https://www.facebook.com/ahmed.Abaqrino

*/

import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat



fun main(args: Array<String>) {

    // ur year
    var dd:Int
    println("Enter Birt of day : ")
    dd=readLine()!!.toInt()

    var mm:Int
    println("Enter Birt of month : ")
    mm=readLine()!!.toInt()

    var yyyy:Int
    println("Enter Birt of year : ")
    yyyy=readLine()!!.toInt()

    // now
    var ddnow:Int?=SimpleDateFormat("dd").format(Calendar.getInstance().time).toInt()!!
    var mmnow:Int?=SimpleDateFormat("MM").format(Calendar.getInstance().time).toInt()!!
    var yyyynow:Int?=SimpleDateFormat("yyyy").format(Calendar.getInstance().time).toInt()!!

    //calc ur day and month and year
    var one:Int= ddnow!! - dd!!
    if(one<0){
        one = one + 30;
        mmnow = mmnow!! - 1
    }

    var two:Int = mmnow!! - mm
    if(two<0){
        two = two + 12;
        yyyynow = yyyynow!! - 1
    }

    val three:Int = yyyynow!!-yyyy!!

    println("u now is $one day && $two Month && $three Yers ")
}
