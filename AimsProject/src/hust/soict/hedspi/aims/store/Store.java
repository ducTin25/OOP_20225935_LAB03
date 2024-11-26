import java.util.ArrayList;
public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    private boolean checkDVD(DigitalVideoDisc disc) {
        return itemsInStore.contains(disc);
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println(disc.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no " + disc.getTitle() + " in the store !");
        }
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println(disc.getTitle() + " 've been added to the store !");
        } else {
            System.out.println(disc.getTitle() + " 'already exists in the store !");
        }
    }
}