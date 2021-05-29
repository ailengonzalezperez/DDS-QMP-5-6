
public class Prenda{
	//funcionalidad de iteraciones anteriores
}

public class Guardarropas{
	private String nombre;
	public List<Prenda> prendas;
  
	public Guardarropas(String nombre){
		this.nombre = nombre;
		this.prendas = new ArrayList<Prenda>;
	}
  
	public void agregarPrenda(Prenda prenda){
		this.prendas.add(prenda);
	}  
  
	public void eliminarPrenda(Prenda prenda){
		this.prendas.remove(prenda);
	} 
}

public class Usuario{
	public List<Guardarropas> guardarropas;
	public List<Sugerencias> sugerenciasPendientes;
	public List<Sugerencias> sugerenciasAceptadas;
	
	public void agregarPrenda(Prenda prenda, Guardarropas guardarropas){
		guardarropas.agregarPrenda(prenda); //Delego para no tocar directamente los atributos
	}
	
	public void eliminarPrenda(Prenda prenda, Guardarropas guardarropas){
		guardarropas.eliminarPrenda(prenda);
	}
	
	public void revisarSugerenciasDeModificacion(){
		aquí para cada sugerencia pendiente decido
		si acepta
			sugerenciasAceptadas.add(sugerenciaActual);
			sugerenciasPendientes.remove(sugerenciaActual);
			sugerenciaActual.tipoSugerencia.concretarSugerencia(sugerencia); 
		si no acepta
			sugerenciaPendientes.remove(sugerenciaActual)
	}
	
	public void deshacerSugerenciaAceptada(Sugerencia sugerencia){
		sugerencia.tipoSugerencia.deshacerSugerencia(sugerencia);
		sugerenciasPendientes.add(sugerencia); //Entiendo que vuelve a quedar ahí disponible para hacerse
		sugerenciasAceptadas.remove(sugerencia);
	}
	
	
	public void agregarUnGuardarropas(Guardarropas guardarropas){
		this.guardarropas.add(guardarropas)
	}

	
	public void recibirSugerencia(Sugerencia sugerencia){
		this.sugerenciasPendientes.add(sugerencia);
	}
} 

public class Sugerencia{ //Data class que me permite ganar abstracción
	TipoSugerencia tipo;
	Prenda prenda;
	Guardarropas guardarropas;
	
	public Sugerencia(Prenda prenda, TipoSugerencia tipo, Guardarropas guardarropas){
		this.prenda = prenda;
		this.tipo = tipo;
		this.guardarropas = guardarropas;
	}
}

public enum TipoSugerencia{
	AGREGAR, ELIMINAR
	
	AGREGAR.concretarSugerencia(Sugerencia sugerencia){
		sugerencia.getGuardarropas.agregarPrenda(sugerencia.getPrenda);
	}
	AGREGAR.deshacerSugerencia(Sugerencia sugerencia){
		sugerencia.getGuardarropas.eliminarPrenda(sugerencia.getPrenda);
	}
	
	ELIMINAR.concretarSugerencia(Sugerencia sugerencia){
		sugerencia.getGuardarropas.eliminarPrenda(sugerencia.getPrenda);
	}
	ELIMINAR.deshacerSugerencia(Sugerencia sugerencia){
		sugerencia.getGuardarropas.agregarPrenda(sugerencia.getPrenda);
	}
