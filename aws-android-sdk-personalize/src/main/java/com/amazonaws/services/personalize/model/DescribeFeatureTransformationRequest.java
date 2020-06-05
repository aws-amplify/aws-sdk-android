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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the given feature transformation.
 * </p>
 */
public class DescribeFeatureTransformationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String featureTransformationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the feature transformation to
     *         describe.
     *         </p>
     */
    public String getFeatureTransformationArn() {
        return featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param featureTransformationArn <p>
     *            The Amazon Resource Name (ARN) of the feature transformation
     *            to describe.
     *            </p>
     */
    public void setFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param featureTransformationArn <p>
     *            The Amazon Resource Name (ARN) of the feature transformation
     *            to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFeatureTransformationRequest withFeatureTransformationArn(
            String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
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
        if (getFeatureTransformationArn() != null)
            sb.append("featureTransformationArn: " + getFeatureTransformationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFeatureTransformationArn() == null) ? 0 : getFeatureTransformationArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureTransformationRequest == false)
            return false;
        DescribeFeatureTransformationRequest other = (DescribeFeatureTransformationRequest) obj;

        if (other.getFeatureTransformationArn() == null
                ^ this.getFeatureTransformationArn() == null)
            return false;
        if (other.getFeatureTransformationArn() != null
                && other.getFeatureTransformationArn().equals(this.getFeatureTransformationArn()) == false)
            return false;
        return true;
    }
}
