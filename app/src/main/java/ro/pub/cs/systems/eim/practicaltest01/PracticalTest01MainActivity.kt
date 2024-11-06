package ro.pub.cs.systems.eim.practicaltest01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01MainActivity : AppCompatActivity() {
    private var count1 = 0
    private var count2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_main)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        // Asociem un OnClickListener pentru butonul 1
        button1.setOnClickListener {
            count1++  // Incrementăm contorul pentru butonul 1
            textView1.text = count1.toString()  // Actualizăm valoarea din TextView 1
        }

        // Asociem un OnClickListener pentru butonul 2
        button2.setOnClickListener {
            count2++  // Incrementăm contorul pentru butonul 2
            textView2.text = count2.toString()  // Actualizăm valoarea din TextView 2
            }

    }
}