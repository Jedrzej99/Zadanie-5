public class Human {
    String Name;
    String Surname;
    private Car car;
    private Double salary = 0.0;

    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Na koncie nie moze byc ujemna wartosć");
        } else {
            System.out.println("Wysyłanie nowych danych do systemu księgowości");
            System.out.println("Koniecznośc odebrania umowy w kadrach");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
        }
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            System.out.println("Udało się kupić samochod");
            this.car = newCar;
        } else if (this.salary > (newCar.value) / 12) {
            System.out.println("Udało się kupić samochód");
            this.car = newCar;
        } else {
            System.out.println("Nie masz wystarczająco pieniędzy");
        }
    }
}