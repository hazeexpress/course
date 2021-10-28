package Elections;

public class Voter {
    private String name;
    private int passportNumber;
    private int identificationNumber;
    private int yearOfBirth;
    private int precinct;
    private boolean ifMilitary;
    private boolean ifOnQuarantine;

    public Voter(String name, int passportNumber, int identificationNumber, int yearOfBirth, int precinct, boolean ifMilitary, boolean ifOnQuarantine) {
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

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
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
        return "Voter {" +
                "name='" + name + '\'' +
                ", passportNumber=" + passportNumber +
                ", identificationNumber=" + identificationNumber +
                ", yearOfBirth=" + yearOfBirth +
                ", precinct=" + precinct +
                ", ifMilitary=" + ifMilitary +
                ", ifOnQuarantine=" + ifOnQuarantine +
                '}';
    }
}
