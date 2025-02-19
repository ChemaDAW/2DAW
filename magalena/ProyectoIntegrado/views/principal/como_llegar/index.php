<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ejido Hotel - Cómo Llegar</title>
  <link rel="icon" href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/" type="image/x-icon">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

  <!-- Estilos y fuentes -->
  <link href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/css/comollegar.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <link href="https://fonts.cdnfonts.com/css/bickham-script-pro" rel="stylesheet">
</head>

<body>
<?php include_once 'views/template/header-principal.php'; ?>

  <!-- Sección Hero para "Cómo Llegar" -->
  <section id="hero-section" class="hero-section position-relative">
    <!-- Puedes usar un video o imagen de fondo relacionado con la ubicación -->
    <video class="hero-video w-100 position-absolute" autoplay loop muted playsinline style="object-fit: cover;">
      <source src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/video.mp4" type="video/mp4">
      Your browser does not support the video tag.
    </video>
    <div class="container d-flex align-items-center justify-content-center flex-column text-white text-center position-absolute top-50 start-50 translate-middle">
      <h1 class="fw-bold mb-3 display-6 display-md-4 display-lg-1">Cómo Llegar</h1>
      <h2 class="fw-light fs-md-4 fs-lg-2">El Ejido</h2>
    </div>
  </section>

  <!-- Contenido principal -->
  <main class="py-5">
    <div class="container">
      <h2 class="text-center mb-4" style="color:#BFA181;">Encuéntranos en el corazón de El Ejido</h2>
      <p class="lead text-center mb-5" style="color: #178582;">
        Nuestro hotel se encuentra estratégicamente ubicado para que disfrutes de la ciudad y sus alrededores.
        Sigue las siguientes indicaciones para llegar a Chema Hotel.
      </p>

      <!-- Sección de Indicaciones -->
      <div class="row mb-5">
        <div class="col-md-6">
          <h4 style="color:#178582;">Indicaciones desde el aeropuerto</h4>
          <ul>
            <li>Dirígete a la salida y toma la carretera principal hacia la ciudad.</li>
            <li>Gira a la derecha en la rotonda y sigue las señales hacia el centro.</li>
            <li>Continúa recto por 2 km hasta llegar a Calle Mar Mediterráneo.</li>
            <li>Gira a la izquierda y encontrarás nuestro hotel en el número 25.</li>
          </ul>
        </div>
        <div class="col-md-6">
          <h4 style="color:#178582;">Indicaciones desde la estación de tren</h4>
          <ul>
            <li>Sal de la estación y toma la Avenida Central.</li>
            <li>Gira a la derecha en la segunda intersección.</li>
            <li>Continúa por 1 km hasta llegar a la Plaza Mayor.</li>
            <li>Desde allí, sigue las señalizaciones hacia Calle Mar Mediterráneo.</li>
          </ul>
        </div>
      </div>

      <!-- Mapa interactivo -->
      <div class="row mb-5">
        <div class="col-12">
          <h4 class="text-center" style="color:#178582;">Ubicación</h4>
          <!-- Ejemplo de mapa incrustado de Google Maps -->
          <div class="ratio ratio-16x9">
            <iframe
              src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d5374.801783224747!2d-2.812308676873821!3d36.77353580657422!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses!2ses!4v1738674194228!5m2!1ses!2ses"
              style="border:0;" allowfullscreen="" loading="lazy"></iframe>
          </div>
        </div>
      </div>

      <!-- Información adicional de contacto -->
      <div class="row">
        <div class="col-md-6 offset-md-3">
          <div class="card shadow-sm">
            <div class="card-body">
              <h5 class="card-title" style="color:#178582;">Información de Contacto</h5>
              <p class="card-text">Dirección: Calle Mar Mediterráneo N25, El Ejido</p>
              <p class="card-text">Teléfono: +34 671 157 641</p>
              <p class="card-text">Correo: jfergar2403@g.educaand.es</p>
              <a href="contacto.html" class="btn btn-primary">Enviar Consulta</a>
            </div>
          </div>
        </div>
      </div>

    </div>
  </main>

  <!-- Footer (igual que en index) -->
  <?php include_once 'views/template/footer-principal.php'; ?>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
  <!-- Script personalizado -->
  <script src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>script/script.js"></script>
</body>

</html>
