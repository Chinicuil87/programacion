# Comandos.

## Directorio actual

> pwd

## Avanzar de directorio

> cd " nombre del directorio"

## Regresar al dorectorio

> cd ..

## Revisar el status del repositorio

> git status

    Sirve para conocer el estado de nuestra area de trabajo y del repositorio.

> git status -s

    Muestra resumida del estado de nuestra area de trabajo.

## Revisar en el area repositorio

> git log

    Muestra la informacion completa de cada uno de los commit

> git log --oneline

    Muestra la informacion resumida de cada uno de los cambios.

> git log -n "numero"

    Delimita el numero de commit que queremos ver.

## Cambiar nombre a la rama donde se estra trabajando

> git branch -M main

## Ver en que rama estamos trabajando.

> git branch

## Cambiar color al nombre de nuestra rama

> git config color.status.branch "color"

## Cambiar color al mensaje de status

> git config color.status.added "color"

## Visualisar diferencias entre archivos.

> git diff

    Muestra la diferencia que hay entre nuestra area de trabajo y el area de repositorio.

# Show

> git show

    Nos permite ver la informacion detallada sobre un commit en especifico.

# Ignore

Se crea un archivo con el nombre.

> .gitignore

Dentro del archivo se agregan las rutas o los nombres de los archivos que queremos que ignore.
