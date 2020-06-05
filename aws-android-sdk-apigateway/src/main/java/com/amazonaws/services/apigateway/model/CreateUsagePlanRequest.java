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
 * Creates a usage plan with the throttle and quota limits, as well as the
 * associated API stages, specified in the payload.
 * </p>
 */
public class CreateUsagePlanRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     */
    private java.util.List<ApiStage> apiStages;

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     */
    private ThrottleSettings throttle;

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     */
    private QuotaSettings quota;

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
     * [Required] The name of the usage plan.
     * </p>
     *
     * @return <p>
     *         [Required] The name of the usage plan.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     *
     * @param name <p>
     *            [Required] The name of the usage plan.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            [Required] The name of the usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsagePlanRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     *
     * @return <p>
     *         The description of the usage plan.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     *
     * @param description <p>
     *            The description of the usage plan.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsagePlanRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     *
     * @return <p>
     *         The associated API stages of the usage plan.
     *         </p>
     */
    public java.util.List<ApiStage> getApiStages() {
        return apiStages;
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     *
     * @param apiStages <p>
     *            The associated API stages of the usage plan.
     *            </p>
     */
    public void setApiStages(java.util.Collection<ApiStage> apiStages) {
        if (apiStages == null) {
            this.apiStages = null;
            return;
        }

        this.apiStages = new java.util.ArrayList<ApiStage>(apiStages);
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiStages <p>
     *            The associated API stages of the usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsagePlanRequest withApiStages(ApiStage... apiStages) {
        if (getApiStages() == null) {
            this.apiStages = new java.util.ArrayList<ApiStage>(apiStages.length);
        }
        for (ApiStage value : apiStages) {
            this.apiStages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiStages <p>
     *            The associated API stages of the usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsagePlanRequest withApiStages(java.util.Collection<ApiStage> apiStages) {
        setApiStages(apiStages);
        return this;
    }

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     *
     * @return <p>
     *         The throttling limits of the usage plan.
     *         </p>
     */
    public ThrottleSettings getThrottle() {
        return throttle;
    }

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     *
     * @param throttle <p>
     *            The throttling limits of the usage plan.
     *            </p>
     */
    public void setThrottle(ThrottleSettings throttle) {
        this.throttle = throttle;
    }

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttle <p>
     *            The throttling limits of the usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsagePlanRequest withThrottle(ThrottleSettings throttle) {
        this.throttle = throttle;
        return this;
    }

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     *
     * @return <p>
     *         The quota of the usage plan.
     *         </p>
     */
    public QuotaSettings getQuota() {
        return quota;
    }

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     *
     * @param quota <p>
     *            The quota of the usage plan.
     *            </p>
     */
    public void setQuota(QuotaSettings quota) {
        this.quota = quota;
    }

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quota <p>
     *            The quota of the usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsagePlanRequest withQuota(QuotaSettings quota) {
        this.quota = quota;
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
    public CreateUsagePlanRequest withTags(java.util.Map<String, String> tags) {
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
    public CreateUsagePlanRequest addtagsEntry(String key, String value) {
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
    public CreateUsagePlanRequest cleartagsEntries() {
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
        if (getApiStages() != null)
            sb.append("apiStages: " + getApiStages() + ",");
        if (getThrottle() != null)
            sb.append("throttle: " + getThrottle() + ",");
        if (getQuota() != null)
            sb.append("quota: " + getQuota() + ",");
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
        hashCode = prime * hashCode + ((getApiStages() == null) ? 0 : getApiStages().hashCode());
        hashCode = prime * hashCode + ((getThrottle() == null) ? 0 : getThrottle().hashCode());
        hashCode = prime * hashCode + ((getQuota() == null) ? 0 : getQuota().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUsagePlanRequest == false)
            return false;
        CreateUsagePlanRequest other = (CreateUsagePlanRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApiStages() == null ^ this.getApiStages() == null)
            return false;
        if (other.getApiStages() != null
                && other.getApiStages().equals(this.getApiStages()) == false)
            return false;
        if (other.getThrottle() == null ^ this.getThrottle() == null)
            return false;
        if (other.getThrottle() != null && other.getThrottle().equals(this.getThrottle()) == false)
            return false;
        if (other.getQuota() == null ^ this.getQuota() == null)
            return false;
        if (other.getQuota() != null && other.getQuota().equals(this.getQuota()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
