package com.example.curriculumvitaev2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculumvitaev2.adapters.EducationAdapter
import com.example.curriculumvitaev2.dataClass.Education
import com.example.curriculumvitaev2.R


class EducationFragment : Fragment() {
    var educations:ArrayList<Education> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_education, container, false)

        var rv=view.findViewById<RecyclerView>(R.id.education_recyclerview)

        rv.layoutManager= LinearLayoutManager(this.context)
        educations.add(Education("oxford","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_oxford))
        educations.add(Education("stanford","canada","19/08/1999","05/01/1998",R.drawable.ic_logo_stanford))
        educations.add(Education("cambridge","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_cambridge))
        educations.add(Education("massachusset","united Kingdom","19/08/1999","05/01/1998",R.drawable.ic_logo_massachusetts))
        educations.add(Education("oxford","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_oxford))
        educations.add(Education("stanford","canada","19/08/1999","05/01/1998",R.drawable.ic_logo_stanford))
        educations.add(Education("cambridge","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_cambridge))
        educations.add(Education("massachusset","united Kingdom","19/08/1999","05/01/1998",R.drawable.ic_logo_massachusetts))
        educations.add(Education("oxford","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_oxford))
        educations.add(Education("stanford","canada","19/08/1999","05/01/1998",R.drawable.ic_logo_stanford))
        educations.add(Education("cambridge","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_cambridge))
        educations.add(Education("massachusset","united Kingdom","19/08/1999","05/01/1998",R.drawable.ic_logo_massachusetts))
        educations.add(Education("oxford","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_oxford))
        educations.add(Education("stanford","canada","19/08/1999","05/01/1998",R.drawable.ic_logo_stanford))
        educations.add(Education("cambridge","united States","19/08/1999","05/01/1998",R.drawable.ic_logo_cambridge))
        educations.add(Education("massachusset","united Kingdom","19/08/1999","05/01/1998",R.drawable.ic_logo_massachusetts))
        val adapter= EducationAdapter(educations,this.context)
        rv.adapter=adapter
        return view
    }


}