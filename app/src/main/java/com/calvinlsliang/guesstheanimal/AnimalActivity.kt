package com.calvinlsliang.guesstheanimal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.calvinlsliang.guesstheanimal.adapter.AnimalsAdapter
import com.calvinlsliang.guesstheanimal.adapter.AnimalsLayoutManager
import kotlinx.android.synthetic.main.activity_animal.*

class AnimalActivity : AppCompatActivity() {

    lateinit var adapter: AnimalsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        setupAdapter()
    }

    private fun setupAdapter() {
        adapter = AnimalsAdapter()
        adapter.animals = listOf("https://i.imgur.com/xQCI355.jpg",
                "https://i.imgur.com/i4zsvJ1.jpg?1",
                "https://i.imgur.com/Zoif7Do.jpg",
                "https://i.imgur.com/EEgAhlI.jpg",
                "https://i.imgur.com/aHgda3v.jpg",
                "https://i.imgur.com/xGKcKPX.jpg")
        animals_recycler_view.adapter = adapter
        animals_recycler_view.layoutManager = AnimalsLayoutManager(this, 2)
    }
}
