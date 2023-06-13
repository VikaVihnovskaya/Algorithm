package com.vicky;

//Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
//Фамилия Имя Отчество датарождения номертелефона пол
//
//Форматы данных:
//фамилия, имя, отчество - строки
//датарождения - строка формата dd.mm.yyyy
//номертелефона - целое беззнаковое число без форматирования
//пол - символ латиницей f или m.
//
//Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, бросить исключение, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
//
//Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
//
//Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
//
//<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
//
//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//
//Не забудьте закрыть соединение с файлом.
//
//При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки


public class Main {
    public static void main(String[] args) {
        HumanCreator humanCreator = new DefaultHumanCreator();
        try {

            Human human = humanCreator.create();
            System.out.println(human);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


//
//    public void write(String[] personData) {
//        try (FileWriter writer = new FileWriter(new File(personData[0] + ".txt"), true)) {
//            Human human = new Human(personData[0], personData[1], personData[2], personData[3], personData[4], personData[5]);
//            writer.write(human.toString());
//            writer.write("\n");
//            writer.flush();
//        } catch (IOException e) {
//            System.out.println("Ошибка файловой системы!!!");
//        }
//    }
//    public void read(String nameFile) throws NonExistedFileException {
//        try (BufferedReader buffer = new BufferedReader(new FileReader(nameFile + ".txt"))) {
//            String line;
//            while ((line = buffer.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            throw new NonExistedFileException(nameFile);
//        } catch (IOException e) {
//            System.out.println("Ошибка файловой системы!!!");
//        }
//    }

    }
}

