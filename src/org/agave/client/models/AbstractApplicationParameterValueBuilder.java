/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class AbstractApplicationParameterValueBuilder {
    //the instance to build
    private AbstractApplicationParameterValue abstractApplicationParameterValue;

    /**
     * Default constructor to initialize the instance
     */
    public AbstractApplicationParameterValueBuilder() {
        abstractApplicationParameterValue = new AbstractApplicationParameterValue();
    }

    /**
     * The default value for this parameter. The type will be determined by the value.type field.
     */
    public AbstractApplicationParameterValueBuilder defaultValue(String defaultValue) {
        abstractApplicationParameterValue.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * Whether the argument value should be surrounded by quotation marks before injection into the wrapper template at runtime
     */
    public AbstractApplicationParameterValueBuilder enquote(boolean enquote) {
        abstractApplicationParameterValue.setEnquote(enquote);
        return this;
    }

    /**
     * An array of enumerated object values.
     */
    public AbstractApplicationParameterValueBuilder enumValues(String enumValues) {
        abstractApplicationParameterValue.setEnumValues(enumValues);
        return this;
    }

    /**
     * The order in which this parameter should be printed when generating an execution command for forked execution. This will also be the order in which paramters are returned in the response json.
     */
    public AbstractApplicationParameterValueBuilder order(int order) {
        abstractApplicationParameterValue.setOrder(order);
        return this;
    }

    /**
     * Is this parameter required? If visible is false, this must be true.
     */
    public AbstractApplicationParameterValueBuilder required(boolean required) {
        abstractApplicationParameterValue.setRequired(required);
        return this;
    }

    /**
     * The type of this parameter value. (Acceptable values are: "string", "number", "enumeration", "bool", "flag")
     */
    public AbstractApplicationParameterValueBuilder type(String type) {
        abstractApplicationParameterValue.setType(type);
        return this;
    }

    /**
     * The regular expression used to validate this parameter value. For enumerations, separate values with |
     */
    public AbstractApplicationParameterValueBuilder validator(String validator) {
        abstractApplicationParameterValue.setValidator(validator);
        return this;
    }

    /**
     * Should this parameter be visible? If not, there must be a default and it will be required.
     */
    public AbstractApplicationParameterValueBuilder visible(boolean visible) {
        abstractApplicationParameterValue.setVisible(visible);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AbstractApplicationParameterValue build() {
        return abstractApplicationParameterValue;
    }
}