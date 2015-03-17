package com.wordpress.bmadi.belajar.jtable.dao;

import com.wordpress.bmadi.belajar.jtable.model.Kontak;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KontakDao {

    public List<Kontak> cariSemua() {
        try {
            List<Kontak> hasil = new ArrayList<Kontak>();
            Kontak k1 = new Kontak();
            k1.setId(1);
            k1.setNama("Madi Andi");
            k1.setAlamat("Jl.Gosling");
            k1.setTanggalLahir(new Date());
            k1.setAktif(Boolean.TRUE);
            hasil.add(k1);
            
            Kontak k2 = new Kontak();
            k2.setId(2);
            k2.setNama("Dima Gosling");
            k2.setAlamat("Jl.Dima Gosling");
            k2.setTanggalLahir(new SimpleDateFormat("yyyy-MM-dd").parse("1992-12-12"));
            k2.setAktif(Boolean.FALSE);
            hasil.add(k2);
            
            Kontak k3 = new Kontak();
            k3.setId(3);
            k3.setNama("Dian Gosling");
            k3.setAlamat("Jl.Dian Gosling");
            k3.setTanggalLahir(new SimpleDateFormat("yyyy-MM-dd").parse("1993-12-08"));
            k3.setAktif(Boolean.TRUE);
            hasil.add(k3);
            
            return hasil;
        } catch (ParseException ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }
}
