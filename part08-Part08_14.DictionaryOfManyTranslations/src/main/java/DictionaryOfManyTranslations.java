/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        // Add an empty list for a new translation
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList item = this.dictionary.get(word);
        
        if(item == null) {
            // Create an empty list
            ArrayList<String> emptyList = new ArrayList<>();
            return emptyList;
        } else {
            return this.dictionary.get(word);
        }
    }
    
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
