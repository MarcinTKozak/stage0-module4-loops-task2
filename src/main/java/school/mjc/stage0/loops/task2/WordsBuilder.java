package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();

        for (char c : chars) {
            phrase.append(c);
        }

        System.out.println("Phrase: " + phrase.toString());
    }

    public static void main(String[] args) {
        WordsBuilder builder = new WordsBuilder();
        builder.buildPhrase('H', 'e', 'l', 'l', 'o');
        builder.buildPhrase('W', 'o', 'r', 'l', 'd', '!');
    }
}
