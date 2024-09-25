package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

/**
 * @author ileanaoneata on 25.09.2024
 */
public interface BeerClient {

    Page<BeerDTO> listBeers();
}