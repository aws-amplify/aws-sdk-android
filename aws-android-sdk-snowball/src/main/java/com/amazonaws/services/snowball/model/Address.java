/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * The address that you want the Snowball or Snowballs associated with a
 * specific job to be shipped to. Addresses are validated at the time of
 * creation. The address you provide must be located within the serviceable area
 * of your region. Although no individual elements of the <code>Address</code>
 * are required, if the address is invalid or unsupported, then an exception is
 * thrown.
 * </p>
 */
public class Address implements Serializable {
    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String addressId;

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String company;

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String street1;

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String street2;

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String street3;

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String city;

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String stateOrProvince;

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String prefectureOrDistrict;

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String landmark;

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String country;

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String postalCode;

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be
     * delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * If the address you are creating is a primary address, then set this
     * option to true. This field is not supported in most regions.
     * </p>
     */
    private Boolean isRestricted;

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The unique ID for an address.
     *         </p>
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The unique ID for an address.
     *            </p>
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The unique ID for an address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of a person to receive a Snowball at an address.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of a person to receive a Snowball at an address.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of a person to receive a Snowball at an address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the company to receive a Snowball at an address.
     *         </p>
     */
    public String getCompany() {
        return company;
    }

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param company <p>
     *            The name of the company to receive a Snowball at an address.
     *            </p>
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param company <p>
     *            The name of the company to receive a Snowball at an address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The first line in a street address that a Snowball is to be
     *         delivered to.
     *         </p>
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param street1 <p>
     *            The first line in a street address that a Snowball is to be
     *            delivered to.
     *            </p>
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param street1 <p>
     *            The first line in a street address that a Snowball is to be
     *            delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withStreet1(String street1) {
        this.street1 = street1;
        return this;
    }

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The second line in a street address that a Snowball is to be
     *         delivered to.
     *         </p>
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param street2 <p>
     *            The second line in a street address that a Snowball is to be
     *            delivered to.
     *            </p>
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param street2 <p>
     *            The second line in a street address that a Snowball is to be
     *            delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The third line in a street address that a Snowball is to be
     *         delivered to.
     *         </p>
     */
    public String getStreet3() {
        return street3;
    }

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param street3 <p>
     *            The third line in a street address that a Snowball is to be
     *            delivered to.
     *            </p>
     */
    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param street3 <p>
     *            The third line in a street address that a Snowball is to be
     *            delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withStreet3(String street3) {
        this.street3 = street3;
        return this;
    }

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The city in an address that a Snowball is to be delivered to.
     *         </p>
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param city <p>
     *            The city in an address that a Snowball is to be delivered to.
     *            </p>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param city <p>
     *            The city in an address that a Snowball is to be delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The state or province in an address that a Snowball is to be
     *         delivered to.
     *         </p>
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param stateOrProvince <p>
     *            The state or province in an address that a Snowball is to be
     *            delivered to.
     *            </p>
     */
    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param stateOrProvince <p>
     *            The state or province in an address that a Snowball is to be
     *            delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         This field is no longer used and the value is ignored.
     *         </p>
     */
    public String getPrefectureOrDistrict() {
        return prefectureOrDistrict;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param prefectureOrDistrict <p>
     *            This field is no longer used and the value is ignored.
     *            </p>
     */
    public void setPrefectureOrDistrict(String prefectureOrDistrict) {
        this.prefectureOrDistrict = prefectureOrDistrict;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param prefectureOrDistrict <p>
     *            This field is no longer used and the value is ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withPrefectureOrDistrict(String prefectureOrDistrict) {
        this.prefectureOrDistrict = prefectureOrDistrict;
        return this;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         This field is no longer used and the value is ignored.
     *         </p>
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param landmark <p>
     *            This field is no longer used and the value is ignored.
     *            </p>
     */
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param landmark <p>
     *            This field is no longer used and the value is ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withLandmark(String landmark) {
        this.landmark = landmark;
        return this;
    }

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The country in an address that a Snowball is to be delivered to.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param country <p>
     *            The country in an address that a Snowball is to be delivered
     *            to.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param country <p>
     *            The country in an address that a Snowball is to be delivered
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The postal code in an address that a Snowball is to be delivered
     *         to.
     *         </p>
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param postalCode <p>
     *            The postal code in an address that a Snowball is to be
     *            delivered to.
     *            </p>
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param postalCode <p>
     *            The postal code in an address that a Snowball is to be
     *            delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be
     * delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The phone number associated with an address that a Snowball is to
     *         be delivered to.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be
     * delivered to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param phoneNumber <p>
     *            The phone number associated with an address that a Snowball is
     *            to be delivered to.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be
     * delivered to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param phoneNumber <p>
     *            The phone number associated with an address that a Snowball is
     *            to be delivered to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this
     * option to true. This field is not supported in most regions.
     * </p>
     *
     * @return <p>
     *         If the address you are creating is a primary address, then set
     *         this option to true. This field is not supported in most regions.
     *         </p>
     */
    public Boolean isIsRestricted() {
        return isRestricted;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this
     * option to true. This field is not supported in most regions.
     * </p>
     *
     * @return <p>
     *         If the address you are creating is a primary address, then set
     *         this option to true. This field is not supported in most regions.
     *         </p>
     */
    public Boolean getIsRestricted() {
        return isRestricted;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this
     * option to true. This field is not supported in most regions.
     * </p>
     *
     * @param isRestricted <p>
     *            If the address you are creating is a primary address, then set
     *            this option to true. This field is not supported in most
     *            regions.
     *            </p>
     */
    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this
     * option to true. This field is not supported in most regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isRestricted <p>
     *            If the address you are creating is a primary address, then set
     *            this option to true. This field is not supported in most
     *            regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Address withIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCompany() != null)
            sb.append("Company: " + getCompany() + ",");
        if (getStreet1() != null)
            sb.append("Street1: " + getStreet1() + ",");
        if (getStreet2() != null)
            sb.append("Street2: " + getStreet2() + ",");
        if (getStreet3() != null)
            sb.append("Street3: " + getStreet3() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getStateOrProvince() != null)
            sb.append("StateOrProvince: " + getStateOrProvince() + ",");
        if (getPrefectureOrDistrict() != null)
            sb.append("PrefectureOrDistrict: " + getPrefectureOrDistrict() + ",");
        if (getLandmark() != null)
            sb.append("Landmark: " + getLandmark() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getPostalCode() != null)
            sb.append("PostalCode: " + getPostalCode() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getIsRestricted() != null)
            sb.append("IsRestricted: " + getIsRestricted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        hashCode = prime * hashCode + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        hashCode = prime * hashCode + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode
                + ((getStateOrProvince() == null) ? 0 : getStateOrProvince().hashCode());
        hashCode = prime * hashCode
                + ((getPrefectureOrDistrict() == null) ? 0 : getPrefectureOrDistrict().hashCode());
        hashCode = prime * hashCode + ((getLandmark() == null) ? 0 : getLandmark().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getIsRestricted() == null) ? 0 : getIsRestricted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;

        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null
                && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getStreet1() == null ^ this.getStreet1() == null)
            return false;
        if (other.getStreet1() != null && other.getStreet1().equals(this.getStreet1()) == false)
            return false;
        if (other.getStreet2() == null ^ this.getStreet2() == null)
            return false;
        if (other.getStreet2() != null && other.getStreet2().equals(this.getStreet2()) == false)
            return false;
        if (other.getStreet3() == null ^ this.getStreet3() == null)
            return false;
        if (other.getStreet3() != null && other.getStreet3().equals(this.getStreet3()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getStateOrProvince() == null ^ this.getStateOrProvince() == null)
            return false;
        if (other.getStateOrProvince() != null
                && other.getStateOrProvince().equals(this.getStateOrProvince()) == false)
            return false;
        if (other.getPrefectureOrDistrict() == null ^ this.getPrefectureOrDistrict() == null)
            return false;
        if (other.getPrefectureOrDistrict() != null
                && other.getPrefectureOrDistrict().equals(this.getPrefectureOrDistrict()) == false)
            return false;
        if (other.getLandmark() == null ^ this.getLandmark() == null)
            return false;
        if (other.getLandmark() != null && other.getLandmark().equals(this.getLandmark()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null
                && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getIsRestricted() == null ^ this.getIsRestricted() == null)
            return false;
        if (other.getIsRestricted() != null
                && other.getIsRestricted().equals(this.getIsRestricted()) == false)
            return false;
        return true;
    }
}
