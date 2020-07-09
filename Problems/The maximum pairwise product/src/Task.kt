import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val n = scanner.nextInt()
    var a = 0
    var b = 0

    if (n == 1) {
        print(scanner.nextInt())
    } else {
        repeat(n) {
            val num = scanner.nextInt()

            if ((b < a && num > b) && b != a) {
                b = num
            } else if (num > a) {
                a = num
            }
        }
        print(a * b)
    }
}
