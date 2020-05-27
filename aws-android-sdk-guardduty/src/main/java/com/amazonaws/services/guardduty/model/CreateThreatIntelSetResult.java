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

public class CreateThreatIntelSetResult implements Serializable {
    /**
     * <p>
     * The ID of the ThreatIntelSet resource.
     * </p>
     */
    private String threatIntelSetId;

    /**
     * <p>
     * The ID of the ThreatIntelSet resource.
     * </p>
     *
     * @return <p>
     *         The ID of the ThreatIntelSet resource.
     *         </p>
     */
    public String getThreatIntelSetId() {
        return threatIntelSetId;
    }

    /**
     * <p>
     * The ID of the ThreatIntelSet resource.
     * </p>
     *
     * @param threatIntelSetId <p>
     *            The ID of the ThreatIntelSet resource.
     *            </p>
     */
    public void setThreatIntelSetId(String threatIntelSetId) {
        this.threatIntelSetId = threatIntelSetId;
    }

    /**
     * <p>
     * The ID of the ThreatIntelSet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatIntelSetId <p>
     *            The ID of the ThreatIntelSet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThreatIntelSetResult withThreatIntelSetId(String threatIntelSetId) {
        this.threatIntelSetId = threatIntelSetId;
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
        if (getThreatIntelSetId() != null)
            sb.append("ThreatIntelSetId: " + getThreatIntelSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThreatIntelSetId() == null) ? 0 : getThreatIntelSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThreatIntelSetResult == false)
            return false;
        CreateThreatIntelSetResult other = (CreateThreatIntelSetResult) obj;

        if (other.getThreatIntelSetId() == null ^ this.getThreatIntelSetId() == null)
            return false;
        if (other.getThreatIntelSetId() != null
                && other.getThreatIntelSetId().equals(this.getThreatIntelSetId()) == false)
            return false;
        return true;
    }
}
