public class HitungNilai {
    String nama, nim;
    float nilaiTugas, nilaiUts, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;

    void hitungNilai() {
        pNilaiTugas = nilaiTugas * 0.20f;
        pNilaiUts = nilaiUts * 0.35f;
        pNilaiUas = nilaiUas * 0.45f;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
    }

    void cetakNilai() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Tugas\t: " + nilaiTugas + " 20%\t:" + pNilaiTugas);
        System.out.println("Nilai UTS\t: " + nilaiUts + " 35%\t:" + pNilaiUts);
        System.out.println("Nilai UAS\t: " + nilaiUas + " 45%\t:" + pNilaiUas);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
    }

}
