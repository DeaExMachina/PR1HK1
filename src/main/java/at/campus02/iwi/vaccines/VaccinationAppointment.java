package at.campus02.iwi.vaccines;

public class VaccinationAppointment {
    public int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson,
                                  boolean workingInHealthSector, boolean workingInEducationSector,
                                  boolean baseRiskFactor){

        int riskClass = 0;

        riskClass += age / 10;

        if (majorIllness) {
            riskClass += 3;
        }

        if (contactOfPregnantPerson) {
            riskClass += 2;
        }

        if (workingInHealthSector) {
            riskClass += 2;
        }

        if (workingInEducationSector) {
            riskClass += 1;
        }

        if (baseRiskFactor) {
            riskClass += 1;
        }

        return riskClass;
    }

    public String[] calculateMonthAndVaccine (int age, int riskClass) {
        String[] erg = new String[2];

        switch (riskClass){
            case 0:
            case 1:
                erg[0] = "July";
                break;
            case 2:
            case 3:
                erg[0] = "June";
                break;
            case 4:
            case 5:
                erg[0] = "May";
                break;
            case 6:
                erg[0] = "April";
                break;
            case 7:
            case 8:
                erg[0] = "March";
                break;
            case 9:
                erg[0] = "February";
                break;
            default:
                erg[0] = "January";
                //for all the other cases (hier ab 10)
                break;
        }

        if (age >= 65 || age < 18) {
            erg[1] = "Pfizer";
        }
        else if (age >= 50) {
            erg[1] = "Moderna";
        }
        else {
            erg[1] = "AstraZeneca";
        }

        return erg;
    }
}
