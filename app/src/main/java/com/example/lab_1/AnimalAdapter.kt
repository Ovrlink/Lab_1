package com.example.lab_1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private var animalList:ArrayList<animals>, var context: Context)
    : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {
    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView = itemView.findViewById(R.id.card_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_description)
        var itemButton: Button = itemView.findViewById(R.id.item_btn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
       return animalList.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        var animal = animalList[position]
        holder.itemImage.setImageResource(animal.image)
        holder.itemTitle.text = animal.name
        holder.itemDetail.text = animal.description
        holder.itemButton.setOnClickListener {
            var Name : String = animalList.get(position).name
            var Details : String = animalList.get(position).description

            var intent = Intent (context, Detailed::class.java)

            intent.putExtra("Name",Name)
            intent.putExtra("Details", Details)

            context.startActivity(intent)

        }
    }
}
