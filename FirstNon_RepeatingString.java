public class FirstNon_RepeatingString {
    public static void main(String[] args) {
        String str = "malayalam";

        
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for(int j =0 ; j <str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    flag =false;
                    break;
                }
            }

            if (flag) {
                System.out.println(str.charAt(i));
                break;
            }

        }
           
    }
}
