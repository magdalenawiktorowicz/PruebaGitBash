package es.studium.refactorizacion;

public class Coche extends Vehiculo
{
	private Conductor conductor = new Conductor();

	public Coche()
	{
		super();
		super.setMatricula("");
		conductor.setNombreConductor("");
		conductor.setCarnetConductor("");
		setNumeroRuedas(4);
	}

	public Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas)
	{
		super();
		super.setMatricula(matricula);
		this.conductor.setNombreConductor(nombreConductor);
		this.conductor.setCarnetConductor(carnetConductor);
		this.numeroRuedas = numeroRuedas;
	}

	public String getNombreConductor()
	{
		return conductor.getNombreConductor();
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.conductor.setNombreConductor(nombreConductor);
	}

	public String getCarnetConductor()
	{
		return conductor.getCarnetConductor();
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.conductor.setCarnetConductor(carnetConductor);
	}

	public String getDetalles()
	{
		return "Coche [matricula=" + getMatricula() + ", nombreConductor=" + conductor.getNombreConductor() + ", carnetConductor="
				+ conductor.getCarnetConductor() + "]";
	}
}
