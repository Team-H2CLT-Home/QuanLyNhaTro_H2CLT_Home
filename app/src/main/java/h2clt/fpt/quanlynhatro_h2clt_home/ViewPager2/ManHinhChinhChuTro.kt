package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import h2clt.fpt.quanlynhatro_h2clt_home.R
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityManHinhChinhChuTroBinding

class ManHinhChinhChuTro : AppCompatActivity() {
    private lateinit var binding: ActivityManHinhChinhChuTroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManHinhChinhChuTroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ViewPager2ManHinhChinh(supportFragmentManager,lifecycle)
        binding.viewPager2ManHinhChinh.adapter = adapter
        TabLayoutMediator(binding.tabLayoutManHinhChinh,binding.viewPager2ManHinhChinh) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.home_icon)
                    tab.text = "Trang chủ"
                }
                1 -> {
                    tab.setIcon(R.drawable.dangtin_icon)
                    tab.text = "Đăng tin"
                }
                2 -> {
                    tab.setIcon(R.drawable.thongbao)
                    tab.text = "Thông báo"
                }
                3 -> {
                    tab.setIcon(R.drawable.canhan_icon)
                    tab.text = "Cá nhân"
                }
                else -> tab.text = "Trang chủ"
            }
        }.attach()



    }
}