package com.company;

public class Car extends Transport {
    private String BodyType = "Sedan"; // тип кузова автомобиля (по умолчанию седан)
    private int FuelTankCapacity = 50; // вместительность топливного бака автомобиля (по умолчанию 50 л)
    private String driver = ""; //водитель автомобиля (по умолчанию нет)
    private String passengers [] = {" "}; //пассажиры автомобиля (по умолчанию нет)
    private String destination = ""; //место назначения автомобиля (по умолчанию нет)

    public String getBodyType() { //возвращает тип кузова автомобиля
        return BodyType;
    }

    public String getFuelTankCapacity() { //возвращает вместительность топливного бака автомобиля
        return FuelTankCapacity + " л";
    }

    String getUsers() { //возвращает водителя и пассажиров автомобиля
        String ans = "Driver: " + driver + ", Passengers: ";
        for (int i = 0; i < passengers.length; i++) {
            ans += passengers[i];
            if (i != passengers.length - 1) {
                ans += ", ";
            }
        }
        return ans;
    }

    String getDestination() { //возвращает пункт назначения автомобиля
        return destination;
    }

    public void setBodyType(String bodyType) { //изменяет тип кузова автомобиля
        BodyType = bodyType;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) { //изменяет вместительность топливного бака автомобиля
        FuelTankCapacity = fuelTankCapacity;
    }

    void setUsers(String driver, String passengers []) { //изменяет водителя и пассажиров автомобиля
        this.driver = driver;
        this.passengers = passengers;
    }

    void setDestination(String destination) { //изменяет пункт назначения автомобиля
        this.destination = destination;
    }

    public void OpenTheHood() { //открывает капот автомобиля
    }

    public void OpenTheTrunk() { //открывает багажник автомобиля
    }

    public void CloseTheHood() { //закрывает капот автомобиля
    }

    public void CloseTheTrunk() { //закрывает багажник автомобиля
    }
}
