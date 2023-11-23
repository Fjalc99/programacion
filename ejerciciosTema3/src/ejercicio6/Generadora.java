package ejercicio6;

import java.util.Random;

public class Generadora {

	
	public int generarNum(int desde, int hasta) {
		int num=0;
		Random rnd= new Random (System.nanoTime());
		num=rnd.nextInt(hasta-desde+1)+desde;
		
		return num;
	}
	
	public int generarPrimitiva (int desde, int hasta) {
		
			int num= 0;
			num=generarNum(desde, hasta);
			
			return num;		
		}
		
	public boolean generarParImpar (int desde, int hasta) {
		
		int dos = 2;
		boolean resultado = false;
		
		if(generarNum(desde, hasta)%dos==0){
			resultado=true;
		
			
		}else{
			resultado=false;
		}
		return resultado;
		
		
		
		
	}
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

