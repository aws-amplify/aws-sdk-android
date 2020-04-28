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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Corresponds to SCTE-35 delivery_not_restricted_flag parameter. To declare
 * delivery restrictions, include this element and its four "restriction" flags.
 * To declare that there are no restrictions, omit this element.
 */
public class Scte35DeliveryRestrictions implements Serializable {
    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED
     */
    private String archiveAllowedFlag;

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESTRICT_GROUP0, RESTRICT_GROUP1,
     * RESTRICT_GROUP2
     */
    private String deviceRestrictions;

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT
     */
    private String noRegionalBlackoutFlag;

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED
     */
    private String webDeliveryAllowedFlag;

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED
     *
     * @return Corresponds to SCTE-35 archive_allowed_flag.
     * @see Scte35ArchiveAllowedFlag
     */
    public String getArchiveAllowedFlag() {
        return archiveAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED
     *
     * @param archiveAllowedFlag Corresponds to SCTE-35 archive_allowed_flag.
     * @see Scte35ArchiveAllowedFlag
     */
    public void setArchiveAllowedFlag(String archiveAllowedFlag) {
        this.archiveAllowedFlag = archiveAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED
     *
     * @param archiveAllowedFlag Corresponds to SCTE-35 archive_allowed_flag.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35ArchiveAllowedFlag
     */
    public Scte35DeliveryRestrictions withArchiveAllowedFlag(String archiveAllowedFlag) {
        this.archiveAllowedFlag = archiveAllowedFlag;
        return this;
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED
     *
     * @param archiveAllowedFlag Corresponds to SCTE-35 archive_allowed_flag.
     * @see Scte35ArchiveAllowedFlag
     */
    public void setArchiveAllowedFlag(Scte35ArchiveAllowedFlag archiveAllowedFlag) {
        this.archiveAllowedFlag = archiveAllowedFlag.toString();
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED
     *
     * @param archiveAllowedFlag Corresponds to SCTE-35 archive_allowed_flag.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35ArchiveAllowedFlag
     */
    public Scte35DeliveryRestrictions withArchiveAllowedFlag(
            Scte35ArchiveAllowedFlag archiveAllowedFlag) {
        this.archiveAllowedFlag = archiveAllowedFlag.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESTRICT_GROUP0, RESTRICT_GROUP1,
     * RESTRICT_GROUP2
     *
     * @return Corresponds to SCTE-35 device_restrictions parameter.
     * @see Scte35DeviceRestrictions
     */
    public String getDeviceRestrictions() {
        return deviceRestrictions;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESTRICT_GROUP0, RESTRICT_GROUP1,
     * RESTRICT_GROUP2
     *
     * @param deviceRestrictions Corresponds to SCTE-35 device_restrictions
     *            parameter.
     * @see Scte35DeviceRestrictions
     */
    public void setDeviceRestrictions(String deviceRestrictions) {
        this.deviceRestrictions = deviceRestrictions;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESTRICT_GROUP0, RESTRICT_GROUP1,
     * RESTRICT_GROUP2
     *
     * @param deviceRestrictions Corresponds to SCTE-35 device_restrictions
     *            parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35DeviceRestrictions
     */
    public Scte35DeliveryRestrictions withDeviceRestrictions(String deviceRestrictions) {
        this.deviceRestrictions = deviceRestrictions;
        return this;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESTRICT_GROUP0, RESTRICT_GROUP1,
     * RESTRICT_GROUP2
     *
     * @param deviceRestrictions Corresponds to SCTE-35 device_restrictions
     *            parameter.
     * @see Scte35DeviceRestrictions
     */
    public void setDeviceRestrictions(Scte35DeviceRestrictions deviceRestrictions) {
        this.deviceRestrictions = deviceRestrictions.toString();
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESTRICT_GROUP0, RESTRICT_GROUP1,
     * RESTRICT_GROUP2
     *
     * @param deviceRestrictions Corresponds to SCTE-35 device_restrictions
     *            parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35DeviceRestrictions
     */
    public Scte35DeliveryRestrictions withDeviceRestrictions(
            Scte35DeviceRestrictions deviceRestrictions) {
        this.deviceRestrictions = deviceRestrictions.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT
     *
     * @return Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * @see Scte35NoRegionalBlackoutFlag
     */
    public String getNoRegionalBlackoutFlag() {
        return noRegionalBlackoutFlag;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT
     *
     * @param noRegionalBlackoutFlag Corresponds to SCTE-35
     *            no_regional_blackout_flag parameter.
     * @see Scte35NoRegionalBlackoutFlag
     */
    public void setNoRegionalBlackoutFlag(String noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT
     *
     * @param noRegionalBlackoutFlag Corresponds to SCTE-35
     *            no_regional_blackout_flag parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35NoRegionalBlackoutFlag
     */
    public Scte35DeliveryRestrictions withNoRegionalBlackoutFlag(String noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag;
        return this;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT
     *
     * @param noRegionalBlackoutFlag Corresponds to SCTE-35
     *            no_regional_blackout_flag parameter.
     * @see Scte35NoRegionalBlackoutFlag
     */
    public void setNoRegionalBlackoutFlag(Scte35NoRegionalBlackoutFlag noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag.toString();
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT
     *
     * @param noRegionalBlackoutFlag Corresponds to SCTE-35
     *            no_regional_blackout_flag parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35NoRegionalBlackoutFlag
     */
    public Scte35DeliveryRestrictions withNoRegionalBlackoutFlag(
            Scte35NoRegionalBlackoutFlag noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED
     *
     * @return Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * @see Scte35WebDeliveryAllowedFlag
     */
    public String getWebDeliveryAllowedFlag() {
        return webDeliveryAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED
     *
     * @param webDeliveryAllowedFlag Corresponds to SCTE-35
     *            web_delivery_allowed_flag parameter.
     * @see Scte35WebDeliveryAllowedFlag
     */
    public void setWebDeliveryAllowedFlag(String webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED
     *
     * @param webDeliveryAllowedFlag Corresponds to SCTE-35
     *            web_delivery_allowed_flag parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35WebDeliveryAllowedFlag
     */
    public Scte35DeliveryRestrictions withWebDeliveryAllowedFlag(String webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag;
        return this;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED
     *
     * @param webDeliveryAllowedFlag Corresponds to SCTE-35
     *            web_delivery_allowed_flag parameter.
     * @see Scte35WebDeliveryAllowedFlag
     */
    public void setWebDeliveryAllowedFlag(Scte35WebDeliveryAllowedFlag webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag.toString();
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED
     *
     * @param webDeliveryAllowedFlag Corresponds to SCTE-35
     *            web_delivery_allowed_flag parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35WebDeliveryAllowedFlag
     */
    public Scte35DeliveryRestrictions withWebDeliveryAllowedFlag(
            Scte35WebDeliveryAllowedFlag webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag.toString();
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
        if (getArchiveAllowedFlag() != null)
            sb.append("ArchiveAllowedFlag: " + getArchiveAllowedFlag() + ",");
        if (getDeviceRestrictions() != null)
            sb.append("DeviceRestrictions: " + getDeviceRestrictions() + ",");
        if (getNoRegionalBlackoutFlag() != null)
            sb.append("NoRegionalBlackoutFlag: " + getNoRegionalBlackoutFlag() + ",");
        if (getWebDeliveryAllowedFlag() != null)
            sb.append("WebDeliveryAllowedFlag: " + getWebDeliveryAllowedFlag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArchiveAllowedFlag() == null) ? 0 : getArchiveAllowedFlag().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceRestrictions() == null) ? 0 : getDeviceRestrictions().hashCode());
        hashCode = prime
                * hashCode
                + ((getNoRegionalBlackoutFlag() == null) ? 0 : getNoRegionalBlackoutFlag()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getWebDeliveryAllowedFlag() == null) ? 0 : getWebDeliveryAllowedFlag()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35DeliveryRestrictions == false)
            return false;
        Scte35DeliveryRestrictions other = (Scte35DeliveryRestrictions) obj;

        if (other.getArchiveAllowedFlag() == null ^ this.getArchiveAllowedFlag() == null)
            return false;
        if (other.getArchiveAllowedFlag() != null
                && other.getArchiveAllowedFlag().equals(this.getArchiveAllowedFlag()) == false)
            return false;
        if (other.getDeviceRestrictions() == null ^ this.getDeviceRestrictions() == null)
            return false;
        if (other.getDeviceRestrictions() != null
                && other.getDeviceRestrictions().equals(this.getDeviceRestrictions()) == false)
            return false;
        if (other.getNoRegionalBlackoutFlag() == null ^ this.getNoRegionalBlackoutFlag() == null)
            return false;
        if (other.getNoRegionalBlackoutFlag() != null
                && other.getNoRegionalBlackoutFlag().equals(this.getNoRegionalBlackoutFlag()) == false)
            return false;
        if (other.getWebDeliveryAllowedFlag() == null ^ this.getWebDeliveryAllowedFlag() == null)
            return false;
        if (other.getWebDeliveryAllowedFlag() != null
                && other.getWebDeliveryAllowedFlag().equals(this.getWebDeliveryAllowedFlag()) == false)
            return false;
        return true;
    }
}
