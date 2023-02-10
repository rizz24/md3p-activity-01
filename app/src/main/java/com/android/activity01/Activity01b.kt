package com.android.activity01

var a = 3
var b = 3
var c = 0
var d = 3
var e = 0
var f = 3
var g = 3
var h = 0
var i = 3
var j = 3

fun main() {
    println("+---------------------------------------------------+")
    println("       Hello! Welcome to KodeGo School Library       ")
    println("")
    println("  1) Check Books")
    println("  2) Books Status")
    println("  3) End :<")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")

    when (readln()) {
        "1" -> {
            menu()
        }
        "2" -> {
            edit()
        }
        "3" -> {
            end()
        }
        else -> {
            println("  (Wrong input. Please try again.)")
            println("")
            main()
        }
    }
}

fun main2() {
    println("")
    println("+---------------------------------------------------+")
    println("       Hello! Welcome to KodeGo School Library       ")
    println("")
    println("  1) Check Books")
    println("  2) Books Status")
    println("  3) End :<")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")

    when (readln()) {
        "1" -> {
            menu()
        }
        "2" -> {
            edit()
        }
        "3" -> {
            end()
        }
        else -> {
            println("  (Wrong input. Please try again.)")
            println("")
            main()
        }
    }
}

fun menu() {
    println("")
    println("+---------------------------------------------------+")
    println("             Select which book to borrow             ")
    println("")
    println("  1) The Nethergrim")
    println("  2) Redwall")
    println("  3) The Lord of The Rings")
    println("  4) The Chronicles of the Imaginarium Geographica")
    println("  5) Harry Potter Series")
    println("  6) And Then There Were None")
    println("  7) The Girl Who Drank the Moon")
    println("  8) The Hobbit")
    println("  9) The Da Vinci Code")
    println("  0) Merlin Saga")
    println("")
    println("  a) Go Back")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    val menu = readln()

    if (menu == "1") {

        val book = "The Nethergrim"
        val name = "Matthew Jobin"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Edmund's brother is one of the missing, and Edmund knows he must do something to save his life. \n" +
                "  But what? Though a student of magic, he struggles to cast even the simplest spell. \n" +
                "  Still, he and his friends swallow their fear and set out to battle an ancient evil \n" +
                "  whose powers none of them can imagine.")
        println("")
        println("  Copies available: $a")

        if (a == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                a -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "2") {

        val book = "Redwall"
        val name = "Brian Jacques"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  A young anthropomorphic mouse named Matthias is a novice monk at Redwall Abbey,\n" +
                "  where he was adopted as a young orphan, though he dreams of a life of adventure,\n" +
                "  inspired by the legends of Martin the Warrior, the founder of Redwall.")
        println("")
        println("  Copies available: $b")

        if (b == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                b -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "3") {

        val book = "The Lord of The Rings"
        val name = "J. R. R. Tolkien"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The Lord of the Rings is the saga of a group of sometimes reluctant heroes\n" +
                "  who set forth to save their world from consummate evil. Its many worlds and creatures\n" +
                "  were drawn from Tolkien's extensive knowledge of philology and folklore.")
        println("")
        println("  Copies available: $c")

        if (c == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                c -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "4") {

        val book = "The Chronicles of the Imaginarium Geographica"
        val name = "James A. Owen"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The unusual murder of an Oxford professor brings together three strangers in World War I London:\n" +
                "  John, a soldier and the professor's correspondence student; Jack, a young Oxford student;\n" +
                "  and Charles, an editor at the Oxford University Press.")
        println("")
        println("  Copies available: $d")

        if (d == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                d -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "5") {

        val book = "Harry Potter Series"
        val name = "J. K. Rowling"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  a lonely orphan who discovers that he is actually a wizard and enrolls in the\n" +
                "  Hogwarts School of Witchcraft and Wizardry.")
        println("")
        println("  Copies available: $e")

        if (e == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book/s is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                e -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book/s\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "6") {

        val book = "And Then There Were None"
        val name = "Agatha Christie"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The story of ten strangers, each lured to Indian Island by a mysterious host.\n" +
                "  Once his guests have arrived, the host accuses each person of murder.")
        println("")
        println("  Copies available: $f")

        if (f == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book/s is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                f -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book/s\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "7") {

        val book = "The Girl Who Drank the Moon"
        val name = "Kelly Barnhill"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The book tells how Luna, after being raised by a witch named Xan,\n" +
                "  must figure out how to handle the magical powers she was accidentally given.\n" +
                "  She must control her powers before it's too late.")
        println("")
        println("  Copies available: $g")

        if (g == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book/s is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                g -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book/s\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "8") {

        val book = "The Hobbit"
        val name = "J. R. R Tolkien"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The Hobbit is set within Tolkien's fictional universe and follows the quest of home-loving Bilbo Baggins,\n" +
                "  the titular hobbit, to win a share of the treasure guarded by a dragon named Smaug.\n" +
                "  Bilbo's journey takes him from his light-hearted, rural surroundings into more sinister territory.")
        println("")
        println("  Copies available: $h")

        if (h == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book/s is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                h -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book/s\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "9") {

        val book = "The Da Vinci Code"
        val name = "Dan Brown"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The search for the Holy Grail and the life of Jesus, suggesting that Christ,\n" +
                "  the Son of God, was also a husband and a father. Dateline's Stone Phillips\n" +
                "  travels throughout Europe to unravel what's true and what's not.")
        println("")
        println("  Copies available: $i")

        if (i == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book/s is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                i -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book/s\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "0") {

        val book = "Merlin Saga"
        val name = "T. A. Barron"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  The adventures and training of young Merlin on the mist-shrouded isle of Fincayra,\n" +
                "  an enchanted land between earth and sky that is being destroyed by blight.\n" +
                "  With this land's inhabitants to guide him, the boy will learn that Fincayra's fate\n" +
                "  and his own quest are strangely interwined.")
        println("")
        println("  Copies available: $j")

        if (j == 0) {
            val b1empty = true
            if (b1empty) {
                println("  This book/s is not available at the moment. Please try other books instead.\n" +
                        "  Reason: No copies left")
                println("")
                println("  1) Go back")
                val aa = readln()

                if (aa == "1") {
                    menu()
                }
            }
        } else {
            println("")
            println("  1) Borrow this book")
            println("  2) Go Back")
            val aa = readln()

            if (aa == "1") {
                j -= 1
                println("")
                print("  You have borrowed the book \"$book\" by $name. Kindly return this book/s\n" +
                        "  when you're done reading. Thank you!\n\n" +
                        "  Press ENTER to continue.")
                val aaa = readln()

                if (aaa == "") {
                    menu()
                }
            } else if (aa == "2") {
                menu()
            }
        }

    } else if (menu == "a") {
        main2()
    } else {
        println("")
        println("  (Wrong input. Please try again.)")
        menu()
    }
}

fun edit() {
    println("")
    println("+---------------------------------------------------+")
    println("          Select which book you wish to check        ")
    println("")
    println("  1) The Nethergrim")
    println("  2) Redwall")
    println("  3) The Lord of The Rings")
    println("  4) The Chronicles of the Imaginarium Geographica")
    println("  5) Harry Potter Series")
    println("  6) And Then There Were None")
    println("  7) The Girl Who Drank the Moon")
    println("  8) The Hobbit")
    println("  9) The Da Vinci Code")
    println("  0) Merlin Saga")
    println("")
    println("  a) Go Back")
    println("")
    println("+---------------------------------------------------+")
    print("  Please select an option: ")
    val edit = readln()

    if (edit == "1") {

        val book = "The Nethergrim"
        val name = "Matthew Jobin"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $a")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (a >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                a += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    a -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "2") {

        val book = "Redwall"
        val name = "Brian Jacques"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $b")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (b >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                b += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    b -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "3") {

        val book = "The Lord of The Rings"
        val name = "J. R. R. Tolkien"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $c")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (c >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                c += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    c -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "4") {

        val book = "The Chronicles of the Imaginarium Geographica"
        val name = "James A. Owen"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $d")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (d >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                d += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    d -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "5") {

        val book = "Harry Potter Series"
        val name = "J. K. Rowling"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $e")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (e >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                e += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    e -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "6") {

        val book = "And Then There Were None"
        val name = "Agatha Christie"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $f")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (f >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                f += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    f -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "7") {

        val book = "The Girl Who Drank the Moon"
        val name = "Kelly Barnhill"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $g")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (g >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                g += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    g -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "8") {

        val book = "The Hobbit"
        val name = "J. R. R. Tolkien"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $h")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (h >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                h += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    h -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "9") {

        val book = "The Da Vinci Code"
        val name = "Dan Brown"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $i")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (i >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                i += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    i -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "0") {

        val book = "Merlin Saga"
        val name = "T. A. Barron"

        println("")
        println("+---------------------------------------------------+")
        println("")
        println("  $book")
        println("  by $name")
        println("")
        println("  Copies available: $j")
        println("")
        println("  Note: Simply type \"1\" to register the book that has been returned\n" +
                "  and \"2\" to cancel.")
        val a1 = readln()

        if (a1 == "1") {
            if (j >= 3) {
                println("  Please note that \"Someone's Library\" only have 3 copies of this book.\n" +
                        "  Sorry but we cannot accept this.\n" +
                        "\n" +
                        "  Press ENTER to continue.")
                val aa1 = readln()
                if (aa1 == "") {
                    edit()
                }
            } else {
                j += 1
                println(
                    "  1 \"$book\" has been returned. Press ENTER to continue.\n" +
                            "  If this is a mistake, type \"UNDO\" to undo the process."
                )
                val a2 = readln()
                if (a2 == "") {
                    edit()
                } else if (a2 == "UNDO" && a2 == "undo") {
                    j -= 1
                    println("  You choose Undo. Press ENTER to continue.")
                    val a3 = readln()
                    if (a3 == "") {
                        edit()
                    }
                }
            }
        } else if (a1 == "2") {
            edit()
        } else {
            println("")
            println("  (Wrong input. Please try again.)")
            edit()
        }

    } else if (edit == "a") {
        main2()
    } else {
        println("  (Wrong input. Please try again.)")
        println("")
        edit()
    }
}

fun end() {

}