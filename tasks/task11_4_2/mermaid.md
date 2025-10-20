# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    class Customer {
        name
        address
        placeOrder()
    }

    class Order {
        orderNumber
        datePlaced
        deliveryDate
        checkStock()
        takePayment()
    }

    class OrderItem {
        name
        description
    }

    Customer "1" --> "many" Order : places
    Order "1" --> "many" OrderItem : includes


[mer]: https://mermaid.js.org/
