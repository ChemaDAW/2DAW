<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title><?php echo TITLE . ' | ' . $data['title']?></title>
  <!-- Favicon -->
  <link rel="icon" href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/logo.png" type="image/x-icon" />

  <!-- Bootstrap CSS -->
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
    crossorigin="anonymous"
  />

  <!-- MDB Carousel (opcional si usas MDB) -->
  <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
  />

  <!-- Font Awesome -->
  <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
  />

  <!-- Fuentes externas -->
  <link
    href="https://fonts.cdnfonts.com/css/bickham-script-pro"
    rel="stylesheet"
  />

  <!-- Tu CSS personalizado -->
  <link href="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/css/habitaciones.css" rel="stylesheet" />
</head>

<body>
<?php include_once 'views/template/header-principal.php'; ?>

  <!-- SECCIÓN HERO -->
  <section class="hero-section d-flex align-items-center justify-content-center text-white">
    <div class="container d-flex flex-column align-items-center text-center">
      <h1 class="mb-4" style="font-family: 'trajan', serif;">
        Disfruta de las Mejores Habitaciones
      </h1>
      <p class="mb-5 fs-4">
        Comodidad y estilo en el lugar perfecto para tu estancia.
      </p>
      <a href="#habitaciones" class="btn btn-login" id="butonHab">Ver Habitaciones</a>
    </div>
  </section>
  <!-- FIN SECCIÓN HERO -->

  <!-- SECCIÓN HABITACIONES -->
  <section id="habitaciones" class="container py-5">
    <div class="row mb-5">
      <div class="col text-center">
        <h2 class="text-uppercase" style="color: #BFA181;">Nuestras Habitaciones</h2>
        <p>Encuentra la habitación perfecta para tu estancia</p>
      </div>
    </div>

    <!-- Fila de tarjetas de habitaciones -->
    <div class="row gy-4">
      <!-- Habitación Estándar -->
      <div class="col-md-6">
        <div class="card h-100 shadow-sm">
          <!-- Carrusel 1 -->
          <div
            id="carouselHabitacionEstandar"
            class="carousel slide carousel-fade"
            data-bs-ride="carousel"
          >
            <div class="carousel-indicators">
              <button
                type="button"
                data-bs-target="#carouselHabitacionEstandar"
                data-bs-slide-to="0"
                class="active"
                aria-current="true"
                aria-label="Slide 1"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselHabitacionEstandar"
                data-bs-slide-to="1"
                aria-label="Slide 2"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselHabitacionEstandar"
                data-bs-slide-to="2"
                aria-label="Slide 3"
              ></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img
                  src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/habitacionSimpleCama.jpg "
                  class="d-block w-100"
                  alt="Cama De La Habitacion Estandar"
                />
              </div>
              <div class="carousel-item">
                <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg" class="d-block w-100" alt="Baño De La Habitacion Estandar" />
              </div>
              <div class="carousel-item">
                <img
                  src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/entrada.jpg"
                  class="d-block w-100"
                  alt="Entrada De La Habitacion Estandar"
                />
              </div>
            </div>
            <button
              class="carousel-control-prev"
              type="button"
              data-bs-target="#carouselHabitacionEstandar"
              data-bs-slide="prev"
            >
              <span
                class="carousel-control-prev-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button
              class="carousel-control-next"
              type="button"
              data-bs-target="#carouselHabitacionEstandar"
              data-bs-slide="next"
            >
              <span
                class="carousel-control-next-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
          <!-- Fin Carrusel 1 -->

          <div class="card-body">
            <h4 class="card-title">Habitación Estándar</h4>
            <p class="card-text">
              Ideal para estancias cortas o viajeros de negocios. Cuenta con
              cama individual, baño completo y escritorio. Perfecta para el
              descanso y la funcionalidad.
            </p>
            <button class="btn btn-custom w-100">Reservar</button>
          </div>
        </div>
      </div>

      <!-- Habitación Doble -->
      <div class="col-md-6">
        <div class="card h-100 shadow-sm">
          <!-- Carrusel 2 -->
          <div
            id="carouselHabitacionDoble"
            class="carousel slide carousel-fade"
            data-bs-ride="carousel"
          >
            <div class="carousel-indicators">
              <button
                type="button"
                data-bs-target="#carouselHabitacionDoble"
                data-bs-slide-to="0"
                class="active"
                aria-current="true"
                aria-label="Slide 1"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselHabitacionDoble"
                data-bs-slide-to="1"
                aria-label="Slide 2"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselHabitacionDoble"
                data-bs-slide-to="2"
                aria-label="Slide 3"
              ></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img
                  src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/habitacionSimpleCama.jpg"
                  class="d-block w-100"
                  alt="Habitación Doble"
                />
              </div>
              <div class="carousel-item">
                <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg" class="d-block w-100" alt="Baño" />
              </div>
              <div class="carousel-item">
                <img
                  src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/entrada.jpg"
                  class="d-block w-100"
                  alt="Entrada"
                />
              </div>
            </div>
            <button
              class="carousel-control-prev"
              type="button"
              data-bs-target="#carouselHabitacionDoble"
              data-bs-slide="prev"
            >
              <span
                class="carousel-control-prev-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button
              class="carousel-control-next"
              type="button"
              data-bs-target="#carouselHabitacionDoble"
              data-bs-slide="next"
            >
              <span
                class="carousel-control-next-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
          <!-- Fin Carrusel 2 -->

          <div class="card-body">
            <h4 class="card-title">Habitación Doble</h4>
            <p class="card-text">
              Perfecta para parejas o amigos que viajan juntos. Dispone de dos
              camas o cama de matrimonio, amplio espacio y baño completo.
            </p>
            <button class="btn btn-custom w-100">Reservar</button>
          </div>
        </div>
      </div>
    </div>
    <div class="row gy-4">
        <!-- Habitación Estándar -->
        <div class="col-md-6">
          <div class="card h-100 shadow-sm">
            <!-- Carrusel 1 -->
            <div
              id="carouselHabitacionEstandar"
              class="carousel slide carousel-fade"
              data-bs-ride="carousel"
            >
              <div class="carousel-indicators">
                <button
                  type="button"
                  data-bs-target="#carouselHabitacionEstandar"
                  data-bs-slide-to="0"
                  class="active"
                  aria-current="true"
                  aria-label="Slide 1"
                ></button>
                <button
                  type="button"
                  data-bs-target="#carouselHabitacionEstandar"
                  data-bs-slide-to="1"
                  aria-label="Slide 2"
                ></button>
                <button
                  type="button"
                  data-bs-target="#carouselHabitacionEstandar"
                  data-bs-slide-to="2"
                  aria-label="Slide 3"
                ></button>
              </div>
              <div class="carousel-inner">
                <div class="carousel-item active">
                  <img
                    src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg"
                    class="d-block w-100"
                    alt="Habitación Estándar"
                  />
                </div>
                <div class="carousel-item">
                  <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg" class="d-block w-100" alt="Baño" />
                </div>
                <div class="carousel-item">
                  <img
                    src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg"
                    class="d-block w-100"
                    alt="Entrada"
                  />
                </div>
              </div>
              <button
                class="carousel-control-prev"
                type="button"
                data-bs-target="#carouselHabitacionEstandar"
                data-bs-slide="prev"
              >
                <span
                  class="carousel-control-prev-icon"
                  aria-hidden="true"
                ></span>
                <span class="visually-hidden">Previous</span>
              </button>
              <button
                class="carousel-control-next"
                type="button"
                data-bs-target="#carouselHabitacionEstandar"
                data-bs-slide="next"
              >
                <span
                  class="carousel-control-next-icon"
                  aria-hidden="true"
                ></span>
                <span class="visually-hidden">Next</span>
              </button>
            </div>
            <!-- Fin Carrusel 1 -->
  
            <div class="card-body">
              <h4 class="card-title">Habitación Estándar</h4>
              <p class="card-text">
                Ideal para estancias cortas o viajeros de negocios. Cuenta con
                cama individual, baño completo y escritorio. Perfecta para el
                descanso y la funcionalidad.
              </p>
              <button class="btn btn-custom w-100">Reservar</button>
            </div>
          </div>
        </div>
        <div class="col-md-6">
            <div class="card h-100 shadow-sm">
              <!-- Carrusel Habitacion Triple -->
              <div
                id="carouselHabitacionTriple"
                class="carousel slide carousel-fade"
                data-bs-ride="carousel"
              >
                <div class="carousel-indicators">
                  <button
                    type="button"
                    data-bs-target="#carouselHabitacionTriple"
                    data-bs-slide-to="0"
                    class="active"
                    aria-current="true"
                    aria-label="Slide 1"
                  ></button>
                  <button
                    type="button"
                    data-bs-target="#carouselHabitacionTriple"
                    data-bs-slide-to="1"
                    aria-label="Slide 2"
                  ></button>
                  <button
                    type="button"
                    data-bs-target="#carouselHabitacionTriple"
                    data-bs-slide-to="2"
                    aria-label="Slide 3"
                  ></button>
                </div>
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img
                      src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg"
                      class="d-block w-100"
                      alt="Habitación Triple 1"
                    />
                  </div>
                  <div class="carousel-item">
                    <img
                      src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg"
                      class="d-block w-100"
                      alt="Habitación Triple 2"
                    />
                  </div>
                  <div class="carousel-item">
                    <img
                      src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/bano.jpg"
                      class="d-block w-100"
                      alt="Habitación Triple 3"
                    />
                  </div>
                </div>
                <button
                  class="carousel-control-prev"
                  type="button"
                  data-bs-target="#carouselHabitacionTriple"
                  data-bs-slide="prev"
                >
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Anterior</span>
                </button>
                <button
                  class="carousel-control-next"
                  type="button"
                  data-bs-target="#carouselHabitacionTriple"
                  data-bs-slide="next"
                >
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Siguiente</span>
                </button>
              </div>
              <!-- Fin Carrusel Habitacion Triple -->
          
              <div class="card-body">
                <h4 class="card-title">Habitación Triple</h4>
                <p class="card-text">
                  Ideal para familias o grupos pequeños. Dispone de tres camas, amplio espacio y baño completo.
                </p>
                <button class="btn btn-custom w-100">Reservar</button>
              </div>
            </div>
          </div>
          
        
    <!-- Fin row de habitaciones -->
  </section>
  <!-- FIN SECCIÓN HABITACIONES -->
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
 
<?php include_once 'views/template/footer-principal.php'; ?>
  <!-- Scripts Bootstrap & MDB -->
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"
  ></script>

  <!-- MDB Carousel (opcional si sigues usando MDB) -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>
</body>
</html>
