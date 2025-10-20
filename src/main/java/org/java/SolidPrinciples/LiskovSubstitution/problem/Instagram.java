package org.java.SolidPrinciples.LiskovSubstitution.problem;

public class Instagram extends SocialMedia{

   //this one only following Liskov Substitution principle as this class is good enough
    // to act as its super class as it allows all the behaviours of its super class
    @Override
    public void chat() {

    }

    @Override
    public void sendMedia() {

    }

    @Override
    public void videoAudioCall() {

    }

    @Override
    public void groupVideoCall() {

    }

    @Override
    public void post() {

    }
}
