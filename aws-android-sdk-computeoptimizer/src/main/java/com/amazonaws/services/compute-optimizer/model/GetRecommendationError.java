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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


/**
 * <p>Describes an error experienced when getting recommendations.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group, or if you request recommendations for an instance of an unsupported instance family.</p>
 */
public class GetRecommendationError implements Serializable {
    /**
     * <p>The ID of the error.</p>
     */
    private String identifier;

    /**
     * <p>The error code.</p>
     */
    private String code;

    /**
     * <p>The message, or reason, for the error.</p>
     */
    private String message;

    /**
     * <p>The ID of the error.</p>
     *
     * @return <p>The ID of the error.</p>
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <p>The ID of the error.</p>
     *
     * @param identifier <p>The ID of the error.</p>
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>The ID of the error.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identifier <p>The ID of the error.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationError withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * <p>The error code.</p>
     *
     * @return <p>The error code.</p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>The error code.</p>
     *
     * @param code <p>The error code.</p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>The error code.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code <p>The error code.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>The message, or reason, for the error.</p>
     *
     * @return <p>The message, or reason, for the error.</p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>The message, or reason, for the error.</p>
     *
     * @param message <p>The message, or reason, for the error.</p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>The message, or reason, for the error.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message <p>The message, or reason, for the error.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentifier() != null) sb.append("identifier: " + getIdentifier() + ",");
        if (getCode() != null) sb.append("code: " + getCode() + ",");
        if (getMessage() != null) sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecommendationError == false) return false;
        GetRecommendationError other = (GetRecommendationError)obj;

        if (other.getIdentifier() == null ^ this.getIdentifier() == null) return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false) return false;
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false;
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false;
        return true;
    }
}
