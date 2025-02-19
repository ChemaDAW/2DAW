// Control del botón de login
const modal = document.getElementById('loginModal');
const showBtn = document.getElementById('showModalBtn');

modal.addEventListener('show.bs.modal', () => {
    showBtn.classList.add('d-none');
});

modal.addEventListener('hidden.bs.modal', () => {
    showBtn.classList.remove('d-none');
});



const ratingModalElement = document.getElementById('ratingModal');
const ratingModal = new bootstrap.Modal(ratingModalElement);

const starRatingModalElement = document.getElementById('starRatingModal');
const starRatingModal = new bootstrap.Modal(starRatingModalElement);

const rateNowBtn = document.getElementById('rateNow');
const remindLaterBtn = document.getElementById('remindLater');
const doNotShowBtn = document.getElementById('doNotShow');
const stars = document.querySelectorAll('.stars button');
const submitRatingBtn = document.getElementById('submitRating');

let selectedRating = null;
let reminderTimeout;

// Función para mostrar el modal principal
function showRatingModal() {
    if (localStorage.getItem("doNotShowAgain") !== "true" && localStorage.getItem("remindLaterClicked") !== "true") {
        ratingModal.show();
    }
}

// Inicializar el intervalo para mostrar el modal principal en 10 minutos
const tenMinutes = 60000; // 60,000ms = 1 minutos
let modalInterval = setInterval(showRatingModal, tenMinutes);

// Acciones del modal principal
rateNowBtn.addEventListener("click", () => {
    ratingModal.hide();
    starRatingModal.show(); // Abre el segundo modal
    clearInterval(modalInterval); // Detener futuros avisos
});

remindLaterBtn.addEventListener("click", () => {
    ratingModal.hide();
    // Guardar que el usuario hizo clic en "Hacerlo más tarde"
    localStorage.setItem("remindLaterClicked", "true");
    // Programar la reaparición del modal después de 5 minutos
    reminderTimeout = setTimeout(() => {
        if (localStorage.getItem("remindLaterClicked") === "true" && localStorage.getItem("doNotShowAgain") !== "true") {
            showRatingModal(); // Mostrar el modal después de 5 minutos
        }
    }, 120000); // 120,000ms = 2 minutos
});

doNotShowBtn.addEventListener("click", () => {
    ratingModal.hide();
    localStorage.setItem("doNotShowAgain", "true");
    localStorage.removeItem("remindLaterClicked"); // Eliminar el flag de "más tarde"
    clearInterval(modalInterval); // Detener futuros avisos
    clearTimeout(reminderTimeout); // Limpiar el timeout si se activa "No mostrar más"
});

// Acciones del modal de valoración con estrellas
stars.forEach((star, index) => {
    star.addEventListener('click', () => {
        stars.forEach((s, i) => {
            if (i <= index) {
                s.classList.add('selected');
            } else {
                s.classList.remove('selected');
            }
        });
        selectedRating = star.getAttribute('data-value');
        submitRatingBtn.disabled = false;
    });
});

submitRatingBtn.addEventListener('click', () => {
    alert(`¡Gracias por darnos una calificación de ${selectedRating} estrellas!`);
    starRatingModal.hide();
});
// Añade esto al final de tu script

let adults = 1;
let children = 0;

function updateGuests(type, change) {
    if (type === 'adults') {
        adults = Math.max(1, adults + change);
        document.getElementById('adult-count').textContent = adults;
        document.getElementById('adult-input').value = adults;
    } else {
        children = Math.max(0, children + change);
        document.getElementById('child-count').textContent = children;
        document.getElementById('child-input').value = children;
    }

    updateGuestText();
    function updateGuestText() {
        const total = adults + children;
        let text = `${adults} Adulto${adults !== 1 ? 's' : ''}`;
        if (children > 0) text += `, ${children} Niño${children !== 1 ? 's' : ''}`;

        document.getElementById('guest-selection-text').textContent = text;
    }
} 
const departure = document.getElementById('departure');
const returnInput = document.getElementById('return');
const display = document.getElementById('date-display');
let currentStep = 1; // 1 = ida, 2 = vuelta

function openDatePicker() {
    if (currentStep === 1 || !departure.value) {
        departure.click();
    } else {
        returnInput.click();
    }
}

display.addEventListener('click', () => {
    if (!departure.value && !returnInput.value) {
        currentStep = 1;
        openDatePicker();
    } else if (departure.value && !returnInput.value) {
        currentStep = 2;
        openDatePicker();
    } else {
        departure.value = '';
        returnInput.value = '';
        returnInput.disabled = true;
        currentStep = 1;
        updateDisplay();
    }
});

departure.addEventListener('change', () => {
    returnInput.min = departure.value;
    returnInput.disabled = false;
    currentStep = 2;
    
    // Validar si la vuelta existente es inválida
    if (returnInput.value && new Date(returnInput.value) < new Date(departure.value)) {
        alert('La vuelta no puede ser anterior a la ida');
        returnInput.value = '';
    }
    
    updateDisplay();
    setTimeout(openDatePicker, 100);
});

returnInput.addEventListener('change', () => {
    if (returnInput.value && new Date(returnInput.value) < new Date(departure.value)) {
        alert('La vuelta no puede ser anterior a la ida');
        returnInput.value = '';
    }
    updateDisplay();
});

function updateDisplay() {
    let texto = '';
    if (departure.value) texto += `Ida: ${formatDate(departure.value)}`;
    if (returnInput.value) texto += `${texto ? ' / ' : ''}Vuelta: ${formatDate(returnInput.value)}`;
    display.textContent = texto || 'Clic para seleccionar'; // Usar textContent para div
}

function formatDate(dateString) {
    const date = new Date(dateString);
    return date.toLocaleDateString('es-ES', { day: '2-digit', month: '2-digit', year: 'numeric' });
}
// En updateDisplay():
display.textContent = texto || 'Clic para seleccionar'; 
