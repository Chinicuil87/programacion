## Tipo de datos.

String(str) = Cadena de texto y debe de estar entre comillas

> "Cesar"   
> "DG!"#$%32dv"  
> "159635897"

Integer(int) = numeros enteros sin comillas

> -1987  
> 1987  
> <150

Floating(float) = numeros con decimales sin comillas

> 3.1416   
> -9878.3    
> 1.999999999

Lista(list) = cololeccion ordenada de objetos y se escribe entre corchetes []  

> ["manzana", "planato", "pera"]  
> [1987,"casa", "14-02-2024", true]  
> [1, 24, 36, -14]

Disccionario (dic) =su contenido se escribe entre llaves {}, y se agrupan en pares de palabras agrupadas, el cual es la clave y su valor.

> {"nombre":"Cesar", "edad":36, "genero":"masculino"}  
> {"fruta":"manzana", "verdura":"zanahoria"}

Tuples (tuple0) = Se escriben entre parentesis, parecido a la listas, cualquier tipo de dato, su orden es inmutables. 

> ("lunes","martes","miercoles","jueves","viernes")

sets(set) = conjunto de datos unicos, se escribe entre llaves.

> ['a','b','c']

Booleanos(bool) = Solo puede tener el valor de verdadero o falso, se usan para saber si una candicon se cumple.

> True  
> False

## Variables.

Declaracion de variables.

Las variables pueden contener cualquier tipo de datos.

> <"nombre de la variable"> = <"Valor asignado">

``` py
# entero
edad = 36

#float
pi = 3.1416

# strings
nombre = "Cesar"

# booleano
aprobado = True

# Lista
lista = ["Cesar", "Nallely"]

#tuple
mitupla = ("lunes","martes","miercoles","jueves","viernes")

# diccionario
diccionario = {"nombre":"Cesar", "edad":36, "genero":"masculino"}

# set 
alfabeto = ['a','b','c']

```

A las varaible se les puede cambiar su valor durante la ejecucion. 

```py

# declaracion de variable 

apellido = "Lopez"
print(apellido)

# cambio de valor de variable
apellido = "Rosas"
print(apellido)

```
Se muestra en pnatalla.

![alt text](img/variables.png)

Las variables se pueden sumar si son numeros.

```py
# suma de variables.
numero1 = 10
numero2 = 15
print(numero1+numero2)

```
Se muestra en pantalla.

![alt text](img/suma.png)


Se puede asignarle el valor de una variable desde un input.

> <"nombre variable"> = input("solicitud")

```py
nombre = input("Dime tu nombre: ")
print(nombre)

```

Se mostrara en pantalla.

![alt text](img/ninput.png)

Las variables tambien pueden contener operaciones y almacenar el resultado.

```py
edad = 15
edad2 = 20
sumaedad = edad + edad2

print(sumaedad)
```
Se mostrara en pantalla.

![alt text](img/sedad.png)

## Nombre de variables.

1. Legible (nombrePerro);
2. Descriptivo 
3. No usar espacios
4. En minuscuñlas
5. No usar ñ
6. No usar numero al inicio.
7. No usar gignos !">#$%&/()=?¡
8. No usar palabras reservadas

Malas practicas.

[X] mi perro  
[X] 1numero  
[X] nombre_niño  
[X] p@r!

Buenas practicas.

mi_perrro  
numero1  
nombre_infante  
pera   

## type

    Funcion que nos permite saber el tipo de dato al que pertenece la variable.

```  py
mi_numero = 1    # se le asigna el valor 1 a la variable mi numero.
print(mi_numero)

print(type(mi_numero)) # muestra el tipo de variable 
```
![alt text](img/type.png)

