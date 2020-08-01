package in.crpdev.msscbeerservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.crpdev.msscbeerservice.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by rajapandian
 * Date: 01/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.web.controller
 **/
@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeerById() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void saveNewBeer() {
        BeerDto beerDto = BeerDto.builder().build();
        try {
            String beerDtoJson = objectMapper.writeValueAsString(beerDto);
            mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/beer")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(beerDtoJson))
                    .andExpect(status().isCreated());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void updateBeerById() {
        BeerDto beerDto = BeerDto.builder().build();
        try {
            String beerDtoJson = objectMapper.writeValueAsString(beerDto);
            mockMvc.perform(MockMvcRequestBuilders.put( "/api/v1/beer/" + UUID.randomUUID())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(beerDtoJson))
                    .andExpect(status().isNoContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
