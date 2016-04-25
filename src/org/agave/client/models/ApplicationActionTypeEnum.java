/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;
public enum ApplicationActionTypeEnum {
    CLONE, //TODO: Write general description for this element
    PUBLISH, //TODO: Write general description for this element
    UNPUBLISH, //TODO: Write general description for this element
    ENABLE, //TODO: Write general description for this element
    DISABLE; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ApplicationActionTypeEnum fromString(String toConvert) {
        return ApplicationActionTypeEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 