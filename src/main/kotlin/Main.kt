fun expression7() {
    val a = 7
    val b = 120
    val c = 5
    val d = 17
    
    val result = (a + b + c - d) * 2 / 3 % 5 + c
    println("7) (a + b + c - d) * 2 / 3 % 5 + c при a = $a, b = $b, c = $c, d = $d")
    println("Результат: $result")
}

fun expression8() {
    val x = 30
    val y = 40
    val z = 50
    val d = 18
    
    val result = (x < y) && (z < x) && (y > z) || (y > d)
    println("\n8) (x < y) && (z < x) && (y > z) || (y > d) при x = $x, y = $y, z = $z, d = $d")
    println("Результат: $result")
}

fun expression10() {
    val a = 5
    val b = 3
    val c = 2
    val d = 4
    
    val result = ((a - b) * c) * d * 2 + a % d - (c * d)
    println("\n10) ((a - b) * c) * d * 2 + a % d - (c * d) при a = $a, b = $b, c = $c, d = $d")
    println("Результат: $result")
}

fun expression16() {
    val a = 9
    val b = 2
    val c = 70
    val d = 7
    
    val result = ((a * c) / b) / d + 10 * a % b - (a / d)
    println("\n16) ((a * c) / b) / d + 10a % b - (a / d) при a = $a, b = $b, c = $c, d = $d")
    println("Результат: $result")
}

fun expression17() {
    val a = 7
    val b = 120
    val c = 15
    val d = 17
    
    val result = (19 * a + 3 * b - 2 * c * d) * d / 3 % 5 + c
    println("\n17) (19a + 3b - 2c * d) * d / 3 % 5 + c при a = $a, b = $b, c = $c, d = $d")
    println("Результат: $result")
}

fun main() {
    println("Обчислення виразів:")
    println("-------------------")
    
    expression7()
    expression8()
    expression10()
    expression16()
    expression17()
}
