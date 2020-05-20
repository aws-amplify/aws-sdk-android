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
 * Nielsen Configuration
 */
public class NielsenConfiguration implements Serializable {
    /**
     * Enter the Distributor ID assigned to your organization by Nielsen.
     */
    private String distributorId;

    /**
     * Enables Nielsen PCM to ID3 tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String nielsenPcmToId3Tagging;

    /**
     * Enter the Distributor ID assigned to your organization by Nielsen.
     *
     * @return Enter the Distributor ID assigned to your organization by
     *         Nielsen.
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * Enter the Distributor ID assigned to your organization by Nielsen.
     *
     * @param distributorId Enter the Distributor ID assigned to your
     *            organization by Nielsen.
     */
    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * Enter the Distributor ID assigned to your organization by Nielsen.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributorId Enter the Distributor ID assigned to your
     *            organization by Nielsen.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NielsenConfiguration withDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }

    /**
     * Enables Nielsen PCM to ID3 tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Enables Nielsen PCM to ID3 tagging
     * @see NielsenPcmToId3TaggingState
     */
    public String getNielsenPcmToId3Tagging() {
        return nielsenPcmToId3Tagging;
    }

    /**
     * Enables Nielsen PCM to ID3 tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param nielsenPcmToId3Tagging Enables Nielsen PCM to ID3 tagging
     * @see NielsenPcmToId3TaggingState
     */
    public void setNielsenPcmToId3Tagging(String nielsenPcmToId3Tagging) {
        this.nielsenPcmToId3Tagging = nielsenPcmToId3Tagging;
    }

    /**
     * Enables Nielsen PCM to ID3 tagging
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param nielsenPcmToId3Tagging Enables Nielsen PCM to ID3 tagging
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NielsenPcmToId3TaggingState
     */
    public NielsenConfiguration withNielsenPcmToId3Tagging(String nielsenPcmToId3Tagging) {
        this.nielsenPcmToId3Tagging = nielsenPcmToId3Tagging;
        return this;
    }

    /**
     * Enables Nielsen PCM to ID3 tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param nielsenPcmToId3Tagging Enables Nielsen PCM to ID3 tagging
     * @see NielsenPcmToId3TaggingState
     */
    public void setNielsenPcmToId3Tagging(NielsenPcmToId3TaggingState nielsenPcmToId3Tagging) {
        this.nielsenPcmToId3Tagging = nielsenPcmToId3Tagging.toString();
    }

    /**
     * Enables Nielsen PCM to ID3 tagging
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param nielsenPcmToId3Tagging Enables Nielsen PCM to ID3 tagging
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NielsenPcmToId3TaggingState
     */
    public NielsenConfiguration withNielsenPcmToId3Tagging(
            NielsenPcmToId3TaggingState nielsenPcmToId3Tagging) {
        this.nielsenPcmToId3Tagging = nielsenPcmToId3Tagging.toString();
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
        if (getDistributorId() != null)
            sb.append("DistributorId: " + getDistributorId() + ",");
        if (getNielsenPcmToId3Tagging() != null)
            sb.append("NielsenPcmToId3Tagging: " + getNielsenPcmToId3Tagging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDistributorId() == null) ? 0 : getDistributorId().hashCode());
        hashCode = prime
                * hashCode
                + ((getNielsenPcmToId3Tagging() == null) ? 0 : getNielsenPcmToId3Tagging()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NielsenConfiguration == false)
            return false;
        NielsenConfiguration other = (NielsenConfiguration) obj;

        if (other.getDistributorId() == null ^ this.getDistributorId() == null)
            return false;
        if (other.getDistributorId() != null
                && other.getDistributorId().equals(this.getDistributorId()) == false)
            return false;
        if (other.getNielsenPcmToId3Tagging() == null ^ this.getNielsenPcmToId3Tagging() == null)
            return false;
        if (other.getNielsenPcmToId3Tagging() != null
                && other.getNielsenPcmToId3Tagging().equals(this.getNielsenPcmToId3Tagging()) == false)
            return false;
        return true;
    }
}
