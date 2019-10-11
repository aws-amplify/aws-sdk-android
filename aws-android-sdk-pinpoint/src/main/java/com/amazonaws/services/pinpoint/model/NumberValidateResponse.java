/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a phone number.
 * </p>
 */
public class NumberValidateResponse implements Serializable {
    /**
     * <p>
     * The carrier or service provider that the phone number is currently
     * registered with. In some countries and regions, this value may be the
     * carrier or service provider that the phone number was originally
     * registered with.
     * </p>
     */
    private String carrier;

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     */
    private String city;

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the
     * phone number was originally registered.
     * </p>
     */
    private String cleansedPhoneNumberE164;

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone
     * number was originally registered.
     * </p>
     */
    private String cleansedPhoneNumberNational;

    /**
     * <p>
     * The name of the country or region where the phone number was originally
     * registered.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the phone number was originally registered.
     * </p>
     */
    private String countryCodeIso2;

    /**
     * <p>
     * The numeric code for the country or region where the phone number was
     * originally registered.
     * </p>
     */
    private String countryCodeNumeric;

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     */
    private String county;

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in
     * the request body.
     * </p>
     */
    private String originalCountryCodeIso2;

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     */
    private String originalPhoneNumber;

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     */
    private String phoneType;

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile),
     * 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
     * </p>
     */
    private Integer phoneTypeCode;

    /**
     * <p>
     * The time zone for the location where the phone number was originally
     * registered.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was
     * originally registered.
     * </p>
     */
    private String zipCode;

    /**
     * <p>
     * The carrier or service provider that the phone number is currently
     * registered with. In some countries and regions, this value may be the
     * carrier or service provider that the phone number was originally
     * registered with.
     * </p>
     *
     * @return <p>
     *         The carrier or service provider that the phone number is
     *         currently registered with. In some countries and regions, this
     *         value may be the carrier or service provider that the phone
     *         number was originally registered with.
     *         </p>
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * <p>
     * The carrier or service provider that the phone number is currently
     * registered with. In some countries and regions, this value may be the
     * carrier or service provider that the phone number was originally
     * registered with.
     * </p>
     *
     * @param carrier <p>
     *            The carrier or service provider that the phone number is
     *            currently registered with. In some countries and regions, this
     *            value may be the carrier or service provider that the phone
     *            number was originally registered with.
     *            </p>
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * <p>
     * The carrier or service provider that the phone number is currently
     * registered with. In some countries and regions, this value may be the
     * carrier or service provider that the phone number was originally
     * registered with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param carrier <p>
     *            The carrier or service provider that the phone number is
     *            currently registered with. In some countries and regions, this
     *            value may be the carrier or service provider that the phone
     *            number was originally registered with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     *
     * @return <p>
     *         The name of the city where the phone number was originally
     *         registered.
     *         </p>
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     *
     * @param city <p>
     *            The name of the city where the phone number was originally
     *            registered.
     *            </p>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The name of the city where the phone number was originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city <p>
     *            The name of the city where the phone number was originally
     *            registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the
     * phone number was originally registered.
     * </p>
     *
     * @return <p>
     *         The cleansed phone number, in E.164 format, for the location
     *         where the phone number was originally registered.
     *         </p>
     */
    public String getCleansedPhoneNumberE164() {
        return cleansedPhoneNumberE164;
    }

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the
     * phone number was originally registered.
     * </p>
     *
     * @param cleansedPhoneNumberE164 <p>
     *            The cleansed phone number, in E.164 format, for the location
     *            where the phone number was originally registered.
     *            </p>
     */
    public void setCleansedPhoneNumberE164(String cleansedPhoneNumberE164) {
        this.cleansedPhoneNumberE164 = cleansedPhoneNumberE164;
    }

    /**
     * <p>
     * The cleansed phone number, in E.164 format, for the location where the
     * phone number was originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cleansedPhoneNumberE164 <p>
     *            The cleansed phone number, in E.164 format, for the location
     *            where the phone number was originally registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCleansedPhoneNumberE164(String cleansedPhoneNumberE164) {
        this.cleansedPhoneNumberE164 = cleansedPhoneNumberE164;
        return this;
    }

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone
     * number was originally registered.
     * </p>
     *
     * @return <p>
     *         The cleansed phone number, in the format for the location where
     *         the phone number was originally registered.
     *         </p>
     */
    public String getCleansedPhoneNumberNational() {
        return cleansedPhoneNumberNational;
    }

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone
     * number was originally registered.
     * </p>
     *
     * @param cleansedPhoneNumberNational <p>
     *            The cleansed phone number, in the format for the location
     *            where the phone number was originally registered.
     *            </p>
     */
    public void setCleansedPhoneNumberNational(String cleansedPhoneNumberNational) {
        this.cleansedPhoneNumberNational = cleansedPhoneNumberNational;
    }

    /**
     * <p>
     * The cleansed phone number, in the format for the location where the phone
     * number was originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cleansedPhoneNumberNational <p>
     *            The cleansed phone number, in the format for the location
     *            where the phone number was originally registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCleansedPhoneNumberNational(String cleansedPhoneNumberNational) {
        this.cleansedPhoneNumberNational = cleansedPhoneNumberNational;
        return this;
    }

    /**
     * <p>
     * The name of the country or region where the phone number was originally
     * registered.
     * </p>
     *
     * @return <p>
     *         The name of the country or region where the phone number was
     *         originally registered.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The name of the country or region where the phone number was originally
     * registered.
     * </p>
     *
     * @param country <p>
     *            The name of the country or region where the phone number was
     *            originally registered.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The name of the country or region where the phone number was originally
     * registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The name of the country or region where the phone number was
     *            originally registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the phone number was originally registered.
     * </p>
     *
     * @return <p>
     *         The two-character code, in ISO 3166-1 alpha-2 format, for the
     *         country or region where the phone number was originally
     *         registered.
     *         </p>
     */
    public String getCountryCodeIso2() {
        return countryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the phone number was originally registered.
     * </p>
     *
     * @param countryCodeIso2 <p>
     *            The two-character code, in ISO 3166-1 alpha-2 format, for the
     *            country or region where the phone number was originally
     *            registered.
     *            </p>
     */
    public void setCountryCodeIso2(String countryCodeIso2) {
        this.countryCodeIso2 = countryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the phone number was originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countryCodeIso2 <p>
     *            The two-character code, in ISO 3166-1 alpha-2 format, for the
     *            country or region where the phone number was originally
     *            registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCountryCodeIso2(String countryCodeIso2) {
        this.countryCodeIso2 = countryCodeIso2;
        return this;
    }

    /**
     * <p>
     * The numeric code for the country or region where the phone number was
     * originally registered.
     * </p>
     *
     * @return <p>
     *         The numeric code for the country or region where the phone number
     *         was originally registered.
     *         </p>
     */
    public String getCountryCodeNumeric() {
        return countryCodeNumeric;
    }

    /**
     * <p>
     * The numeric code for the country or region where the phone number was
     * originally registered.
     * </p>
     *
     * @param countryCodeNumeric <p>
     *            The numeric code for the country or region where the phone
     *            number was originally registered.
     *            </p>
     */
    public void setCountryCodeNumeric(String countryCodeNumeric) {
        this.countryCodeNumeric = countryCodeNumeric;
    }

    /**
     * <p>
     * The numeric code for the country or region where the phone number was
     * originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countryCodeNumeric <p>
     *            The numeric code for the country or region where the phone
     *            number was originally registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCountryCodeNumeric(String countryCodeNumeric) {
        this.countryCodeNumeric = countryCodeNumeric;
        return this;
    }

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     *
     * @return <p>
     *         The name of the county where the phone number was originally
     *         registered.
     *         </p>
     */
    public String getCounty() {
        return county;
    }

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     *
     * @param county <p>
     *            The name of the county where the phone number was originally
     *            registered.
     *            </p>
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * <p>
     * The name of the county where the phone number was originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param county <p>
     *            The name of the county where the phone number was originally
     *            registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCounty(String county) {
        this.county = county;
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in
     * the request body.
     * </p>
     *
     * @return <p>
     *         The two-character code, in ISO 3166-1 alpha-2 format, that was
     *         sent in the request body.
     *         </p>
     */
    public String getOriginalCountryCodeIso2() {
        return originalCountryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in
     * the request body.
     * </p>
     *
     * @param originalCountryCodeIso2 <p>
     *            The two-character code, in ISO 3166-1 alpha-2 format, that was
     *            sent in the request body.
     *            </p>
     */
    public void setOriginalCountryCodeIso2(String originalCountryCodeIso2) {
        this.originalCountryCodeIso2 = originalCountryCodeIso2;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in
     * the request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalCountryCodeIso2 <p>
     *            The two-character code, in ISO 3166-1 alpha-2 format, that was
     *            sent in the request body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withOriginalCountryCodeIso2(String originalCountryCodeIso2) {
        this.originalCountryCodeIso2 = originalCountryCodeIso2;
        return this;
    }

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     *
     * @return <p>
     *         The phone number that was sent in the request body.
     *         </p>
     */
    public String getOriginalPhoneNumber() {
        return originalPhoneNumber;
    }

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     *
     * @param originalPhoneNumber <p>
     *            The phone number that was sent in the request body.
     *            </p>
     */
    public void setOriginalPhoneNumber(String originalPhoneNumber) {
        this.originalPhoneNumber = originalPhoneNumber;
    }

    /**
     * <p>
     * The phone number that was sent in the request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalPhoneNumber <p>
     *            The phone number that was sent in the request body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withOriginalPhoneNumber(String originalPhoneNumber) {
        this.originalPhoneNumber = originalPhoneNumber;
        return this;
    }

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     *
     * @return <p>
     *         The description of the phone type. Valid values are: MOBILE,
     *         LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     *         </p>
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     *
     * @param phoneType <p>
     *            The description of the phone type. Valid values are: MOBILE,
     *            LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     *            </p>
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * <p>
     * The description of the phone type. Valid values are: MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneType <p>
     *            The description of the phone type. Valid values are: MOBILE,
     *            LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile),
     * 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
     * </p>
     *
     * @return <p>
     *         The phone type, represented by an integer. Valid values are: 0
     *         (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5
     *         (prepaid).
     *         </p>
     */
    public Integer getPhoneTypeCode() {
        return phoneTypeCode;
    }

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile),
     * 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
     * </p>
     *
     * @param phoneTypeCode <p>
     *            The phone type, represented by an integer. Valid values are: 0
     *            (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and
     *            5 (prepaid).
     *            </p>
     */
    public void setPhoneTypeCode(Integer phoneTypeCode) {
        this.phoneTypeCode = phoneTypeCode;
    }

    /**
     * <p>
     * The phone type, represented by an integer. Valid values are: 0 (mobile),
     * 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneTypeCode <p>
     *            The phone type, represented by an integer. Valid values are: 0
     *            (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and
     *            5 (prepaid).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withPhoneTypeCode(Integer phoneTypeCode) {
        this.phoneTypeCode = phoneTypeCode;
        return this;
    }

    /**
     * <p>
     * The time zone for the location where the phone number was originally
     * registered.
     * </p>
     *
     * @return <p>
     *         The time zone for the location where the phone number was
     *         originally registered.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone for the location where the phone number was originally
     * registered.
     * </p>
     *
     * @param timezone <p>
     *            The time zone for the location where the phone number was
     *            originally registered.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone for the location where the phone number was originally
     * registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The time zone for the location where the phone number was
     *            originally registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was
     * originally registered.
     * </p>
     *
     * @return <p>
     *         The postal or ZIP code for the location where the phone number
     *         was originally registered.
     *         </p>
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was
     * originally registered.
     * </p>
     *
     * @param zipCode <p>
     *            The postal or ZIP code for the location where the phone number
     *            was originally registered.
     *            </p>
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the location where the phone number was
     * originally registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zipCode <p>
     *            The postal or ZIP code for the location where the phone number
     *            was originally registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withZipCode(String zipCode) {
        this.zipCode = zipCode;
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
        if (getCarrier() != null)
            sb.append("Carrier: " + getCarrier() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getCleansedPhoneNumberE164() != null)
            sb.append("CleansedPhoneNumberE164: " + getCleansedPhoneNumberE164() + ",");
        if (getCleansedPhoneNumberNational() != null)
            sb.append("CleansedPhoneNumberNational: " + getCleansedPhoneNumberNational() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getCountryCodeIso2() != null)
            sb.append("CountryCodeIso2: " + getCountryCodeIso2() + ",");
        if (getCountryCodeNumeric() != null)
            sb.append("CountryCodeNumeric: " + getCountryCodeNumeric() + ",");
        if (getCounty() != null)
            sb.append("County: " + getCounty() + ",");
        if (getOriginalCountryCodeIso2() != null)
            sb.append("OriginalCountryCodeIso2: " + getOriginalCountryCodeIso2() + ",");
        if (getOriginalPhoneNumber() != null)
            sb.append("OriginalPhoneNumber: " + getOriginalPhoneNumber() + ",");
        if (getPhoneType() != null)
            sb.append("PhoneType: " + getPhoneType() + ",");
        if (getPhoneTypeCode() != null)
            sb.append("PhoneTypeCode: " + getPhoneTypeCode() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getZipCode() != null)
            sb.append("ZipCode: " + getZipCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime
                * hashCode
                + ((getCleansedPhoneNumberE164() == null) ? 0 : getCleansedPhoneNumberE164()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCleansedPhoneNumberNational() == null) ? 0
                        : getCleansedPhoneNumberNational().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode
                + ((getCountryCodeIso2() == null) ? 0 : getCountryCodeIso2().hashCode());
        hashCode = prime * hashCode
                + ((getCountryCodeNumeric() == null) ? 0 : getCountryCodeNumeric().hashCode());
        hashCode = prime * hashCode + ((getCounty() == null) ? 0 : getCounty().hashCode());
        hashCode = prime
                * hashCode
                + ((getOriginalCountryCodeIso2() == null) ? 0 : getOriginalCountryCodeIso2()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOriginalPhoneNumber() == null) ? 0 : getOriginalPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneType() == null) ? 0 : getPhoneType().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneTypeCode() == null) ? 0 : getPhoneTypeCode().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberValidateResponse == false)
            return false;
        NumberValidateResponse other = (NumberValidateResponse) obj;

        if (other.getCarrier() == null ^ this.getCarrier() == null)
            return false;
        if (other.getCarrier() != null && other.getCarrier().equals(this.getCarrier()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCleansedPhoneNumberE164() == null ^ this.getCleansedPhoneNumberE164() == null)
            return false;
        if (other.getCleansedPhoneNumberE164() != null
                && other.getCleansedPhoneNumberE164().equals(this.getCleansedPhoneNumberE164()) == false)
            return false;
        if (other.getCleansedPhoneNumberNational() == null
                ^ this.getCleansedPhoneNumberNational() == null)
            return false;
        if (other.getCleansedPhoneNumberNational() != null
                && other.getCleansedPhoneNumberNational().equals(
                        this.getCleansedPhoneNumberNational()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getCountryCodeIso2() == null ^ this.getCountryCodeIso2() == null)
            return false;
        if (other.getCountryCodeIso2() != null
                && other.getCountryCodeIso2().equals(this.getCountryCodeIso2()) == false)
            return false;
        if (other.getCountryCodeNumeric() == null ^ this.getCountryCodeNumeric() == null)
            return false;
        if (other.getCountryCodeNumeric() != null
                && other.getCountryCodeNumeric().equals(this.getCountryCodeNumeric()) == false)
            return false;
        if (other.getCounty() == null ^ this.getCounty() == null)
            return false;
        if (other.getCounty() != null && other.getCounty().equals(this.getCounty()) == false)
            return false;
        if (other.getOriginalCountryCodeIso2() == null ^ this.getOriginalCountryCodeIso2() == null)
            return false;
        if (other.getOriginalCountryCodeIso2() != null
                && other.getOriginalCountryCodeIso2().equals(this.getOriginalCountryCodeIso2()) == false)
            return false;
        if (other.getOriginalPhoneNumber() == null ^ this.getOriginalPhoneNumber() == null)
            return false;
        if (other.getOriginalPhoneNumber() != null
                && other.getOriginalPhoneNumber().equals(this.getOriginalPhoneNumber()) == false)
            return false;
        if (other.getPhoneType() == null ^ this.getPhoneType() == null)
            return false;
        if (other.getPhoneType() != null
                && other.getPhoneType().equals(this.getPhoneType()) == false)
            return false;
        if (other.getPhoneTypeCode() == null ^ this.getPhoneTypeCode() == null)
            return false;
        if (other.getPhoneTypeCode() != null
                && other.getPhoneTypeCode().equals(this.getPhoneTypeCode()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getZipCode() == null ^ this.getZipCode() == null)
            return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false)
            return false;
        return true;
    }
}
