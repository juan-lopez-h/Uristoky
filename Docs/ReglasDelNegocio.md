# **Reglas del negocio**

Reglas necesarias para el negocio


## 1. Organización y aislamiento
RN-01: Todo registro de negocio pertenece a una sola organización y ese vínculo no cambia. La única excepción es el administrador global, que no pertenece a ninguna (RN-40).
RN-02: La organización de una operación sale de la sesión en el servidor. El administrador global gestiona organizaciones indicando la organización destino de forma explícita, y cada acción queda en auditoría.
RN-03: Ningún usuario puede leer, crear, modificar ni exportar datos de otra organización. Esto incluye búsquedas, reportes, importaciones y exportaciones.
RN-04: Un registro solo puede relacionarse con registros de su misma organización (un movimiento no puede apuntar a un producto o almacén de otra).
## 2. Usuarios y roles
RN-05: Hay cuatro roles fijos: administrador global, administrador de organización, usuario y solo lectura. Cada persona tiene exactamente uno.
RN-06: Los permisos se validan siempre en el backend. La interfaz solo oculta opciones por comodidad.
RN-07: El rol solo lectura nunca puede crear, modificar ni eliminar nada.
RN-08: Toda organización activa tiene al menos un administrador de organización activo. No se puede desactivar ni degradar al último.
RN-09: Los usuarios no se eliminan, solo se desactivan. Un usuario desactivado no puede iniciar sesión y sus sesiones activas se invalidan.
RN-10: Se añade que nadie conoce la contraseña de otro. Al crear un usuario se le envía un enlace de activación o una contraseña temporal de primer uso.
## 3. Productos y categorías
RN-11: El código de producto es único dentro de la organización, sin distinguir mayúsculas ni espacios sobrantes.
RN-12: Un producto con movimientos no puede cambiar de código ni de unidad de medida.
RN-13: Los productos no se eliminan, solo se desactivan, y únicamente si sus existencias totales son 0. “Existencias totales” significa la suma de todas las ubicaciones.
RN-14: Un producto inactivo no admite nuevos movimientos, pero conserva su historial y sigue apareciendo en consultas históricas.
RN-15: Una categoría desactivada no se puede asignar a productos nuevos, pero los productos que ya la tienen la conservan.
## 4. Almacenes y ubicaciones
RN-16: Una ubicación pertenece a un único almacén. El nombre es único por organización (almacenes) y por almacén (ubicaciones).Todo almacén nace con una ubicación “General” que no se puede eliminar. Las demás ubicaciones son opcionales.
RN-17: Desactivar un almacén exige saldo 0 en todas sus ubicaciones y desactiva también sus ubicaciones. pero conserva su historial.
## 5. Movimientos de inventario (el corazón)
RN-18: Los movimientos son inmutables: no se editan ni se borran. Se corrigen con un movimiento nuevo de ajuste o reversión.
RN-19: Las existencias no pueden quedar negativas por producto y ubicación. La validación es en el backend y protegida contra operaciones simultáneas.
RN-20: Cada operación que cambia existencias (el movimiento y la actualización del saldo) ocurre en una sola transacción: se completa entera o no se aplica nada.
RN-21: La cantidad de entradas, salidas y transferencias siempre es mayor que 0. El tipo de movimiento define si suma o resta.
RN-22: La fecha y el usuario de cada movimiento los asigna el servidor, no el cliente.
RN-23: El saldo de cada producto en cada ubicación coincide con la suma de sus movimientos. Los totales por almacén y por organización se obtienen sumando ubicaciones.
RN-24: En una transferencia, origen y destino deben ser ubicaciones distintas. Pueden ser del mismo almacén o de almacenes diferentes.
RN-25: Los ajustes solo los hace un administrador, con justificación obligatoria y cantidad distinta de 0.
RN-26: Un movimiento solo se puede revertir una vez. La reversión referencia al original y no se permite si dejaría existencias negativas.
## 6. Unidades de medida
RN-27: Solo se convierten unidades de la misma magnitud (masa con masa, volumen con volumen, etc.).
RN-28: Las cantidades se guardan en la unidad base del producto, con tipo numérico decimal exacto. Nunca se usan decimales de punto flotante.
RN-29: Las unidades “enteras” (como unidades) no aceptan decimales. Las demás tienen un máximo de decimales definido.
## 7. Alertas
RN-30: El mínimo es global por producto y debe ser 0 o mayor. Sin mínimo configurado, no hay alerta.
RN-31: Hay alerta cuando las existencias totales son iguales o inferiores al mínimo. Existe una sola alerta activa por producto, y se cierra sola cuando se supera el mínimo.
RN-30 y RN-31: El mínimo y la alerta se calculan sobre las existencias totales del producto (suma de ubicaciones).
## 8. Valoración
RN-32: El costo promedio ponderado es por producto y a nivel de organización. Solo las entradas con costo lo modifican.
RN-33: Un movimiento ya registrado conserva su costo y no se recalcula con cambios posteriores.
## 9. Importación y exportación
RN-34: Toda importación se valida primero. Si hay errores no se importa nada: se informa cada error con su fila y el usuario corrige y reintenta.
RN-35: Una importación nunca sobrescribe productos existentes. Los códigos duplicados se rechazan.
RN-36: La exportación está disponible para todos los roles, incluido solo lectura y las organizaciones suspendidas.
## 10. Auditoría y datos personales
RN-37: Se registran las acciones administrativas (crear o desactivar usuarios, cambios de rol, ajustes, importaciones) con usuario, fecha y organización.
RN-38: Al registrar usuarios se deja constancia de la aceptación de la política de datos (Ley 1581).
RN-39: Al terminar el contrato, el cliente puede exportar sus datos y estos se eliminan en el plazo pactado.