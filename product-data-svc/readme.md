About the Application:
Sample spring boot RESTful application which exposes GET and PUT services to fetch/update product information

Technologies:
Spring boot, Maven, Couchbase reactive, Reactive Webflux, logback, lombok, Jnuits Mokito

APIs available:
GET/PUT, Mono/Flux return types, excpetion handled APIs


Steps to run:
./mvnw clean install
./mvnw spring-boot:run

API calls:
GET http://localhost:8080/product/exception/13860428
PUT http://localhost:8080/product/exception/13860428
RequestBody:
{
    "id":"13860428",
    "name":"The Big Lebowski (Blu-ray) (Widescreen)--changed"
}
GET http://localhost:8080/product/13860428
GET http://localhost:8080/product/reactive/13860428


Database : couchbase, Spring reactive couchbase connector is used
Document model:

{
    "id": "13860428",
    "name": "The Big Lebowski (Blu-ray) (Widescreen)",
    "prices": [
        {
            "current_price": {
                "value": "13.49",
                "currency_code": "USD"
            },
            "base_price": {
                "value": "13.49",
                "currency_code": "USD"
            }
        }
    ]
}

Packages:
config : couchbaseconfig 
Controller
Exception
Models
Repository
Resources
Service : not added implementation as there isnt any manipulations done
test : Junit tests




