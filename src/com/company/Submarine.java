package com.company;

public class Submarine extends Transport {
    private int max_depth = 3000; //максимальная глубина погружения субмарины (по умолчанию 3000 м)
    private int Autonomy = 120; //автономность плавания субмарины (по умолчанию 120 сут)
    private int depth = 0; //глубина нахождения субмарины (по умолчанию 0 м)
    private String crew[] = {" "}; //экипаж субмарины (по умолчанию нет)
    private String destination = ""; //пункт назначения субмарины (по умолчанию нет)

    public String getMax_depth() { //возвращает максимальную глубину погружения субмарины
        return max_depth + " м";
    }

    public String getAutonomy() { //возвращает автономность плавания субмарины
        return Autonomy  + " сут";
    }

    public String getDepth() { //возвращает глубину нахождения субмарины
        return depth  + " м";
    }

    public String getUsers() { //возвращает экипаж субмарины
        String ans = "Crew: ";
        for (int i = 0; i < crew.length; i++) {
            ans += crew[i];
            if (i != crew.length - 1) {
                ans += ", ";
            }
        }
        return ans;
    }

    public String getDestination() { //возращает пункт назначения субмарины
        return destination;
    }

    public void setMax_depth(int max_depth) { //изменяет максимальную глубину погружения субмарины
        this.max_depth = max_depth;
    }

    public void setAutonomy(int autonomy) { //изменяет автономность плавания субмарины
        this.Autonomy = autonomy;
    }

    public void setDepth(int depth) { //изменяет глубину нахождения субмарины
        this.depth = depth;
    }

    void setUsers(String crew[]) { //изменяет экипаж субмарины
        this.crew = crew;
    }

    void setDestination(String destination) { //изменяет пункт назначения субмарины
        this.destination = destination;
    }

    public boolean isYellowSubmarine() { //проверка на то, является ли субмарина Жёлтой
        return color == "yellow";
    }

    public void goDown(int n) { //опускается на глубину n метров
        if (depth + n > max_depth) {
            depth = max_depth;
        }
        else {
            depth += n;
        }
    }

    public void goUp(int n) { //поднимается на глубину n;
        if (depth - n < 0) {
            depth = 0;
        }
        else {
            depth -= n;
        }
    }
}
