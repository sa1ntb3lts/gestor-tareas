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

Santiago Beltrán Astorga 225203551  
César Uriel Aguiar Altamirano 225204109  
Uriel Nahúm Santos Vásquez 225204882

## Descripción <a name="descripcion"></a>

Gestor de tareas es una aplicación Java de consola que administra tareas personales. Permite registrar una tarea, listar tareas y marcar una tarea como completada.

## Requisitos <a name="requisitos"></a>

- Java Development Kit 
- Git 

**Las versiones utilizadas durante el desarrollo fueron Java 27 y Git 2.56.0.**

## Instalación y ejecución <a name="instalacionyejecucion"></a>

### 1. Clonar el repositorio:

Copia este comando y pégalo en tu terminal: 

```text
git clone https://github.com/sa1ntb3lts/gestor-tareas.git
```

### 2. Ejecutar el código:  

En la misma terminal, debes asegurarte de estar en la dirección raíz del repositorio (`gestor-tareas`). Luego, utiliza el comando correspondiente a tu sistema operativo:

**Linux/MacOS:**  

```text
./gradlew run
```

**Windows:**

```text
gradlew.bat run
```

## Funcionalidades y responsables <a name="funcionalidadesyresponsables"></a>

1. Registrar tarea - César Uriel
2. Listar tareas - Uriel Nahum
3. Marcar tarea - Santiago

## Estructura del proyecto <a name="estructuradelproyecto"></a>

```text
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
│       ├── gradle-wrapper.jar  
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

1. ¿Qué diferencia existe entre Git y GitHub? **GitHub es una plataforma para compartir código y repositorios; Git es una herramienta de software para el control de versiones local.**
2. ¿Por qué conviene revisar `git diff` antes de hacer commit? **Para verificar con precisión cuáles cambios específicos se han realizado antes de confirmarlos.**
3. ¿Cuál es la diferencia entre commit y push? **Commit guarda y comenta los cambios de forma local, mientras que push sube esos commits al repositorio remoto.**
4. ¿Qué función tiene `.gitignore` y qué limitación presenta? **Es un archivo de configuración para indicarle a Git qué archivos o carpetas no debe rastrear, pero no elimina archivos que ya hayan sido rastreados previamente.**
5. ¿Por qué se versiona el Gradle Wrapper? **Para asegurar que todos los desarrolladores utilicen exactamente la misma versión de Gradle de forma reproducible.**
6. ¿Cómo ayuda el README a que otra persona reproduzca el proyecto? **Proporciona el contexto del proyecto y las instrucciones paso a paso para compilar y ejecutar el programa correctamente.**
7. ¿Qué aportan las ramas y los pull requests al control de calidad? **Las ramas evitan modificar directamente la rama principal (previniendo errores en código estable) y los pull requests permiten revisar y discutir los cambios antes de integrarlos.**
8. ¿Cómo se resolvió el conflicto y qué medidas podrían evitar conflictos innecesarios? **Se tomó la rama de desarrollo actualizada y se fusionó a `main`. Trabajar en ramas independientes y mantener la rama local sincronizada son excelentes medidas para evitar conflictos.**
