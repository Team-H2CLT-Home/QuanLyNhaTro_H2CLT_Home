package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import h2clt.fpt.quanlynhatro_h2clt_home.ChiTietPhongActivity
import h2clt.fpt.quanlynhatro_h2clt_home.DangNhap
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityDangKyBinding
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.FragmentThongbaoBinding
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.TablayoutQuanlyBinding

class FragmentTrangChu:Fragment() {

    private lateinit var binding: FragmentThongbaoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThongbaoBinding.inflate(inflater, container, false)
        val adapter = ViewPager2ThongBao(parentFragmentManager, lifecycle)
        binding.viewPager2ThongBao.adapter = adapter
        TabLayoutMediator(binding.tabLayoutThongBao, binding.viewPager2ThongBao) { tab, pos ->
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
//        binding = TablayoutQuanlyBinding.inflate(inflater,container,false)
//        binding.taoHopDong.setOnClickListener {
//            val intent = Intent(context,ChiTietPhongActivity::class.java)
//            startActivity(intent)
//        }
//        return binding.root
    }
}