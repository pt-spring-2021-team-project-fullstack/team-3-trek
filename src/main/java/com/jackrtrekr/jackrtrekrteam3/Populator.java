package com.jackrtrekr.jackrtrekrteam3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.RegionRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;

import javax.annotation.Resource;


@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TypeRepository typeRepo;
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private TrekRepository trekRepo;
    @Resource
    private RegionRepository regionRepo;


    @Override
    public void run(String... args) throws Exception {
        Type easy = new Type("Easy");
        Type moderate = new Type("Moderate");
        Type strenuous = new Type("Strenuous");
        Type difficult = new Type("Difficult");
        typeRepo.save(easy);
        typeRepo.save(moderate);
        typeRepo.save(strenuous);
        typeRepo.save(difficult);

        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent antarctica = new Continent("Antarctica");
        Continent australia = new Continent("Australia");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(europe);
        continentRepo.save(antarctica);
        continentRepo.save(australia);

        Region mountainousWest = new Region("The Mountainous West", northAmerica);
        Region greatPlains = new Region("The Great Plains", northAmerica);
        Region canadianShield = new Region("The Canadian Shield", northAmerica);
        Region variedEasternRegion = new Region("The Varied Eastern Region", northAmerica);
        Region caribbean = new Region("The Caribbean", northAmerica);
        Region patagonia = new Region("Patagonia", southAmerica);
        Region andesMountains = new Region("The Andes Mountains", southAmerica);
        Region brazilianCoastline = new Region("The Brazilian Coastline", southAmerica);
        Region amazon = new Region("The Amazon", southAmerica);
        Region pantanal = new Region("The Pantanal", southAmerica);
        Region balkanPeninsula = new Region("The Balkan Peninsula", europe);
        Region iberianPeninsula = new Region("The Iberian Peninsula", europe);
        Region italianPeninsula = new Region("The Italian Peninsula", europe);
        Region scandinavianPeninsula = new Region("The Scandinavian Peninsula", europe);
        Region fennoscandianPeninsula = new Region("The Fennoscandian Peninsula", europe);
        Region jutlandPeninsula = new Region("The Jutland Peninsula", europe);
        Region sahel = new Region("The Sahel", africa);
        Region sahara = new Region("The Sahara", africa);
        Region ethiopianHighlands = new Region("The Ethiopian Highlands", africa);
        Region savanna = new Region("The Savanna", africa);
        Region swahiliCoast = new Region("The Swahili Coast", africa);
        Region rainForest = new Region("The Rain Forest", africa);
        Region africanGreatLakes = new Region("The African Great Lakes", africa);
        Region southernAfrica = new Region("Southern Africa", africa);
        Region centralAsia = new Region("Central Asia", asia);
        Region antarcticPeninsula = new Region("Antarctic Peninsula", antarctica);
        Region eastAntarctica = new Region("East Antarctica", antarctica);
        Region southPole = new Region("South Pole", antarctica);
        Region westAntarctica = new Region("West Antarctica", antarctica);
        Region rossSea = new Region("Ross Sea", antarctica);
        Region australianCapitalTerritory = new Region("Australian Capital Territory", australia);
        Region newSouthWales = new Region("New South Wales", australia);
        Region northernTerritory = new Region("Northern Territory", australia);
        Region queensLand = new Region("Queensland", australia);
        Region southAustralia = new Region("South Australia", australia);
        Region tasmaniaHobart = new Region("Tasmania-Hobart", australia);
        Region victoriaMelbourne = new Region("Victoria-Melbourne", australia);
        Region westernAustralia = new Region("Western Australia", australia);
        Region southeastAsia = new Region("Southeast Asia", asia);
        Region eastAsia = new Region("East Asia", asia);
        Region southAsia = new Region("South Asia", asia);
        Region southwestAsia = new Region("Southwest Asia", asia);

        regionRepo.save(mountainousWest);
        regionRepo.save(patagonia);
        regionRepo.save(balkanPeninsula);
        regionRepo.save(sahara);
        regionRepo.save(centralAsia);
        regionRepo.save(southPole);
        regionRepo.save(newSouthWales);
        regionRepo.save(queensLand);
        regionRepo.save(greatPlains);
        regionRepo.save(canadianShield);
        regionRepo.save(variedEasternRegion);
        regionRepo.save(caribbean);
        regionRepo.save(andesMountains);
        regionRepo.save(brazilianCoastline);
        regionRepo.save(amazon);
        regionRepo.save(pantanal);
        regionRepo.save(iberianPeninsula);
        regionRepo.save(italianPeninsula);
        regionRepo.save(scandinavianPeninsula);
        regionRepo.save(fennoscandianPeninsula);
        regionRepo.save(jutlandPeninsula);
        regionRepo.save(sahara);
        regionRepo.save(sahel);
        regionRepo.save(ethiopianHighlands);
        regionRepo.save(savanna);
        regionRepo.save(swahiliCoast);
        regionRepo.save(rainForest);
        regionRepo.save(africanGreatLakes);
        regionRepo.save(southernAfrica);
        regionRepo.save(australianCapitalTerritory);
        regionRepo.save(northernTerritory);
        regionRepo.save(southAustralia);
        regionRepo.save(tasmaniaHobart);
        regionRepo.save(victoriaMelbourne);
        regionRepo.save(westernAustralia);
        regionRepo.save(southeastAsia);
        regionRepo.save(eastAsia);
        regionRepo.save(southAsia);
        regionRepo.save(southwestAsia);
        regionRepo.save(antarcticPeninsula);
        regionRepo.save(eastAntarctica);
        regionRepo.save(westAntarctica);
        regionRepo.save(rossSea);

//        Continent: Asia
        Trek annaPurna = new Trek("Annapurna Circuit", "The Annapurna Circuit is a trek within the mountain ranges of central Nepal. The total length of the route varies between 100 and 145 miles. The highlights include reaching an altitude of almost 18,000 feet at Thorung La summit pass and watching the sun rise over towering peaks at Poon Hill.", asia, southAsia, difficult, "Annapurna Circuit Pack List", "Fifteen to Twenty Five Days", "It was great!");
        trekRepo.save(annaPurna);
        
        Trek banaueRiceTerraces = new Trek("Banaue Rice Terraces", "The terraces are located approximately 4,900 feet above sea level. These are fed by an ancient irrigation system from the rainforests above the terraces.", asia, southeastAsia, easy, "Backpack, Water bottle, Walking stick, Rain jacket.","Two to Three days.", "It was fun" );
        trekRepo.save(banaueRiceTerraces);
        
        Trek kumanoKodo = new Trek("Kumano Kodo", "The Kumano Kodo has various routes, with most people spending 2-4 days. Reaches elevated height of up to 3280 feet. The most popular is the Nakahechi route.", asia, eastAsia, easy, "Backpack, Walking Stick, Jacket, Water bottle, Sleeping bag, Head Lamp", "Two to Three days.", "This is a review.");
        trekRepo.save(kumanoKodo);
        
        Trek mountFuji = new Trek("Mount Fuji", "Climbing Mount Fuji is a challenge and is something that all Japanese do at least once in their life. Reached heights of up to 12,400 feet makes this a challenge. The trek lasts two days and there are no straight roads, it’s all uphill, so it’s best to be prepared.", asia, eastAsia, difficult, "Backpack, Walking Stick, Cramptons, Sleeping bag, Head lamp, Waterproof climbing shoes.", "Two days.", "There was a big mountain, but I didn't see it!");
        trekRepo.save(mountFuji);
        
        Trek shamanseerMountain = new Trek("Shamanseer Mountain", "This is a very light trail that will only take about 2-3 days to complete. Hikers will walk a total of 65 miles over. Heights will reach up to 5500 feet. The path is pretty rocky.", asia, southwestAsia, easy, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor", "Two to Three days.", "It is super hot!");
        trekRepo.save(shamanseerMountain);
        
        Trek danaToPetra = new Trek("Dana to Petra Trek", "Trek for eight days through Jordan's beautiful and rugged countryside, following the 'Jordan Trail' from Dana Nature Reserve to the ancient 'Rose-Red City' of Petra, and camping Bedouin style. Enjoy a wonderful week of discovery, walking and Jordanian hospitality. This trek will reach heights of 3800 feet.", asia, southwestAsia, moderate, "Backpack, water bottle, sleeping bag, hat or visor, sunscreen.", "Eight days.", "It's hot");
        trekRepo.save(danaToPetra);
        
        Trek everestBaseCamp = new Trek("Everest Base Camp", "The trek to Everest Base Camp is among the most dramatic and picturesque in the Himalaya. The scenery is varied and spectacular, the lodgings and tracks are of a very high standard. Will reach heights of 29,000 feet.", asia, southAsia, difficult, " 2 pairs of climbing boots, Cramptons, Ice Axes, Cramptoms, Backpack, Sleeping Bag, Cooking Stove, Ropes, Winter Clothing, Head Lamp.", "Tweleve days", "Its another review.");
        trekRepo.save(everestBaseCamp);
        
        

    }

}
