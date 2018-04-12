package br.com.marcio;

public class Automovel {  
	  
    /* 
     * Atributos. 
     */  
    private String modelo;  
  
    /* 
     * Atributo motor faz refer�ncia a um objeto do tipo Motor. 
     */  
    private Motor motor;  
  
    /* 
     * M�todo construtor passando como par�metro uma String que indicar� o 
     * modelo do Automovel e um int que indicar� a pot�ncia do Motor que ser� 
     * inst�nciado dentro do deste m�todo construtor. 
     */  
    public Automovel(String modelo, int potenciaMotor) {  
        this();  
        this.modelo = modelo;  
        /* 
         * Um objeto do tipo Motor sendo inst�nciado dentro do m�todo construtor 
         * da classe Automovel sendo assim ser� gerada uma associ��o do tipo 
         * composi��o, pois o objeto Motor existir� somente enquanto o objeto 
         * Automovel existir. 
         */  
        this.motor = new Motor(potenciaMotor);  
    }  
  
    /* 
     * M�todo construtor padr�o. 
     */  
    public Automovel() {  
        super();  
    }  
  
    /* 
     * M�todos Getters and Setters. 
     */  
    public String getModelo() {  
        return this.modelo;  
    }  
  
    public void setModelo(String modelo) {  
        this.modelo = modelo;  
    }  
  
    public Motor getMotor() {  
        return this.motor;  
    }  
  
    public void setMotor(Motor motor) {  
        this.motor = motor;  
    }  
  
    /* 
     * M�todo toString() para impress�o em formato String do objeto Automovel. 
     */  
    @Override  
    public String toString() {  
        StringBuilder builder = new StringBuilder(); 
        builder.append(modelo);   
        builder.append("\n"+motor);  
        return builder.toString();  
    }  
  
} 
