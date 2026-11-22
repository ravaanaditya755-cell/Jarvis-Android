package com.jarvis.assistant

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)

        val title = TextView(this)
        title.text = "JARVIS"
        title.textSize = 32f
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "Your AI Assistant"
        status.textSize = 18f
        status.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "ACTIVATE JARVIS"

        button.setOnClickListener {
            status.text = "Jarvis Activated!"
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)

        setContentView(layout)
    }
}
