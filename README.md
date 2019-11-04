# Conversor de Números Arabigos a Romanos

Se trata de una aplicación SpringBoot Multimodulo Maven (Arquitectura Hexagonal) con persistencia en una base de datos H2 (En Memoria).

#### Dependencias:
* Lombok
* H2

##### Cómo probar los sevicios:

* Para probar una conversión (Solo se pueden convertir números en el rango [0 - 4000]
  - http://localhost:8080/conversor-app/conversor/convertir?arabigo=1536
  
* Para consultar los registro creados en memoria base de datos H2
  - http://localhost:8080/conversor-app/h2-console
  
