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
 * An immutable representation of a <a>RestApi</a> resource that can be called
 * by users using <a>Stages</a>. A deployment must be associated with a
 * <a>Stage</a> for it to be callable over the Internet.
 * </p>
 * <div class="remarks">To create a deployment, call <code>POST</code> on the
 * <a>Deployments</a> resource of a <a>RestApi</a>. To view, update, or delete a
 * deployment, call <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code>
 * on the specified deployment resource (
 * <code>/restapis/{restapi_id}/deployments/{deployment_id}</code>).</div> <div
 * class="seeAlso"><a>RestApi</a>, <a>Deployments</a>, <a>Stage</a>, <a href=
 * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html"
 * >AWS CLI</a>, <a href="https://aws.amazon.com/tools/">AWS SDKs</a> </div>
 */
public class GetDeploymentResult implements Serializable {
    /**
     * <p>
     * The identifier for the deployment resource.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The date and time that the deployment resource was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * A summary of the <a>RestApi</a> at the date and time that the deployment
     * resource was created.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, MethodSnapshot>> apiSummary;

    /**
     * <p>
     * The identifier for the deployment resource.
     * </p>
     *
     * @return <p>
     *         The identifier for the deployment resource.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the deployment resource.
     * </p>
     *
     * @param id <p>
     *            The identifier for the deployment resource.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the deployment resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the deployment resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     *
     * @return <p>
     *         The description for the deployment resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     *
     * @param description <p>
     *            The description for the deployment resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the deployment resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time that the deployment resource was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the deployment resource was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date and time that the deployment resource was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date and time that the deployment resource was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that the deployment resource was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date and time that the deployment resource was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * A summary of the <a>RestApi</a> at the date and time that the deployment
     * resource was created.
     * </p>
     *
     * @return <p>
     *         A summary of the <a>RestApi</a> at the date and time that the
     *         deployment resource was created.
     *         </p>
     */
    public java.util.Map<String, java.util.Map<String, MethodSnapshot>> getApiSummary() {
        return apiSummary;
    }

    /**
     * <p>
     * A summary of the <a>RestApi</a> at the date and time that the deployment
     * resource was created.
     * </p>
     *
     * @param apiSummary <p>
     *            A summary of the <a>RestApi</a> at the date and time that the
     *            deployment resource was created.
     *            </p>
     */
    public void setApiSummary(
            java.util.Map<String, java.util.Map<String, MethodSnapshot>> apiSummary) {
        this.apiSummary = apiSummary;
    }

    /**
     * <p>
     * A summary of the <a>RestApi</a> at the date and time that the deployment
     * resource was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiSummary <p>
     *            A summary of the <a>RestApi</a> at the date and time that the
     *            deployment resource was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentResult withApiSummary(
            java.util.Map<String, java.util.Map<String, MethodSnapshot>> apiSummary) {
        this.apiSummary = apiSummary;
        return this;
    }

    /**
     * <p>
     * A summary of the <a>RestApi</a> at the date and time that the deployment
     * resource was created.
     * </p>
     * <p>
     * The method adds a new key-value pair into apiSummary parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into apiSummary.
     * @param value The corresponding value of the entry to be added into
     *            apiSummary.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentResult addapiSummaryEntry(String key,
            java.util.Map<String, MethodSnapshot> value) {
        if (null == this.apiSummary) {
            this.apiSummary = new java.util.HashMap<String, java.util.Map<String, MethodSnapshot>>();
        }
        if (this.apiSummary.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.apiSummary.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into apiSummary.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetDeploymentResult clearapiSummaryEntries() {
        this.apiSummary = null;
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getApiSummary() != null)
            sb.append("apiSummary: " + getApiSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getApiSummary() == null) ? 0 : getApiSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentResult == false)
            return false;
        GetDeploymentResult other = (GetDeploymentResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getApiSummary() == null ^ this.getApiSummary() == null)
            return false;
        if (other.getApiSummary() != null
                && other.getApiSummary().equals(this.getApiSummary()) == false)
            return false;
        return true;
    }
}
