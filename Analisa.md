# Analisa Observer

# Observer dan Observable Interface:
Interface Observer menyediakan metode receiveNotification() yang akan diimplementasikan oleh kelas yang ingin menerima pembaruan dari subjek tertentu.
Interface Observable menyediakan metode untuk menambahkan, menghapus, dan memberi tahu pelanggan tentang perubahan.

# Kelas User:
Kelas User adalah pengamat yang mengimplementasikan antarmuka Observer.
Metode receiveNotification() digunakan untuk menerima pemberitahuan dari Channel.
Metode subscribe() dan unsubscribe() memungkinkan pengguna untuk berlangganan atau berhenti berlangganan ke saluran tertentu.

# Kelas Channel:
Kelas Channel adalah subjek yang mengimplementasikan antarmuka Observable.
Metode addSubscriber() dan removeSubscriber() digunakan untuk menambahkan dan menghapus pengamat (user) dari daftar pelanggan.
Metode notifyUser() memberi tahu semua pelanggan tentang pembaruan baru pada saluran tersebut dengan mengirimkan pesan ke setiap pengamat.

# Hubungan antara User dan Channel:
Ketika sebuah User berlangganan ke Channel, ia ditambahkan ke daftar pelanggan pada Channel.
Ketika Channel memposting pembaruan, ia memberi tahu semua pelanggan dengan memanggil metode receiveNotification() pada setiap User.

# Pola Desain Observer:
Desain ini mengikuti pola Observer di mana subjek (Observable) dapat memiliki beberapa pengamat (Observer) yang mengamati perubahannya.
Pola ini memisahkan logika pemberitahuan dari logika objek yang diamati, sehingga subjek tidak perlu mengetahui detail dari setiap pengamatnya.
