
public class TirarDado {
	
	static int aleatorio() {
		int azar = (int)(Math.random()*6+1);
		return azar;
	}

	public static void main(String[] args) {
		
		System.out.println("DADO DE 6 CARAS");
		System.out.println("¡Vamos a tirar un dado!");
		System.out.println("************************************");
		
		switch(TirarDado.aleatorio()) {
		case 1:System.out.println("Te ha salido un uno, fatal. "); break;
		case 2:System.out.println("Te ha salido un dos, mal. "); break;
		case 3:System.out.println("Te ha salido un tres, regular. "); break;
		case 4:System.out.println("Te ha salido un cuatro, bien. "); break;
		case 5:System.out.println("Te ha salido un cinco, muy bien. "); break;
		case 6:System.out.println("Te ha salido un seis, fantástico. "); break;
		}
		
		
		
		}

	}


