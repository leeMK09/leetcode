class Solution {
    public String addBinary(String a, String b) {
        char[] ach = a.toCharArray();
        char[] bch = b.toCharArray();
        char[] comparech1 = ach.length < bch.length ? bch : ach;
        char[] comparech2 = ach.length < bch.length ? ach : bch;
        int carry = 0;
        int comparech2Index = comparech2.length - 1;
        boolean overflow = false;

        for (int i = comparech1.length - 1; i >= 0; i--) {
            int val1 = comparech1[i] - '0';
            int val2 = carry;

            if (comparech2Index >= 0) {
                val2 = (comparech2[comparech2Index] - '0') + carry;
                comparech2Index--;
            } else {
                overflow = true;
            }

            if ((val1 + val2) > 1) {
                if ((val1 + val2 + carry) > 3) {
                    comparech1[i] = '1';
                } else {
                    comparech1[i] = '0';
                }
            } else {
                if ((val1 + val2 + carry) == 0) {
                    comparech1[i] = '0';
                } else {
                    comparech1[i] = '1';
                }
            }

            if (overflow) {
                if ((val1 + carry) > 1) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            } else {
                if ((val1 + val2) > 1) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            }
        }

        if (carry == 1) {
            char[] result = new char[comparech1.length + 1];
            int comparech1Index = comparech1.length - 1;
            for (int i = result.length - 1; i >= 0; i--) {
                if (comparech1Index >= 0) {
                    result[i] = comparech1[comparech1Index];
                    comparech1Index--;
                }
            }
            result[0] = '1';
            return String.valueOf(result);
        }

        return String.valueOf(comparech1);
    }
}