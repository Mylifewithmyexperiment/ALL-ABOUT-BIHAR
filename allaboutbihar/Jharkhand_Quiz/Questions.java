package ca.blogspot.sjatyourservice.allaboutbihar.Jharkhand_Quiz;

public class Questions
{

    public String mQuestion[]=
           {


				   "Bihar Diwas is celebrated on which day?",

				   "The editor of 'Bihari' a leading newspaper of Bihar was",

				   "In Bihar, though 'Zamindari' was statutorily abolished the base " +
						   "of land control remained in the grip of?",

				   "Griddhraj Parvat is also known as ?",

				   "Asia’s Biggest Cattle Fair held at which of the following city ?",

				   "Which river is known as the Sorrow of Bihar?",

				   "Who of the following presidents of India was born in Bihar?",


				   "Patna University was established in which year ?",


				   " Which one is not located on National Highway-2 (NH-2)?",





				   "With whose efforts was Second Bihar Provincial Congress Session held?",






				   };


    private String mChoice[][]={




			{"19 April","15 August","22 March","17 July" },

			{"Babu G. Prasad", "Babu Ram Prasad ", "Babu Gopal Prasad ", "Babu Maheshwar Prasad"},


			{" Middle Caste Hindus ", " Scheduled Caste Hindus ", "Dominant Caste Hindus", " Scheduled Tribe Hindus"},

			{"Vulture peak", " Bird peak  ", " Monks peak  ", " None of these"},

			{"Sonepur", " Hajipur  ", " Buxar  ", " None of these"},


			{"Yamuna ", " Indus  ", "Kosi", " Baghmatir"},


			{"Zakir Husain ", " Neelam Sanjeeva Reddy  ", " K. R. Narayanan  ", "Rajendra Prasad"},
			{                "1919 ","1917"," 1947 "," 1949 "                       },
			{                  "Aurangabad"," Sasaram"," Mohania","Patna"},
			{        "G. K. Gokhale","Shri Deepnarayan Singh"," Shri Krishna"," Surendranath Banerjee"},



	};


    private String mCorrectAnswer[]=
     {


			 "22 March",  "Babu Maheshwar Prasad",  "Dominant Caste Hindus",   "Vulture peak",
			 "Sonepur",
			 "Kosi",      "Rajendra Prasad","1917", "Patna", "Shri Deepnarayan Singh"



	 };



    public String getChoice1(int a)
    {
        String choice=mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice=mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a)
    {
        String choice=mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a)
    {
        String choice=mChoice[a][3];
        return choice;
    }






    public String getQuestion(int a)
    {
        String question = mQuestion[a];
        return question;
    }

    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswer[a];
        return answer;
    }


}



