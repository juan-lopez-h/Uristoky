# Epicas e Historias de usurio

## *Epica E-1 autenticacion y administracion de usuarios* 

Objetivo: permitir el acceso seguro a la plataforma y administrar los usuarios de cada organización. 

### Historia de usuario HU-1 
- Requisito relacionado: RF-01. [Requisitos](./Requisitos/RFyRNF.md)

Como usuario registrado, quiero iniciar sesión mediante mis credenciales para acceder a las funcionalidades de Uristoky.

Criterios de aceptacion: 
- El sistema debe permitir ingresar correo electrónico y contraseña
- El sistema debe validar las credenciales
- Si las credenciales son incorrectas, debe informar que no fue posible iniciar sesión
- Si las credenciales son correctas, debe permitir el acceso según los permisos del usuario
- Las contraseñas no deben almacenarse en texto plano.Las contraseñas no deben almacenarse en texto plano.
- El usuario pueda alternar mostrar u ocultar su contraseña mientras la escribe,

### Historia de usuario HU-2
- Requisito relacionado: RF-02. [Requisitos](./Requisitos/RFyRNF.mds)

Como usuario, quiero cerrar mi sesión para evitar que otras personas accedan a mi cuenta.

Criterios de aceptación:
- Debe existir una opción para cerrar sesión.
- Al cerrar sesión, las credenciales o el mecanismo de autenticación de la sesión deben dejar de ser válidos.
- El usuario debe ser redirigido a la pantalla de inicio de sesión
### Historia de usuario HU-3
- Requisito relacionado: RF-03. [Requisitos](./Requisitos/RFyRNF.mds)

Como administrador, quiero registrar, consultar, modificar y desactivar usuarios de mi organización para controlar quién tiene acceso a la plataforma.

Criterios de aceptación:
- El administrador puede registrar nuevos usuarios.
- Puede consultar el listado de usuarios de su organización.
- Puede modificar la información permitida de un usuario.
- Puede desactivar usuarios sin eliminar sus registros históricos.
- No puede administrar usuarios pertenecientes a otra organización.
### Historia de usuario HU-4
- Requisito relacionado: RF-04.  [Requisitos](./Requisitos/RFyRNF.mds)

Como administrador, quiero asignar roles a los usuarios para determinar qué operaciones pueden realizar dentro del sistema.

Criterios de aceptación:
- El sistema debe contemplar los roles administrador, usuario y solo lectura.
- El administrador puede asignar y modificar roles.
- El usuario solo puede ejecutar las operaciones autorizadas para su rol.
- El usuario de solo lectura no puede crear, modificar ni eliminar información.
- Los permisos deben validarse tanto en la interfaz como en el backend.

## Epica E-2 
Gestión de productos
Objetivo: permitir el registro y administración de los productos que conforman el inventario de una organización.
### HU-05. Registro de productos
- Requisito relacionado: RF-05.  [Requisitos](./Requisitos/RFyRNF.mds)

Como usuario autorizado, quiero registrar productos con sus características principales para mantener organizado el inventario.

Criterios de aceptación:
- El sistema debe permitir registrar nombre, código, descripción, categoría y unidad de medida.
- El sistema debe validar los campos obligatorios.
- El código del producto debe cumplir las reglas de unicidad.
- El producto debe quedar asociado a la organización correspondiente.
- El sistema debe informar si el registro fue exitoso o si ocurrió algún error.
### HU-06. Consulta de productos
- Requisito relacionado: RF-06.  [Requisitos](./Requisitos/RFyRNF.mds)

Como usuario, quiero consultar la información de los productos registrados para conocer sus características y estado.

Criterios de aceptación:
- El sistema debe mostrar los productos registrados en la organización.
- Debe permitir consultar la información detallada de cada producto.
- Debe mostrar su estado y las existencias disponibles cuando corresponda.
- No debe mostrar información de otras organizaciones.
### HU-07. Modificación de productos
- Requisito relacionado: RF-07.  [Requisitos](./Requisitos/RFyRNF.mds)

Como usuario autorizado, quiero modificar la información de un producto para mantener actualizados sus datos.

Criterios de aceptación:
- El sistema debe permitir modificar los atributos autorizados.
- Debe validar la información antes de guardar los cambios.
- Los cambios en los datos descriptivos no deben alterar los movimientos históricos.
- El sistema debe informar el resultado de la operación.
### HU-08. Desactivación de productos

- Requisito relacionado: RF-08.  [Requisitos](./Requisitos/RFyRNF.mds)

Como administrador, quiero desactivar productos que ya no se utilizan para evitar que aparezcan como productos activos sin perder su historial.

Criterios de aceptación:
- El sistema debe permitir cambiar el estado de un producto a inactivo.
- Los productos inactivos no deben aparecer en los registros operativos habituales.
- Su información y movimientos históricos deben conservarse.
- El sistema debe impedir desactivar productos cuando existan condiciones que comprometan la integridad de operaciones pendientes (actualizaciones, ventas en proceso, etc).
### HU-09. Administración de categorías
- Requisito relacionado: RF-09.  [Requisitos](./Requisitos/RFyRNF.mds)

Como administrador, quiero organizar los productos en categorías para facilitar su clasificación y consulta.

Criterios de aceptación:
- El sistema debe permitir crear y consultar categorías.
- Debe permitir modificar sus datos.
- Debe permitir desactivar categorías.
- Los productos deben poder asociarse a una categoría.
- No se deben eliminar categorías que estén relacionadas con información histórica sin aplicar las reglas de integridad correspondientes.

## EPICA E-3. Gestión de almacenes y ubicaciones
Objetivo: permitir la administración de múltiples almacenes y la distribución de productos en ubicaciones físicas.

### HU-10. Administración de almacenes

- Requisito relacionado: RF-10.  [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero registrar y administrar diferentes almacenes para representar los espacios físicos donde se encuentra la mercancía de mi organización.

Criterios de aceptación:
- El sistema debe permitir registrar almacenes.
- Debe permitir consultar y modificar sus datos.
- Debe permitir desactivar almacenes.
- Cada almacén debe pertenecer a una organización.
- El sistema debe conservar la información de los movimientos asociados al almacén.
### HU-11. Administración de ubicaciones

- Requisito relacionado: RF-11.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero crear ubicaciones dentro de cada almacén para identificar dónde se encuentran físicamente los productos.

Criterios de aceptación:
- El sistema debe permitir crear ubicaciones dentro de un almacén.
- Cada ubicación debe estar asociada a un único almacén.
- Debe permitir consultar, modificar y desactivar ubicaciones.
- Debe permitir identificar las existencias asociadas a cada ubicación.
### HU-12. Consulta de existencias por almacén

- Requisito relacionado: RF-12.   [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario, quiero consultar las cantidades disponibles de cada producto en los diferentes almacenes para conocer su distribución.

Criterios de aceptación:
- El sistema debe mostrar las existencias de un producto por almacén.
- Debe permitir consultar las existencias por ubicación.
- Las cantidades deben corresponder al resultado de los movimientos registrados.
- La consulta debe respetar los permisos del usuario.

## Epica E-04. Movimientos y control de inventario
Objetivo: registrar y controlar las operaciones que modifican las existencias de los productos.

### HU-13. Registro de entradas

- Requisito relacionado: RF-13.   [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario autorizado, quiero registrar entradas de mercancía para incrementar las existencias disponibles de los productos.

Criterios de aceptación:
- El sistema debe permitir seleccionar el producto y la cantidad que ingresa.
- Debe permitir identificar el almacén y la ubicación de destino.
- Debe registrar la fecha, el usuario responsable y el tipo de movimiento.
- La operación debe actualizar las existencias.
- El movimiento debe quedar registrado en el historial.
- La operación debe ser transaccional: si falla alguna parte del proceso, no debe quedar una actualización parcial.

### HU-14. Registro de salidas

- Requisito relacionado: RF-14.    [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario autorizado, quiero registrar salidas de mercancía para disminuir las existencias disponibles de los productos.

Criterios de aceptación:
- El sistema debe permitir seleccionar el producto, la cantidad y el almacén de origen.
- Debe registrar la fecha y el usuario responsable.
- Debe actualizar las existencias correspondientes.
- Debe generar un registro histórico del movimiento.
- No debe permitir cantidades negativas ni superiores a las existencias disponibles
- La operación debe ser transaccional.
### HU-15. Ajustes de inventario

- Requisito relacionado: RF-15.    [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero realizar ajustes de inventario para corregir diferencias entre las existencias registradas y las cantidades físicas.

Criterios de aceptación:
- El sistema debe permitir registrar ajustes positivos y negativos.
- Debe solicitar una justificación del ajuste.
- Debe registrar el usuario responsable y la fecha.
- El ajuste debe generar un movimiento histórico.
- El sistema debe actualizar las existencias de manera transaccional.
### HU-16. Transferencias entre almacenes

- Requisito relacionado: RF-16.    [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario autorizado, quiero transferir productos entre almacenes o ubicaciones para mantener actualizado el inventario de cada espacio.

Criterios de aceptación:
- El sistema debe permitir seleccionar el almacén de origen y el de destino.
- Debe permitir seleccionar el producto y la cantidad que se transferirá.
- Debe validar la disponibilidad en el origen.
- Debe disminuir las existencias del origen e incrementar las del destino.
- Debe conservar el registro de la transferencia.
- La operación debe ser transaccional.
### HU-17. Consulta del historial de movimientos

- Requisito relacionado: RF-17.    [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario, quiero consultar el historial de movimientos de inventario para conocer cómo han cambiado las existencias de los productos.

Criterios de aceptación:
- El sistema debe mostrar los movimientos registrados.
- Debe permitir identificar el tipo de movimiento, producto, cantidad, fecha, almacén y usuario responsable.
- Debe permitir consultar el historial de un producto específico.
- Los movimientos históricos no deben poder modificarse ni eliminarse mediante las operaciones habituales.
- El historial debe permitir reconstruir las existencias de inventario.

## EPICA E-05. Unidades de medida y conversiones
Objetivo: permitir la gestión de productos que se almacenan o manejan mediante diferentes unidades de medida y presentaciones.

### HU-18. Administración de unidades de medida
- Requisito relacionado: RF-18.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero disponer de unidades de medida para registrar correctamente las cantidades de los productos.

Criterios de aceptación:
- El sistema debe contemplar unidades como unidades, kilogramos, gramos, litros y metros.
- Debe permitir asociar una unidad de medida a un producto.
- Debe validar que las cantidades ingresadas sean compatibles con la unidad definida.
### HU-19. Conversión de unidades

- Requisito relacionado: RF-19.    [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario autorizado, quiero registrar movimientos utilizando diferentes presentaciones o unidades equivalentes para facilitar el control de productos a granel.

Criterios de aceptación:
- El sistema debe permitir definir equivalencias entre unidades compatibles.
- Debe calcular las cantidades equivalentes de acuerdo con la conversión configurada.
- Debe evitar conversiones entre unidades incompatibles.
- Las conversiones deben conservar la precisión necesaria para evitar inconsistencias en las existencias.

## Epica E-06. Alertas de inventario
Objetivo: identificar oportunamente los productos que necesitan reposición.
### HU-20. Configuración de existencias mínimas
- Requisito relacionado: RF-20.  [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero configurar niveles mínimos de inventario para identificar los productos que requieren reposición.

Criterios de aceptación:
- El sistema debe permitir establecer una cantidad mínima para cada producto.
- Debe permitir modificar el valor configurado.
- El nivel mínimo debe poder consultarse desde la información del producto.
- mínimo aplica globalmente al producto.
### HU-21. Alertas por bajo inventario

- Requisito relacionado: RF-21.   [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario, quiero recibir alertas cuando las existencias de un producto sean iguales o inferiores a su nivel mínimo para identificar posibles necesidades de reposición.

Criterios de aceptación:
- El sistema debe identificar los productos que alcanzan o están por debajo de su nivel mínimo.
- Debe mostrar las alertas correspondientes en la plataforma.
- Las alertas deben actualizarse cuando cambien las existencias.
- Debe evitar generar alertas duplicadas innecesariamente para una misma condición.

## Epica E-07. Valoración del inventario
Objetivo: permitir conocer el valor económico de las existencias registradas.
### HU-22. Cálculo del valor del inventario

- Requisito relacionado: RF-22.  [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero conocer el valor económico de las existencias para tener una referencia del capital representado en el inventario.

Criterios de aceptación:
- El sistema debe calcular el valor de las existencias utilizando el método de valoración definido.
- Debe considerar las cantidades disponibles y los costos correspondientes.
- El cálculo debe actualizarse cuando se registren movimientos que afecten las existencias o su valoración.
- Debe conservar la trazabilidad necesaria para explicar los valores calculados.
### HU-23. Consulta del valor del inventario

- Requisito relacionado: RF-23.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero consultar la valoración económica del inventario para conocer su distribución y valor total.

Criterios de aceptación:
- El sistema debe mostrar el valor total del inventario.
- Debe permitir consultar la valoración por producto.
- Debe permitir consultar la valoración por almacén.
- Los resultados deben corresponder a la información registrada en el sistema.

## Epica E-08. Búsqueda y consulta
Objetivo: facilitar el acceso a la información de los productos y del inventario.
### HU-24. Búsqueda de productos

- Requisito relacionado: RF-24.   [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario, quiero buscar productos por nombre, código o descripción para encontrarlos rápidamente.

Criterios de aceptación:
- El sistema debe permitir realizar búsquedas mediante los criterios definidos.
- Debe mostrar los resultados coincidentes.
- Debe informar cuando no existan resultados.
- Los resultados deben estar limitados a la organización del usuario.
### HU-25. Filtrado de información

- Requisito relacionado: RF-25.   [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario, quiero filtrar los productos por categoría, almacén, ubicación y estado para consultar información específica.

Criterios de aceptación:
- El sistema debe permitir aplicar uno o varios filtros.
- Debe mostrar únicamente los registros que cumplan los criterios.
- Debe permitir retirar los filtros aplicados.
### HU-26. Paginación de registros

- Requisito relacionado: RF-26.   [Requisitos](./Requisitos/RFyRNF.mds)
Como usuario, quiero navegar por los resultados mediante páginas para consultar grandes cantidades de información de manera organizada.

Criterios de aceptación:
- El sistema debe dividir los resultados en páginas.
- Debe permitir avanzar y retroceder entre páginas.
- Debe permitir definir o utilizar un tamaño de página establecido.
- Los filtros y búsquedas deben mantenerse al cambiar de página.

## Epica E-09. Importación y exportación de información
Objetivo: facilitar la incorporación y extracción de grandes cantidades de información.
### HU-27. Importación masiva de productos

- Requisito relacionado: RF-27.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero importar productos mediante archivos Excel o CSV para registrar grandes cantidades de productos sin tener que ingresarlos individualmente.

Criterios de aceptación:
- El sistema debe aceptar los formatos definidos.
- Debe validar la estructura del archivo.
- Debe identificar registros duplicados o inconsistentes.
- Debe informar los registros que fueron importados correctamente y los que presentaron errores.
- Debe evitar que un archivo incorrecto genere información inconsistente.
### HU-28. Exportación de información

- Requisito relacionado: RF-28.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero exportar la información del inventario para conservar una copia de los datos y utilizarlos en otras herramientas.

Criterios de aceptación:
- El sistema debe permitir exportar información en Excel y CSV.
- Debe permitir exportar los datos autorizados de la organización.
- Debe respetar los filtros aplicados cuando se solicite exportar una consulta específica.
- Los archivos deben conservar una estructura comprensible y organizada.
### HU-29. Validación de archivos
- Requisito relacionado: RF-29.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero conocer los errores de un archivo antes de completar su importación para evitar incorporar información incorrecta.

Criterios de aceptación:
- El sistema debe validar los campos obligatorios.
- Debe identificar formatos incorrectos.
- Debe identificar códigos duplicados.
- Debe informar los errores indicando el registro correspondiente.
- Debe permitir corregir el archivo y realizar nuevamente la importación.

## Epica E-10. Panel de control
Objetivo: presentar información resumida sobre el estado del inventario.
### HU-30. Consulta del panel de inventario
- Requisito relacionado: RF-30.   [Requisitos](./Requisitos/RFyRNF.mds)
Como administrador, quiero consultar un panel de control con indicadores del inventario para conocer rápidamente el estado de los productos de mi organización.

Criterios de aceptación:
- Debe mostrar la cantidad de productos registrados.
- Debe mostrar la cantidad de productos con existencias bajas.
- Debe mostrar el valor económico del inventario
- Debe mostrar la distribución de productos por almacén.
- Los indicadores deben reflejar la información actualizada del inventario.
- La información debe corresponder exclusivamente a la organización del usuario.

## Epica E-11. Gestión y aislamiento de organizaciones
Objetivo: garantizar que cada empresa gestione su información de forma independiente dentro de la plataforma.
### HU-31. Administración de información por organización
- Requisito relacionado: RF-31.   [Requisitos](./Requisitos/RFyRNF.mds)
Como organización, quiero administrar mis productos, almacenes, usuarios y movimientos de inventario de manera independiente para mantener organizada mi información empresarial.

Criterios de aceptación:
- Los registros deben estar asociados a una organización.
- Los usuarios deben solo pueden hacer modificaciones a su organizacion. 
- La información debe conservar la relación con su organización durante las operaciones.
### HU-32. Aislamiento de información  [Requisitos](./Requisitos/RFyRNF.mds)

- Requisito relacionado: RF-32.
Como organización, quiero que mi información esté protegida frente al acceso de otras organizaciones para garantizar la privacidad de mis datos.

Criterios de aceptación:
- Los usuarios no deben consultar registros de otras organizaciones.
- El backend debe validar la pertenencia de los registros a la organización.
- Las consultas, modificaciones y operaciones deben respetar el aislamiento.
- El aislamiento debe aplicarse también a las importaciones, exportaciones y consultas de reportes.

4. Requisitos no funcionales
Los siguientes requisitos establecen condiciones de calidad, seguridad, rendimiento y confiabilidad que deberá cumplir Uristoky.
RNF-01. Disponibilidad del sistema
El sistema deberá mantener una disponibilidad mensual mínima del 90 %, excluyendo los periodos de mantenimiento programado que se definan contractualmente.

Criterio de aceptación:
- Se deberá contar con mecanismos para medir la disponibilidad mensual.
- Se deberán registrar los periodos de indisponibilidad.
- Se deberá poder calcular el porcentaje de disponibilidad al finalizar cada mes.
RNF-02. Rendimiento en importaciones y reportes
El sistema deberá procesar reportes e importaciones masivas de hasta aproximadamente 10.000 productos en un tiempo inferior a 35 segundos, bajo condiciones de prueba previamente establecidas.

Criterio de aceptación:
- Se deberá realizar una prueba con un conjunto de aproximadamente 10.000 productos.
- Se deberá medir el tiempo total de procesamiento.
- Las operaciones deberán completarse en menos de 35 segundos en el entorno de pruebas definido.
- Se deberán documentar las condiciones de la prueba, incluyendo recursos del servidor y tamaño de los archivos.
RNF-03. Integridad transaccional de los movimientos
Las operaciones que modifiquen las existencias deberán ejecutarse de manera transaccional, garantizando que todas las modificaciones relacionadas se completen correctamente o se reviertan en caso de error.

Criterio de aceptación:
- Una operación incompleta no debe dejar cantidades parcialmente actualizadas.
- Las entradas, salidas, ajustes y transferencias deben mantener la consistencia del inventario.
- Se deben controlar las operaciones concurrentes que afecten las existencias de un mismo producto.
RNF-04. Trazabilidad e inmutabilidad del historial
El sistema deberá mantener un historial de movimientos de inventario que permita reconstruir las existencias a partir de las operaciones registradas.

Criterio de aceptación:
- Las existencias deberán calcularse a partir de los movimientos registrados, utilizando un mecanismo de consulta o almacenamiento consistente.
- Los movimientos confirmados no podrán modificarse ni eliminarse mediante las operaciones habituales.
- Las correcciones deberán realizarse mediante nuevos movimientos de ajuste o reversión.
- Cada movimiento deberá identificar su fecha y usuario responsable.
RNF-05. Control de existencias negativas
El sistema deberá impedir que las existencias de un producto sean negativas

Criterio de aceptación:
- Por defecto, el sistema no permitirá registrar salidas superiores a las existencias disponibles.
- El administrador podrá habilitar o deshabilitar el manejo de stock negativo, si esta configuración se implementa.
- La validación deberá realizarse en el backend.
- Las operaciones concurrentes no deberán permitir superar las existencias disponibles por una condición de carrera.
RNF-06. Protección de datos personales
El sistema deberá contemplar las disposiciones aplicables de la Ley 1581 de 2012 de Colombia y sus normas reglamentarias en materia de protección de datos personales.

Criterio de aceptación:
- Se deberá disponer de una política de tratamiento de datos personales.
- Se deberán establecer los mecanismos de autorización para el tratamiento de datos cuando sean exigibles.
- Se deberán informar las finalidades del tratamiento.
- Se deberán establecer mecanismos para atender consultas y solicitudes de los titulares de los datos.
- Se deberán presentar los términos y condiciones correspondientes al uso de la plataforma.

RNF-07. Propiedad y portabilidad de la información 
La información empresarial registrada en Uristoky deberá permanecer bajo la titularidad y control del cliente, de acuerdo con las condiciones contractuales aplicables.

Criterio de aceptación:
- El cliente deberá poder solicitar o realizar la exportación de su información.
- La exportación deberá estar disponible en formatos como Excel y CSV.
- La información exportada deberá conservar una estructura comprensible.
- Las condiciones de acceso, conservación y eliminación de los datos deberán estar definidas contractualmente.