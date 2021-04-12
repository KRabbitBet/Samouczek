package com.company;

//Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia.

public class Temperatura {
        public static void main(String... args) {

            int naPlusieTemperatura = 18;
            int naMinusieTemperatura = -30;

            isTemperaturePositive(naPlusieTemperatura);
            isTemperaturePositive(naMinusieTemperatura);
        }

        private static boolean isTemperaturePositive(int temperature) {
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

