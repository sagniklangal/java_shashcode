class StringReverse {
    public static void reverseString(String input){
        String ans = "";
        for(int i=0; i<input.length(); i++){
            ans = input.charAt(i) + ans;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        reverseString("ABCDEF");
    }
}
