/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationArgumentDetails 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5739079436173068862L;
    private String argument;
    private String description;
    private String label;
    private boolean repeatArgument = false;
    private boolean showArgument = false;
    /** GETTER
     * The command line value of this input (ex -n, --name, -name, etc)
     */
    @JsonGetter("argument")
    public String getArgument ( ) { 
        return this.argument;
    }
    
    /** SETTER
     * The command line value of this input (ex -n, --name, -name, etc)
     */
    @JsonSetter("argument")
    public void setArgument (String value) { 
        this.argument = value;
    }
 
    /** GETTER
     * Description of this input.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description of this input.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The label for this input
     */
    @JsonGetter("label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * The label for this input
     */
    @JsonSetter("label")
    public void setLabel (String value) { 
        this.label = value;
    }
 
    /** GETTER
     * Whether the argument value should be repeated in front of each user-supplied input before injection into the wrapper template at runtime
     */
    @JsonGetter("repeatArgument")
    public boolean getRepeatArgument ( ) { 
        return this.repeatArgument;
    }
    
    /** SETTER
     * Whether the argument value should be repeated in front of each user-supplied input before injection into the wrapper template at runtime
     */
    @JsonSetter("repeatArgument")
    public void setRepeatArgument (boolean value) { 
        this.repeatArgument = value;
    }
 
    /** GETTER
     * Whether the argument value should be passed into the wrapper at run time
     */
    @JsonGetter("showArgument")
    public boolean getShowArgument ( ) { 
        return this.showArgument;
    }
    
    /** SETTER
     * Whether the argument value should be passed into the wrapper at run time
     */
    @JsonSetter("showArgument")
    public void setShowArgument (boolean value) { 
        this.showArgument = value;
    }
 
}
 