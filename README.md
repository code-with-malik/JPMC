# Super Simple Stocks #

IRQ Assignment

### Requirements ###

1. The International Refreshment Quoter is a new stock market trading in drinks companies.

a. Your company is building the object-oriented system to run that trading.

b. You have been assigned to build part of the core object model for a limited phase 1

2. Provide the complete source code that will:-

a. For a given stock,

i. Given any price as input, calculate the dividend yield

ii. Given any price as input, calculate the P/E Ratio

iii. Record a trade, with timestamp, quantity, buy or sell indicator and price

iv. Calculate Volume Weighted Stock Price based on trades in past 10 minutes

b. Calculate the GBCE All Share Index using the geometric mean of the Volume Weighted Stock Price for all stocks

### Notes ###
1. Written in one of these languages - Java, C#, C++, Python

2. The source code should be suitable for forming part of the object model of a production application, and can be proven to meet the requirements.

3. No database, GUI or I/O is required, all data need only be held in memory

4. No prior knowledge of stock markets or trading is required – all formulas are provided below.

5. The code should provide only the functionality requested, however must be production quality.
### Sample data ###

Stock Symbol | Type      | Last Dividend | Fixed Dividend | Par Value
:------------|:----------|--------------:|---------------:|-----------:
TEA          | Common    |  0            |                | 100           
POP          | Common    |  8            |                | 100
ALE          | Common    | 23            |                |  60
GIN          | Preferred |  8            | 2%             | 100
JOE          | Common    | 13            |                | 250


### Rest API(s) ###

```$xslt
GET  localhost:8080/dividendYield/50
Response:
[
    {
        "stock": "TEA",
        "dividendYield": 0.0
    },
    {
        "stock": "POP",
        "dividendYield": 0.16
    },
    {
        "stock": "ALE",
        "dividendYield": 0.46
    },
    {
        "stock": "GIN",
        "dividendYield": 4.0
    },
    {
        "stock": "JOE",
        "dividendYield": 0.26
    }
]
```
```$xslt
GET  localhost:8080/peRatio/50
Response:
[
    {
        "stock": "TEA",
        "dividendYield": "Infinity"
    },
    {
        "stock": "POP",
        "dividendYield": 312.5
    },
    {
        "stock": "ALE",
        "dividendYield": 108.69565217391303
    },
    {
        "stock": "GIN",
        "dividendYield": 12.5
    },
    {
        "stock": "JOE",
        "dividendYield": 192.3076923076923
    }
]
```  
```$xslt
POST  localhost:8080/recordTrade
Request:
{
    "stockSymbol":"AEE",
    "quantity":3,
    "price":100,
    "orderType":"SEL"

}
Response:
[
    {
        "stockSymbol": "AEE",
        "quantity": 3,
        "price": 100.0,
        "orderType": "SEL",
        "timeStamp": "2024-07-23T20:09:01.820+00:00"
    },
    {
        "stockSymbol": "AEE",
        "quantity": 3,
        "price": 100.0,
        "orderType": "SEL",
        "timeStamp": "2024-07-23T20:09:04.291+00:00"
    }
]
```  
```$xslt
GET  localhost:8080/volumeWeightedStockPrice/AEE
Response:
{
    "stockSymbol": "AEE",
    "vwsp": 100.0
}
```  
```$xslt
GET  localhost:8080/calculateGBCE
Response:
100.0
```  
