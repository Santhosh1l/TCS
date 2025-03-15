import java.util.*;


public class GetInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
       input1(input);


    }
static void input2(String input){

}
    static void input1(String input){

        input = input.replaceAll("\"", "");
        input =input.replaceAll("'","");
        input = input.replaceAll("[\\[\\]]", "");
        ArrayList<Integer> arr1 = new ArrayList<>();

            String str[] = input.split("[\\s,]+");

        //String str[] = input.split("\\s+");
        int arr[] = new int[str.length];


        for(int i=0;i< str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr));
    }



static void arraylistinput(){
    Scanner scanner=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    System.out.println("Enter the elements of the matrix. Press Enter twice to stop.");


    while (true) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            break;
        }
        ArrayList<Integer> row = new ArrayList<>();
        String[] elements = input.split("[\\s,]+");
        for (String element : elements) {
            row.add(Integer.parseInt(element));
        }
        matrix.add(row);
    }

    for (int i = 0; i < matrix.size(); i++) {
        for (int j = 0; j < matrix.get(i).size(); j++) {
            if(i>j){
                matrix.get(i).set(j,0);
            }
        }
    }
    for(int i=0;i<matrix.size();i++){
        for(int j=0;j<matrix.get(i).size();j++){
            System.out.print(matrix.get(i).get(j));
        }
        System.out.println();
    }
    }
}