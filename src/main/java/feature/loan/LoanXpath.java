package feature.loan;

public class LoanXpath {
    //Xpath untuk menampilkan SP3 List
    //public static String dropDownMenu = "//body/div[1]/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/button/span/i";
    public static String pelayanan = "(//div[contains(text(),'PELAYANAN')])[1]";
    public static String pembiayaan = "(//div[contains(text(),'PEMBIAYAAN')])[1]";
    public static String penyaluran = "(//div[contains(text(),'PENYALURAN')])[1]";
    public static String sp3 = "(//div[contains(text(),'SP3')])[1]";
    public static String dropDown = "//body/div/div/div[2]/div[1]/div/div[1]/div[2]/div";
    public static String signOut = "//a[normalize-space()='Sign Out']";
    //Xpath untuk membuat SP3
    public static String buatSP3 = "//body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/button/span[2]";
    public static String inputNama = "//section/div[2]/div/input";
    public static String buttonCari = "//footer/button[2]/span";
    public static String buttonPilih = "//body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[3]/div[2]/div/div/div/div/table/tbody/tr/td[6]/button/span";
    public static String inputNoSp3 = "//body/div/div/div[2]/div[2]/div/span/div/div[4]/div/input";
    public static String officeOption = "(//select)[1]";
    public static String klikTahun = "(//div[@class='vdatetime-popup__year'])[1]";
    public static String klikBulan = "(//div[@class='vdatetime-popup__date'])[1]";
    public static String klikOk = "(//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm'])[1]";
    public static String inputPerihal = "//body/div/div/div[2]/div[2]/div/span/div/div[6]/div/textarea";
    public static String sp3Dokumen = "//body/div/div/div[2]/div[2]/div/span/div/div[7]/div/input";
    public static String klikKalenderBuatSP3 =         "//body/div/div/div[2]/div[2]/div/span/div/div[5]/div/input";
    public static String klikKalenderKirimSP3 =        "//body/div/div/div[2]/div[2]/div/span/div/div[8]/div/input";
    public static String klikKalenderTerimaSP3 =       "//body/div/div/div[2]/div[2]/div/span/div/div[9]/div/input";
    public static String klikKalenderSetujuSP3 =       "//body/div/div/div[2]/div[2]/div/span/div/div[10]/div/input";
    public static String klikKalenderPengembalianSP3 = "//body/div/div/div[2]/div[2]/div/span/div/div[12]/div/input";
    public static String buttonSimpan = "(//span[normalize-space()='Simpan'])[1]";
    public static String popUpOk = "(//button[normalize-space()='OK'])[1]";
    public static String pengirimanOption = "//body/div/div/div[2]/div[2]/div/span/div/span[1]/div/div/div/span/select";
    public static String tanggapanOption = "//body/div/div/div[2]/div[2]/div/span/div/span[2]/div/div/div/span/select";
    public static String pengembalianOption = "//body/div/div/div[2]/div[2]/div/span/div/span[3]/div/div/div/span/select";
    public static String sp3DokumenNasabah = "//body/div/div/div[2]/div[2]/div/span/div/div[11]/div/input";

    //Xpath untuk kontrak pembiayaan
    public static String kontrakPembiayaan = "//body/div[1]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/button/div";

    //Xpath untuk restrukturisasi
    public static String restrukturisasi = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[1]/button/div";
    public static String sp3Resched = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[1]/div/div[4]/button/div";
    public static String reschedLoan = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[1]/div/div[3]/button/div";
    public static String sp3Restruct = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[1]/div/div[1]/button/div";
    public static String restructLoan = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[1]/div/div[2]/button/div";

    //Xpath untuk transaksi
    public static String transaksi = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[3]/button/div";
    public static String debetManual = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[3]/div/div[2]/button/div";
    public static String pelunasan = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[3]/div/div[1]/button/div";

    //Xpath untuk simulasi
    public static String simulasi = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[2]/button/div";
    public static String simulasiHitung = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[2]/div/div[3]/button/div";
    public static String simulasiLunas = "//body/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[2]/div/div[2]/button/div";

    //Xpath untuk laporan
    public static String laporan = "//body/div/div/div[1]/div[3]/div/div[1]/button/div";
    public static String denominatifPembiayaan = "//body/div/div/div[1]/div[3]/div/div[1]/div/div[4]/button/div";
    public static String klikKalenderAwalDenominatif     = "//body/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/input";
    public static String klikKalenderAkhirDenominatif = "//body/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/input";
    public static String typeAkadOption = "//body/div/div/div[2]/div[2]/div/div/div[3]/div/span/select";
    public static String buttonOk = "//body/div[2]/div[2]/footer/button[2]";
    public static String tenor = "//body/div/div/div[2]/div[2]/div/div/div[4]/div/div/div/div/input";
    public static String proses = "//body/div/div/div[2]/div[2]/div/div/div[5]/div/button/span";
    public static String estimasiKol = "//body/div[1]/div/div[1]/div[3]/div/div[1]/div/div[1]/button/div";
    public static String historyAngsuran = "//body/div[1]/div/div[1]/div[3]/div/div[1]/div/div[2]/button/div";
    public static String nominatifByKontrak = "//body/div[1]/div/div[1]/div[3]/div/div[1]/div/div[5]/button/div";
    public static String nominatif = "//body/div[1]/div/div[1]/div[3]/div/div[1]/div/div[6]/button/div";
    public static String sistemInformasiDebitur = "//body/div/div/div[1]/div[3]/div/div[1]/div/div[3]/button/div";

    //Xpath untuk SP3 edit
    //public static String noSP3 = "//body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div/input";
    public static String klikAksi = "//body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[3]/td[10]/div";
    public static String pilihEdit = "/html/body/div[4]/div/div/div/a[1]";
    public static String pilihKembali = "/html/body/div[1]/div/div[2]/div[2]/div/span/div/div[13]/div/button[1]/span";

}
