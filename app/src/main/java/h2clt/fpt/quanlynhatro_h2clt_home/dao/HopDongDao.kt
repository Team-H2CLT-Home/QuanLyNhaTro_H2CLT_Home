package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Hop_Dong

class HopDongDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun insertHopDong(hopDong: Hop_Dong):Long{
        val values=ContentValues()
        values.apply {
            put(Hop_Dong.CLM_MA_HOP_DONG,hopDong.ma_hop_dong)
            put(Hop_Dong.CLM_THOI_HAN,hopDong.thoi_han)
            put(Hop_Dong.CLM_NGAY_O,hopDong.ngay_o)
            put(Hop_Dong.CLM_NGAY_HOP_DONG,hopDong.ngay_hop_dong)
            put(Hop_Dong.CLM_ANH_HOP_DONG,hopDong.anh_hop_dong)
            put(Hop_Dong.CLM_TIEN_COC,hopDong.tien_coc)
            put(Hop_Dong.CLM_TRANG_THAI_HOP_DONG,hopDong.trang_thai_hop_dong)
            put(Hop_Dong.CLM_MA_PHONG,hopDong.ma_phong)
            put(Hop_Dong.CLM_MA_NGUOI_DUNG,hopDong.ma_nguoi_dung)
        }
        return db.insert(Hop_Dong.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInHopDong():List<Hop_Dong>{
        val list= mutableListOf<Hop_Dong>()
        val sql="select * from ${Hop_Dong.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val hopDong=Hop_Dong(
                    ma_hop_dong = c.getString(c.getColumnIndex(Hop_Dong.CLM_MA_HOP_DONG)),
                    thoi_han = c.getInt(c.getColumnIndex(Hop_Dong.CLM_THOI_HAN)),
                    ngay_o = c.getString(c.getColumnIndex(Hop_Dong.CLM_NGAY_O)),
                    ngay_hop_dong = c.getString(c.getColumnIndex(Hop_Dong.CLM_NGAY_HOP_DONG)),
                    anh_hop_dong = c.getString(c.getColumnIndex(Hop_Dong.CLM_ANH_HOP_DONG)),
                    tien_coc = c.getInt(c.getColumnIndex(Hop_Dong.CLM_TIEN_COC)),
                    trang_thai_hop_dong = c.getInt(c.getColumnIndex(Hop_Dong.CLM_TRANG_THAI_HOP_DONG)),
                    ma_phong = c.getString(c.getColumnIndex(Hop_Dong.CLM_MA_PHONG)),
                    ma_nguoi_dung = c.getString(c.getColumnIndex(Hop_Dong.CLM_MA_NGUOI_DUNG))
                )
                list+=hopDong
            }while (c.moveToNext())
        }

        return list
    }
}