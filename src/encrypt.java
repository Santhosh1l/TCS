public class encrypt {


    static boolean isPerfectSquare(int length){
        if(length<0){
            return false;
        }
        int sqrt=(int)Math.sqrt(length);

        return (sqrt*sqrt==length);

    }
    public static void main(String[] args) {
        String str = "PLEASESAVEME";
        int a = str.length();


        int b,c;

        if (isPerfectSquare(a)) {
            b=(int)Math.sqrt(a);
            c = b;
            encrypt(str,b,c);
        } else {
            b=(int)Math.sqrt(a);
            c=b+1;
            encrypt(str,b,c);
        }

    }
    static void encrypt(String str, int b,int c){
        String[][] arr = new String[b][c];

        // Fill the 2D array with characters from the string
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (index < str.length()) {
                    arr[i][j] = String.valueOf(str.charAt(index));
                    index++;
                } else {
                    arr[i][j] = " "; // Fill remaining spaces with blanks
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"");
            }
        }
        System.out.println(" ");
        // Print the 2D array in a column-wise manner
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("\"");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "");
            }

            System.out.print("\"");
            System.out.print(" ");
        }
    }
}
