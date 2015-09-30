package romreservasjon;

import sortertobjektsamling.Sammenlignbar;

public class Reservasjon implements Sammenlignbar
{

	private String romkode;
	private Dato møtedato;
	private KlSlett start;
	private KlSlett slutt;
	private String kontakt;

	@Override
	public String toString()
	{
		return "Reservasjon{" + "romkode=" + romkode + ", møtedato=" + møtedato + ", start=" + start + ", slutt=" + slutt + ", kontakt=" + kontakt + '}';
	}

	public Reservasjon(String romkode, Dato møtedato, KlSlett start, KlSlett slutt, String kontakt)
	{
		this.romkode = romkode;
		this.møtedato = møtedato;
		this.start = start;
		this.slutt = slutt;
		this.kontakt = kontakt;
	}

	public String getRomkode()
	{
		return romkode;
	}

	public void setRomkode(String romkode)
	{
		this.romkode = romkode;
	}

	public Dato getMøtedato()
	{
		return møtedato;
	}

	public void setMøtedato(Dato møtedato)
	{
		this.møtedato = møtedato;
	}

	public KlSlett getStart()
	{
		return start;
	}

	public void setStart(KlSlett start)
	{
		this.start = start;
	}

	public KlSlett getSlutt()
	{
		return slutt;
	}

	public void setSlutt(KlSlett slutt)
	{
		this.slutt = slutt;
	}

	public String getKontakt()
	{
		return kontakt;
	}

	public void setKontakt(String kontakt)
	{
		this.kontakt = kontakt;
	}

	public boolean kolliderer(Reservasjon r)
	{
// TODO Denne må kodes!
		return false;
	}

	@Override
	public boolean lik(Sammenlignbar obj)
	{
		if(obj==null) return false;
		if(!this.getClass().equals(obj.getClass())) return false;
		Reservasjon objRes = (Reservasjon)obj;
		if(this.romkode==objRes.romkode && this.møtedato==objRes.møtedato && this.start == objRes.start){
			return true;
		}
		return false;

	}

	@Override
	public boolean størreEnn(Sammenlignbar obj)
	{
		if(obj==null) return false;
		if(!this.getClass().equals(obj.getClass())) return false;
		Reservasjon objRes = (Reservasjon)obj;
			if(objRes.møtedato.før(this.møtedato)){
				return true;
			}
						if(objRes.start.før(this.start)){
					return true;
				}

		return false;

	}
}
