package br.com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor {
  
  @Id
  private Long id;
  
  private String nome;  

}
