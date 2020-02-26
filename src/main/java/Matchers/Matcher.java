package Matchers;

import java.util.*;

public class Matcher {
    public String[] reservedWords = {
            "James", "John", "Robert", "Michael", "William", "David", "Richard", "Charles", "Joseph", "Thomas", "Christopher", "Daniel",
            "Paul", "Mark", "Donald", "George", "Kenneth", "Steven", "Edward", "Brian", "Ronald", "Anthony", "Kevin", "Jason", "Matthew",
            "Gary", "Timothy", "Jose", "Larry", "Jeffrey", "Frank", "Scott", "Eric", "Stephen", "Andrew", "Raymond", "Gregory", "Joshua",
            "Jerry", "Dennis", "Walter", "Patrick", "Peter", "Harold", "Douglas", "Henry", "Carl", "Arthur", "Ryan", "Roger"
    };

    public Map<String, Result[]> result = new HashMap<String, Result[]>();

    static <T> T[] append(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }

    public void readLine(String str, Integer lineOffset) {
        for (String searchable: this.reservedWords) {
            Integer intIndex = str.indexOf(searchable);

            if(intIndex != - 1) {
                Result found = new Result(lineOffset, intIndex);

                if (this.result.containsKey(searchable)) {
                    Result[] isAlreadyFound = result.get(searchable);
                    isAlreadyFound = append(isAlreadyFound, found);
                    this.result.put(searchable, isAlreadyFound);
                } else {
                    Result[] f = { found };
                    this.result.put(searchable, f);
                }
            }
        }
    }

    public Map<String, Result[]> getResult() {
        return this.result;
    }
}
