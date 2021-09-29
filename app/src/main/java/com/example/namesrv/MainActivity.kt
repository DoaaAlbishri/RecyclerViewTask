package com.example.namesrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val names = arrayListOf<String>("Doaa","Ali")
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        val myRv = findViewById<RecyclerView>(R.id.recyclerView)
        myRv.adapter = RecyclerViewAdapter(names)
        myRv.layoutManager = LinearLayoutManager(this)

        button.setOnClickListener {
                names.add(editText.text.toString())
                editText.text.clear()
                myRv.adapter?.notifyDataSetChanged()

        }
    }
}