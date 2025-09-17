class Solution {
    private Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        return resolve(n);
    }

    public int resolve(int n) {
        if (n <= 2) return n;

        Integer mapValue = map.get(n);

        if (mapValue != null) {
            return mapValue;
        }

        int value = resolve(n - 1) + resolve(n - 2);

        if (mapValue == null) {
            map.put(n, value);
        }

        return value;
    }
}