import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> playerScore = new HashMap<>();
        playerScore.put("Dhoni", 72);
        playerScore.put("Rohit", 45);
        playerScore.put("Virat", 75);
        playerScore.put("Dhoni", 97);
        playerScore.put("Cahal", 99);
        System.out.println("After Put(): " + playerScore);
        Map<String, Integer> additionalScores = new HashMap<>();
        additionalScores.put("Bumrah", 32);
        additionalScores.put("Dhawan", 65);
        playerScore.putAll(additionalScores);
        System.out.println("After PutALL(): " + playerScore);
        playerScore.putIfAbsent("Dhoni", 96);
        playerScore.putIfAbsent("Jadeja", 67);
        System.out.println("After PutIfAbsent(): " + playerScore);
        System.out.println("Score Of Dhoni: " + playerScore.get("Dhoni"));
        System.out.println("Score of Unknown Player: " + playerScore.get("Surya"));
        System.out.println("Score of Unknown player or Default " + playerScore.getOrDefault("Virat", 0));
        System.out.println("Is Virat is Exists?: " + playerScore.containsKey("Virat"));
        System.out.println("Does Yuvi Exists?: " + playerScore.containsKey("Yuvi"));
        System.out.println("Does Anyone Scored 45?: " + playerScore.containsValue(45));
        System.out.println("Does Anyone Scored 200?: " + playerScore.containsValue(200));
        playerScore.replace("Rohit", 99);
        System.out.println("The Playerscore AFter the Replace(): " + playerScore);
        Boolean replaced = playerScore.remove("Virat",77);
        System.out.println("The Playerscore After Remove(): "+playerScore);
        System.out.println("Is Remove() Successfull ?: "+replaced);
        Set<String> players = playerScore.keySet();
        System.out.println("Players: "+players);
        Collection<Integer> scores = playerScore.values();
        System.out.println("Scores: "+scores);
        Set<Map.Entry<String,Integer>> entries = playerScore.entrySet();
        System.out.println("==========ScoreCard=========");
        for(Map.Entry<String,Integer> m:entries)
        {
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(playerScore.entrySet());
        List<Map.Entry<String,Integer>> list1 = new ArrayList<>(entries);
        System.out.println("The map changed to list : "+list);
        System.out.println("When the set is changed to the list : "+list1);


    }

}
