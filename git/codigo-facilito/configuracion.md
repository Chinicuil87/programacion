# Configuracion.

> git config --global user.name "usuario"

> git config --global user.email "correo"

## Ver configuracion general.

> git config --list

## Ver el nombre de usuario.

> git config user.name

## Ver el correo.

> git config user.email

## Conexion SSH

> ssh-keygen -t ed25519 -C "correo"

* NOTA: Se puede colocar una contraseña para mayhor seguridad o se puede colocar despues.

>  eval \`ssh-agent -s`

## Activamos llave publica. 

> ssh-add ~/.ssh/id_ed25519

## Copiar llave publica.

>  clip < ~/.ssh/id_ed25519.pub

## Configuramos llave en Git Hub.

1. Dentro de nuestra cuenta nos dirigimos a configuracion.

![configuracion](img/image.png)

2. Nos dirigimos a SSH and GPG Keys.

![alt text](img/image-1.png)

3. Seleccionamos New SSH key.

![alt text](img/image-2.png)

4. Le asignamos un nombre.

![alt text](img/image-3.png)

5. Pegamos la llave copiada y le damos en agregar.

![alt text](img/image-4.png)

## Validar que se configuro la llave.

> ssh -T git@github.com

![alt text](img/image-6.png)
e