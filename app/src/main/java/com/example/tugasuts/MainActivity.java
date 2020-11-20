package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoFilm = new ArrayList<>();
    private ArrayList<String> namaFilm = new ArrayList<>();
    private ArrayList<String> infoFilm = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoFilm, namaFilm, infoFilm, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaFilm.add("The Invisible Guest (2016)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/6/6e/Contratiempo_poster.jpg");
        infoFilm.add("Film asal Spanyol ini mengangkat kisah pengungkapan misteri pembunuhan. Sebelum persidangan, sang pengacara meminta kliennya untuk memaparkan peristiwa kejadian secara terperinci. Tak disangka, ternyata kesaksiannya berujung pada kasus lain yang sengaja dia tutupi sekian lama. Menghadirkan double plot twist, kamu akan terheran-heran dengan ending-nya.");


        namaFilm.add("What Happened To Monday (2017)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/f/f2/What_Happened_to_Monday.png");
        infoFilm.add("Apakah kamu tertarik dengan isu populasi manusia? Jika iya, film ini tidak boleh kamu lewatkan. Kebijakan suatu negara yang melarang setiap keluarga memiliki lebih dari satu anak menjadi solusi untuk menghindari ledakan penduduk. Bertahan hidup dengan 6 saudara kembar identik lainnya menjadi sebuah tantangan tersendiri. Film besutan Tommy Wirkola ini akan membuatmu tertegun lama dari awal hingga akhir cerita. ");


        namaFilm.add("Gone Girl (2014)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/0/05/Gone_Girl_Poster.jpg");
        infoFilm.add("Dibintangi oleh Ben Affleck, film ini tidak akan mengecewakanmu. Hilangnya sang istri secara tiba-tiba membuat Nick meminta bantuan polisi untuk menguak kasusnya. Kamu akan diajak untuk mengumpulkan teka-teki misteri keberadaan Amy (Rosamund Pike). Setelah film berakhir, kamu akan dibuat tercengang dengan kenyataan peristiwa yang sesungguhnya.");


        namaFilm.add("Who Am I (2014)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/thumb/5/5c/Who_am_I_movie_poster.jpg/220px-Who_am_I_movie_poster.jpg");
        infoFilm.add("Berdurasi 105 menit, kamu akan dibawa ke dalam kehidupan para hacker. Penggambaran dunia maya secara visual memudahkan film ini bisa ditonton siapa saja. Tak hanya menceritakan kecanggihan teknologi, informasi tentang psikologi secara tersirat akan kamu dapatkan melalui film ini. Masuk beberapa nominasi bergengsi pada ajang penghargaan film di Jerman, kamu tidak perlu ragu untuk menontonnya.");


        namaFilm.add("Exam (2009)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/thumb/0/09/Exam_poster.jpg/220px-Exam_poster.jpg");
        infoFilm.add("Kolaborasi dari Simon Garrity dan Stuart Hazeldine berhasil merancang naskah film yang apik. Bergenre thriller psikologis, kamu akan dibuat geram selama film berlangsung. Bercerita tetang 8 orang melamar pekerjaan, mereka mengalami kesulitan dalam mengerjakan soal tes yang diberikan. Hanya kertas kosong dan pensil tanpa ada satu pertanyaan pun, mereka bekerja sama mencari cara untuk menyelesaikannya. Ternyata, jawaban dari tes tersebut benar-benar diluar dugaan!");


        namaFilm.add("Split (2017)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/3/31/Split_%282017_film%29.jpg");
        infoFilm.add("Sama halnya dengan Exam (2009), film thriller psiologis ini berceritakan tentan seorang pria berkepribadian ganda. Tidak hanya 2 kepribadian saja, Kevin (James McAvoy) hidup dengan 23 kepribadian di dalam tubuhnya. Penasaran dengan konflik yang dialaminya? Yuk, tonton segera untuk mendapatkan jawabannya.");


        namaFilm.add("Bad Genius (2017)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/thumb/9/93/Chalard_Games_Goeng_theatrical_poster.jpg/220px-Chalard_Games_Goeng_theatrical_poster.jpg");
        infoFilm.add("Selain A Little Thing Called Love (2010) dan Friend Zone (2019), film Thailand ini patut masuk dalam list tontonanmu. Mengisahkan dua orang jenius yang berniat melakukan kecurangan dalam ujian masuk Universitas bergengsi di Amerika, mereka bekerja sama untuk melakukan bisnis kotor. Demi mendapatkan uang yang banyak sehingga bisa hidup dengan layak menjadi motif utama mereka memberikan contekan berskala internasional. Aksi keduanya dijamin bikin deg-deg an!");


        namaFilm.add("Searching (2018)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b8/Searching.png/220px-Searching.png");
        infoFilm.add("David Kim (John Cho) merasa terpukul saat putri semata wayangnya, Margot (Michelle La) tiba-tiba tidak memberiya kabar. Dia tergerak melakukan investigasi sendiri untuk memudahkan polisi menemukan jejak anaknya. Beragam spekulasi muncul ketika dia membuka isi laptopnya. Di saat yang sama, dia akhirnya tersadar bahwa anaknya tidak pernah baik-baik saja seperti yang dipikirkannya. Tidak terduga, tersangka dibalik menghilangnya Margot adalah seseorang yang dia percaya.");


        namaFilm.add("Final Girl (2014)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/thumb/9/9c/Final_Girl_Updated_Poster.jpg/220px-Final_Girl_Updated_Poster.jpg");
        infoFilm.add("Apakah kamu familier dengan permainan truth or dare? Nah, film ini berkisah tentang sekelompok pemuda yang sering melakukan pembunuhan terhadap beberapa gadis cantik melalui truth or dare. Namun, Veronica (Abigail Breslin) berhasil memberikan perlawanan untuk memutuskan rantai pembunuhan ini. Simak cerita lengkapnya di situs film legal langgananmu, ya!");


        namaFilm.add("Mother! (2017)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/9/94/Mother%212017.jpg");
        infoFilm.add("Jennifer Lawrence tidak pernah gagal membuat penonton terkesima. Berperan sebagai seorang istri penyair, dia berjuang untuk menyelamatkan rumah dan bayi yang sedang dikandungnya. Dipenuhi banyak metafora membuat film ini harus ditonton lebih dari sekali untuk memahami pesan tentang isu sosial, moral dan religius.");



        namaFilm.add("Don't Breathe (2016)");
        fotoFilm.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Don%27t_Breathe_%282016_film%29.png/220px-Don%27t_Breathe_%282016_film%29.png");
        infoFilm.add("Bagi kamu yang tertarik memacu adrenalin, film produksi Sony Pictures ini bisa jadi referensimu. Aksi tiga pencuri yang berniat menguras harta pria tuna netra ternyata tak semulus rencana semula. Alih-alih takut, pria tua ini malah melakukan perlawanan kejam pada perampok tersebut. Sebelum menonton film ini, pastikan jantungmu siap berdegup kencang, ya.");


        prosesRecyclerViewAdapter();

    }
}