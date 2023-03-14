package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.TrangChu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import h2clt.fpt.quanlynhatro_h2clt_home.ChiTietPhongActivity
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.TablayoutQuanlyBinding

class FragmentQuanLy:Fragment() {
    private lateinit var binding: TablayoutQuanlyBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TablayoutQuanlyBinding.inflate(inflater,container,false)
        binding.taoHopDong.setOnClickListener {
            val intent = Intent(context, ChiTietPhongActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}