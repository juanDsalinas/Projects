# #  Historias locas 
# word=[]
# res = 1
# while res==1:
#     cont = int(input("Cuantas palabras vas a solicitar\n"))
#     for i in range(cont):
#         palabraIngresar=input(f"ingrese la palabra {i} \n")
#         word.append(palabraIngresar)
#     print("salio")
#     res=int(input("deseas salir - 2 - si - 1 - no \n"))

# # print(len(word))

# for j in range(len(word)):
#     for i in range(len(word)):
#         print(f"intenta adivinar cada palabra, {i} intentos de {len(word)} para la palabra {j}")
#         user=input("adivina una palabra \n")
#         if user==word[i]:
#             print("es igual")
#             word.pop(i)
#             i==len(word)
#         else:
#             print("sigue intentando")        
            
# print(word)

# def basic_op(operator, value1, value2):
#         res=0
#         if operator=="+":
#             res = value1 + value2
#         elif operator=="-":
#             res = value1-value2
#         elif operator=="*":
#             res=value1*value2
#         elif operator=="/":
#             res=value1/value2
        
#         return res

# print(basic_op("+",2,2))


# def basic_op(operator, value1, value2):
#     return eval(f"{value1} {operator} {value2}")
# print(basic_op("+",2,2))

# def basic_op(o, a, b):
#     return {'+':a+b,'-':a-b,'*':a*b,'/':a/b}.get(o)
# print(basic_op("+",2,2))

# def basic_op(operator, value1, value2):
#     op = {
#         '+' : (value1 + value2),
#         '-' : (value1 - value2),
#         '*' : (value1 * value2),
#         '/' : (value1 / value2),
#     }
    
#     return op[operator]

# print(basic_op("*",8,8))

# def feast(beast, dish):
#     inicial = beast[0]
#     final = beast[-1]
#     if dish[0] == inicial and dish[-1]==final:
#         return True
#     else:
#         return False        

# print(feast("oso","omeglo"))
   
    
# def feast(beast, dish):
#     return beast[0] == dish[0] and beast[-1] == dish[-1]      
# print(feast("osi","omeglo"))


# def area_or_perimeter(l , w):
#    if l==w:
#         return l*w
#    else:
#         return (l*2)*(w*2)
    
# area_or_perimeter = lambda a, b : a * b if a == b else 2 * (a + b)
# print(area_or_perimeter(6,10))

# def area_or_perimeter(l , w):
#     return l * w if l == w else 2 * (l + w)

# def par(a):
#     return True if a%2==0 else False

# print(par(180))

def is_prime(num):
    """_summary_

    Args:
        num (_type_): _description_

    Returns:
        _type_: _description_
    """
    
    return True if num%2==0 or num%3==0 or num%4==0 else False
print(is_prime(1))



