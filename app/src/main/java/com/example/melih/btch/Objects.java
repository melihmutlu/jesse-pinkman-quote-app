package com.example.melih.btch;

import java.util.ArrayList;

/**
 * Created by Melih on 5.8.2015.
 */

public class Objects {

    private ArrayList<Quote> items;
    private ArrayList<String> titles;

    public Objects() {
        items = new ArrayList<>();
        titles = new ArrayList<>();
        createQuotes();
    }

    public ArrayList<Quote> getQuotes(){
        return items;
    }

    public ArrayList<String> getTitles(){
        for(Quote quote : items){
            titles.add(quote.getQuote());
        }
        return titles;
    }

    private void createQuotes(){

        items.add(new Quote(R.raw.basement , "You ain't see the basement , bitch." , "Season 1 Episode 7"));
        items.add(new Quote(R.raw.bitch1 , "Yeah, and how's about I send over my psycho bitch wife...", "Season 1 Episode 2"));
        items.add(new Quote(R.raw.bitch2 , "These bitches are bleeding us enough already." , "Season 1 Episode 7" ));
        items.add(new Quote(R.raw.heil_hitler , "Heil Hitler, Bitch!" , "Season 1 Episode 3"));
        items.add(new Quote(R.raw.speaking_to_mic , "Speak into the mic , bitch." , "Season 1 Episode 4"));
        items.add(new Quote(R.raw.phone_call , "Cueball son of a bitch , laughed in my face." , "Season 2 Episode 3"));
        items.add(new Quote(R.raw.dad_mom , "This is gonna help big time with that .Bitch." , "Season 2 Episode 4"));
        items.add(new Quote(R.raw.s_o_b , "Argh ! Son of a bitch." , "Season 2 Episode 4"));
        items.add(new Quote(R.raw.where_is_my_money , "Where is my money , bitch ?" , "Season 2 Episode 6"));
        items.add(new Quote(R.raw.where_is_my_money2 , "Where is my money , bitch?" , "Season 2 Episode 6"));
        items.add(new Quote(R.raw.miserable , "Miserable , son of a bitch" , "Season 2 Episode 7"));
        items.add(new Quote(R.raw.expect_answer , "Don't you cover for him ,bitch! I ask you a straight-up question, I expect a straight-up answer." , "Season 2 Episode 8"));
        items.add(new Quote(R.raw.leave_them_on_counter , "I wanted to leave them on the counter, bitch!" , "Season 2 Episode 9"));
        items.add(new Quote(R.raw.cmon , "Come on, you bitches." , "Season 2 Episode 9"));
        items.add(new Quote(R.raw.i_pay_my_rent , "I pay my rent bitch!" , "Season 2 Episode 12"));
        items.add(new Quote(R.raw.other_half , "Where's the other half, bitch?" , "Season 3 Episode 4"));
        items.add(new Quote(R.raw.plural , "Plural , Bitch!" , "Season 3 Episode 5"));
        items.add(new Quote(R.raw.stop_me , "Just try and stop me, bitch." , "Season 3 Episode 5"));
        items.add(new Quote(R.raw.not_be_harrased , "This is my own private domicile, and I will not be harassed , bitch." , "Season 3 Episode 6"));
        items.add(new Quote(R.raw.free_pass , "You're my free pass... Bitch!" , "Season 3 Episode 7"));
        items.add(new Quote(R.raw.roll_me_further , "So roll me further, bitch.", "Season 3 Episode 8"));
        items.add(new Quote(R.raw.partners , "I'm not your bitch to order around.We're partners." , "Season 3 Episode 8"));
        items.add(new Quote(R.raw.hell_yeah , "I thought to myself , hell yeah, bitch." , "Season 3 Episode 9"));
        items.add(new Quote(R.raw.gatorade_me , "Yo! Gatorade me , bitch." , "Season 3 Episode 10"));
        items.add(new Quote(R.raw.hot_dogs , "Have at it, bitches, because , I love hotdogs." , "Season 3 Episode 10"));
        items.add(new Quote(R.raw.possum , "Possum. Big, freaky-looking bitch." , "Season 3 Episode 10"));
        items.add(new Quote(R.raw.total , "Argh ! Son of a bitch." , "Season 3 Episode 10"));
        items.add(new Quote(R.raw.hold_onto_yout_hats , "Hold on to your hats, bitches." , "Season 4 Episode 2"));
        items.add(new Quote(R.raw.whatever , "Whatever, you little bitch." , "Season 4 Episode 2"));
        items.add(new Quote(R.raw.yeah , "Yeah bitch!" , "Season 4 Episode 3"));
        items.add(new Quote(R.raw.wake_up , "Wake up bitches!" , "Season 4 Episode 4"));
        items.add(new Quote(R.raw.who_is_boss , "Why don't you just go, break the door down, and pistol whip those bitches and show them who's boss?" , "Season 4 Episode 6"));
        items.add(new Quote(R.raw.i_made_u , "I made you my bitch." , "Season 4 Episode 7"));
        items.add(new Quote(R.raw.stop_whining , "I suggest you stop whining like a little bitch..." , "Season 4 Episode 10"));
        items.add(new Quote(R.raw.kill_him , "I'm going to find the son of a bitch, and I'm going to kill him." , "Season 4 Episode 12"));
        items.add(new Quote(R.raw.magnets , "Yeah, bitch! Magnets." , "Season 5 Episode 1"));
        items.add(new Quote(R.raw.yeah_2 , "Yeah bitch." , "Season 5 Episode 1"));
        items.add(new Quote(R.raw.yeah_3 , "YEAH Bitch." , "Season 5 Episode 5"));
        items.add(new Quote(R.raw.got_my_photo , "Got my photo, bitch?" , "Season 5 Episode 13"));
        items.add(new Quote(R.raw.listen_to_me , "No, you listen to me, bitch!" , "Season 5 Episode 13"));
        items.add(new Quote(R.raw.fire_in_the_hole , "Fire in the hole , bitch." , "Season 5 Episode 13"));

    }
    public class Quote {
        private int audioID;
        private String quote;
        private String quoteInfo;

        public Quote(int audioID, String quote, String quoteInfo) {
            this.audioID = audioID;
            this.quote = quote;
            this.quoteInfo = quoteInfo;
        }

        public int getAudioID() {
            return audioID;
        }

        public String getQuote() {
            return quote;
        }

        public String getQuoteInfo() {
            return quoteInfo;
        }
    }
}
