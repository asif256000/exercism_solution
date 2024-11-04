import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {
    static Set<String> newCollection(List<String> cards) {
       return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                for (String theirCard : theirCollection) {
                    if (!myCollection.contains(theirCard)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            commonCards.retainAll(collections.get(i));
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }
        return allCards;
    }
}
