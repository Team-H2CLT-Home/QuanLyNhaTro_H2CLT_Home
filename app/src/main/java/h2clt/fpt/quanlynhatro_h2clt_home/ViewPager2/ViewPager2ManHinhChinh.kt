package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2ManHinhChinh(fragmentManager: FragmentManager,lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {FragmentTrangChu()}
            1 -> {FragmentDangTin()}
            2 -> {FragmentThongBao()}
            3 -> {FragmentCaNhan()}
            else ->{FragmentTrangChu()}
        }
    }
}