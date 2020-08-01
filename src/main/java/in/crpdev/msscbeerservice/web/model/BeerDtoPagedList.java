package in.crpdev.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by rajapandian
 * Date: 01/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.web.model
 **/
public class BeerDtoPagedList extends PageImpl<BeerDto> {

    public BeerDtoPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerDtoPagedList(List<BeerDto> content) {
        super(content);
    }
}
