import pandas as pd
# Costruccion diccionario culmna por columna
estadisticas = {
    "teams": ["Real Mallorca", "Real Oviedo", "Roger FC"],
    "season": [2020, 2020, 2020],
    "points": [39, 28, 14]
}
# teams_stats = pd.DataFrame(estadisticas)  
# print(teams_stats)

# Costruccion diccionario fila por fila
estadistiques2 = {
    {"teams": "Real Mallorca", "year": 2020, "points": 39},
    {"teams": "Real Oviedo", "year": 2020, "points": 28},
    {"teams": "Roger FC", "year": 2020, "points": 14},
}
teams_stats2 = pd.DataFrame(estadistiques2)
print(teams_stats2)
