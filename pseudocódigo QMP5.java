
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
	public List<Propuesta> propuestasPendientes;
	public List<Propuesta> propuestasAceptadas;
	
	public void agregarPrenda(Prenda prenda, Guardarropas guardarropas){
		guardarropas.agregarPrenda(prenda); //Delego para no tocar directamente los atributos
	}
	
	public void eliminarPrenda(Prenda prenda, Guardarropas guardarropas){
		guardarropas.eliminarPrenda(prenda);
	}
	
	public void aceptarPropuesta(Propuesta propuesta){
		propuesta.concretarPropuesta();
		propuestasAceptadas.add(propuestaActual);
		propuestasPendientes.remove(propuestaActual);
	}
	
	public void deshacerPropuestaAceptada(Propuesta propuesta){
		propuesta.tipoPropuesta.deshacerPropuesta(propuesta);
		propuestasPendientes.add(propuesta); //Entiendo que vuelve a quedar ahí disponible para hacerse
		propuestasAceptadas.remove(propuesta);
	}
	
	
	public void agregarUnGuardarropas(Guardarropas guardarropas){
		this.guardarropas.add(guardarropas)
	}

	
	public void recibirPropuesta(Propuesta propuesta){
		this.propuestasPendientes.add(propuesta);
	}
} 

public class Propuesta{ //Data class que me permite ganar abstracción
	TipoPropuesta tipo;
	Prenda prenda;
	Guardarropas guardarropas;
	
	public Propuesta(Prenda prenda, TipoPropuesta tipo, Guardarropas guardarropas){
		this.prenda = prenda;
		this.tipo = tipo;
		this.guardarropas = guardarropas;
	}
	
	public void concretarPropuesta(){
		this.tipo.concretarPropuesta(this);
	}
}

public enum TipoPropuesta{
	AGREGAR, ELIMINAR
	
	AGREGAR.concretarPropuesta(Propuesta propuesta){
		propuesta.getGuardarropas.agregarPrenda(propuesta.getPrenda);
	}
	AGREGAR.deshacerPropuesta(Propuesta propuesta){
		propuesta.getGuardarropas.eliminarPrenda(propuesta.getPrenda);
	}
	
	ELIMINAR.concretarPropuesta(Propuesta propuesta){
		propuesta.getGuardarropas.eliminarPrenda(propuesta.getPrenda);
	}
	ELIMINAR.deshacerPropuesta(Propuesta propuesta){
		propuesta.getGuardarropas.agregarPrenda(propuesta.getPrenda);
	}
