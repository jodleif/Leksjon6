package sortertobjektsamling;

/**
 * Created by Jo Øivind Gjernes on 30.09.2015.
 */
public class SortertSamling
{
	// Objektvariabel for å ta vare på en
	// samling av sammenlignbare objekter.
	private Sammenlignbar[] data;
	private int antallElementer = 0;

	public SortertSamling(int antall)
	{
	// Opprett objektsamling med plass
	// til maksimalt antall elementer.
		data = new Sammenlignbar[antall];
	}

	public Sammenlignbar finn(Sammenlignbar obj)
	{
	// Finn objekt som er lik obj.
		for (Sammenlignbar element : data) {
			if (element.lik(obj)) {
				return element;
			}
		}
		return null;
	}

	public boolean settInn(Sammenlignbar obj)
	{
	// Sett inn nytt element på riktig plass (hvis plass).
		if (data.length < antallElementer) {
			data[antallElementer] = obj;
			++antallElementer;
			// TODO: sorter.
			return true;
		}
		return false;
	}

	public boolean slett(Sammenlignbar obj)
	{
	// Slett objekt som er lik obj
		for(int i = 0;i<antallElementer;++i){
			if(obj.lik(data[i])){
				data[i]=null;
				--antallElementer;
				// TODO: sorter
				return true;
			}
		}
		return false;
	}
	// Sorteringsalgoritme
	// bubblesort - https://en.wikipedia.org/wiki/Bubble_sort
	private boolean sorter()
	{
		int n = antallElementer;
		do {
			int newn = 0;
			for(int i=1;i<n;++i){
				if(data[i].mindreEnn(data[i-1])){

				}
			}
		} while(n!=0);
	}

	private void bytt(int pos1, int pos2){
		
	}
}
