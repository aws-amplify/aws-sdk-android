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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an IntegrationResponses.
 * </p>
 */
public class GetIntegrationResponseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * The integration ID.
     * </p>
     */
    private String integrationId;

    /**
     * <p>
     * The integration response ID.
     * </p>
     */
    private String integrationResponseId;

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @return <p>
     *         The API identifier.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     *
     * @return <p>
     *         The integration ID.
     *         </p>
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     *
     * @param integrationId <p>
     *            The integration ID.
     *            </p>
     */
    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationId <p>
     *            The integration ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseRequest withIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     *
     * @return <p>
     *         The integration response ID.
     *         </p>
     */
    public String getIntegrationResponseId() {
        return integrationResponseId;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     *
     * @param integrationResponseId <p>
     *            The integration response ID.
     *            </p>
     */
    public void setIntegrationResponseId(String integrationResponseId) {
        this.integrationResponseId = integrationResponseId;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationResponseId <p>
     *            The integration response ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseRequest withIntegrationResponseId(String integrationResponseId) {
        this.integrationResponseId = integrationResponseId;
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
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getIntegrationId() != null)
            sb.append("IntegrationId: " + getIntegrationId() + ",");
        if (getIntegrationResponseId() != null)
            sb.append("IntegrationResponseId: " + getIntegrationResponseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationId() == null) ? 0 : getIntegrationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationResponseId() == null) ? 0 : getIntegrationResponseId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntegrationResponseRequest == false)
            return false;
        GetIntegrationResponseRequest other = (GetIntegrationResponseRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getIntegrationId() == null ^ this.getIntegrationId() == null)
            return false;
        if (other.getIntegrationId() != null
                && other.getIntegrationId().equals(this.getIntegrationId()) == false)
            return false;
        if (other.getIntegrationResponseId() == null ^ this.getIntegrationResponseId() == null)
            return false;
        if (other.getIntegrationResponseId() != null
                && other.getIntegrationResponseId().equals(this.getIntegrationResponseId()) == false)
            return false;
        return true;
    }
}
