/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AbstractApplicationParameterValue 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5673561302663434676L;
    private String defaultValue;
    private boolean enquote = false;
    private String enumValues;
    private int order = 0;
    private boolean required = false;
    private String type = "string";
    private String validator;
    private boolean visible = true;
    /** GETTER
     * The default value for this parameter. The type will be determined by the value.type field.
     */
    @JsonGetter("defaultValue")
    public String getDefaultValue ( ) { 
        return this.defaultValue;
    }
    
    /** SETTER
     * The default value for this parameter. The type will be determined by the value.type field.
     */
    @JsonSetter("defaultValue")
    public void setDefaultValue (String value) { 
        this.defaultValue = value;
    }
 
    /** GETTER
     * Whether the argument value should be surrounded by quotation marks before injection into the wrapper template at runtime
     */
    @JsonGetter("enquote")
    public boolean getEnquote ( ) { 
        return this.enquote;
    }
    
    /** SETTER
     * Whether the argument value should be surrounded by quotation marks before injection into the wrapper template at runtime
     */
    @JsonSetter("enquote")
    public void setEnquote (boolean value) { 
        this.enquote = value;
    }
 
    /** GETTER
     * An array of enumerated object values.
     */
    @JsonGetter("enumValues")
    public String getEnumValues ( ) { 
        return this.enumValues;
    }
    
    /** SETTER
     * An array of enumerated object values.
     */
    @JsonSetter("enumValues")
    public void setEnumValues (String value) { 
        this.enumValues = value;
    }
 
    /** GETTER
     * The order in which this parameter should be printed when generating an execution command for forked execution. This will also be the order in which paramters are returned in the response json.
     */
    @JsonGetter("order")
    public int getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * The order in which this parameter should be printed when generating an execution command for forked execution. This will also be the order in which paramters are returned in the response json.
     */
    @JsonSetter("order")
    public void setOrder (int value) { 
        this.order = value;
    }
 
    /** GETTER
     * Is this parameter required? If visible is false, this must be true.
     */
    @JsonGetter("required")
    public boolean getRequired ( ) { 
        return this.required;
    }
    
    /** SETTER
     * Is this parameter required? If visible is false, this must be true.
     */
    @JsonSetter("required")
    public void setRequired (boolean value) { 
        this.required = value;
    }
 
    /** GETTER
     * The type of this parameter value. (Acceptable values are: "string", "number", "enumeration", "bool", "flag")
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of this parameter value. (Acceptable values are: "string", "number", "enumeration", "bool", "flag")
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The regular expression used to validate this parameter value. For enumerations, separate values with |
     */
    @JsonGetter("validator")
    public String getValidator ( ) { 
        return this.validator;
    }
    
    /** SETTER
     * The regular expression used to validate this parameter value. For enumerations, separate values with |
     */
    @JsonSetter("validator")
    public void setValidator (String value) { 
        this.validator = value;
    }
 
    /** GETTER
     * Should this parameter be visible? If not, there must be a default and it will be required.
     */
    @JsonGetter("visible")
    public boolean getVisible ( ) { 
        return this.visible;
    }
    
    /** SETTER
     * Should this parameter be visible? If not, there must be a default and it will be required.
     */
    @JsonSetter("visible")
    public void setVisible (boolean value) { 
        this.visible = value;
    }
 
}
 