<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title><?php echo TITLE . ' | ' . $data['title']?></title>
  <link rel="icon" href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/" type="image/x-icon">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

  <!-- Estilos y fuentes -->
  <link href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/css/index.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <link href="https://fonts.cdnfonts.com/css/bickham-script-pro" rel="stylesheet">
</head>

<body>
  <!-- Navbar (igual que en index) -->
  <?php include_once 'views/template/header-principal.php'; ?>

  <!-- Sección Hero para Servicios -->
  <section id="hero-section" class="hero-section position-relative">
    <!-- Puedes usar un video o imagen de fondo relacionada con los servicios -->
    <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/fondo.jpg" alt="Fondo de contacto" class="w-100 h-100 position-absolute" style="object-fit: cover;">
    <div class="container d-flex flex-column justify-content-center align-items-center text-white text-center position-relative"
      style="padding: 4rem 1rem;">
      <h1 class="fw-bold mb-3 display-6 display-md-4 display-lg-1">Nuestros Servicios</h1>
      <h2 class="fw-light fs-md-4 fs-lg-2">Pensados para tu comodidad</h2>
    </div>
  </section>

  <!-- Contenido principal de Servicios -->
  <main class="py-5">
    <div class="container">
      <h2 class="text-center mb-5" style="color: #178582;">Descubre lo que tenemos para ti</h2>
      <div class="row g-4">
        <!-- Servicio 1 -->
        <div class="col-md-4">
          <div class="card shadow-sm">
            <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/servicio1.jpg" class="card-img-top" alt="Servicio 1">
            <div class="card-body">
              <h5 class="card-title" style="color: #178582;">Servicio de Concierge</h5>
              <p class="card-text">Nuestro equipo de concierge está disponible para ayudarte a planificar tus actividades y recomendaciones locales, garantizando una experiencia única.</p>
            </div>
          </div>
        </div>
        <!-- Servicio 2 -->
        <div class="col-md-4">
          <div class="card shadow-sm">
            <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/servicio2.jpg" class="card-img-top" alt="Servicio 2">
            <div class="card-body">
              <h5 class="card-title" style="color: #178582;">Restaurante y Bar</h5>
              <p class="card-text">Disfruta de una exquisita selección gastronómica y bebidas en un ambiente moderno y acogedor, ideal para relajarte tras un día de turismo.</p>
            </div>
          </div>
        </div>
        <!-- Servicio 3 -->
        <div class="col-md-4">
          <div class="card shadow-sm">
            <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/servicio3.jpg" class="card-img-top" alt="Servicio 3">
            <div class="card-body">
              <h5 class="card-title" style="color: #178582;">Spa y Bienestar</h5>
              <p class="card-text">Relájate y revitalízate en nuestro spa, donde ofrecemos tratamientos de bienestar y masajes para que disfrutes de momentos de tranquilidad.</p>
            </div>
          </div>
        </div>
        <!-- Puedes agregar más servicios repitiendo el patrón anterior -->
      </div>
    </div>
  </main>

  <!-- Footer (igual que en index) -->
  <?php include_once 'views/template/footer-principal.php'; ?>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
  </script>
  <!-- Script personalizado -->
  <script src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>script/script.js"></script>
</body>

</html>
