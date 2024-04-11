package ficha_01;

import java.util.Scanner;

/*Foi contactado por uma empresa XPTO,Lda. para a elaboração de um programa que permita calcular o vencimento de um colaborador,
bem como os descontos e impostos decorrentes desse processo salarial. Conceitos:

a - vencimento base 40 euros por dia
b - subsídio de alimentação: 5 euros por dia
c - Retenção de IRS: 10%
d - Seg. Social 11%  encargo do funcionário e 23.75% a cargo da entidade patronal.

Deve ser solicitado ao utilizador o código do funcionário e o número de dias que ele trabalhou nesse mês. Deverá depois apresentar:
  a- o valor líquido a receber fruto do seu vencimento
  b - total subsídio de alimentação
  c - valor da retenção de IRS a entregar ao estado
  d - valor total a entregar à S.S. (ambos os encargos)
  e - valor líquido a receber pelo funcionário
  */
public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variáveis
        int vencimento, subsidioA, cod_funcionario, dias_trabalhados;
        double irs_10, seg_social_func, seg_social_patronal;

        //guardar valores int
        vencimento = 40;
        subsidioA = 5;

        //guardar valores double
        irs_10 = 0.10;
        seg_social_func = 0.11;
        seg_social_patronal = 0.24;

        //Pedir código de funcionário
        System.out.println ("Qual é o seu código de funcionário");
        //guardar valor
        cod_funcionario= input.nextInt();

        //número de dias que trabalhou nesse mês
        System.out.println ("Quantos dias trabalhou no mês passado?");
        //guardar valor
        dias_trabalhados= input.nextInt();

        //a- o valor líquido a receber fruto do seu vencimento


        // b - total subsídio de alimentação
        // c - valor da retenção de IRS a entregar ao estado
        // d - valor total a entregar à S.S. (ambos os encargos)
        // e - valor líquido a receber pelo funcionário





    }
}
