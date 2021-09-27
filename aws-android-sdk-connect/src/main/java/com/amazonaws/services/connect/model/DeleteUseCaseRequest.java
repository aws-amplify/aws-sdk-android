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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a use case from an integration association.
 * </p>
 */
public class DeleteUseCaseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

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
     * The identifier for the use case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String useCaseId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUseCaseRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

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
    public DeleteUseCaseRequest withIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
        return this;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The identifier for the use case.
     *         </p>
     */
    public String getUseCaseId() {
        return useCaseId;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param useCaseId <p>
     *            The identifier for the use case.
     *            </p>
     */
    public void setUseCaseId(String useCaseId) {
        this.useCaseId = useCaseId;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param useCaseId <p>
     *            The identifier for the use case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUseCaseRequest withUseCaseId(String useCaseId) {
        this.useCaseId = useCaseId;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: " + getIntegrationAssociationId() + ",");
        if (getUseCaseId() != null)
            sb.append("UseCaseId: " + getUseCaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId()
                        .hashCode());
        hashCode = prime * hashCode + ((getUseCaseId() == null) ? 0 : getUseCaseId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUseCaseRequest == false)
            return false;
        DeleteUseCaseRequest other = (DeleteUseCaseRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIntegrationAssociationId() == null
                ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null
                && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        if (other.getUseCaseId() == null ^ this.getUseCaseId() == null)
            return false;
        if (other.getUseCaseId() != null
                && other.getUseCaseId().equals(this.getUseCaseId()) == false)
            return false;
        return true;
    }
}
