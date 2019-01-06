package ca.blogspot.sjatyourservice.allaboutbihar.Jharkhand_Quiz;


public class Question11 {




    public String mQuestion11[]=
            {
            		"Valmiki National Park is located in which district of Bihar ?",
					"What is the area of Bihar?",
					"When was the Municipal Corporation established in Patna?",
			" Who was the leader of the student movement in Bihar in 1974?"
							,
			 "State bird of Bihar ?",
					"Which of the following city is called as Electronics City of Bihar ?"

            };



    private String mChoice[][]=
            {
					{   "Siwan "," Gopalganj ","West Champaran"," Muzaffarpur"    },
					{    "72,456 sq. mi. ","38,301 sq. mi."," 54,978 sq. mi. "," 64,312 sq. mi."    },
					{    "1947 "," 1950 "," 1951 ","1952"      },
					{	"Jai Prakash Narayan"," Ram Manohar Lohia "," Vinoba Bhave "," Ram Pujan Sahay"},
					{ "Sparrow"," Indian roller "," Parrot "," None of these" },
					{ " Darbhanga "," Sahasra "," Gaya ","Hajipur"  }
            };


    private String mCorrectAnswer[]=
            { "West Champaran","38,301 sq. mi.","1952","Jai Prakash Narayan","Sparrow","Hajipur"

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
        String question = mQuestion11[a];
        return question;
    }

    public String getCorrectAnswer11(int a)
    {
        String answer = mCorrectAnswer[a];
        return answer;
    }

}
