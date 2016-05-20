/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum PostItRequestMethodEnum {
    GET, //TODO: Write general description for this element
    PUT, //TODO: Write general description for this element
    POST, //TODO: Write general description for this element
    DELETE; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static PostItRequestMethodEnum fromString(String toConvert) {
        return PostItRequestMethodEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 