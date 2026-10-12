# Gestión colaborativa de proyectos Java con GitHub e IntelliJ IDEA

Leer esta guia completamente antes de iniciar. Los tiempos que se incluyen para cada actividad son estimados.

## 1. Propósito

Gestionar el ciclo básico de desarrollo colaborativo de una aplicación Java utilizando las funciones de integración de Git y GitHub de IntelliJ IDEA, aplicando buenas prácticas de versionado, documentación, trabajo con ramas y revisión de cambios.

### Resultados de aprendizaje

Al finalizar, podrás:

1. Configurar Git y conectar su cuenta de GitHub con IntelliJ IDEA.
2. Crear, compartir y clonar repositorios remotos.
3. Reconocer archivos que deben y no deben incluirse en un repositorio Java/Gradle.
4. Preparar un `.gitignore` adecuado y un `README.md` reproducible.
5. Crear commits significativos y consultar el historial y las diferencias.
6. Trabajar en ramas, publicar cambios y realizar pull requests.
7. Integrar contribuciones y resolver un conflicto sencillo.

## 2. Planteamiento del problema

El equipo desarrollará **Gestor de tareas**, una aplicación Java de consola que administra tareas personales. El producto mínimo permitirá registrar una tarea, listar tareas y marcar una tarea como completada. Cada integrante implementará una funcionalidad en una rama y propondrá su incorporación mediante un *pull request*.

El propósito principal es practicar el flujo de colaboración. Se permite una implementación simple, con almacenamiento en memoria y/o archivos. Se recomienda el uso de colecciones, manejo de excepciones.

## 3. Preparación (*15 min*)

1. Verificar la instalación de Git con `git --version` y la disponibilidad del JDK.
2. Abrir IntelliJ IDEA y revisar **Settings/Preferences → Version Control → Git**; configure la ruta de Git y ejecute **Test**.
3. Cosultar: [Getting started with Git in IntelliJ IDEA](https://www.jetbrains.com/help/idea/working-with-git-tutorial.html) y [About repositories](https://docs.github.com/en/repositories/creating-and-managing-repositories/about-repositories)
4. En **Settings/Preferences → Version Control → GitHub**, agregue su cuenta con el mecanismo de autenticación disponible (por ejemplo, inicio de sesión en navegador/token). No comparta tokens ni contraseñas.
5. Tutorial: [Set up a GitHub account](https://www.jetbrains.com/help/idea/set-up-a-github-account.html)
5. Comprobar que puede acceder a GitHub. Si el nombre de los menús cambia según la versión de IntelliJ IDEA, utiliza la búsqueda de acciones.
6. Configurar su identidad local, si aún no lo ha hecho:

```bash
git config --global user.name "Nombre Apellido"
git config --global user.email "correo-asociado-a-sus-commits@example.com"
```

**Evidencia:** breve registro en `README.md` de las versiones de Java, Git e IntelliJ utilizadas; no incluir capturas que revelen credenciales.

## 4. Crear el proyecto y decidir qué versionar (*20 min*)

**Nota:** Esto lo puede hacer un integrante del equipo para despues compartir en GitHub.

1. Cree un proyecto Java con Gradle llamado `gestor-tareas`.
2. Compruebe que el proyecto puede ejecutarse con el *Gradle Wrapper*. Esto se puede verificar con el programa *Hola Mundo* que por default crea IntelliJ.
3. Active Git desde **VCS → Enable Version Control Integration** (o la acción equivalente), si IntelliJ no lo hizo automáticamente.
4. Cree un archivo `.gitignore` en la raíz. Como punto de partida:

```gitignore
# Archivos generados
.gradle/
build/
out/

# Archivos locales del IDE
.idea/
*.iml

# Archivos del sistema operativo
.DS_Store
Thumbs.db

# Secretos y configuración local
.env
*.local
```

**Importante:** la exclusión de `.idea/` es una política conservadora para esta práctica; algunos equipos versionan archivos compartibles específicos del IDE. Acuerden una política antes de colaborar.

### Archivos que normalmente deben versionarse

| Versionar | No versionar normalmente |
|---|---|
| `src/main/java/` y `src/test/java/` | `build/`, `out/`, `.gradle/` |
| `build.gradle` o `build.gradle.kts` | Archivos temporales y registros locales |
| `settings.gradle` o `settings.gradle.kts` | Credenciales, tokens, `.env` |
| `gradlew`, `gradlew.bat` | Configuración local no compartible del IDE |
| `gradle/wrapper/gradle-wrapper.properties` | Archivos compilados generados |
| `gradle/wrapper/gradle-wrapper.jar` | Dependencias descargadas a caché |
| `README.md`, `.gitignore` | Datos privados de usuarios |

**Nota:** `gradle-wrapper.jar` **sí debe versionarse** en un proyecto Gradle convencional para que el Wrapper funcione de forma reproducible. Antes de incorporarlo, confirme que proviene de una fuente confiable. Un `.gitignore` no elimina archivos ya rastreados; para dejar de rastrear uno use `git rm --cached <ruta>` y registre el cambio.

**Preguntas:** ¿Por qué no se sube `build/`? ¿Por qué sí se conserva `gradle-wrapper.jar`? ¿Qué riesgo implica subir una clave API?

## 5. Crear README y publicar el repositorio (*20 min*)

Redactar `README.md` con estas secciones (Se debe actualizar conforme se avanze en el desarrollo del proyecto):

```markdown
# Gestor de tareas

## Integrantes 
## Descripción
## Requisitos
## Instalación y ejecución
## Funcionalidades y responsbles
## Estructura del proyecto
## Flujo de colaboración
## Pruebas
## Preguntas de reflexión

```

1. Inspeccione los cambios en la ventana **Commit**.
2. Haga el primer commit: `Inicializar proyecto Gradle y documentación`.
3. Use **Git → GitHub → Share Project on GitHub** (o la acción equivalente) para crear el repositorio remoto.
4. Verifique desde el navegador que los archivos esperados aparecen en GitHub y que no se publicaron secretos ni carpetas generadas.
5. Invite a sus compañeros como colaboradores o configure el flujo de colaboración permitido por el docente.

**Evidencia:** Enlace del repositorio y primer commit identificable.

## 6. Clonar y gestionar el repositorio remoto (*15 min*)

Cada integrante del equipo debe:

1. Usar [**Get from VCS** / **Clone Repository**](https://www.jetbrains.com/help/idea/set-up-a-git-repository.html#clone-repo) e introducir la URL del repositorio.
2. Abrir el proyecto en IntelliJ y esperar la sincronización de Gradle.
3. Ejecutar la aplicación o la clase inicial.
4. Identificar las operaciones [**Fetch**](https://www.jetbrains.com/help/idea/sync-with-a-remote-repository.html#fetch), [**Pull**](https://www.jetbrains.com/help/idea/sync-with-a-remote-repository.html#pull)  y [**Push**](https://www.jetbrains.com/help/idea/commit-and-push-changes.html) en la interfaz.
5. Consultar el historial en la ventana **Git → Log**.

**Nota:** `fetch` descarga referencias sin integrar cambios; `pull` obtiene e integra los cambios en la rama actual; `push` publica commits locales en el remoto.

## 7. Actividad integradora: desarrollo por ramas (*45 min*)

Distribuyan el trabajo:

| Rol | Rama sugerida | Funcionalidad |
|---|---|---|
| Integrante A | `feature/registrar-tarea` | Crear una tarea con descripción y estado pendiente |
| Integrante B | `feature/listar-tareas` | Mostrar todas las tareas y sus estados |
| Integrante C | `feature/completar-tarea` | Marcar una tarea existente como completada |

En equipos de dos, distribuyan las tres funcionalidades entre ambos integrantes.

Referencias:
- GitHub: [Managing branches within your repository](https://docs.github.com/en/pull-requests/how-tos/commit-changes/managing-branches-within-your-repository) y [Creating a pull request](https://docs.github.com/en/pull-requests/how-tos/create-pull-requests/creating-a-pull-request)
- IntelliJ: [Manage Git branches](https://www.jetbrains.com/help/idea/manage-branches.html) y [Create and merge GitHub pull requests](https://www.jetbrains.com/help/idea/create-and-merge-github-pull-requests.html)

### Procedimiento por integrante

1. Sincronizar la rama principal antes de iniciar.
2. Crear su rama desde la rama principal actualizada, usando la interfaz de ramas de IntelliJ.
3. Implementar su funcionalidad en Java; mantenga el código organizado en métodos y clases con nombres descriptivos.
4. Agregar al menos una prueba automatizada o una secuencia de prueba manual documentada por funcionalidad.
5. Revisar el [**Diff**](https://www.jetbrains.com/help/idea/comparing-file-versions.html) antes de confirmar los cambios.
6. Crear uno o más commits específicos, por ejemplo `feat: agregar registro de tareas`.
7. Publique la rama con **Push**.
8. Abra un [**pull request**](https://www.jetbrains.com/help/idea/create-and-merge-github-pull-requests.html#create-pull-request) hacia `main` en GitHub; describa qué cambió, cómo se probó y qué queda pendiente.
9. Solicitar a otro integrante una revisión. El revisor debe dejar al menos un comentario significativo.
10. Atienda la revisión e integre el pull request cuando cumpla los criterios acordados.

**Criterios de aceptación del producto:** Permite crear al menos tres tareas, listarlas y marcar una como completada; el programa no debe terminar inesperadamente por una opción de menú inválida.

**Regla de colaboración:** no trabajar directamente en `main` para implementar funcionalidades; integrar mediante pull requests. Evite commits que mezclen cambios no relacionados.

## 8. Resolver un conflicto controlado (*20 min*)

**Solo después de integrar las funcionalidades:** dos integrantes crean ramas diferentes a partir de la misma versión de `main` y modifican **la misma línea** de un mensaje de bienvenida en `README.md` o en una constante Java.

1. El integrante A publica e integra primero su cambio.
2. El integrante B intenta integrar el suyo y observa el conflicto, si se produce.
3. Actualiza su rama con los cambios de `main` mediante el procedimiento acordado (merge o rebase).
4. Utiliza el editor de conflictos de IntelliJ para decidir el contenido final.
5. Verifica que el archivo resultante sea correcto, ejecuta las pruebas y registra la resolución.
6. Actualiza el pull request e integra los cambios.

**Nota:** no usar `push --force` sobre ramas compartidas para resolver el conflicto. Documente en `README.md` el origen del conflicto y el criterio utilizado para resolverlo.

## 9. [Buenas prácticas](https://docs.github.com/en/repositories/creating-and-managing-repositories/best-practices-for-repositories) y cierre (*15 min*)

Realice una auditoría final del repositorio:

- El proyecto se puede clonar y ejecutar siguiendo el README.
- No contiene credenciales ni archivos generados innecesarios.
- Los commits describen cambios concretos.
- Las ramas de funcionalidades se integraron mediante pull requests revisados.
- El historial permite reconocer las contribuciones de los integrantes.
- Se registraron las pruebas y el ejercicio de conflicto.
- La rama principal contiene una versión funcional.

### Preguntas de reflexión

1. ¿Qué diferencia existe entre Git y GitHub?
2. ¿Por qué conviene revisar `git diff` antes de hacer commit?
3. ¿Cuál es la diferencia entre commit y push?
4. ¿Qué función tiene `.gitignore` y qué limitación presenta?
5. ¿Por qué se versiona el Gradle Wrapper?
6. ¿Cómo ayuda el README a que otra persona reproduzca el proyecto?
7. ¿Qué aportan las ramas y los pull requests al control de calidad?
8. ¿Cómo se resolvió el conflicto y qué medidas podrían evitar conflictos innecesarios?

## 10. Entregables

1. **URL del repositorio de GitHub** que debe estar accesible.
2. Aplicación Java funcional con las tres características solicitadas.
3. `README.md` completo y `.gitignore` pertinente.
4. Historial con commits significativos de cada participante.
5. Al menos un pull request revisado por funcionalidad.
6. Evidencia del conflicto y su resolución (descripción y enlaces a commits o pull requests).
7. Instrucciones de ejecución y evidencia de pruebas.

## 11. Rúbrica de evaluación

| Criterio | Ponderación |
|---|---:|
| Configuración de Git/GitHub y gestión del repositorio desde IntelliJ | 10 % |
| Selección de archivos versionados y uso correcto de `.gitignore` | 15 % |
| README reproducible y documentación | 10 % |
| Implementación de las funcionalidades Java y pruebas | 20 % |
| Commits, ramas y sincronización con el remoto | 15 % |
| Pull requests y revisión colaborativa | 15 % |
| Resolución y explicación del conflicto | 10 % |
| Reflexión técnica y calidad de entrega | 5 % |
| **Total** | **100 %** |

**Nota:** Se puede incluir este documento en el repositorio. No modificar.
