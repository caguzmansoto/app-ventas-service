#app-ventas-service

<a title="SonarQube" href="http://sonarqube-utilitarios.appsdesa.ocp.pjud/dashboard?id=cl.amisoft.pjud.unificado%3Aunificado-agenda-service"><img src="https://img.shields.io/badge/Quality%20Gate-failed-red?logo=sonarqube" alt="SonarQube" /></a>

# Descripción y contexto

- El microservicio tiene como objetivo manejar la configuracion de la agenda para el sistema de tramitacion unificado de cada tribunal y competencia

# Estado del Proyecto

- Estado: En desarrollo
- Versión: 3.3.0

# Requisitos del Entorno de Desarrollo

 - Para ambientar un equipo y comenzar a desarrollar sobre el microservicio unificado-agenda-service, es necesario contar con las siguientes herramientas y tecnologías:

1. Java 8
2. Maven version 3.6.X.
3. Git para el control de versiones

# Guía de Funcionamiento

 - Para poder levantar el servicio localmente se deben seguir los siguientes pasos:


1. Clonar repositorio usando URL

   ```bash
    git clone https://CAPJ@dev.azure.com/CAPJ/Unificado/_git/unificado-agenda-service
   ```

2. Agregar en pom.xml principal del proyecto backend el microservicio `unificado-tramitar-service`

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
     <modelVersion>4.0.0</modelVersion>
     <groupId>cl.amisoft.pjud.unificado</groupId>
     <artifactId>unificado-back</artifactId>
     <packaging>pom</packaging>
     <version>1.0-SNAPSHOT</version>
     <modules>
       <module>unificado-commons</module>
       <module>unificado-agenda-service</module>
     </modules>
     <properties>
       <spring-cloud.version>Finchley.RELEASE</spring-cloud.version>
     </properties>
   </project>
   ```

3. Instalar dependencias de microservicio

   ```bash
   cd unificado-agenda-service
   mvn clean compile -U
   ```

4. Ejecutar con el IDE de preferencia

5. Consultar un endpoint usando Postman

   ```
    GET http://localhost:8042/agenda/sala/listar
   ```


#### Proceso de ejecución

1. Compilar e instalar dependencias

   ```bash
   mvn clean compile -U
   ```

2. Ejecutar pruebas para revisar

   ```
   mvn test
   ```

3. Con el IDE de preferencia, ejecutar

4. Probar un endpoint

   ```bash
    GET http://localhost:8042/agenda/sala/listar
   ```

#### URL Swagger en ambiente desarrollo

- http://unificado-agenda-service-desa.appsdesa.ocp.pjud/swagger-ui.html#/

# Bug Conocidos o Probables
 - Ninguno

# Dependencias
   
- unificado-commons-dependencies

```xml
<dependency>
        <groupId>cl.amisoft.pjud.unificado</groupId>
        <artifactId>unificado-commons-parent-persistence</artifactId>
        <version>2.0.0-RELEASE</version>
</dependency>

```

- unificado-general-service

```xml
<dependency>
        <groupId>cl.amisoft.pjud.unificado</groupId>
        <artifactId>unificado-comun-service-client</artifactId>
        <version>5.0.0-RELEASE</version>
</dependency>
```
- unificado-tramitar-service

```xml
<dependency>
        <groupId>cl.amisoft.pjud.unificado</groupId>
        <artifactId>unificado-tramitar-service-client</artifactId>
        <version>6.6.11-SNAPSHOT</version>
</dependency>
```  

- unificado-auditoria-service

```xml
<dependency>
        <groupId>cl.amisoft.pjud.unificado</groupId>
        <artifactId>unificado-auditoria-service-client</artifactId>
        <version>3.0.0-RELEASE</version>
</dependency>
```  
- unificado-causa-service

```xml
<dependency>
        <groupId>cl.amisoft.pjud.unificado</groupId>        
        <artifactId>unificado-causa-service-client</artifactId>
        <version>8.0.0-SNAPSHOT</version>
</dependency>
```

#### Estructura de carpetas

![unificado-agenda-service](docs/unificado-agenda-service.png)

#### Diagramas de secuencia

- Guardar Agenda (png)

![unificado-agenda-service](docs/Diagrama-de-secuencia/Guardar%20Agenda%2029102021v1.png)

- Mostrar Agenda (png)

![unificado-agenda-service](docs/Diagrama-de-secuencia/Mostrar%20Agenda%2029102021v1.png)

#### Plan de Pruebas

 - Ejemplo Arbol de resultado

![unificado-agenda-service](docs/Plan-de-pruebas/Arbol-de-resultados-SalaApi-listarTodo.png)

 - Ejemplo Reporte resumen

![unificado-agenda-service](docs/Plan-de-pruebas/Reporte-Resumen-SalaApi-listarTodo.png)

- Ejemplo Resultados en arbol

![unificado-agenda-service](docs/Plan-de-pruebas/Resultados-en-arbol-SalaApi-listarTodo.png)

[comment]: <> (Buscar alternativa para descargar)
<a href="docs/Plan-de-pruebas/Plan-de-Pruebas-Agenda.jmx" download="Plan-de-Pruebas-Agenda.jmx">Descargar Plan de pruebas de agenda</a>

# Servicios externos consumidos
 - Ninguno   
 
# Base de Datos 
   - Motor: Oracle
   - Service name: UNIFDESA
   - Usuario/Esquema: UNIF_AGENDA
   - Host: UNIFDESA.BDD.PJUD
   - Puerto: 1503  

# Modelos BBDD


#Autores
 Célula 4

