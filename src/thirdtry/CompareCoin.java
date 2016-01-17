package thirdtry;

public class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            System.out.println("Первая монета больше второй на " + delta);
        } else if (delta == 0) {
           System.out.println("Монеты имеют одинаковый диаметр");
        } else {
            System.out.println("Вторая монета больше первой на " + -delta);
        }
    }
}
