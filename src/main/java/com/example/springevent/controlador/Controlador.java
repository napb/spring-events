package com.example.springevent.controlador;

import com.example.springevent.dto.MensajeDto;
import com.example.springevent.service.Servicio;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador")
@AllArgsConstructor
public class Controlador {

  private final Servicio servicio;

  //curl --location --request POST 'localhost:8080/controlador/publicadorMensajes' \--header 'Content-Type: application/json' \--data-raw '{"mensaje":"hola mundooooo!"}'
  @PostMapping("/publicadorMensajes")
  public ResponseEntity<Void> publicadorMensajes(@RequestBody MensajeDto mensajeDto) {
    servicio.crearMensaje(mensajeDto);
    return ResponseEntity.ok(null);
  }
}
