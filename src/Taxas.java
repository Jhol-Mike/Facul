import java.util.Scanner;
//INSS
public abstract class Taxas {

    protected float txInsalubridade;
    protected float hora_extra;
    protected float Coletar_FTGS ;
    protected float txINSS;
    protected float txIR;
        protected String nivelInsalubridade;
    
        
    public float calculoInsalubridade(float salario){
    
        int nivel = 0;
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 1 se o nível de insalubridade é máximo, 2 se é médio ou 3 se é mínimo:");
        nivel = scan.nextInt();
        
        if(nivel == 1){
            
            txInsalubridade = salario * 0.40f;
            
        }
        else if(nivel == 2){
            
            txInsalubridade = salario * 0.20f;
            
        }
        else if(nivel == 3){
            
            txInsalubridade = salario * 0.10f;
            
        }
        
        return txInsalubridade;
        
    }
    
    public float calculoIR(float salario){
        
        if(salario <= 1903.98){
            
            txIR -= salario * 0;
            
        }
        
        else
            if(salario >= 1903.99 && salario <= 2826.65){
        
                txIR -= salario * 0.075;
        
        }
            
        else
            if(salario >=  2286.66 && salario <= 3751.05){
             
                txIR -= salario * 0.15;
                
            }
            
        else
            if(salario >= 3751.06 && salario <= 4664.68){
                
                txIR -= salario * 0.225;
                
            }
        
        else
            if(salario >= 4664.69){
                
                txIR -= salario * 0.275;
                
            }
                
        
        return txIR;
        
    }
        
    public float calculoINSS(float salario){

        if(salario <= 1693.72){
            
            txINSS -= salario *0.08;
            
        }
        
        else
            if(salario >= 1693.73 && salario <= 2822.90){
                
                txINSS -= salario * 0.09;
                
            }
        
        else
            if(salario >= 2822.91 && salario <= 5645.80){
                
                txINSS -= salario * 0.11;
                
            }
            else
                if(salario >= 5645.81){
                    
                    txINSS -= 621.04;//O teto máximo taxável é de 5645.81 apartir de então todos os salários vão descontar o valor fixo de 621.04 
                    
                }
        
        
        return txINSS;
        
    }
   
    
    
}