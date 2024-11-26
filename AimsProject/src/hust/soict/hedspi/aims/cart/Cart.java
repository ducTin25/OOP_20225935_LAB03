public class Cart 
{
    public static final int MAX_NUMBERS_ORDERED = 20;   
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;     

    public int addDigitalVideoDisc(DigitalVideoDisc disc) 
    {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
        System.out.println("The cart is almost full. Can't add more díc");
        return 0;
        } else 
        {
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered ++;
        System.out.println("The disc has been added");
        return 1;
        }
    }
    /*public int addDigitalVideoDisc(DigitalVideoDisc[] discList) 
    {
        int added = 0;
        for (DigitalVideoDisc disc : dvdList){
            if (qtyOrdered == MAX_NUMBERS_ORDERED){
                System.out.println("The cart is almost full");
                break;
            }
            else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added");
                added++;
            }
        }
        return added;
    }*/
    public int addDigitalVideoDisc(DigitalVideoDisc... dvdArray) 
    {
        int addCount = 0;
        for (DigitalVideoDisc disc : dvdArray) 
        {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) 
            {
            System.out.println("The cart is almost full.");
            break;
            } else 
            {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            addCount++;
            }
        }
        return addCount;
    }
    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) 
    {
        if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) 
        {
        System.out.println("The cart is almost full. Can't add more discs");
        return 0;
        } else 
        {
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        System.out.println("The DVD " + '\"' + dvd1.getTitle() + '\"' + " has been added!");
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println("The DVD " + '\"' + dvd2.getTitle() + '\"' + " has been added!");
        return 2; 
        }
    }


    public int removeDigitalVideoDisc(DigitalVideoDisc disc) 
    {
        if(itemsOrdered[0] ==  null) {
        System.out.println("Your cart is empty!");
        return 0;
        }
        for(int i = 0; i < qtyOrdered;i++) 
        {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD successfully!");
                return 1;
            }
        }
        System.out.println("No DVD match!");
        return 0;
    }

    public float totalCost() {
        float sum = 0.00f;
        for(int i =0;i< qtyOrdered;i++) 
        {
        sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    /*public void print() 
    {
        StringBuilder output = new StringBuilder("\n");
        for (int i = 0; i < qtyOrdered; i++)
        {
            output
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        System.out.println(output);
    }
}*/
    public void print() {
        System.out.println("");
        System.out.println("Ordered items:");
    
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc item = itemsOrdered[i];
            System.out.printf("%d.[%s] - [%s] - [%s] - [%d]: %.2f $\n", 
            i+1, 
            item.getTitle(), 
            item.getCategory(), 
            item.getDirector(), 
            item.getLength(), 
            item.getCost()
        );
    }
    
    System.out.printf("Total cost: %.2f $\n", totalCost());
    System.out.println("");
}
}