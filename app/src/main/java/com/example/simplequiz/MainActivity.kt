package com.example.simplequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    // 配列を各メソッドで参照
    private val quizData = arrayOf("A0","A1","A2","A3")
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount : TextView = findViewById(R.id.tvCount)
        val tvQuestion : TextView = findViewById(R.id.tvQuestion)
        val btn0 : Button = findViewById(R.id.btn0)
        val btn1 : Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)
        val btn3 : Button = findViewById(R.id.btn3)

        // シャッフル
        val list = listOf(0,1,2,3)
        val num = list.shuffled()

        // ボタンにquizDataを表示
        btn0.text = quizData[num[0]]
        btn1.text = quizData[num[1]]
        btn2.text = quizData[num[2]]
        btn3.text = quizData[num[3]]

        // btn0を押した時の正誤判定
        btn0.setOnClickListener {
            if (btn0.text == quizData[i]){
                // 正解
                correctAns()
                // カウントを１増やす
                i++
                btn0.isEnabled = false // 無効化
                tvCount.text = i.toString() + "問正解"
                if (i == 4) {
                    tvQuestion.text = "全問正解！Game Clear"
                }
            } else {
                // 不正解でボタンの無効化
                incorrectAns()
            }
        }

        // btn1を押した時の正誤判定
        btn1.setOnClickListener {
            if (btn1.text == quizData[i]){
                // 正解
                correctAns()
                // カウントを１増やす
                i++
                btn1.isEnabled = false // 無効化
                tvCount.text = i.toString() + "問正解"
                if (i == 4) {
                    tvQuestion.text = "全問正解！Game Clear"
                }
            } else {
                // 不正解でボタンの無効化
                incorrectAns()
            }
        }

        // btn0を押した時の正誤判定
        btn2.setOnClickListener {
            if (btn2.text == quizData[i]){
                // 正解
                correctAns()
                // カウントを１増やす
                i++
                btn2.isEnabled = false // 無効化
                tvCount.text = i.toString() + "問正解"
                if (i == 4) {
                    tvQuestion.text = "全問正解！Game Clear"
                }
            } else {
                // 不正解でボタンの無効化
                incorrectAns()
            }
        }

        // btn0を押した時の正誤判定
        btn3.setOnClickListener {
            if (btn3.text == quizData[i]){
                // 正解
                correctAns()
                // カウントを１増やす
                i++
                btn3.isEnabled = false // 無効化
                tvCount.text = i.toString() + "問正解"
                if (i == 4) {
                    tvQuestion.text = "全問正解！Game Clear"
                }
            } else {
                // 不正解でボタンの無効化
                incorrectAns()
            }
        }
    }

    // 正解の関数
    private fun correctAns() {
        AlertDialog.Builder(this)
            .setTitle("正解")
            .setMessage(quizData[i])
            .setPositiveButton("OK",null)
            .show()
    }
    // 不正解処理の関数
    private fun incorrectAns() {
        val tvQuestion : TextView = findViewById(R.id.tvQuestion)
        val btn0 : Button = findViewById(R.id.btn0)
        val btn1 : Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)
        val btn3 : Button = findViewById(R.id.btn3)
        // 不正解でボタンの無効化
        tvQuestion.text = "不正解 Game Over"
        // ボタン無効化
        btn0.isEnabled = false
        btn1.isEnabled = false
        btn2.isEnabled = false
        btn3.isEnabled = false
    }
}