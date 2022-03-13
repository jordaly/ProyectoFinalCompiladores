public class codigoIntermedio {
    public static String traducir(String cadena){
        cadena = cadena.replaceAll("publica estatica vacia Principal()", "public static void Main()");
        cadena = cadena.replaceAll("Si", "if");
        cadena = cadena.replaceAll("Sino", "else");
        cadena = cadena.replaceAll("entero", "int");
        cadena = cadena.replaceAll("flotante", "float");
        cadena = cadena.replaceAll("caracter", "char");
        cadena = cadena.replaceAll("cadena", "string");
        cadena = cadena.replaceAll("Programa", "Program");
        cadena = cadena.replaceAll("publica", "public");
        cadena = cadena.replaceAll("estatica", "static");
        cadena = cadena.replaceAll("vacia", "void");
        
        cadena = cadena.replaceAll("Sino Si", "else if");
        cadena = cadena.replaceAll("Para", "for");
        cadena = cadena.replaceAll("Alternar", "switch");
        cadena = cadena.replaceAll("Caso", "case");
        cadena = cadena.replaceAll("Termina", "break");
        cadena = cadena.replaceAll("Predeterminado", "default");
        cadena = cadena.replaceAll("Hacer", "do");
        cadena = cadena.replaceAll("Mientras", "while");
        cadena = cadena.replaceAll("Escribir", " Console.WriteLine");
        cadena = cadena.replaceAll("Leer", "Console.ReadLine");

        return cadena;
    }
}
/*
<PUBLIC: "publica"> //8
| <PRIVATE: "privada"> //9
| <STATIC: "estatica"> //10
| <VOID: "vacia"> //11
| <MAIN: "publica estatica vacia Principal()"> //12
| <PROGRAMA: "Programa" >  //13
| <IF: "Si" > //14
| <ELSE:"Sino" > //15
| <ELSEIF:"Sino Si" > //16
| <FOR:"Para" > //17
| <SWITCH:"Alternar" > //18
| <CASE:"Caso" > //19
| <BREAK:"Termina" > //20
| <DEFAUL:"Predeterminado" > //21
| <DO:"Hacer" > //22
| <WHILE:"Mientras" > //23
| <WRITE:"Escribir" > //24
| <READ:"Leer" > //25
*/