import java.io.*;

/**
 * Клас який буде записувати обєкти
 */


public class WriteObject  {

    /** В програмі може бути декілька методів Main**/
    public static void main(String[] args) {

        Person person1 = new Person(1,"Oleg");
        Person person2 = new Person(2,"Marta");

        try {
            /**Створюємо  обєкт для послідовної записі байтів в файл (ВІН ЗАПИСУЄ БАЙТИ)
             * Якщо файл "MyPerson.bin" не буде створений то вискочить виключення, саме тому працюємо в блоці try - catch**/
            FileOutputStream  outputStream = new FileOutputStream("MyPerson.bin") ;


            /**Створюємо обєкт для послідовної записі обєктів в файл (Тому що все обєкти: "Картинки, звуки, люди ...." )
             * Він приймає обєкт в байтах і записує їх в файл**/
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            /** Записуємо обєкти в файл "MyPerson.bin"
             * В Метод в якості аргументу передаємо наших Person ів**/
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);

            /**ОБОВЯЗКОВО!!!!!!!
             *  Закриваємо наш вхідний потік даних, накше нічого не запишеться **/
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
