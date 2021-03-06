package com.roami.leaguefleet;

/**
 * Created by Mert on 27.04.2018.
 */

public class Question {
    private int questionID;
    private int imageID;
    private char answer;
    private int difficulty;
    private int[] answerIDs;

    public int[] getAnswerIDs() {
        return answerIDs;
    }

    public void setAnswerIDs(int[] answerID) {
        this.answerIDs = answerID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    public int getDifficulty() { return difficulty; }

    public void setDifficulty(int difficulty) { this.difficulty = difficulty; }


    public Question(int questionID,int imageID, char answer,int difficulty, int[] answersIDs){
        this.questionID = questionID;
        this.imageID = imageID;
        this.answer = answer;
        this.difficulty = difficulty;
        this.answerIDs = answersIDs;
    }
}
