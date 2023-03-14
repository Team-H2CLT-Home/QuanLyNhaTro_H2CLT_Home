package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao.FragmentTBKhac
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao.FragmentTBTatCa
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao.FragmentTBTien
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.TrangChu.FragmentQuanLy
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.TrangChu.FragmentTongQuan

class ViewPager2TrangChu(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {FragmentQuanLy()}
            1 -> {FragmentTongQuan()}
            else ->{FragmentQuanLy()}
        }
    }
}