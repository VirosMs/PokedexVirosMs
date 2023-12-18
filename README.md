# PokedexVirosms


![Logo](https://github.com/VirosMs/PokedexVirosMs/assets/94723454/707f496c-3b03-4f56-9a3c-db9dbdf6a4cd)


## Descripción del Proyecto

Este proyecto es una aplicación de Pokedex desarrollada en Kotlin utilizando el framework Jetpack Compose para la interfaz de usuario y Hilt para la inyección de dependencias. La aplicación muestra una lista de Pokemon que se pueden buscar y seleccionar para ver detalles adicionales.

La aplicación consta de dos pantallas principales:

- `PokemonListScreen`: Muestra una lista de Pokemon. Los usuarios pueden buscar Pokemon por nombre utilizando la barra de búsqueda en la parte superior de la pantalla.

- `PokemonDetailScreen`: Muestra detalles sobre un Pokemon seleccionado, incluyendo su imagen, tipo, peso, altura y estadísticas base.

## Screenshots


![App Screenshot](https://github.com/VirosMs/PokedexVirosMs/assets/94723454/09c11199-367e-4304-a477-e3a0532ac665)

## Configuración

Para ejecutar este proyecto, necesitarás tener instalado Android Studio y el SDK de Android en tu máquina.

## Dependencias

Este proyecto depende de varias bibliotecas, incluyendo [Jetpack Compose](https://developer.android.com/jetpack/compose) para la interfaz de usuario, [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) para la inyección de dependencias, [Retrofit](https://square.github.io/retrofit/) para las solicitudes de red, y [Coil](https://coil-kt.github.io/coil/compose/) para la carga de imágenes. Todas estas dependencias están definidas en el archivo `build.gradle` del módulo de la aplicación.

## Ejecución

Para ejecutar este proyecto, abre el proyecto en Android Studio y haz clic en el botón "Run" en la barra de herramientas. Asegúrate de tener un dispositivo Android conectado o un emulador Android configurado para ejecutar la aplicación.

## Cómo funciona

Cuando ejecutas la aplicación, se muestra la pantalla `PokemonListScreen`. Aquí, puedes buscar Pokemon por nombre utilizando la barra de búsqueda en la parte superior de la pantalla. Al seleccionar un Pokemon de la lista, se te redirige a la pantalla `PokemonDetailScreen`, donde puedes ver detalles adicionales sobre el Pokemon seleccionado.

## Estructura del Proyecto

El proyecto consta de varios archivos principales:

- `PokemonListScreen.kt`: Esta es la pantalla que muestra la lista de Pokemon. Acepta comandos del usuario para buscar Pokemon y navegar a la pantalla de detalles de Pokemon.

- `PokemonDetailScreen.kt`: Esta es la pantalla que muestra los detalles de un Pokemon seleccionado.

- `PokemonListViewModel.kt` y `PokemonDetailViewModel.kt`: Estos son los ViewModel que manejan la lógica de negocio para las pantallas de lista y detalles de Pokemon, respectivamente.

## Contribuciones

Las contribuciones a este proyecto son bienvenidas. Si encuentras un error o tienes una sugerencia para mejorar el proyecto, por favor abre un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo los términos de la licencia GNU GENERAL PUBLIC LICENSE. Para más detalles, consulta el archivo [GPL-3.0 license](https://github.com/VirosMs/PokedexVirosMs?tab=GPL-3.0-1-ov-file) en el directorio raíz del proyecto.

## Instalación

Para instalar este proyecto, necesitarás tener Android Studio y el SDK de Android instalados en tu sistema. Aquí están los pasos para instalar y ejecutar el proyecto:

1. Clona el repositorio en tu máquina local usando Git:

```bash
git clone https://github.com/VirosMortais/pokedexvirosms.git
cd pokedexvirosms
```

2. Abre el proyecto en Android Studio.

3. Ejecuta el proyecto haciendo clic en el botón "Run" en la barra de herramientas de Android Studio. Asegúrate de tener un dispositivo Android conectado o un emulador Android configurado para ejecutar la aplicación.

## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)

## Authors

- [@VirosMS](https://github.com/VirosMs)
