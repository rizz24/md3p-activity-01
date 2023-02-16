package com.android.activity01

var a = 0
var b = 0
var c = 0
var d = 0
var e = 0
var f = 0
var added: Double = 0.0
var total: Double = 0.0

fun main() {
    println("+---------------------------------------------------+")
    println("  Hello! Please note that we 'only' accept numbers.\n" +
                "  And not any other characters :>")
    println()
    firstA()
}

fun firstA() {
    print("  Type your first amount: $")

    try {
        a = readln().toInt()
    } catch (exception: NumberFormatException) {
        println("  Input error. Make sure to put 'numbers' only.")
        firstA()
    }
    secondA()
}

fun secondA() {
    println()
    print("  Type your second amount: $")

    try {
        b = readln().toInt()
    } catch (exception: NumberFormatException) {
        println("  Input error. Make sure to put 'numbers' only.")
        secondA()
    }
    thirdA()
}

fun thirdA() {
    println()
    print("  Type your third amount: $")

    try {
        c = readln().toInt()
    } catch (exception: NumberFormatException) {
        println("  Input error. Make sure to put 'numbers' only.")
        thirdA()
    }
    fourthA()
}

fun fourthA() {
    println()
    print("  Type your fourth amount: $")

    try {
        d = readln().toInt()
    } catch (exception: NumberFormatException) {
        println("  Input error. Make sure to put 'numbers' only.")
        fourthA()
    }
    fifthA()
}

fun fifthA() {
    println()
    print("  Type your fifth amount: $")

    try {
        e = readln().toInt()
    } catch (exception: NumberFormatException) {
        println("  Input error. Make sure to put 'numbers' only.")
        fifthA()
    }
    check()
}

fun check() {
    println()
    println("+---------------------------------------------------+")
    println()
    println("  First Amount: $$a")
    println("  Second Amount: $$b")
    println("  Third Amount: $$c")
    println("  Fourth Amount: $$d")
    println("  Fifth Amount: $$e")
    println()
    println("  Are these inputs correct? If yes, press 'ENTER' to continue.\n" +
            "  If not, type 'reset' to start again.")
    val res = readln()

    if (res == "") {
        divide()
    } else if (res == "reset") {
        println()
        firstA()
    } else {
        println("  Wrong input! Try again.")
        check()
    }
}

fun divide() {
    print("  Divide all value by how many? ")

    try {
        f = readln().toInt()
    } catch (exception:NumberFormatException) {
        println("  Input error. Make sure to put 'numbers' only.")
        divide()
    }

    added = (a + b + c + d + e).toDouble()
    total = added / f

    println()
    println("+---------------------------------------------------+")
    println("  $$a + $$b + $$c + $$d + $$e")
    println("  $$added ÷ $f")
    println("  Total: $$total")
    println("+---------------------------------------------------+")

    a = 0
    b = 0
    c = 0
    d = 0
    e = 0
    f = 0
    added = 0.0
    total = 0.0

    mainA()
}

fun mainA() {

    print("  Try again? (y/n) ")

    val aa = readln()

    if (aa == "y") {
        println()
        main()
    } else if (aa == "Y") {
        println()
        main()
    } else if (aa == "n") {
        end()
    } else if (aa == "N") {
        end()
    } else {
        println()
        print("  Wrong input!")
        mainA()
    }

}

fun end() {

}