/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;
public enum AuthenticationTypeEnum {
    APIKEYS, //TODO: Write general description for this element
    LOCAL, //TODO: Write general description for this element
    PAM, //TODO: Write general description for this element
    PASSWORD, //TODO: Write general description for this element
    SSHKEYS, //TODO: Write general description for this element
    TOKEN, //TODO: Write general description for this element
    X509, //TODO: Write general description for this element
    ANONYMOUS; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static AuthenticationTypeEnum fromString(String toConvert) {
        return AuthenticationTypeEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 