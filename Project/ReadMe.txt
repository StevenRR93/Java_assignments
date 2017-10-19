/*
 * ECE 25100
 * Steven Ramirez
 * Joseph Michalak
 * Final Project
 * 03/09/13
 */

Stadium Project

Project files are located under Project\Stadium\src
.txt files and .gif files are located under Project\Stadium

-Once the code is ran, the JFrame with the stadium will be created.

-From this point you can click on the seat buttons and add them to the cart.
	-When you click on a seat button, the seat information is displayed in the display window on the bottom of the GUI.
		-The display window gives you the seat number, row letter, section number and price of the selected seat.

-The 'Shopping Cart' button displays your current shopping cart

-Once you click the seat button and click 'add', the seat is added to the shopping cart.
	-Also the seat is changed to selected and the seat color is changed to black and a dancing banana. :)
	-once a seat is selected, you can select another.

-You can then either remove individual seats, check the shopping cart or click 'checkout' to either remove all seats or proceed to purchase your seat(s).

-Once you decide to purchase the seat, you are taken to a billing information window that asked for your name, address and card information to make your payment.
	-If all the information is not entered or you changed the selecting in the combo box from its default setting, the purchase can not be compelted. 
		-If all information is not entered correctly, you will be informed and the purchase will not be made.

-Once 'purchase' is selected in the billing information window, the seats are set to purchased, a file/receipt is created for the completed transaction,
	you are brought back to the stadium GUI for the next customer to make a purchase and purchased seats are grayed out and unable to be selected by the 
	next customer.
	(We did not know how to update in between GUI/Frames, so when a purchase is made, the purchased seats are "grayed" out once a new seat is 
		seleted in the stadium GUI)