package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.FragmentTrangchuBinding

class FragmentTrangChu:Fragment() {
     private lateinit var binding:FragmentTrangchuBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTrangchuBinding.inflate(inflater, container, false)
        val adapter = ViewPager2TrangChu(parentFragmentManager, lifecycle)
        binding.viewPager2TrangChu.adapter = adapter
        TabLayoutMediator(binding.tabLayoutTrangChu, binding.viewPager2TrangChu) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.text = "Quản Lý"
                }
                1 -> {
                    tab.text = "Tổng Quan"
                }

                else -> tab.text = "Quản Lý"
            }
        }.attach()
        return binding.root
    }
}