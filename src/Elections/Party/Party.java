package Elections.Party;

import Elections.Fraction.FractionType;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Party {
    private String name;
    private Enum fraction;
    private Date dateOfCreatingParty;
    //private List candidates;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

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
        return "\n" +
                "╔═ Party name: " + name  + "\n" +
                "╠═ Fraction: " + fraction + "\n" +
                "╚═ Date of creating: " + simpleDateFormat.format(dateOfCreatingParty) + "\n";
    }
}
