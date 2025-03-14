# problem_solving_test

## 1. Deskripsi
Program ini mengecek apakah sebuah string yang terdiri dari bracket `{, }, [, ], (, )` memiliki keseimbangan yang benar.

## 2. Kompleksitas Algoritma isBalanced
Fungsi `isBalanced(s: String): String` memiliki **kompleksitas O(n)** karena:
- Setiap karakter dalam string hanya dibaca **sekali**.
- Operasi pada `ArrayDeque` (push/pop) memiliki kompleksitas **O(1)**.
- Karena kita hanya melakukan **satu iterasi linear**, maka total kompleksitasnya adalah **O(n)**.