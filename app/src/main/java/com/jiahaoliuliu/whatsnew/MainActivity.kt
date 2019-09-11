package com.jiahaoliuliu.whatsnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    lateinit var contentViewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contentViewPager = findViewById(R.id.content_view_pager)
        contentViewPager.adapter = ContentViewPagerAdapter(this.supportFragmentManager)
    }
}
