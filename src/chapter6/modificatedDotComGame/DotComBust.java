package chapter6.modificatedDotComGame;


import java.util.ArrayList;

public class DotComBust {
    //   Объявляем и инициализируем переменные которые нам понадобятся
    private final DotCom dotCom = new DotCom();
    private final GameHelper helper = new GameHelper();
    private final ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;
    String result = "Мимо"; // Подразумеваем промах, пока не изменился результат

    private void setUpGame() {
//        Создадим 3 сайта, присвоим им имена и добавим в ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

//       Выводим краткие инструкции для пользователя.
        System.out.println("Ваша цель - потопить три сайта:");
        System.out.println("Pets.com , eToys.com , Go2.com");
//        System.out.println("Можно использовать ходы от 0 до " + helper.getGridSize() + "(A1, A2, A3...), количество строк: " + helper.getGridLength());
        System.out.println("Попытайтесь потопить из за минимальное количество ходов");
        System.out.println("Укажите одну из указанных ячеек:");
        for (int j = 0; j <  helper.getGridLength(); j++) {
            for (int i = 0; i <= helper.getGridSize() / helper.getGridLength(); i++) {
                System.out.print("" + helper.getAlphabet().charAt(j) + i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (DotCom dotComToSet : dotComsList) { // Повторяем с каждым объектом DotCom в списке
            ArrayList<String> newLocation = helper.placeDotCom(3); // Запрашиваем у вспомогательного объекта местонахождение сайтов
            dotComToSet.setLocationSells(newLocation); // Вызываем сеттер, что бы передать местонахождение сайтов полученные с помощью вспомогательного объекта
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) { // До тех пор пока список объектов DotCom не станет пустым
            String userGuess = helper.getUserInput("Сделайте ход:"); // Получаем пользовательский ввод
            dotCom.clearConsole();
            checkUserGuess(userGuess); // Вызываем наш метод checkUserGuess
        }
        finishGame(); // Вызываем метод finishGame
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++; // Инкрементируем количество попыток которые сделал пользователь


        for (DotCom dotComToTest : dotComsList) { // Повторяем это для всех объектов dotCom в списке
            result = dotComToTest.checkYourself(userGuess); // Просим DotCom проверить ход пользователя
            if (result.equals("Попал")) {
                break; // Преднамеренно заканчиваем цикл
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest); // Удаляем из списка потопленный сайт
                break;
            }
            if (result.equals("Вы уже попадали в эту ячейку")){
                numOfGuesses--;
                break;
            }

        }
        if (!result.equals("Потопил"))
        System.out.println(result);

    }

    private void finishGame() {
//        Выводим сообщение о том как пользователь прошел игру (Статистику)
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас " + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас много времени. " + numOfGuesses + "попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust(); // Создаем новый объект
        game.setUpGame(); // Говорим игровому объекту подготовить игру
        game.startPlaying(); // Говорим игровому объекту начать основной игровой цикл.
    }
}
