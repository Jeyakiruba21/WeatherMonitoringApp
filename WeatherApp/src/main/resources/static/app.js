function fetchWeather() {
  const location = document.getElementById('locationInput').value.trim();
  if (!location) return;

  const url = `/api/weather/current?location=${location}`;
  const card = document.getElementById('weatherCard');
  card.style.display = 'block';

  fetch(url)
    .then(response => {
      if (!response.ok) throw new Error("Weather data not found");
      return response.json();
    })
    .then(data => {
      const { location, current } = data;

      document.getElementById('cityName').innerText = `📍 ${location.name}, ${location.country}`;
      document.getElementById('temperature').inner