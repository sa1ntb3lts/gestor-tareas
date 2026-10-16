# Gestor de Tareas 📋

## TABLA DE CONTENIDOS

1. [Integrantes](#integrantes)
2. [Descripción](#descripcion)
3. [Requisitos](#requisitos)
4. [Instalación y ejecución](#instalacionyejecucion)
5. [Funcionalidades y responsables](#funcionalidadesyresponsables)
6. [Estructura del proyecto](#estructuradelproyecto)
7. [Flujo de colaboración](#flujodecolaboracion)
8. [Pruebas](#pruebas)
9. [Preguntas de reflexión](#preguntasdereflexion)

## Integrantes <a name="integrantes"></a>

Santiago Béltran Astorga 225203551  
César Uriel Aguiar Altamirano 225204109  
Uriel Nahúm Santos Vásquez 225204882

## Descripción <a name="descripcion"></a>

Gestor de tareas es una aplicación Java de consola que administra tareas personales. Permite registrar una tarea, listar tareas y marcar una tarea como completada.

## Requisitos <a name="requisitos"></a>

- Java Development Kit 
- Git 

**Las versiones utilizadas durante el desarrollo fueron java 27 y git 2.56.0.**

## Instalación y ejecución <a name="instalacionyejecucion"></a>

### 1. Clonar el repositorio:

Copia éste comando y pégalo en tu terminal: 

``` text
git clone https://github.com/sa1ntb3lts/gestor-tareas.git
```

### 2. Ejecutar el código:  

En la misma terminal, debes asegurarte de estar en la dirección raíz del repositorio (gestor-tareas). Luego, utiliza el comando correspondiente a tu sistema operativo:

**Linux/MacOS:**  

``` text
./gradlew run
```

**Windows:**

``` text
gradlew.bat run
```

## Funcionalidades y responsables <a name="funcionalidadesyresponsables"></a>

1. Registrar tarea - César Uriel
2. Listar tareas - Uriel Nahum
3. Marcar tarea - Santiago

## Estructura del proyecto <a name="estructuradelproyecto"></a>

``` text
gestor-tareas/  
├── src/  
│   └── main/  
│       └── java/
│           └── mx/
│               └── unison/
│                   ├── Gestor.java
│                   └── Tarea.java
├── gradle/  
│   └── wrapper/  
│       ├── graddle-wrapper.jar  
│       └── gradle-wrapper.properties  
├── .gitignore  
├── README.md  
├── build.gradle  
├── gradlew  
├── gradlew.bat
├── practica_guiada_github_intellij.md  
└── settings.gradle  
```

## Flujo de colaboración <a name="flujodecolaboracion"></a>

- Trabajar en ramas independientes.
- Commits significativos.
- Publicar y solicitar revisión.
- Integrar y resolver conflictos.

## Pruebas <a name="pruebas"></a>



## Preguntas de reflexión <a name="preguntasdereflexion"></a>

1. ¿Qué diferencia existe entre Git y GitHub? **GitHub es una plataforma para compartir codigo y repositorios, Git es una herramienta de desarrollo de software para controlar versiones.**
2. ¿Por qué conviene revisar git diff antes de hacer commit? **Para revisar los cambios que se han realizado al repositorio.**
3. ¿Cuál es la diferencia entre commit y push? **Commit sirve para comentar los cambios que se han hecho a ciertos archivos del repositorio, push es para subir los cambios al repositorio.**
4. ¿Qué función tiene .gitignore y qué limitación presenta? **Es un archivo de configuracion para indicarle al repositorio que archivos se deben de ignorar, pero no los elimina.**
5. ¿Por qué se versiona el Gradle Wrapper? **Le da la misma version de Gradle a todos los contribuidores.**
6. ¿Cómo ayuda el README a que otra persona reproduzca el proyecto? **El README tiene varias funciones, una de ellas es incluir indicaciones sobre como compilar el programa para correrlo.**
7. ¿Qué aportan las ramas y los pull requests al control de calidad? **Las ramas son muy utiles para no modificar la principal, evitando posibles errores en el codigo. Pull request es para ver si los cambios hechos en otro branch o archivo deberia subirse.**
8. ¿Cómo se resolvió el conflicto y qué medidas podrían evitar conflictos innecesarios? ****
