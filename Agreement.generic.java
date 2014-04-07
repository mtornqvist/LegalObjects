import java.util.Date;
import java.util.Scanner;

class Agreement { 
    int i, np;
    String name;                // Name of Agreement
    String version;             // Version of Agreement 
    String author;              // Author of Agreement
    Date signingDate;           // Date of Signing
    Date effectiveDate;         // Date Agreement is Effective
  
    Party parties[];           // Parties to the Agreement  
  
    Section s[] = new Section[20];
    String sections[];
    
    String[] signatures[];
    String[] schedule[];
    
    Agreement (String n, String v, int np, String sections[]){
        int i;
        name = n;
        version = v;
        
        Party parties[] = new Party[np];
        
        for (i = 0; i < np; i++)
            parties[i] = new Party();
         
        for (i = 0; i < sections.length; i++)
            s[i] = new Section(sections[i]);
    }
}

class Party {
    String name;
    String address;
    String lei;
    String signatory;
    String signatoryTitle;
    
    Party () {}
} 

class Section {
    static int number = 0;
    String heading;
    
    Section () {
        number++;
    }
        
    Section (String h) {
        number++;
        heading = h;
    }
}

 class Paragraph {
    static int number = 0;
    String language;
    
    Paragraph () {
        number++;
        language = "bbbb";
    }
}

class LegalObjects {
    private final static Scanner scanner = new Scanner(System.in);    
    
    public static void main(String[] args) {
        int i;
        String sections[] = {"Preamble", "Agreements", "Representations", "Warranties", "Covenants", "Termination", "Events of default", "Close out", "Misc", "Law", "Courts"}; 
                
        System.out.print( "Name of the Agreement: " );
        String inputName = scanner.nextLine();
        
        System.out.print( "Number of Parties to Agreement: " );
        int inputNoParties = scanner.nextInt();
        
        Agreement a = new Agreement(inputName, "01", inputNoParties, sections);
        
        System.out.println(a.name);
        System.out.println(a.version);
        
        for (i=0; i < sections.length; i++)
        System.out.println(a.s[i].heading);
        
        System.out.println(Section.number);
        System.out.println(Paragraph.number);
    }
}
