public class PermutingArray {
    static void permutingArray(java.util.List<Integer> arrayList, int element) {
        for(int i = element; i < arrayList.size(); i++) {
            java.util.Collections.swap(arrayList, i, element);
            permutingArray(arrayList, element + 1);
            java.util.Collections.swap(arrayList, element, i);
        }
        if(element == arrayList.size() - 1) {
            System.out.println(arrayList);
        }
    }

    public static void main(String[] args) {
        PermutingArray.permutingArray(java.util.Arrays.asList(1, 2, 3), 0);
    }
}
