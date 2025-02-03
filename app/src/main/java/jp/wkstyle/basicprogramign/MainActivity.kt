package jp.wkstyle.basicprogramign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        type()
        testType()

        testFor1()

        display()

        plus()
    }

    private fun testType() {
        val value1: Int = 1
        val value2: Float = 2F

        val sum1 = value1 + value1
        println("sum1 = $sum1")

        val sum2 = value1 + value2
        println("sum2 = $sum2")

        val value3: Float = 5.5F

        val sum3 = value1 * value2
        println("sum3 = $sum3")

        val sum4 = value1 / value1
        println("sum4 = $sum4")

        val sum5 = value3 / value1
        println("sum5 = $sum5")

        val value4: Int = 5
        val sum6 = value4 / value2
        println("sum6 = $sum6")

        val b1: Boolean = true

        if (b1) {
            println("せいかい")
        } else {
            println("まちがい")
        }

        val str1: String = "今日は"
        val str2: String = "天気がいい"
        val str = str1 + str2
        println("$str")
    }

    private fun type() {
        // 一般的な型
        val value1: Int = 1
        val value2: Float = 2F
        val value3: Boolean = true
        val value4: String = "テスト"
        val value5: List<String> = listOf("A", "B")
    }

    private fun display() {
        // テキストを表示してみよう
        println("テキスト")
    }

    private fun plus() {
        // 足し算をしてみよう
        val a = 1
        val b = 2
        val sum = a + b
        println(sum)
    }

    // ラムダとキャメル
    private fun writeType() {
        // ラムダ
        val valueLambada = 1
        // スネーク
        val value_lambada = 2
    }

    private fun testFor1() {
        // 1から10の足し算をする
        var sum = 0
        for (i in 1..10) {
            sum += i
        }
        println(sum)
    }

    private fun testSwitch() {

    }
}