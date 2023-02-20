package patrondelegate;

import patrondelegate.IDiseñadora.IDisenadora;


public class Empleado implements ICodificadora,IDisenadora{
    
    ICodificadora codificador;
    IDisenadora disenador;

    public Empleado(ICodificadora codificador, IDisenadora disenador) {
        this.codificador = codificador;
        this.disenador = disenador;
    }

    public void codificar() {
        codificador.codificar();
    }

    @Override
    public void disenar() {
        disenador.disenar();

	    }
	 }
