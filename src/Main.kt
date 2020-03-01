import java.util.*
import kotlin.collections.*
import kotlin.ranges.*
import kotlin.test.assertEquals

// Complete the icecreamParlor function below.
fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    val map = HashMap<Int, Int>()
    for (i in 0 until arr.size) {
        if (map.containsKey(arr[i])) return arrayOf(map[arr[i]]!!, i + 1)
        val diff = m - arr[i]
        map[diff] = i + 1
    }
    return arrayOf()
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val m = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)

        println(result.joinToString(" "))
    }
}

fun customAssert(){
    assertEquals("1 4", icecreamParlor (4, arrayOf(1, 4, 5, 3, 2)).joinToString(" "))
    assertEquals("1 2", icecreamParlor (4, arrayOf(2, 2, 4, 3)).joinToString(" "))
}
