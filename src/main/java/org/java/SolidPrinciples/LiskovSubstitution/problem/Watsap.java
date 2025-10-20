package org.java.SolidPrinciples.LiskovSubstitution.problem;

public class Watsap extends SocialMedia{
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
        //this method can't added as watsapp doesn't support posts so
        // here this watsap can't be substitute of its super class SocialMedia
        //here the Liskov's substitution principle is violated
    }
}
