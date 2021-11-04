import java.io.*;
import java.util.*;


// ENUNCIADO:

/* Escriviu un programa que llegeixi un mes en número i un any i indiqui el nombre de dies d’aquest mes. (Cal recordar que un any és de traspàs si és divisible per 4, excepte quan és divisible per 100, a no ser que sigui divisible per 400).

Input Format

Introduim un enter que sigui el mes i un enter que sigui l'any

Constraints

El mes ha d'estar contingut entre el [1,12]

Output Format

S'ha de retornar un enter amb el nombre de dies que té aquell mes.

Sample Input 0

4 1999
Sample Output 0

30
Sample Input 1

5 1999
Sample Output 1

31
Sample Input 2

2 1999
Sample Output 2

28

 */








public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        int any = sc.nextInt();

        if (mes == 2 && any <= 1999)
        {
            System.out.println(28);
        }
        if (mes == 2 && any >1999)
        {
            System.out.println(29);
        }
        else
        {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                System.out.println(31);
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                System.out.println(30);
            }
        }

    }
}
