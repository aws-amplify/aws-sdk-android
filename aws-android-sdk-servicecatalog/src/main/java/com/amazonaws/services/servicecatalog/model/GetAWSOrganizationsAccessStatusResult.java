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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class GetAWSOrganizationsAccessStatusResult implements Serializable {
    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, UNDER_CHANGE, DISABLED
     */
    private String accessStatus;

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, UNDER_CHANGE, DISABLED
     *
     * @return <p>
     *         The status of the portfolio share feature.
     *         </p>
     * @see AccessStatus
     */
    public String getAccessStatus() {
        return accessStatus;
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, UNDER_CHANGE, DISABLED
     *
     * @param accessStatus <p>
     *            The status of the portfolio share feature.
     *            </p>
     * @see AccessStatus
     */
    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, UNDER_CHANGE, DISABLED
     *
     * @param accessStatus <p>
     *            The status of the portfolio share feature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessStatus
     */
    public GetAWSOrganizationsAccessStatusResult withAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, UNDER_CHANGE, DISABLED
     *
     * @param accessStatus <p>
     *            The status of the portfolio share feature.
     *            </p>
     * @see AccessStatus
     */
    public void setAccessStatus(AccessStatus accessStatus) {
        this.accessStatus = accessStatus.toString();
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, UNDER_CHANGE, DISABLED
     *
     * @param accessStatus <p>
     *            The status of the portfolio share feature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessStatus
     */
    public GetAWSOrganizationsAccessStatusResult withAccessStatus(AccessStatus accessStatus) {
        this.accessStatus = accessStatus.toString();
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
        if (getAccessStatus() != null)
            sb.append("AccessStatus: " + getAccessStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessStatus() == null) ? 0 : getAccessStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAWSOrganizationsAccessStatusResult == false)
            return false;
        GetAWSOrganizationsAccessStatusResult other = (GetAWSOrganizationsAccessStatusResult) obj;

        if (other.getAccessStatus() == null ^ this.getAccessStatus() == null)
            return false;
        if (other.getAccessStatus() != null
                && other.getAccessStatus().equals(this.getAccessStatus()) == false)
            return false;
        return true;
    }
}
