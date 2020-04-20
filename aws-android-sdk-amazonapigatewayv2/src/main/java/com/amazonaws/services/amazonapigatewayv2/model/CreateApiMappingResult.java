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

public class CreateApiMappingResult implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     */
    private String apiMappingId;

    /**
     * <p>
     * The API mapping key.
     * </p>
     */
    private String apiMappingKey;

    /**
     * <p>
     * The API stage.
     * </p>
     */
    private String stage;

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
    public CreateApiMappingResult withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     *
     * @return <p>
     *         The API mapping identifier.
     *         </p>
     */
    public String getApiMappingId() {
        return apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     *
     * @param apiMappingId <p>
     *            The API mapping identifier.
     *            </p>
     */
    public void setApiMappingId(String apiMappingId) {
        this.apiMappingId = apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiMappingId <p>
     *            The API mapping identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingResult withApiMappingId(String apiMappingId) {
        this.apiMappingId = apiMappingId;
        return this;
    }

    /**
     * <p>
     * The API mapping key.
     * </p>
     *
     * @return <p>
     *         The API mapping key.
     *         </p>
     */
    public String getApiMappingKey() {
        return apiMappingKey;
    }

    /**
     * <p>
     * The API mapping key.
     * </p>
     *
     * @param apiMappingKey <p>
     *            The API mapping key.
     *            </p>
     */
    public void setApiMappingKey(String apiMappingKey) {
        this.apiMappingKey = apiMappingKey;
    }

    /**
     * <p>
     * The API mapping key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiMappingKey <p>
     *            The API mapping key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingResult withApiMappingKey(String apiMappingKey) {
        this.apiMappingKey = apiMappingKey;
        return this;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     *
     * @return <p>
     *         The API stage.
     *         </p>
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     *
     * @param stage <p>
     *            The API stage.
     *            </p>
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stage <p>
     *            The API stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingResult withStage(String stage) {
        this.stage = stage;
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
        if (getApiMappingId() != null)
            sb.append("ApiMappingId: " + getApiMappingId() + ",");
        if (getApiMappingKey() != null)
            sb.append("ApiMappingKey: " + getApiMappingKey() + ",");
        if (getStage() != null)
            sb.append("Stage: " + getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode
                + ((getApiMappingId() == null) ? 0 : getApiMappingId().hashCode());
        hashCode = prime * hashCode
                + ((getApiMappingKey() == null) ? 0 : getApiMappingKey().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApiMappingResult == false)
            return false;
        CreateApiMappingResult other = (CreateApiMappingResult) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getApiMappingId() == null ^ this.getApiMappingId() == null)
            return false;
        if (other.getApiMappingId() != null
                && other.getApiMappingId().equals(this.getApiMappingId()) == false)
            return false;
        if (other.getApiMappingKey() == null ^ this.getApiMappingKey() == null)
            return false;
        if (other.getApiMappingKey() != null
                && other.getApiMappingKey().equals(this.getApiMappingKey()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }
}
