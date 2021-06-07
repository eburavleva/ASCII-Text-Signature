package signature

fun main() {
    print("Enter name and surname: ")
    var (name, surname) = readLine()!!.split(" ")
    name = name.toLowerCase()
    surname = surname.toLowerCase()
    print("Enter person's status: ")
    val status = readLine()!!

    val letters = arrayOf(
            arrayOf("____", "___ ", "____",   "___ ",   "____", "____", "____", "_  _", "_", " _",   "_  _"  , "_   ",   "_  _"  ,   "_  _"  , "____", "___ ",   "____"  ,   "____"  , "____", "___", "_  _",   "_  _"  , "_ _ _",   "_  _"  ,   "_   _"  , "___ " ),
            arrayOf("|__|", "|__]", "|   ", """|  \""", "|___", "|___", "| __", "|__|", "|", " |",   "|_/ "  , "|   ", """|\/|""", """|\ |""", "|  |", "|__]",   "|  |"  ,   "|__/"  , "[__ ", " | ", "|  |",   "|  |"  , "| | |", """ \/ """, """ \_/ """, "  / " ),
            arrayOf("|  |", "|__]", "|___",   "|__/",   "|___", "|   ", "|__]", "|  |", "|", "_|", """| \_""", "|___",   "|  |"  , """| \|""", "|__|", "|   ", """|_\|""", """|  \""", "___]", " | ", "|__|", """ \/ """, "|_|_|", """_/\_""",   "  |  "  , " /__")
    )

    val l = countLength(name, surname, status)
    //println("длина имени $l")
    var tab1 = 0
    var tab2 = 0
    var dif = 0
    var statusDif = 0
    var statusTab1 = 0
    var statusTab2 = 0
    if (l < status.length) {
        dif = status.length - l
        tab1 = dif / 2
        tab2 = dif - tab1
    } else {
        statusDif = l - status.length
        statusTab1 = statusDif / 2
        statusTab2 = statusDif - statusTab1
    }
    //println("tab1=$tab1, tab2=$tab2")
    //println("StatusTab1=$statusTab1, tab2=$statusTab2")


    repeat(l + dif + 6) {
        print("*")
    }
    println()
    print("*")
    repeat(tab1 + 2) {print(" ")}
    for (l in 0..name.length - 1) {
        print("${letters[0][name[l].toInt() - 97]} ")
    }
    print("     ")
    for (l in 0..surname.length - 1) {
        print("${letters[0][surname[l].toInt() - 97]} ")
    }
    repeat(tab2 + 1) {print(" ")}
    print("*\n*")
    repeat(tab1 + 2) {print(" ")}
    for (l in 0..name.length - 1) {
        print("${letters[1][name[l].toInt() - 97]} ")
    }
    print("     ")
    for (l in 0..surname.length - 1) {
        print("${letters[1][surname[l].toInt() - 97]} ")
    }
    repeat(tab2 + 1) {print(" ")}
    print("*\n*")
    repeat(tab1 + 2) {print(" ")}
    for (l in 0..name.length - 1) {
        print("${letters[2][name[l].toInt() - 97]} ")
    }
    print("     ")
    for (l in 0..surname.length - 1) {
        print("${letters[2][surname[l].toInt() - 97]} ")
    }
    repeat(tab2 + 1) {print(" ")}
    print("*\n*")

    repeat(statusTab1 + 2) {print(" ")}
    print(status)
    repeat(statusTab2 + 2) {print(" ")}
    println("*")

    repeat(l + 6 + dif) { print("*") }


}

fun countLength(name: String, surname: String, status: String): Int {
    val lettersLength = mapOf(
            'i' to 1,
            'j' to 2,
            't' to 3,
            'w' to 5,
            'y' to 5
    )
    //пройтись по каждой букве имени и фамилии, если она есть в коллекции, то взять ее длину, если нет, то 4
    var fullNameLength: Int = 0
    for (i in 0..name.length - 1) {
        if (lettersLength.containsKey(name[i])) {
                    fullNameLength = fullNameLength + lettersLength.get(name[i])!! + 1
                } else {
        fullNameLength += 5
        }
        //print("$i - ${name[i]} - $fullNameLength | ")
    }
    for (i in 0..surname.length - 1) {
        if (lettersLength.containsKey(surname[i])) {
            fullNameLength = fullNameLength + lettersLength.get(surname[i])!! + 1
        } else {
            fullNameLength += 5
        }
        //print("$i - ${surname[i]} - $fullNameLength | ")
    }
    fullNameLength += 4 // промежуток между именем и фамилией 6

    return fullNameLength
}
