package Elections.Precinct;

import Elections.Voter.Voter;

import java.util.List;

public class Precinct {
    private int index;
    private String address;
    private List<Voter> acceptedVoter;
    private double proportionOfVoter;
    private PrecinctType typeOfPrecinct;

    public Precinct(int index, String address, List<Voter> acceptedVoter, double proportionOfVoter, PrecinctType typeOfPrecinct) {
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

    public PrecinctType getTypeOfPrecinct() {
        return typeOfPrecinct;
    }

    public void setTypeOfPrecinct(PrecinctType typeOfPrecinct) {
        this.typeOfPrecinct = typeOfPrecinct;
    }

    @Override
    public String toString() {
        return "\n" +
                "╔═ Precinct index: " + index + "\n" +
                "╠═ Address: '" + address + '\'' + "\n" +
//                "╠═ AcceptedVoter: " + acceptedVoter + "\n" +
                "╠═ Proportion Of Voter: " + proportionOfVoter + "\n" +
                "╚═ Type Of Precinct: '" + typeOfPrecinct + '\'' + "\n";
    }
}
