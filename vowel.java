package day02;

/*
step1:import the required packages
step2:define the class
step3:define the main method
step4:create an object for Scanner
step5:get input from user using Scanner object.
step6:check whether is a Alphabet
	step6.1:check whether it was vowel or consonant
	step6.2:display the output
step7:else print Not a Aplhabet.
step8:close the scanner
*/


import java.util.Scanner;
class vowel{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(Character.isAlphabetic(c)){
c=Character.toLowerCase(c);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
System.out.print("Vowels");
}
else{
System.out.print("Consonant");
}
}

else{
System.out.print("Not an alphabet");
}
sc.close();

}}