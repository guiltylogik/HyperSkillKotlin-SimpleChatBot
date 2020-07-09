import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (x1, y1, x2, y2) = scanner.nextLine().split(" ")
    
    print(if (x1 == x2 || y1 == y2) {
        "YES"
    } else if (x1 == x2 || y1 == y2) {
        "YES"
    } else if (Math.abs(x1.toInt() - x2.toInt()) == Math.abs(y1.toInt() - y2.toInt())) {
        "YES"
    } else { "NO" })    
}
