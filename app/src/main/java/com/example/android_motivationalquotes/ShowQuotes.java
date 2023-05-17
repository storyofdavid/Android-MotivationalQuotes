package com.example.android_motivationalquotes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowQuotes extends AppCompatActivity {

    private MyRecyclerViewAdapterQuotes adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Grabs the value of the person clicked
        Intent intent = getIntent();
        String person = intent.getStringExtra("person");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sets the text to the name of the person
        TextView txtTitle = findViewById(R.id.txtTitle);
        txtTitle.setText(person);

        //Initalises the array
        ArrayList<String> quotesList = new ArrayList<>();
        //Populates the array with data - ie. the quotes the show
        showQuotes(quotesList, person);

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapterQuotes(this, quotesList);
        recyclerView.setAdapter(adapter);
    }


    private void showQuotes(ArrayList<String> quotesList, String person){

        //switch statement to show the correct quotes depending on which person was selected
        switch(person) {
            case "Greg Plitt":
                quotesList.add("Second by second you lose the opportunity to become the person you want to be, when are you going to stop making excuses and take charge of your f*#king life?”");
                quotesList.add("Every action has a purpose. When every action has a purpose every action has a result.");
                quotesList.add("You must believe in yourself enough to be the person now that you want others to remember you for later.");
                quotesList.add("Life isn’t about waiting the storm to pass. It’s about dancing in the rain.");
                quotesList.add("Opportunities don’t come knocking on the door. They present themselves when you knock the f*#king door down.");
                quotesList.add("You only live once, but if you work it right, once is enough.");
                quotesList.add("In life, it’s not the genetic guy who wins or the guy with the most potential who wins; it’s the person with the greatest perseverance who wins. Always be willing to get up and go at it again and again. That’s the guy who has his hands raised later in life. That’s the guy you guys need to be.");
                quotesList.add("The pump is one of the better highs in life. You don’t need to shoot up for it, you don’t need to snort it. All you’ve got to do it sweat for it.");
                quotesList.add("The real tragedy in life isn’t someone who hasn’t achieved their goal, it’s the person that never had a goal to begin with.");
                quotesList.add("There are two types of pain, the one that breaks you and the one that changes you. In the gym, pain is felt as a result of weakness leaving the body. Physical pain is the pain of transformation and the pain of progress. The more you endure, the harder it becomes to accept the thought of failure.");
                quotesList.add("If you mentally believe it will happen, your body is going to find a way to make it physically happen.");
                quotesList.add("You are what you do repeatedly. If excellence is something you’re striving for, then it’s not an accident. It’s a habit.");
                quotesList.add("The difference between a winner and a loser – they both failed, but the winner gets back up and does it again and again until it goes his way.");
                quotesList.add("Today it begins. Tomorrow it continues. And it never ends, until you reach your goal and cross the finish line.");
                quotesList.add("Normal is what weak people call it living. I call it death.");
                quotesList.add("Walk through the mud in life, if you ever want to get to the higher ground.");
                quotesList.add("Stop f*#king going about the day as a servant , become the master, run your day and stop letting it run you.");
                quotesList.add("It’s called the pump people, you got to experience it, it’s one of the better highs in life, you don’t need to shoot up for it, you don’t need to snort it, all you got to do is sweat for it.");
                quotesList.add("I keep going till that pain says hello to me, I don’t say goodbye until that pain says hello. That’s a good set.");
                quotesList.add("Success doesn’t know these things about cold or early or tired. It just knows if you showed up or not.");
                quotesList.add("If tomorrow doesn’t happen, would you still do what you’re about to do today? If that answer is no, you’re alive, but you’re not living.");
                quotesList.add("I don’t want to be here right now. I’d much rather be at home watching the game. But later down the road, I don’t want to always be just watching the f*#king game.");
                quotesList.add("There’s no excuse to not be the hardest motherf*#king worker in the room, whatever it may be, your job, the gym, your relationship. Your name’s attached to it, and that has to mean more than anything.");
                quotesList.add("You got one life to live. Why wait until tomorrow to start it?");
                quotesList.add("If you do not give 110% in your life, I promise your life will haunt you for the rest of your days. Time is the most valuable asset on earth, a depreciating asset. Don’t waste another moment of life where you are not at your fullest potential getting the most out of the time you have in life.");
                quotesList.add("If you don’t want it bad enough, you’ll find an excuse.");
                quotesList.add("Fear is self-imposed. You create it, you can destroy it too. Behind every fear is the person you want to be. When fear is destroyed, it comes back as confidence.");
                quotesList.add("Life is a plan of action, if you don’t have a plan, someone is going to use you as part of their plan.");
                quotesList.add("Wake up with a plan of action, go to bed with satisfaction.");
                break;

            case "Gary Vaynerchuk":
                quotesList.add("It’s easy to dream, but much harder to execute it.");
                quotesList.add("Skills are cheap. Passion is priceless.");
                quotesList.add("Look yourself in the mirror and ask yourself, what do I want to do every day for the rest of my life…Do that.");
                quotesList.add("If you live for the weekends and vacations, your life is broken.");
                quotesList.add("Without hustle, talent will only carry you so far.");
                quotesList.add("There’s no reason to do things you hate. None.");
                quotesList.add("Saying hello doesn’t have an ROI it’s about building relationships.");
                quotesList.add("Ideas are nothing. Execution is the game.");
                quotesList.add("No one makes a million dollars with minimal effort unless they win the lottery.");
                quotesList.add("The more content I put out, the more luck I have.");
                quotesList.add("People are chasing cash, not happiness. When you chase money, you’re going to lose. You’re just going to. Even if you get the money, you’re not going to be happy.");
                quotesList.add("You have to understand your own personal DNA. Don’t do things because I do them or Steve Jobs or Mark Cuban tried it. You need to know your personal brand and stay true to it.");
                quotesList.add("Time – the one asset none of us are ever going to get more of.");
                quotesList.add("A penguin cannot become a giraffe, so just be the best penguin you can be.");
                quotesList.add("It took thirty-eight years before 50 million people gained access to radios. It took television thirteen years to earn an audience that size. It took Instagram a year and a half.");
                quotesList.add("I put zero weight into anyone’s opinion about me because I know exactly who I am. Can you say the same? ");
                quotesList.add("You need to spend all of your time and energy on creating something that actually brings value to the people you’re asking for money.");
                quotesList.add("You can’t read about push ups. What makes you think reading inspirational quotes all day is gonna get you there");
                quotesList.add("We only get to play this game one time. We have one life.");
                quotesList.add("Effort is grossly underrated.");
                break;

            case "Arnold Schwarzenegger":
                quotesList.add("Failure is not an option. Everyone has to succeed.");
                quotesList.add("The worst thing I can be is the same as everybody else. I hate that.");
                quotesList.add("The mind is the limit. As long as the mind can envision the fact that you can do something, you can do it, as long as you really believe 100 percent.");
                quotesList.add("For me, life is about continuously being hungry. The meaning of life is not simply to exist, to survive, but to move ahead, to go up, to achieve, to conquer.");
                quotesList.add("Start wide, expand further, and never look back.");
                quotesList.add("Strength does not come from winning. Your struggles develop your strengths. When you go through hardships and decide not to surrender, that is strength.");
                quotesList.add("The resistance that you fight physically in the gym and the resistance that you fight in life can only build a strong character.");
                quotesList.add("If you work hard and play by the rules, this country is truly open to you. You can achieve anything.");
                quotesList.add("What we face may look insurmountable. But I learned something from all those years of training and competing. I learned something from all those sets and reps when I didn’t think I could lift another ounce of weight. What I learned is that we are always stronger than we know.");
                quotesList.add("I knew I was a winner back in the late sixties. I knew I was destined for great things. People will say that kind of thinking is totally immodest. I agree. Modesty is not a word that applies to me in any way. I hope it never will.");
                quotesList.add("I welcome and seek your ideas, but do not bring me small ideas; bring me big ideas to match our future.");
                quotesList.add("I never listened to anyone who said I can’t do something.");
                quotesList.add("None of my rules of success will work unless you do.");
                quotesList.add("Positive thinking can be contagious. Being surrounded by winners helps you develop into a winner.");
                quotesList.add("If you don’t find the time, if you don’t do the work, you don’t get the results.");
                quotesList.add("Be hungry for success, hungry to make your mark, hungry to be seen and to be heard and to have an effect. And as you move up and become successful, make sure also to be hungry for helping others.");
                quotesList.add("Just remember, you can’t climb the ladder of success with your hands in your pockets.");
                quotesList.add("While you’re out there partying, horsing around, someone out there at the same time is working hard. Someone is getting smarter and someone is winning. Just remember that.");
                quotesList.add("Don’t listen to the naysayers. Make sure that you’re working your butt off. Make sure that you have a very clear vision of where you want to go. Don’t shoot for lower goals – shoot for the stars.");
                quotesList.add("If you don’t believe in yourself, then how will anyone else believe in you?");
                break;

            case "Mahatma Gandhi":
                quotesList.add("In a gentle way, you can shake the world.");
                quotesList.add("The future depends on what you do today.");
                quotesList.add("When you are right, you have no need to be angry. When you are wrong, you have no right to be angry.");
                quotesList.add("Nobody can hurt me without my permission.");
                quotesList.add("Happiness is when what you think, what you say, and what you do are in harmony.");
                quotesList.add("If I have the belief that I can do it, I shall surely acquire the capacity to do it even if I may not have it at the beginning.");
                quotesList.add("Relationships are based on four principles: respect, understanding, acceptance, and appreciation.");
                quotesList.add("Silence is the best answer to anger.");
                quotesList.add("You can’t change how people treat you or what they say about you. All you can do is change how you react to it.");
                quotesList.add("You must not lose faith in humanity. Humanity is an ocean; if a few drops of the ocean are dirty, the ocean does not become dirty.");
                quotesList.add("An eye for an eye only ends up making the whole world blind.");
                quotesList.add("Many people, especially ignorant people, want to punish you for speaking the truth, for being correct, for being you. Never apologize for being correct, or for being correct, or for being years ahead of your time. If you’re right and you know it, speak your mind. Even if you are a minority of one, the truth is still the truth.");
                quotesList.add("Without action, you aren’t going anywhere.");
                quotesList.add("I will not let anyone walk through my mind with their dirty feet.");
                quotesList.add("Carefully watch your thoughts, for they become your words. Manage and watch your words, for they will become your actions. Consider and judge your actions, for they become your habits. Acknowledge and watch your habits, for they shall become your values. Understand and embrace your values, for they become your destiny.");
                quotesList.add("A man is but the product of his thoughts. What he thinks he becomes.");
                quotesList.add("You must be the change you wish to see in the world.");
                quotesList.add("We need not wait to see what others do.");
                quotesList.add("I am prepared to die, but there is no cause for which I am prepared to kill.");
                quotesList.add("You may never know what results come of your action, but if you do nothing there will be no result.");
                break;

            case "Albert Einstein":
                quotesList.add("We cannot solve our problems with the same thinking we used to create them.");
                quotesList.add("Imagination is everything. It is the preview of life’s coming attractions.");
                quotesList.add("Learn from yesterday, live for today, hope for tomorrow. The important thing is not to stop questioning.");
                quotesList.add("Anyone who has never made a mistake has never tried anything new.");
                quotesList.add("The difference between genius and stupidity is that genius has its limits.");
                quotesList.add("Insanity is doing the same thing over and over again and expecting different results.");
                quotesList.add("If you can’t explain it simply, you don’t understand it well enough.");
                quotesList.add("As a human being, one has been endowed with just enough intelligence to be able to see clearly how utterly inadequate that intelligence is when confronted with what exists.");
                quotesList.add("Life is like riding a bicycle. To keep your balance you must keep moving.");
                quotesList.add("It’s not that I’m so smart, it’s just that I stay with problems longer.");
                quotesList.add("In order to form an immaculate member of a flock of sheep one must, above all, be a sheep.");
                quotesList.add("Only those who attempt the absurd can achieve the impossible.");
                quotesList.add("A man should look for what is, and not for what he thinks should be.");
                quotesList.add("In the middle of difficulty lies opportunity.");
                quotesList.add("A human being is part of a whole called by us the universe.");
                quotesList.add("A happy man is too satisfied with the present to dwell too much on the future.");
                quotesList.add("A ship is always safe at the shore, but that is not what it is built for.");
                quotesList.add("If you want to live a happy life, tie it to a goal, not to people or things.");
                quotesList.add("Logic will get you from A to Z. Imagination will get you everywhere.");
                quotesList.add("Common sense is what tells us the earth is flat.");
                quotesList.add("I’d rather be an optimist and a fool than a pessimist and right.");
                quotesList.add("The one who follows the crowd will usually go no further than the crowd. Those who walk alone are likely to find themselves in places no one has ever been before.");
                quotesList.add("What is right is not always popular and what is popular is not always right.");
                quotesList.add("I speak to everyone in the same way, whether he is the garbage man or the president of the university.");
                break;

            case "David - The Developer":
                quotesList.add("Life is what you make of it.");
                quotesList.add("Wishing for things will get you no where. You have to put the effort & work in.");
                quotesList.add("Set a goal and work towards it every single day.");
                quotesList.add("Too much time is spent stressing over inconsequential decisions. Think of how vast space and the universe is. Compared to that our day to day decisions are pretty much insignificant so why stress over them.");
                quotesList.add("If you put al your eggs in one basket. Chances are the basket will break and you won't have any eggs at all.");
                break;
        }
    }
}

