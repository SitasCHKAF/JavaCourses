package ru.java.courses;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     *
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula(int x) {
        double y;
        y=Math.sqrt(13*x+13/x);
        x= (int) y;
        return x;
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {
        String UpName=fullName.toUpperCase();
        String [] massive = UpName.split(" ");
        String IN=massive [0];
        char cIN=IN.charAt(0);
        fullName= cIN+ ".";
        IN=massive[1];
        cIN=IN.charAt(0);
        fullName=fullName+cIN+ ".";
        IN=massive[2];
        cIN=IN.charAt(0);
        fullName=fullName+cIN+".";
        return fullName;
    }

}
