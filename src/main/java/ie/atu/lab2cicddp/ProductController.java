package ie.atu.lab2cicddp;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<Product> myList = new ArrayList<>();
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }
    @GetMapping("/getproducts")
    public List<Product> getProducts()
    {
        Product myProduct = new Product("Tv", 499);
        return myList;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct)
    {
        myList.add(myProduct);
        return myProduct;
    }
}

