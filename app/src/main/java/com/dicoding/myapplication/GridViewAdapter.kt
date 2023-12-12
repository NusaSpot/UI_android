package com.dicoding.myapplication

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView


class GridViewAdapter(private val context: Context) : BaseAdapter() {

    // Placeholder image resource
    private val placeholderImage = R.drawable.placeholder_image

    // Array of image resources to be displayed
    private val imageResources = arrayOf(
        R.drawable.pisang,
        R.drawable.pisang,
        R.drawable.pisang,
        R.drawable.pisang
    )

    override fun getCount(): Int {
        return imageResources.size
    }

    override fun getItem(position: Int): Any {
        return imageResources[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(context)
        imageView.layoutParams = ViewGroup.LayoutParams(336, 229)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setImageResource(imageResources[position])
        return imageView
    }
}
