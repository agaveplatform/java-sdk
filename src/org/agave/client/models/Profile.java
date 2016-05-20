/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Profile 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5229425110220611094L;
    private String city;
    private String country;
    private String department;
    private String email;
    private String fax;
    private String firstName;
    private GenderEnum gender;
    private String institution;
    private String lastName;
    private String password;
    private String phone;
    private String position;
    private String researchArea;
    private String state;
    private String username;
    private String uuid;
    /** GETTER
     * The api user's city.
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * The api user's city.
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * The api user's country.
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * The api user's country.
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * The api user's institutional department.
     */
    @JsonGetter("department")
    public String getDepartment ( ) { 
        return this.department;
    }
    
    /** SETTER
     * The api user's institutional department.
     */
    @JsonSetter("department")
    public void setDepartment (String value) { 
        this.department = value;
    }
 
    /** GETTER
     * The api user's unique email address.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The api user's unique email address.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * The api user's fax number.
     */
    @JsonGetter("fax")
    public String getFax ( ) { 
        return this.fax;
    }
    
    /** SETTER
     * The api user's fax number.
     */
    @JsonSetter("fax")
    public void setFax (String value) { 
        this.fax = value;
    }
 
    /** GETTER
     * The api user's first name.
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * The api user's first name.
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * The api user's gender. male or female.
     */
    @JsonGetter("gender")
    public GenderEnum getGender ( ) { 
        return this.gender;
    }
    
    /** SETTER
     * The api user's gender. male or female.
     */
    @JsonSetter("gender")
    public void setGender (GenderEnum value) { 
        this.gender = value;
    }
 
    /** GETTER
     * The api user's home institution
     */
    @JsonGetter("institution")
    public String getInstitution ( ) { 
        return this.institution;
    }
    
    /** SETTER
     * The api user's home institution
     */
    @JsonSetter("institution")
    public void setInstitution (String value) { 
        this.institution = value;
    }
 
    /** GETTER
     * The api user's last name.
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * The api user's last name.
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * The password to set for this profile
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * The password to set for this profile
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
    /** GETTER
     * The api user's phone number.
     */
    @JsonGetter("phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * The api user's phone number.
     */
    @JsonSetter("phone")
    public void setPhone (String value) { 
        this.phone = value;
    }
 
    /** GETTER
     * The api user's position of employment.
     */
    @JsonGetter("position")
    public String getPosition ( ) { 
        return this.position;
    }
    
    /** SETTER
     * The api user's position of employment.
     */
    @JsonSetter("position")
    public void setPosition (String value) { 
        this.position = value;
    }
 
    /** GETTER
     * The api user's primary area of research.
     */
    @JsonGetter("researchArea")
    public String getResearchArea ( ) { 
        return this.researchArea;
    }
    
    /** SETTER
     * The api user's primary area of research.
     */
    @JsonSetter("researchArea")
    public void setResearchArea (String value) { 
        this.researchArea = value;
    }
 
    /** GETTER
     * The api user's state.
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * The api user's state.
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * The api user's unique username.
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * The api user's unique username.
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
    /** GETTER
     * The uuid of the user
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * The uuid of the user
     */
    @JsonSetter("uuid")
    private void setUuid (String value) { 
        this.uuid = value;
    }
 
}
 