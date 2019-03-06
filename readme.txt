Program Creator: Adam Romyn
Program Name: PokerHands

HOW TO USE THE PROGRAM:
-----------------------------------------------------
Execute the Main class and the dricer method that runs the program will start.
It will ask for 5 cards. Make sure you enter these cards sepereated by commas and with uppercase letters only.

*Example:*
AS,10S,JS,QS,KS

The program will output the best hand it finds.

NOTES:
-----------------------------------------------------
My Solution:
The algorithm and pattern chosen was not the most efficient. The reason for this choice was so that the unit testing would be easier to create and showcase.
Also, based on the small nature of the program the method I chose was easiest and fast to implement. If the problem needed a scaleable soultion I would have chosen the method below.

Better Solution:
The other option would have been to get all the permutations of hands and rank those hands with a number. 
Then create a compare function that would allow use to sort the array easily and pick the last value in the array which would be the best hand.
The pro about this method is that you can write a more generic solution as it does not need if statements, but rather just to pick the last item from an array.
The downside is it is more complicated and lots of the logic would be sitting in one function.

