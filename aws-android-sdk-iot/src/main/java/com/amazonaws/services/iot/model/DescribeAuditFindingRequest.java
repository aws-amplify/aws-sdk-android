/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about a single audit finding. Properties include the reason
 * for noncompliance, the severity of the issue, and the start time when the
 * audit that returned the finding.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >DescribeAuditFinding</a> action.
 * </p>
 */
public class DescribeAuditFindingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this
     * identifier to apply mitigation actions to the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String findingId;

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this
     * identifier to apply mitigation actions to the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for a single audit finding. You can use this
     *         identifier to apply mitigation actions to the finding.
     *         </p>
     */
    public String getFindingId() {
        return findingId;
    }

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this
     * identifier to apply mitigation actions to the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            A unique identifier for a single audit finding. You can use
     *            this identifier to apply mitigation actions to the finding.
     *            </p>
     */
    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this
     * identifier to apply mitigation actions to the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            A unique identifier for a single audit finding. You can use
     *            this identifier to apply mitigation actions to the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuditFindingRequest withFindingId(String findingId) {
        this.findingId = findingId;
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
        if (getFindingId() != null)
            sb.append("findingId: " + getFindingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditFindingRequest == false)
            return false;
        DescribeAuditFindingRequest other = (DescribeAuditFindingRequest) obj;

        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null
                && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        return true;
    }
}
