package Contest_Question;

import java.util.HashMap;
import java.util.Iterator;

public class FrequencyTracker {
    HashMap<Integer, Integer>  map  = new HashMap<>();
    public FrequencyTracker() {
FrequencyTracker obj = new FrequencyTracker();
boolean ans[] = new boolean[4];
ans[0] = Boolean.parseBoolean(null);
    }

    public void add(int number) {
map.put(number, map.getOrDefault(number,0)+1);
    }

    public void deleteOne(int number) {

        if(map.containsKey(number))
        {
            map.put(number, map.get(number)-1);
        }
        else{
            map.remove(number);
        }

    }

    public boolean hasFrequency(int frequency) {

        if(map.containsValue(frequency))
        {
            return true;
        }
        return false;

    }



}
