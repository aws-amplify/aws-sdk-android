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
 * Creates a new routing profile.
 * </p>
 */
public class CreateRoutingProfileRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String name;

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     */
    private String defaultOutboundQueueId;

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is
     * added, the agent can make only outbound calls.
     * </p>
     */
    private java.util.List<RoutingProfileQueueConfig> queueConfigs;

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP)
     * for this routing profile.
     * </p>
     */
    private java.util.List<MediaConcurrency> mediaConcurrencies;

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
    public CreateRoutingProfileRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The name of the routing profile. Must not be more than 127
     *         characters.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the routing profile. Must not be more than 127
     *            characters.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the routing profile. Must not be more than 127
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         Description of the routing profile. Must not be more than 250
     *         characters.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            Description of the routing profile. Must not be more than 250
     *            characters.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            Description of the routing profile. Must not be more than 250
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     *
     * @return <p>
     *         The default outbound queue for the routing profile.
     *         </p>
     */
    public String getDefaultOutboundQueueId() {
        return defaultOutboundQueueId;
    }

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     *
     * @param defaultOutboundQueueId <p>
     *            The default outbound queue for the routing profile.
     *            </p>
     */
    public void setDefaultOutboundQueueId(String defaultOutboundQueueId) {
        this.defaultOutboundQueueId = defaultOutboundQueueId;
    }

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultOutboundQueueId <p>
     *            The default outbound queue for the routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withDefaultOutboundQueueId(String defaultOutboundQueueId) {
        this.defaultOutboundQueueId = defaultOutboundQueueId;
        return this;
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is
     * added, the agent can make only outbound calls.
     * </p>
     *
     * @return <p>
     *         The inbound queues associated with the routing profile. If no
     *         queue is added, the agent can make only outbound calls.
     *         </p>
     */
    public java.util.List<RoutingProfileQueueConfig> getQueueConfigs() {
        return queueConfigs;
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is
     * added, the agent can make only outbound calls.
     * </p>
     *
     * @param queueConfigs <p>
     *            The inbound queues associated with the routing profile. If no
     *            queue is added, the agent can make only outbound calls.
     *            </p>
     */
    public void setQueueConfigs(java.util.Collection<RoutingProfileQueueConfig> queueConfigs) {
        if (queueConfigs == null) {
            this.queueConfigs = null;
            return;
        }

        this.queueConfigs = new java.util.ArrayList<RoutingProfileQueueConfig>(queueConfigs);
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is
     * added, the agent can make only outbound calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueConfigs <p>
     *            The inbound queues associated with the routing profile. If no
     *            queue is added, the agent can make only outbound calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withQueueConfigs(RoutingProfileQueueConfig... queueConfigs) {
        if (getQueueConfigs() == null) {
            this.queueConfigs = new java.util.ArrayList<RoutingProfileQueueConfig>(
                    queueConfigs.length);
        }
        for (RoutingProfileQueueConfig value : queueConfigs) {
            this.queueConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is
     * added, the agent can make only outbound calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueConfigs <p>
     *            The inbound queues associated with the routing profile. If no
     *            queue is added, the agent can make only outbound calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withQueueConfigs(
            java.util.Collection<RoutingProfileQueueConfig> queueConfigs) {
        setQueueConfigs(queueConfigs);
        return this;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP)
     * for this routing profile.
     * </p>
     *
     * @return <p>
     *         The channels that agents can handle in the Contact Control Panel
     *         (CCP) for this routing profile.
     *         </p>
     */
    public java.util.List<MediaConcurrency> getMediaConcurrencies() {
        return mediaConcurrencies;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP)
     * for this routing profile.
     * </p>
     *
     * @param mediaConcurrencies <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP) for this routing profile.
     *            </p>
     */
    public void setMediaConcurrencies(java.util.Collection<MediaConcurrency> mediaConcurrencies) {
        if (mediaConcurrencies == null) {
            this.mediaConcurrencies = null;
            return;
        }

        this.mediaConcurrencies = new java.util.ArrayList<MediaConcurrency>(mediaConcurrencies);
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP)
     * for this routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConcurrencies <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP) for this routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withMediaConcurrencies(
            MediaConcurrency... mediaConcurrencies) {
        if (getMediaConcurrencies() == null) {
            this.mediaConcurrencies = new java.util.ArrayList<MediaConcurrency>(
                    mediaConcurrencies.length);
        }
        for (MediaConcurrency value : mediaConcurrencies) {
            this.mediaConcurrencies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP)
     * for this routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaConcurrencies <p>
     *            The channels that agents can handle in the Contact Control
     *            Panel (CCP) for this routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileRequest withMediaConcurrencies(
            java.util.Collection<MediaConcurrency> mediaConcurrencies) {
        setMediaConcurrencies(mediaConcurrencies);
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
    public CreateRoutingProfileRequest withTags(java.util.Map<String, String> tags) {
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
    public CreateRoutingProfileRequest addTagsEntry(String key, String value) {
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
    public CreateRoutingProfileRequest clearTagsEntries() {
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
        if (getDefaultOutboundQueueId() != null)
            sb.append("DefaultOutboundQueueId: " + getDefaultOutboundQueueId() + ",");
        if (getQueueConfigs() != null)
            sb.append("QueueConfigs: " + getQueueConfigs() + ",");
        if (getMediaConcurrencies() != null)
            sb.append("MediaConcurrencies: " + getMediaConcurrencies() + ",");
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
        hashCode = prime
                * hashCode
                + ((getDefaultOutboundQueueId() == null) ? 0 : getDefaultOutboundQueueId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getQueueConfigs() == null) ? 0 : getQueueConfigs().hashCode());
        hashCode = prime * hashCode
                + ((getMediaConcurrencies() == null) ? 0 : getMediaConcurrencies().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoutingProfileRequest == false)
            return false;
        CreateRoutingProfileRequest other = (CreateRoutingProfileRequest) obj;

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
        if (other.getDefaultOutboundQueueId() == null ^ this.getDefaultOutboundQueueId() == null)
            return false;
        if (other.getDefaultOutboundQueueId() != null
                && other.getDefaultOutboundQueueId().equals(this.getDefaultOutboundQueueId()) == false)
            return false;
        if (other.getQueueConfigs() == null ^ this.getQueueConfigs() == null)
            return false;
        if (other.getQueueConfigs() != null
                && other.getQueueConfigs().equals(this.getQueueConfigs()) == false)
            return false;
        if (other.getMediaConcurrencies() == null ^ this.getMediaConcurrencies() == null)
            return false;
        if (other.getMediaConcurrencies() != null
                && other.getMediaConcurrencies().equals(this.getMediaConcurrencies()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
