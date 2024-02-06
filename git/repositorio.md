# Repositorio.

# Iniciar repositorio.

Una ves que escogemos la ruta donde esta nuestro repositorio, lo inicializamos con el comando.

> git init

## Preparacion de archivos.

1. Subir todos los archivos.

> git add .

2. Subir archivos especificos.

> git add (nombre-archivo)


## Ver estado del los archivos.

> git status

## Ver estado resumido.

> git status -s

## Remover archivo del area de preparacion.

> gir rm --cached (nombre-archivo)

## Subir los archivos al repositorio.

> git commit -m "mensaje"

## Subir archivos sin prepararlos.

> git commit -a

## Restaurar archivo eliminado.

> git restore (nombre-archivo)

## Regresa los archivos al momento en que se realizo el commit.

> git checkout (nombre del archivo)

## Restaurar cambios que ya estan subidos.

> git reset --hard

## Cambiar nombre 

>git mv (nombre-actual-archivo) (nombre-nuevo-archivo)


