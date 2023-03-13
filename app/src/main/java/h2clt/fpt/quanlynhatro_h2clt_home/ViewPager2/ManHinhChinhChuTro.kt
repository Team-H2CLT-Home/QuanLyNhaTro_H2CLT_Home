package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
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
                    tab.text = "Quản Lý"
                }
                1 -> {
                    tab.text = "Tổng Quan"
                }
                else -> tab.text = "Quản Lý"
            }
        }.attach()



    }
}