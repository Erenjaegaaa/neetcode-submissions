

class Solution {
    public int[] topKFrequent(int[] arr, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Put unique elements into a list
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : map.keySet()) {
            list.add(i);
        }

        // Step 3: Sort by frequency in descending order
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Take the first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}