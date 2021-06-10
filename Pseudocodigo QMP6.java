
public class Usuario{
  //implementación de iteraciones anteriores
  RecomendacionDelDia recomendacionDiaria;

  public void actualizarRecomendacion(RecomendacionDelDia recomendacion){
    this.recomendacionDiaria = recomendacion;
  }
}

public class RecomendacionDelDia{
  //Debería tener info de qué implica -> Un string con un mensaje? Tipo "No salgas en auto que hay probabilidad de granizo!"?
}

public class RepositorioDeAlertasMeteorológicasVigentes{
  private List<AlertaMeteorologica> alertas;

  public void consultarAlertas(){
    return this.alertas;
  }

  public void actualizarAlertas(){
    //aquí debería llamar al servicio meteorológico que tengo para que me de las vigentes?
  }
}

public class AlertaMeteorologica{
  boolean publicada;

  public void publicar(){
    this.publicada = true;
  }

  public void notificarUsuarios(){
    //Va acá???
  }

}

public interface AccionAlerta {

  public void notificar();

}

public class Notificacion implements AccionAlerta{
  NotificationService notificador;

  public void notificar(){
    notificador.notify(); //Completar
  }
}

public class Mail implements AccionAlerta{
  MailSender mailSender;

  public void notificar(){
    this.mailSender.sendEmail(address,message);
  }
}

public class Recalculo implements AccionAlerta{
  MailSender mailSender;

  public void notificar(){
    //qué haría?? una notificacion?
  }

  public void actualizarRecomendacion(){
    //TODO
  }
}
