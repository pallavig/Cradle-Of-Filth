Problem statement:
------------------

GOOD store has recently opened a retail store. It has an inventory of products and over time we will build an AwesomeStore™

| Product Id        | Product Name           | Quantity  | Price/unit|
| ------------- |:-------------:| -----:| ----:|
| 1 | toothpaste | 10| 50 | 2|
| 2 | bournvita      |   2 | 100|


STORY #1: Print total worth per product.

| Product Name           | Quantity  |
|:-------------:| -----:| 
| toothpaste | 500 | 
| bournvita      |   700 |


==================================================================


GOOD store is quite awesome in managing its responsibility because it sells a single product at a time. 
It is getting famous worldwide and sells the product to different countries(India, Aus).
The product is named  differently in different country as per their national language.
So now the inventory looks like this.



| Product Id | Product Name| Quantity  | Price/unit| Countries |
| ------- |:-------------:| -----:| ----:|----:|
| 1 | toothpaste | 30 | 48 | { “India”:”paste”,“Aus”: “manjan” } |                   
| 2 | bournvita |   70 | 90 | { “India”:”tonic”,“Aus”: “” } |




STORY #2: Print what the product is called in different countries.

| Product Name | India | Australia |
| ------- |:-------------:| -----:|
|toothpaste | paste | manjan |


==================================================================

GOOD store is spreading its base to many other countries. 
It now wants the capability to add a new country. This happens quite frequently, so every time a new country is added code should not be redeployed.

STORY #3 : Print what the product is called in all countries including the recently added country.
So if toothpaste is now being sold in  Brazil with name "datun" then it should print

| Product Name | India | Australia | Brazil
| ------- |:-------------:| -----:|-----:|
|toothpaste | paste | manjan | datun |

InventoryTable.allRows() will be the source of information.
