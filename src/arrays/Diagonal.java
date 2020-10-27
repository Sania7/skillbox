package arrays;

public class Diagonal {
    public static void main(String[] args) {
        int n = 9; // создаем переменную;
        String[][] matrix = new String[n][n]; //создаем массив matrix размером n x n где n = 9;
        for (int x = 0; x < n; x++) { //проходим циклом по строкам
            for (int y = 0; y < n; y++) { //проходим циклом по колонкам
                if (y == x || y == n - 1 - x) { //делаем проверку если это (y == x || y == n - 1 - x)
                    matrix[x][y] = "x"; // то индекс matrix[x][y] = "x"
                } else { // еще
                    matrix[x][y] = " "; // индекс равен " "
                }
            }
        }
        for (int x = 0; x < n; x++) { // проходим по строкам
            for (int y = 0; y < n; y++) { // проходим пр колонкам
                System.out.print(matrix[x][y]); // выводим в печать без переноса строки
            }
            System.out.println(); // вот этот момент не совсем понятен, понятно что это вывод в печать,перенос на новую
            // строку и все, а как работает не совсем понятно...
        }
    }
}