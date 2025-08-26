String a = "FIM";
String b = "FIM";
System.out.println(a==b); // pode ser falso!!
System.out.println(a.equals(b)) // verdadeiro
//entao
while(!linha.equals("FIM"))
verificamos se a linha lida não é FIM para continuar o loop

.length() // retorna o numero de caracteres de uma String
String s = "abc";
System.out.print(s.length())// imprime 3
int j = s.length() - 1 -> coloca o ponteiro j no ultimo caractere da String

.charAt()// pega o caractere em uma posição especifica da String
String s = "abc";
System.out.println(s.charAt(0));// imprime a
System.out.println(s.charAt(2)); // imprime c

.toLowerCase()// transforma todos os caracteres da String em minusculas
String s = "AbC";
system.out.println(s.toLowerCase()); // imprime abc
// dessa forma "a" e "A" são tratados como iguais

