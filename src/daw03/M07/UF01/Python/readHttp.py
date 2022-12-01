import requests
# crea consulta get amb la api
response = requests.get('https://api.github.com')
# impresion del objeto
print(response)
# impresion del contenido
print(response.json())