

public class Aims
{
    public static void main(String[] args) 
    {
        Cart Order = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        Order.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        Order.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        Order.addDigitalVideoDisc(dvd3);
        Order.print();
        Order.removeDigitalVideoDisc(dvd2);
    }
}
