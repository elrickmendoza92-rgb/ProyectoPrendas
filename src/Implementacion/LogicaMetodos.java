package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Ropas;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2 {
	
	private List<Ropas> listaRopas = new ArrayList<Ropas>();

	//validar que la ropa no se repita
	@Override
	public void guardar(Ropas ropa) {
		// TODO Auto-generated method stub
		
		//Algoritmo
		// 1--Ciclo
		// 2--Condicional
		// 3--Bandera
		boolean bandera = false;
		for (Ropas r : listaRopas) {
			if (r.getMarca().equals(ropa.getMarca())) {
				System.out.println("Ese registro ya existe ");
				bandera = true;
				break;
			}
		}
		
		if (bandera == false) {
			listaRopas.add(ropa);
			System.out.println("Se guardo ");
		}
	}

	@Override
	public List<Ropas> mostrar() {
		
		return listaRopas;
	}

	@Override
	public Ropas buscar(int indice) {
		
		return listaRopas.get(indice);
	}

	@Override
	public void editar(int indice, Ropas ropa) {
		listaRopas.set(indice, ropa);
		
	}

	@Override
	public void eliminar(int indice) {
		listaRopas.remove(indice);
		
	}

	@Override
	public Ropas buscarXmarca(String marca) {
		for (Ropas r:listaRopas) {
			if(r.getMarca().equals(marca)) {
				return r;
			}
		}
		return null;
	}

	@Override
	public void editarxmarca(Ropas ropa) {
		
		for(int i=0; i<listaRopas.size(); i++) {
			if(listaRopas.get(i).getMarca().equals(ropa.getMarca())) {
				listaRopas.set(i, ropa);
				System.out.println("Se edito con exito ");
				break;
			}
		}
		
	}

	
	@Override
	public void eliminarXmarca(String marca) {
		for(Ropas r:listaRopas) {
			if(r.getMarca().equals(marca)) {
		listaRopas.remove(marca);
		
		
		}
		}
	
	}

	


		

}
