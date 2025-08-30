class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        List<Roman> romans = new ArrayList<>(Arrays.asList(
                new I(),
                new V(),
                new X(),
                new L(),
                new C(),
                new D(),
                new M()
        ));
        List<Roman> inputToRomans = new ArrayList<>();

        for (char c : chars) {
            for (Roman roman : romans) {
                if (c == roman.getSymbol()) {
                    inputToRomans.add(roman);
                }
            }
        }

        AtomicInteger result = new AtomicInteger();
        List<Integer> skipIndexes = new ArrayList<>();
        IntStream.range(0, inputToRomans.size())
                .forEach(i -> {
                    if (skipIndexes.stream().anyMatch(idx -> idx.intValue() == i)) {
                        return;
                    }
                    Roman roman = inputToRomans.get(i);

                    if (i == inputToRomans.size() - 1) {
                        result.addAndGet(roman.getValue());
                        return;
                    }

                    Roman nextRoman = inputToRomans.get(i + 1);
                    if (roman.isSubtract(nextRoman)) {
                        result.addAndGet(roman.getValue(nextRoman));
                        skipIndexes.add(i + 1);
                        return;
                    }

                    result.addAndGet(roman.getValue());
                });
        return result.intValue();
    }
}

abstract class Roman {
    abstract int getValue();

    abstract char getSymbol();

    int getValue(Roman roman) {
        return getValue();
    }

    boolean isSubtract(Roman roman) {
        return false;
    }
}

class I extends Roman {
    private final List<Roman> subtractRomans = new ArrayList<>(Arrays.asList(
            new V(),
            new X()
    ));

    @Override
    int getValue() {
        return 1;
    }

    @Override
    char getSymbol() {
        return 'I';
    }

    @Override
    int getValue(Roman roman) {
        if (isSubtract(roman)) {
            return roman.getValue() - getValue();
        }
        return getValue();
    }

    @Override
    boolean isSubtract(Roman roman) {
        return subtractRomans.stream().anyMatch(rom -> rom.equals(roman));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}

class V extends Roman {
    @Override
    int getValue() {
        return 5;
    }

    @Override
    char getSymbol() {
        return 'V';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}

class X extends Roman {
    private final List<Roman> subtractRomans = new ArrayList<>(Arrays.asList(
            new L(),
            new C()
    ));

    @Override
    int getValue() {
        return 10;
    }

    @Override
    char getSymbol() {
        return 'X';
    }

    @Override
    int getValue(Roman roman) {
        if (isSubtract(roman)) {
            return roman.getValue() - getValue();
        }
        return getValue();
    }

    @Override
    boolean isSubtract(Roman roman) {
        return subtractRomans.stream().anyMatch(rom -> rom.equals(roman));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}

class L extends Roman {
    @Override
    int getValue() {
        return 50;
    }

    @Override
    char getSymbol() {
        return 'L';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}

class C extends Roman {
    private final List<Roman> subtractRomans = new ArrayList<>(Arrays.asList(
            new D(),
            new M()
    ));

    @Override
    int getValue() {
        return 100;
    }

    @Override
    char getSymbol() {
        return 'C';
    }

    @Override
    int getValue(Roman roman) {
        if (isSubtract(roman)) {
            return roman.getValue() - getValue();
        }
        return getValue();
    }

    @Override
    boolean isSubtract(Roman roman) {
        return subtractRomans.stream().anyMatch(rom -> rom.equals(roman));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}

class D extends Roman {
    @Override
    int getValue() {
        return 500;
    }

    @Override
    char getSymbol() {
        return 'D';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}

class M extends Roman {
    @Override
    int getValue() {
        return 1000;
    }

    @Override
    char getSymbol() {
        return 'M';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roman i = (Roman) o;
        return Objects.equals(getSymbol(), i.getSymbol());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}
