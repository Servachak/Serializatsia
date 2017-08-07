import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Клас який буде читати обєкти
 */
public class ReadObject {

    public static void main(String[] args) {
        try {
            /** Читаємо з файлу  байти**/
            FileInputStream inputStream = new FileInputStream("MyPerson.bin");


            /** Передаємо ці байти **/
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            /**Обовязково!!!
             * метод readObject() повертає батькя всіх класів в джаві - Object
             * Приводимо до DAUN CASTING типу наш обєкт оскільки з класу Object повертається Object, а не Person**/
            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();

            /** Виводимо наші обєкти на екран**/
            System.out.println(person1);
            System.out.println(person2);
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
