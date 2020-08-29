package com.example.springevent.service;

import com.example.springevent.dto.MensajeDto;
import com.example.springevent.publicador.Publicador;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Servicio {

  private final Publicador publicador;

  public void crearMensaje(MensajeDto mensajeDto) {
    publicador.publicarMensaje(mensajeDto);
  }
}
