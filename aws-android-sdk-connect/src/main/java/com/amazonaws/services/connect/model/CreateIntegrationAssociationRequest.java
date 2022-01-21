/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates an Amazon Web Services resource association with an Amazon Connect
 * instance.
 * </p>
 */
public class CreateIntegrationAssociationRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The type of information to be ingested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     */
    private String integrationType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integration.
     * </p>
     */
    private String integrationArn;

    /**
     * <p>
     * The URL for the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String sourceApplicationUrl;

    /**
     * <p>
     * The name of the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     */
    private String sourceApplicationName;

    /**
     * <p>
     * The type of the data source. This field is only required for the EVENT
     * integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     */
    private String sourceType;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
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
    public CreateIntegrationAssociationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The type of information to be ingested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @return <p>
     *         The type of information to be ingested.
     *         </p>
     * @see IntegrationType
     */
    public String getIntegrationType() {
        return integrationType;
    }

    /**
     * <p>
     * The type of information to be ingested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @param integrationType <p>
     *            The type of information to be ingested.
     *            </p>
     * @see IntegrationType
     */
    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * <p>
     * The type of information to be ingested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @param integrationType <p>
     *            The type of information to be ingested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public CreateIntegrationAssociationRequest withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    /**
     * <p>
     * The type of information to be ingested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @param integrationType <p>
     *            The type of information to be ingested.
     *            </p>
     * @see IntegrationType
     */
    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
    }

    /**
     * <p>
     * The type of information to be ingested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @param integrationType <p>
     *            The type of information to be ingested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public CreateIntegrationAssociationRequest withIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integration.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the integration.
     *         </p>
     */
    public String getIntegrationArn() {
        return integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integration.
     * </p>
     *
     * @param integrationArn <p>
     *            The Amazon Resource Name (ARN) of the integration.
     *            </p>
     */
    public void setIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationArn <p>
     *            The Amazon Resource Name (ARN) of the integration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIntegrationAssociationRequest withIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
        return this;
    }

    /**
     * <p>
     * The URL for the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The URL for the external application. This field is only required
     *         for the EVENT integration type.
     *         </p>
     */
    public String getSourceApplicationUrl() {
        return sourceApplicationUrl;
    }

    /**
     * <p>
     * The URL for the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param sourceApplicationUrl <p>
     *            The URL for the external application. This field is only
     *            required for the EVENT integration type.
     *            </p>
     */
    public void setSourceApplicationUrl(String sourceApplicationUrl) {
        this.sourceApplicationUrl = sourceApplicationUrl;
    }

    /**
     * <p>
     * The URL for the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param sourceApplicationUrl <p>
     *            The URL for the external application. This field is only
     *            required for the EVENT integration type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIntegrationAssociationRequest withSourceApplicationUrl(String sourceApplicationUrl) {
        this.sourceApplicationUrl = sourceApplicationUrl;
        return this;
    }

    /**
     * <p>
     * The name of the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     *
     * @return <p>
     *         The name of the external application. This field is only required
     *         for the EVENT integration type.
     *         </p>
     */
    public String getSourceApplicationName() {
        return sourceApplicationName;
    }

    /**
     * <p>
     * The name of the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     *
     * @param sourceApplicationName <p>
     *            The name of the external application. This field is only
     *            required for the EVENT integration type.
     *            </p>
     */
    public void setSourceApplicationName(String sourceApplicationName) {
        this.sourceApplicationName = sourceApplicationName;
    }

    /**
     * <p>
     * The name of the external application. This field is only required for the
     * EVENT integration type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     *
     * @param sourceApplicationName <p>
     *            The name of the external application. This field is only
     *            required for the EVENT integration type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIntegrationAssociationRequest withSourceApplicationName(
            String sourceApplicationName) {
        this.sourceApplicationName = sourceApplicationName;
        return this;
    }

    /**
     * <p>
     * The type of the data source. This field is only required for the EVENT
     * integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @return <p>
     *         The type of the data source. This field is only required for the
     *         EVENT integration type.
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of the data source. This field is only required for the EVENT
     * integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The type of the data source. This field is only required for
     *            the EVENT integration type.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of the data source. This field is only required for the EVENT
     * integration type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The type of the data source. This field is only required for
     *            the EVENT integration type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public CreateIntegrationAssociationRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The type of the data source. This field is only required for the EVENT
     * integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The type of the data source. This field is only required for
     *            the EVENT integration type.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The type of the data source. This field is only required for the EVENT
     * integration type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The type of the data source. This field is only required for
     *            the EVENT integration type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public CreateIntegrationAssociationRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIntegrationAssociationRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
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
    public CreateIntegrationAssociationRequest addTagsEntry(String key, String value) {
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
    public CreateIntegrationAssociationRequest clearTagsEntries() {
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
        if (getIntegrationType() != null)
            sb.append("IntegrationType: " + getIntegrationType() + ",");
        if (getIntegrationArn() != null)
            sb.append("IntegrationArn: " + getIntegrationArn() + ",");
        if (getSourceApplicationUrl() != null)
            sb.append("SourceApplicationUrl: " + getSourceApplicationUrl() + ",");
        if (getSourceApplicationName() != null)
            sb.append("SourceApplicationName: " + getSourceApplicationName() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
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
        hashCode = prime * hashCode
                + ((getIntegrationType() == null) ? 0 : getIntegrationType().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationArn() == null) ? 0 : getIntegrationArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceApplicationUrl() == null) ? 0 : getSourceApplicationUrl().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceApplicationName() == null) ? 0 : getSourceApplicationName().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationAssociationRequest == false)
            return false;
        CreateIntegrationAssociationRequest other = (CreateIntegrationAssociationRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIntegrationType() == null ^ this.getIntegrationType() == null)
            return false;
        if (other.getIntegrationType() != null
                && other.getIntegrationType().equals(this.getIntegrationType()) == false)
            return false;
        if (other.getIntegrationArn() == null ^ this.getIntegrationArn() == null)
            return false;
        if (other.getIntegrationArn() != null
                && other.getIntegrationArn().equals(this.getIntegrationArn()) == false)
            return false;
        if (other.getSourceApplicationUrl() == null ^ this.getSourceApplicationUrl() == null)
            return false;
        if (other.getSourceApplicationUrl() != null
                && other.getSourceApplicationUrl().equals(this.getSourceApplicationUrl()) == false)
            return false;
        if (other.getSourceApplicationName() == null ^ this.getSourceApplicationName() == null)
            return false;
        if (other.getSourceApplicationName() != null
                && other.getSourceApplicationName().equals(this.getSourceApplicationName()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
