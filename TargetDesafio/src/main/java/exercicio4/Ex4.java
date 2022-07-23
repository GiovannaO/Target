package exercicio4;

/**
 *
 * @author Giovanna de Oliveira Justino
 */

public class Ex4 {
    
    public static void main(String[] args) {
        //declaração de variáveis
        double sp;
        double rj;
        double mg;
        double es;
        double outros;
        double totalMensal;
          
        //atribuição de valores 
        sp = 67836.43;
        rj = 36678.66;
        mg = 29229.88;
        es = 27165.48;
        outros = 19849.53;
        
        //soma de valores
        totalMensal = sp + rj + mg + es + outros;
        
        //exibição da soma
        System.out.printf("Total mensal: R$ %.2f", totalMensal);
        
        //chamada da função
        porcentagem(totalMensal, sp, rj, mg, es, outros);
    }
    
    //função para calcular as porcentagens
    public static void porcentagem(double totalMensal, double sp, double rj, double mg, double es, double outros){
        double porcentagemSP;
        double porcentagemRJ;
        double porcentagemMG;
        double porcentagemES;
        double porcentagemOutros;

        // porcentagens
        porcentagemSP = (sp * 100) / totalMensal;
        porcentagemRJ = (rj * 100) / totalMensal;
        porcentagemMG = (mg * 100) / totalMensal;
        porcentagemES = (es * 100) / totalMensal;
        porcentagemOutros = (outros * 100) / totalMensal;
        
        //impressão das porcentagens
        System.out.printf("\n\nSP: %.0f%%\n", porcentagemSP);
        System.out.printf("RJ: %.0f%%\n", porcentagemRJ);
        System.out.printf("MG: %.0f%%\n", porcentagemMG);
        System.out.printf("ES: %.0f%%\n", porcentagemES);
        System.out.printf("Outros: %.0f%%", porcentagemOutros);
        
    }
    
}
