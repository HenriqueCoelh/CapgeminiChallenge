fun main(args: Array<String>) {
    fun median(intArray: IntArray): Int {
        intArray.sort()
        val positionMed = (intArray.size - 1) / 2
        val median = intArray[positionMed]
        return median.toInt()
    }

    fun main(args: Array<String>) {
        val exampleArray = intArrayOf(9, 2, 1, 4, 6)

        println(median(exampleArray))
    }
}