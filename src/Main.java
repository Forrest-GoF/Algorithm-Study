import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> countOfClothe = new HashMap<>();

        for(String[] clothe : clothes){
            String clotheType = clothe[1];
            countOfClothe.put(clotheType, countOfClothe.getOrDefault(clotheType, 0) + 1);
        }

        for(String clotheType : countOfClothe.keySet()){
            answer *= (countOfClothe.get(clotheType) + 1);
        }

        return --answer;
    }
}

/*
모범 답안
    시간복잡도
        O(N)
    공간복잡도
        O(N)
 */

public class Main {
    public static void main(String[] args) throws IOException {

    }
}
