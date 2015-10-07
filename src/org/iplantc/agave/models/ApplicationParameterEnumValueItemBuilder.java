/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;

public class ApplicationParameterEnumValueItemBuilder {
    //the instance to build
    private ApplicationParameterEnumValueItem applicationParameterEnumValueItem;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationParameterEnumValueItemBuilder() {
        applicationParameterEnumValueItem = new ApplicationParameterEnumValueItem();
    }

    /**
     * The enumerated value.
     */
    public ApplicationParameterEnumValueItemBuilder key(LinkedHashMap<String, String> key) {
        applicationParameterEnumValueItem.setKey(key);
        return this;
    }

    /**
     * The value of the enumeration to display in a dropdown list
     */
    public ApplicationParameterEnumValueItemBuilder value(String value) {
        applicationParameterEnumValueItem.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationParameterEnumValueItem build() {
        return applicationParameterEnumValueItem;
    }
}