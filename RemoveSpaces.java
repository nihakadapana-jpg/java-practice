class RemoveSpaces{
    public static void main(String[] args){
        String s = "I love Java";
        char arr[] = s.toCharArray();
        String result = "";

        for(char c : arr){
            if(c!=' '){
                result += c;
            }
        }

        System.out.println(result);
    }
}
