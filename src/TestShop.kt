fun customer(name: String, city: City, vararg orders: Order) = Customer(name, city, orders.toList())
fun order(vararg products: Product, isDelivered: Boolean = true) = Order(products.toList(), isDelivered)
fun shop(name: String, vararg customers: Customer) = Shop(name, customers.toList())

//products
val idea = Product("IntelliJ", 199.0)
val reSharper = Product("ReSharper", 149.0)
val dotTrace = Product("DotTrace", 159.0)
val dotMemory = Product("DotTrace", 129.0)
val dotCover = Product("DotCover", 99.0)
val appCode = Product("AppCode", 99.0)
val phpStorm = Product("PhpStorm", 99.0)
val pyCharm = Product("PyCharm", 99.0)
val rubyMine = Product("RubyMine", 99.0)
val webStorm = Product("WebStorm", 49.0)
val teamCity = Product("TeamCity", 299.0)
val youTrack = Product("YouTrack", 500.0)

//cities
val Paris = City("Paris")
val Vancouver = City("Vancouver")
val Budapest = City("Budapest")
val NewYork = City("New York")
val Tokyo = City("Tokyo")

val shop = shop("test shop",
    customer("Lucas", Paris,
        order(reSharper),
        order(reSharper, dotMemory, dotTrace)
    ),
    customer( "Nathalie", Paris),
    customer("Nathan", Vancouver,
        order(rubyMine, webStorm)
    ),
    customer( "John", Budapest,
        order(idea, isDelivered = false),
        order(idea, isDelivered = false),
        order(idea)
    ),
    customer("Reda", NewYork,
        order(reSharper)
    ),
    customer("Sabrina", Tokyo,
        order(idea)
    )
)