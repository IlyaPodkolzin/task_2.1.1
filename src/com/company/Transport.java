package com.company;

public class Transport {
    protected String name = "SomeTransport"; //имя транспорта (по умолчанию SomeTransport)
    protected String color = "black"; //цвет транспорта (по умолчанию чёрный)
    protected int price = 250000; //цена транспорта (по умолчанию 250000 рублей)
    protected int max_speed = 100; //максимальная скорость транспорта (по умолчанию 100 км/ч)
    private String users [] = {"-"}; //пользователи транспорта (по умолчанию никто)
    private String destination = ""; //пункт назначения (по умолчанию нет)

    public String getName() { //возвращает имя транспорта
        return name;
    }

    public String getColor() { //возвращает цвет транспорта
        return color;
    }

    public String getPrice() { //возвращает цену транспорта
        return price + " руб.";
    }

    public String getMax_speed() { //возвращает максимальную скорость транспорта
        return max_speed + " км/ч";
    }

    String getUsers() { //возвращает пользователей транспорта
        String ans = "Users: ";
        for (int i = 0; i < users.length; i++) {
            ans += users[i];
            if (i != users.length - 1) {
                ans += ", ";
            }
        }
        return ans;
    }

    String getDestination() { //возвращает пункт назначения транспорта
        return destination;
    }

    public void setName(String name) { //изменяет имя траснпорта
        this.name = name;
    }

    public void setColor(String color) { //изменяет цвет траснпорта
        this.color = color;
    }

    public void setPrice(int price) { //изменяет цену траснпорта
        this.price = price;
    }

    public void setMax_speed(int max_speed) { //изменяет максимальную скорость траснпорта
        this.max_speed = max_speed;
    }

    void setUsers(String a []) { //изменяет пользователей транспорта
        users = a;
    }

    void setDestination(String destination) { //изменяет пункт назначения транспорта
        this.destination = destination;
    }
}
