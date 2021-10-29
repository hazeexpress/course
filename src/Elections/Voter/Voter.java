package Elections.Voter;

public class Voter {
    private String name;
    private String passportNumber;
    private long identificationNumber;
    private int yearOfBirth;
    private int precinct;
    private boolean ifMilitary;
    private boolean ifOnQuarantine;

    public Voter(String name, String passportNumber, long identificationNumber, int yearOfBirth, int precinct, boolean ifMilitary, boolean ifOnQuarantine) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.identificationNumber = identificationNumber;
        this.yearOfBirth = yearOfBirth;
        this.precinct = precinct;
        this.ifMilitary = ifMilitary;
        this.ifOnQuarantine = ifOnQuarantine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getPrecinct() {
        return precinct;
    }

    public void setPrecinct(int precinct) {
        this.precinct = precinct;
    }

    public boolean isIfMilitary() {
        return ifMilitary;
    }

    public void setIfMilitary(boolean ifMilitary) {
        this.ifMilitary = ifMilitary;
    }

    public boolean isIfOnQuarantine() {
        return ifOnQuarantine;
    }

    public void setIfOnQuarantine(boolean ifOnQuarantine) {
        this.ifOnQuarantine = ifOnQuarantine;
    }

    @Override
    public String toString() {
        return "\n" +
                "╔═ Voter name: '" + name + '\'' + "\n" +
                "╠═ Passport number: " + passportNumber + "\n" +
                "╠═ Identification Number: " + identificationNumber + "\n" +
                "╠═ Year of Birth: " + yearOfBirth + "\n" +
                "╠═ Precinct number: " + (precinct == 0 ? "Not attached to precinct." : precinct) + "\n" +
                "╠═ Military: " + (ifMilitary ? "Yes" : "No") + "\n" +
                "╚═ Is in quarantine: " + (ifOnQuarantine ? "Yes" : "No")  + "\n";
    }
}
