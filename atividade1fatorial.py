#função que  calcula o fatorial de um numero fornecido

def f_fatorial(Num: int)->int:
	multi = int
	fatorial = int(1)

	for i in range(1, Num + 1):
		fatorial = fatorial*i

	return fatorial

def main():
	# declaração de variaveis
	Num = int
	# entrada de dados
	Num = int(input("quer o fatorial de qual numero inteiro positivo?: "))

	print ("fatorial de %.1i igual a %.1i" % (Num, f_fatorial(Num)))

if __name__ == "__main__":
	main()
# pode ser apenas main() na coluna 0



