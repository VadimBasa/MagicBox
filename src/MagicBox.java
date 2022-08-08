import java.util.Random;

public class MagicBox<T> {
    private int key;
    private T[] items;

    public MagicBox(int key) {
        this.key = key;
        //this.value = value;
        T[] items = (T[]) new Object[key];// добавляю массив для хранения значений в коробке
        this.items = items;
    }

    public T getValue() {
        return items[key - 1];//возврат последнего добавленного значения
    }

    public boolean add(T item) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {

            if (items[i] == null) {
                items[i] = item;
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    public T pick() throws RuntimeException {
        int countNull = 0;
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        for (T itemBox : items) {
            if (itemBox == null) {
                countNull += 1;
                throw new RuntimeException("Item is empty. You mast add " + countNull);
            }
        }
        return items[randomInt];
    }
}