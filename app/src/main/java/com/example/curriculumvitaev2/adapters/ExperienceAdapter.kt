package com.example.curriculumvitaev2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculumvitaev2.dataClass.Experience
import com.example.curriculumvitaev2.R

class ExperienceAdapter(val experiences:ArrayList<Experience>, val context: Context? ) : RecyclerView.Adapter<ExperienceAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var companyName: TextView = itemView.findViewById(R.id.company_name)
        var companyAddress: TextView = itemView.findViewById(R.id.company_adress)
        var relativeLayout: RelativeLayout = itemView.findViewById(R.id.relativeLayout)
        var startDate: TextView = itemView.findViewById(R.id.start_date)
        var endDate: TextView = itemView.findViewById(R.id.end_date)
        var description: TextView = itemView.findViewById(R.id.campany_description)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view:View= LayoutInflater.from(parent.context).inflate(R.layout.experience_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.companyName.text=experiences[position].name
        holder.companyAddress.text=experiences[position].address
        holder.startDate.text=experiences[position].startDate
        holder.endDate.text=experiences[position].endDate
        holder.description.text= experiences[position].description
        holder.relativeLayout.setBackgroundResource(experiences[position].img)
    }

    override fun getItemCount(): Int {
        return experiences.size
    }
}
