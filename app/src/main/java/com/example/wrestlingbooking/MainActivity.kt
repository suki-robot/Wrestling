package com.example.wrestlingbooking
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val output = findViewById<TextView>(R.id.output)
        val bookButton = findViewById<Button>(R.id.book_button)
        val roster = listOf("Stone Cold", "The Rock", "Mitsuharu Misawa", "Triple H")
        var matches = mutableListOf<String>()
        output.text = "WC Wrestling Booking\nRoster: ${roster.joinToString()}"
        bookButton.setOnClickListener {
            if (matches.size < 4) {
                val w1 = roster.random()
                var w2 = roster.random()
                while (w2 == w1) w2 = roster.random()
                matches.add("$w1 vs $w2")
                output.text = "Roster: ${roster.joinToString()}\nMatches:\n${matches.joinToString("\n")}"
            } else {
                output.text = "Show complete!\nMatches:\n${matches.joinToString("\n")}"
            }
        }
    }
}
