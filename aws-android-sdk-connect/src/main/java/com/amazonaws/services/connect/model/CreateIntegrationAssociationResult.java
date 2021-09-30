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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateIntegrationAssociationResult implements Serializable {
    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String integrationAssociationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     */
    private String integrationAssociationArn;

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The identifier for the integration association.
     *         </p>
     */
    public String getIntegrationAssociationId() {
        return integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param integrationAssociationId <p>
     *            The identifier for the integration association.
     *            </p>
     */
    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param integrationAssociationId <p>
     *            The identifier for the integration association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIntegrationAssociationResult withIntegrationAssociationId(
            String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the association.
     *         </p>
     */
    public String getIntegrationAssociationArn() {
        return integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     *
     * @param integrationAssociationArn <p>
     *            The Amazon Resource Name (ARN) for the association.
     *            </p>
     */
    public void setIntegrationAssociationArn(String integrationAssociationArn) {
        this.integrationAssociationArn = integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationAssociationArn <p>
     *            The Amazon Resource Name (ARN) for the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIntegrationAssociationResult withIntegrationAssociationArn(
            String integrationAssociationArn) {
        this.integrationAssociationArn = integrationAssociationArn;
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
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: " + getIntegrationAssociationId() + ",");
        if (getIntegrationAssociationArn() != null)
            sb.append("IntegrationAssociationArn: " + getIntegrationAssociationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationAssociationArn() == null) ? 0 : getIntegrationAssociationArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationAssociationResult == false)
            return false;
        CreateIntegrationAssociationResult other = (CreateIntegrationAssociationResult) obj;

        if (other.getIntegrationAssociationId() == null
                ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null
                && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        if (other.getIntegrationAssociationArn() == null
                ^ this.getIntegrationAssociationArn() == null)
            return false;
        if (other.getIntegrationAssociationArn() != null
                && other.getIntegrationAssociationArn().equals(this.getIntegrationAssociationArn()) == false)
            return false;
        return true;
    }
}
