package org.java.SolidPrinciples.LiskovSubstitution.solution.impl;

import org.java.SolidPrinciples.LiskovSubstitution.solution.GroupVideoCall;
import org.java.SolidPrinciples.LiskovSubstitution.solution.SocialMedia;

public class Watsap implements SocialMedia, GroupVideoCall {
    @Override
    public void groupVideoCall() {

    }

    @Override
    public void chat() {

    }

    @Override
    public void sendMedia() {

    }
}
