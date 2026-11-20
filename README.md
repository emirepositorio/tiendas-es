# TIENDAS E.S

Sistema de gestión de inventario, ventas y deudas para las tiendas del barrio Ospina Pérez.

Proyecto de Programación Orientada a Objetos · Ingeniería de Sistemas · Universidad de Pamplona.
Autor: Jesus Emir Santafe Arevalo · Profesor: Miguel Eduardo Posada Haddad.

## Problema
Las tiendas llevan las deudas de los clientes y la mercancía que entra en un cuaderno, sin conexión con las ventas del día. Esto dificulta saber cuánto debe cada cliente, qué falta en el inventario y qué comprar.

## Objetivo general
Diseñar y desarrollar en Java, con Apache NetBeans y arquitectura MVC, un sistema que gestione el inventario, las ventas y las deudas de las tiendas del barrio, aplicando POO.

## Tecnologías
Java · Apache NetBeans · Java Swing · JDBC · MySQL

## Arquitectura MVC
| Capa | Paquete | Clases |
|---|---|---|
| Modelo | `modelo`, `dao` | Persona, Cliente, Producto, Venta, DetalleVenta, Deuda, Abono y sus clases DAO |
| Vista | `vista` | VentanaPrincipal, FormVenta, FormInventario, FormCreditos |
| Controlador | `controlador` | ControladorVenta, ControladorInventario, ControladorCredito |

## POO
Encapsulamiento (atributos privados con getters y setters), abstracción (Persona), herencia (Cliente extiende Persona), polimorfismo (`mostrarResumen()`), asociación (Venta con DetalleVenta).

## Estado del proyecto
En desarrollo. El paquete `modelo` contiene las clases del diseño; vista, controlador y dao se irán completando.

## Resultados esperados
1. Ventas de contado y a crédito registradas en un solo lugar, descontando el stock.
2. Saldo de cada cliente consultable al instante, con abonos y fecha límite.
3. Alerta automática de productos en stock mínimo.
4. Meta de registrar una venta de varios productos en menos de 1 minuto.
5. Datos conservados en la base de datos al cerrar el programa.
