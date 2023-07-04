package Application;


public class Main {
    
    public static void main(String[] args) {

        //Jogadores Real Madrid:
		Atacante ViniJr = new Atacante("Vinícius Jr", 22, 95, 82, 78, 92, 32, 71, 1, 1, 1);
	    Atacante Rodrygo = new Atacante("Rodrygo", 21, 89, 82, 77, 86, 28, 64, 1, 1, 1);
        Atacante Benzema = new Atacante("Benzema", 35, 78, 90, 81, 88, 33, 79, 1, 1, 1);
        Atacante Hazard = new Atacante("Hazard", 31, 80, 76, 79, 85, 29, 63, 1, 1, 1);
        Atacante Asensio = new Atacante("Asensio", 26, 81, 83, 82, 81, 32, 66, 1, 1, 1);
        MeioCampista Modric = new MeioCampista("Modric", 37, 73, 76, 90, 88, 72, 70, 1, 1, 1);
        MeioCampista Kroos = new MeioCampista("Kroos", 32, 60, 82, 92, 83, 73, 71, 1, 1, 1);
        MeioCampista Valverde = new MeioCampista("Valverde", 24, 85, 81, 83, 81, 77, 78, 1, 1, 1);
        MeioCampista Camavinga = new MeioCampista("Camavinga", 21, 78, 67, 79, 82, 78, 78, 1, 1, 1);
	    MeioCampista Tchouameni = new MeioCampista("Tchouameni", 23, 70, 65, 78, 77, 80, 82, 1, 1, 1);
	    MeioCampista Ceballos = new MeioCampista("Ceballos", 28, 74, 71, 81, 83, 66, 73, 1, 1, 1);
	    Defensor Mendy = new Defensor("Mendy", 26, 90, 62, 76, 78, 78, 78, 1, 1, 1);
	    Defensor Alaba = new Defensor("Alaba", 30, 77, 63, 80, 76, 84, 78, 1, 1, 1);
	    Defensor Militao = new Defensor("Militão", 24, 85, 60, 74, 71, 83, 82, 1, 1, 1);
	    Defensor Rudiger = new Defensor("Rudiger", 29, 81, 52, 71, 70, 84, 86, 1, 1, 1);
	    Defensor Nacho = new Defensor("Nacho", 31, 78, 45, 75, 73, 78, 77, 1, 1, 1);
	    Defensor Carvajal = new Defensor("Carvajal", 30, 82, 60, 78, 77, 80, 75, 1, 1, 1);
	    Defensor LucasVazquez = new Defensor("Lucas Vázquez", 29, 81, 70, 78, 78, 71, 74, 1, 1, 1);
	    Goleiro Courtois = new Goleiro("Courtois", 30, 60, 15, 35, 32, 19, 69, 84, 91, 86);
	    Goleiro Lunin = new Goleiro("Lunin", 23, 43, 11, 30, 28, 17, 70, 78, 74, 75);
	    
        //Jogadores Barcelona:
        Atacante Lewandowski = new Atacante("Lewandowski", 34, 76, 91, 79, 84, 32, 79, 1, 1, 1);
	    Atacante Dembele = new Atacante("Dembelé",  26, 91, 78, 80, 90, 25, 63, 1, 1, 1);
        Atacante Ferran = new Atacante("Ferran",  24, 81, 81, 76, 80, 33, 75, 1, 1, 1);
        Atacante AnsuFati = new Atacante("Ansu Fati",  21, 87, 78, 74, 81, 29, 68, 1, 1, 1);
        Atacante Raphinha = new Atacante("Raphinha", 26, 90, 78, 78, 85, 32, 69, 1, 1, 1);
        MeioCampista Pedri = new MeioCampista("Pedri", 20, 75, 75, 87, 87, 68, 70, 1, 1, 1);
        MeioCampista Gavi = new MeioCampista("Gavi", 18, 76, 70, 83, 85, 67, 70, 1, 1, 1);
        MeioCampista DeJong = new MeioCampista("De Jong", 26, 77, 75, 87, 85, 78, 77, 1, 1, 1);
        MeioCampista Busquets = new MeioCampista("Busquets", 34, 57, 68, 86, 79, 82, 75, 1, 1, 1);
	    MeioCampista Kessie = new MeioCampista("Kessié", 26, 73, 77, 77, 78, 81, 85, 1, 1, 1);
	    MeioCampista SergiRoberto = new MeioCampista("SergiRoberto", 31, 75, 69, 78, 76, 76, 74, 1, 1, 1);
	    Defensor JordiAlba = new Defensor("Jordi Alba", 33, 83, 60, 81, 80, 77, 74, 1, 1, 1);
	    Defensor RonaldAraujo = new Defensor("Ronald Araújo", 24, 82, 58, 74, 74, 83, 81, 1, 1, 1);
	    Defensor Kounde = new Defensor("Koundé", 23, 78, 50, 76, 73, 83, 77, 1, 1, 1);
	    Defensor Christensen = new Defensor("Christensen", 26, 75, 45, 75, 68, 84, 76, 1, 1, 1);
	    Defensor MarcosAlonso = new Defensor("Marcos Alonso", 34, 76, 68, 79, 77, 76, 75, 1, 1, 1);
	    Defensor Balde = new Defensor("Balde", 19, 90, 51, 75, 77, 71, 68, 1, 1, 1);
	    Defensor EricGarcia = new Defensor("Eric Garcia", 22, 73, 42, 77, 74, 77, 73, 1, 1, 1);
	    Goleiro TerStegen = new Goleiro("Ter Stegen", 31, 60, 15, 40, 33, 19, 65, 87, 87, 86);
	    Goleiro InakiPena = new Goleiro("Inaki Pena", 22, 43, 11, 30, 28, 17, 60, 74, 75, 71);
	    
        //Jogadores Bayern:
        Atacante ChoupoMoting = new Atacante("Choupo Moting", 34, 74, 79, 75, 77, 39, 78, 1, 1, 1);
	    Atacante Mane = new Atacante("Mané", 31, 87, 85, 79, 86, 30, 74, 1, 1, 1);
        Atacante Sane = new Atacante("Sané", 27, 88, 80, 80, 83, 33, 73, 1, 1, 1);
        Atacante Coman = new Atacante("Coman", 26, 93, 78, 78, 88, 29, 72, 1, 1, 1);
        Atacante Gnabry = new Atacante("Gnabry", 27, 84, 83, 78, 84, 32, 74, 1, 1, 1);
        MeioCampista Muller = new MeioCampista("Muller", 33, 70, 86, 84, 82, 63, 75, 1, 1, 1);
        MeioCampista Goretzka = new MeioCampista("Goretzka",  28, 78, 79, 84, 83, 78, 81, 1, 1, 1);
        MeioCampista Kimmich = new MeioCampista("Kimmich",  27, 73, 71, 89, 86, 85, 77, 1, 1, 1);
        MeioCampista Musiala = new MeioCampista("Musiala", 19, 76, 77, 84, 87, 64, 70, 1, 1, 1);
	    MeioCampista Gravenberch = new MeioCampista("Gravenberch", 21, 77, 70, 77, 78, 74, 77, 1, 1, 1);
	    Defensor Pavard = new Defensor("Pavard", 27, 76, 60, 78, 76, 82, 78, 1, 1, 1);
	    Defensor Cancelo = new Defensor("Cancelo", 29, 84, 73, 84, 83, 78, 76, 1, 1, 1);
	    Defensor DeLigt = new Defensor("De Ligt", 24, 74, 50, 71, 70, 84, 83, 1, 1, 1);
	    Defensor Upamecano = new Defensor("Upamecano", 23, 77, 43, 68, 69, 83, 82, 1, 1, 1);
	    Defensor LucasHernandez = new Defensor("Lucas Hernandez", 27, 77, 65, 78, 75, 84, 79, 1, 1, 1);
	    Defensor Davies = new Defensor("Davies", 22, 93, 63, 76, 82, 74, 74, 1, 1, 1);
	    Defensor Blind = new Defensor("Blind", 33, 65, 70, 81, 78, 80, 75, 1, 1, 1);
        Defensor Stanisic = new Defensor("Stanisic", 23, 73, 46, 75, 73, 77, 77, 1, 1, 1);
	    Goleiro Neuer = new Goleiro("Neuer", 36, 55, 15, 65, 40, 30, 64, 89, 86, 85);
	    Goleiro Sommer = new Goleiro("Sommer", 33, 63, 13, 38, 31, 17, 65, 85, 83, 83);
	    
        //Jogadores Man City:
        Atacante Haaland = new Atacante("Haaland", 22, 90, 91, 70, 80, 40, 87, 1, 1, 1);
	    Atacante Mahrez = new Atacante("Mahrez", 31, 82, 84, 82, 87, 30, 69, 1, 1, 1);
        Atacante Foden = new Atacante("Foden", 23, 83, 80, 80, 85, 50, 70, 1, 1, 1);
        Atacante JulianAlvarez = new Atacante("Júlian Álvarez", 23, 79, 81, 76, 80, 40, 76, 1, 1, 1);
        Atacante Grealish = new Atacante("Grealish", 26, 82, 78, 82, 86, 42, 72, 1, 1, 1);
        MeioCampista BernardoSilva = new MeioCampista("Bernardo Silva", 28, 76, 79, 88, 90, 67, 73, 1, 1, 1);
        MeioCampista DeBruyne = new MeioCampista("DeBruyne", 31, 75, 87, 90, 87, 65, 75, 1, 1, 1);
        MeioCampista Gundogan = new MeioCampista("Gundogan", 32, 72, 80, 86, 85, 74, 74, 1, 1, 1);
        MeioCampista Palmer = new MeioCampista("Palmer", 21, 76, 64, 70, 73, 47, 59, 1, 1, 1);
        MeioCampista Rodri = new MeioCampista("Rodri", 26, 74, 76, 84, 78, 84, 80, 1, 1, 1);
	    MeioCampista Phillips = new MeioCampista("Phillips", 26, 73, 67, 76, 77, 78, 77, 1, 1, 1);
	    Defensor Stones = new Defensor("Stones", 28, 76, 63, 80, 78, 83, 78, 1, 1, 1);
	    Defensor Walker = new Defensor("Walker", 32, 88, 56, 75, 76, 80, 81, 1, 1, 1);
	    Defensor Akanji = new Defensor("Akanji", 27, 77, 47, 74, 74, 81, 79, 1, 1, 1);
	    Defensor RubenDias = new Defensor("Rúben Dias", 26, 68, 43, 72, 66, 89, 86, 1, 1, 1);
	    Defensor Laporte = new Defensor("Laporte", 29, 64, 52, 71, 67, 84, 79, 1, 1, 1);
	    Defensor Ake = new Defensor("Aké", 28, 78, 56, 77, 77, 79, 78, 1, 1, 1);
	    Defensor SergiGomez = new Defensor("Sergi Gómez", 22, 79, 64, 75, 76, 70, 68, 1, 1, 1);
	    Goleiro Ederson = new Goleiro("Ederson", 29, 65, 15, 59, 41, 30, 65, 87, 87, 85);
	    Goleiro Ortega = new Goleiro("Ortega", 27, 63, 13, 42, 34, 17, 65, 80, 80, 83);

        //Jogadores Liverpool
        Atacante Salah = new Atacante("Salah", 31, 91, 88, 78, 86, 35, 76, 1, 1, 1);
	    Atacante DarwinNunez = new Atacante("DarwinNunez", 23, 87, 79, 73, 79, 38, 84, 1, 1, 1);
        Atacante DiogoJota = new Atacante("Diogo Jota", 26, 85, 83, 79, 85, 52, 76, 1, 1, 1);
        Atacante Gakpo = new Atacante("Gakpo", 23, 83, 77, 79, 83, 42, 77, 1, 1, 1);
        Atacante LuisDiaz = new Atacante("LuísDíaz", 26, 92, 77, 77, 87, 37, 74, 1, 1, 1);
        MeioCampista Thiago = new MeioCampista("Thiago", 31, 72, 72, 86, 88, 67, 72, 1, 1, 1);
        MeioCampista Henderson = new MeioCampista("Henderson", 33, 68, 73, 83, 77, 81, 76, 1, 1, 1);
        MeioCampista CurtisJones = new MeioCampista("CurtisJones", 22, 75, 72, 77, 81, 68, 74, 1, 1, 1);
        MeioCampista Elliot = new MeioCampista("Eliot", 20, 77, 70, 77, 83, 56, 65, 1, 1, 1);
	    MeioCampista Fabinho = new MeioCampista("Fabinho", 29, 69, 67, 78, 77, 83, 81, 1, 1, 1);
	    MeioCampista Milner = new MeioCampista("Milner", 37, 55, 71, 78, 76, 77, 74, 1, 1, 1);
        Defensor AlexanderArnold = new Defensor("Alexander-Arnold", 24, 78, 70, 87, 81, 77, 76, 1, 1, 1);
	    Defensor Konate = new Defensor("Konaté", 24, 80, 50, 70, 71, 81, 80, 1, 1, 1);
	    Defensor JoeGomez = new Defensor("Joe Gómez", 26, 79, 40, 73, 75, 77, 78, 1, 1, 1);
	    Defensor VanDijk = new Defensor("VanDijk", 31, 75, 43, 75, 74, 87, 87, 1, 1, 1);
	    Defensor Matip = new Defensor("Matip", 31, 63, 60, 72, 70, 83, 78, 1, 1, 1);
	    Defensor Robertson = new Defensor("Robertson", 28, 82, 53, 80, 79, 81, 77, 1, 1, 1);
	    Defensor Tsimikas = new Defensor("Tsimikas",24, 84, 57, 75, 79, 75, 73, 1, 1, 1);
	    Goleiro Alisson = new Goleiro("Alisson", 29, 56, 15, 48, 38, 23, 65, 86, 87, 87);
	    Goleiro Kelleher = new Goleiro("Kelleher", 24, 60, 13, 33, 34, 17, 60, 73, 80, 76);
	    
        //Jogadores PSG:
        Atacante Mbappe = new Atacante("Mbappé", 24, 95, 88, 78, 90, 35, 78, 1, 1, 1);
	    Atacante Messi = new Atacante("Messi", 35, 82, 88, 88, 95, 32, 63, 1, 1, 1);
        Atacante Neymar = new Atacante("Neymar", 30, 87, 86, 84, 92, 38, 63, 1, 1, 1);
        Atacante Ekitike = new Atacante("Ekitiké", 23, 76, 77, 72, 75, 40, 77, 1, 1, 1);
        MeioCampista RenatoSanches = new MeioCampista("Renato Sanches", 27, 81, 74, 76, 79, 76, 78, 1, 1, 1);
        MeioCampista Vitinha = new MeioCampista("Vitinha", 23, 74, 70, 80, 84, 71, 72, 1, 1, 1);
        MeioCampista FabianRuiz = new MeioCampista("Fabián Ruíz", 28, 66, 76, 84, 79, 75, 76, 1, 1, 1);
        MeioCampista Verratti = new MeioCampista("Verratti", 29, 67, 65, 88, 87, 78, 70, 1, 1, 1);
        MeioCampista Soler = new MeioCampista("Soler", 27, 79, 77, 79, 83, 70, 74, 1, 1, 1);
	    MeioCampista ZaireEmery = new MeioCampista("Zaire-Emery", 17, 79, 64, 75, 78, 63, 71, 1, 1, 1);
	    Defensor Danilo = new Defensor("Danilo", 30, 68, 55, 76, 75, 78, 82, 1, 1, 1);
	    Defensor Mukiele = new Defensor("Mukiele",  30, 83, 50, 75, 75, 78, 79, 1, 1, 1);
        Defensor Hakimi = new Defensor("Hakimi", 24, 94, 61, 76, 82, 75, 75, 1, 1, 1);
	    Defensor SergioRamos = new Defensor("Sérgio Ramos",36, 70, 66, 76, 76, 84, 78, 1, 1, 1);
	    Defensor Marquinhos = new Defensor("Marquinhos", 29, 75, 41, 78, 77, 86, 79, 1, 1, 1);
	    Defensor Kimpembe = new Defensor("Kimpembé", 27, 78, 38, 70, 72, 82, 81, 1, 1, 1);
	    Defensor Nuno = new Defensor("NunoMendes", 23, 89, 50, 77, 80, 76, 77, 1, 1, 1);
	    Defensor Bernat = new Defensor("Bernat", 29, 79, 54, 79, 82, 74, 73, 1, 1, 1);
	    Goleiro Donnarumma = new Goleiro("Donnarumma", 24, 56, 15, 40, 32, 23, 65, 80, 88, 87);
	    Goleiro SergioRico = new Goleiro("Sergio Rico", 33, 50, 13, 39, 28, 17, 60, 74, 78, 76);
	    
		//Jogadores Man United:
		Atacante Rashford = new Atacante("Rashford", 25, 90, 84, 78, 84, 30, 76, 1, 1, 1);
	    Atacante Martial = new Atacante("Martial", 27, 83, 78, 76, 83, 28, 76, 1, 1, 1);
        Atacante Anthony = new Atacante("Anthony", 23, 84, 76, 79, 87, 38, 64, 1, 1, 1);
        Atacante Garnacho = new Atacante("Garnacho",  19, 89, 70, 66, 85, 30, 60, 1, 1, 1);
        Atacante Weghorst = new Atacante("Weghorst",30, 65, 79, 76, 74, 59, 87, 1, 1, 1);
        MeioCampista Sancho = new MeioCampista("Sancho",  23, 80, 75, 82, 87, 40, 63, 1, 1, 1);
        MeioCampista BrunoFernandes = new MeioCampista("Bruno Fernandes",  28, 74, 86, 87, 84, 71, 75, 1, 1, 1);
        MeioCampista Eriksen = new MeioCampista("Eriksen", 31, 70, 77, 85, 83, 73, 67, 1, 1, 1);
        MeioCampista Fred = new MeioCampista("Fred", 29, 77, 68, 79, 81, 76, 74, 1, 1, 1);
	    MeioCampista Casemiro = new MeioCampista("Casemiro",  30, 67, 75, 80, 77, 88, 86, 1, 1, 1);
	    MeioCampista McTominay = new MeioCampista("McTominay",  26, 70, 64, 76, 75, 77, 82, 1, 1, 1);
	    Defensor Dalot = new Defensor("Dalot", 24, 82, 61, 75, 76, 78, 77, 1, 1, 1);
	    Defensor WanBissaka = new Defensor("Wan-Bissaka", 25, 83, 56, 76, 78, 77, 76, 1, 1, 1);
	    Defensor LisandroMartinez = new Defensor("Lisandro Martinez", 25, 78, 47, 77, 77, 83, 77, 1, 1, 1);
	    Defensor Varane = new Defensor("Varane", 27, 78, 38, 73, 70, 83, 82, 1, 1, 1);
		Defensor Maguire = new Defensor("Maguire", 30, 60, 50, 72, 63, 78, 84, 1, 1, 1);
	    Defensor Shaw = new Defensor("Shaw", 28, 76, 53, 79, 77, 82, 78, 1, 1, 1);
	    Defensor Malacia = new Defensor("Malacia", 24, 85, 50, 73, 78, 74, 73, 1, 1, 1);
	    Goleiro DeGea = new Goleiro("De Gea", 30, 67, 15, 40, 32, 23, 62, 80, 89, 86);
	    Goleiro Heaton = new Goleiro("Heaton", 33, 50, 13, 30, 25, 17, 70, 76, 72, 72);
	    
		//Jogadores Atletico de Madrid:
		Atacante Griezmann = new Atacante("Griezmann", 32, 78, 84, 84, 85, 60, 76, 1, 1, 1);
	    Atacante Morata = new Atacante("Morata", 29, 82, 80, 75, 78, 28, 79, 1, 1, 1);
        Atacante Carrasco = new Atacante("Carrasco", 29, 88, 81, 78, 86, 48, 68, 1, 1, 1);
        Atacante Correa = new Atacante("Correa",  28, 85, 80, 76, 85, 27, 72, 1, 1, 1);
        Atacante Depay = new Atacante("Depay",  30, 81, 80, 79, 85, 50, 76, 1, 1, 1);
        MeioCampista Lemar = new MeioCampista("Lemar", 27, 78, 78, 82, 85, 62, 68, 1, 1, 1);
        MeioCampista DePaul = new MeioCampista("De Paul",  27, 76, 78, 82, 83, 75, 78, 1, 1, 1);
        MeioCampista Koke = new MeioCampista("Koke", 32, 65, 77, 84, 77, 76, 75, 1, 1, 1);
        MeioCampista Llorente = new MeioCampista("Llorente", 28, 84, 75, 79, 80, 77, 78, 1, 1, 1);
	    MeioCampista Saul = new MeioCampista("Saúl", 28, 69, 72, 78, 76, 77, 77, 1, 1, 1);
	    MeioCampista Kondogbia = new MeioCampista("Kondogbia", 30, 71, 67, 76, 75, 77, 86, 1, 1, 1);
	    Defensor Molina = new Defensor("Molina", 24, 81, 68, 77, 77, 76, 75, 1, 1, 1);
	    Defensor Hermoso = new Defensor("Hermoso", 28, 79, 43, 74, 72, 79, 78, 1, 1, 1);
	    Defensor Gimenez = new Defensor("Giménez", 28, 70, 38, 62, 66, 84, 81, 1, 1, 1);
	    Defensor Savic = new Defensor("Savic",  33, 68, 35, 65, 64, 84, 80, 1, 1, 1);
		Defensor Reinildo = new Defensor("Reinildo", 29, 77, 50, 75, 73, 78, 79, 1, 1, 1);
	    Defensor Witsel = new Defensor("Witsel", 34, 53, 68, 77, 74, 80, 77, 1, 1, 1);
	    Defensor Reguilon = new Defensor("Reguilón", 26, 84, 47, 76, 77, 75, 73, 1, 1, 1);
	    Goleiro Oblak = new Goleiro("Oblak",30, 55, 15, 35, 30, 23, 68, 89, 85, 87);
	    Goleiro Grbic = new Goleiro("Grbic", 27, 50, 13, 30, 24, 17, 65, 70, 74, 72);
	    
		//Jogadores Inter de Milao
		Atacante Lautaro = new Atacante("Lautaro", 25, 83, 84, 74, 84, 45, 81, 1, 1, 1);
	    Atacante Lukaku = new Atacante("Lukaku", 30, 82, 80, 76, 78, 33, 86, 1, 1, 1);
        Atacante Dzeko = new Atacante("Dzeko", 36, 70, 82, 74, 76, 42, 81, 1, 1, 1);
        Atacante JCorrea = new Atacante("Joaquín Correa", 28, 80, 75, 75, 83, 27, 71, 1, 1, 1);
        MeioCampista Mkhitaryan = new MeioCampista("Mkhitaryan", 34, 80, 78, 79, 83, 65, 75, 1, 1, 1);
        MeioCampista Barella = new MeioCampista("Barella", 26, 77, 75, 84, 84, 77, 78, 1, 1, 1);
        MeioCampista Calhanoglu = new MeioCampista("Çalhanoglu",  29, 75, 78, 86, 84, 68, 73, 1, 1, 1);
        MeioCampista Brozovic = new MeioCampista("Brozovic", 30, 67, 74, 83, 78, 80, 79, 1, 1, 1);
        MeioCampista Dimarco = new MeioCampista("Dimarco", 25, 80, 73, 78, 79, 74, 75, 1, 1, 1);
	    MeioCampista Asllani = new MeioCampista("Asllani", 21, 68, 63, 75, 75, 72, 66, 1, 1, 1);
	    MeioCampista Gagliardini = new MeioCampista("Gagliardini", 29, 69, 64, 76, 75, 76, 75, 1, 1, 1);
	    Defensor Gosens = new Defensor("Gosens", 28, 83, 65, 77, 77, 75, 76, 1, 1, 1);
	    Defensor Bastoni = new Defensor("Bastoni", 24, 76, 43, 72, 69, 85, 79, 1, 1, 1);
	    Defensor Acerbi = new Defensor("Acerbi", 33, 65, 36, 69, 64, 84, 82, 1, 1, 1);
	    Defensor Skriniar = new Defensor("Skriniar", 28, 75, 35, 68, 70, 85, 81, 1, 1, 1);
		Defensor DeVrij = new Defensor("De Vrij", 31, 73, 32, 73, 71, 84, 78, 1, 1, 1);
	    Defensor Darmian = new Defensor("Darmian", 29, 70, 63, 73, 75, 80, 73, 1, 1, 1);
	    Defensor Dumfries = new Defensor("Dumfries",27, 82, 57, 76, 76, 78, 85, 1, 1, 1);
	    Goleiro Onana = new Goleiro("Onana",  27, 55, 15, 32, 30, 23, 68, 83, 85, 83);
	    Goleiro Handanovic = new Goleiro("Handanovic",  37, 43, 13, 33, 30, 17, 62, 88, 81, 78);
	    
		//Jogadores Brasileirao:
		Atacante Gabigol = new Atacante("Gabigol", 26, 83, 79, 77, 84, 34, 76, 1, 1, 1);
	    Atacante Hulk = new Atacante("Hulk", 36, 77, 81, 76, 79, 42, 82, 1, 1, 1);
		Atacante Suarez = new Atacante("Suárez", 35, 68, 84, 77, 78, 34, 79, 1, 1, 1);
	    Atacante Pedro = new Atacante("Pedro", 25, 74, 82, 66, 77, 33, 80, 1, 1, 1);
        Atacante Rony = new Atacante("Rony", 28, 80, 78, 76, 82, 55, 77, 1, 1, 1);
        MeioCampista Arrascaeta = new MeioCampista("Arrascaeta", 28, 79, 76, 83, 85, 53, 62, 1, 1, 1);
        MeioCampista RaphaelVeiga = new MeioCampista("RaphaelVeiga",  27, 75, 78, 79, 80, 55, 68, 1, 1, 1);
        MeioCampista Gerson = new MeioCampista("Gerson", 26, 75, 70, 81, 78, 76, 77, 1, 1, 1);
        MeioCampista Andre = new MeioCampista("André", 21, 67, 65, 77, 76, 78, 81, 1, 1, 1);
	    MeioCampista RenatoAugusto = new MeioCampista("Renato Augusto", 35, 70, 76, 79, 78, 68, 75, 1, 1, 1);
	    MeioCampista Fernandinho = new MeioCampista("Fernandinho", 37, 59, 70, 76, 76, 80, 74, 1, 1, 1);
	    Defensor AyrtonLucas = new Defensor("Ayrton Lucas", 25, 85, 65, 74, 78, 73, 75, 1, 1, 1);
	    Defensor Marcelo = new Defensor("Marcelo", 34, 72, 70, 79, 85, 74, 68, 1, 1, 1);
	    Defensor GustavoGomez = new Defensor("Gustavo Gómez", 31, 65, 36, 63, 62, 82, 82, 1, 1, 1);
	    Defensor DavidLuiz = new Defensor("David Luiz", 34, 55, 60, 72, 67, 78, 75, 1, 1, 1);
		Defensor VitorCuesta = new Defensor("Vitor Cuesta", 34, 63, 40, 60, 64, 78, 78, 1, 1, 1);
	    Defensor Nino = new Defensor("Nino", 26, 68, 50, 63, 62, 79, 79, 1, 1, 1);
	    Defensor GuilhermeArana = new Defensor("Guilherme Arana", 26, 82, 52, 73, 76, 74, 74, 1, 1, 1);
	    Goleiro Weverton = new Goleiro("Weverton", 36, 55, 15, 32, 30, 23, 65, 84, 84, 81);
	    Goleiro JoaoPaulo = new Goleiro("João Paulo", 27, 43, 13, 30, 25, 17, 65, 75, 78, 79);
	    

        Clube RealMadrid = new Clube("Real Madrid", ViniJr, Benzema, Rodrygo, Asensio, Hazard, Modric, Kroos, Valverde, Camavinga, Tchouameni, Ceballos, Mendy, Alaba, Militao, Rudiger, Nacho, Carvajal, LucasVazquez, Courtois, Lunin);
        Clube Barcelona = new Clube("Barcelona", Lewandowski, Dembele, Raphinha, Ferran, AnsuFati, Pedri, Gavi, DeJong, Busquets, Kessie, SergiRoberto, JordiAlba, RonaldAraujo, Kounde, Christensen, EricGarcia, MarcosAlonso, Balde, TerStegen, InakiPena);
        Clube Bayern = new Clube("Bayern de Munique", Mane, ChoupoMoting, Sane, Coman, Gnabry, Muller, Musiala, Goretzka, Kimmich, Gravenberch, Pavard, Cancelo, LucasHernandez, Upamecano, DeLigt, Stanisic, Blind, Davies, Neuer, Sommer);
        Clube MancherterCity = new Clube("Manchester City", Haaland, Mahrez, Foden, Grealish, JulianAlvarez, DeBruyne, BernardoSilva, Gundogan, Palmer, Rodri, Phillips, Walker, Akanji, Stones, RubenDias, Laporte, Ake, SergiGomez, Ederson, Ortega);
        Clube PSG = new Clube("Paris Saint-Germain", Messi, Mbappe, Neymar, Ekitike, Soler, Vitinha, FabianRuiz, RenatoSanches, Verratti, ZaireEmery, Danilo, Bernat, Nuno, Marquinhos, SergioRamos, Kimpembe, Hakimi, Mukiele, Donnarumma, SergioRico);
        Clube Liverpool = new Clube("Liverpool", Salah, DiogoJota, DarwinNunez, LuisDiaz, Gakpo, Thiago, Henderson, CurtisJones, Elliot, Fabinho, Milner, Robertson, Tsimikas, VanDijk, Matip, Konate, JoeGomez, AlexanderArnold, Alisson, Kelleher);
        Clube ManchesterUnited = new Clube("Manchester United", Rashford, Anthony, Martial, Garnacho, Weghorst, BrunoFernandes, Eriksen, Sancho, Fred, Casemiro, McTominay, Shaw, Malacia, LisandroMartinez, Varane, Maguire, Dalot, WanBissaka, DeGea, Heaton);
        Clube Atletico = new Clube("Atlético de Madrid", Griezmann, Morata, Carrasco, Correa, Depay, Lemar, Llorente, DePaul, Koke, Saul, Kondogbia, Molina, Gimenez, Savic, Hermoso, Reguilon, Witsel, Reinildo, Oblak, Grbic);
        Clube Inter = new Clube("Inter de Milão", Lautaro, Lukaku, Dzeko, JCorrea, Mkhitaryan, Calhanoglu, Barella, Brozovic, Asllani, Gagliardini, Gosens, Dimarco, Acerbi, Bastoni, Darmian, Skriniar, DeVrij, Dumfries, Onana, Handanovic);
        Clube Brasileirao = new Clube("Melhores do Brasileirao", Gabigol, Suarez, Hulk, Pedro, Rony, Arrascaeta, RaphaelVeiga, RenatoAugusto, Gerson, Andre, Fernandinho, Marcelo, AyrtonLucas, GustavoGomez, Nino, DavidLuiz, VitorCuesta, GuilhermeArana, Weverton, JoaoPaulo);

    
    
    }
}