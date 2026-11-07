import java.util.Random;

public class WordBank {
    private static final String[][] WORD_DATA = {
            {"RUMAH", "Tempat tinggal manusia."},
            {"PINTU", "Digunakan untuk masuk dan keluar ruangan."},
            {"DAPUR", "Tempat untuk memasak di rumah."},
            {"KURSI", "Perabot yang digunakan untuk duduk."},
            {"GELAS", "Wadah untuk minum."},
            {"KAMUS", "Buku yang berisi arti kata."},
            {"KABEL", "Penghantar listrik berlapis pelindung."},
            {"KUNCI", "Digunakan untuk membuka atau mengunci pintu."},
            {"SABUN", "Digunakan untuk membersihkan tubuh atau benda."},
            {"KORAN", "Media cetak yang berisi berita."},
            {"OBENG", "Alat untuk memutar sekrup."},
            {"GARPU", "Alat makan dengan beberapa gigi."},
            {"PISAU", "Alat tajam untuk memotong."},
            {"BAKUL", "Wadah anyaman untuk membawa barang."},
            {"TIKAR", "Alas untuk duduk atau tidur di lantai."},
            {"KAPUR", "Benda untuk menulis di papan tulis."},
            {"KIPAS", "Alat untuk menghasilkan angin."},
            {"RADIO", "Alat untuk mendengarkan siaran suara."},
            {"TERAS", "Bagian depan rumah yang terbuka."},
            {"KERAN", "Alat untuk mengatur aliran air."},

            {"HUTAN", "Daerah yang banyak ditumbuhi pohon."},
            {"BUNGA", "Bagian tumbuhan yang indah dan berwarna."},
            {"PASIR", "Butiran kecil yang banyak ditemukan di pantai."},
            {"JAMUR", "Tumbuhan yang sering tumbuh di tempat lembap."},
            {"KEBUN", "Lahan untuk menanam tanaman."},
            {"ANGIN", "Udara yang bergerak."},
            {"BULAN", "Benda langit yang terlihat pada malam hari."},
            {"SERAI", "Tanaman beraroma yang sering menjadi bumbu masak."},
            {"KABUT", "Kumpulan uap air yang menghalangi pandangan."},
            {"PETIR", "Kilat yang muncul saat hujan."},
            {"RIMBA", "Hutan yang lebat."},
            {"OMBAK", "Gelombang air laut."},
            {"TELUK", "Bagian laut yang menjorok ke daratan."},
            {"EMBUN", "Titik air yang muncul pada pagi hari."},
            {"FLORA", "Kelompok tumbuhan di suatu wilayah."},
            {"SENJA", "Waktu menjelang malam."},
            {"SIANG", "Waktu antara pagi dan sore."},
            {"TERIK", "Keadaan panas karena sinar matahari."},
            {"SEJUK", "Keadaan udara yang terasa nyaman dan dingin."},
            {"TEDUH", "Tidak terkena sinar matahari langsung."},

            {"TIKUS", "Hewan kecil yang sering tinggal di rumah atau gudang."},
            {"ZEBRA", "Hewan mirip kuda dengan belang hitam putih."},
            {"MERAK", "Burung dengan ekor indah dan berwarna."},
            {"BELUT", "Hewan air yang bentuknya panjang dan licin."},
            {"LEBAH", "Serangga penghasil madu."},
            {"SEMUT", "Serangga kecil yang hidup berkelompok."},
            {"UDANG", "Hewan air bercangkang yang sering dimakan."},
            {"KEONG", "Hewan bercangkang yang bergerak lambat."},
            {"ELANG", "Burung pemangsa yang terbang tinggi."},
            {"RUBAH", "Hewan liar yang dikenal cerdik."},
            {"SINGA", "Hewan yang sering disebut raja hutan."},

            {"JERUK", "Buah yang rasanya manis atau asam."},
            {"KURMA", "Buah manis yang sering dimakan saat berbuka puasa."},
            {"LEMON", "Buah kuning dengan rasa asam."},
            {"MELON", "Buah dengan daging berair dan manis."},
            {"BAKSO", "Makanan berbentuk bulat yang biasa disajikan berkuah."},
            {"KECAP", "Bumbu cair berwarna gelap dan manis atau asin."},
            {"SIRUP", "Minuman manis yang dicampur dengan air."},
            {"BERAS", "Bahan makanan utama sebelum dimasak menjadi nasi."},
            {"SELAI", "Olesan manis untuk roti."},
            {"KETAN", "Jenis beras yang lengket setelah dimasak."},
            {"PEDAS", "Rasa yang biasanya berasal dari cabai."},
            {"MANIS", "Rasa seperti gula."},
            {"GURIH", "Rasa makanan yang enak dan kaya."},
            {"SEGAR", "Keadaan yang terasa baru dan menyenangkan."},
            {"ASING", "Rasa makanan yang mengandung banyak garam."},
            {"LEZAT", "Rasa makanan yang sangat enak."},

            {"MOBIL", "Kendaraan beroda empat."},
            {"RUANG", "Bagian atau tempat di dalam bangunan."},
            {"HOTEL", "Tempat menginap bagi para tamu."},
            {"LOKET", "Tempat membeli tiket atau membayar layanan."},
            {"HALTE", "Tempat bus berhenti untuk menaikkan penumpang."},
            {"PERON", "Tempat penumpang menunggu kereta."},
            {"METRO", "Kereta cepat di dalam kota."},
            {"CANDI", "Bangunan bersejarah dari masa kerajaan."},
            {"KELAS", "Ruang belajar di sekolah."},
            {"MURID", "Orang yang belajar di sekolah."},
            {"UJIAN", "Kegiatan untuk mengukur pemahaman siswa."},
            {"TUGAS", "Pekerjaan yang harus diselesaikan."},
            {"JAWAB", "Memberikan respons terhadap pertanyaan."},
            {"TEKUN", "Rajin dan bersungguh-sungguh."},
            {"KERJA", "Melakukan suatu pekerjaan."},
            {"TULIS", "Membuat huruf atau kata."},
            {"HAPUS", "Menghilangkan tulisan atau gambar."},

            {"CERAH", "Keadaan langit saat tidak banyak awan."},
            {"GELAP", "Keadaan dengan sedikit atau tanpa cahaya."},
            {"HARUM", "Memiliki bau yang wangi."},
            {"CEPAT", "Melakukan sesuatu dengan tidak lambat."},
            {"HEBAT", "Sangat baik atau mengagumkan."},
            {"BAGUS", "Memiliki kualitas yang baik."},
            {"AKTIF", "Rajin melakukan kegiatan."},
            {"SEHAT", "Keadaan tubuh yang tidak sakit."},
            {"LEMAH", "Tidak kuat."},
            {"KULIT", "Lapisan terluar tubuh manusia."},
            {"LIDAH", "Indra untuk mengecap rasa."},
            {"JAKET", "Pakaian luar untuk tubuh bagian atas."},
            {"MERAH", "Warna seperti darah."},
            {"HIJAU", "Warna seperti daun."},
            {"PUTIH", "Warna seperti kapas."},
            {"HITAM", "Warna yang sangat gelap."}
    };

    private static final Random RANDOM = new Random();

    public static int getRandomIndex() {
        return RANDOM.nextInt(WORD_DATA.length);
    }

    public static String getWord(int index) {
        return WORD_DATA[index][0];
    }

    public static String getHint(int index) {
        return WORD_DATA[index][1];
    }

    public static int getTotalWords() {
        return WORD_DATA.length;
    }
}