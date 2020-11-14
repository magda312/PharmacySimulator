public class Pharmacy {
    private Medicine[] availableMedicines = new Medicine[7];
    private int employeesCount = 4;

    Pharmacy() {
        availableMedicines[0] = new Medicine("ibuprofen",10,10,false);
        availableMedicines[1] = new Medicine("paracetamol",15,10,false);
        availableMedicines[2] = new Medicine("naproksen",20,10,true);
        availableMedicines[3] = new Medicine("diklofenak", 25, 150, false);
        availableMedicines[4] = new Medicine("ketoprofen", 15, 100, true);
        availableMedicines[5] = new Medicine("etofenamat", 50,30, false);
        availableMedicines[6] = new Medicine("metamiol", 12, 13,false);
    }

    Medicine[] getAvailableMedicines() {
        return availableMedicines;
    }

    int getEmployeesCount(){
        return employeesCount;
    }
}
