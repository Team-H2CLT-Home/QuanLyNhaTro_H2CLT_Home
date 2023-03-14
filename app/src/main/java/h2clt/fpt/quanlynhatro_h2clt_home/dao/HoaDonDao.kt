package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Hoa_Don

class HoaDonDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun insertHoaDon(hoaDon: Hoa_Don):Long{
        val values=ContentValues()
        values.apply {
            put(Hoa_Don.CLM_MA_HOA_DON,hoaDon.ma_hoa_don)
            put(Hoa_Don.CLM_NGAY_TAO_HOA_DON,hoaDon.ngay_tao_hoa_don)
            put(Hoa_Don.CLM_TRANG_THAI_HOA_DON,hoaDon.trang_thai_hoa_don)
            put(Hoa_Don.CLM_SO_DIEN,hoaDon.so_dien)
            put(Hoa_Don.CLM_SO_NUOC,hoaDon.so_nuoc)
            put(Hoa_Don.CLM_MA_PHONG,hoaDon.ma_phong)


        }
        return db.insert(Hoa_Don.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInHoaDon():List<Hoa_Don>{
        val list= mutableListOf<Hoa_Don>()
        val sql="select * from ${Hoa_Don.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val hoaDon=Hoa_Don(
                    ma_hoa_don = c.getString(c.getColumnIndex(Hoa_Don.CLM_MA_HOA_DON)),

                trang_thai_hoa_don = c.getInt(c.getColumnIndex(Hoa_Don.CLM_TRANG_THAI_HOA_DON)),
                    so_dien = c.getInt(c.getColumnIndex(Hoa_Don.CLM_SO_DIEN)),
                    so_nuoc = c.getInt(c.getColumnIndex(Hoa_Don.CLM_SO_NUOC)),
                    ma_phong = c.getString(c.getColumnIndex(Hoa_Don.CLM_MA_PHONG))

                )
                list+=hoaDon
            }while (c.moveToNext())
        }
        return list
    }
}