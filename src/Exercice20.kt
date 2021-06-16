// Retourner un ensemble de clients
fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()

// Retourner l'ensemble des villes d'où proviennent les clients
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map{it.city}.toSet()

// Retourner une liste des clients qui vivent dans la ville donnée
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { it.city == city }

// Retourner vrai si tous les clients viennent de la ville donnée
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

// Retourner true s'il y a au moins un client de la ville donnée
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city == city }

// Retourner le nombre de clients de la ville donnée
fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city == city }

// Retourner un client qui habite dans la ville donnée, ou null s'il n'y en a pas
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city == city }

// Retourner tous les produits que ce client a commandés
val Customer.orderedProducts: Set<Product> get() = orders.flatMap { it.products }.toSet()

// Retourner tous les produits commandés par au moins un client
val Shop.allOrderedProducts: Set<Product> get() = customers.flatMap { it.orderedProducts }.toSet()

// Retourner un client dont le nombre de commandes est le plus élevé parmi tous les clients
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxByOrNull { it.orders.size }

// Retourner le produit le plus cher qui a été commandé
fun Customer.getMostExpensiveOrderedProduct(): Product? = orderedProducts.maxByOrNull { it.price }

// Retourner une liste de clients, triés par le nombre croissant de commandes qu'ils ont passées
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy { it.orders.size }

// Retourner la somme des prix de tous les produits commandés par un client.
// Remarque: le client peut commander plusieurs fois le même produit.
fun Customer.getTotalOrderPrice(): Double = orders.flatMap { it.products }.sumOf { it.price }

// Retourner une map des clients vivant dans chaque ville
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }

// Retourner les clients qui ont plus de commandes non livrées que livrées
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
    customers.filter {
        val (delivered, undelivered) = it.orders.partition { it.isDelivered }
        undelivered.size > delivered.size
    }.toSet()

// Retourner l'ensemble des produits commandés par chaque client
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> =
    customers.flatMap { it.orderedProducts }.toSet()

// Retourner le produit le plus cher parmi tous les produits livrés (utilisez l'indicateur Order.isDelivered)
fun Customer.getMostExpensiveDeliveredProduct(): Product? =
    orders.filter { it.isDelivered }.flatMap { it.products }.maxByOrNull { it.price }

// Retourner une liste des produits commandés par un client
fun Customer.getOrderedProductsList(): List<Product> = orders.flatMap { it.products }

// Retourner combien de fois le produit donné a été commandé.
// Remarque: un client peut commander plusieurs fois le même produit.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int =
    customers.flatMap { it.getOrderedProductsList() }.count { it == product }

