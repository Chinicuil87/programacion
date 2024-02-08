# Dia 1 

Curso de Udemy Python Total por Federico Garay.

## Mostrar en pantalla.

Utilizamos la palabra reservada de print para mostrar en pantalla y tiene el siguiente formato.

> print("texto")

``` python
# Mostrar en pantalla 

print("Hola mundo") # usando comillas sobles

print('Hola mundo') # usando comillas simples

print('Hola "mundo"') # para mostras comillas dobles en un texto

print("hola 'mundo'") # para mostrar comillas sensillas en texto

```
Mostrara en pantalla.
> ![alt text](img/image.png)

## Strings

### Concadenar texto.

Se utiliza el signo de + para concadenar texto.

> print("texto"+"texto")

```python

print('100+50') # python lo interpreta como cadena de texto y no como una operacion de numeros.

print("Hola" + 'Cesar') # Concadenar string

print("Hola " + 'Cesar') # Espacio despues del 'Hola '

print("Hola" + ' Cesar') # Espacio antes de ' Cesar'

print('Hola'+' '+'Cesar') # Se crea una tercera cade con un espacio en blanco

```

Se muestra en pantalla.

![alt text](img/concadenar.png)

## Escape de texto.

Utilizamos la barra invertida \ para realizar escapes de texto y estos puden ser.

> Para mostrar las comilla dobles hacemos el uso de \\" 

> Para realizar un salto de linea usamos \\n

> Para agregar tabulacion al inicio del texto usamos \\t

> Para mostrar una barra invertisa usamos \\\

``` python

print("Me llamo \"Cesar\"") # \" Muestra las comillas doble.

print("Esta es un alinea\nY esta es otra linea.") # \n hace salto de linea.

print("\tAgrega tabular") # \t Agrega un tabulado o 4 espacion al inicio.

print('This isn\'t a number') # \' se puede usar para mostrar la comilla en el texto 

print('Este signo \\ es una barra investida') # se utiliza doble barra invertida para mostrar una barra.

```
Se muestra en pantalla.

![alt text](img/escape.png)


