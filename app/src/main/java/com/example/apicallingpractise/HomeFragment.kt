package com.example.apicallingpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_home, container, false)

        val tabLayaout=rowView.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager=rowView.findViewById<ViewPager>(R.id.viewpage)

        val adapter=   activity?.let { TabAdapter(it.supportFragmentManager) }
        adapter?.addFragment(StudentDetailsFragment(),"StudentDetails")
        adapter?.addFragment(StudentCourseFragment(),"StudentCourse")
        adapter?.addFragment(StudentPlanFragment(),"StudentPlan")

        viewPager.adapter=adapter
        tabLayaout.setupWithViewPager(viewPager)

        return rowView
    }

}