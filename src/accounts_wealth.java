public class accounts_wealth {

    public static void main(String[] args) {
        int[][]arr={{1,2,3},{2,3,4}};
        int maxWealth = 0;
        int[][] accounts={{1,2,3},{3,2,1}};
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
                maxWealth = Math.max(maxWealth, current);
            }

        }
        System.out.println(maxWealth);
        }
    }
