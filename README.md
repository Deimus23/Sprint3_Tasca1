# Proyecto de Gestión de Comandos con Deshacer (Undo)

Este proyecto implementa una clase `Undo` que replica el funcionamiento del comando 'Deshacer'. La clase `Undo` es utilizada por la clase `Main`, que permite introducir opciones por consola para añadir, eliminar y listar comandos.

## Funcionalidad

La clase `Undo` proporciona las siguientes funcionalidades:

1. **Añadir Comando:** Permite añadir un comando al historial.
2. **Eliminar Último Comando:** Permite eliminar el último comando añadido.
3. **Listar Comandos:** Muestra el historial de comandos añadidos.

Esta clase implementa el patrón de diseño Singleton para asegurar que solo haya una única instancia de la clase `Undo`.

## Estructura de las Clases

- `Undo.java`: Contiene la implementación de la clase `Undo`.
- `Main.java`: Implementa una interfaz por consola que permite al usuario interactuar con la clase `Undo`.

## Cómo Utilizar

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/tu_usuario/proyecto-gestion-comandos.git
   cd proyecto-gestion-comandos
