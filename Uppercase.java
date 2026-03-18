class Uppercase{
    public static void main(String[] args){
        String s = "niha";
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i] = (char)(arr[i]-32);
            }
        }
        System.out.println(new String(arr));
    }
}
