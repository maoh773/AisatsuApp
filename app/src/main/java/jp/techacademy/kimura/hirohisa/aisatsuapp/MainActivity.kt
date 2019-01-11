package jp.techacademy.kimura.hirohisa.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { showTimePickerDialog() }


    }

    fun showTimePickerDialog() {
        var timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view, hour ,minute ->

                var str = when (hour) {
                    in 2..9 -> "おはよう"
                    in 10..17 -> "こんにちは"
                    else -> "こんばんわ"
                }
                textView.text = str

            },
            0,
            0,
            true
            )
        timePickerDialog.show()
    }


}
