package com.vishal.listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val adapter = Adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rec = findViewById<RecyclerView>(R.id.rec)
        rec.layoutManager =   LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rec.adapter = adapter
        val a = arrayListOf<Dao>(Dao("vishal"),Dao("harish"),Dao("aakash"))
        adapter.submitList(a)

    }
}