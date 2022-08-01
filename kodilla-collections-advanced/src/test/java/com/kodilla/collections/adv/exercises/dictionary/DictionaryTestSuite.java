package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech.NOUN;
import static com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech.VERB;
import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void TestAddWord() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));

        // when
        List<EnglishWord> result = dictionary.findEnglishWord("gra", NOUN);
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(NOUN, "play"));
        expectedList.add(new EnglishWord(NOUN, "game"));
        assertEquals(expectedList, dictionary);
    }

}