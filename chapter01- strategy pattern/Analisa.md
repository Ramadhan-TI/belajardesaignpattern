# Analisa Strategy

# Abstraksi:
      -Kelas abstrak Duck menyediakan kerangka kerja umum untuk semua bebek. Metode display() dideklarasikan sebagai abstrak karena tidak ada implementasi yang umum untuk semua bebek. Ini memungkinkan kelas turunan untuk memberikan implementasi yang sesuai sesuai dengan jenis bebek tertentu.
      -Metode quack(), swim(), dan fly() didefinisikan dengan implementasi default di kelas abstrak Duck, tetapi mereka dapat diubah atau diperluas oleh kelas turunan sesuai kebutuhan.

# Polimorfisme:
      -Konsep polimorfisme muncul melalui penggunaan metode abstrak display() dan penggantian metode quack() dan fly() dalam beberapa kelas turunan.
MallardDuck, RedheadDuck, RubberDuck, dan WoodenDuck semua adalah turunan dari kelas Duck, sehingga mereka dapat digunakan secara polimorfik sebagai objek Duck.
Metode quack() di-override dalam RubberDuck untuk mengubah perilaku bebek karet agar menghasilkan suara yang berbeda, menunjukkan polimorfisme metode.
Metode fly() di-override dalam RubberDuck dan tidak diimplementasikan dalam WoodenDuck dan RubberDuck, menunjukkan bahwa perilaku terbang bisa berbeda atau bahkan tidak ada untuk setiap jenis bebek.

# Perbedaan perilaku:
      -Masing-masing kelas turunan memberikan perilaku yang berbeda sesuai dengan jenis bebek yang mereka wakili. Contohnya, bebek karet (RubberDuck) tidak dapat terbang dan menghasilkan suara yang berbeda dari bebek lainnya, sedangkan bebek kayu (WoodenDuck) tidak bisa bersuara atau terbang.

# Penggunaan @Override:
      -Penggunaan anotasi @Override menandakan bahwa metode tersebut diambil dari kelas induk dan diubah dalam kelas turunan. Ini membantu meningkatkan kejelasan dan memastikan bahwa metode tersebut sebenarnya adalah override, bukan definisi baru.

# Komentar di dalam kode:
      -Komentar digunakan untuk menjelaskan alasan di balik tidak adanya implementasi atau perilaku yang berbeda pada beberapa metode dalam kelas turunan. Ini meningkatkan pemahaman pengembang terhadap kode.
