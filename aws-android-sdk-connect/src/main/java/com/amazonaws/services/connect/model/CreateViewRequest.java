/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new view with the possible status of <code>SAVED</code> or
 * <code>PUBLISHED</code>.
 * </p>
 * <p>
 * The views will have a unique name for each connect instance.
 * </p>
 * <p>
 * It performs basic content validation if the status is <code>SAVED</code> or
 * full content validation if the status is set to <code>PUBLISHED</code>. An
 * error is returned if validation fails. It associates either the
 * <code>$SAVED</code> qualifier or both of the <code>$SAVED</code> and
 * <code>$LATEST</code> qualifiers with the provided view content based on the
 * status. The view is idempotent if ClientToken is provided.
 * </p>
 */
public class CreateViewRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view
     * creation. For example, the view is idempotent ClientToken is provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:\/=+\-@]*)$<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     */
    private String status;

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     */
    private ViewInputContent content;

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     */
    private String name;

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).These tags can be used to organize, track, or control access for
     * this resource. For example, { "tags": {"key1":"value1", "key2":"value2"}
     * }.
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
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
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
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
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
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view
     * creation. For example, the view is idempotent ClientToken is provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:\/=+\-@]*)$<br/>
     *
     * @return <p>
     *         A unique Id for each create view request to avoid duplicate view
     *         creation. For example, the view is idempotent ClientToken is
     *         provided.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view
     * creation. For example, the view is idempotent ClientToken is provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:\/=+\-@]*)$<br/>
     *
     * @param clientToken <p>
     *            A unique Id for each create view request to avoid duplicate
     *            view creation. For example, the view is idempotent ClientToken
     *            is provided.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique Id for each create view request to avoid duplicate view
     * creation. For example, the view is idempotent ClientToken is provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:\/=+\-@]*)$<br/>
     *
     * @param clientToken <p>
     *            A unique Id for each create view request to avoid duplicate
     *            view creation. For example, the view is idempotent ClientToken
     *            is provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @return <p>
     *         Indicates the view status as either <code>SAVED</code> or
     *         <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *         initiate validation on the content.
     *         </p>
     * @see ViewStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public CreateViewRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(ViewStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public CreateViewRequest withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     *
     * @return <p>
     *         View content containing all content necessary to render a view
     *         except for runtime input data.
     *         </p>
     *         <p>
     *         The total uncompressed content has a maximum file size of 400kB.
     *         </p>
     */
    public ViewInputContent getContent() {
        return content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data.
     *            </p>
     *            <p>
     *            The total uncompressed content has a maximum file size of
     *            400kB.
     *            </p>
     */
    public void setContent(ViewInputContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data.
     *            </p>
     *            <p>
     *            The total uncompressed content has a maximum file size of
     *            400kB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewRequest withContent(ViewInputContent content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description of the view.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @return <p>
     *         The name of the view.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).These tags can be used to organize, track, or control access for
     * this resource. For example, { "tags": {"key1":"value1", "key2":"value2"}
     * }.
     * </p>
     *
     * @return <p>
     *         The tags associated with the view resource (not specific to view
     *         version).These tags can be used to organize, track, or control
     *         access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).These tags can be used to organize, track, or control access for
     * this resource. For example, { "tags": {"key1":"value1", "key2":"value2"}
     * }.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the view resource (not specific to
     *            view version).These tags can be used to organize, track, or
     *            control access for this resource. For example, { "tags":
     *            {"key1":"value1", "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).These tags can be used to organize, track, or control access for
     * this resource. For example, { "tags": {"key1":"value1", "key2":"value2"}
     * }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the view resource (not specific to
     *            view version).These tags can be used to organize, track, or
     *            control access for this resource. For example, { "tags":
     *            {"key1":"value1", "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).These tags can be used to organize, track, or control access for
     * this resource. For example, { "tags": {"key1":"value1", "key2":"value2"}
     * }.
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
    public CreateViewRequest addTagsEntry(String key, String value) {
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
    public CreateViewRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
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
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateViewRequest == false)
            return false;
        CreateViewRequest other = (CreateViewRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
