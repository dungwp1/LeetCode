import java.util.TreeMap;

public class D119_731_My_Calendar_II {
    TreeMap<Integer, Integer> treeMap;

    public D119_731_My_Calendar_II() {
        treeMap = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        treeMap.put(startTime, treeMap.getOrDefault(startTime, 0) + 1);
        treeMap.put(endTime, treeMap.getOrDefault(startTime, 0) - 1);

        int availableBook = 0;
        for (int count : treeMap.values()) {
            availableBook += count;
            if (availableBook >= 3) {
                treeMap.put(startTime, treeMap.get(startTime) - 1);
                if (treeMap.get(startTime) == 0) treeMap.remove(startTime);
                treeMap.put(endTime, treeMap.get(startTime) + 1);
                if (treeMap.get(endTime) == 0) treeMap.remove(endTime);
                return false;
            }
        }
        return true;
    }
}
