// 46 страница
package chapter1;

public class Code1 {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "крутой", "взаимный"};
        String[] wordListTwo = {"чистый продукт", "центральный", "сетевой"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "тип структуры"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        System.out.println(wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]);
    }
}
