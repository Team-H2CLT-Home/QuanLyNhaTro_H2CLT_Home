package h2clt.fpt.quanlynhatro_h2clt_home.dbhelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper.H2CLT.DB_NAME
import h2clt.fpt.quanlynhatro_h2clt_home.dbhelper.DbHelper.H2CLT.DB_VERSION
import h2clt.fpt.quanlynhatro_h2clt_home.model.*

class   DbHelper(context: Context): SQLiteOpenHelper(context,DB_NAME,null,DB_VERSION) {
    object H2CLT{
        const val DB_NAME="MyDB"
        const val DB_VERSION=1
    }
    override fun onCreate(db: SQLiteDatabase?) {
        val admin="""
            CREATE TABLE ${Admin.TB_NAME}(
            ${Admin.CLM_SDT} text unique not NULL,
            ${Admin.CLM_TEN_DANG_NHAP} PRIMARY key NOT NULL,
            ${Admin.CLM_HO_TEN} text NOT NULL,
            ${Admin.CLM_MAT_KHAU} text NOT NULL );
        """.trimIndent()
        db?.execSQL(admin)

        val khu_tro="""
            CREATE TABLE ${Khu_Tro.TB_NAME}(
            ${Khu_Tro.CLM_MA_KHU_TRO} text PRIMARY KEY NOT NULL,
            ${Khu_Tro.CLM_TEN_KHU_TRO} text NOT NULL,
            ${Khu_Tro.CLM_DIA_CHI} text NOT NULL,
            ${Khu_Tro.CLM_SO_LUONG_PHONG} integer NOT NULL,
            ${Khu_Tro.CLM_TEN_DANG_NHAP} text NOT NULL,
            FOREIGN KEY (${Khu_Tro.CLM_TEN_DANG_NHAP}) REFERENCES ${Admin.TB_NAME}(${Admin.CLM_TEN_DANG_NHAP}));
        """.trimIndent()
        db?.execSQL(khu_tro)

        val dich_vu_phong="""
            CREATE TABLE ${Dich_Vu_Phong.TB_NAME}(
            ${Dich_Vu_Phong.CLM_MA_DICH_VU} text PRIMARY KEY NOT NULL,
            ${Dich_Vu_Phong.CLM_TEN_DICH_VU} text NOT NULL);
        """.trimIndent()
        db?.execSQL(dich_vu_phong)

        val loai_dich_vu="""
            CREATE TABLE ${Loai_Dich_Vu.TB_NAME}(
            ${Loai_Dich_Vu.CLM_MA_LOAI_DICH_VU} text PRIMARY KEY NOT NULL,
            ${Loai_Dich_Vu.CLM_TEN_LOAI_DICH_VU} text  NOT NULL,
            ${Loai_Dich_Vu.CLM_GIA_DICH_VU} integer NOT NULL,
            ${Loai_Dich_Vu.CLM_MA_DICH_VU} text NOT NULL ,
            ${Loai_Dich_Vu.CLM_TRANG_THAI_LOAI_DICH_VU} Integer NOT NULL,
            FOREIGN KEY(${Loai_Dich_Vu.CLM_MA_DICH_VU})REFERENCES ${Dich_Vu_Phong.TB_NAME}( ${Dich_Vu_Phong.CLM_MA_DICH_VU}));
        """.trimIndent()
        db?.execSQL(loai_dich_vu)

        val phong="""
            CREATE TABLE ${Phong.TB_NAME}(
            ${Phong.CLM_MA_PHONG} text PRIMARY KEY NOT NULL,
            ${Phong.CLM_TEN_PHONG} text NOT NULL,
            ${Phong.CLM_DIEN_TICH} integer NOT NULL,
            ${Phong.CLM_GIA_THUE} long NOT NULL,
            ${Phong.CLM_SO_NGUOI_O} integer NOT NULL,
            ${Phong.CLM_TRANG_THAI_PHONG} integer NOT NULL,
            ${Phong.CLM_MA_KHU} text NOT NULL,
            ${Phong.CLM_MA_DICH_VU} text NOT NULL,
            FOREIGN KEY(${Phong.CLM_MA_KHU})REFERENCES ${Khu_Tro.TB_NAME}(${Khu_Tro.CLM_MA_KHU_TRO}),
            FOREIGN KEY (${Phong.CLM_MA_DICH_VU} ) REFERENCES ${Dich_Vu_Phong.TB_NAME}(${Dich_Vu_Phong.CLM_MA_DICH_VU} )); 
        """.trimIndent()
        db?.execSQL(phong)

        val hoa_don="""
            
            CREATE table ${Hoa_Don.TB_NAME}(
            ${Hoa_Don.CLM_MA_HOA_DON} text PRIMARY KEY NOT NULL,
            ${Hoa_Don.CLM_NGAY_TAO_HOA_DON} date NOT NULL,
            ${Hoa_Don.CLM_SO_DIEN} integer NOT NULL,
            ${Hoa_Don.CLM_SO_NUOC} integer NOT NULL,
            ${Hoa_Don.CLM_TRANG_THAI_HOA_DON} integer NOT NULL,
            ${Hoa_Don.CLM_MIEN_GIAM}integer NOT NULL,
            ${Hoa_Don.CLM_MA_PHONG} text NOT NULL,
            FOREIGN KEY (${Hoa_Don.CLM_MA_PHONG} ) REFERENCES ${Phong.TB_NAME}(${Phong.CLM_MA_PHONG}));
        """.trimIndent()
        db?.execSQL(hoa_don)

        val nguoi_dung="""
            CREATE TABLE ${Nguoi_Dung.TB_NAME}(
            ${Nguoi_Dung.CLM_MA_NGUOI_DUNG} text PRIMARY key NOT NULL,
            ${Nguoi_Dung.CLM_HO_TEN_NGUOI_DUNG} text NOT NULL,
            ${Nguoi_Dung.CLM_CCCD} text NOT NULL,
            ${Nguoi_Dung.CLM_SDT_NGUOI_DUNG} text unique NOT NULL,
            ${Nguoi_Dung.CLM_MA_PHONG} text NOT NULL,
            ${Nguoi_Dung.CLM_TRANG_THAI_O} integer not NULL,
            ${Nguoi_Dung.CLM_TRANG_THAI_CHU_HOP_DONG} integer NOT NULL,
            FOREIGN KEY (${Nguoi_Dung.CLM_MA_PHONG} ) REFERENCES ${Phong.TB_NAME}(${Phong.CLM_MA_PHONG}));
        """.trimIndent()
        db?.execSQL(nguoi_dung)

        val hop_dong="""
            CREATE TABLE ${Hop_Dong.TB_NAME}(
            ${Hop_Dong.CLM_MA_HOP_DONG} text PRIMARY KEY NOT NULL,
            ${Hop_Dong.CLM_THOI_HAN} integer NOT NULL,
            ${Hop_Dong.CLM_NGAY_O} text NOT NULL,
            ${Hop_Dong.CLM_NGAY_HOP_DONG} text NOT NULL,
            ${Hop_Dong.CLM_ANH_HOP_DONG}  text NOT NULL,
            ${Hop_Dong.CLM_TIEN_COC} long NOT NULL,
            ${Hop_Dong.CLM_TRANG_THAI_HOP_DONG} integer NOT NULL,
            ${Hop_Dong.CLM_MA_PHONG} text NOT NULL,
            ${Hop_Dong.CLM_MA_NGUOI_DUNG} text NOT NULL,
            FOREIGN KEY (${Hop_Dong.CLM_MA_PHONG} ) REFERENCES ${Phong.TB_NAME}(${Phong.CLM_MA_PHONG}),
            FOREIGN KEY (${Hop_Dong.CLM_MA_NGUOI_DUNG} ) REFERENCES ${Nguoi_Dung.TB_NAME}(${Nguoi_Dung.CLM_MA_NGUOI_DUNG}));
        """.trimIndent()
        db?.execSQL(hop_dong)

        val thong_bao="""
            CREATE TABLE ${Thong_Bao.TB_NAME}(
            ${Thong_Bao.CLM_MA_THONG_BAO} text PRIMARY KEY NOT NULL,
            ${Thong_Bao.CLM_TIEU_DE} text NOT NULL,
            ${Thong_Bao.CLM_NGAY_THONG_BAO} text NOT NULL,
            ${Thong_Bao.CLM_NOI_DUNG} text NOT NULL
            );
        """.trimIndent()
        db?.execSQL(thong_bao)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}