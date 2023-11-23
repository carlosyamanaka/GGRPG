function editanovoagente(step) {
    document.querySelectorAll('.novo-agente').forEach(etapa => {
        etapa.style.display = 'none';
    });
    document.getElementById(`step${step}`).style.display = 'block';
}