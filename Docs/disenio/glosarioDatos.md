Glosario con el contenido correspondiente al proyecto, con el fin de ayudar a que cualquiera pueda entender palabras tecnicas incluidas en el proyecto

# Glosario

## organizacion y usuarios

Administrador global:
Organizacion:
Administrador de organizacion:
Usuario:
Rol: 
Limite usuarios:

## Estado de servicio


## catalogo 
Producto:	Artículo que se controla en el inventario.
Código de producto:	Identificador único dentro de la organización (RN-11).
Categoría:	Agrupación de productos para clasificarlos.
Unidad de medida:	Forma de cuantificar un producto (unidad, kg, litro, metro).
Unidad base:	Unidad en la que se guardan las cantidades de un producto (RN-28).
Conversión / equivalencia:	Relación entre unidades de la misma magnitud (RN-27).
Almacén:	Espacio físico que contiene mercancía de la organización.
Ubicación:	Punto específico dentro de un almacén. Pertenece a uno solo.
Ubicación "General":	Ubicación creada por defecto en cada almacén. No se puede eliminar (RN-16).


## Inventario 

Existencias: Cantidad disponible de un producto en una ubicación. Es el término de uso general.
Saldo:	Registro técnico donde se guardan las existencias por producto y ubicación. Debe coincidir con los movimientos (RN-23).
Existencias totales:	Suma de las existencias de un producto en todas sus ubicaciones. Se usa para alertas y desactivación (RN-13, RN-30).
Movimiento:	Registro inmutable de un cambio en las existencias (RN-18).
Entrada: Movimiento que aumenta existencias, con costo opcional.
Salida: 	Movimiento que disminuye existencias.
Transferencia: 	Traslado entre dos ubicaciones distintas. Genera dos movimientos enlazados (RN-24).
Ajuste de inventario:	Corrección positiva o negativa por diferencia con el conteo físico. Solo administrador, con justificación (RN-25).
Reversión:	Movimiento nuevo que anula otro, y solo se puede hacer una vez por movimiento (RN-26).
Historial / kardex: 	Registro cronológico de todos los movimientos.
Stock negativo:	Existencias por debajo de cero. No está permitido (RN-19).
Transaccional:	Operación que se completa entera o no se aplica nada (RN-20).
Condición de carrera: Error que ocurre cuando dos operaciones simultáneas afectan la misma existencia.