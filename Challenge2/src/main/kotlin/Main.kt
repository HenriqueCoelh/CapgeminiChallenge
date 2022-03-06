fun main(args: Array<String>) {
    fun differentsPairs (numberArray: IntArray, x: Int): Int{
        var count = 0
        var countPairs = 0

        while (count < numberArray.size){
            val numAtual = numberArray[count]
            count++
            var count2 = 0

            while (count2 < numberArray.size){
                if((numAtual - numberArray[count2]) == x){
                    countPairs ++
                }
                count2++
            }
        }
        return countPairs.toInt()
    }

    fun main(args: Array<String>) {
        val exampleArray = intArrayOf(1, 5, 3, 4, 2, 6, 8)
        val x = 2

        println(differentsPairs(exampleArray, x))
    }
}