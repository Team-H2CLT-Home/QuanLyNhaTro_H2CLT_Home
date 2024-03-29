package h2clt.fpt.quanlynhatro_h2clt_home.model

data class NguoiDung(
    val ma_nguoi_dung:String,
    val ho_ten_nguoi_dung:String,
    val cccd:String,
    val sdt_nguoi_dung:String,
    val trang_thai_chu_hop_dong:Int,
    val trang_thai_o:Int,
    val ma_phong:String){
    companion object{
        const val TB_NAME="nguoi_dung"
        const val CLM_MA_NGUOI_DUNG="ma_nguoi_dung"
        const val CLM_HO_TEN_NGUOI_DUNG="ho_ten_nguoi_dung"
        const val CLM_CCCD="cccd"
        const val CLM_SDT_NGUOI_DUNG="sdt_nguoi_dung"
        const val CLM_TRANG_THAI_CHU_HOP_DONG="trang_thai_chu_hop_dong"
        const val CLM_TRANG_THAI_O="trang_thai_o"
        const val CLM_MA_PHONG="ma_phong"
    }
}
