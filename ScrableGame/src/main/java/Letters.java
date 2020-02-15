import java.util.HashMap;
import java.util.Map;

public class Letters {
    HashMap<Character, Integer> alphabet;
    int score;
    private String word;

    public Letters() {
        this.alphabet = new HashMap<Character, Integer>();
        alphabet.put('a',1); alphabet.put('e',1); alphabet.put('i',1);
        alphabet.put('o',1); alphabet.put('u',1); alphabet.put('l',1);
        alphabet.put('n',1); alphabet.put('r',1); alphabet.put('s',1);
        alphabet.put('t',1); alphabet.put('d',2); alphabet.put('g',2);
        alphabet.put('b',3); alphabet.put('c',3); alphabet.put('m',3);
        alphabet.put('p',3); alphabet.put('f',4); alphabet.put('h',4);
        alphabet.put('v',4); alphabet.put('w',4); alphabet.put('y',4);
        alphabet.put('k',5); alphabet.put('j',8); alphabet.put('x',8);
        alphabet.put('q',10); alphabet.put('z',10);
    }


    public Integer getLetterValue (Character x) {
        int score = alphabet.get(x);
        return (Integer) score;
    }

    public int calculateScore(String word) {
        this.word = word;
        int score = 0;
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++){
            word.toLowerCase();
            char eachLetter = word.charAt(i);
            score += alphabet.get(eachLetter);
        }
        return score;
    }
}
