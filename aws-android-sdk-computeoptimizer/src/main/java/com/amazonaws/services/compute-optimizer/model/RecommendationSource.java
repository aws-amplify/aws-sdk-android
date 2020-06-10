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
 * <p>Describes the source of a recommendation, such as an Amazon EC2 instance or Auto Scaling group.</p>
 */
public class RecommendationSource implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     */
    private String recommendationSourceArn;

    /**
     * <p>The resource type of the recommendation source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     */
    private String recommendationSourceType;

    /**
     * <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     */
    public String getRecommendationSourceArn() {
        return recommendationSourceArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     *
     * @param recommendationSourceArn <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     */
    public void setRecommendationSourceArn(String recommendationSourceArn) {
        this.recommendationSourceArn = recommendationSourceArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationSourceArn <p>The Amazon Resource Name (ARN) of the recommendation source.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationSource withRecommendationSourceArn(String recommendationSourceArn) {
        this.recommendationSourceArn = recommendationSourceArn;
        return this;
    }

    /**
     * <p>The resource type of the recommendation source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @return <p>The resource type of the recommendation source.</p>
     *
     * @see RecommendationSourceType
     */
    public String getRecommendationSourceType() {
        return recommendationSourceType;
    }

    /**
     * <p>The resource type of the recommendation source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationSourceType <p>The resource type of the recommendation source.</p>
     *
     * @see RecommendationSourceType
     */
    public void setRecommendationSourceType(String recommendationSourceType) {
        this.recommendationSourceType = recommendationSourceType;
    }

    /**
     * <p>The resource type of the recommendation source.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationSourceType <p>The resource type of the recommendation source.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RecommendationSourceType
     */
    public RecommendationSource withRecommendationSourceType(String recommendationSourceType) {
        this.recommendationSourceType = recommendationSourceType;
        return this;
    }

    /**
     * <p>The resource type of the recommendation source.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationSourceType <p>The resource type of the recommendation source.</p>
     *
     * @see RecommendationSourceType
     */
    public void setRecommendationSourceType(RecommendationSourceType recommendationSourceType) {
        this.recommendationSourceType = recommendationSourceType.toString();
    }

    /**
     * <p>The resource type of the recommendation source.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ec2Instance, AutoScalingGroup
     *
     * @param recommendationSourceType <p>The resource type of the recommendation source.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RecommendationSourceType
     */
    public RecommendationSource withRecommendationSourceType(RecommendationSourceType recommendationSourceType) {
        this.recommendationSourceType = recommendationSourceType.toString();
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
        if (getRecommendationSourceArn() != null) sb.append("recommendationSourceArn: " + getRecommendationSourceArn() + ",");
        if (getRecommendationSourceType() != null) sb.append("recommendationSourceType: " + getRecommendationSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationSourceArn() == null) ? 0 : getRecommendationSourceArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSourceType() == null) ? 0 : getRecommendationSourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecommendationSource == false) return false;
        RecommendationSource other = (RecommendationSource)obj;

        if (other.getRecommendationSourceArn() == null ^ this.getRecommendationSourceArn() == null) return false;
        if (other.getRecommendationSourceArn() != null && other.getRecommendationSourceArn().equals(this.getRecommendationSourceArn()) == false) return false;
        if (other.getRecommendationSourceType() == null ^ this.getRecommendationSourceType() == null) return false;
        if (other.getRecommendationSourceType() != null && other.getRecommendationSourceType().equals(this.getRecommendationSourceType()) == false) return false;
        return true;
    }
}
