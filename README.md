## LinkedList Challenge

### Description

First, create a type that has a town or place name, and a field for storing the distance from the start.

| Town | Distance from Sydney (in km) |
| --- | --- |
| Adelaide | 1374 |
| Alice Springs | 2771 |
| Brisbane | 917 |
| Darwin | 3972 |
| Melbourne | 877 |
| Perth | 3923 |
| Sydney | 0

You'll want to create a <b>LinkedList</b> of your place or town type. This list will be ordered by the distance from the starting point, in this case Sydney. Sydney should be the first element in your list. You don't want to allow duplicate places in your list, for this data set.

In addition, you'll create an interactive program with the following menu options:

```
Available actions (select word or letter):
(F)orward
(B)ackward
(L)ist Places
(M)enu
(Q)uit
```

You'll want to use a <b>Scanner</b>, and the <b>nextLine</b> method, to get input from the console. You'll use a <b>ListIterator</b>, to move forward and backwards, through the list of places in your itinerary.
