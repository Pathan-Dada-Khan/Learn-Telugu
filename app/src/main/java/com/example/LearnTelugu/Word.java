package com.example.LearnTelugu;

public class Word {
    String Eng,Telugu;
    private static final int hasImageID=-1;
    int Image=hasImageID;
    public Word(String eng,String tel){
        Telugu=tel;
        Eng=eng;
    }
    public Word(String eng,String tel,int img){
        Telugu=tel;
        Eng=eng;
        Image=img;
    }
    public String getTeluguWord(){
        return Telugu;
    }
    public String getEnglishWord(){
        return Eng;
    }
    public int getImage(){return Image;}
    public boolean hasImage(){return Image!=hasImageID;}
}
