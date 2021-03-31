
public class Adicionais extends Holerite{
    
    public float adicionalNoturno(float salario, int horasTrabalhadas)
    {
        float adicionalNoturno = (horasTrabalhadas*20)/100;
        
        return adicionalNoturno;  
    }
    
    public float insalubridade(float salario, String situacao)
    {
        float insalubridade = 0;
        
        if("minimo".equals(situacao))
        {
            insalubridade = (salario*10)/100;
        }
            else
            {
                if("medio".equals(situacao))
                {
                    insalubridade = (salario*20)/100;
                }
                else
                {
                    if("maximo".equals(situacao))
                    {
                        insalubridade = (salario*40)/100;
                    }
                }
            }
        return insalubridade;
    }
    
    public float horaExtra(int quantHora)
    {
       float horaExtra = (quantHora*50)/100;
        return horaExtra;
    }
    
    public float drs(float adicionalNoturno, float insalubridade, float horaExtra)
    {
        float drs = 8;
        return drs;
    }
    
    public float periculosidade(float salario)
    {
        float periculosidade = (salario*30)/100;
        return periculosidade;
        
    }
    
    
}
