require('dotenv').config(); // Cargar variables de entorno desde el archivo .env
const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const { Configuration, OpenAIApi } = require('openai');

const app = express();
app.use(bodyParser.json());
app.use(cors());

// Configuración de OpenAI con la API Key desde variables de entorno
const configuration = new Configuration({
    apiKey: process.env.OPENAI_API_KEY,
});
const openai = new OpenAIApi(configuration);

// Ruta para manejar solicitudes de chat
app.post('/chat', async (req, res) => {
    const { message } = req.body;

    try {
        const response = await openai.createChatCompletion({
            model: "gpt-4", // O "gpt-3.5-turbo" si usas ese modelo
            messages: [{ role: "user", content: message }],
        });

        // Responder con el contenido generado por OpenAI
        res.json({ response: response.data.choices[0].message.content });
    } catch (error) {
        console.error("Error al procesar la solicitud:", error.message);
        res.status(500).send('Error al procesar la solicitud');
    }
});

// Iniciar el servidor
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
