/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationArgumentDetailsBuilder {
    //the instance to build
    private ApplicationArgumentDetails applicationArgumentDetails;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationArgumentDetailsBuilder() {
        applicationArgumentDetails = new ApplicationArgumentDetails();
    }

    /**
     * The command line value of this input (ex -n, --name, -name, etc)
     */
    public ApplicationArgumentDetailsBuilder argument(String argument) {
        applicationArgumentDetails.setArgument(argument);
        return this;
    }

    /**
     * Description of this input.
     */
    public ApplicationArgumentDetailsBuilder description(String description) {
        applicationArgumentDetails.setDescription(description);
        return this;
    }

    /**
     * The label for this input
     */
    public ApplicationArgumentDetailsBuilder label(String label) {
        applicationArgumentDetails.setLabel(label);
        return this;
    }

    /**
     * Whether the argument value should be repeated in front of each user-supplied input before injection into the wrapper template at runtime
     */
    public ApplicationArgumentDetailsBuilder repeatArgument(boolean repeatArgument) {
        applicationArgumentDetails.setRepeatArgument(repeatArgument);
        return this;
    }

    /**
     * Whether the argument value should be passed into the wrapper at run time
     */
    public ApplicationArgumentDetailsBuilder showArgument(boolean showArgument) {
        applicationArgumentDetails.setShowArgument(showArgument);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationArgumentDetails build() {
        return applicationArgumentDetails;
    }
}