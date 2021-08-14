Write a Java program to get the team names and player names from the user seperated by a pipe symbol. Finally display all the teams and their players sorted in ascending order based on their names.

Create Player class with single private attribute name

Add appropriate getter and setter methods for Player class

Include a constructor with single argument Player name

Implement Comparable interface in the Player class and implement the method compareTo()

Create Team class with below private attributes,

name - String

playerList - List<Player> (All player object for this team is stored in this list)

Add appropriate getter and setter methods for Team class

Include a constructor accepting Team name as a parameter

Below are the methods in Team class

addPlayer(String playername) - Add the new player to this team object

getPlayerList() - Sort the player collection and return the list

Create a main class "DisplayTeamMain.java"

Input and Output Format:

First input corresponds to the number of input elements and followed by team and player information in the format teamname|playername.

Display the player name followed by two hyphen(-)

Refer sample input and output for formatting specifications.

Sample Input/Output :

10

CSK|MS Dhoni

CSK|Sam Curran

CSK|Ambati Rayudu

RCB|Virat Kohli

RCB|Davudatt Padikkal

RCB|AB de Villiers

CSK|Suresh Raina

KKR|Eoin Morgan

KKR|Pat Cummins

KKR|Dinesh Karthick

Team and Players in ascending order

CSK

--Ambati Rayudu

--MS Dhoni

--Sam Curran

--Suresh Raina

KKR

--Dinesh Karthick

--Eoin Morgan

--Pat Cummins

RCB

--AB de villiers

--Devudatt Padikkal

--Virat Kohli
