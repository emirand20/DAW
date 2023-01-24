import pandas as pd

df = pd.read_csv('data/population.csv', usecols=['City', 'Density KM2'])
print(df.tail())
#Ordenar y sumar
#orderSum = df[(df['Population'] == 'Senglea')]
#print(orderSum['Population'].sum())

persons = {'name': ['Roger', 'Oriol', 'Maria'],'age':[18, 34,36]}
df = pd.DataFrame(persons)
print('----------------------')
print(df)
persons02 = pd.DataFrame(persons, index= ['User1', 'User2', 'User3'])
print('----------------------')
print(persons02)
persons03 = pd.DataFrame(persons02, columns=['names', 'ages'])
print('----------------------')
print(persons03)
#Selecionar una fila
print('----------------------')
print(persons02.loc[['User2'], ['age']])