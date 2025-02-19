<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title><?php echo TITLE . ' | ' . $data['title']?></title>
  <link rel="icon" href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>img/" type="image/x-icon">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <!-- Estilos y fuentes -->
  <link href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/css/index.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <link href="https://fonts.cdnfonts.com/css/bickham-script-pro" rel="stylesheet">
</head>
<body>
<?php include_once 'views/template/header-principal.php'; ?>

  <!-- Sección Hero para Contacto -->
  <section id="hero-section" class="hero-section position-relative" style="height: 50vh;">
    <!-- Puedes utilizar una imagen de fondo en lugar de video si lo prefieres -->
    <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/fondo-formulario.webp" alt="Fondo de contacto" class="w-100 h-100 position-absolute" style="object-fit: cover;">
    <div class="position-absolute top-50 start-50 translate-middle text-center text-white" style="z-index: 1;">
      <h1 class="fw-bold">Contacto</h1>
      <p class="fs-4">¿Tienes alguna pregunta o necesitas ayuda? ¡Escríbenos!</p>
    </div>
    <!-- Capa de oscurecimiento -->
    <div class="position-absolute top-0 start-0 w-100 h-100" style="background-color: rgba(0,0,0,0.5);"></div>
  </section>

  <!-- Sección de Contenido (Formulario de Contacto e Información) -->
  <main class="container my-5">
    <div class="row">
      <!-- Formulario de Contacto -->
      <div class="col-md-7 mb-4" style="padding-right: 60px;">
        <h2 class="mb-3" style="color: #178582;">Envíanos un mensaje</h2>
        <form action="#" method="post" class="needs-validation" novalidate>
          <div class="mb-3">
            <label for="nombre" class="form-label" style="color: #BFA181;">Nombre</label>
            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Tu nombre" required>
            <div class="invalid-feedback">Por favor ingresa tu nombre.</div>
          </div>
          <div class="mb-3">
            <label for="email" class="form-label" style="color: #BFA181;">Correo electrónico</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="nombre@ejemplo.com" required>
            <div class="invalid-feedback">Por favor ingresa un correo válido.</div>
          </div>
          <div class="mb-3">
            <label for="asunto" class="form-label" style="color: #BFA181;">Asunto</label>
            <input type="text" class="form-control" id="asunto" name="asunto" placeholder="Asunto de tu mensaje" required>
            <div class="invalid-feedback">Por favor ingresa un asunto.</div>
          </div>
          <div class="mb-3">
            <label for="mensaje" class="form-label" style="color: #BFA181;">Mensaje</label>
            <textarea class="form-control" id="mensaje" name="mensaje" rows="6" placeholder="Escribe tu mensaje aquí..." required></textarea>
            <div class="invalid-feedback">Por favor ingresa tu mensaje.</div>
          </div>
          <button type="submit" class="btn btn-primary" id="submit-button">Enviar Mensaje</button>
        </form>
      </div>
      <!-- Información de Contacto -->
      <div class="col-md-5">
        <h2 class="mb-3" style="color: #178582;">Datos de Contacto</h2>
        <p style="color: #555;">Si prefieres contactarnos por otros medios, aquí te dejamos nuestras direcciones:</p>
        <ul class="list-unstyled">
          <li class="mb-2"><i class="fas fa-envelope me-2" style="color: #BFA181;"></i> jfergar2403@g.educaand.es</li>
          <li class="mb-2"><i class="fas fa-phone-alt me-2" style="color: #BFA181;"></i> +34 671 157 641</li>
          <li class="mb-2"><i class="fas fa-map-marker-alt me-2" style="color: #BFA181;"></i> Calle Mar Mediterraneo N25</li>
        </ul>
        <!-- Opcional: Puedes incluir un mapa incrustado -->
        <div class="mt-4">
          <iframe               src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d5374.801783224747!2d-2.812308676873821!3d36.77353580657422!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses!2ses!4v1738674194228!5m2!1ses!2ses"
          width="100%" height="250" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
        </div>
      </div>
    </div>
  </main>

  <!-- Footer (igual que en el resto de páginas) -->
  <?php include_once 'views/template/footer-principal.php'; ?>

  <!-- Modal de Login/Registro (igual que en tu otra página) -->
  <div class="modal fade" id="loginModal" tabindex="-1">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="loginModalLabel">Acceso/Registro</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Cerrar"></button>
        </div>
        <div class="modal-body">
          <ul class="nav nav-tabs mb-4">
            <li class="nav-item">
              <a class="nav-link active" data-bs-toggle="tab" href="#login">Acceder</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" data-bs-toggle="tab" href="#register">Registrarse</a>
            </li>
          </ul>
          <div class="tab-content">
            <!-- Formulario de Login -->
            <div class="tab-pane fade show active" id="login">
              <form>
                <div class="mb-3">
                  <label for="loginEmail" class="form-label">Usuario o Correo electrónico</label>
                  <input type="email" class="form-control" id="loginEmail" required>
                </div>
                <div class="mb-3">
                  <label for="loginPassword" class="form-label">Contraseña</label>
                  <input type="password" class="form-control" id="loginPassword" required>
                </div>
                <div class="mb-3 form-check">
                  <input type="checkbox" class="form-check-input" id="rememberMe">
                  <label class="form-check-label" for="rememberMe">Recuérdame</label>
                </div>
                <button type="submit" class="btn btn-primary">Acceder</button>
                <a href="#" class="ms-3" id="olvidoContrasena">¿Olvidaste la contraseña?</a>
              </form>
            </div>
            <!-- Formulario de Registro -->
            <div class="tab-pane fade" id="register">
              <form>
                <div class="mb-3">
                  <label for="registerEmail" class="form-label">Correo electrónico</label>
                  <input type="email" class="form-control" id="registerEmail" required>
                </div>
                <div class="mb-3">
                  <label for="registerPassword" class="form-label">Contraseña</label>
                  <input type="password" class="form-control" id="registerPassword" required>
                </div>
                <div class="mb-3">
                  <label for="confirmPassword" class="form-label">Repetir Contraseña</label>
                  <input type="password" class="form-control" id="confirmPassword" required>
                </div>
                <button type="submit" class="btn btn-primary">Registrarse</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
  <!-- Script personalizado -->
  <script src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>script/script.js"></script>
</body>
</html>
