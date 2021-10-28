package Elections;

import java.util.List;

public class Precinct {
    private int index;
    private String address;
    private List<Voter> acceptedVoter;
    private double proportionOfVoter;
    private String typeOfPrecinct;

    public Precinct(int index, String address, List<Voter> acceptedVoter, double proportionOfVoter, String typeOfPrecinct) {
        this.index = index;
        this.address = address;
        this.acceptedVoter = acceptedVoter;
        this.proportionOfVoter = proportionOfVoter;
        this.typeOfPrecinct = typeOfPrecinct;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Voter> getAcceptedVoter() {
        return acceptedVoter;
    }

    public void setAcceptedVoter(List<Voter> acceptedVoter) {
        this.acceptedVoter = acceptedVoter;
    }

    public double getProportionOfVoter() {
        return proportionOfVoter;
    }

    public void setProportionOfVoter(double proportionOfVoter) {
        this.proportionOfVoter = proportionOfVoter;
    }

    public String getTypeOfPrecinct() {
        return typeOfPrecinct;
    }

    public void setTypeOfPrecinct(String typeOfPrecinct) {
        this.typeOfPrecinct = typeOfPrecinct;
    }

    @Override
    public String toString() {
        return "Precinct {" +
                "index=" + index +
                ", address='" + address + '\'' +
                ", acceptedVoter=" + acceptedVoter +
                ", proportionOfVoter=" + proportionOfVoter +
                ", typeOfPrecinct='" + typeOfPrecinct + '\'' +
                '}';
    }
}
