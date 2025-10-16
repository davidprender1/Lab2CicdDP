# Lab 2 – POST + Basic Validation

## Endpoints
- `GET /product/hello` – sanity check
- `GET /product/getproducts` – list all products
- `POST /product/addProduct` – add one product (validates body)
- `GET /product/count` – **homework:** returns number of stored products

## Model & Validation
```json
Product {
  productName: string  // @NotBlank, @Size(min=3)
  price: number        // @Positive
}
