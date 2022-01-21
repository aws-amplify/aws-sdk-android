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
 * Creates a new queue for the specified Amazon Connect instance.
 * </p>
 */
public class CreateQueueRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     */
    private OutboundCallerConfig outboundCallerConfig;

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     */
    private String hoursOfOperationId;

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is
     * considered full.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer maxContacts;

    /**
     * <p>
     * The quick connects available to agents who are working the queue.
     * </p>
     */
    private java.util.List<String> quickConnectIds;

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
    public CreateQueueRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The name of the queue.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the queue.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         The description of the queue.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description of the queue.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     *
     * @return <p>
     *         The outbound caller ID name, number, and outbound whisper flow.
     *         </p>
     */
    public OutboundCallerConfig getOutboundCallerConfig() {
        return outboundCallerConfig;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     *
     * @param outboundCallerConfig <p>
     *            The outbound caller ID name, number, and outbound whisper
     *            flow.
     *            </p>
     */
    public void setOutboundCallerConfig(OutboundCallerConfig outboundCallerConfig) {
        this.outboundCallerConfig = outboundCallerConfig;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCallerConfig <p>
     *            The outbound caller ID name, number, and outbound whisper
     *            flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withOutboundCallerConfig(OutboundCallerConfig outboundCallerConfig) {
        this.outboundCallerConfig = outboundCallerConfig;
        return this;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     *
     * @return <p>
     *         The identifier for the hours of operation.
     *         </p>
     */
    public String getHoursOfOperationId() {
        return hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     *
     * @param hoursOfOperationId <p>
     *            The identifier for the hours of operation.
     *            </p>
     */
    public void setHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationId <p>
     *            The identifier for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
        return this;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is
     * considered full.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The maximum number of contacts that can be in the queue before it
     *         is considered full.
     *         </p>
     */
    public Integer getMaxContacts() {
        return maxContacts;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is
     * considered full.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxContacts <p>
     *            The maximum number of contacts that can be in the queue before
     *            it is considered full.
     *            </p>
     */
    public void setMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is
     * considered full.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxContacts <p>
     *            The maximum number of contacts that can be in the queue before
     *            it is considered full.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
        return this;
    }

    /**
     * <p>
     * The quick connects available to agents who are working the queue.
     * </p>
     *
     * @return <p>
     *         The quick connects available to agents who are working the queue.
     *         </p>
     */
    public java.util.List<String> getQuickConnectIds() {
        return quickConnectIds;
    }

    /**
     * <p>
     * The quick connects available to agents who are working the queue.
     * </p>
     *
     * @param quickConnectIds <p>
     *            The quick connects available to agents who are working the
     *            queue.
     *            </p>
     */
    public void setQuickConnectIds(java.util.Collection<String> quickConnectIds) {
        if (quickConnectIds == null) {
            this.quickConnectIds = null;
            return;
        }

        this.quickConnectIds = new java.util.ArrayList<String>(quickConnectIds);
    }

    /**
     * <p>
     * The quick connects available to agents who are working the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectIds <p>
     *            The quick connects available to agents who are working the
     *            queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withQuickConnectIds(String... quickConnectIds) {
        if (getQuickConnectIds() == null) {
            this.quickConnectIds = new java.util.ArrayList<String>(quickConnectIds.length);
        }
        for (String value : quickConnectIds) {
            this.quickConnectIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The quick connects available to agents who are working the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectIds <p>
     *            The quick connects available to agents who are working the
     *            queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withQuickConnectIds(java.util.Collection<String> quickConnectIds) {
        setQuickConnectIds(quickConnectIds);
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
    public CreateQueueRequest withTags(java.util.Map<String, String> tags) {
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
    public CreateQueueRequest addTagsEntry(String key, String value) {
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
    public CreateQueueRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOutboundCallerConfig() != null)
            sb.append("OutboundCallerConfig: " + getOutboundCallerConfig() + ",");
        if (getHoursOfOperationId() != null)
            sb.append("HoursOfOperationId: " + getHoursOfOperationId() + ",");
        if (getMaxContacts() != null)
            sb.append("MaxContacts: " + getMaxContacts() + ",");
        if (getQuickConnectIds() != null)
            sb.append("QuickConnectIds: " + getQuickConnectIds() + ",");
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCallerConfig() == null) ? 0 : getOutboundCallerConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHoursOfOperationId() == null) ? 0 : getHoursOfOperationId().hashCode());
        hashCode = prime * hashCode
                + ((getMaxContacts() == null) ? 0 : getMaxContacts().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectIds() == null) ? 0 : getQuickConnectIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOutboundCallerConfig() == null ^ this.getOutboundCallerConfig() == null)
            return false;
        if (other.getOutboundCallerConfig() != null
                && other.getOutboundCallerConfig().equals(this.getOutboundCallerConfig()) == false)
            return false;
        if (other.getHoursOfOperationId() == null ^ this.getHoursOfOperationId() == null)
            return false;
        if (other.getHoursOfOperationId() != null
                && other.getHoursOfOperationId().equals(this.getHoursOfOperationId()) == false)
            return false;
        if (other.getMaxContacts() == null ^ this.getMaxContacts() == null)
            return false;
        if (other.getMaxContacts() != null
                && other.getMaxContacts().equals(this.getMaxContacts()) == false)
            return false;
        if (other.getQuickConnectIds() == null ^ this.getQuickConnectIds() == null)
            return false;
        if (other.getQuickConnectIds() != null
                && other.getQuickConnectIds().equals(this.getQuickConnectIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
