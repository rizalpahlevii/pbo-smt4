// Muhammad Rizal Pahlevi
// A11.2020.12692

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                int jumlah, i, total = 0;
                Scanner input = new Scanner(System.in);
                System.out.println("||||========Jasa Pemasangan Iklan Cetak========||||");
                System.out.println("||||     Nama Agen : Muhammad Rizal Pahlevi    ||||");
                System.out.println("||||===========================================||||");
                System.out.println("");
                System.out.print("Masukkan Jumlah Pemesanan Iklan = ");
                jumlah = input.nextInt();

                PasangIklan pasangIklan[] = new PasangIklan[jumlah];
                for (i = 0; i < jumlah; i++) {
                        pasangIklan[i] = new PasangIklan();
                        System.out.println("Iklan ke " + (pasangIklan[i].noNota = i + 1));
                        System.out.println("No Nota = " + (pasangIklan[i].noNota = i + 1));
                        pasangIklan[i].setNota();
                        pasangIklan[i].inputJumlah();
                        pasangIklan[i].getTarifIklan();
                        pasangIklan[i].inputDurasi();
                        pasangIklan[i].getDiskon();
                        pasangIklan[i].getBiayaIklan();
                        pasangIklan[i].getSouvenir();
                        pasangIklan[i].getTotal();
                        total = total + pasangIklan[i].totBiaya;
                        System.out.println("");
                        System.out.println("");
                }

                System.out.println("Daftar Iklan Cetak [Muhammad Rizal Pahlevi]");
                System.out.println(
                                " -------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(
                                "No      Nota        Produk Iklan         Tarif         Jumlah/Luas           Durasi              PPN           Total Biaya           Souvenir");
                System.out.println(
                                " -------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                for (i = 0; i < jumlah; i++) {
                        int no_pst = i + 1;
                        System.out.print("" + no_pst + " ");
                        pasangIklan[i].cetak();
                }
                System.out.println(
                                " -------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(
                                " -------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("Total Semua Biaya " + total);
                System.out.println("");
        }
}
