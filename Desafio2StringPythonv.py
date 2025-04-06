def encontrar_palavras(texto):
    palavras = []
    palavra = ''
    for caractere in texto:
        if caractere.isalpha() or caractere.isdigit():
            palavra += caractere
        else:
            if len(palavra) >= 4 and not palavra.isdigit():
                palavras.append(palavra.lower())  # Adiciona em minúsculas
            palavra = ''
    
    # Verifica a última palavra (caso o texto não termine com espaço)
    if len(palavra) >= 4 and not palavra.isdigit():
        palavras.append(palavra.lower())
    
    return palavras

def imprimir_formatado(palavras):
    print("\nPALAVRAS ENCONTRADAS")
    print("====================")
    for p in palavras:
        print(p)
    
    if palavras:
        maior = max(palavras, key=len)
        menor = min(palavras, key=len)
        print("\nMAIOR PALAVRA ENCONTRADA:", maior)
        print("MENOR PALAVRA ENCONTRADA:", menor)
    else:
        print("\nNenhuma palavra com 4 ou mais letras foi encontrada.")

def contar_repeticoes(palavras):
    contagem = {}
    for p in palavras:
        if p in contagem:
            contagem[p] += 1
        else:
            contagem[p] = 1
    return contagem

def buscar_palavra(palavra, contagem):
    palavra = palavra.lower()
    if palavra in contagem:
        print(f"A palavra '{palavra}' aparece {contagem[palavra]}x no texto.")
    else:
        print(f"A palavra '{palavra}' **não aparece** no texto.")

# --- PROGRAMA PRINCIPAL ---
texto = input("Escreva o texto que deve ser analisado logo abaixo: \n")

palavras_encontradas = encontrar_palavras(texto)
imprimir_formatado(palavras_encontradas)

# Mostrar contagem de palavras repetidas
repeticoes = contar_repeticoes(palavras_encontradas)
print("\nFREQUÊNCIA DAS PALAVRAS:")
print("========================")
for palavra, qtd in repeticoes.items():
    print(f"{palavra}: {qtd}x")

# Loop para buscar palavras até digitar '!'
while True:
    palavra_usuario = input("\nDigite uma palavra para verificar (ou '!' para sair): ")
    if palavra_usuario == '!':
        print("Busca encerrada.")
        break
    buscar_palavra(palavra_usuario, repeticoes)
