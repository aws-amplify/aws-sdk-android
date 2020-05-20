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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Scte35 Time Signal Apos
 */
public class Scte35TimeSignalApos implements Serializable {
    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time. This only applies to embedded SCTE 104/35 messages and
     * does not apply to OOB messages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     */
    private Integer adAvailOffset;

    /**
     * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     */
    private String noRegionalBlackoutFlag;

    /**
     * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     */
    private String webDeliveryAllowedFlag;

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time. This only applies to embedded SCTE 104/35 messages and
     * does not apply to OOB messages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     *
     * @return When specified, this offset (in milliseconds) is added to the
     *         input Ad Avail PTS time. This only applies to embedded SCTE
     *         104/35 messages and does not apply to OOB messages.
     */
    public Integer getAdAvailOffset() {
        return adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time. This only applies to embedded SCTE 104/35 messages and
     * does not apply to OOB messages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     *
     * @param adAvailOffset When specified, this offset (in milliseconds) is
     *            added to the input Ad Avail PTS time. This only applies to
     *            embedded SCTE 104/35 messages and does not apply to OOB
     *            messages.
     */
    public void setAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time. This only applies to embedded SCTE 104/35 messages and
     * does not apply to OOB messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     *
     * @param adAvailOffset When specified, this offset (in milliseconds) is
     *            added to the input Ad Avail PTS time. This only applies to
     *            embedded SCTE 104/35 messages and does not apply to OOB
     *            messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35TimeSignalApos withAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
        return this;
    }

    /**
     * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @return When set to ignore, Segment Descriptors with
     *         noRegionalBlackoutFlag set to 0 will no longer trigger blackouts
     *         or Ad Avail slates
     * @see Scte35AposNoRegionalBlackoutBehavior
     */
    public String getNoRegionalBlackoutFlag() {
        return noRegionalBlackoutFlag;
    }

    /**
     * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param noRegionalBlackoutFlag When set to ignore, Segment Descriptors
     *            with noRegionalBlackoutFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @see Scte35AposNoRegionalBlackoutBehavior
     */
    public void setNoRegionalBlackoutFlag(String noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag;
    }

    /**
     * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param noRegionalBlackoutFlag When set to ignore, Segment Descriptors
     *            with noRegionalBlackoutFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35AposNoRegionalBlackoutBehavior
     */
    public Scte35TimeSignalApos withNoRegionalBlackoutFlag(String noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag;
        return this;
    }

    /**
     * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param noRegionalBlackoutFlag When set to ignore, Segment Descriptors
     *            with noRegionalBlackoutFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @see Scte35AposNoRegionalBlackoutBehavior
     */
    public void setNoRegionalBlackoutFlag(
            Scte35AposNoRegionalBlackoutBehavior noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag.toString();
    }

    /**
     * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param noRegionalBlackoutFlag When set to ignore, Segment Descriptors
     *            with noRegionalBlackoutFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35AposNoRegionalBlackoutBehavior
     */
    public Scte35TimeSignalApos withNoRegionalBlackoutFlag(
            Scte35AposNoRegionalBlackoutBehavior noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag.toString();
        return this;
    }

    /**
     * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @return When set to ignore, Segment Descriptors with
     *         webDeliveryAllowedFlag set to 0 will no longer trigger blackouts
     *         or Ad Avail slates
     * @see Scte35AposWebDeliveryAllowedBehavior
     */
    public String getWebDeliveryAllowedFlag() {
        return webDeliveryAllowedFlag;
    }

    /**
     * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param webDeliveryAllowedFlag When set to ignore, Segment Descriptors
     *            with webDeliveryAllowedFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @see Scte35AposWebDeliveryAllowedBehavior
     */
    public void setWebDeliveryAllowedFlag(String webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag;
    }

    /**
     * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param webDeliveryAllowedFlag When set to ignore, Segment Descriptors
     *            with webDeliveryAllowedFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35AposWebDeliveryAllowedBehavior
     */
    public Scte35TimeSignalApos withWebDeliveryAllowedFlag(String webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag;
        return this;
    }

    /**
     * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param webDeliveryAllowedFlag When set to ignore, Segment Descriptors
     *            with webDeliveryAllowedFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @see Scte35AposWebDeliveryAllowedBehavior
     */
    public void setWebDeliveryAllowedFlag(
            Scte35AposWebDeliveryAllowedBehavior webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag.toString();
    }

    /**
     * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set
     * to 0 will no longer trigger blackouts or Ad Avail slates
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, IGNORE
     *
     * @param webDeliveryAllowedFlag When set to ignore, Segment Descriptors
     *            with webDeliveryAllowedFlag set to 0 will no longer trigger
     *            blackouts or Ad Avail slates
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte35AposWebDeliveryAllowedBehavior
     */
    public Scte35TimeSignalApos withWebDeliveryAllowedFlag(
            Scte35AposWebDeliveryAllowedBehavior webDeliveryAllowedFlag) {
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
        if (getAdAvailOffset() != null)
            sb.append("AdAvailOffset: " + getAdAvailOffset() + ",");
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
                + ((getAdAvailOffset() == null) ? 0 : getAdAvailOffset().hashCode());
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

        if (obj instanceof Scte35TimeSignalApos == false)
            return false;
        Scte35TimeSignalApos other = (Scte35TimeSignalApos) obj;

        if (other.getAdAvailOffset() == null ^ this.getAdAvailOffset() == null)
            return false;
        if (other.getAdAvailOffset() != null
                && other.getAdAvailOffset().equals(this.getAdAvailOffset()) == false)
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
