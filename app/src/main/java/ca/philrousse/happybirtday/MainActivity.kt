package ca.philrousse.happybirtday

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSimple: Button = findViewById(R.id.button)
        buttonSimple.setOnClickListener{
            buttonSimple.height = 200
        }


    }


}