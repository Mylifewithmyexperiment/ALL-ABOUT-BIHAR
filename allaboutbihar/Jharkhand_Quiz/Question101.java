package ca.blogspot.sjatyourservice.allaboutbihar.Jharkhand_Quiz;

/**
 * Created by SHASHI on 11-Sep-17.
 */

public class Question101 {



    public String mQuestion101[]=
            {

            		"Which of the following is First Capital of Kingdom Magadha ?",

                    "The East Central Railway zone headquarters is located at?",


			            "Patna University was established in which year ?",


		             " Which one is not located on National Highway-2 (NH-2)?",





			 "With whose efforts was Second Bihar Provincial Congress Session held?",







            };



	private String mChoice[][]=
			{

					{       "Nalanda "," Pataliputra ","Rajgir"," None of these "        },


					{                "Patna","Hajipur"," M uzaffarpur"," Katihar"                       },

					{                "1919 ","1917"," 1947 "," 1949 "                       },
					{                  "Aurangabad"," Sasaram"," Mohania","Patna"},
					{        "G. K. Gokhale","Shri Deepnarayan Singh"," Shri Krishna"," Surendranath Banerjee"},


					};


	private String mCorrectAnswer[]=
			{"Rajgir","Hajipur" , "1917", "Patna", "Shri Deepnarayan Singh"

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
        String question = mQuestion101[a];
        return question;
    }

    public String getCorrectAnswer101(int a)
    {
        String answer=mCorrectAnswer[a];
        return answer;
    }


}
