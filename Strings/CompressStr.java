package Strings;
class CompressStr{
    public static void main (String[] args) {
        String str="a12b3";
        StringBuilder sb=new StringBuilder();
        char prev='\0';
        for(int i=0;i<str.length();++i){
            char ch=str.charAt(i);
            if(!Character.isDigit(ch)){
                sb.append(ch);
                prev=ch;
            }
            else{
                int num=0;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num=num*10+(str.charAt(i)-'0');
                    i++;
                }
                for(int j=1;j<num;j++){
                    sb.append(prev);
                }
                i--;
            }
        }
        System.out.println(sb.toString());
    }
}
