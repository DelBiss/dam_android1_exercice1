package ca.philrousse.happybirtday

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun findDays(view : View){
        val outputView = findViewById<TextView>(R.id.day_output)
        outputView.text = getString(R.string.btn_msg)
    }

}