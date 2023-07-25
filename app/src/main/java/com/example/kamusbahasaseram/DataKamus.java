package com.example.kamusbahasaseram;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class DataKamus extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dbkamus";
    private static final String INDONESIA = "indonesia";
    private static final String SERAM = "seram";

    public DataKamus(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public void createTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, indonesia TEXT, seram TEXT);");
    }

    public void generateData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        //HURUF ABJAD A
        cv.put(INDONESIA, "ayam");
        cv.put(SERAM, "Manuk / Manuka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "apa");
        cv.put(SERAM, "Laa / Manlaa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anjing");
        cv.put(SERAM, "Kafuna ");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "asam");
        cv.put(SERAM, "Matibi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "air");
        cv.put(SERAM, "Ar / Aara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anak");
        cv.put(SERAM, "Anaka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "angkat");
        cv.put(SERAM, "Maa / Balan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "api");
        cv.put(SERAM, "Afi / Afira");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "atas");
        cv.put(SERAM, "Ata");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ayah");
        cv.put(SERAM, "Baba");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "adik");
        cv.put(SERAM, "Toi");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD B
        cv.put(INDONESIA, "belanja");
        cv.put(SERAM, "Fas");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baik");
        cv.put(SERAM, "Gafin");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berapa");
        cv.put(SERAM, "Fis ");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bagaimana");
        cv.put(SERAM, "Magei ?");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "besok");
        cv.put(SERAM, "Kilya");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "babi");
        cv.put(SERAM, "Boi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "buayu");
        cv.put(SERAM, "Waira");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baju");
        cv.put(SERAM, "Ladan / Ladana");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "besar");
        cv.put(SERAM, "bobak");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "batu");
        cv.put(SERAM, "Watu / Watura");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "badan");
        cv.put(SERAM, "Watan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bagun");
        cv.put(SERAM, "Wotu / Wotulo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baru");
        cv.put(SERAM, "Wowou");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "basah");
        cv.put(SERAM, "Kabotan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bawah");
        cv.put(SERAM, "Wa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bayar");
        cv.put(SERAM, "War");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "belajar");
        cv.put(SERAM, "Balajar");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "belum");
        cv.put(SERAM, "Boitefua");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "benar");
        cv.put(SERAM, "Tuku");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berak");
        cv.put(SERAM, "Tamain");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "biarlah");
        cv.put(SERAM, "Fandaaloo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "Bisul");
        cv.put(SERAM, "Wisul");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bodoh");
        cv.put(SERAM, "Bodara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bohong");
        cv.put(SERAM, "Lolik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bubur");
        cv.put(SERAM, "Bubura");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "buka");
        cv.put(SERAM, "Salik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bukan");
        cv.put(SERAM, "Teimo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "buku");
        cv.put(SERAM, "Buk");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bulan");
        cv.put(SERAM, "Ulan / Ulana");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bulu");
        cv.put(SERAM, "Wiliur");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "busuk");
        cv.put(SERAM, "Siman / Nasiman");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "buta");
        cv.put(SERAM, "Buti");
        db.insert("kamus", INDONESIA, cv);



        //HURUF ABJAD C
        cv.put(INDONESIA, "celana");
        cv.put(SERAM, "kada");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cabai");
        cv.put(SERAM, "Maresan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cacimaki");
        cv.put(SERAM, "Fitai");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cari");
        cv.put(SERAM, "Bail");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cepat");
        cv.put(SERAM, "Galak");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cium");
        cv.put(SERAM, "Musi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cucu");
        cv.put(SERAM, "Tata / nitatara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cantik");
        cv.put(SERAM, "Baban / Gaga");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cahaya");
        cv.put(SERAM, "Cahai");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cicak");
        cv.put(SERAM, "Toki-toki /Toki-tokira");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cincin");
        cv.put(SERAM, "Tang-tangana");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cumi-cumi");
        cv.put(SERAM, "Fer-ferra");
        db.insert("kamus", INDONESIA, cv);


        //HURUF ABJAD D
        cv.put(INDONESIA, "dia");
        cv.put(SERAM, "i");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "darimana");
        cv.put(SERAM, "Nagi mari ?");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "di");
        cv.put(SERAM, "Bo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "disana");
        cv.put(SERAM, "Bokaure, Bokauri");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "disini");
        cv.put(SERAM, "Wariari");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "datang");
        cv.put(SERAM, "Ratan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dengan");
        cv.put(SERAM, "Tu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "disitu");
        cv.put(SERAM, "Wara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dua");
        cv.put(SERAM, "Roti");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "delapan");
        cv.put(SERAM, "Alu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "durian");
        cv.put(SERAM, "Duran / Durana");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "didalam");
        cv.put(SERAM, "Walomin");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "darahnya");
        cv.put(SERAM, "Nirarara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dan");
        cv.put(SERAM, "tu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dandan");
        cv.put(SERAM, "Fikolik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "darah");
        cv.put(SERAM, "Rara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "darah kamu");
        cv.put(SERAM, "kau numu rarara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "darah saya");
        cv.put(SERAM, "Aku nugu rarara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "daun");
        cv.put(SERAM, "Kairu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "debat");
        cv.put(SERAM, "Dabakumalawang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dekat");
        cv.put(SERAM, "Rapat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dengar");
        cv.put(SERAM, "Rongar");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "diam");
        cv.put(SERAM, "Motan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "duri");
        cv.put(SERAM, "Ruri / Ruria");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD E
        cv.put(INDONESIA, "empat");
        cv.put(SERAM, "fat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "enak");
        cv.put(SERAM, "Matelas / Sadap");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "enam");
        cv.put(SERAM, "Onan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "emas");
        cv.put(SERAM, "Mas");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "eyang");
        cv.put(SERAM, "Oyang");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD F
        cv.put(INDONESIA, "faham");
        cv.put(SERAM, "Mangarti");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "foto");
        cv.put(SERAM, "Foto / Fotora");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "fikir");
        cv.put(SERAM, "Fikiran");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD G
        cv.put(INDONESIA, "gula");
        cv.put(SERAM, "Nasu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gigi");
        cv.put(SERAM, "Ngisik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "garam");
        cv.put(SERAM, "Sira / Sirara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gaji");
        cv.put(SERAM, "Gaji, Gajira");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ganteng");
        cv.put(SERAM, "Baban / Gaga");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gampang");
        cv.put(SERAM, "Gampang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gatal");
        cv.put(SERAM, "Mitikatal");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gaya");
        cv.put(SERAM, "gayara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gayanya");
        cv.put(SERAM, "nigayara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gelas");
        cv.put(SERAM, "Galas / Galasa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gelap");
        cv.put(SERAM, "galap");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gembira");
        cv.put(SERAM, "sanang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gila");
        cv.put(SERAM, "Omas / Momas / Nomas");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gigit");
        cv.put(SERAM, "Nakarat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "goreng");
        cv.put(SERAM, "Tumis");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gosok");
        cv.put(SERAM, "Seka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gunting");
        cv.put(SERAM, "Gunting / Guntinga");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gunung");
        cv.put(SERAM, "Keli");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "di atas gunung");
        cv.put(SERAM, "Ata keli");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gurita");
        cv.put(SERAM, "Urit / Uriita");
        db.insert("kamus", INDONESIA, cv);


        //HURUF ABJAD H
        cv.put(INDONESIA, "hujan");
        cv.put(SERAM, "uran");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hidung");
        cv.put(SERAM, "Iso / Isora");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "habis");
        cv.put(SERAM, "Abis");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "haid");
        cv.put(SERAM, "Kotor");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "habis");
        cv.put(SERAM, "Abis");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hajar");
        cv.put(SERAM, "Tewa / Fitewa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hajat");
        cv.put(SERAM, "Hajat / Hajata");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hamil");
        cv.put(SERAM, "Firoka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "saya hamil");
        cv.put(SERAM, "Ku firoka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dia hamil");
        cv.put(SERAM, "Nafirokai");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hancur");
        cv.put(SERAM, "Nancur");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "handuk");
        cv.put(SERAM, "Handuka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "harga");
        cv.put(SERAM, "Harga / Hargara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hari");
        cv.put(SERAM, "Hari");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "harta");
        cv.put(SERAM, "Harta");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "harum");
        cv.put(SERAM, "Waun sadap");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hati");
        cv.put(SERAM, "At");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hatiku sakit");
        cv.put(SERAM, "Laminoo nugu namasingat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hatinya sakit");
        cv.put(SERAM, "Laminora namasingat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hati kamus sakit");
        cv.put(SERAM, "Laminoo numu namasingat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "haus");
        cv.put(SERAM, "Mangalan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hebat");
        cv.put(SERAM, "Hebat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "saya hebat");
        cv.put(SERAM, "Aku hebat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kamu hebat");
        cv.put(SERAM, "Kau hebat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dia hebat");
        cv.put(SERAM, "I Hebat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hemat");
        cv.put(SERAM, "Hemat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "heran");
        cv.put(SERAM, "Heran");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hewan");
        cv.put(SERAM, "Binatang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hewan kecil");
        cv.put(SERAM, "Binartang otaka");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hidup");
        cv.put(SERAM, "Hidup");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hilang");
        cv.put(SERAM, "Badein / Nabadei");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hitam");
        cv.put(SERAM, "Metan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "huruf");
        cv.put(SERAM, "Huruf");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD I
        cv.put(INDONESIA, "ikan");
        cv.put(SERAM, "Ikan, Ikana");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "itu");
        cv.put(SERAM, "Iraa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ia");
        cv.put(SERAM, "U");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ibu");
        cv.put(SERAM, "Mama");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "indah");
        cv.put(SERAM, "Gaga, Baban");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ingat");
        cv.put(SERAM, "Mingat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ingin");
        cv.put(SERAM, "Mau");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ini");
        cv.put(SERAM, "Iyyaaa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "injak");
        cv.put(SERAM, "Bora, Nabora");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "iris");
        cv.put(SERAM, "Miris / Niris");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "isap");
        cv.put(SERAM, "Bus");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "istri");
        cv.put(SERAM, "Minlen / Wawina");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "istirahat");
        cv.put(SERAM, "Strahat");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD J
        cv.put(INDONESIA, "jagung");
        cv.put(SERAM, "fasinan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jambu");
        cv.put(SERAM, "Mutu/Mutura");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jeruk");
        cv.put(SERAM, "Lemuna");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jari tangan");
        cv.put(SERAM, "Ima rang-rang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jari kaki");
        cv.put(SERAM, "Ike rang-rang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jendela");
        cv.put(SERAM, "Wawait/Wawaita");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD K
        cv.put(INDONESIA, "kamu");
        cv.put(SERAM, "kau");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kabar");
        cv.put(SERAM, "Habar/Habara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kami");
        cv.put(SERAM, "Kami");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kapan");
        cv.put(SERAM, "Dodan fis ?");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kemarin");
        cv.put(SERAM, "Mingirare");
        db.insert("kamus", INDONESIA, cv);





        //HURUF ABJAD L
        cv.put(INDONESIA, "laki laki");
        cv.put(SERAM, "urana");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD M
        cv.put(INDONESIA, "mereka");
        cv.put(SERAM, "Si");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "makan");
        cv.put(SERAM, "Fanga");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "minum");
        cv.put(SERAM, "Minu/Ninu");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD N
        cv.put(INDONESIA, "nama");
        cv.put(SERAM, "Ngasan");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD O
        cv.put(INDONESIA, "orang");
        cv.put(SERAM, "Mancia");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD P
        cv.put(INDONESIA, "perempuan");
        cv.put(SERAM, "Wawina");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD Q
        cv.put(INDONESIA, "Quran");
        cv.put(SERAM, "Qurana");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD R
        cv.put(INDONESIA, "raja");
        cv.put(SERAM, "Jouu");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD S
        cv.put(INDONESIA, "saya");
        cv.put(SERAM, "Aku / Ku");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD T
        cv.put(INDONESIA, "tiga");
        cv.put(SERAM, "Tolu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "tidur");
        cv.put(SERAM, "Kifit");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD U
        cv.put(INDONESIA, "ular");
        cv.put(SERAM, "Tekis");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD V
        cv.put(INDONESIA, "volume");
        cv.put(SERAM, "folumera");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD W
        cv.put(INDONESIA, "wanita");
        cv.put(SERAM, "Wawina");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD X
        cv.put(INDONESIA, "xa");
        cv.put(SERAM, "xc");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD Y
        cv.put(INDONESIA, "Yakin");
        cv.put(SERAM, "tukuu");
        db.insert("kamus", INDONESIA, cv);

        //HURUF ABJAD Z
        cv.put(INDONESIA, "zakat");
        cv.put(SERAM, "Jakat, Jakaataa");
        db.insert("kamus", INDONESIA, cv);

        //KALIMAT
        cv.put(INDONESIA, "nama kamu siapa");
        cv.put(SERAM, "Kau ngasan sei ?");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "nama saya rahmini");
        cv.put(SERAM, "Ku ngasan rahmini, Aku nugu ngasana rahmini");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dari mana asal kamu");
        cv.put(SERAM, "Kau mancia nagi ?");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "saya berasal dari bula");
        cv.put(SERAM, "Aku mancia bula");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kamu tinggal dimana");
        cv.put(SERAM, "Kau mian nagii  ?");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "saya tinggal di kelapadua");
        cv.put(SERAM, "Kumian bo jalan kelapadua");
        db.insert("kamus", INDONESIA, cv);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
        public void onCreate(SQLiteDatabase db)  {
    }
}



