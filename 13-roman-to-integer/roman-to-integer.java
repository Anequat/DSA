class Solution {
    public int romanToInt(String s) {
        int d = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
             d -= 1;
                else
                  d += 1;

            } else if (s.charAt(i) == 'V') {
             d += 5;

            } else if (s.charAt(i) == 'X') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
              d -= 10;
            else
                    d += 10;

            } else if (s.charAt(i) == 'L') {
                d += 50;

            } else if (s.charAt(i) == 'C') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
            d -= 100;
                else
             d += 100;

            } else if (s.charAt(i) == 'D') {
        d += 500;

            } else if (s.charAt(i) == 'M') {
        d += 1000;
            }
        }

        return d;
    }
}
