package com.jiahaoliuliu.whatsnew

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ContentViewPagerAdapter(private val fragmentManager: FragmentManager):
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        private val contentList = listOf(R.drawable.aztec_dancer, R.drawable.dont_believe_what_china_say,
            R.drawable.the_small_stuff)
    }

    override fun getItem(position: Int): Fragment {
        return ContentFragment.newInstance(contentList[position])
    }

    override fun getCount() = contentList.size

}