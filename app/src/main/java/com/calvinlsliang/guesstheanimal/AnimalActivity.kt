package com.calvinlsliang.guesstheanimal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_animal.*

class AnimalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        Picasso.get()
                .load("https://i.imgur.com/O4yTEKg.jpg")
                .into(animal_picture)

    }
}
