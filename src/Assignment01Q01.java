public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for (String s: args){
            if (s.length() > 0){
                char firstChar = s.charAt(0);
                if (firstChar % 5 ==0){
                    System.out.println(firstChar);
                }
            }

        }
    }
}
