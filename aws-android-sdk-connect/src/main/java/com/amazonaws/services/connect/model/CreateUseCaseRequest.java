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
 * Creates a use case for an integration association.
 * </p>
 */
public class CreateUseCaseRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     */
    private String useCaseType;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public CreateUseCaseRequest withInstanceId(String instanceId) {
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
    public CreateUseCaseRequest withIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @return <p>
     *         The type of use case to associate to the integration association.
     *         Each integration association can have only one of each use case
     *         type.
     *         </p>
     * @see UseCaseType
     */
    public String getUseCaseType() {
        return useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @see UseCaseType
     */
    public void setUseCaseType(String useCaseType) {
        this.useCaseType = useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UseCaseType
     */
    public CreateUseCaseRequest withUseCaseType(String useCaseType) {
        this.useCaseType = useCaseType;
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @see UseCaseType
     */
    public void setUseCaseType(UseCaseType useCaseType) {
        this.useCaseType = useCaseType.toString();
    }

    /**
     * <p>
     * The type of use case to associate to the integration association. Each
     * integration association can have only one of each use case type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RULES_EVALUATION, CONNECT_CAMPAIGNS
     *
     * @param useCaseType <p>
     *            The type of use case to associate to the integration
     *            association. Each integration association can have only one of
     *            each use case type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UseCaseType
     */
    public CreateUseCaseRequest withUseCaseType(UseCaseType useCaseType) {
        this.useCaseType = useCaseType.toString();
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUseCaseRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUseCaseRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateUseCaseRequest clearTagsEntries() {
        this.tags = null;
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
        if (getUseCaseType() != null)
            sb.append("UseCaseType: " + getUseCaseType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode
                + ((getUseCaseType() == null) ? 0 : getUseCaseType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUseCaseRequest == false)
            return false;
        CreateUseCaseRequest other = (CreateUseCaseRequest) obj;

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
        if (other.getUseCaseType() == null ^ this.getUseCaseType() == null)
            return false;
        if (other.getUseCaseType() != null
                && other.getUseCaseType().equals(this.getUseCaseType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
