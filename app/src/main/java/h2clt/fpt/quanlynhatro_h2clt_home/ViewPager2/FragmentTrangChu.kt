package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import h2clt.fpt.quanlynhatro_h2clt_home.ActivityDanhSachHoaDon
import h2clt.fpt.quanlynhatro_h2clt_home.ActivityDanhSachPhong
import h2clt.fpt.quanlynhatro_h2clt_home.ChiTietPhongActivity
import h2clt.fpt.quanlynhatro_h2clt_home.DangNhap
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityDangKyBinding
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityDanhSachPhongBinding
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.TablayoutQuanlyBinding

class FragmentTrangChu:Fragment() {

     private lateinit var binding: TablayoutQuanlyBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TablayoutQuanlyBinding.inflate(inflater,container,false)
        binding.taoHopDong.setOnClickListener {
            val intent = Intent(context,ActivityDanhSachPhong::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}