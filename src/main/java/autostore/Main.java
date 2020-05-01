package autostore;

public class Main {
    public static void main(String[] args) throws TooBigCarException {

        AutoStore autoStore = new AutoStore();

        Mercedes mercedes = new Mercedes("Mercedes E190", 1000000, 1200, 1700, 3500);
        Mercedes mercedes2 = new Mercedes("Mercedes s350", 5000000, 1800, 2000, 3300);
        Mercedes mercedes3 = new Mercedes("Mercedes e550", 3500000, 1300, 1900, 3800);
        Pontiak pontiak = new Pontiak("Pontiak Chief", 500000, 1100, 1500, 2000);
        Pontiak pontiak2 = new Pontiak("Pontiak Bang", 1500000, 1700, 1800, 3000);
        Pontiak pontiak3 = new Pontiak("Pontiak Dragonfly", 150000, 1000, 2100, 1800);
        Kandibobr kandibobr = new Kandibobr("Kandibobr TYR", 2000000, 1200, 2050, 4100);
        Kandibobr kandibobr2 = new Kandibobr("Kandibobr Topper", 2100000, 1500, 2100, 5000);

        try {
            System.out.println(mercedes.getModel() + " is at the showstage");
            autoStore.addCar(mercedes);
            System.out.println(mercedes2.getModel() + " is at the showstage");
            autoStore.addCar(mercedes2);
            System.out.println(mercedes3.getModel() + " is at the showstage");
            autoStore.addCar(mercedes3);
            System.out.println(pontiak.getModel() + " is at the showstage");
            autoStore.addCar(pontiak);
            System.out.println(pontiak2.getModel() + " is at the showstage");
            autoStore.addCar(pontiak2);
            System.out.println(pontiak3.getModel() + " is at the showstage");
            autoStore.addCar(pontiak3);
            System.out.println(kandibobr.getModel() + " is at the showstage");
            autoStore.addCar(kandibobr);
            System.out.println(kandibobr2.getModel() + " is at the showstage");
            autoStore.addCar(kandibobr2);

        } catch (OutOfSpaceException e) {
            System.out.println("Too  much cars allready! The store is full! \n");
        }

        autoStore.printList();
    }

}
