package br.com.marcio;

public class Motor {  
  
    /* 
     * Atributos. 
     */  
    private int potencia;  
  
    /* 
     * M�todo construtor passando a pot�ncia do objeto motor como par�metro 
     */  
    public Motor(int potencia) {  
        this();  
        this.potencia = potencia;  
    }  
  
    /* 
     * M�todo construtor padr�o 
     */  
    public Motor() {  
        super();  
    }  
  
    /* 
     * M�todos Getters and Setters 
     */  
    public int getPotencia() {  
        return this.potencia;  
    }  
  
    public void setPotencia(int potencia) {  
        this.potencia = potencia;  
    }  
  
    /* 
     * M�todo toString() para impress�o em formato String do objeto Motor 
     */  
    @Override  
    public String toString() {  
        StringBuilder builder = new StringBuilder();  
        builder.append(potencia);  
        return builder.toString();  
    }  
  
}  