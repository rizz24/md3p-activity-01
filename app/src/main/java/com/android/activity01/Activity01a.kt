package com.android.activity01

fun main() {
    println("+---------------------------------------------------+")
    println("     Hello! Welcome to KodeGo MD3P Students List     ")
    println("")
    println("  1) Check their Progress")
    println("  2) Edit List")
    println("  3) End :<")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var menu = readln()

    if (menu == "1") {
        menu1()
    } else if (menu == "2") {
        menu2()
    } else if (menu == "3") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        main()
    }
}

fun menu1() {
    println("")
    println("+---------------------------------------------------+")
    println("                 Student's Progress")
    println("")
    println("  Name: Rizwan Caser")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for 10 days already and currently on\n" +
            "  \"Kotlin Fundamentals (Nullable Types)\" discussion. ")
    println("")
    println("  Name: Rizwan Caser")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for 10 days already and currently on\n" +
            "  \"Kotlin Fundamentals (Nullable Types)\" discussion. ")
    println("")
    println("  Name: Rizwan Caser")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for 10 days already and currently on\n" +
            "  \"Kotlin Fundamentals (Nullable Types)\" discussion. ")
    println("")
    println("  Name: Rizwan Caser")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for 10 days already and currently on\n" +
            "  \"Kotlin Fundamentals (Nullable Types)\" discussion. ")
    println("")
    println("  a) Next Page")
    println("  b) Go Back")
    println("  c) Exit")
    println("")
    println("                                      Page 1/4")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var a = readln()

    if (a == "a") {
        menu2()
    } else if (a == "b") {
        main()
    } else if (a == "c") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        menu1()
    }
}

fun menu2() {
    println("Menu1 updated.")
}