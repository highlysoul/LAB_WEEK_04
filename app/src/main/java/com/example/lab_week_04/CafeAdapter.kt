package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val content = when (position) {
            0 -> "Starbucks, kopi global dengan berbagai varian signature."
            1 -> "Janji Jiwa, kopi lokal dengan konsep grab-and-go."
            2 -> "Kopi Kenangan, brand kopi kekinian yang lagi hits di Indonesia."
            else -> "Unknown Cafe"
        }
        return CafeDetailFragment.newInstance(content)
    }
}
