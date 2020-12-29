package signature

fun main() {
    print("Enter name and surname: ")
    val input = readLine()!!
    print("Enter person's status: ")
    val status = readLine()!!

    val a = arrayOf("a", 4, "____", "|__|", "|  |")
    val b = arrayOf("b", 4, "___ ", "|__]", "|__]")
    val c = arrayOf("c", 4, "____", "|   ", "|___")
    val d = arrayOf("d", 4, "___ ", """|  \""", "|__/")
    val e = arrayOf("e", 4, "____", "|___", "|___")
    val f = arrayOf("f", 4, "____", "|___", "|   ")
    val g = arrayOf("g", 4, "____", "| __", "|__]")
    val h = arrayOf("h", 4, "_  _", "|__|", "|  |")
    val ii = arrayOf("i", 1, "_", "|", "|")
    val j = arrayOf("j", 2, " _", " |", "_|")
    val k = arrayOf("k", 4, "_  _", "|_/ ", """| \_""")
    val l = arrayOf("l", 4, "_   ", "|   ", "|___")
    val m = arrayOf("m", 4, "_  _", """|\/|""", "|  |")
    val n = arrayOf("n", 4, "_  _", """|\ |""", """| \|""")
    val o = arrayOf("o", 4, "____", "|  |", "|__|")
    val p = arrayOf("p", 4, "___ ", "|__]", "|   ")
    val q = arrayOf("q", 4, "____", "|  |", """|_\|""")
    val r = arrayOf("r", 4, "____", "|__/", """|  \""")
    val s = arrayOf("s", 4, "____", "[__ ", "___]")
    val t = arrayOf("t",3, "___", " | ", " | ")
    val u = arrayOf("u",4, "_  _", "|  |", "|__|")
    val v = arrayOf("v", 4, "_  _", "|  |", """ \/ """)
    val w = arrayOf("w",5, "_ _ _", "| | |", "|_|_|")
    val x = arrayOf("x", 4, "_  _", """ \/ """, """_/\_""")
    val y = arrayOf("y", 5, "_   _", """ \_/ """, "  |  ")
    val z = arrayOf("z", 4, "___ ", "  / ", " /__")
    val space = arrayOf(" ", 4, "    ", "    ", "    ")

    val name: Array<String> = input.split("").toTypedArray()

    for (j in 1..3) {
        for (i in name.indices) {
            print("${name[i][j]}")
        }
    }
    println()


    for (i in 1..3) {
        print("${a[i]} ${b[i]} ${c[i]} ${d[i]} ${e[i]} ${f[i]} ${g[i]} ${h[i]} ${ii[i]} ${j[i]} ${k[i]} ${l[i]} ${m[i]} ${n[i]} ${o[i]} ${p[i]} ${q[i]} ${r[i]} ${s[i]} ${t[i]} ${u[i]} ${v[i]} ${w[i]} ${x[i]} ${y[i]} ${z[i]}\n")
    }

/*
    repeat(name.length + 4) {
        print("*")
    }
    println("\n* $name *")
    repeat(name.length + 4) {
        print("*")
    }

 */
}


