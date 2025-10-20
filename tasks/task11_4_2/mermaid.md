# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid](https://mermaid.js.org/).

```mermaid
classDiagram
  Customer --> Order : places
  Order --> OrderItem : includes

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

