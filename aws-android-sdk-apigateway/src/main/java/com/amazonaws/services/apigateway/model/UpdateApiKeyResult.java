/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * A resource that can be distributed to callers for executing <a>Method</a>
 * resources that require an API key. API keys can be mapped to any <a>Stage</a>
 * on any <a>RestApi</a>, which indicates that the callers with the API key can
 * make requests to that stage.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html"
 * >Use API Keys</a> </div>
 */
public class UpdateApiKeyResult implements Serializable {
    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The value of the API Key.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the API Key.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS
     * SaaS Marketplace.
     * </p>
     */
    private String customerId;

    /**
     * <p>
     * The description of the API Key.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the
     * <a>ApiKey</a> resource.
     * </p>
     */
    private java.util.List<String> stageKeys;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     *
     * @return <p>
     *         The identifier of the API Key.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     *
     * @param id <p>
     *            The identifier of the API Key.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the API Key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the API Key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The value of the API Key.
     * </p>
     *
     * @return <p>
     *         The value of the API Key.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the API Key.
     * </p>
     *
     * @param value <p>
     *            The value of the API Key.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the API Key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the API Key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The name of the API Key.
     * </p>
     *
     * @return <p>
     *         The name of the API Key.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the API Key.
     * </p>
     *
     * @param name <p>
     *            The name of the API Key.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API Key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the API Key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS
     * SaaS Marketplace.
     * </p>
     *
     * @return <p>
     *         An AWS Marketplace customer identifier , when integrating with
     *         the AWS SaaS Marketplace.
     *         </p>
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS
     * SaaS Marketplace.
     * </p>
     *
     * @param customerId <p>
     *            An AWS Marketplace customer identifier , when integrating with
     *            the AWS SaaS Marketplace.
     *            </p>
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS
     * SaaS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerId <p>
     *            An AWS Marketplace customer identifier , when integrating with
     *            the AWS SaaS Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * <p>
     * The description of the API Key.
     * </p>
     *
     * @return <p>
     *         The description of the API Key.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the API Key.
     * </p>
     *
     * @param description <p>
     *            The description of the API Key.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the API Key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the API Key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     *
     * @return <p>
     *         Specifies whether the API Key can be used by callers.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     *
     * @return <p>
     *         Specifies whether the API Key can be used by callers.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether the API Key can be used by callers.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the API Key can be used by callers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether the API Key can be used by callers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the API Key was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     *
     * @param createdDate <p>
     *            The timestamp when the API Key was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The timestamp when the API Key was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp when the API Key was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The timestamp when the API Key was last updated.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the API Key was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The timestamp when the API Key was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the
     * <a>ApiKey</a> resource.
     * </p>
     *
     * @return <p>
     *         A list of <a>Stage</a> resources that are associated with the
     *         <a>ApiKey</a> resource.
     *         </p>
     */
    public java.util.List<String> getStageKeys() {
        return stageKeys;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the
     * <a>ApiKey</a> resource.
     * </p>
     *
     * @param stageKeys <p>
     *            A list of <a>Stage</a> resources that are associated with the
     *            <a>ApiKey</a> resource.
     *            </p>
     */
    public void setStageKeys(java.util.Collection<String> stageKeys) {
        if (stageKeys == null) {
            this.stageKeys = null;
            return;
        }

        this.stageKeys = new java.util.ArrayList<String>(stageKeys);
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the
     * <a>ApiKey</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageKeys <p>
     *            A list of <a>Stage</a> resources that are associated with the
     *            <a>ApiKey</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withStageKeys(String... stageKeys) {
        if (getStageKeys() == null) {
            this.stageKeys = new java.util.ArrayList<String>(stageKeys.length);
        }
        for (String value : stageKeys) {
            this.stageKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the
     * <a>ApiKey</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageKeys <p>
     *            A list of <a>Stage</a> resources that are associated with the
     *            <a>ApiKey</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withStageKeys(java.util.Collection<String> stageKeys) {
        setStageKeys(stageKeys);
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @return <p>
     *         The collection of tags. Each tag element is associated with a
     *         given resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiKeyResult addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateApiKeyResult cleartagsEntries() {
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getCustomerId() != null)
            sb.append("customerId: " + getCustomerId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("lastUpdatedDate: " + getLastUpdatedDate() + ",");
        if (getStageKeys() != null)
            sb.append("stageKeys: " + getStageKeys() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getStageKeys() == null) ? 0 : getStageKeys().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApiKeyResult == false)
            return false;
        UpdateApiKeyResult other = (UpdateApiKeyResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null
                && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null
                && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getStageKeys() == null ^ this.getStageKeys() == null)
            return false;
        if (other.getStageKeys() != null
                && other.getStageKeys().equals(this.getStageKeys()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
