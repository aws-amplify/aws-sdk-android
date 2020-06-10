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


public class GetAutoScalingGroupRecommendationsResult implements Serializable {
    /**
     * <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     */
    private String nextToken;

    /**
     * <p>An array of objects that describe Auto Scaling group recommendations.</p>
     */
    private java.util.List<AutoScalingGroupRecommendation> autoScalingGroupRecommendations;

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     */
    private java.util.List<GetRecommendationError> errors;

    /**
     * <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     *
     * @return <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     *
     * @param nextToken <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use to advance to the next page of Auto Scaling group recommendations.</p> <p>This value is null when there are no more pages of Auto Scaling group recommendations to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>An array of objects that describe Auto Scaling group recommendations.</p>
     *
     * @return <p>An array of objects that describe Auto Scaling group recommendations.</p>
     */
    public java.util.List<AutoScalingGroupRecommendation> getAutoScalingGroupRecommendations() {
        return autoScalingGroupRecommendations;
    }

    /**
     * <p>An array of objects that describe Auto Scaling group recommendations.</p>
     *
     * @param autoScalingGroupRecommendations <p>An array of objects that describe Auto Scaling group recommendations.</p>
     */
    public void setAutoScalingGroupRecommendations(java.util.Collection<AutoScalingGroupRecommendation> autoScalingGroupRecommendations) {
        if (autoScalingGroupRecommendations == null) {
            this.autoScalingGroupRecommendations = null;
            return;
        }

        this.autoScalingGroupRecommendations = new java.util.ArrayList<AutoScalingGroupRecommendation>(autoScalingGroupRecommendations);
    }

    /**
     * <p>An array of objects that describe Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupRecommendations <p>An array of objects that describe Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsResult withAutoScalingGroupRecommendations(AutoScalingGroupRecommendation... autoScalingGroupRecommendations) {
        if (getAutoScalingGroupRecommendations() == null) {
            this.autoScalingGroupRecommendations = new java.util.ArrayList<AutoScalingGroupRecommendation>(autoScalingGroupRecommendations.length);
        }
        for (AutoScalingGroupRecommendation value : autoScalingGroupRecommendations) {
            this.autoScalingGroupRecommendations.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupRecommendations <p>An array of objects that describe Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsResult withAutoScalingGroupRecommendations(java.util.Collection<AutoScalingGroupRecommendation> autoScalingGroupRecommendations) {
        setAutoScalingGroupRecommendations(autoScalingGroupRecommendations);
        return this;
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     *
     * @return <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     */
    public java.util.List<GetRecommendationError> getErrors() {
        return errors;
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     *
     * @param errors <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     */
    public void setErrors(java.util.Collection<GetRecommendationError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<GetRecommendationError>(errors);
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errors <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsResult withErrors(GetRecommendationError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<GetRecommendationError>(errors.length);
        }
        for (GetRecommendationError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errors <p>An array of objects that describe errors of the request.</p> <p>For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutoScalingGroupRecommendationsResult withErrors(java.util.Collection<GetRecommendationError> errors) {
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
        if (getAutoScalingGroupRecommendations() != null) sb.append("autoScalingGroupRecommendations: " + getAutoScalingGroupRecommendations() + ",");
        if (getErrors() != null) sb.append("errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupRecommendations() == null) ? 0 : getAutoScalingGroupRecommendations().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAutoScalingGroupRecommendationsResult == false) return false;
        GetAutoScalingGroupRecommendationsResult other = (GetAutoScalingGroupRecommendationsResult)obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getAutoScalingGroupRecommendations() == null ^ this.getAutoScalingGroupRecommendations() == null) return false;
        if (other.getAutoScalingGroupRecommendations() != null && other.getAutoScalingGroupRecommendations().equals(this.getAutoScalingGroupRecommendations()) == false) return false;
        if (other.getErrors() == null ^ this.getErrors() == null) return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false) return false;
        return true;
    }
}
