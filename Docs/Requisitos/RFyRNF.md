**Requisitos funcionales y no funcionales**

# Requisitos funcionales


## 1. Requisitos funcionales

### 1.1. Autenticación y gestión de usuarios

**RF-01. Inicio de sesión**

El sistema deberá permitir que los usuarios registrados accedan a la plataforma mediante sus credenciales.

**RF-02. Cierre de sesión**

El sistema deberá permitir que los usuarios finalicen su sesión de manera segura.

**RF-03. Gestión de usuarios**

El sistema deberá permitir que los administradores registren, consulten, modifiquen y desactiven usuarios pertenecientes a su organización.

**RF-04. Gestión de roles y permisos**

El sistema deberá permitir asignar roles a los usuarios para controlar las funcionalidades y operaciones a las que pueden acceder.

Los roles iniciales contemplados son:

- **Administrador:** tendrá acceso a las funcionalidades administrativas y de gestión del inventario.
- **Usuario:** podrá realizar las operaciones de inventario que le sean autorizadas.
- **Solo lectura:** podrá consultar información sin realizar modificaciones.

### 1.2. Gestión de productos

**RF-05. Registro de productos**

El sistema deberá permitir registrar productos con información como nombre, código, descripción, categoría, unidad de medida y demás atributos necesarios para su identificación.

**RF-06. Consulta de productos**

El sistema deberá permitir consultar la información detallada de los productos registrados.

**RF-07. Modificación de productos**

El sistema deberá permitir actualizar la información de los productos registrados, conservando la integridad de sus movimientos históricos.

**RF-08. Desactivación de productos**

El sistema deberá permitir desactivar productos sin eliminarlos físicamente de la base de datos, conservando su información histórica.

**RF-09. Clasificación de productos**

El sistema deberá permitir organizar los productos mediante categorías para facilitar su administración y consulta.

### 1.3. Gestión de almacenes y ubicaciones

**RF-10. Gestión de almacenes**

El sistema deberá permitir registrar, consultar, modificar y desactivar almacenes pertenecientes a una organización.

**RF-11. Gestión de ubicaciones**

El sistema deberá permitir crear y administrar ubicaciones dentro de cada almacén para organizar la distribución física de los productos.

**RF-12. Asociación de productos con almacenes y ubicaciones**

El sistema deberá permitir identificar las cantidades disponibles de cada producto en los diferentes almacenes y ubicaciones registrados.

### 1.4. Gestión de movimientos de inventario

**RF-13. Registro de entradas de inventario**

El sistema deberá permitir registrar entradas de productos al inventario, especificando las cantidades, fechas, almacenes, ubicaciones y demás datos necesarios para identificar el movimiento.

**RF-14. Registro de salidas de inventario**

El sistema deberá permitir registrar salidas de productos del inventario, actualizando las existencias disponibles de acuerdo con las cantidades retiradas.

**RF-15. Ajustes de inventario**

El sistema deberá permitir realizar ajustes en las cantidades disponibles cuando existan diferencias entre las existencias registradas y las cantidades reales, dejando constancia del motivo y del usuario responsable.

**RF-16. Transferencias entre almacenes**

El sistema deberá permitir transferir productos entre almacenes o ubicaciones, actualizando las existencias correspondientes y conservando el registro de la operación.

**RF-17. Consulta del historial de movimientos**

El sistema deberá permitir consultar el historial de movimientos de inventario, incluyendo información como tipo de movimiento, producto, cantidad, fecha, almacén y usuario responsable.

### 1.5. Unidades de medida y conversiones

**RF-18. Gestión de unidades de medida**

El sistema deberá permitir identificar las unidades de medida utilizadas para cuantificar los productos, como unidades, kilogramos, litros, metros y otras que sean necesarias.

**RF-19. Conversión de unidades de medida**

El sistema deberá permitir establecer equivalencias entre unidades de medida para gestionar productos que se comercializan o almacenan en diferentes presentaciones.

### 1.6. Alertas de inventario

**RF-20. Configuración de niveles mínimos de inventario**

El sistema deberá permitir establecer cantidades mínimas de existencias para los productos registrados.

**RF-21. Generación de alertas por bajo inventario**

El sistema deberá generar alertas cuando las existencias de un producto alcancen o sean inferiores al nivel mínimo configurado.

### 1.7. Valoración del inventario

**RF-22. Valoración económica del inventario**

El sistema deberá permitir calcular el valor económico de las existencias disponibles, considerando los costos registrados para los productos y el método de valoración definido para el sistema.

**RF-23. Consulta de la valoración del inventario**

El sistema deberá permitir consultar el valor económico del inventario, tanto de manera general como según los criterios de clasificación disponibles.

### 1.8. Búsqueda y consulta de información

**RF-24. Búsqueda de productos**

El sistema deberá permitir buscar productos mediante criterios como nombre, código o descripción.

**RF-25. Filtrado de productos**

El sistema deberá permitir filtrar los productos según criterios como categoría, almacén, ubicación y estado.

**RF-26. Paginación de registros**

El sistema deberá presentar los resultados de las consultas de manera paginada para facilitar la navegación entre grandes cantidades de registros.

### 1.9. Importación y exportación de información

**RF-27. Importación masiva de productos**

El sistema deberá permitir importar información de productos mediante archivos en formatos compatibles, como Excel y CSV.

**RF-28. Exportación de información**

El sistema deberá permitir exportar información de productos e inventario en formatos como Excel, CSV y JSON.

**RF-29. Validación de archivos importados**

El sistema deberá validar la estructura y los datos de los archivos importados, identificando registros incorrectos o inconsistentes antes de incorporarlos al sistema.

### 1.10. Panel de control del inventario

**RF-30. Visualización de indicadores del inventario**

El sistema deberá presentar un panel de control con información resumida sobre el estado del inventario.

Este panel contemplará indicadores como:

- Cantidad de productos registrados.
- Cantidad de productos con existencias bajas.
- Valor económico del inventario.
- Cantidad de productos por almacén, cuando corresponda.

### 1.11. Administración y aislamiento de organizaciones

**RF-31. Gestión de información por organización**

El sistema deberá permitir que cada organización gestione su propia información de inventario de manera independiente.

**RF-32. Aislamiento de información entre organizaciones**

El sistema deberá garantizar que los usuarios de una organización únicamente puedan consultar y administrar la información a la que tengan acceso dentro de su propia organización.

## 2. Funcionalidades previstas para futuras versiones

Las siguientes funcionalidades no hacen parte del alcance funcional de la primera versión, pero se contemplan dentro de la evolución de Uristoky:

- Gestión de proveedores.
- Registro y administración de órdenes de compra.
- Gestión de clientes.
- Registro y administración de ventas.
- Descuento automático de existencias a partir de las ventas.
- Estadísticas e informes comerciales.
- Integración con sistemas de facturación electrónica.
- Ampliación de las funcionalidades de análisis y seguimiento empresarial.

## 3. Consideraciones

- Los requisitos descritos corresponden a una primera definición funcional y podrán ajustarse durante las etapas de análisis y diseño.
- Las operaciones de inventario deberán conservar la trazabilidad de los movimientos realizados.
- Las funcionalidades deberán respetar los roles y permisos asignados a cada usuario.
- La gestión de inventario deberá contemplar la posibilidad de administrar múltiples almacenes y ubicaciones.
- La arquitectura deberá permitir incorporar nuevos módulos en futuras versiones sin afectar el funcionamiento de los módulos existentes.
R
## 4. Requisitos no funcionales:
-
- Disponibilidad del 90% mensual 
- Reportes e importaciones masivas: <35 s para hasta mas o menos 10.000 productos
- Los movimientos de stock deben ser transaccionales
- Stock calculado a partir de movimientos (kardex), con historial inmutable
- Validaciones para impedir stock negativo, salvo que el cliente lo configure
- Ley 1581 de 2012 (habeas data): política de tratamiento de datos, autorización y términos y condiciones
- Definir en el contrato que los datos son del cliente y que puede exportarlos (Excel/CSV) en cualquier momento
