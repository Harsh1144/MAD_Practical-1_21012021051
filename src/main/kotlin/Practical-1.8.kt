    fun main() {
        var arr1 = arrayOf(10, 20, 3, 35, 23)
        println("using arrayof() method" + arr1.contentToString())
        var arr2 = Array<Int>(5) { 0 }
        println("using Array<> method" + arr2.contentToString())
        var arr3 = Array<Int>(7) { i: Int -> i }
        println("using lambda function" + arr3.contentToString())
        var arr4 = IntArray(5) { 5 }
        val a1=arr4.joinToString(" ")
        println("using IntArray() method:" +a1)
        var arr5 = intArrayOf(1, 2, 3, 4, 5,)
        val a2=arr5.joinToString(" ")
        println("using intArrayOf() method:"+a2)

        var arr6 = arrayOf(intArrayOf(1, 2), intArrayOf(4, 5), intArrayOf(7, 8))

        for (row in arr6) {
            print(row.contentToString())
        }

    }