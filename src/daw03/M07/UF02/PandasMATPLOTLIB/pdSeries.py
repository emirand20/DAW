import pandas as pd

series = pd.Series([1,2,3])
#print(series)

series.name = 'NombreLista'
#print(series)

#DataFrame
df = pd.DataFrame({'columna 1': [1,2,3,4], 'Columna 2': ['a','b','c','d']})
print(df)
print(df.shape)
#(4 filas 2 columnas)