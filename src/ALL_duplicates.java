import java.util.*;
public class ALL_duplicates {
    public static void main(String[] args) {
int nums[]={4, 3, 2, 7, 8, 2, 3, 1};

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                if (!duplicates.contains(num)) {
                    System.out.println(seen);

                    duplicates.add(num);
                    System.out.println(duplicates);
                }
            }
        }
        System.out.println(duplicates);
    }
}
