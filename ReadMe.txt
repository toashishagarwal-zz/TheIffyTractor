This simple class describes a fictitious tractor. The tractor moves around a field, hopefully without 
falling in any of the ditches which sit around the edge. The driver moves the tractor by issuing commands 
to it (although this role is played by the test at the moment). Currently there are only two commands: 
"Forwards" and "Turn Clockwise". In the future there'll probably be more like "Reverse" but we don't want 
you to implement that right now.

What we do want you to do is refactor the code for us. On the ODC team we like well factored OO code. 

***Big Hint: There's a reason we call it the IffyTractor: we don't like to many conditionals.***

Have a crack at it for 20-30mins. After that we'll come pair with you.

Good Luck!

-----------------------------------------------------------------------------------------------------------

Notes:
1) The Tractor class after refactoring is now followin the Single Responsibility Principle of SOLID design
This noun class has attributes and verbs (i.e. functions) pertaining to Tractor

2) The accessibility of the Tractor class attributes was made private. There was no need for them to have default access

3) Both the executor frameworks are similar. The principle used is -
	- there is a matching criterion
	- there is an execute
	- If matching criterion is true, execute is triggered
	
4) All the tests are GREEN after refactoring

