# Desiciones tomadas para poder definir un mvp inicial

## Valoración del inventario:
promedio ponderado (lo más simple y habitual) o PEPS. Recomiendo promedio ponderado para el MVP.

## Unicidad del código de producto:
único por organización.
## Stock negativo:
fuera del MVP, así que quita ese criterio del RNF-05.
## Multi-organización: 
una sola base de datos con organization_id en cada tabla.
## Stock: 
tabla de saldos actualizada de forma transaccional, más tabla de movimientos de solo inserción.
## Condiciones para no desactivar un producto:
 debe tener existencias mayores a 0.