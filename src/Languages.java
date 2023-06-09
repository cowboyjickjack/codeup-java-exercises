import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Languages {

    public static void main(String[] args) {

        ArrayList<CodingLanguage> codingLanguages = new ArrayList<>();

        CodingLanguage java = new CodingLanguage("Java", 1995, "Sun Microsystems");
        codingLanguages.add(java);

        CodingLanguage python = new CodingLanguage("Python", 1991, "Guido van Rossum");
        codingLanguages.add(python);

        CodingLanguage javascript = new CodingLanguage("JavaScript", 1995, "Netscape Communications Corporation");
        codingLanguages.add(javascript);

        CodingLanguage c = new CodingLanguage("C", 1972, "Dennis Ritchie");
        codingLanguages.add(c);

        CodingLanguage cPlusPlus = new CodingLanguage("C++", 1983, "Bjarne Stroustrup");
        codingLanguages.add(cPlusPlus);

        CodingLanguage go = new CodingLanguage("Go", 2009, "Google");
        codingLanguages.add(go);

        CodingLanguage swift = new CodingLanguage("Swift", 2014, "Apple Inc.");
        codingLanguages.add(swift);

        CodingLanguage rust = new CodingLanguage("Rust", 2010, "Mozilla Foundation");
        codingLanguages.add(rust);

        CodingLanguage kotlin = new CodingLanguage("Kotlin", 2011, "JetBrains");
        codingLanguages.add(kotlin);

        CodingLanguage ruby = new CodingLanguage("Ruby", 1995, "Yukihiro Matsumoto");
        codingLanguages.add(ruby);

        CodingLanguage php = new CodingLanguage("PHP", 1995, "Rasmus Lerdorf");
        codingLanguages.add(php);

        CodingLanguage objectiveC = new CodingLanguage("Objective-C", 1983, "Brad Cox");
        codingLanguages.add(objectiveC);

        CodingLanguage sql = new CodingLanguage("SQL", 1974, "IBM");
        codingLanguages.add(sql);

        CodingLanguage swiftObjectiveC = new CodingLanguage("Swift/Obj-C", 2014, "Apple Inc.");
        codingLanguages.add(swiftObjectiveC);

        CodingLanguage perl = new CodingLanguage("Perl", 1987, "Larry Wall");
        codingLanguages.add(perl);

        CodingLanguage groovy = new CodingLanguage("Groovy", 2003, "James Strachan");
        codingLanguages.add(groovy);

        CodingLanguage scala = new CodingLanguage("Scala", 2004, "Martin Odersky");
        codingLanguages.add(scala);

        CodingLanguage lua = new CodingLanguage("Lua", 1993, "Roberto Ierusalimschy");
        codingLanguages.add(lua);

        CodingLanguage r = new CodingLanguage("R", 1993, "Ross Ihaka and Robert Gentleman");
        codingLanguages.add(r);

        // This is what actually compiles them into an array
        ArrayList<CodingLanguage> languageArrayList = new ArrayList<>(List.of(java, python, javascript, c, cPlusPlus,
                go, swift, rust, kotlin, ruby, php, objectiveC, sql, swiftObjectiveC, perl, groovy, scala, lua, r));

        // Sorting by name, then date
        // two colons since you need it to REFERENCE the method, but not need to CALL on it
        languageArrayList.sort(Comparator.comparing(CodingLanguage::getName));
        languageArrayList.sort(Comparator.comparing(CodingLanguage::getCreatedDate));

        // Looping through to output the info from the Array
        for (CodingLanguage codingLanguage : languageArrayList){
            System.out.println("Language: " + codingLanguage.getName() + ", Creation Date: " + codingLanguage.getCreatedDate() + ", Creator: " + codingLanguage.getCreator());
        }


    }

}
