package h2clt.fpt.quanlynhatro_h2clt_home.model

import java.util.Date

data class Hoa_Don(
    val ma_hoa_don:String,
    val ngay_tao_hoa_don:Date,
    val trang_thai_hoa_don:Int,
    val so_dien:Int,
    val so_nuoc:Int,
    val ma_phong:String){
    companion object{
        const val TB_NAME="hoa_don"
        const val CLM_MA_HOA_DON="ma_hoa_don"
        const val CLM_NGAY_TAO_HOA_DON="ngay_tao_hoa_don"
        const val CLM_TRANG_THAI_HOA_DON="trang_thai_hoa_don"
        const val CLM_SO_DIEN="so_dien"
        const val CLM_SO_NUOC="so_nuoc"
        const val CLM_MA_PHONG="ma_phong"
    }
}
