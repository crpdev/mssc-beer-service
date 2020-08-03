package in.crpdev.msscbeerservice.bootstrap;

import in.crpdev.msscbeerservice.domain.model.Beer;
import in.crpdev.msscbeerservice.domain.repository.BeerRepository;
import in.crpdev.msscbeerservice.web.model.BeerStyle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by rajapandian
 * Date: 03/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.bootstrap
 **/
@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (beerRepository.count() == 0){
            loadBeerData();
        }
        System.out.println("<<< Mock Data Loaded Successfully: " + beerRepository.count());
    }

    private void loadBeerData() {
        Beer b1 = Beer.builder()
                .beerName("Kingfisher")
                .price(new BigDecimal(180))
                .beerStyle(BeerStyle.LAGER.name())
                .minOnHand(100)
                .quantityToBrew(200)
                .upc(BEER_1_UPC)
                .build();

        Beer b2 = Beer.builder()
                .beerName("Corona")
                .price(new BigDecimal(180))
                .beerStyle(BeerStyle.WHEAT.name())
                .minOnHand(100)
                .quantityToBrew(200)
                .upc(BEER_2_UPC)
                .build();

        beerRepository.save(b1);
        beerRepository.save(b2);
    }
}
