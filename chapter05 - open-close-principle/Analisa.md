# Analisa

  - Antarmuka BookRepo: Menyediakan metode untuk mengambil buku berdasarkan kategori, penulis, tanggal rilis, dan semua buku.
  -	Kelas Book: Mewakili entitas buku dengan atribut kategori, penulis, harga, dan tanggal rilis.
  - Kelas BookReq: Mewakili permintaan pengelompokan buku dengan atribut jenis pengelompokan dan nilai pengelompokan.
  -	Antarmuka BookGroupStrategy: Menentukan strategi untuk mendapatkan ringkasan buku berdasarkan permintaan.
  -	Kelas BookSummary: Mewakili ringkasan buku dengan atribut nama kelompok, total buku, dan total harga buku.
  -	Kelas Konkret untuk Strategi Pengelompokan:
    BookSummaryByCategory: Mengelompokkan buku berdasarkan kategori.
    BookSummaryByReleasedDate: Mengelompokkan buku berdasarkan tanggal rilis.
    BookSummaryByAuthor: Mengelompokkan buku berdasarkan penulis.
  - Kelas BookRepoImpl: Implementasi BookRepo yang menyimpan data buku dan menyediakan metode untuk pengambilan buku.
  -	Kelas BookGroupFactory: Pabrik strategi yang membangun strategi pengelompokan yang tepat berdasarkan jenis pengelompokan.
  -	Kelas BookSummaryService: Layanan yang menggunakan pabrik strategi untuk mencetak ringkasan buku berdasarkan permintaan.
  -	Kelas Mainn: Kelas utama untuk demonstrasi penggunaan sistem ini.


