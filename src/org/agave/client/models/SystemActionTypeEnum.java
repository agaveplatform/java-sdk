/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum SystemActionTypeEnum {
    PUBLISH, //TODO: Write general description for this element
    UNPUBLISH, //TODO: Write general description for this element
    SETDEFAULT, //TODO: Write general description for this element
    UNSETDEFAULT, //TODO: Write general description for this element
    SETGLOBALDEFAULT, //TODO: Write general description for this element
    UNSETGLOBALDEFAULT, //TODO: Write general description for this element
    CLONE; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static SystemActionTypeEnum fromString(String toConvert) {
        return SystemActionTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 