Ahmad Zaki Alfaruq_21343079

penjelasan yang dapat diambil ialah:
Penjelasan Source Code: Pada pertemuan 5 kita mempelajari tentang kelas scanner, kelas buffered reader, serta kelas joptionpane. perbedaan mendasar dari 3 kelas tersebut adalah scanner ketika inputan berbasis angka tidak perlu di konversikan, sedangkan buffered reader perlu di konversikan dahulu, lalu kalau joptionpane merupakan kelas yg berbasis gui graphic / tampilan dialog box, pemanggilan package : scanner = java.util.Scanner buffered reader = java.io.BufferedReader, java.io.InputStreamReader, java.io.IOException joptionpane = javax.swing.JOptionPane

deklarasi code : scanner > Scanner NamaScanner = new Scanner(System.in); buffered reader > BufferedReader NamaBufread = new BufferedReader(new InputStreamReader(System.in)); joptionpane > NamaVariable = JOptionPane.showInputDialog("Masukkan text") dan untuk menampilkan dialog message nya : JOptionPane.showMessageDialog(null, msg);

 Dan juga apabila tidak diclose ada pemberitahuan warning kuning, maka untuk menanggulangi masalahnya yaitu dengan cara lakukan : namaVariable.close; atau bisa juga dengan cara melakukan nya dengan metode try catch, karna pada catch sudah include IOException
