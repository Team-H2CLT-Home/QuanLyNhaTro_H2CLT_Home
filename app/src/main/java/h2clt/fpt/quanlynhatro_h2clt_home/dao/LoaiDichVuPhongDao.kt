package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Loai_Dich_Vu

class LoaiDichVuPhongDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun insertLoaiDichVuPhong(loaiDichVu: Loai_Dich_Vu):Long{
        val values=ContentValues()
        values.apply {
            put(Loai_Dich_Vu.CLM_MA_LOAI_DICH_VU,loaiDichVu.ma_loai_dich_vu)
            put(Loai_Dich_Vu.CLM_TEN_LOAI_DICH_VU,loaiDichVu.ten_loai_dich_vu)
            put(Loai_Dich_Vu.CLM_GIA_DICH_VU,loaiDichVu.gia_dich_vu)
            put(Loai_Dich_Vu.CLM_TRANG_THAI_LOAI_DICH_VU,loaiDichVu.trang_thai_loai_dich_vu)
            put(Loai_Dich_Vu.CLM_MA_DICH_VU,loaiDichVu.ma_dich_vu)

        }
        return db.insert(Loai_Dich_Vu.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInLoaiDichVu():List<Loai_Dich_Vu>{
        val list= mutableListOf<Loai_Dich_Vu>()
        val sql="select * from ${Loai_Dich_Vu.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val loaiDichVu=Loai_Dich_Vu(
                    ma_loai_dich_vu = c.getString(c.getColumnIndex(Loai_Dich_Vu.CLM_MA_LOAI_DICH_VU)),
                    ten_loai_dich_vu = c.getString(c.getColumnIndex(Loai_Dich_Vu.CLM_TEN_LOAI_DICH_VU)),
                    gia_dich_vu = c.getInt(c.getColumnIndex(Loai_Dich_Vu.CLM_GIA_DICH_VU)),
                    trang_thai_loai_dich_vu = c.getInt(c.getColumnIndex(Loai_Dich_Vu.CLM_TRANG_THAI_LOAI_DICH_VU)),
                    ma_dich_vu = c.getString(c.getColumnIndex(Loai_Dich_Vu.CLM_MA_DICH_VU))

                )
                list+=loaiDichVu

            }while (c.moveToNext())
        }


        return list
    }
}