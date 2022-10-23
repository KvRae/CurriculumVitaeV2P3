package com.example.curriculumvitaev2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculumvitaev2.dataClass.Education
import com.example.curriculumvitaev2.R

class EducationAdapter(val educations:ArrayList<Education>, val context: Context? ) : RecyclerView.Adapter<EducationAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var educationName: TextView = itemView.findViewById(R.id.education_name)
        var educationAddress: TextView = itemView.findViewById(R.id.education_adress)
        var img: ImageView = itemView.findViewById(R.id.education_img)
        var startDate: TextView = itemView.findViewById(R.id.start_date)
        var endDate: TextView = itemView.findViewById(R.id.end_date)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view:View= LayoutInflater.from(parent.context).inflate(R.layout.education_item,parent,false)
        return EducationAdapter.MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.educationName.text=educations[position].name
        holder.educationAddress.text=educations[position].address
        holder.startDate.text=educations[position].startDate
        holder.endDate.text=educations[position].endDate
        holder.img.setImageResource(educations[position].img)
    }

    override fun getItemCount(): Int {

        return educations.size
    }
}