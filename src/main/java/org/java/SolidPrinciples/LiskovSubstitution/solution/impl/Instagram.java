package org.java.SolidPrinciples.LiskovSubstitution.solution.impl;

import org.java.SolidPrinciples.LiskovSubstitution.solution.GroupVideoCall;
import org.java.SolidPrinciples.LiskovSubstitution.solution.PostMedia;
import org.java.SolidPrinciples.LiskovSubstitution.solution.SocialMedia;

public class Instagram implements SocialMedia, PostMedia, GroupVideoCall {
    @Override
    public void groupVideoCall() {

    }

    @Override
    public void post() {

    }

    @Override
    public void chat() {

    }

    @Override
    public void sendMedia() {

    }
}
