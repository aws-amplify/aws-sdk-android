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
 * Represents a usage plan than can specify who can assess associated API stages
 * with specified request limits and quotas.
 * </p>
 * <div class="remarks">
 * <p>
 * In a usage plan, you associate an API by specifying the API's Id and a stage
 * name of the specified API. You add plan customers by adding API keys to the
 * plan.
 * </p>
 * </div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html"
 * >Create and Use Usage Plans</a> </div>
 */
public class UsagePlan implements Serializable {
    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     */
    private java.util.List<ApiStage> apiStages;

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     */
    private ThrottleSettings throttle;

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     */
    private QuotaSettings quota;

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as
     * a SaaS product on AWS Marketplace.
     * </p>
     */
    private String productCode;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     *
     * @return <p>
     *         The identifier of a <a>UsagePlan</a> resource.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     *
     * @param id <p>
     *            The identifier of a <a>UsagePlan</a> resource.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlan</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of a <a>UsagePlan</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     *
     * @return <p>
     *         The name of a usage plan.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     *
     * @param name <p>
     *            The name of a usage plan.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     *
     * @return <p>
     *         The description of a usage plan.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     *
     * @param description <p>
     *            The description of a usage plan.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     *
     * @return <p>
     *         The associated API stages of a usage plan.
     *         </p>
     */
    public java.util.List<ApiStage> getApiStages() {
        return apiStages;
    }

    /**
     * <p>
     * The associated API stages of a usage plan.
     * </p>
     *
     * @param apiStages <p>
     *            The associated API stages of a usage plan.
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
     * The associated API stages of a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiStages <p>
     *            The associated API stages of a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withApiStages(ApiStage... apiStages) {
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
     * The associated API stages of a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiStages <p>
     *            The associated API stages of a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withApiStages(java.util.Collection<ApiStage> apiStages) {
        setApiStages(apiStages);
        return this;
    }

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     *
     * @return <p>
     *         The request throttle limits of a usage plan.
     *         </p>
     */
    public ThrottleSettings getThrottle() {
        return throttle;
    }

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     *
     * @param throttle <p>
     *            The request throttle limits of a usage plan.
     *            </p>
     */
    public void setThrottle(ThrottleSettings throttle) {
        this.throttle = throttle;
    }

    /**
     * <p>
     * The request throttle limits of a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttle <p>
     *            The request throttle limits of a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withThrottle(ThrottleSettings throttle) {
        this.throttle = throttle;
        return this;
    }

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     *
     * @return <p>
     *         The maximum number of permitted requests per a given unit time
     *         interval.
     *         </p>
     */
    public QuotaSettings getQuota() {
        return quota;
    }

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     *
     * @param quota <p>
     *            The maximum number of permitted requests per a given unit time
     *            interval.
     *            </p>
     */
    public void setQuota(QuotaSettings quota) {
        this.quota = quota;
    }

    /**
     * <p>
     * The maximum number of permitted requests per a given unit time interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quota <p>
     *            The maximum number of permitted requests per a given unit time
     *            interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withQuota(QuotaSettings quota) {
        this.quota = quota;
        return this;
    }

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as
     * a SaaS product on AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         The AWS Markeplace product identifier to associate with the usage
     *         plan as a SaaS product on AWS Marketplace.
     *         </p>
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as
     * a SaaS product on AWS Marketplace.
     * </p>
     *
     * @param productCode <p>
     *            The AWS Markeplace product identifier to associate with the
     *            usage plan as a SaaS product on AWS Marketplace.
     *            </p>
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The AWS Markeplace product identifier to associate with the usage plan as
     * a SaaS product on AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCode <p>
     *            The AWS Markeplace product identifier to associate with the
     *            usage plan as a SaaS product on AWS Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsagePlan withProductCode(String productCode) {
        this.productCode = productCode;
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
    public UsagePlan withTags(java.util.Map<String, String> tags) {
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
    public UsagePlan addtagsEntry(String key, String value) {
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
    public UsagePlan cleartagsEntries() {
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
        if (getProductCode() != null)
            sb.append("productCode: " + getProductCode() + ",");
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApiStages() == null) ? 0 : getApiStages().hashCode());
        hashCode = prime * hashCode + ((getThrottle() == null) ? 0 : getThrottle().hashCode());
        hashCode = prime * hashCode + ((getQuota() == null) ? 0 : getQuota().hashCode());
        hashCode = prime * hashCode
                + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsagePlan == false)
            return false;
        UsagePlan other = (UsagePlan) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null
                && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
