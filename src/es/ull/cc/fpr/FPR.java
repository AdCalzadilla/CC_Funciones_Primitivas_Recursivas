package es.ull.cc.fpr;

public class FPR extends FRB{
	
	public int uno(int x){
		return 1;
	}
	
	public int suma(int x, int y){
		if(y == 0){
			return x;
		}
		else{
			int var[] = new int[3];
			var[0] = x;
			var[1] = y-1;
			var[2] = suma(x,y-1);
			return s(proyeccion(var,2));
		}
	}
	
	public int producto(int x, int y){
		if(y == 0){
			return z(x);
		}
		else{
			int var[] = new int[3];
			var[0] = x;
			var[1] = y-1;
			var[2] = producto(x,y-1);
			return suma(proyeccion(var,0),proyeccion(var,2));
		}
	}
	
	public int potencia(int x,int y){
		if(y == 0){
			return uno(x);
		}
		else{
			int var[] = new int[3];
			var[0] = x;
			var[1] = y-1;
			var[2] = potencia(x,y-1);
			return producto(proyeccion(var, 0),proyeccion(var, 2));
		}
	}
}
