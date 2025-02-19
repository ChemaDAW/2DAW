
document.addEventListener('DOMContentLoaded', function () {
    var sanValentinModal = new bootstrap.Modal(document.getElementById('sanValentinModal'));
    sanValentinModal.show();
});

function hideLoader() {
    const loader = document.getElementById("loader");
    const pageContent = document.getElementById("page-content");
    if (!loader) {
        console.error("No se encontró el elemento con id 'loader'");
        return;
    }
    if (!pageContent) {
        console.error("No se encontró el elemento con id 'page-content'");
        return;
    }
    loader.style.display = "none";
    pageContent.style.display = "block";
}
document.addEventListener("DOMContentLoaded", function() {
    const urlParams = new URLSearchParams(window.location.search);
    if (urlParams.get('modal') === 'login') {
      const loginModal = new bootstrap.Modal(document.getElementById('loginModal'));
      loginModal.show();
    }
  });
  /**
 * Función para formatear una fecha en formato DD/MM/YYYY
 * @param {string} dateString - Valor del input type="date" (YYYY-MM-DD)
 * @returns {string} Fecha formateada DD/MM/YYYY
 */
function formatDate(dateString) {
    if (!dateString) return "";
    const [year, month, day] = dateString.split("-");
    return `${day}/${month}/${year}`;
  }
  
  // Referencias a elementos del DOM
  const departureInput = document.getElementById("departure");
  const returnInput = document.getElementById("return");
  const dateDisplay = document.getElementById("date-display");
  const form = document.getElementById("reservation-form");
  
  // Al hacer click en el texto "Selecciona Fechas", forzar el click en departure:
  dateDisplay.addEventListener("click", () => {
    departureInput.click();
  });
  
  // Al cambiar la fecha de salida
  departureInput.addEventListener("change", () => {
    // Habilitamos el campo de regreso
    returnInput.disabled = false;
    // Ajustamos la fecha mínima de regreso para que sea igual o posterior a la salida
    returnInput.min = departureInput.value;
    
    // Si ya se había seleccionado una fecha de regreso y es menor que la de salida, la reseteamos
    if (returnInput.value && returnInput.value < departureInput.value) {
      returnInput.value = "";
      dateDisplay.value = formatDate(departureInput.value);
    }
    
    // Si todavía no hay fecha de regreso
    if (!returnInput.value) {
      dateDisplay.value = `Salida: ${formatDate(departureInput.value)}`;
    } else {
      // Si ya hay fecha de regreso
      dateDisplay.value = `${formatDate(departureInput.value)} - ${formatDate(returnInput.value)}`;
    }
  });
  
  // Al cambiar la fecha de regreso
  returnInput.addEventListener("change", () => {
    const salida = formatDate(departureInput.value);
    const regreso = formatDate(returnInput.value);
    dateDisplay.value = `${salida} - ${regreso}`;
  });
  
  /**
   * Manejo de huéspedes (adultos / niños)
   */
  let adultCount = 1;
  let childCount = 0;
  
  function updateGuests(type, increment) {
    if (type === "adults") {
      // Evitar que adultos baje de 1
      if (adultCount + increment < 1) return;
      adultCount += increment;
      document.getElementById("adult-count").textContent = adultCount;
      document.getElementById("adult-input").value = adultCount;
    } else if (type === "children") {
      // Evitar que niños baje de 0
      if (childCount + increment < 0) return;
      childCount += increment;
      document.getElementById("child-count").textContent = childCount;
      document.getElementById("child-input").value = childCount;
    }
  
    // Actualizar texto en el botón de huéspedes (opcional)
    updateGuestText();
  }
  
  function updateGuestText() {
    const guestTextElement = document.getElementById("guest-selection-text");
    let text = "";
    
    if (adultCount === 1) {
      text += `${adultCount} Adulto`;
    } else {
      text += `${adultCount} Adultos`;
    }
  
    if (childCount > 0) {
      text += (childCount === 1) ? `, ${childCount} Niño` : `, ${childCount} Niños`;
    }
  
    // Caso especial (1 adulto, 0 niños)
    if (adultCount === 1 && childCount === 0) {
      text = "1 Adulto";
    }
  
    guestTextElement.textContent = text;
  }
  
  // Inicializamos el texto de huéspedes al cargar
  updateGuestText();
  
  /**
   * Manejo del Submit del formulario
   */
  form.addEventListener("submit", (event) => {
    event.preventDefault(); // Evita la recarga de página por defecto
  
    const departureDate = departureInput.value;
    const returnDate = returnInput.value;
    const codeValue = document.getElementById("input-code").value;
    const adults = document.getElementById("adult-input").value;
    const children = document.getElementById("child-input").value;
  
    // Ejemplo: mostrar los datos en consola
    console.log("Fecha de salida:", departureDate);
    console.log("Fecha de regreso:", returnDate);
    console.log("Código de descuento:", codeValue);
    console.log("Adultos:", adults);
    console.log("Niños:", children);
  
    alert("¡Formulario enviado! Revisa la consola para ver los datos.");
  });