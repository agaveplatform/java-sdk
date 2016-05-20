/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum JobStatusTypeEnum {
    PENDING, //TODO: Write general description for this element
    STAGING_INPUTS, //TODO: Write general description for this element
    CLEANING_UP, //TODO: Write general description for this element
    ARCHIVING, //TODO: Write general description for this element
    STAGING_JOB, //TODO: Write general description for this element
    FINISHED, //TODO: Write general description for this element
    KILLED, //TODO: Write general description for this element
    FAILED, //TODO: Write general description for this element
    STOPPED, //TODO: Write general description for this element
    RUNNING, //TODO: Write general description for this element
    PAUSED, //TODO: Write general description for this element
    QUEUED, //TODO: Write general description for this element
    SUBMITTING, //TODO: Write general description for this element
    STAGED, //TODO: Write general description for this element
    PROCESSING_INPUTS, //TODO: Write general description for this element
    ARCHIVING_FINISHED, //TODO: Write general description for this element
    ARCHIVING_FAILED, //TODO: Write general description for this element
    HEARTBEAT; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static JobStatusTypeEnum fromString(String toConvert) {
        return JobStatusTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 