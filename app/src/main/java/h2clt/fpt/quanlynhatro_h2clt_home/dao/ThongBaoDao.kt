package h2clt.fpt.quanlynhatro_h2clt_home.dao

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper
import h2clt.fpt.quanlynhatro_h2clt_home.model.Thong_Bao

class ThongBaoDao(context: Context) {
    val dbHelper= DbHelper(context)
    val db=dbHelper.writableDatabase

    fun insertThongBao(thongBao: Thong_Bao):Long{
        val values=ContentValues()
        values.apply {
            put(Thong_Bao.CLM_MA_THONG_BAO,thongBao.ma_thong_bao)
            put(Thong_Bao.CLM_TIEU_DE,thongBao.tieu_de)
            put(Thong_Bao.CLM_NGAY_THONG_BAO,thongBao.ngay_thong_bao)
            put(Thong_Bao.CLM_NOI_DUNG,thongBao.noi_dung)
        }
        return db.insert(Thong_Bao.TB_NAME,null,values)
    }

    @SuppressLint("Range")
    fun getAllInThongBao():List<Thong_Bao>{
        val list= mutableListOf<Thong_Bao>()
        val sql="select*from ${Thong_Bao.TB_NAME}"
        val c=db.rawQuery(sql,null)
        if(c.moveToFirst()){
            do {
                val thongBao=Thong_Bao(
                    ma_thong_bao = c.getString(c.getColumnIndex(Thong_Bao.CLM_MA_THONG_BAO)),
                    tieu_de = c.getString(c.getColumnIndex(Thong_Bao.CLM_TIEU_DE)),
                    ngay_thong_bao = c.getString(c.getColumnIndex(Thong_Bao.CLM_NGAY_THONG_BAO)),
                    noi_dung = c.getString(c.getColumnIndex(Thong_Bao.CLM_NOI_DUNG))
                )
                list+=thongBao
            }while (c.moveToNext())
        }
        return list
    }
}