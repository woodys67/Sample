package exceldata;

public class WordVO {

    private int deck;
    private String words;
    private String meanings;

    public WordVO(int deck, String word, String meaning) {
        this.deck = deck;
        this.words = word;
        this.meanings = meaning;
    }

    // 게터
    public int getDeck() {
        return deck;
    }

    public String getWords() {
        return words;
    }

    public String  getMeanings() {
        return meanings;
    }

    //세터
    public void setDeck(int deck) {
        this.deck = deck;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }
}
