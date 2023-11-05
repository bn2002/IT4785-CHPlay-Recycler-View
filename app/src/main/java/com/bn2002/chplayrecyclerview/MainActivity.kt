package com.bn2002.chplayrecyclerview

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var categories: ArrayList<CategoryModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initCategoryData()
        setContentView(R.layout.activity_main)
        val categoryRcv = findViewById<RecyclerView>(R.id.rev_list_category)
        categoryRcv.layoutManager = LinearLayoutManager(this)
        categoryRcv.adapter = CategoryAdapter(categories)
    }

    private fun initCategoryData() {
        val apps: ArrayList<AppModel> = ArrayList()
        apps.add(AppModel(name = "Ehust", image = R.drawable.ehust_icon, rate = 4.5))
        apps.add(AppModel(name = "Facebook", image = R.drawable.facebook_icon, rate = 3.1))
        apps.add(AppModel(name = "Youtube", image = R.drawable.youtube_icon, rate = 5.0))
        apps.add(AppModel(name = "Instagram", image = R.drawable.instagram_icon, rate = 3.9))
        apps.add(AppModel(name = "Liên quân", image = R.drawable.lienquan_icon, rate = 4.5))

        categories = ArrayList()
        categories.add(CategoryModel(name = "Giải trí", apps = apps))
        categories.add(CategoryModel(name = "Học tập", apps = apps))
        categories.add(CategoryModel(name = "Miễn phí", apps = apps))
        categories.add(CategoryModel(name = "Đặt phòng", apps = apps))
    }
}