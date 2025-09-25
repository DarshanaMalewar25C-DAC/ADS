/*
9.Display duplicate elements from an array.
Testcase1:
Input: [1, 2, 3, 4, 2, 5, 1]
Expected Output: 1, 2
Testcase2:
Input: [10, 20, 30, 40, 50]
Expected Output: No duplicates found
*/

import java.util.LinkedHashSet;

class DuplicateElements {
    static void findDuplicates(int[] arr, int[] freq, int index, LinkedHashSet<Integer> duplicates) {
        if (index >= arr.length) {
            return;
        }

        if (freq[arr[index]] == 0) {
            freq[arr[index]] = 1;
        } else {
            // Add to duplicates set — duplicates preserves insertion order & uniqueness
            duplicates.add(arr[index]);
        }

        findDuplicates(arr, freq, index + 1, duplicates);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 2, 5, 1};
        int[] freq1 = new int[1000];
        LinkedHashSet<Integer> duplicates1 = new LinkedHashSet<>();

        findDuplicates(arr1, freq1, 0, duplicates1);

        if (duplicates1.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            // Print comma separated duplicates
            System.out.println(String.join(", ", duplicates1.stream()
                                                            .map(String::valueOf)
                                                            .toArray(String[]::new)));
        }

        int[] arr2 = {10, 20, 30, 40, 50};
        int[] freq2 = new int[1000];
        LinkedHashSet<Integer> duplicates2 = new LinkedHashSet<>();

        findDuplicates(arr2, freq2, 0, duplicates2);

        if (duplicates2.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println(String.join(", ", duplicates2.stream()
                                                            .map(String::valueOf)
                                                            .toArray(String[]::new)));
        }
    }
}
