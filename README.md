# santander-dev-api
Java RESTFull API 

```mermaid

classDiagram
  class User {
    - String name
    - Account account
    - Feature[] features
    - Card card
    - News[] news
  }

  class Account {
    - String Number
    - String Agency
    - float Balance
    - float Limit
  }

  class Feature {
    - String icon
    - String description
  }

  class Card {
    - String number
    - float limit
  }

  class News {
    - String icon
    - String description
  }

  User "1" *-- "1" Account
  User "1" *-- "1..n" Feature
  User "1" *-- "1" Card
  User "1" *-- "n" News

  ```
