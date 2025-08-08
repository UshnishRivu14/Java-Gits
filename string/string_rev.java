package string_builder;

public class string_rev {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("khalifa");

        //we divide by 2 cause we dont need to swap the middle one
        for (int i = 0; i < sb.length()/2; i++) {

            //front takes 1st char index and back  takes last one
            int front = i; 
            int back = sb.length() - 1 - i;

            //storing frontchar and backchar
            char frontchar = sb.charAt(front); 
            char backchar = sb.charAt(back);

            //replacing or swapping front char with back and vice versa
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
