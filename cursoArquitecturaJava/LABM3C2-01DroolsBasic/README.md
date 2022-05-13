## Plugin de Drools para Eclipse

Lo descripto en esta sección no es necesario realizarlo ya que el proyecto se puede ejecutar sin problemas, lo que nos da la instalación de este plugin es poder visualizar y editar un archivo `.drl` mucho mejor.

Para poder adicionar el plugin de Drools en Eclipse seguir los siguientes pasos:

- Ir al menú `Help > Install New Software...`

- Presionar el botón `Add...`

- En el campo `Name` poner un nombre, por ejemplo Drools 7.

- En el campo `Location` poner la URL:
  
  `https://download.jboss.org/drools/release/7.46.0.Final/org.drools.updatesite/`

- Presionar el botón `Add`.

- Se mostrará la lista de plugins para Eclipse.

- Seleccionar los items necesarios y seguir con los siguientes pasos.

- Luego de la instalación, reiniciar el Eclipse.

*Fuente: [Drools 7.46.0.Final Update Site - Nightly Build Update Site: 7.46.0.Final](https://download.jboss.org/drools/release/7.46.0.Final/org.drools.updatesite/)*



## Para ejecutar el ejemplo

Para poder ejecutar sin errores el proyecto, copiar el archivo `basicRule.drl` a la unidad `D:` si es `Windows` o en su defecto, modificar el archivo `TestBasicRule.java` en la línea donde se indica la ubicación física del archivo tanto para `Windows` como para `Linux`, el cual estará al inicio del método `prueba2`.

Para ejecutar el ejemplo, abrir el archivo `TestBasicRule.java` en donde se encuentra el código principal.
