/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ProfileRequestBuilder {
    //the instance to build
    private ProfileRequest profileRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ProfileRequestBuilder() {
        profileRequest = new ProfileRequest();
    }

    /**
     * The api user's city.
     */
    public ProfileRequestBuilder city(String city) {
        profileRequest.setCity(city);
        return this;
    }

    /**
     * The api user's country.
     */
    public ProfileRequestBuilder country(String country) {
        profileRequest.setCountry(country);
        return this;
    }

    /**
     * The api user's institutional department.
     */
    public ProfileRequestBuilder department(String department) {
        profileRequest.setDepartment(department);
        return this;
    }

    /**
     * The api user's unique email address.
     */
    public ProfileRequestBuilder email(String email) {
        profileRequest.setEmail(email);
        return this;
    }

    /**
     * The api user's fax number.
     */
    public ProfileRequestBuilder fax(String fax) {
        profileRequest.setFax(fax);
        return this;
    }

    /**
     * The api user's first name.
     */
    public ProfileRequestBuilder firstName(String firstName) {
        profileRequest.setFirstName(firstName);
        return this;
    }

    /**
     * The api user's gender. male or female.
     */
    public ProfileRequestBuilder gender(GenderEnum gender) {
        profileRequest.setGender(gender);
        return this;
    }

    /**
     * The api user's home institution
     */
    public ProfileRequestBuilder institution(String institution) {
        profileRequest.setInstitution(institution);
        return this;
    }

    /**
     * The api user's last name.
     */
    public ProfileRequestBuilder lastName(String lastName) {
        profileRequest.setLastName(lastName);
        return this;
    }

    /**
     * The password to set for the new user
     */
    public ProfileRequestBuilder password(String password) {
        profileRequest.setPassword(password);
        return this;
    }

    /**
     * The api user's phone number.
     */
    public ProfileRequestBuilder phone(String phone) {
        profileRequest.setPhone(phone);
        return this;
    }

    /**
     * The api user's position of employment.
     */
    public ProfileRequestBuilder position(String position) {
        profileRequest.setPosition(position);
        return this;
    }

    /**
     * The api user's primary area of research.
     */
    public ProfileRequestBuilder researchArea(String researchArea) {
        profileRequest.setResearchArea(researchArea);
        return this;
    }

    /**
     * The api user's state.
     */
    public ProfileRequestBuilder state(String state) {
        profileRequest.setState(state);
        return this;
    }

    /**
     * The api user's status. active or deleted.
     */
    public ProfileRequestBuilder status(String status) {
        profileRequest.setStatus(status);
        return this;
    }

    /**
     * The api user's unique username.
     */
    public ProfileRequestBuilder username(String username) {
        profileRequest.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProfileRequest build() {
        return profileRequest;
    }
}