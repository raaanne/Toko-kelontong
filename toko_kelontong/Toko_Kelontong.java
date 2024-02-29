package toko_kelontong;

import java.util.Scanner;

public class Toko_Kelontong {

    public static void main(String[] args) {
        //Membuat objek 
        Member member;
        member = new Member(){};
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
    }
}
