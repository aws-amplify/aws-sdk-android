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


public class GetEC2InstanceRecommendationsResult implements Serializable {
    /**
     * <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     */
    private String nextToken;

    /**
     * <p>An array of objects that describe instance recommendations.</p>
     */
    private java.util.List<InstanceRecommendation> instanceRecommendations;

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     */
    private java.util.List<GetRecommendationError> errors;

    /**
     * <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     *
     * @return <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     *
     * @param nextToken <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use to advance to the next page of instance recommendations.</p> <p>This value is null when there are no more pages of instance recommendations to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>An array of objects that describe instance recommendations.</p>
     *
     * @return <p>An array of objects that describe instance recommendations.</p>
     */
    public java.util.List<InstanceRecommendation> getInstanceRecommendations() {
        return instanceRecommendations;
    }

    /**
     * <p>An array of objects that describe instance recommendations.</p>
     *
     * @param instanceRecommendations <p>An array of objects that describe instance recommendations.</p>
     */
    public void setInstanceRecommendations(java.util.Collection<InstanceRecommendation> instanceRecommendations) {
        if (instanceRecommendations == null) {
            this.instanceRecommendations = null;
            return;
        }

        this.instanceRecommendations = new java.util.ArrayList<InstanceRecommendation>(instanceRecommendations);
    }

    /**
     * <p>An array of objects that describe instance recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceRecommendations <p>An array of objects that describe instance recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsResult withInstanceRecommendations(InstanceRecommendation... instanceRecommendations) {
        if (getInstanceRecommendations() == null) {
            this.instanceRecommendations = new java.util.ArrayList<InstanceRecommendation>(instanceRecommendations.length);
        }
        for (InstanceRecommendation value : instanceRecommendations) {
            this.instanceRecommendations.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe instance recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceRecommendations <p>An array of objects that describe instance recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsResult withInstanceRecommendations(java.util.Collection<InstanceRecommendation> instanceRecommendations) {
        setInstanceRecommendations(instanceRecommendations);
        return this;
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     *
     * @return <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     */
    public java.util.List<GetRecommendationError> getErrors() {
        return errors;
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     *
     * @param errors <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     */
    public void setErrors(java.util.Collection<GetRecommendationError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<GetRecommendationError>(errors);
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errors <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsResult withErrors(GetRecommendationError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<GetRecommendationError>(errors.length);
        }
        for (GetRecommendationError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errors <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an instance of an unsupported instance family.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2InstanceRecommendationsResult withErrors(java.util.Collection<GetRecommendationError> errors) {
        setErrors(errors);
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
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken() + ",");
        if (getInstanceRecommendations() != null) sb.append("instanceRecommendations: " + getInstanceRecommendations() + ",");
        if (getErrors() != null) sb.append("errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceRecommendations() == null) ? 0 : getInstanceRecommendations().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEC2InstanceRecommendationsResult == false) return false;
        GetEC2InstanceRecommendationsResult other = (GetEC2InstanceRecommendationsResult)obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getInstanceRecommendations() == null ^ this.getInstanceRecommendations() == null) return false;
        if (other.getInstanceRecommendations() != null && other.getInstanceRecommendations().equals(this.getInstanceRecommendations()) == false) return false;
        if (other.getErrors() == null ^ this.getErrors() == null) return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false) return false;
        return true;
    }
}
