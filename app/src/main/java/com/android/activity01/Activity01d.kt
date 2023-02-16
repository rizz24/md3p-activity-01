package com.android.activity01

var a: Double = 0.0
var b: Double = 0.0
var c: Double = 0.0
var d: Double = 0.0
var e: Double = 0.0
var f: Double = 0.0
var added: Double = 0.0
var total: Double = 0.0

fun main() {
    println("+---------------------------------------------------+")
    print("  Type your first input: $")
    a = readln().toDouble()

    println()
    println("  First Input: $$a")
    println()
    print("  Type your second input: $")
    b = readln().toDouble()

    println()
    println("  First Input: $$a")
    println("  Second Input: $$b")
    println()
    print("  Type your third input: $")
    c = readln().toDouble()

    println()
    println("  First Input: $$a")
    println("  Second Input: $$b")
    println("  Third Input: $$c")
    println()
    print("  Type your fourth input: $")
    d = readln().toDouble()

    println()
    println("  First Input: $$a")
    println("  Second Input: $$b")
    println("  Third Input: $$c")
    println("  Fourth Input: $$d")
    println()
    print("  Type your fifth input: $")
    e = readln().toDouble()

    println()
    println("  First Input: $$a")
    println("  Second Input: $$b")
    println("  Third Input: $$c")
    println("  Fourth Input: $$d")
    println("  Fifth Input: $$e")
    println()
    print("  Divide all value by how many? ")
    f = readln().toDouble()

    added = a + b + c + d + e
    total = added / f

    println()
    println("+---------------------------------------------------+")
    println("  $$a + $$b + $$c + $$d + $$e")
    println("  $$added ÷ $f")
    println("  Total: $$total")
    println("+---------------------------------------------------+")

    maina()
}

fun maina() {

    print("  Try again? (y/n) ")

    a = 0.0
    b = 0.0
    c = 0.0
    d = 0.0
    e = 0.0
    f = 0.0
    total = 0.0

    val aa = readln()

    if (aa == "y") {
        println()
        main()
    } else if (aa == "Y") {
        println()
        main()
    } else if (aa == "n") {

    } else if (aa == "N") {

    } else {
        println()
        print("  Wrong input!")
        maina()
    }

}