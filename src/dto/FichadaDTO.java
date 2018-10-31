package dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import bean.Empleado;

public class FichadaDTO implements Serializable {

    private static final long serialVersionUID = 324767771881426451L;

	private Time hora;
	private String tipo;
	private Empleado empleado;
	private Date fecha;

    public FichadaDTO(String tipo, Empleado empleado) {
  		super();
		
		this.hora.getTime();
		this.tipo=tipo;
		this.empleado = empleado;
		this.fecha.getDate();
    }
    
    public FichadaDTO() {
    }

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
