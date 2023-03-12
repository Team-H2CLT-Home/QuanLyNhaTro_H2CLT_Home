package h2clt.fpt.quanlynhatro_h2clt_home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import h2clt.fpt.quanlynhatro_h2clt_home.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Hello Everyone
        //hiep đã ở đây
        ///thanh

    }
}