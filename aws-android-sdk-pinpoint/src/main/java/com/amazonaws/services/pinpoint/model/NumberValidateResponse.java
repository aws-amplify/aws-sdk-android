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
 * Phone Number Validate response.
 */
public class NumberValidateResponse implements Serializable {
    /**
     * The carrier or servive provider that the phone number is currently
     * registered with.
     */
    private String carrier;

    /**
     * The city where the phone number was originally registered.
     */
    private String city;

    /**
     * The cleansed phone number, shown in E.164 format.
     */
    private String cleansedPhoneNumberE164;

    /**
     * The cleansed phone number, shown in the local phone number format.
     */
    private String cleansedPhoneNumberNational;

    /**
     * The country or region where the phone number was originally registered.
     */
    private String country;

    /**
     * The two-character ISO code for the country or region where the phone
     * number was originally registered.
     */
    private String countryCodeIso2;

    /**
     * The numeric code for the country or region where the phone number was
     * originally registered.
     */
    private String countryCodeNumeric;

    /**
     * The county where the phone number was originally registered.
     */
    private String county;

    /**
     * The two-character code (in ISO 3166-1 alpha-2 format) for the country or
     * region in the request body.
     */
    private String originalCountryCodeIso2;

    /**
     * The phone number that you included in the request body.
     */
    private String originalPhoneNumber;

    /**
     * A description of the phone type. Possible values are MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     */
    private String phoneType;

    /**
     * The phone type, represented by an integer. Possible values include 0
     * (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5
     * (PREPAID).
     */
    private Integer phoneTypeCode;

    /**
     * The time zone for the location where the phone number was originally
     * registered.
     */
    private String timezone;

    /**
     * The postal code for the location where the phone number was originally
     * registered.
     */
    private String zipCode;

    /**
     * The carrier or servive provider that the phone number is currently
     * registered with.
     *
     * @return The carrier or servive provider that the phone number is
     *         currently registered with.
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * The carrier or servive provider that the phone number is currently
     * registered with.
     *
     * @param carrier The carrier or servive provider that the phone number is
     *            currently registered with.
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * The carrier or servive provider that the phone number is currently
     * registered with.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param carrier The carrier or servive provider that the phone number is
     *            currently registered with.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * The city where the phone number was originally registered.
     *
     * @return The city where the phone number was originally registered.
     */
    public String getCity() {
        return city;
    }

    /**
     * The city where the phone number was originally registered.
     *
     * @param city The city where the phone number was originally registered.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The city where the phone number was originally registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city The city where the phone number was originally registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * The cleansed phone number, shown in E.164 format.
     *
     * @return The cleansed phone number, shown in E.164 format.
     */
    public String getCleansedPhoneNumberE164() {
        return cleansedPhoneNumberE164;
    }

    /**
     * The cleansed phone number, shown in E.164 format.
     *
     * @param cleansedPhoneNumberE164 The cleansed phone number, shown in E.164
     *            format.
     */
    public void setCleansedPhoneNumberE164(String cleansedPhoneNumberE164) {
        this.cleansedPhoneNumberE164 = cleansedPhoneNumberE164;
    }

    /**
     * The cleansed phone number, shown in E.164 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cleansedPhoneNumberE164 The cleansed phone number, shown in E.164
     *            format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCleansedPhoneNumberE164(String cleansedPhoneNumberE164) {
        this.cleansedPhoneNumberE164 = cleansedPhoneNumberE164;
        return this;
    }

    /**
     * The cleansed phone number, shown in the local phone number format.
     *
     * @return The cleansed phone number, shown in the local phone number
     *         format.
     */
    public String getCleansedPhoneNumberNational() {
        return cleansedPhoneNumberNational;
    }

    /**
     * The cleansed phone number, shown in the local phone number format.
     *
     * @param cleansedPhoneNumberNational The cleansed phone number, shown in
     *            the local phone number format.
     */
    public void setCleansedPhoneNumberNational(String cleansedPhoneNumberNational) {
        this.cleansedPhoneNumberNational = cleansedPhoneNumberNational;
    }

    /**
     * The cleansed phone number, shown in the local phone number format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cleansedPhoneNumberNational The cleansed phone number, shown in
     *            the local phone number format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCleansedPhoneNumberNational(String cleansedPhoneNumberNational) {
        this.cleansedPhoneNumberNational = cleansedPhoneNumberNational;
        return this;
    }

    /**
     * The country or region where the phone number was originally registered.
     *
     * @return The country or region where the phone number was originally
     *         registered.
     */
    public String getCountry() {
        return country;
    }

    /**
     * The country or region where the phone number was originally registered.
     *
     * @param country The country or region where the phone number was
     *            originally registered.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The country or region where the phone number was originally registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country The country or region where the phone number was
     *            originally registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * The two-character ISO code for the country or region where the phone
     * number was originally registered.
     *
     * @return The two-character ISO code for the country or region where the
     *         phone number was originally registered.
     */
    public String getCountryCodeIso2() {
        return countryCodeIso2;
    }

    /**
     * The two-character ISO code for the country or region where the phone
     * number was originally registered.
     *
     * @param countryCodeIso2 The two-character ISO code for the country or
     *            region where the phone number was originally registered.
     */
    public void setCountryCodeIso2(String countryCodeIso2) {
        this.countryCodeIso2 = countryCodeIso2;
    }

    /**
     * The two-character ISO code for the country or region where the phone
     * number was originally registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countryCodeIso2 The two-character ISO code for the country or
     *            region where the phone number was originally registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCountryCodeIso2(String countryCodeIso2) {
        this.countryCodeIso2 = countryCodeIso2;
        return this;
    }

    /**
     * The numeric code for the country or region where the phone number was
     * originally registered.
     *
     * @return The numeric code for the country or region where the phone number
     *         was originally registered.
     */
    public String getCountryCodeNumeric() {
        return countryCodeNumeric;
    }

    /**
     * The numeric code for the country or region where the phone number was
     * originally registered.
     *
     * @param countryCodeNumeric The numeric code for the country or region
     *            where the phone number was originally registered.
     */
    public void setCountryCodeNumeric(String countryCodeNumeric) {
        this.countryCodeNumeric = countryCodeNumeric;
    }

    /**
     * The numeric code for the country or region where the phone number was
     * originally registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countryCodeNumeric The numeric code for the country or region
     *            where the phone number was originally registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCountryCodeNumeric(String countryCodeNumeric) {
        this.countryCodeNumeric = countryCodeNumeric;
        return this;
    }

    /**
     * The county where the phone number was originally registered.
     *
     * @return The county where the phone number was originally registered.
     */
    public String getCounty() {
        return county;
    }

    /**
     * The county where the phone number was originally registered.
     *
     * @param county The county where the phone number was originally
     *            registered.
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * The county where the phone number was originally registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param county The county where the phone number was originally
     *            registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withCounty(String county) {
        this.county = county;
        return this;
    }

    /**
     * The two-character code (in ISO 3166-1 alpha-2 format) for the country or
     * region in the request body.
     *
     * @return The two-character code (in ISO 3166-1 alpha-2 format) for the
     *         country or region in the request body.
     */
    public String getOriginalCountryCodeIso2() {
        return originalCountryCodeIso2;
    }

    /**
     * The two-character code (in ISO 3166-1 alpha-2 format) for the country or
     * region in the request body.
     *
     * @param originalCountryCodeIso2 The two-character code (in ISO 3166-1
     *            alpha-2 format) for the country or region in the request body.
     */
    public void setOriginalCountryCodeIso2(String originalCountryCodeIso2) {
        this.originalCountryCodeIso2 = originalCountryCodeIso2;
    }

    /**
     * The two-character code (in ISO 3166-1 alpha-2 format) for the country or
     * region in the request body.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalCountryCodeIso2 The two-character code (in ISO 3166-1
     *            alpha-2 format) for the country or region in the request body.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withOriginalCountryCodeIso2(String originalCountryCodeIso2) {
        this.originalCountryCodeIso2 = originalCountryCodeIso2;
        return this;
    }

    /**
     * The phone number that you included in the request body.
     *
     * @return The phone number that you included in the request body.
     */
    public String getOriginalPhoneNumber() {
        return originalPhoneNumber;
    }

    /**
     * The phone number that you included in the request body.
     *
     * @param originalPhoneNumber The phone number that you included in the
     *            request body.
     */
    public void setOriginalPhoneNumber(String originalPhoneNumber) {
        this.originalPhoneNumber = originalPhoneNumber;
    }

    /**
     * The phone number that you included in the request body.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalPhoneNumber The phone number that you included in the
     *            request body.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withOriginalPhoneNumber(String originalPhoneNumber) {
        this.originalPhoneNumber = originalPhoneNumber;
        return this;
    }

    /**
     * A description of the phone type. Possible values are MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     *
     * @return A description of the phone type. Possible values are MOBILE,
     *         LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * A description of the phone type. Possible values are MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     *
     * @param phoneType A description of the phone type. Possible values are
     *            MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * A description of the phone type. Possible values are MOBILE, LANDLINE,
     * VOIP, INVALID, PREPAID, and OTHER.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneType A description of the phone type. Possible values are
     *            MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    /**
     * The phone type, represented by an integer. Possible values include 0
     * (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5
     * (PREPAID).
     *
     * @return The phone type, represented by an integer. Possible values
     *         include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4
     *         (OTHER), and 5 (PREPAID).
     */
    public Integer getPhoneTypeCode() {
        return phoneTypeCode;
    }

    /**
     * The phone type, represented by an integer. Possible values include 0
     * (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5
     * (PREPAID).
     *
     * @param phoneTypeCode The phone type, represented by an integer. Possible
     *            values include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3
     *            (INVALID), 4 (OTHER), and 5 (PREPAID).
     */
    public void setPhoneTypeCode(Integer phoneTypeCode) {
        this.phoneTypeCode = phoneTypeCode;
    }

    /**
     * The phone type, represented by an integer. Possible values include 0
     * (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5
     * (PREPAID).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneTypeCode The phone type, represented by an integer. Possible
     *            values include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3
     *            (INVALID), 4 (OTHER), and 5 (PREPAID).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withPhoneTypeCode(Integer phoneTypeCode) {
        this.phoneTypeCode = phoneTypeCode;
        return this;
    }

    /**
     * The time zone for the location where the phone number was originally
     * registered.
     *
     * @return The time zone for the location where the phone number was
     *         originally registered.
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * The time zone for the location where the phone number was originally
     * registered.
     *
     * @param timezone The time zone for the location where the phone number was
     *            originally registered.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * The time zone for the location where the phone number was originally
     * registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone The time zone for the location where the phone number was
     *            originally registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateResponse withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * The postal code for the location where the phone number was originally
     * registered.
     *
     * @return The postal code for the location where the phone number was
     *         originally registered.
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * The postal code for the location where the phone number was originally
     * registered.
     *
     * @param zipCode The postal code for the location where the phone number
     *            was originally registered.
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * The postal code for the location where the phone number was originally
     * registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zipCode The postal code for the location where the phone number
     *            was originally registered.
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
