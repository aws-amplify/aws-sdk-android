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
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Associates a storage resource type for the first time. You can only associate
 * one type of storage configuration in a single call. This means, for example,
 * that you can't define an instance with multiple S3 buckets for storing chat
 * transcripts.
 * </p>
 * <p>
 * This API does not create a resource that doesn't exist. It only associates it
 * to the instance. Ensure that the resource being specified in the storage
 * configuration, like an S3 bucket, exists when being used for association.
 * </p>
 */
public class AssociateInstanceStorageConfigRequest extends AmazonWebServiceRequest implements
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
     * A valid resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHAT_TRANSCRIPTS, CALL_RECORDINGS,
     * SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS,
     * REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
     */
    private String resourceType;

    /**
     * <p>
     * A valid storage type.
     * </p>
     */
    private InstanceStorageConfig storageConfig;

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
    public AssociateInstanceStorageConfigRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHAT_TRANSCRIPTS, CALL_RECORDINGS,
     * SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS,
     * REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
     *
     * @return <p>
     *         A valid resource type.
     *         </p>
     * @see InstanceStorageResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHAT_TRANSCRIPTS, CALL_RECORDINGS,
     * SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS,
     * REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
     *
     * @param resourceType <p>
     *            A valid resource type.
     *            </p>
     * @see InstanceStorageResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHAT_TRANSCRIPTS, CALL_RECORDINGS,
     * SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS,
     * REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
     *
     * @param resourceType <p>
     *            A valid resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceStorageResourceType
     */
    public AssociateInstanceStorageConfigRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHAT_TRANSCRIPTS, CALL_RECORDINGS,
     * SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS,
     * REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
     *
     * @param resourceType <p>
     *            A valid resource type.
     *            </p>
     * @see InstanceStorageResourceType
     */
    public void setResourceType(InstanceStorageResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHAT_TRANSCRIPTS, CALL_RECORDINGS,
     * SCHEDULED_REPORTS, MEDIA_STREAMS, CONTACT_TRACE_RECORDS, AGENT_EVENTS,
     * REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
     *
     * @param resourceType <p>
     *            A valid resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceStorageResourceType
     */
    public AssociateInstanceStorageConfigRequest withResourceType(
            InstanceStorageResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     *
     * @return <p>
     *         A valid storage type.
     *         </p>
     */
    public InstanceStorageConfig getStorageConfig() {
        return storageConfig;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     *
     * @param storageConfig <p>
     *            A valid storage type.
     *            </p>
     */
    public void setStorageConfig(InstanceStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageConfig <p>
     *            A valid storage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateInstanceStorageConfigRequest withStorageConfig(
            InstanceStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getStorageConfig() != null)
            sb.append("StorageConfig: " + getStorageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getStorageConfig() == null) ? 0 : getStorageConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateInstanceStorageConfigRequest == false)
            return false;
        AssociateInstanceStorageConfigRequest other = (AssociateInstanceStorageConfigRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStorageConfig() == null ^ this.getStorageConfig() == null)
            return false;
        if (other.getStorageConfig() != null
                && other.getStorageConfig().equals(this.getStorageConfig()) == false)
            return false;
        return true;
    }
}
