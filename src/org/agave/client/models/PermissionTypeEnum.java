/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum PermissionTypeEnum {
    ALL, //TODO: Write general description for this element
    EXECUTE, //TODO: Write general description for this element
    NONE, //TODO: Write general description for this element
    READ, //TODO: Write general description for this element
    READ_EXECUTE, //TODO: Write general description for this element
    READ_WRITE, //TODO: Write general description for this element
    WRITE, //TODO: Write general description for this element
    WRITE_EXECUTE; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static PermissionTypeEnum fromString(String toConvert) {
        return PermissionTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 