package com.android.activity01

var a = "Rizwan Caser"
var a1 = 14
var a2 = "Kotlin Fundamentals (Nullable Types)"

var b = "Andrew Bustos"
var b1 = 14
var b2 = "Kotlin Fundamentals (Nullable Types)"

var c = "Alexander Chou"
var c1 = 14
var c2 = "Kotlin Fundamentals (Nullable Types)"

var d = "Andrei Condino"
var d1 = 14
var d2 = "Kotlin Fundamentals (Nullable Types)"

var e = "Marie Fe Dela Peña"
var e1 = 14
var e2 = "Kotlin Fundamentals (Nullable Types)"

var f = "Emannuel De Los Reyes"
var f1 = 14
var f2 = "Kotlin Fundamentals (Nullable Types)"

var g = "Gretchen Roque"
var g1 = 14
var g2 = "Kotlin Fundamentals (Nullable Types)"

var h = "Hanz Bradford Jaramillo"
var h1 = 14
var h2 = "Kotlin Fundamentals (Nullable Types)"

var i = "Jeffrey Saltiga"
var i1 = 14
var i2 = "Kotlin Fundamentals (Nullable Types)"

var j = "John Chris Macaraig Bolanio"
var j1 = 14
var j2 = "Kotlin Fundamentals (Nullable Types)"

var k = "Junzon Velasco"
var k1 = 14
var k2 = "Kotlin Fundamentals (Nullable Types)"

var l = "Laurence de Dios"
var l1 = 14
var l2 = "Kotlin Fundamentals (Nullable Types)"

var m = "Noven rey Gunmad"
var m1 = 14
var m2 = "Kotlin Fundamentals (Nullable Types)"

var n = "Rey Saliot"
var n1 = 14
var n2 = "Kotlin Fundamentals (Nullable Types)"

var o = "Ryan Malacao"
var o1 = 14
var o2 = "Kotlin Fundamentals (Nullable Types)"

var p = "Dad Ivan Navidad"
var p1 = 14
var p2 = "Kotlin Fundamentals (Nullable Types)"

fun main() {
    println("+---------------------------------------------------+")
    println("     Hello! Welcome to KodeGo MD3P Students List     ")
    println("")
    println("  1) Check Progress")
    println("  2) Edit List")
    println("  3) End :<")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var menu = readln()

    if (menu == "1") {
        menu1()
    } else if (menu == "2") {
        edit()
    } else if (menu == "3") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        main()
    }
}

fun mainmenu2() {
    println("")
    println("+---------------------------------------------------+")
    println("     Hello! Welcome to KodeGo MD3P Students List     ")
    println("")
    println("  1) Check Progress")
    println("  2) Edit List")
    println("  3) End :<")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var menu = readln()

    if (menu == "1") {
        menu1()
    } else if (menu == "2") {
        edit()
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
    println("  Name: $a")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $a1 day/s already and currently on\n" +
            "  \"$a2\" discussion. ")
    println("")
    println("  Name: $b")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $b1 day/s already and currently on\n" +
            "  \"$b2\" discussion. ")
    println("")
    println("  Name: $c")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $c1 day/s already and currently on\n" +
            "  \"$c2\" discussion. ")
    println("")
    println("  Name: $d")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $d1 day/s already and currently on\n" +
            "  \"$d2\" discussion. ")
    println("")
    println("  a) Next Page")
    println("  b) Back to Menu")
    println("  c) End :<")
    println("")
    println("                                      Page 1/4")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var a = readln()

    if (a == "a") {
        menu2()
    } else if (a == "b") {
        mainmenu2()
    } else if (a == "c") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        menu1()
    }
}

fun menu2() {
    println("")
    println("+---------------------------------------------------+")
    println("                 Student's Progress")
    println("")
    println("  Name: $e")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $e1 day/s already and currently on\n" +
            "  \"$e2\" discussion. ")
    println("")
    println("  Name: $f")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $f1 day/s already and currently on\n" +
            "  \"$f2\" discussion. ")
    println("")
    println("  Name: $g")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $g1 day/s already and currently on\n" +
            "  \"$g2\" discussion. ")
    println("")
    println("  Name: $h")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $h1 day/s already and currently on\n" +
            "  \"$h2\" discussion. ")
    println("")
    println("  a) Next Page")
    println("  b) Previous Page")
    println("  c) Back to Menu")
    println("  d) End :<")
    println("")
    println("                                      Page 2/4")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var a = readln()

    if (a == "a") {
        menu3()
    } else if (a == "b") {
        menu1()
    } else if (a == "c") {
        mainmenu2()
    } else if (a == "d") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        menu2()
    }
}

fun menu3() {
    println("")
    println("+---------------------------------------------------+")
    println("                 Student's Progress")
    println("")
    println("  Name: $i")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $i1 day/s already and currently on\n" +
            "  \"$i2\" discussion. ")
    println("")
    println("  Name: $j")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $j1 day/s already and currently on\n" +
            "  \"$j2\" discussion. ")
    println("")
    println("  Name: $k")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $k1 day/s already and currently on\n" +
            "  \"$k2\" discussion. ")
    println("")
    println("  Name: $l")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $l1 day/s already and currently on\n" +
            "  \"$l2\" discussion. ")
    println("")
    println("  a) Next Page")
    println("  b) Previous Page")
    println("  c) Back to Menu")
    println("  d) End :<")
    println("")
    println("                                      Page 3/4")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var a = readln()

    if (a == "a") {
        menu4()
    } else if (a == "b") {
        menu2()
    } else if (a == "c") {
        mainmenu2()
    } else if (a == "d") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        menu3()
    }
}

fun menu4() {
    println("")
    println("+---------------------------------------------------+")
    println("                 Student's Progress")
    println("")
    println("  Name: $m")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $m1 day/s already and currently on\n" +
            "  \"$m2\" discussion. ")
    println("")
    println("  Name: $n")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $n1 day/s already and currently on\n" +
            "  \"$n2\" discussion. ")
    println("")
    println("  Name: $o")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $o1 day/s already and currently on\n" +
            "  \"$o2\" discussion. ")
    println("")
    println("  Name: $p")
    println("  Current Progress: Based of days activity,\n" +
            "  this student has been active for $p1 day/s already and currently on\n" +
            "  \"$p2\" discussion. ")
    println("")
    println("  a) Previous Page")
    println("  b) Back to Menu")
    println("  c) End :<")
    println("")
    println("                                      Page 4/4")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var a = readln()

    if (a == "a") {
        menu3()
    } else if (a == "b") {
        mainmenu2()
    } else if (a == "c") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        menu4()
    }
}

fun edit() {
    println("")
    println("+---------------------------------------------------+")
    println("   Select which of the students you want to change")
    println("")
    println("  1) $a")
    println("  2) $b")
    println("  3) $c")
    println("  4) $d")
    println("  5) $e")
    println("  6) $f")
    println("  7) $g")
    println("  8) $h")
    println("")
    println("  a) Next Page")
    println("  b) Back to Menu")
    println("  c) End :<")
    println("")
    println("                                      Page 1/2")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var menu = readln()

    if (menu == "1") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            a = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            a1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            a2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "2") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            b = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            b1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            b2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "3") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            c = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            c1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            c2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "4") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            d = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            d1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            d2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "5") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            e = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            e1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            e2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "6") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            f = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            f1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            f2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "7") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            g = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            g1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            g2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "8") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var aa1 = readln()

        if (aa1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            h = name

            if (name == "n" && name == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            h1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit()
            }

            edit()

        } else if (aa1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            h2 = mod

            if (mod == "n" && mod == "N") {
                edit()
            }

            edit()

        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit()
        }

    } else if (menu == "a") {
        edit2()
    } else if (menu == "b") {
        mainmenu2()
    } else if (menu == "c") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        edit()
    }
}

fun edit2() {

    println("")
    println("+---------------------------------------------------+")
    println("   Select which of the students you want to change")
    println("")
    println("  1) $i")
    println("  2) $j")
    println("  3) $k")
    println("  4) $l")
    println("  5) $m")
    println("  6) $n")
    println("  7) $o")
    println("  8) $p")
    println("")
    println("  a) Previous Page")
    println("  b) Back to Menu")
    println("  c) End :<")
    println("")
    println("                                      Page 2/2")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    var menu = readln()

    if (menu == "1") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            i = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            i1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            i2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }
git
    } else if (menu == "2") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            j = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            j1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            j2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "3") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            k = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println(
                "  Please type the number of days. (NUMBER only)\n" +
                        "Type \"n/N\" to cancel."
            )
            var num = readln()

            var num2 = num
            k1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            k2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "4") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            l = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            l1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            l2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "5") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            m = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            m1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            m2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "6") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            n = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            n1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            n2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "7") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            o = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            o1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            o2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "8") {

        println("")
        println("  Select which to edit:")
        println("")
        println("  1) Name")
        println("  2) Number of days active")
        println("  3) Module Progress")
        println("")
        println("  4) Go Back")
        println("")
        print("  Please select an option: ")
        var a1 = readln()

        if (a1 == "1") {
            println("")
            println("  Please type the name you want to change. You can also type \"n/N\" to cancel.")
            var name = readln()

            p = name

            if (name == "n" && name == "N") {
                edit2()
            }

        } else if (a1 == "2") {
            println("")
            println("  Please type the number of days. (NUMBER only)\n" +
                    "Type \"n/N\" to cancel.")
            var num = readln()

            var num2 = num
            p1 = num.toInt()

            if (num2 == "n" && num2 == "N") {
                edit2()
            }
        } else if (a1 == "3") {
            println("")
            println("  Please type the module name. You can also type \"n/N\" to cancel.")
            var mod = readln()

            p2 = mod

            if (mod == "n" && mod == "N") {
                edit2()
            }
        } else {
            println("  (Wrong input. Please try again.)")
            println("")
            edit2()
        }

    } else if (menu == "a") {
        edit()
    } else if (menu == "b") {
        mainmenu2()
    } else if (menu == "c") {

    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        main()
    }
}