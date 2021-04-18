package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author hqweay
 * @Description: TODO
 * @date 1/14/21 9:58 PM
 */
public class A {
	public static void main(String[] args) {
		Optional< String > firstName = Optional.of( "Tom" );
		System.out.println( "First Name is set? " + firstName.isPresent() );
		System.out.println( "First Name: " + firstName.orElseGet( () -> "[none]" ) );
		System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
	}
}
