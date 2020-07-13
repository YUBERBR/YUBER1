import java.util.Scanner;
public class Cadena {

	public static void main(String[] args) {
		String Cadena="    1  2       3        14        5  y  u      6   7          ";
		int i, numeros, suma=0, suma2=0,val;
		
		System.out.println("tenemos la siguiente cadena de caracteres:"+Cadena);
		System.out.println("donde no es numero:" +Cadena.charAt(37));
		System.out.println("y no es numero:" +Cadena.charAt(40));
	do {
	try {
		val=0;
	
		Scanner lector=new Scanner(System.in);
		System.out.println("Escribe los numeros de la cadena:");
		for(i=0;i<7;i++)
		{
			numeros=lector.nextInt();
			suma=suma+numeros;
		}
			System.out.println("la suma de los numeros de la cadena es:"+suma);
	}catch(Exception e) {System.out.println("El dato no es valido"); val=1;
	}
	}while(val !=0);
	if(suma==38) {
		System.out.println("");
	}
	else{
	System.out.println("ingrese bien los numeros de la cadena");
	System.out.println("vuelva a escribir los numeros de la cadena (1 2 3 14 5 6 7) y teclea enter");
	Scanner lector2=new Scanner(System.in);
	for(i=0;i<7;i++)
	{
		numeros=lector2.nextInt();
		suma2=suma2+numeros;
		} 
		System.out.println("la suma de los numeros de la cadena es:"+suma2);
		if(suma2==38) {
			System.out.println("");
	}
 }
}
}

