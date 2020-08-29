package com.example.springevent.suscriptor;

import com.example.springevent.dto.MensajeApplicationEventDto;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConApplicationListenerSincrono
    implements ApplicationListener<MensajeApplicationEventDto> {

  /*
  * Al implementar onApplicationEvent de ApplicationListener<ApplicationEvent>, se obtiene el evento
  * que se manda desde com.example.springevent.publicador.Publicador.publicarMensaje()
  * */

  @Override
  public void onApplicationEvent(MensajeApplicationEventDto event) {
    System.out.println("\n---------------------");
    System.out.println(
        this.getClass().getName() + ":" + event.getMensaje()
            + " hilo:" +Thread.currentThread().getName());
    System.out.println("---------------------");
  }
}
