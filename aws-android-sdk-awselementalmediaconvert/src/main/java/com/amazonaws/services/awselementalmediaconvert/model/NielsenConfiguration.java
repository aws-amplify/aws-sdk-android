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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Settings for your Nielsen configuration. If you don't do Nielsen measurement
 * and analytics, ignore these settings. When you enable Nielsen configuration
 * (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all
 * outputs in the job. To enable Nielsen configuration programmatically, include
 * an instance of nielsenConfiguration in your JSON job specification. Even if
 * you don't include any children of nielsenConfiguration, you still enable the
 * setting.
 */
public class NielsenConfiguration implements Serializable {
    /**
     * Nielsen has discontinued the use of breakout code functionality. If you
     * must include this property, set the value to zero.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 0<br/>
     */
    private Integer breakoutCode;

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is
     * assigned to your organization by Neilsen.
     */
    private String distributorId;

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you
     * must include this property, set the value to zero.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 0<br/>
     *
     * @return Nielsen has discontinued the use of breakout code functionality.
     *         If you must include this property, set the value to zero.
     */
    public Integer getBreakoutCode() {
        return breakoutCode;
    }

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you
     * must include this property, set the value to zero.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 0<br/>
     *
     * @param breakoutCode Nielsen has discontinued the use of breakout code
     *            functionality. If you must include this property, set the
     *            value to zero.
     */
    public void setBreakoutCode(Integer breakoutCode) {
        this.breakoutCode = breakoutCode;
    }

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you
     * must include this property, set the value to zero.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 0<br/>
     *
     * @param breakoutCode Nielsen has discontinued the use of breakout code
     *            functionality. If you must include this property, set the
     *            value to zero.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NielsenConfiguration withBreakoutCode(Integer breakoutCode) {
        this.breakoutCode = breakoutCode;
        return this;
    }

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is
     * assigned to your organization by Neilsen.
     *
     * @return Use Distributor ID (DistributorID) to specify the distributor ID
     *         that is assigned to your organization by Neilsen.
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is
     * assigned to your organization by Neilsen.
     *
     * @param distributorId Use Distributor ID (DistributorID) to specify the
     *            distributor ID that is assigned to your organization by
     *            Neilsen.
     */
    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is
     * assigned to your organization by Neilsen.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributorId Use Distributor ID (DistributorID) to specify the
     *            distributor ID that is assigned to your organization by
     *            Neilsen.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NielsenConfiguration withDistributorId(String distributorId) {
        this.distributorId = distributorId;
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
        if (getBreakoutCode() != null)
            sb.append("BreakoutCode: " + getBreakoutCode() + ",");
        if (getDistributorId() != null)
            sb.append("DistributorId: " + getDistributorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBreakoutCode() == null) ? 0 : getBreakoutCode().hashCode());
        hashCode = prime * hashCode
                + ((getDistributorId() == null) ? 0 : getDistributorId().hashCode());
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

        if (other.getBreakoutCode() == null ^ this.getBreakoutCode() == null)
            return false;
        if (other.getBreakoutCode() != null
                && other.getBreakoutCode().equals(this.getBreakoutCode()) == false)
            return false;
        if (other.getDistributorId() == null ^ this.getDistributorId() == null)
            return false;
        if (other.getDistributorId() != null
                && other.getDistributorId().equals(this.getDistributorId()) == false)
            return false;
        return true;
    }
}
