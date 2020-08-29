package com.example.springevent.suscriptor;

import com.example.springevent.dto.MensajeApplicationEventDto;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConAtEventListenerSincrono {

  /*
  * Con que se tenga la anotacion @EventListener, se recibe MensajeApplicationEventDto
  * desde com.example.springevent.publicador.Publicador.publicarMensaje()
  * */

  @EventListener
  public void onApplicationEvent(MensajeApplicationEventDto event) {
    System.out.println("\n---------------------");
    System.out.println(
        this.getClass().getName() + ":" + event.getMensaje()
        + " hilo:" +Thread.currentThread().getName());
    System.out.println("---------------------");
  }
}
