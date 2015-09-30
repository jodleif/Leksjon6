package sortertobjektsamling;

/**
 * Created by Jo Øivind Gjernes on 30.09.2015.
 */
public class SortertSamling
{
	// Objektvariabel for å ta vare på en
	// samling av sammenlignbare objekter.
	private Sammenlignbar[] data;
	private int antallElementer;

	public SortertSamling(int antall)
	{
	// Opprett objektsamling med plass
	// til maksimalt antall elementer.
		antallElementer = 0;
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
		if (antallElementer < data.length) {
			data[antallElementer] = obj;
			++antallElementer;
			this.sorter();
			return true;
		}
		return false;
	}

	public boolean slett(Sammenlignbar obj)
	{
	// Slett objekt som er lik obj
		for(int i = 0;i<antallElementer;++i){
			if(obj.lik(data[i])){
				flyttObjekterogSlett(i);
				return true;
			}
		}
		return false;
	}

	// Flytt objekter "oppover"
	private void flyttObjekterogSlett(int fra){
		for(int i=fra;i<(antallElementer-1);++i){
			data[i]=data[i+1];
		}
		--antallElementer;
		data[antallElementer]=null;
	}
	// Sorteringsalgoritme
	// bubblesort - https://en.wikipedia.org/wiki/Bubble_sort
	private boolean sorter()
	{
		int n = antallElementer;
		while(n!=0) {
			int newn = 0;
			for (int i = 1; i < n; ++i) {
				if (data[i - 1].størreEnn(data[i])) {
					bytt(i, i - 1);
					newn = i;
				}
			}
			n = newn;
		}
		return true;
	}
	// Bytt posisjon på to elementer
	private void bytt(int pos1, int pos2){
		Sammenlignbar temp = data[pos1];
		data[pos1] = data[pos2];
		data[pos2] = temp;
	}
}
