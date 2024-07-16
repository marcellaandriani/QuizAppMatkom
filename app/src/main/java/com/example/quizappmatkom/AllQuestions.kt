package com.example.quizappmatkom

class AllQuestions {
    fun fetchData(): ArrayList<Questions> {
        val allQuestions = ArrayList<Questions>()
        val q1 = Questions(
            1,
            "Sebuah tim sepak bola mengklaim bahwa mereka telah memenangkan 20 pertandingan dalam satu musim. Pernyataan berikut ini manakah yang merupakan sebuah proposisi?",
            "Tim sepak bola A adalah yang terbaik.",
            "Tim sepak bola A memenangkan 20 pertandingan dalam satu musim.",
            "Tim sepak bola A seharusnya memenangkan lebih banyak pertandingan.",
            "Berapa banyak pertandingan yang dimenangkan tim sepak bola A?",
            2
        )
        val q2 = Questions(
            2,
            "Jika p adalah \"Saya menyelesaikan tugas matematika\" dan q adalah \"Saya menyelesaikan tugas fisika.\"\n\n Manakah dari pernyataan berikut yang benar mengenai konjungsi p dan q? \n"
            ,
            "Saya menyelesaikan tugas matematika atau saya menyelesaikan tugas fisika.",
            "Saya menyelesaikan tugas matematika dan saya menyelesaikan tugas fisika.",
            "Jika saya menyelesaikan tugas matematika, maka saya menyelesaikan tugas fisika.",
            " Saya menyelesaikan tugas matematika atau saya tidak menyelesaikan tugas fisika.",
            2,
        )
        val q3 = Questions(
            3,
            "Jika p adalah \"Hari ini hujan\" dan q adalah \"Saya membawa payung\"\n\n Manakah pernyataan yang merupakan bentuk dari implikasi?",
            "Jika hari ini tidak hujan, maka saya tidak membawa payung.",
            "Saya membawa payung jika dan hanya jika hari ini hujan.",
            "Jika hari ini hujan, maka saya membawa payung.",
            "Saya membawa payung atau hari ini hujan.",
            3
        )
        val q4 = Questions(
            4,
            "Jika p adalah \"Saya pergi kepasar\" dan q adalah \"Saya membeli buah\"\n\n Manakah pernyataan berikut yang merupakan proposisi majemuk?",
            "Saya pergi ke pasar dan saya membeli buah.",
            "Jika saya pergi ke pasar, maka saya membeli buah.",
            "Saya tidak pergi ke pasar atau saya membeli buah.",
            "Saya membeli buah.",
            1
        )
        val q5 = Questions(
            5,
            "Manakah pernyataan berikut yang benar mengenai ekivalensi logis antara p↔q?",
            "p↔q benar hanya jika p dan q keduanya benar atau keduanya salah.",
            "p↔q benar hanya jika pdan q salah.",
            "p↔q benar hanya jika p dan q benar.",
            "p↔q benar hanya jika p benar dan q salah ",
            1
        )
        val q6 = Questions(
            6,
            "Hitunglah A + B",
            "(3  2 \n    4  6)",
            "(3  2 \n    4  8)",
            "(1  2)\n    (3  4)",
            "(3  2)\n    (2  6)",
            1,
            R.drawable.img_matriks1
        )
        val q7 = Questions(
            7,
            "Hitunglah determinan dari matriks A",
            "-2",
            "2",
            "10",
            "-10",
            1,
            R.drawable.img_matriks2
        )
        val q8 = Questions(
            8,
            "Diberikan fungsi tujuan Z = 3x + 2y yang harus dimaksimalkan dengan kendala x + y ≤ 4, x ≥ 0, dan y ≥ 0. \n\n Manakah dari titik-titik berikut yang memberikan nilai maksimum untuk Z?",
            "(0, 4)",
            "(2, 2)",
            "(4, 0)",
            "(1, 3)",
            2
        )
        val q9 = Questions(
            9,
            "Diberikan fungsi tujuan Z = x + 2y yang harus dimaksimalkan dengan kendala x + y ≤ 5, x,y ≥ 0, dan x,y adalah bilangan bulat. \n\nManakah dari titik-titik berikut yang memberikan nilai maksimum untuk Z? ",
            "(0, 5)",
            "(5, 0)",
            "(2, 3)",
            "(3, 2)",
            4
        )
        val q10 = Questions(
            10,
            "Suatu perusahaan memiliki tiga pabrik dan dua gudang. Jumlah produksi di ketiga pabrik adalah 20, 30, dan 25 unit, sementara permintaan di dua gudang masing-masing adalah 35 dan 40 unit. Biaya pengangkutan per unit dari pabrik ke gudang adalah seperti gambar diatas. \n\n Manakah alokasi yang meminimalkan total biaya pengangkutan?",
            "20 unit dari Pabrik 1 ke Gudang 1, 30 unit dari Pabrik 2 ke Gudang 2, 10 unit dari Pabrik 3 ke Gudang 1, dan 15 unit dari Pabrik 3 ke Gudang 2",
            "20 unit dari Pabrik 1 ke Gudang 1, 30 unit dari Pabrik 2 ke Gudang 1, dan 25 unit dari Pabrik 3 ke Gudang 2",
            "20 unit dari Pabrik 1 ke Gudang 2, 30 unit dari Pabrik 2 ke Gudang 1, dan 25 unit dari Pabrik 3 ke Gudang 2",
            "20 unit dari Pabrik 1 ke Gudang 1, 30 unit dari Pabrik 2 ke Gudang 2, dan 25 unit dari Pabrik 3 ke Gudang 1",
            1,
            R.drawable.img_transportation
        )
        allQuestions.add(q1)
        allQuestions.add(q2)
        allQuestions.add(q3)
        allQuestions.add(q4)
        allQuestions.add(q5)
        allQuestions.add(q6)
        allQuestions.add(q7)
        allQuestions.add(q8)
        allQuestions.add(q9)
        allQuestions.add(q10)

        return allQuestions
    }
}