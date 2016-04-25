/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;
public enum ClientAPISubscriptionStatusTypeEnum {
    CREATED, //TODO: Write general description for this element
    PROTOTYPED, //TODO: Write general description for this element
    PUBLISHED, //TODO: Write general description for this element
    DEPRECATED, //TODO: Write general description for this element
    RETIRED, //TODO: Write general description for this element
    BLOCKED; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ClientAPISubscriptionStatusTypeEnum fromString(String toConvert) {
        return ClientAPISubscriptionStatusTypeEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 