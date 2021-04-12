package com.company;

//Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia.

public class Temperatura {
        public static void main(String... args) {
//UWAGA: nazwy zmiennych i klas piszemy po angielsku
            int naPlusieTemperatura = 18;
            int naMinusieTemperatura = -30;

            isTemperaturePositive(naPlusieTemperatura);
            isTemperaturePositive(naMinusieTemperatura);
//        czy temperatura jest zawsze liczbą całkowitą?
        }
// co daje nam typ tej metody skoro nigdzie go nie wykorzystujemy?
        private static boolean isTemperaturePositive(int temperature) {
//            to można wrzucić do ifa, nie jest to duże wyrażenie i nie zepsuje czytelności kodu
            boolean isPositive = temperature > 0;

            if (isPositive) {
                System.out.println("Temperatura " + temperature + " jest na plusie.");
            }
            else {
                System.out.println("Temperatura " + temperature + " nie jest na plusie.");
            }

            return isPositive;
        }
    }

