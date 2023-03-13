package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Dich_Vu_Phong

class DichVuPhongDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun insertDichVuPhong(dichVuPhong: Dich_Vu_Phong):Long{
        val values=ContentValues()
        values.apply {
            put(Dich_Vu_Phong.CLM_MA_DICH_VU,dichVuPhong.ma_dich_vu)
            put(Dich_Vu_Phong.CLM_TEN_DICH_VU,dichVuPhong.ten_dich_vu)
        }
      return db.insert(Dich_Vu_Phong.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInDichVuPhong():List<Dich_Vu_Phong>{
        val list= mutableListOf<Dich_Vu_Phong>()
        val sql="select * from ${Dich_Vu_Phong.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val dichVuPhong=Dich_Vu_Phong(
                    ma_dich_vu = c.getString(c.getColumnIndex(Dich_Vu_Phong.CLM_MA_DICH_VU)),
                    ten_dich_vu = c.getString(c.getColumnIndex(Dich_Vu_Phong.CLM_TEN_DICH_VU))
                )
                list+=dichVuPhong
            }while (c.moveToNext())
        }
        return list
    }
}