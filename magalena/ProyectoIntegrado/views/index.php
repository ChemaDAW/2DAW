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

    <?php include_once 'views/template/header-principal.php'; ?>
    <!-- Sección Hero -->
    <section id="hero-section" class="hero-section position-relative ">
        <video class="hero-video w-100 position-absolute " autoplay loop muted playsinline style="object-fit: cover;">
            <source src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/video.mp4" type="video/mp4">
            Your browser does not support the video tag.
        </video>
        <div
            class="container d-flex align-items-center justify-content-center flex-column text-white text-center position-absolute top-50 start-50 translate-middle">
            <h1 class="fw-bold mb-3 display-6 display-md-4 display-lg-1" id="tituloHero">Chema Hotel</h1>
            <h2 class="fw-light  fs-md-4 fs-lg-2">El Ejido</h2>
        </div>
    </section>

    <!-- Modal de Login/Registro -->
    <div class="modal fade" id="loginModal" tabindex="-1"> <!-- Quitamos la clase "fade" -->
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
                                <a href="#" class="ms-3" id="olvidoContrasena"> ¿Olvidaste la contraseña?</a>
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
    <div class="card-body p-0 colored-margin" style="background-color: #BFA181; margin: 1rem; position: relative;">
        <form class="needs-validation" novalidate>
            <!-- Contenedor principal -->
            <div class="container-fluid p-2">
                <div class="row g-2">
                    <!-- Fecha -->
                    <div class="col-12 col-md-3">
                        <div style="background-color: #8f7963; border-radius: 5px; position: relative;">
                            <!-- Campo visible -->
                            <input type="text"
                                class="form-control border-0 py-2 w-100"
                                id="date-display"
                                readonly
                                style="background: transparent; color: #fff; cursor: pointer; caret-color: transparent;"
                                placeholder="Seleciona Fechas">

                            <!-- Inputs reales (ocultos pero funcionales) -->
                            <input type="date"
                                id="departure"
                                style="position: absolute; top: 0; left: 0; width: 100%; height: 100%; opacity: 0; cursor: pointer;">

                            <input type="date"
                                id="return"
                                style="position: absolute; top: 0; left: 0; width: 100%; height: 100%; opacity: 0; cursor: pointer;"
                                disabled>
                        </div>
                    </div>
                    <!-- Código -->
                    <div class="col-12 col-md-2">
                        <div style="background-color: #8f7963; border-radius: 5px;">
                            <input type="text" class="form-control border-0 py-2 w-100" id="input-code"
                                placeholder="CODIGO DESC." style="background: transparent; color: #fff;"
                                aria-label="Código de reserva">
                        </div>
                    </div>

                    <!-- Huéspedes -->
                    <div class="col-12 col-md-3">
                        <div style="background-color: #8f7963; border-radius: 5px;">
                            <div class="dropdown">
                                <!-- Botón que muestra el desplegable -->
                                <button
                                    class="btn w-100 border-0 bg-transparent d-flex align-items-center justify-content-between py-2 text-white"
                                    type="button" id="guestDropdown" data-bs-toggle="dropdown" aria-expanded="false"
                                    style="color: #BFA181 !important;">
                                    <span id="guest-selection-text" style="color: black;">HUÉSPEDES</span>
                                    <i class="fas fa-chevron-down ms-2"></i>
                                </button>

                                <!-- Contenido del desplegable -->
                                <div class="dropdown-menu w-100 p-3" aria-labelledby="guestDropdown"
                                    style="background-color: #8f7963; border: none; border-radius: 5px;">

                                    <!-- Selector de Adultos -->
                                    <div class="d-flex align-items-center justify-content-between mb-3">
                                        <div>
                                            <div class="text-white">Adultos</div>
                                            <small style="color: #BFA181;">+12 años</small>
                                        </div>
                                        <div class="d-flex align-items-center">
                                            <button type="button" class="btn btn-sm btn-count"
                                                onclick="updateGuests('adults', -1)"
                                                style="background-color: #BFA181; color: #8f7963;">
                                                -
                                            </button>
                                            <span id="adult-count" class="mx-2 text-white">1</span>
                                            <button type="button" class="btn btn-sm btn-count"
                                                onclick="updateGuests('adults', 1)"
                                                style="background-color: #BFA181; color: #8f7963;">
                                                +
                                            </button>
                                        </div>
                                    </div>

                                    <!-- Selector de Niños -->
                                    <div class="d-flex align-items-center justify-content-between">
                                        <div>
                                            <div class="text-white">Niños</div>
                                            <small style="color: #BFA181;">0-11 años</small>
                                        </div>
                                        <div class="d-flex align-items-center">
                                            <button type="button" class="btn btn-sm btn-count"
                                                onclick="updateGuests('children', -1)"
                                                style="background-color: #BFA181; color: #8f7963;">
                                                -
                                            </button>
                                            <span id="child-count" class="mx-2 text-white">0</span>
                                            <button type="button" class="btn btn-sm btn-count"
                                                onclick="updateGuests('children', 1)"
                                                style="background-color: #BFA181; color: #8f7963;">
                                                +
                                            </button>
                                        </div>
                                    </div>

                                    <!-- Inputs ocultos para el formulario -->
                                    <input type="hidden" name="adults" id="adult-input" value="1">
                                    <input type="hidden" name="children" id="child-input" value="0">
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Botón de Reserva -->
                    <div class="col-12 col-md-4">
                        <button type="submit"
                            class="btn btn-primary btn-lg w-100 rounded-0 d-flex align-items-center justify-content-center py-2"
                            style="border: none; box-shadow: none; background-color: #8f7963; color: #BFA181; font-weight: 600;">
                            <i class="fas fa-concierge-bell me-2"></i>
                            <span>RESERVA</span>
                        </button>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <section class="cuerpo-medio py-2">
        <div class="container">
            <div class="text-center text-md-start">
                <h3 class="fw-bold mb-3 text-center" id="tituloCuerpoMedio">Un Lugar Único</h3>
                <h1 class="fw-bold mb-4 text-center" id="subtituloCuerpoMedio">CHEMA HOTEL</h1>
                <p class="fs-6 fs-md-5 lh-lg" id="parrafoCuerpoMedio">
                    Chema Hotel es un alojamiento ideal para los que buscan vivir y descubrir la belleza de una ciudad
                    única.
                    Su extraordinaria ubicación, en el centro de El Ejido, la comodidad de sus habitaciones, la
                    magnífica
                    relación
                    calidad-precio, la disponibilidad de dejar el vehículo resguardado y disfrutar sin preocupaciones,
                    lo
                    convierten en el escenario perfecto y el lugar elegido por todos los viajeros. En el Chema Hotel,
                    encontrarás
                    tu hogar.
                    Descubre la magia de El Ejido con nosotros, ¡déjate embargar por su esencia!
                </p>
            </div>
        </div>
    </section>


    <div class="container-fluid main-container">
        <div class="row">
            <!-- Columna izquierda con el título y la descripción -->
            <div class="col-md-6 left-content p-5">
                <h2>Suscríbete a nuestro Newsletter</h2>
                <p>Recibe las últimas novedades, ofertas especiales y contenido exclusivo directamente en tu correo
                    electrónico. Únete a nuestra comunidad y mantente siempre informado.</p>
            </div>
            <!-- Columna derecha con el formulario -->
            <div class="col-md-6 p-5">
                <form>
                    <div class="mb-4 input-group">
                        <span class="input-group-text"><i class="fa-solid fa-user"></i></i></span>
                        <input type="text" class="form-control" id="inputNombre" placeholder="nombre" required>
                    </div>
                    <div class="mb-4 input-group">
                        <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                        <input type="email" class="form-control" id="inputEmail" placeholder="nombre@ejemplo.com"
                            required>
                    </div>
                    <div class="mb-4 form-check">
                        <input type="checkbox" class="form-check-input" id="consentimiento" required>
                        <label class="form-check-label" for="consentimiento">Acepto los términos y condiciones</label>
                    </div>
                    <button type="submit" class="btn btn-custom">Suscribirse</button>
                    <div class="form-text text-left fst-italic mt-3">
                        No compartimos tu información con terceros.
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="container-fluid secon-container" id="secon-container">
        <h2 class="text-center mb-4">Reseñas de Usuarios</h2> <!-- Título en la parte superior -->
        <div class="row">
            <div class="col-md-4">
                <div class="card review-card">
                    <div class="card-body">
                        <h5 class="card-title">Usuario 1</h5>
                        <p class="card-text">"Excelente producto, muy satisfecho con mi compra. Lo recomendaría a
                            todos!"</p>
                        <p class="card-text"><small class="text-muted">Fecha: 25 de octubre, 2024</small></p>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card review-card">
                    <div class="card-body">
                        <h5 class="card-title">Usuario 2</h5>
                        <p class="card-text">"El servicio al cliente fue increíble. Definitivamente volveré a comprar
                            aquí."</p>
                        <p class="card-text"><small class="text-muted">Fecha: 24 de octubre, 2024</small></p>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card review-card">
                    <div class="card-body">
                        <h5 class="card-title">Usuario 3</h5>
                        <p class="card-text">"Calidad excepcional y envío rápido. Estoy muy contento con mi compra."</p>
                        <p class="card-text"><small class="text-muted">Fecha: 23 de octubre, 2024</small></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="d-grid gap-2 col-3 mx-auto">
            <button class="btn btn-primary" id="boton-habitaciones" type="button"
                onclick="window.location.href='habitaciones.html';">
                Ver Habitaciones
            </button>
        </div>
    </div>
    <?php include_once 'views/template/footer-principal.php'; ?>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

    <!-- Script personalizado -->
    <script src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/script/script.js"></script>


</body>

</html>