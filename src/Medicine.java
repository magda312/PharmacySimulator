public class Medicine {
    private String medicineName;
    private int medicinePrice;
    private int medicineSizeOfThePackage;
    private boolean isMedicinePrescription;


    Medicine(String medicineName, int medicinePrice, int medicineSizeOfThePackage, boolean isMedicinePrescription) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
        this.medicineSizeOfThePackage = medicineSizeOfThePackage;
        this.isMedicinePrescription = isMedicinePrescription;
    }

    String getMedicineName() {
        return this.medicineName;
    }

    int getMedicinePrice() {
        return this.medicinePrice;
    }

    int getMedicineSizeOfThePackage() {
        return this.medicineSizeOfThePackage;
    }

    boolean getIsMedicinePrescription() {
        return this.isMedicinePrescription;
    }

}