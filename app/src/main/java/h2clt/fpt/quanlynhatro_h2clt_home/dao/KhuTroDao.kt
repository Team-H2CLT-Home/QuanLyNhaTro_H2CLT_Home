package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Khu_Tro

class KhuTroDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun InsertKhuTro(khuTro: Khu_Tro):Long{
        val values=ContentValues()
        values.apply {
            put(Khu_Tro.CLM_MA_KHU_TRO,khuTro.ma_khu_tro)
            put(Khu_Tro.CLM_TEN_KHU_TRO,khuTro.ten_khu_tro)
            put(Khu_Tro.CLM_DIA_CHI,khuTro.dia_chi)
            put(Khu_Tro.CLM_SO_LUONG_PHONG,khuTro.so_luong_phong)
            put(Khu_Tro.CLM_TEN_DANG_NHAP,khuTro.ten_dang_nhap)
        }
        return db.insert(Khu_Tro.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInKhuTro(khuTro: Khu_Tro):List<Khu_Tro>{
        val list= mutableListOf<Khu_Tro>()
        val sql="select * from ${Khu_Tro.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val khuTro=Khu_Tro(
                ma_khu_tro = c.getString(c.getColumnIndex(Khu_Tro.CLM_MA_KHU_TRO)),
                    ten_khu_tro = c.getString(c.getColumnIndex(Khu_Tro.CLM_TEN_KHU_TRO)),
                    dia_chi = c.getString(c.getColumnIndex(Khu_Tro.CLM_DIA_CHI)),
                    so_luong_phong = c.getInt(c.getColumnIndex(Khu_Tro.CLM_SO_LUONG_PHONG)),
                    ten_dang_nhap = c.getString(c.getColumnIndex(Khu_Tro.CLM_TEN_DANG_NHAP))
                )
                list+=khuTro
            }while (c.moveToNext())
        }
        return list
    }
}