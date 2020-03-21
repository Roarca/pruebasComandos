    class NumerosAmigos {
        // Un simple programa Java para contar pares de números amigos en un array.
            // Calcular la suma de los divisores propios
            static int sumdeDiv(int x)
            {
                // 1 es un divisor propio
                int sum = 1;
                for (int i = 2; i <= Math.sqrt(x); i++)
                {
                    if (x % i == 0)
                    {
                        sum += i;
                        // Para manejar cuadrados perfectos
                        if (x / i != i)
                            sum += x / i;
                    }
                }
                return sum;
            }
            // Comprobar si el par amigo
            static boolean esAmigo(int a, int b)
            {
                return (sumdeDiv(a) == b &&
                        sumdeDiv(b) == a);
            }
            // Este método imprime un par de pares amigos
            // presentes en la matriz de entrada
            static int contarPareja(int arr[], int n)
            {
                int count = 0;
                // Iterar a través de cada par,
                // y encuentra si es una pareja son números amigos
                for (int i = 0; i < n; i++)
                    for (int j = i + 1; j < n; j++)
                        if (esAmigo(arr[i], arr[j]))
                            count++;
                return count;
            }
            public static void main(String args[])
            {
                int arr1[] = { 220, 284, 1184,
                        1210, 2, 5 };
                int n1 = arr1.length;
                System.out.println("Hay "+contarPareja(arr1, n1)+" pares de números amigos");
                int arr2[] = { 2620, 2924, 5020,
                        5564, 6232, 6368 };
                int n2 = arr2.length;
                System.out.println("Hay "+contarPareja(arr2, n2)+" pares de números amigos");
            }
    }
