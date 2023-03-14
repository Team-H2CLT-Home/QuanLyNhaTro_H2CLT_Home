package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ThongBao

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.TablayoutThongbaoTatcaBinding

class FragmentTBKhac: Fragment() {
    private lateinit var binding : TablayoutThongbaoTatcaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TablayoutThongbaoTatcaBinding.inflate(layoutInflater)

        binding.TBTatca.setBackgroundColor(Color.BLUE)


        return binding.root
    }
}