package h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.FragmentDangtinBinding

class FragmentDangTin:Fragment() {
    private lateinit var binding: FragmentDangtinBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDangtinBinding.inflate(layoutInflater)



        return binding.root
    }
}