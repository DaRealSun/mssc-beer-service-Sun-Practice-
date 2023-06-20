package son.springframework.msscbeerservice.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import son.springframework.msscbeerservice.services.BeerService;
import son.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;
@AllArgsConstructor
@RequestMapping("/ap1/v1/beer")
@RestController
public class BeerController {

    private BeerService beerService;
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerService.updateById(beerId, beerDto), HttpStatus.NO_CONTENT);
    }
}
