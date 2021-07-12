package com.example.quizapplication;

public class questions {
    public String mQuestion[] = {
            "Who won the Best Footballer 2016 in the world?",
            "Who is the UN Secretary General?",
            "What was the word of the year-2016 according to Dictionary.com",
            "In bihar,UNESCO has declared which place as a World Heritage Site?",
            "How many satellites in a single mission using PSLV C-34 launched in 2016? ",
            "Reliance Jio has Launched which digital wallet service for peoples? ",
            "Which planet has the Great Red Spot",
            "What is the age of Earth as calculated?",
            "Shakkar River is Tributary of which river in india?",
            "Which galaxy is closest to our galaxy?",
    };
    private String mChoices[][]= {
            {"Cristiano Ronaldo","Cristiano Robert","Robert Paul","Mark Admin"},
            {"Antonio Guterres","Cristiano Robert","Robert Paul","Mark Admin"},
            {"Xenophobia","Menophobia","Kemophobia","Semophobia"},
            {"Bihar's ancient Nalanda University","Jaipur National University","Takshila University","Jagjvan University"},
            {"20 satellites","30 satellites","10 satellites","5 satellites"},
            {"JioMoney","Reliance Money","Airtal","Jio app"},
            {"Jupitar","Mars","Neptune","Moon"},
            {"5.63 billion years","4.44 billion years","4.543 billion years","3.742 billion years"},
            {"Krishna at vijawada","Narmada river at madhya pradesh","Ganga river at Maharastra","Godhavari at Andhrapradesh"},
            {"Milky Way","Magellanic cloud","Andromeda Galaxy","Cigar Galaxy"},

    };
    private String mCorrectAnswers[] = {"Cristiano Ronaldo","Autonio Guterres","Xenophobia","Bihar's ancient Nalanda University","20 satellites","JioMoney","Jupitar","4.543 billion years","Narmada river at madhya pradesh","Andromeda galaxy"};

    public String getQuestions(int a){
        String question = mQuestion[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
