package h2clt.fpt.quanlynhatro_h2clt_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityThemKhuTroBinding

class ThemKhuTroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThemKhuTroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThemKhuTroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTiepTuc.setOnClickListener {
            val intent = Intent(this@ThemKhuTroActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }

}