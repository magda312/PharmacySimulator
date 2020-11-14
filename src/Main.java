public class Main {
    public static void main(String args[]){
        Pharmacy pharmacy = new Pharmacy();
        System.out.println("Dzień dobry, dostępne leki to:");
        for(int i=0; i< pharmacy.getAvailableMedicines().length;i++){
            System.out.print("nazwa leku to: " + pharmacy.getAvailableMedicines()[i].getMedicineName() + ", ");
            System.out.print("cena: " + pharmacy.getAvailableMedicines()[i].getMedicinePrice() + ", ");
            System.out.print("rozmiar opakowania: " + pharmacy.getAvailableMedicines()[i].getMedicineSizeOfThePackage() + ", ");
            System.out.println("dostępność na receptę: " + pharmacy.getAvailableMedicines()[i].getIsMedicinePrescription());
            if(i< (pharmacy.getAvailableMedicines().length -1)) {
                System.out.println("kolejny lek");
            }
            else{
                System.out.println("Jaki jest Państwa wybór?");
            }

        }
        System.out.println("Liczba pracowników apteki: " + pharmacy.getEmployeesCount());
    }
}
