# Conversor de Monedas 💵

Este programa Java permite convertir entre varias monedas utilizando la API de ExchangeRate-API, proporcionando una forma sencilla y eficiente de realizar conversiones de divisas en tiempo real.

## 🚀 Iniciar la Aplicación

Conversor de Monedas en Java - Oracle y Alura Challenge es un proyecto desarrollado para el segundo desafío de programación de Oracle Next Generation (ONE) de Alura. El programa permite a los usuarios convertir entre diferentes monedas usando tasas de cambio actuales para ver el historial de conversiones realizadas.

## 🌟Principales Funcionalidades:
- 🛠️ **Convertir Monedas:** Convierte una cantidad de una moneda a otra usando tasas de cambio actuales.

- 🛠️ **Manejo de Errores:** Validación de entradas para asegurar que las opciones de moneda sean válidas y los montos sean números válidos.

## 💻 Tecnologías Utilizadas

- 📜 **Lenguaje:** Java 17
- 🌍 **API de Tasas de Cambio:** ExchangeRate-API
- 🔄 **Manejo de JSON:** Gson (Versión 2.8.8)
- 📡 **HTTP Client:** Java HttpClient

# 📋 Requisitos

- 📦 JDK 11 o superior
- 🌐 Acceso a Internet para consultar la API de ExchangeRate-API

# 🔧 Instalación
Sigue estos pasos para configurar y ejecutar el proyecto en tu máquina local:

# 📥 Clona el Repositorio
bash

    git clone https://github.com/AngieCaroP/Challenge-Conversor-de-Monedas

##  🛠️ Abre el Proyecto en IntelliJ IDEA
Abre IntelliJ IDEA.
Selecciona "Open" y navega al directorio donde clonaste el repositorio.
Abre el proyecto.

# 🔑  Agrega tu API Key
Reemplaza "TU_API_KEY" en el archivo Main.java con tu clave de API de ExchangeRate-API.

    String apiKey = "TU_API_KEY";

    String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

## 📁  Estructura del Proyecto
El proyecto incluye los siguientes archivos principales:

- **Conversor.java:** Clase principal del programa que maneja la conversión de monedas y la interacción con el usuario.
- **MonedaUtil.java:** Representa un registro de una conversión de moneda, incluyendo detalles como la cantidad, monedas involucradas, tasa de conversión y timestamp.

## 📜 Menú de Opciones
El programa mostrará un menú con las siguientes opciones:

    1) Dólar --> Peso chileno
    2) Peso chileno --> Dólar
    3) Dólar --> Peso argentino
    4) Peso argentino --> Dólar
    5) Dólar --> Real brasileño
    6) Real brasileño --> Dólar  
    7) Peso Colombiano --> Dólar
    8) Dólar --> Peso Colombiano
    10) Peso mexicano--> Dólar
    11) Dólar -->Peso mexicano
    12) Salir

# 📧 Autora

- **Carolina Pantoja**
- [LinkedIn](https://www.linkedin.com/in/carolina-pantoja-716184144)
- **Formación:** Java Orientado a Objetos G6 - ONE
- **Alura Latam**
- **Oracle Next Education**
