**Requisitos funcionales y no funcionales**

Requisitos funcionales: 
-
-  Ingreso productos 
- control multialmacen
- ubicaciones dinamicas
- alertas proactivas por falta de stock 
- gestion de prodctos granel y conversion de unidades 
- exportcion e importacion masiva (excel/csv y json)
- Reporte de valoracion inventario
- ingrerrrso provveedores y ordenes de compra (versiones futuras)

Requisitos no funcionales:
-
- Disponibilidad del 90% mensual 
- Reportes e importaciones masivas: < 30 s para hasta mas o menos 10.000 productos
- Los movimientos de stock deben ser transaccionales
- Stock calculado a partir de movimientos (kardex), con historial inmutable
- Validaciones para impedir stock negativo, salvo que el cliente lo configure
- Ley 1581 de 2012 (habeas data): política de tratamiento de datos, autorización y términos y condiciones
- Definir en el contrato que los datos son del cliente y que puede exportarlos (Excel/CSV) en cualquier momento
