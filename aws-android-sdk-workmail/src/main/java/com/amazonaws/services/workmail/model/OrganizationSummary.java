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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

/**
 * <p>
 * The representation of an organization.
 * </p>
 */
public class OrganizationSummary implements Serializable {
    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     */
    private String alias;

    /**
     * <p>
     * The error message associated with the organization. It is only present if
     * unexpected behavior has occurred with regards to the organization. It
     * provides insight or solutions regarding unexpected behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String state;

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier associated with the organization.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier associated with the organization.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier associated with the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationSummary withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @return <p>
     *         The alias associated with the organization.
     *         </p>
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias <p>
     *            The alias associated with the organization.
     *            </p>
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias <p>
     *            The alias associated with the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationSummary withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * <p>
     * The error message associated with the organization. It is only present if
     * unexpected behavior has occurred with regards to the organization. It
     * provides insight or solutions regarding unexpected behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The error message associated with the organization. It is only
     *         present if unexpected behavior has occurred with regards to the
     *         organization. It provides insight or solutions regarding
     *         unexpected behavior.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message associated with the organization. It is only present if
     * unexpected behavior has occurred with regards to the organization. It
     * provides insight or solutions regarding unexpected behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param errorMessage <p>
     *            The error message associated with the organization. It is only
     *            present if unexpected behavior has occurred with regards to
     *            the organization. It provides insight or solutions regarding
     *            unexpected behavior.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message associated with the organization. It is only present if
     * unexpected behavior has occurred with regards to the organization. It
     * provides insight or solutions regarding unexpected behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param errorMessage <p>
     *            The error message associated with the organization. It is only
     *            present if unexpected behavior has occurred with regards to
     *            the organization. It provides insight or solutions regarding
     *            unexpected behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationSummary withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The state associated with the organization.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param state <p>
     *            The state associated with the organization.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param state <p>
     *            The state associated with the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationSummary withState(String state) {
        this.state = state;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId() + ",");
        if (getAlias() != null)
            sb.append("Alias: " + getAlias() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationSummary == false)
            return false;
        OrganizationSummary other = (OrganizationSummary) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
