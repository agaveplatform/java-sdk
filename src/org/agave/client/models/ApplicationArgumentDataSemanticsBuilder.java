/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationArgumentDataSemanticsBuilder 
        extends ApplicationArgumentSemanticsBuilder {
    //the instance to build
    private ApplicationArgumentDataSemantics applicationArgumentDataSemantics;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationArgumentDataSemanticsBuilder() {
        applicationArgumentDataSemantics = new ApplicationArgumentDataSemantics();
    }

    /**
     * The file types acceptable for this input.
     */
    public ApplicationArgumentDataSemanticsBuilder fileTypes(List<String> fileTypes) {
        applicationArgumentDataSemantics.setFileTypes(fileTypes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationArgumentDataSemantics build() {
        return applicationArgumentDataSemantics;
    }
}