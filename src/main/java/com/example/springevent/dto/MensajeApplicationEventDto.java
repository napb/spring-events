package com.example.springevent.dto;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class MensajeApplicationEventDto extends ApplicationEvent {

  private String mensaje;

  /**
   * Create a new {@code ApplicationEvent}.
   *
   * @param source the object on which the event initially occurred or with
   *               which the event is associated (never {@code null})
   */
  public MensajeApplicationEventDto(Object source, String mensaje) {
    super(source);
    this.mensaje = mensaje;
  }
}
