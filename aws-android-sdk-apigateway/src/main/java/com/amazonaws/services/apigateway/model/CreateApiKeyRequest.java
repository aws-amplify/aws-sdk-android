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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create an <a>ApiKey</a> resource.
 * </p>
 * <div class="seeAlso"><a href=
 * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html"
 * >AWS CLI</a></div>
 */
public class CreateApiKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key
     * identifier is distinct from the created API key value. This parameter is
     * deprecated and should not be used.
     * </p>
     */
    private Boolean generateDistinctId;

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     */
    private String value;

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API
     * key.
     * </p>
     */
    private java.util.List<StageKey> stageKeys;

    /**
     * <p>
     * An AWS Marketplace customer identifier , when integrating with the AWS
     * SaaS Marketplace.
     * </p>
     */
    private String customerId;

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     *
     * @return <p>
     *         The name of the <a>ApiKey</a>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     *
     * @param name <p>
     *            The name of the <a>ApiKey</a>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>ApiKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the <a>ApiKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     *
     * @return <p>
     *         The description of the <a>ApiKey</a>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     *
     * @param description <p>
     *            The description of the <a>ApiKey</a>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>ApiKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the <a>ApiKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     *
     * @return <p>
     *         Specifies whether the <a>ApiKey</a> can be used by callers.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     *
     * @return <p>
     *         Specifies whether the <a>ApiKey</a> can be used by callers.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether the <a>ApiKey</a> can be used by callers.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the <a>ApiKey</a> can be used by callers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether the <a>ApiKey</a> can be used by callers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key
     * identifier is distinct from the created API key value. This parameter is
     * deprecated and should not be used.
     * </p>
     *
     * @return <p>
     *         Specifies whether (<code>true</code>) or not (<code>false</code>)
     *         the key identifier is distinct from the created API key value.
     *         This parameter is deprecated and should not be used.
     *         </p>
     */
    public Boolean isGenerateDistinctId() {
        return generateDistinctId;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key
     * identifier is distinct from the created API key value. This parameter is
     * deprecated and should not be used.
     * </p>
     *
     * @return <p>
     *         Specifies whether (<code>true</code>) or not (<code>false</code>)
     *         the key identifier is distinct from the created API key value.
     *         This parameter is deprecated and should not be used.
     *         </p>
     */
    public Boolean getGenerateDistinctId() {
        return generateDistinctId;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key
     * identifier is distinct from the created API key value. This parameter is
     * deprecated and should not be used.
     * </p>
     *
     * @param generateDistinctId <p>
     *            Specifies whether (<code>true</code>) or not (
     *            <code>false</code>) the key identifier is distinct from the
     *            created API key value. This parameter is deprecated and should
     *            not be used.
     *            </p>
     */
    public void setGenerateDistinctId(Boolean generateDistinctId) {
        this.generateDistinctId = generateDistinctId;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the key
     * identifier is distinct from the created API key value. This parameter is
     * deprecated and should not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generateDistinctId <p>
     *            Specifies whether (<code>true</code>) or not (
     *            <code>false</code>) the key identifier is distinct from the
     *            created API key value. This parameter is deprecated and should
     *            not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withGenerateDistinctId(Boolean generateDistinctId) {
        this.generateDistinctId = generateDistinctId;
        return this;
    }

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     *
     * @return <p>
     *         Specifies a value of the API key.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     *
     * @param value <p>
     *            Specifies a value of the API key.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specifies a value of the API key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            Specifies a value of the API key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API
     * key.
     * </p>
     *
     * @return <p>
     *         DEPRECATED FOR USAGE PLANS - Specifies stages associated with the
     *         API key.
     *         </p>
     */
    public java.util.List<StageKey> getStageKeys() {
        return stageKeys;
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API
     * key.
     * </p>
     *
     * @param stageKeys <p>
     *            DEPRECATED FOR USAGE PLANS - Specifies stages associated with
     *            the API key.
     *            </p>
     */
    public void setStageKeys(java.util.Collection<StageKey> stageKeys) {
        if (stageKeys == null) {
            this.stageKeys = null;
            return;
        }

        this.stageKeys = new java.util.ArrayList<StageKey>(stageKeys);
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API
     * key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageKeys <p>
     *            DEPRECATED FOR USAGE PLANS - Specifies stages associated with
     *            the API key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withStageKeys(StageKey... stageKeys) {
        if (getStageKeys() == null) {
            this.stageKeys = new java.util.ArrayList<StageKey>(stageKeys.length);
        }
        for (StageKey value : stageKeys) {
            this.stageKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API
     * key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageKeys <p>
     *            DEPRECATED FOR USAGE PLANS - Specifies stages associated with
     *            the API key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withStageKeys(java.util.Collection<StageKey> stageKeys) {
        setStageKeys(stageKeys);
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
    public CreateApiKeyRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @return <p>
     *         The key-value map of strings. The valid character set is
     *         [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     *         not start with <code>aws:</code>. The tag value can be up to 256
     *         characters.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiKeyRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
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
    public CreateApiKeyRequest addtagsEntry(String key, String value) {
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
    public CreateApiKeyRequest cleartagsEntries() {
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
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getGenerateDistinctId() != null)
            sb.append("generateDistinctId: " + getGenerateDistinctId() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getStageKeys() != null)
            sb.append("stageKeys: " + getStageKeys() + ",");
        if (getCustomerId() != null)
            sb.append("customerId: " + getCustomerId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getGenerateDistinctId() == null) ? 0 : getGenerateDistinctId().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStageKeys() == null) ? 0 : getStageKeys().hashCode());
        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApiKeyRequest == false)
            return false;
        CreateApiKeyRequest other = (CreateApiKeyRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getGenerateDistinctId() == null ^ this.getGenerateDistinctId() == null)
            return false;
        if (other.getGenerateDistinctId() != null
                && other.getGenerateDistinctId().equals(this.getGenerateDistinctId()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStageKeys() == null ^ this.getStageKeys() == null)
            return false;
        if (other.getStageKeys() != null
                && other.getStageKeys().equals(this.getStageKeys()) == false)
            return false;
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null
                && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
