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

/**
 * <p>
 * Contains summary information about the associated AppIntegrations.
 * </p>
 */
public class IntegrationAssociationSummary implements Serializable {
    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String integrationAssociationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     */
    private String integrationAssociationArn;

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
     * The integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     */
    private String integrationType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     */
    private String integrationArn;

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String sourceApplicationUrl;

    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     */
    private String sourceApplicationName;

    /**
     * <p>
     * The name of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     */
    private String sourceType;

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The identifier for the AppIntegration association.
     *         </p>
     */
    public String getIntegrationAssociationId() {
        return integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param integrationAssociationId <p>
     *            The identifier for the AppIntegration association.
     *            </p>
     */
    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param integrationAssociationId <p>
     *            The identifier for the AppIntegration association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegrationAssociationSummary withIntegrationAssociationId(
            String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the AppIntegration
     *         association.
     *         </p>
     */
    public String getIntegrationAssociationArn() {
        return integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     *
     * @param integrationAssociationArn <p>
     *            The Amazon Resource Name (ARN) for the AppIntegration
     *            association.
     *            </p>
     */
    public void setIntegrationAssociationArn(String integrationAssociationArn) {
        this.integrationAssociationArn = integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationAssociationArn <p>
     *            The Amazon Resource Name (ARN) for the AppIntegration
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegrationAssociationSummary withIntegrationAssociationArn(
            String integrationAssociationArn) {
        this.integrationAssociationArn = integrationAssociationArn;
        return this;
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
    public IntegrationAssociationSummary withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @return <p>
     *         The integration type.
     *         </p>
     * @see IntegrationType
     */
    public String getIntegrationType() {
        return integrationType;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @param integrationType <p>
     *            The integration type.
     *            </p>
     * @see IntegrationType
     */
    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * <p>
     * The integration type.
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
     *            The integration type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public IntegrationAssociationSummary withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, VOICE_ID, PINPOINT_APP, WISDOM_ASSISTANT,
     * WISDOM_KNOWLEDGE_BASE
     *
     * @param integrationType <p>
     *            The integration type.
     *            </p>
     * @see IntegrationType
     */
    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
    }

    /**
     * <p>
     * The integration type.
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
     *            The integration type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public IntegrationAssociationSummary withIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the AppIntegration.
     *         </p>
     */
    public String getIntegrationArn() {
        return integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     *
     * @param integrationArn <p>
     *            The Amazon Resource Name (ARN) for the AppIntegration.
     *            </p>
     */
    public void setIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationArn <p>
     *            The Amazon Resource Name (ARN) for the AppIntegration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegrationAssociationSummary withIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
        return this;
    }

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The URL for the external application.
     *         </p>
     */
    public String getSourceApplicationUrl() {
        return sourceApplicationUrl;
    }

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param sourceApplicationUrl <p>
     *            The URL for the external application.
     *            </p>
     */
    public void setSourceApplicationUrl(String sourceApplicationUrl) {
        this.sourceApplicationUrl = sourceApplicationUrl;
    }

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param sourceApplicationUrl <p>
     *            The URL for the external application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegrationAssociationSummary withSourceApplicationUrl(String sourceApplicationUrl) {
        this.sourceApplicationUrl = sourceApplicationUrl;
        return this;
    }

    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     *
     * @return <p>
     *         The user-provided, friendly name for the external application.
     *         </p>
     */
    public String getSourceApplicationName() {
        return sourceApplicationName;
    }

    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_ -]+$<br/>
     *
     * @param sourceApplicationName <p>
     *            The user-provided, friendly name for the external application.
     *            </p>
     */
    public void setSourceApplicationName(String sourceApplicationName) {
        this.sourceApplicationName = sourceApplicationName;
    }

    /**
     * <p>
     * The user-provided, friendly name for the external application.
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
     *            The user-provided, friendly name for the external application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegrationAssociationSummary withSourceApplicationName(String sourceApplicationName) {
        this.sourceApplicationName = sourceApplicationName;
        return this;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @return <p>
     *         The name of the source.
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The name of the source.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The name of the source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public IntegrationAssociationSummary withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The name of the source.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SALESFORCE, ZENDESK
     *
     * @param sourceType <p>
     *            The name of the source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public IntegrationAssociationSummary withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
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
            sb.append("IntegrationAssociationArn: " + getIntegrationAssociationArn() + ",");
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
            sb.append("SourceType: " + getSourceType());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegrationAssociationSummary == false)
            return false;
        IntegrationAssociationSummary other = (IntegrationAssociationSummary) obj;

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
        return true;
    }
}
