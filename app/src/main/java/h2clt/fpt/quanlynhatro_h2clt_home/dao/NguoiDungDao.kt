package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Hoa_Don
import h2clt.fpt.quanlynhatro_h2clt_home.model.Nguoi_Dung

class NguoiDungDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun insertNguoiDung(nguoiDung: Nguoi_Dung):Long{
        val values=ContentValues()
        values.apply {
            put(Nguoi_Dung.CLM_MA_NGUOI_DUNG,nguoiDung.ma_nguoi_dung)
            put(Nguoi_Dung.CLM_HO_TEN_NGUOI_DUNG,nguoiDung.ho_ten_nguoi_dung)
            put(Nguoi_Dung.CLM_CCCD,nguoiDung.cccd)
            put(Nguoi_Dung.CLM_SDT_NGUOI_DUNG,nguoiDung.sdt_nguoi_dung)
            put(Nguoi_Dung.CLM_TRANG_THAI_CHU_HOP_DONG,nguoiDung.trang_thai_chu_hop_dong)
            put(Nguoi_Dung.CLM_TRANG_THAI_O,nguoiDung.trang_thai_o)
            put(Nguoi_Dung.CLM_MA_PHONG,nguoiDung.ma_phong)
        }
        return db.insert(Nguoi_Dung.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInNguoiDung():List<Nguoi_Dung>{
        val list= mutableListOf<Nguoi_Dung>()
        val sql="select * from ${Nguoi_Dung.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val nguoiDung=Nguoi_Dung(
                    ma_nguoi_dung = c.getString(c.getColumnIndex(Nguoi_Dung.CLM_MA_NGUOI_DUNG)),
                    ho_ten_nguoi_dung = c.getString(c.getColumnIndex(Nguoi_Dung.CLM_HO_TEN_NGUOI_DUNG)),
                    cccd = c.getString(c.getColumnIndex(Nguoi_Dung.CLM_CCCD)),
                    sdt_nguoi_dung = c.getString(c.getColumnIndex(Nguoi_Dung.CLM_SDT_NGUOI_DUNG)),
                    trang_thai_chu_hop_dong = c.getInt(c.getColumnIndex(Nguoi_Dung.CLM_TRANG_THAI_CHU_HOP_DONG)),
                    trang_thai_o = c.getInt(c.getColumnIndex(Nguoi_Dung.CLM_TRANG_THAI_O)),
                    ma_phong = c.getString(c.getColumnIndex(Nguoi_Dung.CLM_MA_PHONG))

                )
                list+=nguoiDung
            }while (c.moveToNext())
        }

        return list
    }
}