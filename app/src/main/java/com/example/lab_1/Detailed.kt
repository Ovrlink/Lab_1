package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import android.widget.TextView

class Detailed() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var description: TextView = findViewById(R.id.item_description2)
        var animalName: TextView =findViewById(R.id.item_title2)
        var image: ImageView = findViewById(R.id.imageView2)


        animalName.text = intent.getStringExtra("Name")
        description.text = intent.getStringExtra("Details")

        when (animalName.text) {
            "Олень" -> image.setImageResource(R.drawable.deer)
            "Сова" -> image.setImageResource(R.drawable.owl)
            "Слон" -> image.setImageResource(R.drawable.elephant)
        }
    }
}
