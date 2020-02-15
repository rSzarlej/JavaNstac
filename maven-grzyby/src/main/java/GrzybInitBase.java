
public class GrzybInitBase {
	
	private GrzybManager mngTmp;
	
	public GrzybInitBase() {
		mngTmp = null;
	}
	
	public GrzybInitBase(GrzybManager mng) {
		mngTmp = mng;
		
	}
	
	public void initBase() {
		
		String name, genus, commonnames, additionalinfo, picture;
		int type=0;
		
		type = 2;
		name ="Mleczaj rudy";
		genus ="go��bkowate";
		commonnames ="Lactarius rufus"; 
		additionalinfo ="Mleczaj rudy jest uznawany za grzyb niejadalny g��wnie ze wzgl�du na sw�j ostry smak. Wed�ug niekt�rych �r�de�, po odpowiedniej obr�bce mo�na z niego przygotowa� smaczne dania. Grzyb ten posiada jednak r�wnie� w�a�ciwo�ci szkodliwe, jego spo�ycie na surowo mo�e wi�za� si� z wyst�pieniem takich dolegliwo�ci jak biegunka, wymioty czy nudno�ci."; 
		picture ="https://i.imgur.com/JKh1pHc.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Borowik szlachetny";
		genus ="borowikowate";
		commonnames ="prawdziwek i borowik jadalny"; 
		additionalinfo ="Sk�adniki: \r\n" + 
				"50 dag kapeluszy prawdziwk�w, 1 �rednia cebula, 1 �y�ka m�ki, 1/2 szklanki �mietany, mas�o do sma�enia, s�l, pieprz\r\n" + 
				"Spos�b przyrz�dzenia:\r\n" + 
				"Kapelusze grzyb�w oczy�ci�, umy�, pokroi� w grubsze plastry. Cebul� posieka� w kostk�. Na patelni rozgrza� mas�o, doda� cebul� i zeszkli�. W�o�y� grzyby, sma�y�, ca�y czas mieszaj�c, aby nie przywar�y do dna. Do �mietany doda� m�k�, wla� na patelni�. Zamiesza�, dusi� jeszcze przez chwil�, doprawi� sol� i pieprzem."; 
		picture ="https://i.imgur.com/tvg39Ey.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Ko�larz czerwony";
		genus ="borowikowate";
		commonnames ="Kozak"; 
		additionalinfo ="Sk�adniki:\r\n" + 
				"1 kg kapeluszy m�odych kozak�w, 120 ml wody, 4 dag soli, 3 li�cie laurowe, kilka ziaren czarnego pieprzu\r\n" + 
				"Spos�b przyrz�dzenia:\r\n" + 
				"Oczyszczone kapelusze m�odych kozak�w gotuje si� jw. przez 30 minut zbieraj�c pian�. Zagotowa� wod� z przyprawami, lekko posoli�. Kapelusze na�o�y� do niedu�ych s�oik�w, warstwy posypywa� sol�, zala� wrz�c� zalew�. Wytrze� brzegi s�oik�w, szczelnie zamkn�� pokrywkami. S�oiki z ko�larzami postawi� w ciemnym i ch�odnym miejscu. Mo�na je spo�ywa� po miesi�cu."; 
		picture ="https://i.imgur.com/hmLqp1q.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 2;
		name ="Muchomor czerwony";
		genus ="muchomorowate";
		commonnames ="Amanita muscaria"; 
		additionalinfo ="G��wne objawy zatrucia to duszno�ci, wymioty oraz biegunka, a tak�e halucynacje."; 
		picture ="https://i.imgur.com/6QPQLby.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Ko�larz babka";
		genus ="borowikowate";
		commonnames ="Leccinum scabrum"; 
		additionalinfo ="Sk�adniki:\r\n" + 
				"2 umyte i obrane Ko�larze, 200ml �mietanki 30%, �y�ka mas�a, s�l i pieprz\r\n" + 
				"Spos�b przyrz�dzenia:\r\n" + 
				"Mas�o nale�y najpierw przypali�, sma�y� do momentu odparowania i zarumienienia si� grzyb�w (ma�e ilo�ci, cienko pokrojone)."; 
		picture ="https://i.imgur.com/41qW9Cr.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 2;
		name ="G�ska zielonka";
		genus ="g�skowate";
		commonnames ="Tricholoma equestre"; 
		additionalinfo ="B�le i sztywno�� n�g, problemy oddechowe, zaczerwienienie sk�ry twarzy i zwi�kszon� potliwo��."; 
		picture ="https://i.imgur.com/FsUi5HK.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
	
		type = 0;
		name ="Czubajka kania";
		genus ="pieczarkowate";
		commonnames ="Macrolepiota procera"; 
		additionalinfo ="Sk�adniki:\r\n" + 
				"Kapelusze z kani 4 szt., Jajka 2 szt, Bu�ka tarta 1 szklanka, M�ka pszenna 1 szklanka, Mleko 50 ml, S�l i pieprz, Olej rzepakowy lub mas�o klarowane do sma�enia\r\n" + 
				"Spos�b przyrz�dzenia:\r\n" + 
				"Kani� oczy�ci�, umy� pod bie��c� wod� i osuszy� r�cznikiem papierowym. Bardzo du�e kapelusze przekroi� na p� lub 4 cz�ci, aby �atwiej by�o panierowa� i sma�y�. Kawa�ki grzyb�w obtoczy� w m�ce i na chwil� zanurzy� w roztrzepanych jajkach z mlekiem, nast�pnie obtoczy� w bu�ce tartej. Kotlety sma�y� na �rednio rozgrzanej patelni do przyrumienienia si� ka�dej ze stron."; 
		picture ="https://i.imgur.com/eIBTPv7.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 1;
		name ="Goryczak ��ciowy";
		genus ="borowikowate";
		commonnames ="Szatan"; 
		additionalinfo ="Kapelusz jest jasnobr�zowy lub szarobr�zowy, zamszowy. Pocz�tkowo p�kolisty, potem wypuk�y i rozpostarty, mo�e osi�ga� �rednic� od 5 do 20 cm. Trzon jest ja�niejszy od kapelusza, ma kolor oliwkowo��ty lub oliwkowobr�zowy i wida� na nim ciemniejsz� siateczk� o du�ych oczkach. Ma do�� smuk�y lub nieco maczugowaty kszta�t.\r\n"; 
		picture ="https://i.imgur.com/GkGBptX.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		type = 2;
		name ="Strz�piak ceglasty";
		genus ="strz�piakowate";
		commonnames ="Inocybe erubescens"; 
		additionalinfo ="Objawy zatrucia wyst�puje po p� godzinie od spo�ycia. Zalicza si� do nich nudno�ci, wymioty, zawroty i b�le g�owy, �linotok, pocenie si�, zaburzenia widzenia kolor�w."; 
		picture ="https://i.imgur.com/kAtDHti.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Podgrzybek brunatny";
		genus ="borowikowate";
		commonnames ="Xerocomus badius"; 
		additionalinfo ="Sk�adniki:\r\n" + 
				"Podgrzybki �wie�e lub mro�one - 40 dag, �mietana 30% - 100ml, bulion warzywny - 1,5 litra, makaron razowy - 20 dag, s�l, pieprz\r\n" + 
				"Spos�b przyrz�dzenia:\r\n" + 
				"W bulionie warzywnym gotujemy �wie�e lub mro�one podgrzybki. Gdy zmi�kn� wyci�gamy je z garnka i blendujemy. Dolewamy do nich bulion a� uzyskamy ��dan� g�sto�� kremu. Doprawiamy zup� sol� i pieprzem i zag�szczamy �mietan�. W mi�dzy czasie gotujemy makaron. Mog� to by� �azanki ale my sobie zrobili�my razowe �widerki."; 
		picture ="https://i.imgur.com/q6pgrvq.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Ma�lak ziarnisty";
		genus ="ma�lakowate";
		commonnames ="Suillus granulatus"; 
		additionalinfo ="Sk�adniki:\r\n" + 
				"2 �y�ki mas�a,, 1.5 �y�ki m�ki, 1 szklanka bulionu warzywnego, �y�ka sosu z cytryny, s�l, szczypta startej ga�ki muszkatu�owej, odrobina przyprawy my�liwskiej, 200 g ma�lak�w, 1 ma�a cebula, pieprz �mietanka 30%\r\n" + 
				"Spos�b przyrz�dzenia:\r\n" + 
				"Ma�laki oczyszczamy, myjemy i podsma�amy na patelni. Osobno sma�ymy cebulk� i dodajemy j� do grzyb�w. Nast�pnie dodajemy przyprawy. Po ok. 20 minutach dodajemy sok z cytryny, m�k� i �mietank�."; 
		picture ="https://i.imgur.com/cSh6Yde.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		
		
	}

}
