package Lista6;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop d1 = new Desktop();
		d1.setCodBarras(1287l);
		d1.setFabricante("Dell");
		d1.setGamer(false);
		
		ArrayList<String> peças = new ArrayList<>();
		peças.add("Teclado");
		peças.add("Monitor LG");
		
		Desktop d2 = new Desktop();
		d1.setCodBarras(1295l);
		d1.setFabricante("Dell");
		d1.setGamer(false);
		
		ArrayList<String> peças1 = new ArrayList<>();
		peças.add("Mouse");
		peças.add("SSD");
		
		Desktop d3 = new Desktop();
		d1.setCodBarras(1297l);
		d1.setFabricante("Dell");
		d1.setGamer(false);
		
		ArrayList<String> peças2 = new ArrayList<>();
		peças.add("RAM");
		peças.add("GPU");
		
		d1.setPeças(peças);
		
		desktops.add(d1);
		
        d2.setPeças(peças1);
		
		desktops.add(d2);
		
        d3.setPeças(peças2);
		
		desktops.add(d3);
		
		for (Desktop objDaVez : desktops) {
			System.out.println(objDaVez.getFabricante());
			System.out.println(objDaVez.getCodBarras());
			System.out.println(objDaVez.isGamer());
			
			for (String peca : objDaVez.getPeças()) {
				System.out.println(peca);
			}
		}
		
		ArrayList<Smartphone> smartphones = new ArrayList<>();
		
		Smartphone s1 = new Smartphone();
		s1.setDimensoesTela("450");
		s1.setModelo("Iphone 15");
		s1.setCodBarras(null);
		s1.setFabricante("Apple");
		
		Smartphone s2 = new Smartphone();
		s1.setDimensoesTela("450");
		s1.setModelo("Iphone 15");
		s1.setCodBarras(null);
		s1.setFabricante("Apple");
		
		Smartphone s3 = new Smartphone();
		s1.setDimensoesTela("450");
		s1.setModelo("Iphone 15");
		s1.setCodBarras(null);
		s1.setFabricante("Apple");
		
		s1.setCodBarras(s1);
		
		smartphones.add(s1);
		
        s2.setCodBarras(s2);
		
		smartphones.add(s2);
		
        s3.setCodBarras(s3);
		
		smartphones.add(s3);
		
		for(Smartphone s : smartphones) {
			System.out.println(s.getDimensoesTela());
			System.out.println(s.getModelo());
			System.out.println(s.getCodBarras());
			System.out.println(s.getFabricante());
		}
	}
		
}


