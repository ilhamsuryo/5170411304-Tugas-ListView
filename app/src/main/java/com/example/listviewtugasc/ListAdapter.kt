package com.example.listviewtugasc

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*

class ListAdapter(private val context: Activity, private val title: Array<String>, private val description: Array<String>,
                  private val imageId: Array<Int>) : ArrayAdapter<String>(context, R.layout.list_icon, title ) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_icon, null, true)

        val titleText = rowView.findViewById(R.id.txt1) as TextView
        val imageView = rowView.findViewById(R.id.img_logo) as ImageView
        val subtitleText = rowView.findViewById(R.id.txt2) as TextView


        titleText.text = title[position]
        imageView.setImageResource(imageId[position])
        subtitleText.text = description[position]

        return rowView
    }
}