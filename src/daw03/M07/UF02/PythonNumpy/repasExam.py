import numpy as np

# Array de 1D
b = np.array([1,2,3])
# Array de 2
c = np.array([[1,2,3],[4,5,6]])
# Array nd array
d = np.array([[1,2,3],[4,5,6],[7,8,9]])
# zeros
e = np.zeros((2,3))
# ones
f = np.ones((3,4))
# Definiendo el tipo de dato
g = np.array(range(12), dtype='int32')
#print(g.dtype)

# No confundir ndarray de Numpy amb l'array de Python
# => ndarray => numpy.array
# => python => array.array

# ---------------------------------------------------

# NDARRAY metodos
# ndarray.ndim ⇒ Número d’eixos (dimensió) d’una array.
# ndarray.shape ⇒ Tupla d’enters que indica el tamany de la matriu en cada dimensió.
# ndarray.size ⇒ Número total d’elements de la matriu.
# ndarray.dtype ⇒ Objecte que descriu el tipus d’elements que conté la matriu.
# ndarray.itemsize ⇒ El tamany de bytes de cada element que conté la matriu.
# ndarray.data ⇒ Búfer que conté els elements reals de la matriu.
# ndarray.tolist ⇒ Convertir una ndarray a una list.

h = np.arange(15).reshape(3,5)
print(h.shape) 
#(3,5)
print(h.ndim) 
#2
print(h.dtype)
print(h.itemsize)
print(h.size)
print(type(h))
print(h.data)

# NDARRAY vs List
i = np.array ([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15])
np.reshape(i(3,4))
print(i)
