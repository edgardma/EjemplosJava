# OAuth 2.0

## ¿Que es OAuth?

OAuth significa "Open Authorization" (autorización abierta), es un estándar diseñado para permitir que un sitio web o un aplicación accedan a recursos alojados por otras aplicaciones web en nombre de un usuario.

### Roles:

* **Propietario del recurso**: El usuario o sistema que posee los recursos protegidos y puede conceder accesos a ellos.

* **Cliente**: El cliente es el sistema que requiere acceso a los recursos protegidos. Para acceder a los recursos, el cliente debe poseer el token de acceso correspondiente.

* **Servidor de autorización**: Este servidor recibe las solicitudes de token de acceso del cliente y las emite una vez que el propietario del recurso se ha autenticado y ha dado su consentimiento. El servidor de autorización expone dos puntos de conexión: el punto de conexión de autorización, que maneja la autenticación interactiva y el consentimiento del usuario, que está involucrado en una interacción de máquina a máquina.

* **Servidor de recursos**: Un servidor que protege los recursos del usuario y recibe las solicitudes de acceso del cliente. Acepta y valida un token de acceso del cliente y devuelve los recursos adecuados. 

## Fuente:

### Documentación

[OAuth 2.0 &mdash; OAuth](https://oauth.net/2/)

[¿Qué es OAuth 2.0 y para qué sirve? - Auth0](https://auth0.com/es/intro-to-iam/what-is-oauth-2)   

### Ejemplo:

[Aprendiendo autenticación OAuth 2 y JWT con Spring Security Authorization Server! Parte 1 🔐💪🔥 - YouTube](https://www.youtube.com/watch?v=zDzvuTBrP1I)

[Aprendiendo autenticación OAuth 2 y JWT con Spring Security Authorization Server! Parte 2 🔐🔥 - YouTube](https://www.youtube.com/watch?v=fcBzWCajyK0&t=81s)

[Aprendiendo autenticación OAuth 2 y JWT con Spring Security Authorization Server! Parte 3 🔐🔥 - YouTube](https://www.youtube.com/watch?v=Ga0PnAOiJFo)

[Aprendiendo autenticación OAuth 2 y JWT con Spring Security Authorization Server! Parte 4 🔐🔥 - YouTube](https://www.youtube.com/watch?v=rwIFN450NUQ&t=907s)
