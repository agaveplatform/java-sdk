/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum SystemStorageProtocolTypeEnum {
    FTP, //TODO: Write general description for this element
    GRIDFTP, //TODO: Write general description for this element
    IRODS, //TODO: Write general description for this element
    LOCAL, //TODO: Write general description for this element
    S3, //TODO: Write general description for this element
    SFTP; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static SystemStorageProtocolTypeEnum fromString(String toConvert) {
        return SystemStorageProtocolTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 