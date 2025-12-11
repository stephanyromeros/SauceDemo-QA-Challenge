# SauceDemo QA Automation Project (Serenity BDD + Cucumber + Allure)

Este proyecto demuestra la automatización de un flujo de compra completo en la aplicación de SauceDemo, utilizando el patrón Screenplay (Serenity BDD) y Java. Genera reportes interactivos con Allure Reports.

## Objetivo

El objetivo principal es verificar el flujo completo de e-commerce (login, adición al carrito y checkout), además de validar escenarios negativos de login.

## Tecnologías Utilizadas

* **Lenguaje:** Java
* **Framework:** Serenity BDD 3.x (Screenplay Pattern)
* **BDD:** Cucumber (Gherkin Syntax)
* **Gestor de Dependencias:** Gradle
* **Reportes:** Allure Reports

## Prerrequisitos

Para ejecutar este proyecto localmente, necesitas:

1.  **Java Development Kit (JDK):** Versión 23.
2.  **Git:** Para clonar el repositorio.
3.  **Allure CLI:** (Herramienta de línea de comandos) Instalado globalmente y agregado al PATH de Windows para que el comando `allure serve` funcione.

## Configuración e Instalación

1.  **Clonar el Repositorio:**
    ```bash
    git clone https://github.com/stephanyromeros/SauceDemo-QA-Challenge.git
    cd SauceDemo-QA-Challenge
    ```

2.  **Sincronizar Gradle:** Abre el proyecto en tu IDE (IntelliJ) para que Gradle descargue todas las dependencias.

##  Ejecución de Pruebas

Para ejecutar el flujo completo y generar el reporte interactivo de Allure, sigue estos dos comandos en secuencia desde tu terminal (CMD o PowerShell) en la carpeta raíz del proyecto:

### Paso 1: Ejecutar los Tests y Generar Resultados

Este comando ejecuta todos los escenarios definidos en los archivos `.feature`.

```bash
# Usar el wrapper de Gradle
.\gradlew clean test

```

### Paso 2: Generar y Visualizar el Reporte
```bash
allure serve
