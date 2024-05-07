# Analisa Character

  -Kelas Karakter (Character):
Mewakili objek yang akan dibangun menggunakan pola Builder.
Memiliki atribut-atribut seperti nama, tipe, kekuatan (strength), dan senjata.
Memiliki metode setter dan getter untuk mengatur dan mengambil nilai atribut.
Memiliki metode toString() untuk mencetak informasi karakter.
  -Builder Karakter (CharacterBuilder):
Bertanggung jawab untuk membangun objek Karakter.
Memiliki metode-metode untuk mengatur nilai atribut Karakter.
Metode-metode tersebut mengembalikan instance builder itu sendiri, sehingga memungkinkan pemanggilan metode berantai (method chaining).
Memiliki metode build() untuk mengembalikan instance Karakter yang telah selesai dibangun.
  -Direktur Karakter (CharacterDirector):
Singleton, sehingga hanya ada satu instance yang dapat dibuat.
Bertanggung jawab atas arah pembangunan objek Karakter.
Memiliki metode untuk membangun karakter pahlawan (hero) dan musuh (enemy), yang memanfaatkan builder Karakter untuk membuat dan mengkonfigurasi instansi Karakter dengan atribut yang sesuai.
  -Main Class (Main):
Pada metode main, instance Direktur Karakter (CharacterDirector) diambil dengan menggunakan metode getInstance().
Dengan memanfaatkan Direktur Karakter, karakter pahlawan dan musuh dibangun dengan cara yang sudah ditentukan, dan kemudian dicetak informasinya.

# Analisa Computer

  -Kelas Computer:
Mewakili objek Computer dengan atribut merek dan model.
Didefinisikan dengan konstruktor yang menerima merek dan model sebagai parameter.
Memiliki metode toString() untuk mencetak merek dan model dalam bentuk string.
  -Kelas ComputerSet:
Mewakili kumpulan (set) perangkat yang terkait dengan sebuah komputer.
Memiliki objek Computer serta beberapa perangkat tambahan seperti keyboard, mouse, speaker, dan monitor.
Menyediakan metode-metode setter dan getter untuk mengatur dan mendapatkan nilai dari atribut-atributnya.
  -Kelas ComputerSetBuilder:
Bertanggung jawab untuk membangun objek ComputerSet.
Memiliki metode-metode untuk mengatur nilai atribut-atribut ComputerSet.
Memiliki metode getResult() untuk mengembalikan hasil pembangunan ComputerSet.
Memiliki metode resetBuilder() untuk mengembalikan builder ke keadaan awal.
  -Kelas Mains:
Pada metode main, sebuah instance dari ComputerSetBuilder dibuat.
Spesifikasi dari sebuah ComputerSet dimasukkan menggunakan metode-metode builder.
Hasil pembangunan ComputerSet diperoleh dengan memanggil getResult().
Hasil ComputerSet kemudian dicetak untuk menampilkan spesifikasinya.

# Analisa Robot

  -Kelas Robot:
Merupakan kelas yang mewakili objek Robot dengan atribut-atribut seperti perisai (shield), pedang (sword), senjata (gun), dan chip otak (brainchip).
Menyediakan setter dan getter untuk setiap atributnya.
Memiliki metode toString() untuk mencetak informasi tentang atribut-atribut Robot.
  -Kelas RobotBuilder:
Bertanggung jawab untuk membangun objek Robot.
Memiliki metode-metode untuk mengatur nilai atribut-atribut Robot.
Metode-metode tersebut mengembalikan instance builder itu sendiri, sehingga memungkinkan pemanggilan metode berantai (method chaining).
Memiliki metode getResult() untuk mengembalikan hasil pembangunan Robot.
  -Kelas RobotDirector:
Merupakan kelas Singleton yang bertanggung jawab atas arah pembangunan objek Robot.
Memiliki metode-metode untuk membangun berbagai jenis Robot dengan spesifikasi yang berbeda.
Setiap metode memanggil builder untuk mengatur nilai atribut Robot sesuai dengan spesifikasi yang diinginkan.
  -Kelas Main:
Pada metode main, sebuah instance dari RobotDirector diambil dengan menggunakan metode getInstance().
Berbagai jenis Robot, seperti casual, intelligent, dan rere, dibangun menggunakan metode-metode yang disediakan oleh RobotDirector.
Setiap Robot kemudian dicetak untuk menampilkan spesifikasinya.


