/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationArgumentSemanticsBuilder {
    //the instance to build
    private ApplicationArgumentSemantics applicationArgumentSemantics;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationArgumentSemanticsBuilder() {
        applicationArgumentSemantics = new ApplicationArgumentSemantics();
    }

    /**
     * The file types acceptable for this output.
     */
    public ApplicationArgumentSemanticsBuilder fileTypes(List<String> fileTypes) {
        applicationArgumentSemantics.setFileTypes(fileTypes);
        return this;
    }

    /**
     * The maximum number of times this output may appear.
     */
    public ApplicationArgumentSemanticsBuilder maxCardinality(int maxCardinality) {
        applicationArgumentSemantics.setMaxCardinality(maxCardinality);
        return this;
    }

    /**
     * The minimum number of times this output may appear. -1 is unlimited
     */
    public ApplicationArgumentSemanticsBuilder minCardinality(int minCardinality) {
        applicationArgumentSemantics.setMinCardinality(minCardinality);
        return this;
    }

    public ApplicationArgumentSemanticsBuilder ontology(List<String> ontology) {
        applicationArgumentSemantics.setOntology(ontology);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationArgumentSemantics build() {
        return applicationArgumentSemantics;
    }
}