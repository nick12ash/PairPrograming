import static org.junit.jupiter.api.Assertions.*;

class LettersTest {

    @org.junit.jupiter.api.Test
    void caculateScore1() {
        Letters alphabet = new Letters();
        String word = "alumni";

        assertEquals(8, alphabet.calculateScore(word));
    }

    @org.junit.jupiter.api.Test
    void caculateScore2() {
        Letters alphabet = new Letters();
        String word = "impedimenta";

        assertEquals(18, alphabet.calculateScore(word));
    }

    @org.junit.jupiter.api.Test
    void caculateScore3() {
        Letters alphabet = new Letters();
        String word = "the";

        assertEquals(6, alphabet.calculateScore(word));
    }

    @org.junit.jupiter.api.Test
    void caculateScore4() {
        Letters alphabet = new Letters();
        String word = "a";

        assertEquals(1, alphabet.calculateScore(word));
    }

    @org.junit.jupiter.api.Test
    void caculateScore5() {
        Letters alphabet = new Letters();
        String word = "nick!";

        assertEquals(10, alphabet.calculateScore(word));
    }

    @org.junit.jupiter.api.Test
    void caculateScore6() {
        Letters alphabet = new Letters();
        String word = "Nick";

        assertEquals(10, alphabet.calculateScore(word));
    }


}