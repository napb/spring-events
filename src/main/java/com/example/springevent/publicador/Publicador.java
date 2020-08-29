package com.example.springevent.publicador;

import com.example.springevent.dto.MensajeApplicationEventDto;
import com.example.springevent.dto.MensajeDto;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Publicador {

  private final ApplicationEventPublisher applicationEventPublisher;

  public void publicarMensaje(MensajeDto mensaje) {
    applicationEventPublisher.publishEvent(
        new MensajeApplicationEventDto(this, mensaje.getMensaje()));
  }
}
