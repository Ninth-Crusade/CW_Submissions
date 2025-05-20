import java.util.Scanner;

public class Main {
	
	static Scanner gameReader = new Scanner (System.in);
	
	/*
	 * Main character's friends
	 */
	static Characters christian = new Characters ("Christian", "Shaft", 24, "detective", "6'2''", "Black");
	static Characters mia = new Characters ("Mia", "Woods", 25, "lawyer", "5'7''", "White");
	static Characters emmett = new Characters ("Emmett", "Shaft", 27, "lawyer", "5'10''", "Black");
	
	/*
	 * The Evergreens; antagonists
	 */
	static Characters dawn = new Characters ("Dawn", "Evergreen", 55, "receptionist", "5'8''", "Norwegian American");
	static Characters alastor = new Characters ("Alastor", "Evergreen", 56, "hotel owner", "6'1''", "Scottish");
	static Characters gabriel = new Characters ("Gabriel", "Evergreen", 30, "son of Evergreen", "5'11''", "Scottish-Norwegian");

	public static void main(String[] args) 
	{
		welcomeToGame();
		
		Characters protag = bookingInformation();
		
		introToHotel(protag);
	}
	
	/*
	 * The backstory of the game. I won't be putting this in my main yet, and it's just here for story reasons.
	 */
	public static void backStory()
	{
		System.out.println("You: Hi did you call an Uber?");
		System.out.println("????: Yeah, can you take me to the Phoenix Airport? And make it quick, my flight leaves in 45 minutes");
		System.out.println("1. Of course.");
		System.out.println("2. Well I kinda have to.");
		
		String takeToAirport = gameReader.next();
		
		if (takeToAirport.equals("1") || takeToAirport.equals("2"))
		{
			System.out.println("You: So why are you catching a flight outta here?");
			System.out.println("????: I'm gonna go see my parents.");
			System.out.println("You: Isn't that nice");
			System.out.println("????: Yeah yeah, can you stop asking questions and just drive?!");
			System.out.println("1. Okay sir.");
			System.out.println("2. You're an a**hole!");
			
			
			String okayAHole = gameReader.next();
			
			if (okayAHole.equals("1"))
			{
				System.out.println("You: Okay, sir. But you don't have to be rude.");
				System.out.println("????: CAN YOU JUST DRIVE?!!!");
			}
			
			else if (okayAHole.equals("2"))
			{
				System.out.println("You (to yourself): No, I can't say that to a customer. He's gonna give me a bad rating");
				System.out.println("You: Okay, sir. But you don't have to be rude.");
				System.out.println("????: CAN YOU JUST DRIVE?!!!");
			}
			
			System.out.println("All of a sudden, it starts downpouring, making it pretty dangeroud to drive faster. What will you do next?");
			System.out.println("1. Fine, I'll drive faster. REALLY FASTER.");
			System.out.println("2. I can't. The roads are too slippery");
			
			String driveFaster = gameReader.next();
			
			if (driveFaster.equals("1"))
			{
				System.out.println("So you speed your car up because this jagoff just can't miss his flight.");
				System.out.println("????: Jesus Christ! Are you crazy?!");
				System.out.println("You: What? Is this too fast for you?");
				System.out.println("Suddenly, your tires swivel and you crash into a median on the freeway...");
			}
			
			else if (driveFaster.equals("2"))
			{
				System.out.println("????: I swear to God, if I miss my flight I'm gonna get you fired!");
				System.out.println("Under the pressure of this angry customer, you cave in and speed up");
				System.out.println("Suddenly, your tires swivel and you crash into a median on the freeway...");
			}
			
			System.out.println();
			System.out.println("1 YEAR LATER");
			System.out.println("");
		}
	}
	
	/*
	 * Welcomes the player to the game, and introduces the setting of winning a free stay at a hotel
	 */
	public static void welcomeToGame()
	{	
		System.out.println("CONGRATULATIONS! You have won a FREE stay at the Evergreen Horizon Hotel in Cancun next month! You "
				+ "get to spend 5 days and 5 nights at one of the best reviewed ");
		System.out.println("hotels in the world! To book your FREE stay, enter this link:");
		System.out.println("https://evergreenhorizonfreestay.com (Type '1' to enter the link)");
	}
	
	/*
	 * Lets the player input their information into the "hotel website"
	 */
	public static Characters bookingInformation()
	{

		String userInput = gameReader.next();
		gameReader.nextLine();
		if (userInput.equals("1"))
		{
			System.out.println("Congratulations on winning a free stay at the Evergreen Horizon Hotel! To book your stay, type '1' to view BOOKING INFORMATION");
		}
		
		else 
		{
			System.out.println("Congratulations on winning a free stay at the Evergreen Horizon Hotel! To book your stay, type '1' to view BOOKING INFORMATION");
		}
		
		gameReader.next();
		if (userInput.equals("1"))
		{
			System.out.print("Book your stay at the Evergreen Horizon now! (Type 1 to input your information)");
		}
		
		else
		{
			System.out.print("Book your stay at the Evergreen Horizon now! (Type 1 to input your information)");
		}
		
		/*
		 * Customer's personal information
		 */
		System.out.println();
		gameReader.next();
		
		//Player puts their first name
		if (userInput.equals("1"))
		{
			System.out.print("First name of customer: ");
		}
		
		else 
		{
			System.out.print("First name of customer: ");
		}
		
		String userFirstName = gameReader.next();
		
		//Player puts their last name
		System.out.print("Last name of customer: ");
		String userLastName = gameReader.next();
		
		//Player puts their age
		System.out.print("Age of customer: ");	
		int userAge = gameReader.nextInt();
		
		//Forces the player to have the job of an Uber driver, which is important for the story
		System.out.println("Occupation of customer: Uber driver");
		
		//Player puts their height
		System.out.print("Height of customer: ");
		String userHeight = gameReader.next();
		
		//Player puts their ethnicity
		System.out.print("Ethnicity of customer: ");
		String userEthnicity = gameReader.next();
		gameReader.nextLine();
		
		Characters protag = new Characters (userFirstName, userLastName, userAge, "Uber driver", userHeight, userEthnicity);
		
		System.out.println();
		
		System.out.println("Type 1 to confirm this information");
		
		userInput = gameReader.next();
		if (userInput.equals("1"))
		{
			System.out.print("You have officially booked your free stay at the Evergreen Horizon! We'll see you in a month!");
			System.out.println(" (Type '1' to proceed)");
		}
		
		else
		{
			System.out.print("You have officially booked your free stay at the Evergreen Horizon! We'll see you in a month!");
			System.out.println(" (Type '1' to proceed) ");
		}
		
		return protag;
	}
	
	/*
	 * Player gets introduced to the hotel
	 */
	public static void introToHotel(Characters protag)
	{
		String userInput = gameReader.next();
		
		if (userInput.equals("1"))
		{
			System.out.println();
			System.out.println("1 MONTH LATER");
			System.out.println("Hotel Receptionist: Ah! You must be the lucky winner of our free stay sweepstakes! It is my pleasure to welcome you to the Evergreen Horizon! My name is " + dawn.getFirstName());
			System.out.println("CHOOSE NEXT DIALOGUE OPTION:");
			System.out.println("1. Get to know Dawn more");
			System.out.println("2. Where's my room?");
			
			String userInputTwo = gameReader.next();
			if (userInputTwo.equals("1"))
			{
				System.out.println("Hotel Receptionist: I've been a " + dawn.getJob() + " at this hotel for over 25 years, and I have remembered every guest who has stayed at the Evergreen Horizon.");
				System.out.println("CHOOSE NEXT DIALOGUE OPTION");
				System.out.println("1. That's really cool! Can I go to my room now?");
				
				String userInputThree = gameReader.next();
				if (userInputThree.equals("1"))
				{
					System.out.println(dawn.getFirstName() + ": Of course! One of the rewards for our free stay winner is getting the choice of which room to stay in! You have four rooms to choose from: ");
					System.out.println("1: Room 210");
					System.out.println("2: Room 405");
					System.out.println("3: Room 512");
					System.out.println("4: Room 915");
					
					String userInputFour = gameReader.next();
					if (userInputFour.equals("1"))
					{
						System.out.println(dawn.getFirstName() + ": Excellent choice! Here is your key to Room 210");
						System.out.println("Type '1' to go to your room)");
						secondFloor(protag);
					}
					
					else if (userInputFour.equals("2"))
					{
						System.out.println(dawn.getFirstName() + ": Excellent choice! Here is your key to Room 405");
						System.out.println("Type '1' to go to your room)");
						fourthFloor(protag);
					}
					
					else if (userInputFour.equals("3"))
					{
						System.out.println(dawn.getFirstName() + ": Excellent choice! Here is your key to Room 512");
						System.out.println("Type '1' to go to your room)");
					}
					
					else if (userInputFour.equals("4"))
					{
						System.out.println(dawn.getFirstName() + ": Excellent choice! Here is your key to Room 915");
						System.out.println("Type '1' to go to your room)");
					}
				}
			}
			
			else if (userInputTwo.equals("2"))
			{
				System.out.println("Hotel Receptionist: One of the rewards for our free stay winner is getting the choice of which room to stay in! You have four rooms to choose from:");
				System.out.println("1: Room 210");
				System.out.println("2: Room 405");
				System.out.println("3: Room 512");
				System.out.println("4: Room 915");
				
				String userInputFive = gameReader.next();
				if (userInputFive.equals("1"))
				{
					System.out.println("Hotel Receptionist: Excellent choice! Here is your key to Room 210");
					System.out.println("Type '1' to go to your room)");
					secondFloor(protag);
				}
				
				else if (userInputFive.equals("2"))
				{
					System.out.println("Hotel Receptionist: Excellent choice! Here is your key to Room 405");
					System.out.println("Type '1' to go to your room)");
					fourthFloor(protag);
				}
				
				else if (userInputFive.equals("3"))
				{
					System.out.println("Hotel Receptionist: Excellent choice! Here is your key to Room 512");
					System.out.println("Type '1' to go to your room)");
					fifthFloor(protag);
				}
				
				else if (userInputFive.equals("4"))
				{
					System.out.println("Hotel Receptionist: Excellent choice! Here is your key to Room 915");
					System.out.println("Type '1' to go to your room)");
					ninthFloor(protag);
				}
			}
		}
		
		else
		{
			introToHotel(protag);
		}
	}
	
	/*
	 * CODE FOR THE SECOND FLOOR
	 */
	public static void secondFloor(Characters protag)
	{
		String userInput = gameReader.next();
		
		Characters bellboy = new Characters ("Bellboy", "Nakamura", 30, "bellboy", "5'11''", "Japanese");
		
		if (userInput.equals("1"))
		{
			System.out.println("You arrive at Room 210 and unpack your belongings. All of a sudden, you hear a knock at the door. (Type '1' to answer it)");
			
			String userInputTwo = gameReader.next();
			
			if (userInputTwo.equals("1"));
			{
				System.out.println(bellboy.getFirstName() + ": Good afternoon! I'd like to inform you that there will be an all you can eat buffet at 7:00 tonight at our banquet hall right on this floor! We wish to see you there!");
				System.out.println("WHAT WILL YOU DO?");
				System.out.println("1. Go to the dinner");
				System.out.println("2. Just chill in your room for the night");
				
				String userInputThree = gameReader.next();
				{
					if (userInputThree.equals("1"))
					{
						System.out.println("You decide to go to the dinner at the banquet hall (Type '1' to proceed)");
						banquetHall(protag);
					}
					
					else if (userInputThree.equals("2"))
					{
						System.out.println("You decide to skip the dinner and stay in your room for the whole night. Except that's not what you do because you're an adventerous person who doesn't want to be boring, and wouldn't dare want Jayven to code even more than what he is coding already");
						System.out.println("Type '1' to go to the dinner");
						banquetHall(protag);
					}
				}
			}
		}
		
		else 
		{
			System.out.print("Just here to make sure there's an else statement");
		}
	}
	
	public static void banquetHall(Characters protag)
	{
		boolean poison = false;
		
		String userInputBanquet = gameReader.next();
		
		if (userInputBanquet.equals("1"))
		{
			System.out.println("You see so much great food lying in front of you.");
			System.out.println("WHICH ONE DO YOU WANT TO EAT?");
			System.out.println("1. Steak");
			System.out.println("2. Chicken");
			System.out.println("3. Pork");
			
			String userInputFood = gameReader.next();
			
			if (userInputFood.equals("1"))
			{
				poison = true;
				System.out.println("You grab some steak and make your way to a table, when all of a sudden...(Type '1' to proceed)");
				christianIntro(protag);
			}
			
			else if (userInputFood.equals("2"))
			{
				System.out.println("You grab some chicken and make your way to a table, when all of a sudden...(Type '1' to proceed)");
				christianIntro(protag);
			}
			
			else if (userInputFood.equals("3"))
			{
				System.out.println("You grab some pork and make your way to a table, when all of a sudden...(Type '1' to proceed)");
				christianIntro(protag);
			}
		}
	}
	
	public static void christianIntro(Characters protag)
	{	
		String christianEnters = gameReader.next();
		
		if (christianEnters.equals("1"))
		{
			System.out.println("????: Hey! You dropped this!");
			System.out.println("You: Who said that? (Type '1' to find out)");
			
			String userInputHuh = gameReader.next();
			
			if (userInputHuh.equals("1"))
			{
				System.out.println("????: Your wallet. It fell out of your pocket just now.");
				System.out.println("You: Oh, thank you, uh...");
				System.out.println("1. What's your name?");
				
				String findOutChristianName = gameReader.next();
				
				if (findOutChristianName.equals("1"))
				{
					System.out.println(christian.getFirstName() + ": I'm " + christian.getFirstName());
					System.out.println("CHOOSE NEXT DIALOGUE OPTION");
					System.out.println("1. Thanks " + christian.getFirstName() + ", I'm " + protag.getFirstName() + ". (Type '1' to proceed)");
					
					String comeSitWithUs = gameReader.next();
					
					if (comeSitWithUs.equals("1"))
					{
						System.out.println(christian.getFirstName() + ": Do you wanna come sit with me? There doesn't seem to be any open seats left.");
						System.out.println("CHOOSE NEXT DIALOGUE OPTION");
						System.out.println("1. Yes, " + christian.getFirstName());
						System.out.println("2. Definitely, " + christian.getFirstName());
						System.out.println("3. Absolutely, " + christian.getFirstName());
						
						String forcedToSayYes = gameReader.next();
						
						if (forcedToSayYes.equals("1"))
						{
							System.out.println("You decide to go sit with " + christian.getFirstName() + " on your own volition. (Type '1' to go sit at his table)");
							lawyersIntro(protag);
						}
						
						else if (forcedToSayYes.equals("2"))
						{
							System.out.println("You decide to go sit with " + christian.getFirstName() + " on your own volition. (Type '1' to go sit at his table)");
							lawyersIntro(protag);
						}
						
						else if (forcedToSayYes.equals("3"))
						{
							System.out.println("You decide to go sit with " + christian.getFirstName() + " on your own volition. (Type '1' to go sit at his table)");
							lawyersIntro(protag);
						}
					}
				}
			}
		}
	}
	
	public static void lawyersIntro(Characters protag)
	{
		String sitAtTable = gameReader.next();
		
		if (sitAtTable.equals("1"))
		{
			System.out.println("You make it to Christian's table and see another man and a woman");
			System.out.println(christian.getFirstName() + ": " + protag.getFirstName() + ", this is my brother, " + emmett.getFirstName() + ", and his fiance, " + mia.getFirstName() + ". Guys, this is " + protag.getFirstName() + " who's gonna be sitting with us.");
			System.out.println("CHOOSE NEXT DIALOGUE OPTION");
			System.out.println("1. Nice to meet you guys");
			
			String meetTheShafts = gameReader.next();
			
			if (meetTheShafts.equals("1"))
			{
				System.out.println(mia.getFirstName() + ": Nice to meet you too, " + protag.getFirstName());
				System.out.println(emmett.getFirstName() + ": Excuse me for asking, but have we met before?");
				System.out.println("CHOOSE NEXT DIALOGUE OPTION");
				System.out.println("1. No, I don't think so");
				System.out.println("2. Maybe we have");
				
				String neverMetBefore = gameReader.next();
				
				if (neverMetBefore.equals("1"))
				{
					System.out.println(emmett.getFirstName() + ": It's just that you look really familiar.");
					System.out.println(mia.getFirstName() + ": Please excuse " + emmett.getFirstName() + ". He and I are very hardworking " + emmett.getJob() + "s and he deserves a break, not to mention " + christian.getFirstName() + "'s work as a detective. That's why we're on this vacation. It's so amazing that we won this free stay.");
					getToKnowThem(protag);
				}
				
				else if (neverMetBefore.equals("2"))
				{
					System.out.println(emmett.getFirstName() + ": It's just that you look really familiar.");
					System.out.println(mia.getFirstName() + ": Please excuse " + emmett.getFirstName() + ". He and I are very hardworking " + emmett.getJob() + "s and he deserves a break, not to mention " + christian.getFirstName() + "'s work as a detective. That's why we're on this vacation. It's so amazing that we won this free stay.");
					getToKnowThem(protag);
				}
				
			}
			
		}
	}
	
	public static void getToKnowThem(Characters protag)
	{	
		System.out.println("CHOOSE NEXT DIALOGUE OPTION");
		System.out.println("1. Wait. You won a free stay? So did I!");
		
		String freeStayAlso = gameReader.next();
		
		if (freeStayAlso.equals("1"))
		{
			System.out.println(mia.getFirstName() + ": Really?!");
			System.out.println(christian.getFirstName() + ": The three of us won it from the hotel's sweepstakes? You won, too?");
			System.out.println(emmett.getFirstName() + ": Yeah, isn't that weird...suddenly, someone interrupts the conversation (Type '1' to find out who)");
			
			String dawnInterrupts = gameReader.next();
			
			if (dawnInterrupts.equals("1"))
			{
				System.out.println(dawn.getFirstName() + ": Actually, Mr. " + emmett.getLastName() + ", our sweepstakes offered 10 rewards for a free stay. You, your fiance, and your brother just so happened to befriend another one of the seven.");
				System.out.println(emmett.getFirstName() + ": Oh, you're the receptionist who checked us in. You remember my name?");
				System.out.println(dawn.getFirstName() + ": Of course! As a " + dawn.getJob() + " of this hotel for 25 years, as well as a waitress for this banquet hall, I have learned to study each and every one of our guests. Especially those who won our sweepstakes! You, Mr.");
				System.out.println(emmett.getFirstName() + " " + emmett.getLastName() + "are a " + emmett.getAge() + " year old " + emmett.getJob() + " who's engaged to Ms. " + mia.getFirstName() + " " + mia.getLastName() + " who is also a lawyer, and who you started your firm with.");
				System.out.println("Your brother here, " + christian.getFirstName() + ", is a " + christian.getJob() + " and the best one in his precinct. And you, " + protag.getFirstName() + " " + protag.getLastName() + " are a " + protag.getJob() + ". ");
				
				System.out.println("CHOOSE NEXT DIALOGUE OPTION");
				System.out.println("1. Wow, you really are good at your job");
				System.out.println("2. Are you a stalker, Dawn?");
				
				String dawnIsStalker = gameReader.next();
				
				if (dawnIsStalker.equals("1"))
				{
					System.out.println(dawn.getFirstName() + ": Thank you, " + protag.getFirstName() + ". Now please look towards the front, Mr. " + alastor.getLastName() + " will be giving a welcoming speech.");
					System.out.println("WHAT WILL YOU DO?");
					System.out.println("1. Listen to the speech");
					System.out.println("2. Tune it out");
					alastorSpeech(protag);
				}
				
				else if (dawnIsStalker.equals("2"))
				{
					System.out.println(dawn.getFirstName() + ": I assure you that I am just a very experienced worker at this hotel. Now please look towards the front, Mr. " + alastor.getLastName() + " will be giving a welcoming speech.");
					System.out.println("WHAT WILL YOU DO?");
					System.out.println("1. Listen to the speech");
					System.out.println("2. Tune it out");
					alastorSpeech(protag);
				}
			}
			
		}
	}
	
	public static void alastorSpeech(Characters protag)
	{
		String theSpeech = gameReader.next();
		
		if (theSpeech.equals("1"))
		{
			System.out.println("You listen to Mr. " + alastor.getLastName() + "'s speech");
			System.out.println(alastor.getLastName() + ": My name is " + alastor.getFirstName() + " " + alastor.getLastName() + ", owner of the Evergreen Horizon, and it is an honor to welcome all of you to the hotel that I started 25 years ago. "
					+ "This banquet hall is lucky to nourish such wonderful guests all year round. To those of you who are in the middle of your stay here at the Evergreen, I hope you have enjoyed everything that this hotel has had to offer so "
					+ "far. And to those of you who are just starting your stay, we hope that this will be one of the most memorable experiences of your lives. Enjoy your food.");
			System.out.println("You scarf down your food. What did you think of it?");
			System.out.println("1. It was great!");
			System.out.println("2. It was okay, I guess. Definitely not one of the most 'memorable experiences of my life'");
			System.out.println("3. It was straight doodoo");
			
			String foodReview = gameReader.next();
			
			if (foodReview.equals("1"))
			{
				System.out.println("You go back to your room a happy and satisfied guest and go to sleep");
			}
			
			else if (foodReview.equals("2"))
			{
				System.out.println("You go back to your room as an underwhelmed guest and go to sleep wishing for a better dinner");
			}
			
			else if (foodReview.equals("3"))
			{
				System.out.println("You go back to your room as a very upset and disgusted customer. You go to sleep wishing for a meal that was edible");
			}
			
			emmettDiesNextMorning(protag);
		}
		
		else if (theSpeech.equals("2"))
		{
			System.out.println("You tune out the speech and don't listen to a word that Mr. " + alastor.getLastName() + " says. You only hear the last part, 'enjoy your food.' Will you enjoy your food?");
			
			System.out.println("1. Yes, I'm going to scarf it down");
			System.out.println("2. I'll still scarf it down, but feel guilty for being rude and tuning out Mr. Evergreen's speech");
			String scarfDown = gameReader.next();
			
			if (scarfDown.equals("1") || scarfDown.equals("2"))
			{
				System.out.println("You scarf down your food. What did you think of it?");
				System.out.println("1. It was great!");
				System.out.println("2. It was okay, I guess. Definitely not one of the most 'memorable experiences of my life'");
				System.out.println("3. It was straight doodoo");
				
				String foodReview = gameReader.next();
				
				if (foodReview.equals("1"))
				{
					System.out.println("You go back to your room a happy and satisfied guest and go to sleep");
				}
				
				else if (foodReview.equals("2"))
				{
					System.out.println("You go back to your room as an underwhelmed guest and go to sleep wishing for a better dinner");
				}
				
				else if (foodReview.equals("3"))
				{
					System.out.println("You go back to your room as a very upset and disgusted customer. You go to sleep wishing for a meal that was edible");
				}
				
				emmettDiesNextMorning(protag);
			}
		}
	}
		
	public static void emmettDiesNextMorning(Characters protag)
	{		
		System.out.println("Type 1 to move on to the next day");
		
		String wakeUp = gameReader.next();
		
		if (wakeUp.equals("1"))
		{
			System.out.println("You wake up and decide to go to the lobby to check out the hotel. You get out of the elevator and see...(Type '1' to reveal)");
			
			String theReveal = gameReader.next();
			
			if (theReveal.equals("1"))
			{
				System.out.println("Police scattered throughout the lobby, trying to calm down panicked guests.");
				System.out.println("By the waiting area, you see " + mia.getFirstName() + " crying her eyes out, and " + christian.getFirstName() + " is comforting her");
				System.out.println("At the reception table, you see police questioning Mr. " + alastor.getLastName() + " and " + dawn.getFirstName());
				System.out.println("WHO DO YOU GO TO IN ORDER TO FIND OUT WHAT'S GOING ON?");
				System.out.println("1. " + mia.getFirstName() + " and " + christian.getFirstName());
				System.out.println("2. " + alastor.getLastName() + " and " + dawn.getFirstName());
				
				String whoToAsk = gameReader.next();
				
				if (whoToAsk.equals("1"))
				{
					System.out.println("You go over to " + mia.getFirstName() + " and " + christian.getFirstName() + ".");
					
					System.out.println("CHOOSE NEXT DIALOGUE OPTION");
					System.out.println("1: Why are you crying, " + mia.getFirstName());
					System.out.println("2: What's going on guys? Why are the police here?");
					
					String theRevelation = gameReader.next();
					
					if (theRevelation.equals("1"))
					{
						System.out.println(christian.getFirstName() + ": It's " + emmett.getFirstName() + ". He's dead.");
					}
					
					else if (theRevelation.equals("2"))
					{
						System.out.println(christian.getFirstName() + ": It's " + emmett.getFirstName() + ". He's dead.");
					}
					
					yourCondolences(protag);
				}
				
				else if (whoToAsk.equals("2"))
				{
					System.out.println("You go over to " + alastor.getLastName() + " and " + dawn.getFirstName() + ".");
					System.out.println("You: Excuse me, Mr. Evergreen. What's going on here? (Type '1' to find out");
					
					String theRevelationAlt = gameReader.next();
					{
						if (theRevelationAlt.equals("1"))
						{
							System.out.println(alastor.getLastName() + ": I hate to alarm you, but a guest was found dead this morning.");
							System.out.println("1. That's terrible!");
							System.out.println("2. What happened?");
							
							String youJustFoundOut = gameReader.next();
							
							if (youJustFoundOut.equals("1"))
							{
								System.out.println(dawn.getFirstName() + ": " + protag.getFirstName() + ", it was " + emmett.getFirstName() + " " + 
							emmett.getLastName() + " who died. One of the men you were sitting with last night at the banquet. I think you should go "
									+ "check on his brother and fiance, they're over there in the waiting area.");
								
								System.out.println("Type '1' to go check on Mia and Christian");
								
								String checkingOnThem = gameReader.next();
								
								if (checkingOnThem.equals("1"))
								{
									yourCondolences(protag);								
								}
							}
							
							else if (youJustFoundOut.equals("2"))
							{
								System.out.println(alastor.getLastName() + ": It would be inappropriate for me to share the details.");
								System.out.println(dawn.getFirstName() + ": " + protag.getFirstName() + ", it was " + emmett.getFirstName() + " " + 
								emmett.getLastName() + " who died. One of the men you were sitting with last night at the banquet. I think you should go "
										+ "check on his brother and fiance, they're over there in the waiting area.");
								
								System.out.println("Type '1' to go check on Mia and Christian");
								
								String checkingOnThem = gameReader.next();
								
								if (checkingOnThem.equals("1"))
								{
									yourCondolences(protag);
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static void yourCondolences(Characters protag)
	{
		System.out.println("You: Oh my god. Guys, I'm so sorry.");
		System.out.println("1. (Whisper to Christian) What happened? If you don't mind me asking.");
		System.out.println("2. No, I shouldn't say anything right now.");
		
		String shouldYouPush = gameReader.next();
		
		if (shouldYouPush.equals("1"))
		{
			System.out.println(christian.getFirstName() + ": Let's get away from " + mia.getFirstName() + ". She doesn't need to hear this.");
			
			System.out.println(christian.getFirstName() + ": Mia woke up and found him dead in the bathroom. He was on the floor with blood coming out of his eyes.");
			
			System.out.println("CHOOSE NEXT DIALOGUE OPTION");
			System.out.println("1. What do you think happened?");
			System.out.println("2. That's strange and suspicious");
			
			String christianTheory = gameReader.next();
			
			if (christianTheory.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": I covered a similar homicide like this back in San Diego, on a former cartel member. A death like "
						+ "this can only happen by one thing, "
						+ "venom from a panther rattlesnake, only found here in Mexico. " + emmett.getFirstName() + " never got bit by one of those snakes, so "
								+ "there might be foul play. Someone could've poisoned him.");
			}
			
			else if (christianTheory.equals("2"))
			{
				System.out.println(christian.getFirstName() + ": I covered a similar homicide back in Detroit. A death like this can only happen by one thing, "
						+ "venom from a panther rattlesnake, only found here in Mexico. " + emmett.getFirstName() + " never got bit by one of those snakes, so "
								+ "there might be foul play. Someone could've poisoned him.");
			}
			
			System.out.println("He's sent a lot of dangerous criminals to prison, so he has a lot of people who'd want him dead. " + protag.getFirstName() + ", " + 
			mia.getFirstName() + " can't help me right now because of the state she's in. Can you please help me find out who killed my brother?");
			
			System.out.println("1. Help " + christian.getFirstName() + " find the killer");
			System.out.println("2. No, that's crazy. I'm just an Uber driver");
			willYouHelpChristian(protag);
		}
		
		else if (shouldYouPush.equals("2"))
		{
			System.out.println("Good job. You did the morally right thing and didn't ask the grieving loved ones of Emmett—who you just met "
					+ "last night—about the details of his death. Congratulations on reading the room.");
			
			System.out.println("Officer: Excuse me, are you the brother and fiance of the deceased man?");
			System.out.println(christian.getFirstName() + ": Yes, we are.");
			System.out.println("Officer: We investigated the crime scene and found traces of panther rattlesnake venom in " + emmett.getFirstName() + "'s blood and we think there's foul play. Mr. " + christian.getLastName() + ", "
					+ "I know that you're a " + christian.getJob() + ", so I'd like to ask if you want to help investigate this case? I understand if you want to grieve.");
			System.out.println(christian.getFirstName() + ": No, I need to find out who did this. " + protag.getFirstName() + ", Mia can't help me because of the state she's in right now. Can you help me?");
			System.out.println("1. Help " + christian.getFirstName() + " find the killer");
			System.out.println("2. No, that's crazy. I'm just an Uber driver");
			willYouHelpChristian(protag);
		}
	}
	
	public static void willYouHelpChristian(Characters protag)
	{
		String helpOrNot = gameReader.next();
		
		if (helpOrNot.equals("1"))
		{
			System.out.println(christian.getFirstName() + ": Thank you " + protag.getFirstName() + ", I don't know how I can repay you.");
			System.out.println("1: Where do we start?");
			
			String willHelp = gameReader.next();
			
			if (willHelp.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": The rest of the cops are still looking at the crime scene, but since " + emmett.getFirstName() + " was poisoned, "
						+ "we need to go look in the banquet hall for clues. ");
				System.out.println("You: Why?");
				System.out.println(christian.getFirstName() + ": Because he was poisoned by one of the foods there.");
				System.out.println("You: How do you know that?");
				System.out.println(christian.getFirstName() + ": If you ingest panther rattlesnake venom, it kills you five hours later. The dinner last night was at 7:00, and the cops "
						+ "gave me Emmett's death report, he died around 12 AM. Which means the food he ate was spiked with the venom, so we need to investigate the banquet hall.");
				System.out.println("1. Alright, let's go.");
				
				String goToHall = gameReader.next();
				
				if (goToHall.equals("1"))
				{
					System.out.println("You and " + christian.getFirstName() + " get to the banquet hall and investigate the table you guys sat at last night.");
					System.out.println("You spot something on the tablecloth, a red spot! And it's right in front of the chair that Emmett was sitting at last night! What is it?");
					System.out.println("1. Blood!");
					System.out.println("2. Ketchup");
				}
				bloodStainIfHelp(protag);
			}
		}
		
		else if (helpOrNot.equals("2"))
		{
			System.out.println(christian.getFirstName() + ": I understand. I know it's a lot for me to ask a civilian to aid me in an investigation. Just please stay safe.");
			System.out.println("1: Thank you, good luck");
			
			String willNotHelp = gameReader.next();
			
			if (willNotHelp.equals("1"))
			{
				System.out.println("You decide not to help Christian, and to cool off and get away from the chaos, you decide to go to the banquet hall and get some breakfast.");
				System.out.println("WHAT WILL YOU GET?");
				System.out.println("1. Bacon and eggs");
				System.out.println("2. Breakfast burrito");
				System.out.println("3. Pancakes");
			}
			
			breakfastFood(protag);
		}
	}
	
	public static void bloodStainIfHelp(Characters protag)
	{
		String thisIsBlood = gameReader.next();
		
		if (thisIsBlood.equals("1"))
		{
			System.out.println("You: Oh my god, that's Emmett's blood!");
			System.out.println(dawn.getFirstName() + ": Actually, " + protag.getFirstName() + ", it's not blood at all. That's the ketchup we used at last night's banquet.");
			System.out.println("You almost jump out of your seat when " + dawn.getFirstName() + " seemed to have appeared out of nowhere to tell you about the ketchup stain.");
			System.out.println("DO YOU BELIEVE DAWN?");
			System.out.println("1. Yes, I believe her. It really is ketchup");
			System.out.println("2. No, she's acting suspicious");
			
			String dawnSuspicious = gameReader.next();
			
			if (dawnSuspicious.equals("1"))
			{
				System.out.println("You: You're right " + dawn.getFirstName() + ". Sorry, I'm just really anxious from the situation.");
				System.out.println(dawn.getFirstName() + ": It's alright, " + protag.getFirstName() + ". Now if you'll excuse me, I'm going to make sure the other guests are doing okay.");
				System.out.println(christian.getFirstName() + ": That " + dawn.getJob() + " lady's been acting weird this whole time."); 
				System.out.println("You: Wh-why? What makes " + dawn.getFirstName() + " suspicious?");
				System.out.println("Last night, she came out of nowhere when we questioned us winning our free stays, "
						+ "and now she comes in and immediately shoots down your theory about the stain. We need to find out more about her.");
				System.out.println("You: How?");
				System.out.println(christian.getFirstName() + ": We need to look at the computer she uses at the front desk. (Type '1' to look for Dawn's computer)");
				hackDawnsComputer(protag);
			}
			
			else if (dawnSuspicious.equals("2"))
			{
				System.out.println("You: You're right " + dawn.getFirstName() + ". Sorry, I'm just really anxious from the situation.");
				System.out.println(dawn.getFirstName() + ": It's alright, " + protag.getFirstName() + ". Now if you'll excuse me, I'm going to make sure the other guests are doing okay.");
				System.out.println(christian.getFirstName() + ": That " + dawn.getJob() + " lady's been acting weird this whole time."); 
				System.out.println("You: Wh-why? What makes " + dawn.getFirstName() + " suspicious?");
				System.out.println("Last night, she came out of nowhere when we questioned us winning our free stays, "
						+ "and now she comes in and immediately shoots down your theory about the stain. We need to find out more about her.");
				System.out.println("You: How?");
				System.out.println(christian.getFirstName() + ": We need to look at the computer she uses at the front desk. (Type '1' to look for Dawn's computer)");
				hackDawnsComputer(protag);
			}
		}
		
		else if (thisIsBlood.equals("2"))
		{
			System.out.println("You: It's just ketchup, I don't need to think anything else about it.");
			System.out.println(christian.getFirstName() + ": You DO need to think something else about it!");
			System.out.println("You: What? Why? This stain right here is just ketchup, right?");
			System.out.println(christian.getFirstName() + ": No, ketchup doesn't stain that darkly, and it's in front of the chair that "
					+ "Emmett was sitting at last night. We need to find out more.");
			System.out.println("You: Okay, where?");
			System.out.println(christian.getFirstName() + ": That " + dawn.getJob() + " lady's computer. I think she knows more about Emmett's death.");
			System.out.println("Wait, you think that " + dawn.getFirstName() + " is acting suspicious? Why?");
			System.out.println(christian.getFirstName() + ": Okay, the truth is that I found this stain earlier and told one of the other cops about it. But that " + dawn.getJob()  
			+ " overheard me and immediately shot down my theory. Pretty suspicious, right?");
			System.out.println("You: Yeah okay, it is. So we need to look at her computer right?");
			System.out.println(christian.getFirstName() + ": Yes, it could have some important info on it. (Type '1' to look for Dawn's computer)");
			hackDawnsComputer(protag);
		}
		
	}
	
	public static void breakfastFood(Characters protag)
	{
		String breakfastChoice = gameReader.next();
		
		if (breakfastChoice.equals("1"))
		{
			System.out.println("You get some bacon and eggs and sit at Table 14, "
					+ "the same table you sat at last night, and then you notice something on the tablecloth, "
					+ "a red stain. And it's in front of the chair that Emmett was sitting at.");
		}
		
		else if (breakfastChoice.equals("2"))
		{
			System.out.println("You get a breakfast burrito and sit at Table 14, the same table you sat at last night, and then you notice something on the tablecloth. "
					+ "A red stain. And it's in front of the chair that Emmett was sitting at.");
		}
		
		else if (breakfastChoice.equals("3"))
		{
			System.out.println("You get some pancakes and sit at Table 14, the same table you sat at last night, and then you notice something on the tablecloth. "
					+ "A red stain. And it's in front of the chair that Emmett was sitting at.");
		}
		
		System.out.println("WHAT IS IT?");
		System.out.println("1. Blood!");
		System.out.println("2. Ketchup");
		bloodStainIfNotHelp(protag);
	}
	
	public static void bloodStainIfNotHelp(Characters protag)
	{
		String redStain = gameReader.next();
		
		if (redStain.equals("1"))
		{
			System.out.println("You: Oh my god, that's Emmett's blood!");
			System.out.println(dawn.getFirstName() + ": Actually, " + protag.getFirstName() + ", it's not blood at all. That's the ketchup we used at last night's banquet.");
			System.out.println("You almost jump out of your seat when " + dawn.getFirstName() + " seemed to have appeared out of nowhere to tell you about the ketchup stain.");
			System.out.println("DO YOU BELIEVE DAWN?");
			System.out.println("1. Yes, I believe her. It really is ketchup");
			System.out.println("2. No, she's acting suspicious");
			
			String dawnSuspicious = gameReader.next();
			
			if (dawnSuspicious.equals("1"))
			{
				System.out.println("You: You're right " + dawn.getFirstName() + ". Sorry, I'm just really anxious from the situation.");
				System.out.println(dawn.getFirstName() + ": It's alright, " + protag.getFirstName() + ". Now if you'll excuse me, I'm going to make sure the other guests are doing okay.");
				System.out.println("????: That " + dawn.getJob() + " lady's been acting weird this whole time."); 
				System.out.println("You: Christian? I thought you went to go investigate the crime scene?");
				System.out.println(christian.getFirstName() + ": I did, but since my brother was killed by ingesting panther rattlesnake venom, I'm here to look for clues.");
				System.out.println("You: Oh okay. But why is " + dawn.getFirstName() + " suspicious?");
				System.out.println("Last night, she came out of nowhere when we questioned us winning our free stays, "
						+ "and now she comes in and immediately shoots down your theory about the stain. We need to find out more about her.");
				System.out.println("You: How?");
				System.out.println(christian.getFirstName() + ": We need to look at the computer she uses at the front desk. Sorry, " + protag.getFirstName() + ". I know you "
						+ "didn't want anything to do with this investigation, but you somehow found your way into it.");
				System.out.println("You: It's okay, " + christian.getFirstName() + ". I'm fine with this. (Type '1' to look for Dawn's computer)");
				hackDawnsComputer(protag);
			}
			
			else if (dawnSuspicious.equals("2"))
			{
				System.out.println("You believe that " + dawn.getFirstName() + " is acting suspicious, but you hide that feeling from your face as you tell her, ");
				System.out.println("You: You're right " + dawn.getFirstName() + ". Sorry, I'm just really anxious from the situation");
				System.out.println(dawn.getFirstName() + ": It's alright, " + protag.getFirstName() + ". Now if you'll excuse me, I'm going to make sure the other guests are doing okay.");
				System.out.println("????: That " + dawn.getJob() + " lady's been acting weird this whole time."); 
				System.out.println("You: Christian? I thought you went to go investigate the crime scene?");
				System.out.println(christian.getFirstName() + ": I did, but since my brother was killed by ingesting panther rattlesnake venom, I'm here to look for clues.");
				System.out.println("You: Oh okay. But yeah, " + dawn.getFirstName() + " is suspicious.");
				System.out.println("Exactly. Last night, she came out of nowhere when we questioned us winning our free stays, "
						+ "and now she comes in and immediately shoots down your theory about the stain. We need to find out more about her.");
				System.out.println("You: How?");
				System.out.println(christian.getFirstName() + ": We need to look at the computer she uses at the front desk. Sorry, " + protag.getFirstName() + ". I know you "
						+ "didn't want anything to do with this investigation, but you somehow found your way into it.");
				System.out.println("You: It's okay, " + christian.getFirstName() + ". I'm fine with this. (Type '1' to look for Dawn's computer)");
				hackDawnsComputer(protag);
			}
		}
		
		else if (redStain.equals("2"))
		{
			System.out.println("You: It's just ketchup, I don't need to think anything else about it.");
			System.out.println("????: You DO need to think something else about it!");
			System.out.println("1. Who's that?");
			
			String whoIsTalking = gameReader.next();
			
			if (whoIsTalking.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": I said that you do need to think something else about it.");
				System.out.println("You: " + christian.getFirstName() + "? What are you doing here? Shouldn't you be investigating the crime scene?");
				System.out.println(christian.getFirstName() + ": I was, but since my brother was killed by ingesting panther rattlesnake venom, I'm here to "
						+ "look for any clues. This was the only place where he ate any food, after all.");
				System.out.println("You: Oh, okay. But this stain right here, it is important?");
				System.out.println(christian.getFirstName() + ": Absolutely. Ketchup doesn't stain that darkly and it's in front of the chair that "
						+ "Emmett was sitting at last night. We need to find out more.");
				System.out.println("You: Wait 'we?' I thought you were fine with me not getting involved in this?");
				System.out.println(christian.getFirstName() + ": I know I was. But you're the only other person here I trust who knows about this bloodstain.");
				System.out.println("You: What do you mean I'm the only other person you trust?");
				System.out.println(christian.getFirstName() + ": I found this stain earlier and told one of the other cops about it. But that " + dawn.getJob() + " lady, " + dawn.getFirstName() 
				+ ", overheard me and immediately shot down my theory. Pretty suspicious, right?");
				System.out.println("You: Yeah, it is. Alright, I'll do it. I'll help you, for " + emmett.getFirstName() + ". But where do we start?");
				System.out.println(christian.getFirstName() + ": We need to look at the front desk computer that " + dawn.getFirstName() + " uses. It could have some important info on it. (Type '1' to look for Dawn's computer)");
				hackDawnsComputer(protag);
			}
		}
	}
	
	public static void hackDawnsComputer(Characters protag)
	{
		String goToComputer = gameReader.next();
		
		if (goToComputer.equals("1"))
		{
			System.out.println("You and " + christian.getFirstName() + " sneak to the front desk while no one is looking and find " + dawn.getFirstName() + "'s computer, but you need a password to get in.");
			System.out.println("1. How are we supposed to get in?");
			System.out.println("2. Well, it was worth a shot");
			
			String decideToHack = gameReader.next();
			
			if (decideToHack.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": Don't worry, I got a plan.");
			}
			
			else if (decideToHack.equals("2"))
			{
				System.out.println(christian.getFirstName() + ": C'mon don't have that attitude, " + protag.getFirstName() + ". I've got a plan");
			}
			
			System.out.println("You: What is it?");
			System.out.println(christian.getFirstName() + ": A few months back in San Diego, my precinct was hit by a cyber attack. So in order to fight the hacker, we brought in a hacker ourselves. The guy was so good "
					+ "that he ended up working for us, and he's shown me some stuff.");
			System.out.println(christian.getFirstName() + " started pressing some keys and then a black screen with white text appeared on the computer.");
			System.out.println();
			System.out.println("XXcdXfXhXjkXmnopqXstuvwxyz");
			System.out.print(christian.getFirstName() + ": There are ");
			System.out.print(hackerChart("XXcdXfXhXjkXmnopqXstuvwxyz", 'X'));
			System.out.println(" X's in this jumble of letters. Do you notice anything?");
			System.out.println("1. Yes, I do");
			System.out.println("2. No, I don't see anything");
			
			String whatsInTheJumble = gameReader.next();
			
			if (whatsInTheJumble.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": Exactly! These letters represent the alphabet, and the X's represent the missing letters!");
			}
			
			else if (whatsInTheJumble.equals("2"))
			{
				System.out.println(christian.getFirstName() + ": It's alright, I'll tell you. These letters represent the alphabet, and the X's represent the missing letters!");
			}
			
			System.out.println("a b e g i l r");
			System.out.println(christian.getFirstName() + ": These letters spell out a name, which is the password that " + dawn.getFirstName() + " set for this computer. Try guessing it.");
			hackingIntoComputer(protag);
			
		}
	}
	
	public static int hackerChart(String str, char let)
	{
		//Variable that shows the number of times the selected letter shows up in the string
		int count = 0;
		
		//Keeps adding 1 to i until it reaches the last character of the string
		for (int i = 0; i<str.length(); i++)
		{
			//Checks if the chosen letter is the same character as i, and then adds 1 to count if true
			if (let == str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
	
	public static void hackingIntoComputer(Characters protag)
	{
		boolean hack = true;
		int count = 0;
		String password = "gabriel";
		while (hack)
		{
			String passwordGuess = gameReader.next();
			
			if (passwordGuess.equals("gabriel"))
			{
				System.out.println("Nice job, " + protag.getFirstName() + "! The password was '" + password + "'");
			}
			
			else
			{
				System.out.println(christian.getFirstName() + ": Try another combination, " + protag.getFirstName());
			}
		}
	}
	
	public static void fourthFloor(Characters protag)
	{
		String userInput = gameReader.next();
		
		Characters bellboy = new Characters ("Bellboy", "Nakamura", 30, "bellboy", "5'11''", "Japanese");
		
		if (userInput.equals("1"))
		{
			System.out.println("You arrive at Room 405 and unpack your belongings. All of a sudden, you hear a knock at the door. (Type '1' to answer it)");
			
			String userInputTwo = gameReader.next();
			
			if (userInputTwo.equals("1"));
			{
				System.out.println(bellboy.getFirstName() + ": Good afternoon! I'd like to inform you that there will be an all you can eat buffet at 7:00 tonight at our banquet hall right on this floor! We wish to see you there!");
				System.out.println("WHAT WILL YOU DO?");
				System.out.println("1. Go to the dinner");
				System.out.println("2. Just chill in your room for the night");
				
				String userInputThree = gameReader.next();
				{
					if (userInputThree.equals("1"))
					{
						System.out.println("You decide to go to the dinner at the banquet hall (Type '1' to proceed)");
						banquetHall(protag);
					}
					
					else if (userInputThree.equals("2"))
					{
						System.out.println("You decide to skip the dinner and stay in your room for the whole night. Except that's not what you do because you're an adventerous person who doesn't want to be boring, and wouldn't dare want Jayven to code even more than what he is coding already");
						System.out.println("Type '1' to go to the dinner");
						banquetHall(protag);
					}
				}
			}
		}
		
		else 
		{
			System.out.print("Just here to make sure there's an else statement");
		}
	}
	
	public static void fifthFloor(Characters protag)
	{
		String userInput = gameReader.next();
		
		Characters bellboy = new Characters ("Bellboy", "Nakamura", 30, "bellboy", "5'11''", "Japanese");
		
		if (userInput.equals("1"))
		{
			System.out.println("You arrive at Room 512 and unpack your belongings. All of a sudden, you hear a knock at the door. (Type '1' to answer it)");
			
			String userInputTwo = gameReader.next();
			
			if (userInputTwo.equals("1"));
			{
				System.out.println(bellboy.getFirstName() + ": Good afternoon! I'd like to inform you that there will be an all you can eat buffet at 7:00 tonight at our banquet hall right on this floor! We wish to see you there!");
				System.out.println("WHAT WILL YOU DO?");
				System.out.println("1. Go to the dinner");
				System.out.println("2. Just chill in your room for the night");
				
				String userInputThree = gameReader.next();
				{
					if (userInputThree.equals("1"))
					{
						System.out.println("You decide to go to the dinner at the banquet hall (Type '1' to proceed)");
						banquetHall(protag);
					}
					
					else if (userInputThree.equals("2"))
					{
						System.out.println("You decide to skip the dinner and stay in your room for the whole night. Except that's not what you do because you're an adventerous person who doesn't want to be boring, and wouldn't dare want Jayven to code even more than what he is coding already");
						System.out.println("Type '1' to go to the dinner");
						banquetHall(protag);
					}
				}
			}
		}
		
		else 
		{
			System.out.print("Just here to make sure there's an else statement");
		}
	}
	
	public static void ninthFloor(Characters protag)
	{
		String userInput = gameReader.next();
		
		Characters bellboy = new Characters ("Bellboy", "Nakamura", 30, "bellboy", "5'11''", "Japanese");
		
		if (userInput.equals("1"))
		{
			System.out.println("You arrive at Room 915 and unpack your belongings. All of a sudden, you hear a knock at the door. (Type '1' to answer it)");
			
			String userInputTwo = gameReader.next();
			
			if (userInputTwo.equals("1"));
			{
				System.out.println(bellboy.getFirstName() + ": Good afternoon! I'd like to inform you that there will be an all you can eat buffet at 7:00 tonight at our banquet hall right on this floor! We wish to see you there!");
				System.out.println("WHAT WILL YOU DO?");
				System.out.println("1. Go to the dinner");
				System.out.println("2. Just chill in your room for the night");
				
				String userInputThree = gameReader.next();
				{
					if (userInputThree.equals("1"))
					{
						System.out.println("You decide to go to the dinner at the banquet hall (Type '1' to proceed)");
						banquetHall(protag);
					}
					
					else if (userInputThree.equals("2"))
					{
						System.out.println("You decide to skip the dinner and stay in your room for the whole night. Except that's not what you do because you're an adventerous person who doesn't want to be boring, and wouldn't dare want Jayven to code even more than what he is coding already");
						System.out.println("Type '1' to go to the dinner");
						banquetHall(protag);
					}
				}
			}
		}
		
		else 
		{
			System.out.print("Just here to make sure there's an else statement");
		}
	
	}
	
}	
