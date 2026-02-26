package Strings;
public class ReverseVowelsOfStr {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int l=0,r=ch.length-1;
        while(l<r){
            while(l<r && !isvowel(ch[l])){
                l++;
            }
            while(l<r && !isvowel(ch[r])){
                r--;
            }
            if(l<r){
                swap(ch,l,r);
                l++;
                r--;
            }
        }
        return new String(ch);
    }
    void swap(char[] ch,int l, int r){
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
    }
    boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public static void main(String[] args) {
        ReverseVowelsOfStr obj=new ReverseVowelsOfStr();
        String s="Ice Cream";
        System.out.println("Original String: "+s);
        String ans=obj.reverseVowels(s);
        System.out.println("Reversed Vowels String: "+ans);
    }
}
