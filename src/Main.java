import romreservasjon.Dato;
import romreservasjon.KlSlett;
import sortertobjektsamling.Sammenlignbar;
import sortertobjektsamling.SortertSamling;
import romreservasjon.Reservasjon;

/**
 * Created by Jo Øivind Gjernes on 30.09.2015.
 */
public class Main
{

	public static void main(String[] args)
	{
		SortertSamling sortertSamling = new SortertSamling(10);
		Sammenlignbar res = new Reservasjon("1-103", new Dato("01.01.1998"), new KlSlett("10:10"), new KlSlett("10:20"), "Joddy");
		Sammenlignbar res1 = new Reservasjon("1-103", new Dato("01.01.1998"), new KlSlett("10:40"), new KlSlett("11:00"), "Joddy");
		Sammenlignbar res2 = new Reservasjon("1-103", new Dato("02.01.1998"), new KlSlett("10:10"), new KlSlett("10:20"), "Joddy");
		Sammenlignbar res3 = new Reservasjon("1-103", new Dato("02.01.1998"), new KlSlett("12:10"), new KlSlett("10:20"), "Joddy");
		Sammenlignbar res4 = new Reservasjon("1-103", new Dato("02.01.1998"), new KlSlett("11:10"), new KlSlett("11:20"), "Joddy");


		sortertSamling.settInn(res2);
		sortertSamling.settInn(res3);
		sortertSamling.settInn(res4);
				sortertSamling.settInn(res);
		sortertSamling.settInn(res1);

	}

}
