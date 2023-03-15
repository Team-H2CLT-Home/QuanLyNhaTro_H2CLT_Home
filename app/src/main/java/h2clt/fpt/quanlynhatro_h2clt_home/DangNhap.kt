package h2clt.fpt.quanlynhatro_h2clt_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import h2clt.fpt.quanlynhatro_h2clt_home.ViewPager2.ManHinhChinhChuTro
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityDangNhapBinding

class DangNhap : AppCompatActivity() {
    private lateinit var binding: ActivityDangNhapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDangNhapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLuuDN.setOnClickListener {
            val intent = Intent(this,ManHinhChinhChuTro::class.java)
            startActivity(intent)
        }
    }
}