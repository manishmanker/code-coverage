package com.mkyong.core;

import java.util.UUID;

/**
 *
 * @author John Yeary
 */
public class IdentityUtilities {
 
    /**
     * Generates a {@link UUID}
     *
     * @return a {@code String} representation of a UUID.
     */
    public static String getUUID() {
		System.out.println("STPM");
        return UUID.randomUUID().toString();
    }
	public void show(){
	
	}
	
	
}