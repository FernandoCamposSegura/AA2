# AA2
Proyecto para la AA de Entornos de desarrollo

En este proyecto he desarrollado un Kiosco virtual en el que se pueden administrar las entredas de nuevos escritos. 
El proyecto dispone de 3 clases (Book, Magazine, Newspaper) con 5 atributos personales donde uno de ellos los diferencia unívocamente
del resto de instancias de la misma clase.
A través de un menú interactivo por consale, se pueden registrar productos de las 3 clases y agregarlos a una ArrayList para almacenar los datos
y mostrarlos cuando sea necesario.

También he llevadoa a cabo un Job en Jenkins de manera que se puedan lanzar análisis desde la plataforma y configurado el proyecto para poder compilar, 
testear y empaquetar el mismo. He agregado la ruta del git y configurado el JDK. Para ello he tenido que desarrollar los test necesarios en JUnit para comprobar que los
objetos de las clases se instanciaban correctamente y que el método equals cumplí con la función requerida.

A través de un token he sincronizado sonarqube para que se pueda lanzar un análisis de este desde el mismo Job de Jenkins.

He lanzado análisis desde VisualVM monitorizando el rendimiento de la aplicación java y he dispuesto maven para todo lo requerido en el proyecto.

He generado las ramas pertinentes a lo largo del proyecto que he necesitado para trabajar las distintas funcionalidad y posteriormente las he compactado a la 
rama 'develop' a través de un pull request.

A lo largo del proyecto he recogido algunos bugs y los he registrado a través de los issues que posteriormente he cerrado al ir solventando los problemas que proponían.

Para terminar he preparado un release del proyecto para poder descargar la primera versión de este.

@Fernando Campos Segura
