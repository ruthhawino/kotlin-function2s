fun main(args: Array<String>) {
    val num = intArrayOf(5, 34, 78, 2, 45, 1, 99, 23)
    printTwoMaxNumbers(num)

}
fun printTwoMaxNumbers(nums: IntArray) {
    var maxOne = 0
    var maxTwo = 0
    for (n in nums) {
        if (maxOne < n) {
            maxTwo = maxOne
            maxOne = n
        } else if (maxTwo < n) {
            maxTwo = n
        }
    }
    println("First Max Number: $maxOne")
    println("Second Max Number: $maxTwo")

}











