package HomeWork;

public class Wives {
    String name;

    public Wives(String name) {
        this.name = name;
    }


    void findOutFate() {
        if (name == "Екатерина Арагонская") {
            System.out.println("Развелся");
        } else if (name == "Анна Болейн") {
            System.out.println("Казнил");
        } else if (name == "Джейн Сеймур") {
            System.out.println("Умерла");
        } else if (name == "Анна Клевская") {
            System.out.println("Развелся");
        } else if (name == "Екатерина Говард") {
            System.out.println("Казнил");
        } else if (name == "Екатерина Парр") {
            System.out.println("Пережила");
        }
    }
}
