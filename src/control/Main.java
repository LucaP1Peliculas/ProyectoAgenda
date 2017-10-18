package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Holiiiii");
		System.out.println("A ver ahora como lo hacemos");
		System.out.println("Prueba de rama3");
		System.out.println("Prueba de Zaineb   22222");
		String s;
		int numero;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader stdin= new BufferedReader(isr);
		try{
			while((s=stdin.readLine()) != null){
				System.out.println("leida : "+s);
				//numer= Integer.parseInt(s);
			}
			stdin.close();
		}catch(IOException e){
			System.out.println(e);
		}/* catch (NumberFormatException e){
		System.out.println(e);
		}
		*/
		
	}

}
