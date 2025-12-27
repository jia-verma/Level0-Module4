package _01_double._1_change_calculator;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
	String theAmountOfNicklesTheUserHasAsAStringCommaIReallyHateGettingAllOfMyCodeReset = JOptionPane.showInputDialog("How many nickles do you have?");
	String theAmountOfPenniesTheUserHasAsAStringForSomeReasonThisIsNotInTheOriginalCodeEvenThoughItMakesSense = JOptionPane.showInputDialog("How many pennies do you have?");
	String theAmountOfDimesTheUserHasAsAStringThisIsActuallyPrettyCalming = JOptionPane.showInputDialog("How many dimes do you have?");
	String theAmountOfQuartersTheUserHasAsAStringIWonderHowManyLessMurdersWouldBeCommittedIfPeopleWereTaughtCode = JOptionPane.showInputDialog("How many quarters do you have?");
	int theAmountOfNicklesTheUserHasAsAnIntegerCommaIReallyHateGettingAllOfMyCodeReset = Integer.parseInt(theAmountOfNicklesTheUserHasAsAStringCommaIReallyHateGettingAllOfMyCodeReset);
	int theAmountOfPenniesTheUserHasAsAnIntegerForSomeReasonThisIsNotInTheOriginalCodeEvenThoughItMakesSense = Integer.parseInt(theAmountOfPenniesTheUserHasAsAStringForSomeReasonThisIsNotInTheOriginalCodeEvenThoughItMakesSense);
	int theAmountOfDimesTheUserHasAsAnIntegerThisIsActuallyPrettyCalming = Integer.parseInt(theAmountOfDimesTheUserHasAsAStringThisIsActuallyPrettyCalming);
	int theAmountOfQuartersTheUserHasAsAnIntegerIWonderHowManyLessMurdersWouldBeCommittedIfPeopleWereTaughtCode = Integer.parseInt(theAmountOfQuartersTheUserHasAsAStringIWonderHowManyLessMurdersWouldBeCommittedIfPeopleWereTaughtCode);
	double theTotalAmountOFMoneyTheUserHasCommaAndNoOneCanTellMeToMakeShorterVariableNamesCommaEverEvilLaughEvilLaughExclamationMark = 0.05*theAmountOfNicklesTheUserHasAsAnIntegerCommaIReallyHateGettingAllOfMyCodeReset + 0.01*theAmountOfPenniesTheUserHasAsAnIntegerForSomeReasonThisIsNotInTheOriginalCodeEvenThoughItMakesSense + 0.1*theAmountOfDimesTheUserHasAsAnIntegerThisIsActuallyPrettyCalming + 0.25*theAmountOfQuartersTheUserHasAsAnIntegerIWonderHowManyLessMurdersWouldBeCommittedIfPeopleWereTaughtCode;
	JOptionPane.showInputDialog("You have " + theTotalAmountOFMoneyTheUserHasCommaAndNoOneCanTellMeToMakeShorterVariableNamesCommaEverEvilLaughEvilLaughExclamationMark + " dollars.");
	if (theTotalAmountOFMoneyTheUserHasCommaAndNoOneCanTellMeToMakeShorterVariableNamesCommaEverEvilLaughEvilLaughExclamationMark < 0){
		JOptionPane.showMessageDialog(null,"YOU HAVE LIED TO ME, YOU SCURVY DOG, AND NOW YOU MUST DIE!!!");
	} else if (theTotalAmountOFMoneyTheUserHasCommaAndNoOneCanTellMeToMakeShorterVariableNamesCommaEverEvilLaughEvilLaughExclamationMark<2){
		JOptionPane.showMessageDialog(null,"Honestly, in this economy, what do you expect you can buy with that?");
	} else {
		JOptionPane.showMessageDialog(null,"Hmm... You look ripe for stealing... remind me of your social security number and credit card again? For research purposes only, obviously");
	}
	String theUsersLatestTestScoreAsAStringCommaCarefulCommaWeMustBeKind = JOptionPane.showInputDialog("What is your latest test score");
	Double theUsersLatestTestScoreAsADoubleCommaWhyDoWeHaveToBeKindCommaTeasingPeopleIsSoMuchFun = Double.parseDouble(theUsersLatestTestScoreAsAStringCommaCarefulCommaWeMustBeKind);
	if (theUsersLatestTestScoreAsADoubleCommaWhyDoWeHaveToBeKindCommaTeasingPeopleIsSoMuchFun < 0){
		JOptionPane.showMessageDialog(null, "How did that happen? Back in my day, teachers never scored below zero!");
	} else if (theUsersLatestTestScoreAsADoubleCommaWhyDoWeHaveToBeKindCommaTeasingPeopleIsSoMuchFun < 50){
		
	}
	
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

