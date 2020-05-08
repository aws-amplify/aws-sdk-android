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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the reason that the finding was generated.
 * </p>
 */
public class Evidence implements Serializable {
    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     */
    private java.util.List<ThreatIntelligenceDetail> threatIntelligenceDetails;

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     *
     * @return <p>
     *         A list of threat intelligence details related to the evidence.
     *         </p>
     */
    public java.util.List<ThreatIntelligenceDetail> getThreatIntelligenceDetails() {
        return threatIntelligenceDetails;
    }

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     *
     * @param threatIntelligenceDetails <p>
     *            A list of threat intelligence details related to the evidence.
     *            </p>
     */
    public void setThreatIntelligenceDetails(
            java.util.Collection<ThreatIntelligenceDetail> threatIntelligenceDetails) {
        if (threatIntelligenceDetails == null) {
            this.threatIntelligenceDetails = null;
            return;
        }

        this.threatIntelligenceDetails = new java.util.ArrayList<ThreatIntelligenceDetail>(
                threatIntelligenceDetails);
    }

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatIntelligenceDetails <p>
     *            A list of threat intelligence details related to the evidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evidence withThreatIntelligenceDetails(
            ThreatIntelligenceDetail... threatIntelligenceDetails) {
        if (getThreatIntelligenceDetails() == null) {
            this.threatIntelligenceDetails = new java.util.ArrayList<ThreatIntelligenceDetail>(
                    threatIntelligenceDetails.length);
        }
        for (ThreatIntelligenceDetail value : threatIntelligenceDetails) {
            this.threatIntelligenceDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatIntelligenceDetails <p>
     *            A list of threat intelligence details related to the evidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evidence withThreatIntelligenceDetails(
            java.util.Collection<ThreatIntelligenceDetail> threatIntelligenceDetails) {
        setThreatIntelligenceDetails(threatIntelligenceDetails);
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
        if (getThreatIntelligenceDetails() != null)
            sb.append("ThreatIntelligenceDetails: " + getThreatIntelligenceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getThreatIntelligenceDetails() == null) ? 0 : getThreatIntelligenceDetails()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evidence == false)
            return false;
        Evidence other = (Evidence) obj;

        if (other.getThreatIntelligenceDetails() == null
                ^ this.getThreatIntelligenceDetails() == null)
            return false;
        if (other.getThreatIntelligenceDetails() != null
                && other.getThreatIntelligenceDetails().equals(this.getThreatIntelligenceDetails()) == false)
            return false;
        return true;
    }
}
