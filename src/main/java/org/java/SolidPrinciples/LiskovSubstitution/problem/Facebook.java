package org.java.SolidPrinciples.LiskovSubstitution.problem;

public class Facebook extends SocialMedia{
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
        //this method can't added as face doesn't support group video calls so
        // here this facebook can't be substitute of its super class SocialMedia
        //here the Liskov's substitution principle is violated
    }

    @Override
    public void post() {

    }
}
