import json
# leer un fichero json
with open('jsonFile.json', 'r') as file:
    result = json.load(file)
    print(result)

# crea un archivo json
data = """
    {
        "person":[
            {"name":"Javi"
            "surname":"Miranda"
            "age": "45"
            }
        ]
    }
"""
data2 = {"person":[{"name":"Javi","surname":"Miranda","age": "45"}]}
# print(json.dumps(data2))
print(json.dumps(data2, indent=2))