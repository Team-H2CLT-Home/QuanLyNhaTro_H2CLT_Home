package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.TrangChu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.FragmentTongquanBinding

class FragmentTongQuan:Fragment() {
    private lateinit var binding: FragmentTongquanBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTongquanBinding.inflate(layoutInflater)





        return binding.root
    }
}