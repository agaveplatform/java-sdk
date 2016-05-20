/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum FilesStatusTypeEnum {
    PREPROCESSING, //Preparing file for next processing task
    STAGING_QUEUED, //File/folder queued for staging
    STAGING, //Staging file/folder
    STAGING_COMPLETED, //Staging completed successfully
    STAGING_FAILED, //Staging failed
    TRANSFORMING_QUEUED, //File/folder queued for transform
    TRANSFORMING, //Transforming file/folder
    TRANSFORMING_FAILED, //Transforming failed
    TRANSFORMING_COMPLETED; //Transform completed successfully
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static FilesStatusTypeEnum fromString(String toConvert) {
        return FilesStatusTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 