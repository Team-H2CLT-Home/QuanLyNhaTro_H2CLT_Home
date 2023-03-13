package h2clt.fpt.quanlynhatro_h2clt_home

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



    }
}