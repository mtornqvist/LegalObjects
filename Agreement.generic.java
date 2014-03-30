import java.util.Date;

class Agreement { 
    public String version;           // Version of Agreement 
    public String author;            // Author of Agreement
    public Date signingDate;         // Date of Signing
    public Date effectiveDate;       // Date Agreement is Effective
  
    public String[] parties[];       // Parties to the Agreement  
  
    public String preamble = "TEST";
    public Section conventions;
    public String agreements;
    public String representations;
    public String warranties;
    public String covenants;
    public String termination;
    public String defaultevent;
    public String close_out;
    public String misc;
    public String law;
    public String courts;
  
    public String[] signatures[];
  
    public String[] Schedule[];
    
    public void Agreement (){
        this.preamble = preamble;
        this.conventions = conventions;}
}
  
class Section {
    public int number;
    public String heading;
    
    public void Section () {
        this.number = number;
        this.heading = heading;
    }
}
    
class Paragraph {
    public int number;
    public String language;
    
    public void Paragraph () {
        this.number = number;
        this.language = language;
    }
}
    
public class LegalObjects {
    public static void main(String[] args) {
        Agreement a = new Agreement ();
        String s = a.preamble;
        System.out.println(s);}
}
