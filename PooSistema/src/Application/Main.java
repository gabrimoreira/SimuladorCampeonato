package Application;


public class Main {
    
    public static void main(String[] args) {

        //Jogadores Real Madrid:
		Jogador ViniJr = new Jogador("Vinícius Jr", "Atacante", 22, 95, 82, 78, 92, 32, 71, 1, 1, 1);
	    Jogador Rodrygo = new Jogador("Rodrygo", "Atacante", 21, 89, 82, 77, 86, 28, 64, 1, 1, 1);
        Jogador Benzema = new Jogador("Benzema", "Atacante", 35, 78, 90, 81, 88, 33, 79, 1, 1, 1);
        Jogador Hazard = new Jogador("Hazard", "Atacante", 31, 80, 76, 79, 85, 29, 63, 1, 1, 1);
        Jogador Asensio = new Jogador("Asensio", "Atacante", 26, 81, 83, 82, 81, 32, 66, 1, 1, 1);
        Jogador AlvaroRodriguez = new Jogador("Álvaro Rodríguez", "Atacante", 18, 68, 65, 54, 61, 35, 75, 1, 1, 1);
        Jogador Modric = new Jogador("Modric", "MeioCampista", 37, 73, 76, 90, 88, 72, 70, 1, 1, 1);
        Jogador Kroos = new Jogador("Kroos", "MeioCampista", 32, 60, 82, 92, 83, 73, 71, 1, 1, 1);
        Jogador Valverde = new Jogador("Valverde", "MeioCampista", 24, 85, 81, 83, 81, 77, 78, 1, 1, 1);
        Jogador Camavinga = new Jogador("Camavinga", "MeioCampista", 21, 78, 67, 79, 82, 78, 78, 1, 1, 1);
	    Jogador Tchouameni = new Jogador("Tchouameni", "MeioCampista", 23, 70, 65, 78, 77, 80, 82, 1, 1, 1);
	    Jogador Ceballos = new Jogador("Ceballos", "MeioCampista", 28, 74, 71, 81, 83, 66, 73, 1, 1, 1);
	    Jogador Mendy = new Jogador("Mendy", "Defensor", 26, 90, 62, 76, 78, 78, 78, 1, 1, 1);
	    Jogador Alaba = new Jogador("Alaba", "Defensor", 30, 77, 63, 80, 76, 84, 78, 1, 1, 1);
	    Jogador Militao = new Jogador("Militão", "Defensor", 24, 85, 60, 74, 71, 83, 82, 1, 1, 1);
	    Jogador Rudiger = new Jogador("Rudiger", "Defensor", 29, 81, 52, 71, 70, 84, 86, 1, 1, 1);
	    Jogador Nacho = new Jogador("Nacho", "Defensor", 31, 78, 45, 75, 73, 78, 77, 1, 1, 1);
	    Jogador Carvajal = new Jogador("Carvajal", "Defensor", 30, 82, 60, 78, 77, 80, 75, 1, 1, 1);
	    Jogador LucasVazquez = new Jogador("Lucas Vásquez", "Defensor", 29, 81, 70, 78, 78, 71, 74, 1, 1, 1);
	    Jogador Courtois = new Jogador("Courtois", "Goleiro", 30, 60, 15, 35, 32, 19, 69, 84, 92, 86);
	    Jogador Lunin = new Jogador("Lunin", "Goleiro", 23, 43, 11, 30, 28, 17, 70, 78, 74, 75);
	    
        //Jogadores Barcelona:
        Jogador Lewandowski = new Jogador("Lewandowski", "Atacante", 34, 76, 91, 79, 84, 32, 79, 1, 1, 1);
	    Jogador Dembele = new Jogador("Dembelé", "Atacante", 26, 91, 78, 80, 90, 25, 63, 1, 1, 1);
        Jogador Ferran = new Jogador("Ferran", "Atacante", 24, 81, 81, 76, 80, 33, 75, 1, 1, 1);
        Jogador AnsuFati = new Jogador("Ansu Fati", "Atacante", 21, 87, 78, 74, 81, 29, 68, 1, 1, 1);
        Jogador Raphinha = new Jogador("Raphinha", "Atacante", 26, 90, 78, 78, 85, 32, 69, 1, 1, 1);
        Jogador Pedri = new Jogador("Pedri", "MeioCampista", 20, 75, 75, 87, 87, 68, 70, 1, 1, 1);
        Jogador Gavi = new Jogador("Gavi", "MeioCampista", 18, 76, 70, 83, 85, 67, 70, 1, 1, 1);
        Jogador DeJong = new Jogador("De Jong", "MeioCampista", 26, 77, 75, 87, 85, 78, 77, 1, 1, 1);
        Jogador Busquets = new Jogador("Busquets", "MeioCampista", 34, 57, 68, 86, 79, 82, 75, 1, 1, 1);
	    Jogador Kessie = new Jogador("Kessié", "MeioCampista", 26, 73, 77, 77, 78, 81, 85, 1, 1, 1);
	    Jogador SergiRoberto = new Jogador("SergiRoberto", "MeioCampista", 31, 75, 69, 78, 76, 76, 74, 1, 1, 1);
	    Jogador JordiAlba = new Jogador("Jordi Alba", "Defensor", 33, 83, 60, 81, 80, 77, 74, 1, 1, 1);
	    Jogador RonaldAraujo = new Jogador("Ronald Araújo", "Defensor", 24, 82, 58, 74, 74, 83, 81, 1, 1, 1);
	    Jogador Kounde = new Jogador("Koundé", "Defensor", 23, 78, 50, 76, 73, 83, 77, 1, 1, 1);
	    Jogador Christensen = new Jogador("Christensen", "Defensor", 26, 75, 45, 75, 68, 84, 76, 1, 1, 1);
	    Jogador MarcosAlonso = new Jogador("Marcos Alonso", "Defensor", 34, 76, 68, 79, 77, 76, 75, 1, 1, 1);
	    Jogador Balde = new Jogador("Balde", "Defensor", 19, 90, 51, 75, 77, 71, 68, 1, 1, 1);
	    Jogador EricGarcia = new Jogador("Eric Garcia", "Defensor", 22, 73, 42, 77, 74, 77, 73, 1, 1, 1);
	    Jogador TerStegen = new Jogador("Ter Stegen", "Goleiro", 31, 60, 15, 40, 33, 19, 65, 87, 88, 86);
	    Jogador InakiPena = new Jogador("Inaki Pena", "Goleiro", 22, 43, 11, 30, 28, 17, 60, 74, 75, 71);
	    
        //Jogadores Bayern:
        Jogador ChoupoMoting = new Jogador("Choupo Moting", "Atacante", 34, 75, 80, 75, 77, 39, 78, 1, 1, 1);
	    Jogador Mane = new Jogador("Mané", "Atacante", 31, 87, 85, 79, 86, 30, 74, 1, 1, 1);
        Jogador Sane = new Jogador("Sané", "Atacante", 27, 88, 80, 80, 83, 33, 73, 1, 1, 1);
        Jogador Coman = new Jogador("Coman", "Atacante", 26, 93, 78, 78, 88, 29, 72, 1, 1, 1);
        Jogador Gnabry = new Jogador("Gnabry", "Atacante", 27, 84, 83, 78, 84, 32, 74, 1, 1, 1);
        Jogador Muller = new Jogador("Muller", "MeioCampista", 33, 70, 86, 84, 82, 63, 75, 1, 1, 1);
        Jogador Goretzka = new Jogador("Goretzka", "MeioCampista", 28, 78, 79, 84, 83, 78, 81, 1, 1, 1);
        Jogador Kimmich = new Jogador("Kimmich", "MeioCampista", 27, 73, 71, 89, 86, 85, 77, 1, 1, 1);
        Jogador Musiala = new Jogador("Musiala", "MeioCampista", 19, 76, 77, 84, 87, 64, 70, 1, 1, 1);
	    Jogador Gravenberch = new Jogador("Gravenberch", "MeioCampista", 21, 77, 70, 77, 78, 74, 77, 1, 1, 1);
	    Jogador Pavard = new Jogador("Pavard", "Defensor", 27, 76, 60, 78, 76, 82, 78, 1, 1, 1);
	    Jogador Cancelo = new Jogador("Cancelo", "Defensor", 29, 84, 73, 84, 83, 78, 76, 1, 1, 1);
	    Jogador DeLigt = new Jogador("De Ligt", "Defensor", 24, 74, 50, 71, 70, 84, 83, 1, 1, 1);
	    Jogador Upamecano = new Jogador("Upamecano", "Defensor", 23, 77, 43, 68, 69, 83, 82, 1, 1, 1);
	    Jogador LucasHernandez = new Jogador("Lucas Hernandez", "Defensor", 27, 77, 65, 78, 75, 84, 79, 1, 1, 1);
	    Jogador Davies = new Jogador("Davies", "Defensor", 22, 93, 63, 76, 82, 74, 74, 1, 1, 1);
	    Jogador Blind = new Jogador("Blind", "Defensor", 33, 65, 70, 81, 78, 80, 75, 1, 1, 1);
	    Jogador Neuer = new Jogador("Neuer", "Goleiro", 36, 55, 15, 65, 40, 30, 64, 89, 86, 85);
	    Jogador Sommer = new Jogador("Sommer", "Goleiro", 33, 63, 13, 38, 31, 17, 65, 85, 83, 83);
	    
        //Jogadores Man City:
        Jogador Haaland = new Jogador("Haaland", "Atacante", 22, 90, 91, 70, 80, 40, 87, 1, 1, 1);
	    Jogador Mahrez = new Jogador("Mahrez", "Atacante", 31, 82, 84, 82, 87, 30, 69, 1, 1, 1);
        Jogador Foden = new Jogador("Foden", "Atacante", 23, 83, 80, 80, 85, 50, 70, 1, 1, 1);
        Jogador JulianAlvarez = new Jogador("Júlian Álvarez", "Atacante", 23, 79, 81, 76, 80, 40, 76, 1, 1, 1);
        Jogador Grealish = new Jogador("Grealish", "Atacante", 26, 82, 78, 82, 86, 42, 72, 1, 1, 1);
        Jogador BernardoSilva = new Jogador("Bernardo Silva", "MeioCampista", 28, 76, 79, 88, 90, 67, 73, 1, 1, 1);
        Jogador DeBruyne = new Jogador("DeBruyne", "MeioCampista", 31, 75, 87, 90, 87, 65, 75, 1, 1, 1);
        Jogador Gundogan = new Jogador("Gundogan", "MeioCampista", 32, 72, 80, 86, 85, 74, 74, 1, 1, 1);
        Jogador Rodri = new Jogador("Rodri", "MeioCampista", 26, 74, 76, 84, 78, 84, 80, 1, 1, 1);
	    Jogador Phillips = new Jogador("Phillips", "MeioCampista", 26, 73, 67, 76, 77, 78, 77, 1, 1, 1);
	    Jogador Stones = new Jogador("Stones", "Defensor", 28, 76, 63, 80, 78, 83, 78, 1, 1, 1);
	    Jogador Walker = new Jogador("Walker", "Defensor", 32, 88, 56, 75, 76, 80, 81, 1, 1, 1);
	    Jogador Akanji = new Jogador("Akanji", "Defensor", 27, 77, 47, 74, 74, 81, 79, 1, 1, 1);
	    Jogador RubenDias = new Jogador("Rúben Dias", "Defensor", 26, 68, 43, 72, 66, 89, 86, 1, 1, 1);
	    Jogador Laporte = new Jogador("Laporte", "Defensor", 29, 64, 52, 71, 67, 84, 79, 1, 1, 1);
	    Jogador Ake = new Jogador("Aké", "Defensor", 28, 78, 56, 77, 77, 79, 78, 1, 1, 1);
	    Jogador SergiGomez = new Jogador("Sergi Gómez", "Defensor", 22, 79, 64, 75, 76, 70, 68, 1, 1, 1);
	    Jogador Ederson = new Jogador("Ederson", "Goleiro", 29, 65, 15, 59, 41, 30, 65, 87, 87, 85);
	    Jogador Ortega = new Jogador("Ortega", "Goleiro", 27, 63, 13, 42, 34, 17, 65, 80, 80, 83);

        //Jogadores Liverpool
        Jogador Salah = new Jogador("Haaland", "Atacante", 31, 91, 88, 78, 86, 35, 76, 1, 1, 1);
	    Jogador DarwinNunez = new Jogador("DarwinNunez", "Atacante", 23, 87, 79, 73, 79, 38, 84, 1, 1, 1);
        Jogador DiogoJota = new Jogador("Diogo Jota", "Atacante", 26, 85, 83, 79, 85, 52, 76, 1, 1, 1);
        Jogador Gakpo = new Jogador("Gakpo", "Atacante", 23, 83, 77, 79, 83, 42, 77, 1, 1, 1);
        Jogador LuisDiaz = new Jogador("LuísDíaz", "Atacante", 26, 92, 77, 77, 87, 37, 74, 1, 1, 1);
        Jogador Thiago = new Jogador("Thiago", "MeioCampista", 31, 72, 72, 86, 88, 67, 72, 1, 1, 1);
        Jogador Henderson = new Jogador("Henderson", "MeioCampista", 33, 68, 73, 83, 77, 81, 76, 1, 1, 1);
        Jogador CurtisJones = new Jogador("CurtisJones", "MeioCampista", 22, 75, 72, 77, 81, 68, 74, 1, 1, 1);
        Jogador Elliot = new Jogador("Eliot", "MeioCampista", 20, 77, 70, 77, 83, 56, 65, 1, 1, 1);
	    Jogador Fabinho = new Jogador("Fabinho", "MeioCampista", 29, 69, 67, 78, 77, 83, 81, 1, 1, 1);
	    Jogador AlexanderArnold = new Jogador("Alexander-Arnold", "Defensor", 24, 78, 70, 87, 81, 77, 76, 1, 1, 1);
	    Jogador Konate = new Jogador("Konaté", "Defensor", 24, 80, 50, 70, 71, 81, 80, 1, 1, 1);
	    Jogador JoeGomez = new Jogador("Joe Gómez", "Defensor", 26, 79, 40, 73, 75, 77, 78, 1, 1, 1);
	    Jogador VanDijk = new Jogador("VanDijk", "Defensor", 31, 75, 43, 75, 74, 87, 87, 1, 1, 1);
	    Jogador Matip = new Jogador("Matip", "Defensor", 31, 63, 60, 72, 70, 83, 78, 1, 1, 1);
	    Jogador Robertson = new Jogador("Robertson", "Defensor", 28, 82, 53, 80, 79, 81, 77, 1, 1, 1);
	    Jogador Tsimikas = new Jogador("Tsimikas", "Defensor", 24, 84, 57, 75, 79, 75, 73, 1, 1, 1);
	    Jogador Alisson = new Jogador("Alisson", "Goleiro", 29, 56, 15, 48, 38, 23, 65, 86, 87, 87);
	    Jogador Kelleher = new Jogador("Kelleher", "Goleiro", 24, 60, 13, 33, 34, 17, 60, 73, 80, 76);
	    
        //Jogadores PSG:
        Jogador Mbappe = new Jogador("Mbappé", "Atacante", 24, 95, 88, 78, 90, 35, 78, 1, 1, 1);
	    Jogador Messi = new Jogador("Messi", "Atacante", 35, 82, 88, 88, 95, 32, 63, 1, 1, 1);
        Jogador Neymar = new Jogador("Neymar", "Atacante", 30, 87, 86, 84, 92, 38, 63, 1, 1, 1);
        Jogador Ekitike = new Jogador("Ekitiké", "Atacante", 23, 76, 77, 72, 75, 40, 77, 1, 1, 1);
        Jogador RenatoSanches = new Jogador("Renato Sanches", "MeioCampista", 27, 81, 74, 76, 79, 76, 78, 1, 1, 1);
        Jogador Vitinha = new Jogador("Vitinha", "MeioCampista", 23, 74, 70, 80, 84, 71, 72, 1, 1, 1);
        Jogador FabianRuiz = new Jogador("Fabián Ruíz", "MeioCampista", 28, 66, 76, 84, 79, 75, 76, 1, 1, 1);
        Jogador Verratti = new Jogador("Verratti", "MeioCampista", 29, 67, 65, 88, 87, 78, 70, 1, 1, 1);
        Jogador Soler = new Jogador("Soler", "MeioCampista", 27, 79, 77, 79, 83, 70, 74, 1, 1, 1);
	    Jogador ZaireEmery = new Jogador("Zaire-Emery", "MeioCampista", 17, 79, 64, 75, 78, 63, 71, 1, 1, 1);
	    Jogador Danilo = new Jogador("Danilo", "Defensor", 30, 68, 55, 76, 75, 78, 82, 1, 1, 1);
	    Jogador Hakimi = new Jogador("Hakimi", "Defensor", 24, 94, 61, 76, 82, 75, 75, 1, 1, 1);
	    Jogador SergioRamos = new Jogador("Sérgio Ramos", "Defensor", 36, 70, 66, 76, 76, 84, 78, 1, 1, 1);
	    Jogador Marquinhos = new Jogador("Marquinhos", "Defensor", 29, 75, 41, 78, 77, 86, 79, 1, 1, 1);
	    Jogador Kimpembe = new Jogador("Kimpembé", "Defensor", 27, 78, 38, 70, 72, 82, 81, 1, 1, 1);
	    Jogador Nuno = new Jogador("NunoMendes", "Defensor", 23, 89, 50, 77, 80, 76, 77, 1, 1, 1);
	    Jogador Bernat = new Jogador("Bernat", "Defensor", 29, 79, 54, 79, 82, 74, 73, 1, 1, 1);
	    Jogador Donnarumma = new Jogador("Donnarumma", "Goleiro", 24, 56, 15, 40, 32, 23, 65, 80, 88, 87);
	    Jogador SergioRico = new Jogador("Sergio Rico", "Goleiro", 33, 50, 13, 39, 28, 17, 60, 74, 78, 76);
	    
		//Jogadores Man United:
		Jogador Rashford = new Jogador("Rashford", "Atacante", 25, 90, 84, 78, 84, 30, 76, 1, 1, 1);
	    Jogador Martial = new Jogador("Martial", "Atacante", 27, 83, 78, 76, 83, 28, 76, 1, 1, 1);
        Jogador Anthony = new Jogador("Anthony", "Atacante", 23, 84, 76, 79, 87, 38, 64, 1, 1, 1);
        Jogador Garnacho = new Jogador("Garnacho", "Atacante", 19, 89, 70, 66, 85, 30, 60, 1, 1, 1);
        Jogador Weghorst = new Jogador("Weghorst", "Atacante", 30, 65, 79, 76, 74, 59, 87, 1, 1, 1);
        Jogador Sancho = new Jogador("Sancho", "MeioCampista", 23, 80, 75, 82, 87, 40, 63, 1, 1, 1);
        Jogador BrunoFernandes = new Jogador("Bruno Fernandes", "MeioCampista", 28, 74, 86, 87, 84, 71, 75, 1, 1, 1);
        Jogador Eriksen = new Jogador("Eriksen", "MeioCampista", 31, 70, 77, 85, 83, 73, 67, 1, 1, 1);
        Jogador Fred = new Jogador("Fred", "MeioCampista", 29, 77, 68, 79, 81, 76, 74, 1, 1, 1);
	    Jogador Casemiro = new Jogador("Casemiro", "MeioCampista", 30, 67, 75, 80, 77, 88, 86, 1, 1, 1);
	    Jogador McTominay = new Jogador("McTominay", "MeioCampista", 26, 70, 64, 76, 75, 77, 82, 1, 1, 1);
	    Jogador Dalot = new Jogador("Dalot", "Defensor", 24, 82, 61, 75, 76, 78, 77, 1, 1, 1);
	    Jogador WanBissaka = new Jogador("Wan-Bissaka", "Defensor", 25, 83, 56, 76, 78, 77, 76, 1, 1, 1);
	    Jogador LisandroMartinez = new Jogador("Lisandro Martinez", "Defensor", 25, 78, 47, 77, 77, 83, 77, 1, 1, 1);
	    Jogador Varane = new Jogador("Varane", "Defensor", 27, 78, 38, 73, 70, 83, 82, 1, 1, 1);
		Jogador Maguire = new Jogador("Maguire", "Defensor", 30, 60, 50, 72, 63, 78, 84, 1, 1, 1);
	    Jogador Shaw = new Jogador("Shaw", "Defensor", 28, 76, 53, 79, 77, 82, 78, 1, 1, 1);
	    Jogador Malacia = new Jogador("Malacia", "Defensor", 24, 85, 50, 73, 78, 74, 73, 1, 1, 1);
	    Jogador DeGea = new Jogador("De Gea", "Goleiro", 30, 67, 15, 40, 32, 23, 62, 80, 89, 86);
	    Jogador Heaton = new Jogador("Heaton", "Goleiro", 33, 50, 13, 30, 25, 17, 70, 76, 72, 72);
	    
		//Jogadores Atletico de Madrid:
		Jogador Griezmann = new Jogador("Griezmann", "Atacante", 32, 78, 84, 84, 85, 60, 76, 1, 1, 1);
	    Jogador Morata = new Jogador("Morata", "Atacante", 29, 82, 80, 75, 78, 28, 79, 1, 1, 1);
        Jogador Carrasco = new Jogador("Carrasco", "Atacante", 29, 88, 81, 78, 86, 48, 68, 1, 1, 1);
        Jogador Correa = new Jogador("Correa", "Atacante", 28, 85, 80, 76, 85, 27, 72, 1, 1, 1);
        Jogador Depay = new Jogador("Depay", "Atacante", 30, 81, 80, 79, 85, 50, 76, 1, 1, 1);
        Jogador Lemar = new Jogador("Lemar", "MeioCampista", 27, 78, 78, 82, 85, 62, 68, 1, 1, 1);
        Jogador DePaul = new Jogador("De Paul", "MeioCampista", 27, 76, 78, 82, 83, 75, 78, 1, 1, 1);
        Jogador Koke = new Jogador("Koke", "MeioCampista", 32, 65, 77, 84, 77, 76, 75, 1, 1, 1);
        Jogador Llorente = new Jogador("Llorente", "MeioCampista", 28, 84, 75, 79, 80, 77, 78, 1, 1, 1);
	    Jogador Saul = new Jogador("Saúl", "MeioCampista", 28, 69, 72, 78, 76, 77, 77, 1, 1, 1);
	    Jogador Kondogbia = new Jogador("Kondogbia", "MeioCampista", 30, 71, 67, 76, 75, 77, 86, 1, 1, 1);
	    Jogador Molina = new Jogador("Molina", "Defensor", 24, 81, 68, 77, 77, 76, 75, 1, 1, 1);
	    Jogador Hermoso = new Jogador("Hermoso", "Defensor", 28, 79, 43, 74, 72, 79, 78, 1, 1, 1);
	    Jogador Gimenez = new Jogador("Giménez", "Defensor", 28, 70, 38, 62, 66, 84, 81, 1, 1, 1);
	    Jogador Savic = new Jogador("Savic", "Defensor", 33, 68, 35, 65, 64, 84, 80, 1, 1, 1);
		Jogador Reinildo = new Jogador("Reinildo", "Defensor", 29, 77, 50, 75, 73, 78, 79, 1, 1, 1);
	    Jogador Witsel = new Jogador("Witsel", "Defensor", 34, 53, 68, 77, 74, 80, 77, 1, 1, 1);
	    Jogador Reguilon = new Jogador("Reguilón", "Defensor", 26, 84, 47, 76, 77, 75, 73, 1, 1, 1);
	    Jogador Oblak = new Jogador("Oblak", "Goleiro", 30, 55, 15, 35, 30, 23, 68, 89, 85, 87);
	    Jogador Grbic = new Jogador("Grbic", "Goleiro", 27, 50, 13, 30, 24, 17, 65, 70, 74, 72);
	    
		//Jogadores Inter de Milao
		Jogador Lautaro = new Jogador("Lautaro", "Atacante", 25, 83, 84, 74, 84, 45, 81, 1, 1, 1);
	    Jogador Lukaku = new Jogador("Lukaku", "Atacante", 30, 82, 80, 76, 78, 33, 86, 1, 1, 1);
        Jogador Dzeko = new Jogador("Dzeko", "Atacante", 36, 70, 82, 74, 76, 42, 81, 1, 1, 1);
        Jogador JCorrea = new Jogador("Joaquín Correa", "Atacante", 28, 80, 75, 75, 83, 27, 71, 1, 1, 1);
        Jogador Mkhitaryan = new Jogador("Mkhitaryan", "MeioCampista", 34, 80, 78, 79, 83, 65, 75, 1, 1, 1);
        Jogador Barella = new Jogador("Barella", "MeioCampista", 26, 77, 75, 84, 84, 77, 78, 1, 1, 1);
        Jogador Calhanoglu = new Jogador("Çalhanoglu", "MeioCampista", 29, 75, 78, 86, 84, 68, 73, 1, 1, 1);
        Jogador Brozovic = new Jogador("Brozovic", "MeioCampista", 30, 67, 74, 83, 78, 80, 79, 1, 1, 1);
        Jogador Dimarco = new Jogador("Dimarco", "MeioCampista", 25, 80, 73, 78, 79, 74, 75, 1, 1, 1);
	    Jogador Asllani = new Jogador("Asllani", "MeioCampista", 21, 68, 63, 75, 75, 72, 66, 1, 1, 1);
	    Jogador Gagliardini = new Jogador("Gagliardini", "MeioCampista", 29, 69, 64, 76, 75, 76, 75, 1, 1, 1);
	    Jogador Gosens = new Jogador("Gosens", "Defensor", 28, 83, 65, 77, 77, 75, 76, 1, 1, 1);
	    Jogador Bastoni = new Jogador("Bastoni", "Defensor", 24, 76, 43, 72, 69, 85, 79, 1, 1, 1);
	    Jogador Acerbi = new Jogador("Acerbi", "Defensor", 33, 65, 36, 69, 64, 84, 82, 1, 1, 1);
	    Jogador Skriniar = new Jogador("Skriniar", "Defensor", 28, 75, 35, 68, 70, 85, 81, 1, 1, 1);
		Jogador DeVrij = new Jogador("De Vrij", "Defensor", 31, 73, 32, 73, 71, 84, 78, 1, 1, 1);
	    Jogador Darmian = new Jogador("Darmian", "Defensor", 29, 70, 63, 73, 75, 80, 73, 1, 1, 1);
	    Jogador Dumfries = new Jogador("Dumfries", "Defensor", 27, 82, 57, 76, 76, 78, 85, 1, 1, 1);
	    Jogador Onana = new Jogador("Onana", "Goleiro", 27, 55, 15, 32, 30, 23, 68, 83, 85, 83);
	    Jogador Handanovic = new Jogador("Handanovic", "Goleiro", 37, 43, 13, 33, 30, 17, 62, 88, 81, 78);
	    
		//Jogadores Brasileirao:
		Jogador Gabigol = new Jogador("Gabigol", "Atacante", 26, 83, 79, 77, 84, 34, 75, 1, 1, 1);
	    Jogador Cano = new Jogador("Cano", "Atacante", 33, 72, 82, 70, 76, 27, 78, 1, 1, 1);
		Jogador Suarez = new Jogador("Suárez", "Atacante", 35, 68, 84, 77, 78, 34, 79, 1, 1, 1);
	    Jogador Pedro = new Jogador("Pedro", "Atacante", 25, 74, 82, 66, 77, 33, 80, 1, 1, 1);
        Jogador Rony = new Jogador("Rony", "Atacante", 28, 80, 78, 76, 81, 55, 77, 1, 1, 1);
        Jogador Arrascaeta = new Jogador("Arrascaeta", "MeioCampista", 28, 79, 76, 83, 85, 53, 62, 1, 1, 1);
        Jogador RaphaelVeiga = new Jogador("RaphaelVeiga", "MeioCampista", 27, 75, 78, 79, 80, 55, 68, 1, 1, 1);
        Jogador Gerson = new Jogador("Gerson", "MeioCampista", 26, 75, 70, 81, 78, 76, 77, 1, 1, 1);
        Jogador Andre = new Jogador("André", "MeioCampista", 21, 67, 65, 77, 76, 78, 81, 1, 1, 1);
	    Jogador RenatoAugusto = new Jogador("Renato Augusto", "MeioCampista", 35, 70, 76, 79, 78, 68, 75, 1, 1, 1);
	    Jogador Fernandinho = new Jogador("Fernandinho", "MeioCampista", 37, 59, 70, 76, 76, 80, 74, 1, 1, 1);
	    Jogador AyrtonLucas = new Jogador("Ayrton Lucas", "Defensor", 25, 85, 65, 74, 78, 73, 75, 1, 1, 1);
	    Jogador Marcelo = new Jogador("Marcelo", "Defensor", 34, 72, 70, 79, 85, 74, 68, 1, 1, 1);
	    Jogador GustavoGomez = new Jogador("Gustavo Gómez", "Defensor", 31, 65, 36, 63, 62, 82, 82, 1, 1, 1);
	    Jogador DavidLuiz = new Jogador("David Luiz", "Defensor", 34, 55, 60, 72, 67, 78, 75, 1, 1, 1);
		Jogador VitorCuesta = new Jogador("Vitor Cuesta", "Defensor", 34, 63, 40, 60, 64, 78, 78, 1, 1, 1);
	    Jogador Nino = new Jogador("Nino", "Defensor", 26, 68, 50, 63, 62, 79, 79, 1, 1, 1);
	    Jogador GuilhermeArana = new Jogador("Guilherme Arana", "Defensor", 26, 82, 52, 73, 76, 74, 74, 1, 1, 1);
	    Jogador Weverton = new Jogador("Weverton", "Goleiro", 36, 55, 15, 32, 30, 23, 65, 84, 84, 81);
	    Jogador JoaoPaulo = new Jogador("João Paulo", "Goleiro", 27, 43, 13, 30, 25, 17, 65, 75, 78, 79);
	
    
        
    
    
    }
}