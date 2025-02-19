
 <!-- Navbar -->
 <nav class="navbar navbar-expand-lg fixed-top">
     <div class="container-fluid">
         <a class="navbar-brand me-auto" href="<?php echo RUTA_PRINCIPAL . 'principal'; ?>">
             <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/LogoChema.png" class="img-fluid" alt="Logo">
         </a>

         <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
             aria-labelledby="offcanvasNavbarLabel">
             <div class="offcanvas-header">
                 <img src="<?php echo RUTA_PRINCIPAL . 'assets/principal'; ?>/img/LogoChema.png" class="img-fluid" alt="Logo" style="max-width: 80px;">
                 <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
             </div>
             <div class="offcanvas-body">
                 <?php
                    // Supongamos que $_SERVER['REQUEST_URI'] retorna algo como "/mi-sitio/principal
                    $current_page = basename($_SERVER['REQUEST_URI']); // e.g. "principal"

                    
                    ?>

                 <ul class="navbar-nav justify-content-center flex-grow-1 pe-3">
                     <li class="nav-item">
                         <a class="nav-link mx-lg-2 <?php echo ($current_page == 'principal' ? 'active' : ''); ?>"
                             href="<?php echo RUTA_PRINCIPAL . 'principal'; ?>">
                             Inicio
                         </a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link mx-lg-2 <?php echo ($current_page == 'habitacion' ? 'active' : ''); ?>"
                             href="<?php echo RUTA_PRINCIPAL . 'habitacion'; ?>">
                             Habitaciones
                         </a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link mx-lg-2 <?php echo ($current_page == 'servicios' ? 'active' : ''); ?>"
                             href="<?php echo RUTA_PRINCIPAL . 'servicios'; ?>">
                             Servicios
                         </a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link mx-lg-2 <?php echo ($current_page == 'como_llegar' ? 'active' : ''); ?>"
                             href="<?php echo RUTA_PRINCIPAL . 'como_llegar'; ?>">
                             Como llegar
                         </a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link mx-lg-2 <?php echo ($current_page == 'contacto' ? 'active' : ''); ?>"
                             href="<?php echo RUTA_PRINCIPAL . 'contacto'; ?>">
                             Contacto
                         </a>
                     </li>
                 </ul>

             </div>
         </div>

         <!-- Botón CORREGIDO con ID -->
         <a class="login-button" id="showModalBtn" data-bs-toggle="modal" data-bs-target="#loginModal">Entrar</a>

         <button class="navbar-toggler pe-0" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar">
             <span class="navbar-toggler-icon"></span>
         </button>
     </div>
 </nav>