package com.ostin.qrreader.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ostin.qrreader.home.tabs.list.ListFragment
import com.ostin.qrreader.home.tabs.reader.ReaderFragment

const val READER_PAGE_INDEX = 0
const val LIST_PAGE_INDEX = 1

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    /**
     * Mapping of the ViewPager page indexes to their respective Fragments
     */
    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        READER_PAGE_INDEX to { ReaderFragment() },
        LIST_PAGE_INDEX to { ListFragment() }
    )

    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}