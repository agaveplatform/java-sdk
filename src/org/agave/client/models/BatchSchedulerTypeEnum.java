/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;
public enum BatchSchedulerTypeEnum {
    COBALT, //TODO: Write general description for this element
    CONDOR, //TODO: Write general description for this element
    FORK, //TODO: Write general description for this element
    LOADLEVELER, //TODO: Write general description for this element
    LSF, //TODO: Write general description for this element
    MOAB, //TODO: Write general description for this element
    PBS, //TODO: Write general description for this element
    SGE, //TODO: Write general description for this element
    SLURM, //TODO: Write general description for this element
    TORQUE, //TODO: Write general description for this element
    UNKNOWN; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static BatchSchedulerTypeEnum fromString(String toConvert) {
        return BatchSchedulerTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 