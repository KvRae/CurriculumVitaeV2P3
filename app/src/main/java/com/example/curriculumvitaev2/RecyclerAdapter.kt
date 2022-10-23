package com.example.curriculumvitaev2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter <RecyclerAdapter.ViewHolder>(){

    private var title = arrayOf("Chapter One,Chapter two")
    private var details = arrayOf("Item one details,Item two Details")
    private var images = intArrayOf(R.drawable.ic_logo_cambridge,R.drawable.ic_logo_oxford,R.drawable.ic_logo_stanford,R.drawable.ic_logo_massachusetts)

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : RecyclerAdapter.ViewHolder
    {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.mycareer,parent , false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder : RecyclerAdapter.ViewHolder , position : Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

     inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
         var itemImage : ImageView
         var itemTitle : TextView
         var itemDetail : TextView

         init {
             itemImage = itemView.findViewById(R.id.itemimage)
             itemTitle = itemView.findViewById(R.id.itemtitle)
             itemDetail = itemView.findViewById(R.id.itemdetail)
         }
     }
}