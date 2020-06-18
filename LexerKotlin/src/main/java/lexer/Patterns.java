package lexer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Patterns {

    public static final String[] VALUES_KEY =  new String[]{"as","break","class","continue","do","else",
            "false","for","fun","if","in","interface","is","null","object","package","return","super",
            "this","throw","true","try","typealias","typeof","val","var","when","while","by","catch","constructor",
            "delegate","dynamic","field","file","finally","get","import","init","param","property","receiver","set",
            "setparam","where","actual","abstract","annotation","companion","const","crossinline","data","enum",
            "expect","external","final","infix","inline","inner","internal","lateinit","noinline","open",
            "operator","out","override","private","protected","public","reified","sealed","suspend","tailrec",
            "vararg","field","it"};

    public static final Character[] VALUES_PUN = new Character[] {'-','+','=','{','}','[',']',';',':','"','<','>','?',',','/',' ', '\n', '\t', '!','%','&','*','(',')','@','$'};

    public static final String[] VALUES_LIT = new String[]{"true", "false", "null"};


    private static Set<String> keywords = new HashSet<String>(Arrays.asList(VALUES_KEY));
    private static Set<Character> punctuation = new HashSet<Character>(Arrays.asList(VALUES_PUN));
    private static Set<String> literals = new HashSet<String>(Arrays.asList(VALUES_LIT));

    public static boolean isKeyword(String word)
    {
        return keywords.contains(word);
    }
    public static boolean isPunctuation(char word)
    {
        return punctuation.contains(word);
    }
    public static boolean isLiteral(String word)
    {
        return literals.contains(word);
    }
}
