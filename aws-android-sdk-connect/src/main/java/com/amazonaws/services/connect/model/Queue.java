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
 * Contains information about a queue.
 * </p>
 */
public class Queue implements Serializable {
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
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     */
    private String queueArn;

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;

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
     * The status of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public Queue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the queue.
     *         </p>
     */
    public String getQueueArn() {
        return queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     *
     * @param queueArn <p>
     *            The Amazon Resource Name (ARN) for the queue.
     *            </p>
     */
    public void setQueueArn(String queueArn) {
        this.queueArn = queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueArn <p>
     *            The Amazon Resource Name (ARN) for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Queue withQueueArn(String queueArn) {
        this.queueArn = queueArn;
        return this;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @return <p>
     *         The identifier for the queue.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Queue withQueueId(String queueId) {
        this.queueId = queueId;
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
    public Queue withDescription(String description) {
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
    public Queue withOutboundCallerConfig(OutboundCallerConfig outboundCallerConfig) {
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
    public Queue withHoursOfOperationId(String hoursOfOperationId) {
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
    public Queue withMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
        return this;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The status of the queue.
     *         </p>
     * @see QueueStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The status of the queue.
     *            </p>
     * @see QueueStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The status of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueStatus
     */
    public Queue withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The status of the queue.
     *            </p>
     * @see QueueStatus
     */
    public void setStatus(QueueStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The status of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueStatus
     */
    public Queue withStatus(QueueStatus status) {
        this.status = status.toString();
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
    public Queue withTags(java.util.Map<String, String> tags) {
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
    public Queue addTagsEntry(String key, String value) {
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
    public Queue clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getQueueArn() != null)
            sb.append("QueueArn: " + getQueueArn() + ",");
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOutboundCallerConfig() != null)
            sb.append("OutboundCallerConfig: " + getOutboundCallerConfig() + ",");
        if (getHoursOfOperationId() != null)
            sb.append("HoursOfOperationId: " + getHoursOfOperationId() + ",");
        if (getMaxContacts() != null)
            sb.append("MaxContacts: " + getMaxContacts() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueueArn() == null) ? 0 : getQueueArn().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCallerConfig() == null) ? 0 : getOutboundCallerConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHoursOfOperationId() == null) ? 0 : getHoursOfOperationId().hashCode());
        hashCode = prime * hashCode
                + ((getMaxContacts() == null) ? 0 : getMaxContacts().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Queue == false)
            return false;
        Queue other = (Queue) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueueArn() == null ^ this.getQueueArn() == null)
            return false;
        if (other.getQueueArn() != null && other.getQueueArn().equals(this.getQueueArn()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
