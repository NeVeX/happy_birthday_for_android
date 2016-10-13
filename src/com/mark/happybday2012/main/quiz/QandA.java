package com.mark.happybday2012.main.quiz;

import android.util.Log;

public class QandA {

	public static CharSequence[] questionsList;
	public static CharSequence[][] answersList;
	public static CharSequence[] correctAnswer;
	private static int totalQuestions = 40;
	private static String logID = QandA.class.getName();
	
	public QandA() {
		questionsList = new CharSequence[totalQuestions];
		answersList = new CharSequence[totalQuestions][4];
		correctAnswer = new CharSequence[totalQuestions];
		setUpQuestionsAndAnswers();
		Log.d(logID, "All Questions and Answers Setup.");
	}
	
	private void setUpQuestionsAndAnswers()
	{
		int i = 0;
		// question 1
		questionsList[i] = "So, What's Your Name?";
		answersList[i][0] = "ARRIANA!";
		answersList[i][1] = "Adriana";
		answersList[i][2] = "She";
		answersList[i][3] = "Her";
		correctAnswer[i] = "Adriana";
		i++;
		// question 2a - info test question
		questionsList[i] = "Is Today Your Birthday?";
		answersList[i][0] = "Feck off! It is me bollocks!";
		answersList[i][1] = "Hah?";
		answersList[i][2] = "(Annoyed Tone) Nooo";
		answersList[i][3] = "Yes!";
		correctAnswer[i] = "Yes!";
		i++;
		// question 2a - info test question
		questionsList[i] = "When was the last time I was kidnapped by KRAM?";
		answersList[i][0] = "You're an idiot";
		answersList[i][1] = "Mark's Birthday";
		answersList[i][2] = "In Ireland";
		answersList[i][3] = "Valentine's Day";
		correctAnswer[i] = "Valentine's Day";
		i++;
		// question 2
		questionsList[i] = "Is Mark Gay?";
		answersList[i][0] = "He's Bi";
		answersList[i][1] = "Full On Gay";
		answersList[i][2] = "Just A Little";
		answersList[i][3] = "None At All";
		correctAnswer[i] = "None At All";
		i++;
		// question 3
		questionsList[i] = "Who Else's Birthday Is Today?";
		answersList[i][0] = "James Dean";
		answersList[i][1] = "Gwen Stefani";
		answersList[i][2] = "Oscar Wilde";
		answersList[i][3] = "Olivia Newton John";
		correctAnswer[i] = "Oscar Wilde";
		i++;
		// question 4
		questionsList[i] = "What Is The Capital Of Azerbaijan?";
		answersList[i][0] = "Dublin";
		answersList[i][1] = "Ramizj";
		answersList[i][2] = "Galway";
		answersList[i][3] = "Baku";
		correctAnswer[i] = "Baku";
		i++;
		// question 5
		questionsList[i] = "How Many Paper Weights Have You Given Me?";
		answersList[i][0] = "2";
		answersList[i][1] = "4";
		answersList[i][2] = "3";
		answersList[i][3] = "5";
		correctAnswer[i] = "4";
		i++;
		// question 6
		questionsList[i] = "What Is My Favourite Color?";
		answersList[i][0] = "Black";
		answersList[i][1] = "Blue";
		answersList[i][2] = "Ruby Red";
		answersList[i][3] = "Golden Yellow";
		correctAnswer[i] = "Black";
		i++;
		// question 7
		questionsList[i] = "That Sexy Photo Of You Wearing My Liverpool Jersey, What Jersey Type Was It?";
		answersList[i][0] = "Home Jersey";
		answersList[i][1] = "European Jersey";
		answersList[i][2] = "Away Jersey";
		answersList[i][3] = "Training Jersey";
		correctAnswer[i] = "Away Jersey";
		i++;
		// question 8
		questionsList[i] = "What Do I Think Is Your Best Feature?";
		answersList[i][0] = "Ass";
		answersList[i][1] = "Legs";
		answersList[i][2] = "Boobs";
		answersList[i][3] = "Face";
		correctAnswer[i] = "Face";
		i++;
		// question 9
		questionsList[i] = "What Town Was The Film - The Quiet Man - Set? (You Were There)";
		answersList[i][0] = "Connemara";
		answersList[i][1] = "Burren";
		answersList[i][2] = "Cong";
		answersList[i][3] = "Sligo";
		correctAnswer[i] = "Cong";
		i++;
		// question 10
		questionsList[i] = "What Does Craic Mean?";
		answersList[i][0] = "Jolly Good Time";
		answersList[i][1] = "Making Sex";
		answersList[i][2] = "Having A Laugh";
		answersList[i][3] = "Getting Drunk";
		correctAnswer[i] = "Having A Laugh";
		i++;
		// question 11
		questionsList[i] = "When Will My Current (New) Visa Expire?";
		answersList[i][0] = "2013";
		answersList[i][1] = "2014";
		answersList[i][2] = "2015";
		answersList[i][3] = "2016";
		correctAnswer[i] = "2015";
		i++;
		// question 12
		questionsList[i] = "What Magazine Did I Get In Ireland That I Love To Read?";
		answersList[i][0] = "Focus";
		answersList[i][1] = "Prime Science";
		answersList[i][2] = "PC World";
		answersList[i][3] = "Science Echo";
		correctAnswer[i] = "Focus";
		i++;
		// question 13
		questionsList[i] = "How Many Channels Are Broadcast In Ireland?";
		answersList[i][0] = "3";
		answersList[i][1] = "4";
		answersList[i][2] = "5";
		answersList[i][3] = "6";
		correctAnswer[i] = "4";
		i++;
		// question 14
		questionsList[i] = "Which Ireland TV Channel Exclusively Speaks Irish?";
		answersList[i][0] = "RTE";
		answersList[i][1] = "TV3";
		answersList[i][2] = "TG4";
		answersList[i][3] = "ITV";
		correctAnswer[i] = "TG4";
		i++;
		// question 15
		questionsList[i] = "Pog mo Thoin";
		answersList[i][0] = "The Boy Child Drinks";
		answersList[i][1] = "Kiss My Ass";
		answersList[i][2] = "To Good Health";
		answersList[i][3] = "Thanks A Mil";
		correctAnswer[i] = "Kiss My Ass";
		i++;
		// question 16
		questionsList[i] = "My First Name In Irish?";
		answersList[i][0] = "Marko";
		answersList[i][1] = "Marcus";
		answersList[i][2] = "Maerk";
		answersList[i][3] = "Maurk";
		correctAnswer[i] = "Marcus";
		
		// 2nd phase
		
		i++;
		// question 17
		questionsList[i] = "In Order Of Most Preferred To Least Preferred For Stella Artois, Which Is More Correct?";
		answersList[i][0] = "1) Draft Stella 2) Bottle Stella 3) Can Stella";
		answersList[i][1] = "1) Can Stella 2) Draft Stella 3) Bottle Stella";
		answersList[i][2] = "1) Bottle Stella 2) Draft Stella 3) Can Stella";
		answersList[i][3] = "1) Draft Stella 2) Can Stella 3) Bottle Stella";
		correctAnswer[i] = "1) Draft Stella 2) Can Stella 3) Bottle Stella";
		i++;
		// question 18
		questionsList[i] = "Will You Like My New Beard (When It Grows)?";
		answersList[i][0] = "Yes";
		answersList[i][1] = "Yes";
		answersList[i][2] = "Yes";
		answersList[i][3] = "Yes";
		correctAnswer[i] = "Yes";
		i++;
		// question 19
		questionsList[i] = "Will You Get A Pixie Cut In Retaliation?";
		answersList[i][0] = "No";
		answersList[i][1] = "No";
		answersList[i][2] = "No";
		answersList[i][3] = "No";
		correctAnswer[i] = "No";
		i++;
		// question 20
		questionsList[i] = "What Province Did We Not Enter In Ireland?";
		answersList[i][0] = "Munster";
		answersList[i][1] = "Leinster";
		answersList[i][2] = "Connaught";
		answersList[i][3] = "Ulster";
		correctAnswer[i] = "Ulster";
		i++;
		// question 21
		questionsList[i] = "What River Did We Get The Ferry Across?";
		answersList[i][0] = "River Lee";
		answersList[i][1] = "River Shannon";
		answersList[i][2] = "River Boyne";
		answersList[i][3] = "River Charles";
		correctAnswer[i] = "River Shannon";
		i++;
		// question 22
		questionsList[i] = "What Was The Name Of My Fictional Band In HighSchool?";
		answersList[i][0] = "Nerds!";
		answersList[i][1] = "Whack!";
		answersList[i][2] = "Vengeful Hate!";
		answersList[i][3] = "Eternal Darkness!";
		correctAnswer[i] = "Whack!";
		i++;
		// question 23
		questionsList[i] = "And What Was The Name Of The First Album From Whack?";
		answersList[i][0] = "Greatest Hits";
		answersList[i][1] = "Let Me Play";
		answersList[i][2] = "School Sucks";
		answersList[i][3] = "What Is This Feeling?";
		correctAnswer[i] = "Greatest Hits";
		i++;
		// question 24
		questionsList[i] = "What Did I Eat Every Morning In Ireland (While Working)?";
		answersList[i][0] = "Weetabix";
		answersList[i][1] = "Frosties";
		answersList[i][2] = "Sausage Rolls";
		answersList[i][3] = "Breakfast Roll";
		correctAnswer[i] = "Sausage Rolls";
		i++;
		// question 25
		questionsList[i] = "What Is My Phone Number...Yes, I'm Asking This Again?";
		answersList[i][0] = "617-413-4135";
		answersList[i][1] = "617-413-4125";
		answersList[i][2] = "617-413-5125";
		answersList[i][3] = "617-413-5135";
		correctAnswer[i] = "617-413-4125";
		i++;
		// question 26
		questionsList[i] = "Galway Lost In The Hurling Final (Which You Briefly Watched)...But To Whom?";
		answersList[i][0] = "Clare";
		answersList[i][1] = "Sligo";
		answersList[i][2] = "Kilkenny";
		answersList[i][3] = "Meath";
		correctAnswer[i] = "Kilkenny";
		i++;
		// question 27
		questionsList[i] = "The Place Where I Bought You The Claddagh Ring Was Called?";
		answersList[i][0] = "Spanish Quarter";
		answersList[i][1] = "Latin Half";
		answersList[i][2] = "Latin Quarter";
		answersList[i][3] = "Latin Arch";
		correctAnswer[i] = "Latin Quarter";
		i++;
		// question 28
		questionsList[i] = "What Town Did We Look For Your Camera Battery (Before The Wedding?)";
		answersList[i][0] = "Castlebar";
		answersList[i][1] = "Castlecook";
		answersList[i][2] = "Castlerea";
		answersList[i][3] = "Castlerook";
		correctAnswer[i] = "Castlerea";
		i++;
		// question 29
		questionsList[i] = "The Name Of Lays Crisps In Ireland Are Called?";
		answersList[i][0] = "Walkers";
		answersList[i][1] = "Kings";
		answersList[i][2] = "Taytos";
		answersList[i][3] = "Kettle Chips";
		correctAnswer[i] = "Walkers";
		i++;
		// question 30
		questionsList[i] = "Ah Heyere....";
		answersList[i][0] = "...Put It Down";
		answersList[i][1] = "...Have A Drink";
		answersList[i][2] = "...Go Away";
		answersList[i][3] = "...Leave It Out";
		correctAnswer[i] = "...Leave It Out";
		i++;
		// question 31
		questionsList[i] = "What Is The Name Of The Main Square In Galway?";
		answersList[i][0] = "Jacob Square";
		answersList[i][1] = "Agus Square";
		answersList[i][2] = "Arthur Square";
		answersList[i][3] = "Eyre Square";
		correctAnswer[i] = "Eyre Square";
		i++;
		// question 32
		questionsList[i] = "What Is The Name Of The Pub That Is Both Here In Boston And Galway (You Were In It Too)?";
		answersList[i][0] = "Roisin Dubh";
		answersList[i][1] = "Munroes";
		answersList[i][2] = "Tig Ceoli";
		answersList[i][3] = "Buskers";
		correctAnswer[i] = "Roisin Dubh";
		i++;
		// question 33
		questionsList[i] = "What Amazing Thing Happened On Sunday Night?";
		answersList[i][0] = "We Watched Prometheus";
		answersList[i][1] = "I Shopped For Us";
		answersList[i][2] = "We Went To The Gym";
		answersList[i][3] = "You Sneezed/Coughed And Farted At Once";
		correctAnswer[i] = "You Sneezed/Coughed And Farted At Once";
		i++;
		// question 34
		questionsList[i] = "Do I Think That You Are Old?";
		answersList[i][0] = "No";
		answersList[i][1] = "Yes";
		answersList[i][2] = "Sometimes";
		answersList[i][3] = "Rarely";
		correctAnswer[i] = "No";
		i++;
		// question 35
		questionsList[i] = "Do I Think You Are Wildly Attractive?";
		answersList[i][0] = "You Are Just Gonna Say Yes";
		answersList[i][1] = "You Are Mad Attractive";
		answersList[i][2] = "You're Ok";
		answersList[i][3] = "You're Disgusting";
		correctAnswer[i] = "You Are Mad Attractive";
		i++;
		// question 36
		questionsList[i] = "Does My Family Love You?";
		answersList[i][0] = "Yes...They Love You Too Much Actually";
		answersList[i][1] = "Nope";
		answersList[i][2] = "Everyone Does, Except Richard";
		answersList[i][3] = "They Hate You!";
		correctAnswer[i] = "Yes...They Love You Too Much Actually";
		i++;
		// question 37
		questionsList[i] = "Happy Birthday Adriana!";
		answersList[i][0] = "Thanks! x";
		answersList[i][1] = "Feck Off!";
		answersList[i][2] = "I Like Puppies!";
		answersList[i][3] = "MARKY!!";
		correctAnswer[i] = "Thanks! x";
		i++;
		// question 38
		questionsList[i] = "I Love You!";
		answersList[i][0] = "Eh...That's Not A Question!";
		answersList[i][1] = "Gross";
		answersList[i][2] = "Yay!";
		answersList[i][3] = "I Like Puppies!";
		correctAnswer[i] = "Yay!";
//		i++;
//		// question 39
//		questionsList[i] = "What Unusual Pet Did I Have When I Was Young?";
//		answersList[i][0] = "A Lizard";
//		answersList[i][1] = "A Calf";
//		answersList[i][2] = "A LadyBird";
//		answersList[i][3] = "A Wolf";
//		correctAnswer[i] = "A Calf";
//		i++;
//		// question 40
//		questionsList[i] = "What Did I Do With You That I Didn't Do With Others When We Started Dating?";
//		answersList[i][0] = "You Made Me Pay For Everything";
//		answersList[i][1] = "You Ignored Me";
//		answersList[i][2] = "You Saw Me On The Weekends";
//		answersList[i][3] = "You Called Me";
//		correctAnswer[i] = "You Saw Me On The Weekends";
//		i++;
//		// question 41
//		questionsList[i] = "What Do I call Bloomingdales - The ______ Store?";
//		answersList[i][0] = "Crap";
//		answersList[i][1] = "Overpriced";
//		answersList[i][2] = "Don't Bring Your Parents There";
//		answersList[i][3] = "Dress";
//		correctAnswer[i] = "Dress";
//		
//		
//		// 3rd phase
//		i++;
//		// question 42
//		questionsList[i] = "What Hair Style Do I Love To See On You?";
//		answersList[i][0] = "No Hairstyle";
//		answersList[i][1] = "Fringe At The Front";
//		answersList[i][2] = "That Bump Thing At The Front Of My Hair";
//		answersList[i][3] = "Straightened";
//		correctAnswer[i] = "That Bump Thing At The Front Of My Hair";
//		i++;
//		// question 43
//		questionsList[i] = "Out Of 10, How Hot Do I Think You Are?";
//		answersList[i][0] = "6";
//		answersList[i][1] = "7";
//		answersList[i][2] = "11";
//		answersList[i][3] = "9";
//		correctAnswer[i] = "11";
//		i++;
//		// question 44
//		questionsList[i] = "Last Week, You Did Something Weird At Six In The Morning, Whilst Asleep. What Was It?";
//		answersList[i][0] = "I Fell Out Of The Bed";
//		answersList[i][1] = "I Started Snoring";
//		answersList[i][2] = "I Kept Kicking The Sheets Off The Bed";
//		answersList[i][3] = "I Cuddled You";
//		correctAnswer[i] = "I Kept Kicking The Sheets Off The Bed";
//		
//		
//		
//		// correct to here
//		i++;
//		// question 45
//		questionsList[i] = "Out Of The List Below, What Am I Most Afraid Of?";
//		answersList[i][0] = "Commitment";
//		answersList[i][1] = "Clowns";
//		answersList[i][2] = "Mice";
//		answersList[i][3] = "Balloons";
//		correctAnswer[i] = "Balloons";
//		i++;
//		// question 46
//		questionsList[i] = "My Favourite Stout?";
//		answersList[i][0] = "Murphy's";
//		answersList[i][1] = "Guinness";
//		answersList[i][2] = "Beamish";
//		answersList[i][3] = "Samuel Adams";
//		correctAnswer[i] = "Guinness";
//		i++;
//		// question 47
//		questionsList[i] = "My Favourite Beer(s)?";
//		answersList[i][0] = "Hieneken/Stella Artois";
//		answersList[i][1] = "Corona/Budweiser";
//		answersList[i][2] = "Bud Light";
//		answersList[i][3] = "Guinness";
//		correctAnswer[i] = "Hieneken/Stella Artois";
//		i++;
//		// question 48
//		questionsList[i] = "My Favourite Short?";
//		answersList[i][0] = "Vodka";
//		answersList[i][1] = "Jack Daniels";
//		answersList[i][2] = "Jameson";
//		answersList[i][3] = "Maker's Mark";
//		correctAnswer[i] = "Jack Daniels";
//		i++;
//		// question 49
//		questionsList[i] = "My, Now, Favourite Shot?";
//		answersList[i][0] = "Sambuca";
//		answersList[i][1] = "Tequila";
//		answersList[i][2] = "Jagermeister";
//		answersList[i][3] = "None Of The Above";
//		correctAnswer[i] = "None Of The Above";
//		i++;
//		// question 50
//		questionsList[i] = "Which Margarita Did I Not Like At The Engagement Party Last Friday?";
//		answersList[i][0] = "Shaddock";
//		answersList[i][1] = "The Fallen Angel";
//		answersList[i][2] = "Starlite Cocktail";
//		answersList[i][3] = "Fist Full Of Dollars";
//		correctAnswer[i] = "The Fallen Angel";
//		i++;
//		// question 51
//		questionsList[i] = "I Recieved An Award From Fidelity Last Year For Hard Work. What Was The Reward?";
//		answersList[i][0] = "A Gift Voucher For The Canteen";
//		answersList[i][1] = "A 7% Raise";
//		answersList[i][2] = "A 2.5% Raise";
//		answersList[i][3] = "A $100 Debit Card";
//		correctAnswer[i] = "A $100 Debit Card";
//		i++;
//		// question 52
//		questionsList[i] = "How Long Have I Worked At Fidelity, Including Ireland?";
//		answersList[i][0] = "2 Years";
//		answersList[i][1] = "4 Years";
//		answersList[i][2] = "3 Years";
//		answersList[i][3] = "5 Years";
//		correctAnswer[i] = "3 Years";
//		i++;
//		// question 53
//		questionsList[i] = "On The Day We Met, What Activity Was I Attempting To Do?";
//		answersList[i][0] = "Paintballing";
//		answersList[i][1] = "Bungee Jump";
//		answersList[i][2] = "Drinking";
//		answersList[i][3] = "Sky Diving";
//		correctAnswer[i] = "Sky Diving";
//		i++;
//		// question 54
//		questionsList[i] = "When The Sky Diving Was Cancelled, I Rang Home To Inform Mom That...";
//		answersList[i][0] = "Some One Died That Morning From Sky Diving";
//		answersList[i][1] = "You Were Too Sick To Dive";
//		answersList[i][2] = "It Was Too Windy";
//		answersList[i][3] = "That You Loved Your Mom";
//		correctAnswer[i] = "Some One Died That Morning From Sky Diving";
//		i++;
//		// question 55
//		questionsList[i] = "What Was The First Musical Instrument I Learned?";
//		answersList[i][0] = "Electric Guitar";
//		answersList[i][1] = "Acoustic Guitar";
//		answersList[i][2] = "Tin Whistle";
//		answersList[i][3] = "The Triangle";
//		correctAnswer[i] = "Tin Whistle";
//		i++;
//		// question 56
//		questionsList[i] = "If My Best Mate, Mark, Was A Woman, Or Changed To One, I Would, With Your Consent...";
//		answersList[i][0] = "Marry Him";
//		answersList[i][1] = "Snog Him";
//		answersList[i][2] = "Love Him More";
//		answersList[i][3] = "Move To Australia";
//		correctAnswer[i] = "Marry Him";
//		i++;
//		// question 57
//		questionsList[i] = "My Other Best Friend's (Who Is Gay) Name Is?";
//		answersList[i][0] = "Brian";
//		answersList[i][1] = "Brendan";
//		answersList[i][2] = "Bruce";
//		answersList[i][3] = "Bill";
//		correctAnswer[i] = "Brendan";
//		i++;
//		// question 58
//		questionsList[i] = "This Morning [Monday 13th February], What Happened When We Woke?";
//		answersList[i][0] = "We Did It";
//		answersList[i][1] = "I Freaked Out";
//		answersList[i][2] = "I Again Kicked The Sheets Off The Bed";
//		answersList[i][3] = "You Asked Me To Read My Phone";
//		correctAnswer[i] = "I Freaked Out";
//		i++;
//		// question 59
//		questionsList[i] = "Do You Like To Walk Long Distances In High Heels?";
//		answersList[i][0] = "Absolutely";
//		answersList[i][1] = "Are You Fucking Kidding Me";
//		answersList[i][2] = "Only If The Walk Is More Than 3 Miles";
//		answersList[i][3] = "Only At Night";
//		correctAnswer[i] = "Are You Fucking Kidding Me";
//		i++;
//		// question 60
//		questionsList[i] = "Phonetically, I Think You Pronounce My Name Like....";
//		answersList[i][0] = "Merk";
//		answersList[i][1] = "Maurk";
//		answersList[i][2] = "Mork";
//		answersList[i][3] = "Murk";
//		correctAnswer[i] = "Maurk";
//		i++;
//		// question 61
//		questionsList[i] = "What One Thing About You Does Caitriona Say Over And Over To Me?";
//		answersList[i][0] = "Mark, Make Me A Sandwich";
//		answersList[i][1] = "Mark Is In A Bad Mood Today";
//		answersList[i][2] = "Marrrrkkk....Don't You Love Me";
//		answersList[i][3] = "Hey Honey Bunny";
//		correctAnswer[i] = "Mark, Make Me A Sandwich";
//		i++;
//		// question 62
//		questionsList[i] = "The Night Before I Met You, I Saw Which Band?";
//		answersList[i][0] = "The Shins";
//		answersList[i][1] = "Jet";
//		answersList[i][2] = "We Were Promised Jetpacks";
//		answersList[i][3] = "Jimmy Eat World";
//		correctAnswer[i] = "Jimmy Eat World";
//		i++;
//		// question 63
//		questionsList[i] = "When Is Our Anniversary?";
//		answersList[i][0] = "2nd December";
//		answersList[i][1] = "Like Hell If I'd Know";
//		answersList[i][2] = "3rd Decemeber";
//		answersList[i][3] = "5th Decemeber";
//		correctAnswer[i] = "2nd December";
//		i++;
//		// question 64
//		questionsList[i] = "What Blood Type Am I?";
//		answersList[i][0] = "O";
//		answersList[i][1] = "A";
//		answersList[i][2] = "B";
//		answersList[i][3] = "Mark, You've No Idea Anyhow";
//		correctAnswer[i] = "Mark, You've No Idea Anyhow";
//		i++;
//		// question 65
//		questionsList[i] = "Knowing Me Now, What Would You Think Is The Answer Below?";
//		answersList[i][0] = "Correct Answer! Trust Me!";
//		answersList[i][1] = "You're Always Messing With Me";
//		answersList[i][2] = "Correct Answer! Trust Me!";
//		answersList[i][3] = "Correct Answer! Trust Me!";
//		correctAnswer[i] = "You're Always Messing With Me";
//		i++;
//		// question 66
//		questionsList[i] = "My Current Favourite Cereal?";
//		answersList[i][0] = "Frosted Shredded Wheat";
//		answersList[i][1] = "Rice Krispies";
//		answersList[i][2] = "Apple Zincs";
//		answersList[i][3] = "Lucky Charms";
//		correctAnswer[i] = "Frosted Shredded Wheat";
//		i++;
//		// question 67
//		questionsList[i] = "My Favourite Soda?";
//		answersList[i][0] = "Ginger Ale";
//		answersList[i][1] = "Fanta";
//		answersList[i][2] = "Coke";
//		answersList[i][3] = "Sprite";
//		correctAnswer[i] = "Fanta";
//		i++;
//		// question 68
//		questionsList[i] = "What Is The Best Thing To Mix With Orange Juice?";
//		answersList[i][0] = "Sprite";
//		answersList[i][1] = "Nerds";
//		answersList[i][2] = "Lime";
//		answersList[i][3] = "Water";
//		correctAnswer[i] = "Sprite";
//		i++;
//		// question 69
//		questionsList[i] = "What Phone Am I Waiting To Be Released Soon So I Can Buy?";
//		answersList[i][0] = "Galaxy Nexus";
//		answersList[i][1] = "Nexus Prime";
//		answersList[i][2] = "Galaxy S3";
//		answersList[i][3] = "Droid 4";
//		correctAnswer[i] = "Galaxy S3";
//		i++;
//		// question 70
//		questionsList[i] = "What Is Missing Over There....I Am Pointing To The Night Stand....";
//		answersList[i][0] = "your c....ck";
//		answersList[i][1] = "your C...ck";
//		answersList[i][2] = "your c..CK";
//		answersList[i][3] = "YOUR COCK!!!!";
//		correctAnswer[i] = "YOUR COCK!!!!";
//		i++;
//		// question 71
//		questionsList[i] = "Would My Parents Of Heard The Previous Answer?";
//		answersList[i][0] = "Maybe";
//		answersList[i][1] = "No";
//		answersList[i][2] = "I Think So";
//		answersList[i][3] = "Yes! Even If They Were In Ireland Too";
//		correctAnswer[i] = "Yes! Even If They Were In Ireland Too";
//		i++;
//		// question 72
//		questionsList[i] = "What Make Is My Personal Laptop?";
//		answersList[i][0] = "HP";
//		answersList[i][1] = "Samsung";
//		answersList[i][2] = "Acer";
//		answersList[i][3] = "Dell";
//		correctAnswer[i] = "Acer";
//		i++;
//		// question 73
//		questionsList[i] = "What Did People Think I Had On My First Day At Work Here?";
//		answersList[i][0] = "A Cool Accent";
//		answersList[i][1] = "Swine Flu";
//		answersList[i][2] = "The Mumps";
//		answersList[i][3] = "A Great Sense Of Fashion";
//		correctAnswer[i] = "Swine Flu";
//		i++;
//		// question 74
//		questionsList[i] = "At My Communion, What Did I Do When Recieving The Body Of Christ?";
//		answersList[i][0] = "Bent Over";
//		answersList[i][1] = "Kneeled Down";
//		answersList[i][2] = "Saluted The Priest";
//		answersList[i][3] = "Gave A Thumbs Up";
//		correctAnswer[i] = "Saluted The Priest";
//		i++;
//		// question 75
//		questionsList[i] = "What Did We Have For Dinner Last Night (13th Feb)?";
//		answersList[i][0] = "Chicken Stir Fry";
//		answersList[i][1] = "Steak, Fries And Pasta";
//		answersList[i][2] = "Pizza";
//		answersList[i][3] = "Sandwiches";
//		correctAnswer[i] = "Steak, Fries And Pasta";
//		i++;
//		// question 76
//		questionsList[i] = "What Happened The Last Time I Was Hungry For Your...No-No Parts?";
//		answersList[i][0] = "You Turned Into A Beast";
//		answersList[i][1] = "We Made Very Loud Noises";
//		answersList[i][2] = "We Did It For 2 Hours";
//		answersList[i][3] = "Your Laptop Got Destroyed";
//		correctAnswer[i] = "Your Laptop Got Destroyed";
//		i++;
//		// question 77
//		questionsList[i] = "So, I Told You Last Night I Needed To Do Work, When Really I Was?";
//		answersList[i][0] = "Looking At Porn";
//		answersList[i][1] = "Coding This Very Application";
//		answersList[i][2] = "On Slickdeals";
//		answersList[i][3] = "Doing Work";
//		correctAnswer[i] = "Coding This Very Application";
//		i++;
//		// question 78
//		questionsList[i] = "What Yummy Food Are You Making Right Now After Dinner (13th Feb)?";
//		answersList[i][0] = "More Steak";
//		answersList[i][1] = "Popsicles";
//		answersList[i][2] = "Sherbet";
//		answersList[i][3] = "Cake";
//		correctAnswer[i] = "Sherbet";
//		i++;
//		// question 79
//		questionsList[i] = "What Do Door Arches Make Me Do?";
//		answersList[i][0] = "Make You Walk Through Them";
//		answersList[i][1] = "They Do Nothing To You";
//		answersList[i][2] = "Make You Dance Seductively";
//		answersList[i][3] = "Make You Nervous";
//		correctAnswer[i] = "Make You Dance Seductively";
//		i++;
//		// question 80
//		questionsList[i] = "So, Do I Really Love You Adriana?";
//		answersList[i][0] = "Yes! 100%";
//		answersList[i][1] = "Nope";
//		answersList[i][2] = "Yes!";
//		answersList[i][3] = "Yes! With Infinite Love!";
//		correctAnswer[i] = "Yes! With Infinite Love!";
//		i++;
//		// question 81
//		questionsList[i] = "Do I Think We'll 'Make It'?";
//		answersList[i][0] = "Depends...";
//		answersList[i][1] = "Probably Not";
//		answersList[i][2] = "You Hope So";
//		answersList[i][3] = "You Know So";
//		correctAnswer[i] = "You Know So";
//		i++;
//		// question 82
//		questionsList[i] = "Do I Think I Am The Luckiest Guy In The World?";
//		answersList[i][0] = "You're Not As Lucky As Zac Efron";
//		answersList[i][1] = "You're Pretty Lucky";
//		answersList[i][2] = "You Are The Luckiest Person Alive";
//		answersList[i][3] = "Luck? Hello! You Make Your Own Luck";
//		correctAnswer[i] = "You Are The Luckiest Person Alive";
//		i++;
//		// question 83
//		questionsList[i] = "Are You The Most Beautiful Girl On The Planet?";
//		answersList[i][0] = "I'm Not As Hot As Vanessa Hudgens";
//		answersList[i][1] = "Without Doubt, I'm The Hottest Girl Ever!";
//		answersList[i][2] = "I'm Kinda Hot";
//		answersList[i][3] = "Hot? Hello! You Are The Hot One Mark! Not Me.";
//		correctAnswer[i] = "Without Doubt, I'm The Hottest Girl Ever!";
//		i++;
//		// question 84
//		questionsList[i] = "Are You My Soulmate?";
//		answersList[i][0] = "Nope!";
//		answersList[i][1] = "I Don't Have A Soul";
//		answersList[i][2] = "Yes. We Are Destined Soulmates";
//		answersList[i][3] = "We Are Just Mates";
//		correctAnswer[i] = "Yes. We Are Destined Soulmates";
//		i++;
//		// question 85
//		questionsList[i] = "How Long Do I Think I Will Be Together With You And Happy In Love With You?";
//		answersList[i][0] = "a";
//		answersList[i][1] = "b";
//		answersList[i][2] = "Forever";
//		answersList[i][3] = "d";
//		correctAnswer[i] = "Forever";
	}
}
