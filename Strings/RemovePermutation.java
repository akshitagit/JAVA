Public class Main{
public static void main(String[] args){
String str="Welcome???@@$ to#$% Geek%$";
str=str.replaceAll("\\p{Punction}","");
System.out.println(str);
}
}
