package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao.FragmentTBKhac
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao.FragmentTBTatCa
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao.FragmentTBTien

class ViewPager2ThongBao(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {FragmentTBTatCa()}
            1 -> {FragmentTBTien()}
            2 -> {FragmentTBKhac()}
            else ->{FragmentTBTatCa()}
        }
    }
}