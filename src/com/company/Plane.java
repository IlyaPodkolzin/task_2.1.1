package com.company;

public class Plane extends Transport {
    private int WingLength = 20; // длина крыла самолёта (по умолчанию 20 м)
    private String AirCompany = "Aeroflot"; // название аэрокомпании, владеющей самолётом (по умолчанию Aeroflot)
    private String staff [] = {"-"}; //персонал самолёта (по умолчанию никто)
    private String passengers [] = {"-"}; //пассажиры самолёта (по умолчанию никто)
    private String airport = ""; //аэропорт пункта назначения самолёта (по умолчанию нет)

    public String getWingLength() { //возвращает длину крыла самолёта
        return WingLength + " м";
    }

    public String getAirCompany() { //возвращает аэрокомпанию самолёта
        return AirCompany;
    }

    String getUsers() { //возвращает персонал и пассажиров самолёта
        String ans = "Staff: ";
        for (int i = 0; i < staff.length; i++) {
            ans += staff[i];
            if (i != staff.length - 1) {
                ans += ", ";
            }
        }
        ans += ", Passengers: ";
        for (int i = 0; i < passengers.length; i++) {
            ans += passengers[i];
            if (i != passengers.length - 1) {
                ans += ", ";
            }
        }
        return ans;
    }

    String getDestination() { //возвращает аэропорт назначения самолёта
        return airport;
    }

    public void setWingLength(int WingLength) { //изменяет длину крыла самолёта
        this.WingLength = WingLength;
    }

    public void setAirCompany(String AirCompany) { //изменяет аэрокомпанию самолёта
        this.AirCompany = AirCompany;
    }

    void setUsers(String[] staff, String[] passengers) { //изменяет персонал и пассажиров самолёта
        this.staff = staff;
        this.passengers = passengers;
    }

    void setDestination(String airport) { //изменяет аэропорт назначения самолёта
        this.airport = airport;
    }

    public void take_off() { //производит взлёт самолёта
    }

    public void land() { //производит посадку самолёта
    }
}
