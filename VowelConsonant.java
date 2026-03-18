class VowelConsonant{
    public static void main(String[] args){
        String s = "niha123";
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
