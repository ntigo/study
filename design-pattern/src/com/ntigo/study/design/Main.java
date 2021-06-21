package com.ntigo.study.design;

import com.ntigo.study.design.builder.Member;

public class Main {

    public static void main(String[] args) {
        // Example for Builder-Pattern
        Member.Builder mBuilder = new Member.Builder( 1 );
        Member member = mBuilder.setName( "Mr. Kim" ).setBloodType( "AB" ).setDepartment( "DEV.STRATEGY" ).build();
        System.out.println( member.toString() );
    }

}
