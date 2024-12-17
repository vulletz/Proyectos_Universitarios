<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = $_POST['nombre'];
    $email = $_POST['email'];
    $mensaje = $_POST['mensaje'];

    // Correo de destino
    $para = '173059@upslp.edu.mx';
    $asunto = 'Mensaje de contacto';

    // Contenido del correo
    $mensaje_correo = "Nombre: $nombre\n";
    $mensaje_correo .= "Email: $email\n";
    $mensaje_correo .= "Mensaje:\n$mensaje\n";

    // Cabeceras del correo
    $cabeceras = "From: $email\r\n";
    $cabeceras .= "Reply-To: $email\r\n";

    // Envía el correo
    mail($para, $asunto, $mensaje_correo, $cabeceras);

    // Redirige a una página de éxito
    header('Location: contacto_exitoso.html');
    exit;
} else {
    // Si no es una solicitud POST, redirige a la página de inicio
    header('Location: index.html');
    exit;
}