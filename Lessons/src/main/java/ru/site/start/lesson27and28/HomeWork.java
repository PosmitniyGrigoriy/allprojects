package ru.site.start.lesson27and28;

public class HomeWork {
    public static void main(String[] args) {
        Tiger2 t1 = new Tiger2();
        t1.eat("myaso");
        try {
            t1.drink("voda");
            try {
                t1.drink("pivo");
            } catch (NeVodaException ex) {
                System.out.println(ex.getMessage());
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    public NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {
    public NeVodaException(String message) {
        super(message);
    }
}

class Tiger2 {
    public void eat(String data) {
        if (!data.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + data);
        }
        System.out.println("Tigr est myaso");
    }
    public void drink(String data2) throws NeVodaException {
        if (!data2.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + data2);
        }
        System.out.println("Tigr pyet vodu");
    }
}

/**
 * Результат вывода:
 * Tigr est myaso
 * Tigr pyet vodu
 * Tigr ne pyet pivo
 * Eto inner finally block
 */
