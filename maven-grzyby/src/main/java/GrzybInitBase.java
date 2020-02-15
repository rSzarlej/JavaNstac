
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
		genus ="go³¹bkowate";
		commonnames ="Lactarius rufus"; 
		additionalinfo ="Mleczaj rudy jest uznawany za grzyb niejadalny g³ównie ze wzglêdu na swój ostry smak. Wed³ug niektórych Ÿróde³, po odpowiedniej obróbce mo¿na z niego przygotowaæ smaczne dania. Grzyb ten posiada jednak równie¿ w³aœciwoœci szkodliwe, jego spo¿ycie na surowo mo¿e wi¹zaæ siê z wyst¹pieniem takich dolegliwoœci jak biegunka, wymioty czy nudnoœci."; 
		picture ="https://i.imgur.com/JKh1pHc.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Borowik szlachetny";
		genus ="borowikowate";
		commonnames ="prawdziwek i borowik jadalny"; 
		additionalinfo ="Sk³adniki: \r\n" + 
				"50 dag kapeluszy prawdziwków, 1 œrednia cebula, 1 ³y¿ka m¹ki, 1/2 szklanki œmietany, mas³o do sma¿enia, sól, pieprz\r\n" + 
				"Sposób przyrz¹dzenia:\r\n" + 
				"Kapelusze grzybów oczyœciæ, umyæ, pokroiæ w grubsze plastry. Cebulê posiekaæ w kostkê. Na patelni rozgrzaæ mas³o, dodaæ cebulê i zeszkliæ. W³o¿yæ grzyby, sma¿yæ, ca³y czas mieszaj¹c, aby nie przywar³y do dna. Do œmietany dodaæ m¹kê, wlaæ na patelniê. Zamieszaæ, dusiæ jeszcze przez chwilê, doprawiæ sol¹ i pieprzem."; 
		picture ="https://i.imgur.com/tvg39Ey.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="KoŸlarz czerwony";
		genus ="borowikowate";
		commonnames ="Kozak"; 
		additionalinfo ="Sk³adniki:\r\n" + 
				"1 kg kapeluszy m³odych kozaków, 120 ml wody, 4 dag soli, 3 liœcie laurowe, kilka ziaren czarnego pieprzu\r\n" + 
				"Sposób przyrz¹dzenia:\r\n" + 
				"Oczyszczone kapelusze m³odych kozaków gotuje siê jw. przez 30 minut zbieraj¹c pianê. Zagotowaæ wodê z przyprawami, lekko posoliæ. Kapelusze na³o¿yæ do niedu¿ych s³oików, warstwy posypywaæ sol¹, zalaæ wrz¹c¹ zalew¹. Wytrzeæ brzegi s³oików, szczelnie zamkn¹æ pokrywkami. S³oiki z koŸlarzami postawiæ w ciemnym i ch³odnym miejscu. Mo¿na je spo¿ywaæ po miesi¹cu."; 
		picture ="https://i.imgur.com/hmLqp1q.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 2;
		name ="Muchomor czerwony";
		genus ="muchomorowate";
		commonnames ="Amanita muscaria"; 
		additionalinfo ="G³ówne objawy zatrucia to dusznoœci, wymioty oraz biegunka, a tak¿e halucynacje."; 
		picture ="https://i.imgur.com/6QPQLby.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="KoŸlarz babka";
		genus ="borowikowate";
		commonnames ="Leccinum scabrum"; 
		additionalinfo ="Sk³adniki:\r\n" + 
				"2 umyte i obrane KoŸlarze, 200ml œmietanki 30%, ³y¿ka mas³a, sól i pieprz\r\n" + 
				"Sposób przyrz¹dzenia:\r\n" + 
				"Mas³o nale¿y najpierw przypaliæ, sma¿yæ do momentu odparowania i zarumienienia siê grzybów (ma³e iloœci, cienko pokrojone)."; 
		picture ="https://i.imgur.com/41qW9Cr.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 2;
		name ="G¹ska zielonka";
		genus ="g¹skowate";
		commonnames ="Tricholoma equestre"; 
		additionalinfo ="Bóle i sztywnoœæ nóg, problemy oddechowe, zaczerwienienie skóry twarzy i zwiêkszon¹ potliwoœæ."; 
		picture ="https://i.imgur.com/FsUi5HK.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
	
		type = 0;
		name ="Czubajka kania";
		genus ="pieczarkowate";
		commonnames ="Macrolepiota procera"; 
		additionalinfo ="Sk³adniki:\r\n" + 
				"Kapelusze z kani 4 szt., Jajka 2 szt, Bu³ka tarta 1 szklanka, M¹ka pszenna 1 szklanka, Mleko 50 ml, Sól i pieprz, Olej rzepakowy lub mas³o klarowane do sma¿enia\r\n" + 
				"Sposób przyrz¹dzenia:\r\n" + 
				"Kaniê oczyœciæ, umyæ pod bie¿¹c¹ wod¹ i osuszyæ rêcznikiem papierowym. Bardzo du¿e kapelusze przekroiæ na pó³ lub 4 czêœci, aby ³atwiej by³o panierowaæ i sma¿yæ. Kawa³ki grzybów obtoczyæ w m¹ce i na chwilê zanurzyæ w roztrzepanych jajkach z mlekiem, nastêpnie obtoczyæ w bu³ce tartej. Kotlety sma¿yæ na œrednio rozgrzanej patelni do przyrumienienia siê ka¿dej ze stron."; 
		picture ="https://i.imgur.com/eIBTPv7.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 1;
		name ="Goryczak ¿ó³ciowy";
		genus ="borowikowate";
		commonnames ="Szatan"; 
		additionalinfo ="Kapelusz jest jasnobr¹zowy lub szarobr¹zowy, zamszowy. Pocz¹tkowo pó³kolisty, potem wypuk³y i rozpostarty, mo¿e osi¹gaæ œrednicê od 5 do 20 cm. Trzon jest jaœniejszy od kapelusza, ma kolor oliwkowo¿ó³ty lub oliwkowobr¹zowy i widaæ na nim ciemniejsz¹ siateczkê o du¿ych oczkach. Ma doœæ smuk³y lub nieco maczugowaty kszta³t.\r\n"; 
		picture ="https://i.imgur.com/GkGBptX.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		type = 2;
		name ="Strzêpiak ceglasty";
		genus ="strzêpiakowate";
		commonnames ="Inocybe erubescens"; 
		additionalinfo ="Objawy zatrucia wystêpuje po pó³ godzinie od spo¿ycia. Zalicza siê do nich nudnoœci, wymioty, zawroty i bóle g³owy, œlinotok, pocenie siê, zaburzenia widzenia kolorów."; 
		picture ="https://i.imgur.com/kAtDHti.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Podgrzybek brunatny";
		genus ="borowikowate";
		commonnames ="Xerocomus badius"; 
		additionalinfo ="Sk³adniki:\r\n" + 
				"Podgrzybki œwie¿e lub mro¿one - 40 dag, œmietana 30% - 100ml, bulion warzywny - 1,5 litra, makaron razowy - 20 dag, sól, pieprz\r\n" + 
				"Sposób przyrz¹dzenia:\r\n" + 
				"W bulionie warzywnym gotujemy œwie¿e lub mro¿one podgrzybki. Gdy zmiêkn¹ wyci¹gamy je z garnka i blendujemy. Dolewamy do nich bulion a¿ uzyskamy ¿¹dan¹ gêstoœæ kremu. Doprawiamy zupê sol¹ i pieprzem i zagêszczamy œmietan¹. W miêdzy czasie gotujemy makaron. Mog¹ to byæ ³azanki ale my sobie zrobiliœmy razowe œwiderki."; 
		picture ="https://i.imgur.com/q6pgrvq.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		type = 0;
		name ="Maœlak ziarnisty";
		genus ="maœlakowate";
		commonnames ="Suillus granulatus"; 
		additionalinfo ="Sk³adniki:\r\n" + 
				"2 ³y¿ki mas³a,, 1.5 ³y¿ki m¹ki, 1 szklanka bulionu warzywnego, ³y¿ka sosu z cytryny, sól, szczypta startej ga³ki muszkatu³owej, odrobina przyprawy myœliwskiej, 200 g maœlaków, 1 ma³a cebula, pieprz œmietanka 30%\r\n" + 
				"Sposób przyrz¹dzenia:\r\n" + 
				"Maœlaki oczyszczamy, myjemy i podsma¿amy na patelni. Osobno sma¿ymy cebulkê i dodajemy j¹ do grzybów. Nastêpnie dodajemy przyprawy. Po ok. 20 minutach dodajemy sok z cytryny, m¹kê i œmietankê."; 
		picture ="https://i.imgur.com/cSh6Yde.png";
		
		mngTmp.add(name, genus, commonnames, additionalinfo, picture, type);
		
		
		
		
	}

}
