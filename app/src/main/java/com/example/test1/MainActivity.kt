package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var btn: Button
    lateinit var p1: ImageView
    lateinit var p2: ImageView
    lateinit var p3: ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.editText)
        p1=findViewById(R.id.p1)
        p2=findViewById(R.id.p2)
        p3=findViewById(R.id.p3)
        btn=findViewById(R.id.btn)


        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            when {
                editText.text.toString() == "1" -> intent.putExtra("PICTURE", R.drawable.p1)
                editText.text.toString() == "2" -> intent.putExtra("PICTURE", R.drawable.p2)
                editText.text.toString() == "3" -> intent.putExtra("PICTURE", R.drawable.p3)
                else -> {
                    Toast.makeText(this, "непрапвильно", Toast.LENGTH_SHORT).show()
                }
            }
            startActivity(intent)
        }



    }
}