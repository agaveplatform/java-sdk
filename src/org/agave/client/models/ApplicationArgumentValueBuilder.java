/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationArgumentValueBuilder {
    //the instance to build
    private ApplicationArgumentValue applicationArgumentValue;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationArgumentValueBuilder() {
        applicationArgumentValue = new ApplicationArgumentValue();
    }

    /**
     * The default value for this parameter. The type will be determined by the value.type field.
     */
    public ApplicationArgumentValueBuilder defaultValue(List<String> defaultValue) {
        applicationArgumentValue.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * Whether the argument value should be surrounded by quotation marks before injection into the wrapper template at runtime
     */
    public ApplicationArgumentValueBuilder enquote(boolean enquote) {
        applicationArgumentValue.setEnquote(enquote);
        return this;
    }

    /**
     * The order in which this parameter should be printed when generating an execution command for forked execution. This will also be the order in which paramters are returned in the response json.
     */
    public ApplicationArgumentValueBuilder order(int order) {
        applicationArgumentValue.setOrder(order);
        return this;
    }

    /**
     * Is this parameter required? If visible is false, this must be true.
     */
    public ApplicationArgumentValueBuilder required(boolean required) {
        applicationArgumentValue.setRequired(required);
        return this;
    }

    /**
     * The regular expression used to validate this parameter value. For enumerations, separate values with |
     */
    public ApplicationArgumentValueBuilder validator(String validator) {
        applicationArgumentValue.setValidator(validator);
        return this;
    }

    /**
     * Should this parameter be visible? If not, there must be a default and it will be required.
     */
    public ApplicationArgumentValueBuilder visible(boolean visible) {
        applicationArgumentValue.setVisible(visible);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationArgumentValue build() {
        return applicationArgumentValue;
    }
}