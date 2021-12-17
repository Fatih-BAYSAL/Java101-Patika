package SalaryCalculator;

public class Employee {
        String name;
        int salary;
        int workHours;
        int hireYear;
        int tax;
        int bonus;
        int total;
        int raise;


        Employee (String name, int salary, int workHours, int hireYear ) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
            this.total = this.salary;
            this.raise = 0;
            this.bonus = 0;
            this.tax = 0;
        }

        void tax () {
            if (salary < 1000) {
                this.tax = 0;
            }else if (salary > 1000) {
                this.tax = this.salary * 3 / 100;
                this.total -= this.tax;
            }
        }


        void bonus () {
            if (workHours > 40) {
                this.bonus = (workHours - 40) * 30;
                this.total += this.bonus;
            }else {
                this.bonus = 0;
                this.total += this.bonus;
            }
        }


        void  raiseSalary () {
            if ((2021 - hireYear) < 10) {
                this.raise = this.salary * 5 /100;

            }else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
                this.raise = this.salary * 10 / 100;

            }else if ((2021 - hireYear) > 19) {
                this.raise = this.salary * 15 / 100;
            }
        }


        void printInfo () {

            System.out.println("Adi : " + this.name);
            System.out.println("Maasi : " + this.salary);
            System.out.println("Calisma Saati : " + this.workHours);
            System.out.println("Baslangic Yili : " + this.hireYear);
            System.out.println("Maas Artisi : " + this.raise);
            System.out.println("Vergi : " + this.tax);
            System.out.println("Bonus : " + this.bonus);
            System.out.println("Vergi Ve Bonuslarla Birlikte Maas : " + this.total);
            System.out.println("Toplam Maas : " + (this.salary + this.raise));

        }
}
