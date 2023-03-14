package h2clt.fpt.quanlynhatro_h2clt_home.model

import java.util.Date

data class Thong_Bao(
    val ma_thong_bao:String,
    val tieu_de:String,
    val ngay_thong_bao:String,
    val noi_dung:String){
    companion object{
        const val TB_NAME="thong_bao"
        const val CLM_MA_THONG_BAO="ma_thong_bao"
        const val CLM_TIEU_DE="tieu_de"
        const val CLM_NGAY_THONG_BAO="ngay_thong_bao"
        const val CLM_NOI_DUNG="noi_dung"
    }
}
