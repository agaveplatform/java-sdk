/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ProfileBuilder {
    //the instance to build
    private Profile profile;

    /**
     * Default constructor to initialize the instance
     */
    public ProfileBuilder() {
        profile = new Profile();
    }

    /**
     * The api user's city.
     */
    public ProfileBuilder city(String city) {
        profile.setCity(city);
        return this;
    }

    /**
     * The api user's country.
     */
    public ProfileBuilder country(String country) {
        profile.setCountry(country);
        return this;
    }

    /**
     * The api user's institutional department.
     */
    public ProfileBuilder department(String department) {
        profile.setDepartment(department);
        return this;
    }

    /**
     * The api user's unique email address.
     */
    public ProfileBuilder email(String email) {
        profile.setEmail(email);
        return this;
    }

    /**
     * The api user's fax number.
     */
    public ProfileBuilder fax(String fax) {
        profile.setFax(fax);
        return this;
    }

    /**
     * The api user's first name.
     */
    public ProfileBuilder firstName(String firstName) {
        profile.setFirstName(firstName);
        return this;
    }

    /**
     * The api user's gender. male or female.
     */
    public ProfileBuilder gender(GenderEnum gender) {
        profile.setGender(gender);
        return this;
    }

    /**
     * The api user's home institution
     */
    public ProfileBuilder institution(String institution) {
        profile.setInstitution(institution);
        return this;
    }

    /**
     * The api user's last name.
     */
    public ProfileBuilder lastName(String lastName) {
        profile.setLastName(lastName);
        return this;
    }

    /**
     * The password to set for this profile
     */
    public ProfileBuilder password(String password) {
        profile.setPassword(password);
        return this;
    }

    /**
     * The api user's phone number.
     */
    public ProfileBuilder phone(String phone) {
        profile.setPhone(phone);
        return this;
    }

    /**
     * The api user's position of employment.
     */
    public ProfileBuilder position(String position) {
        profile.setPosition(position);
        return this;
    }

    /**
     * The api user's primary area of research.
     */
    public ProfileBuilder researchArea(String researchArea) {
        profile.setResearchArea(researchArea);
        return this;
    }

    /**
     * The api user's state.
     */
    public ProfileBuilder state(String state) {
        profile.setState(state);
        return this;
    }

    /**
     * The api user's unique username.
     */
    public ProfileBuilder username(String username) {
        profile.setUsername(username);
        return this;
    }

    /**
     * The uuid of the user
     */
    public ProfileBuilder uuid(String uuid) {
        profile.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Profile build() {
        return profile;
    }
}