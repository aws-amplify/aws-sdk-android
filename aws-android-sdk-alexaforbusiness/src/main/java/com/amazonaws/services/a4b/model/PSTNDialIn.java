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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The information for public switched telephone network (PSTN) conferencing.
 * </p>
 */
public class PSTNDialIn implements Serializable {
    /**
     * <p>
     * The zip code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}<br/>
     */
    private String countryCode;

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{10}<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String oneClickIdDelay;

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String oneClickPinDelay;

    /**
     * <p>
     * The zip code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}<br/>
     *
     * @return <p>
     *         The zip code.
     *         </p>
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>
     * The zip code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}<br/>
     *
     * @param countryCode <p>
     *            The zip code.
     *            </p>
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The zip code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}<br/>
     *
     * @param countryCode <p>
     *            The zip code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PSTNDialIn withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{10}<br/>
     *
     * @return <p>
     *         The phone number to call to join the conference.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{10}<br/>
     *
     * @param phoneNumber <p>
     *            The phone number to call to join the conference.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number to call to join the conference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{10}<br/>
     *
     * @param phoneNumber <p>
     *            The phone number to call to join the conference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PSTNDialIn withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return <p>
     *         The delay duration before Alexa enters the conference ID with
     *         dual-tone multi-frequency (DTMF). Each number on the dial pad
     *         corresponds to a DTMF tone, which is how we send data over the
     *         telephone network.
     *         </p>
     */
    public String getOneClickIdDelay() {
        return oneClickIdDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param oneClickIdDelay <p>
     *            The delay duration before Alexa enters the conference ID with
     *            dual-tone multi-frequency (DTMF). Each number on the dial pad
     *            corresponds to a DTMF tone, which is how we send data over the
     *            telephone network.
     *            </p>
     */
    public void setOneClickIdDelay(String oneClickIdDelay) {
        this.oneClickIdDelay = oneClickIdDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference ID with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param oneClickIdDelay <p>
     *            The delay duration before Alexa enters the conference ID with
     *            dual-tone multi-frequency (DTMF). Each number on the dial pad
     *            corresponds to a DTMF tone, which is how we send data over the
     *            telephone network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PSTNDialIn withOneClickIdDelay(String oneClickIdDelay) {
        this.oneClickIdDelay = oneClickIdDelay;
        return this;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return <p>
     *         The delay duration before Alexa enters the conference pin with
     *         dual-tone multi-frequency (DTMF). Each number on the dial pad
     *         corresponds to a DTMF tone, which is how we send data over the
     *         telephone network.
     *         </p>
     */
    public String getOneClickPinDelay() {
        return oneClickPinDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param oneClickPinDelay <p>
     *            The delay duration before Alexa enters the conference pin with
     *            dual-tone multi-frequency (DTMF). Each number on the dial pad
     *            corresponds to a DTMF tone, which is how we send data over the
     *            telephone network.
     *            </p>
     */
    public void setOneClickPinDelay(String oneClickPinDelay) {
        this.oneClickPinDelay = oneClickPinDelay;
    }

    /**
     * <p>
     * The delay duration before Alexa enters the conference pin with dual-tone
     * multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF
     * tone, which is how we send data over the telephone network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param oneClickPinDelay <p>
     *            The delay duration before Alexa enters the conference pin with
     *            dual-tone multi-frequency (DTMF). Each number on the dial pad
     *            corresponds to a DTMF tone, which is how we send data over the
     *            telephone network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PSTNDialIn withOneClickPinDelay(String oneClickPinDelay) {
        this.oneClickPinDelay = oneClickPinDelay;
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
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getOneClickIdDelay() != null)
            sb.append("OneClickIdDelay: " + getOneClickIdDelay() + ",");
        if (getOneClickPinDelay() != null)
            sb.append("OneClickPinDelay: " + getOneClickPinDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getOneClickIdDelay() == null) ? 0 : getOneClickIdDelay().hashCode());
        hashCode = prime * hashCode
                + ((getOneClickPinDelay() == null) ? 0 : getOneClickPinDelay().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PSTNDialIn == false)
            return false;
        PSTNDialIn other = (PSTNDialIn) obj;

        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getOneClickIdDelay() == null ^ this.getOneClickIdDelay() == null)
            return false;
        if (other.getOneClickIdDelay() != null
                && other.getOneClickIdDelay().equals(this.getOneClickIdDelay()) == false)
            return false;
        if (other.getOneClickPinDelay() == null ^ this.getOneClickPinDelay() == null)
            return false;
        if (other.getOneClickPinDelay() != null
                && other.getOneClickPinDelay().equals(this.getOneClickPinDelay()) == false)
            return false;
        return true;
    }
}
