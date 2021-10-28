package Elections;

import java.util.Date;
import java.util.List;

public class Party {
    private String name;
    private Enum fraction;
    private Date dateOfCreatingParty;
    //private List candidates;

    public Party(String name, FractionType fraction, Date dateOfCreatingParty/*, List candidates*/) {
        this.name = name;
        this.fraction = fraction;
        this.dateOfCreatingParty = dateOfCreatingParty;
        //this.candidates = candidates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getFraction() {
        return fraction;
    }

    public void setFraction(Enum fraction) {
        this.fraction = fraction;
    }

    public Date getDateOfCreatingParty() {
        return dateOfCreatingParty;
    }

    public void setDateOfCreatingParty(Date dateOfCreatingParty) {
        this.dateOfCreatingParty = dateOfCreatingParty;
    }

   /* public List getCandidates() {
        return candidates;
    }

    public void setCandidates(List candidates) {
        this.candidates = candidates;
    }*/

    @Override
    public String toString() {
        return "Party {" +
                "name='" + name + '\'' +
                ", fraction=" + fraction +
                ", dateOfCreatingParty=" + dateOfCreatingParty +
                '}';
    }
}
