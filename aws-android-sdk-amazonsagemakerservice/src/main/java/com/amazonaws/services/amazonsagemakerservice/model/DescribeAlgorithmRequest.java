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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a description of the specified algorithm that is in your account.
 * </p>
 */
public class DescribeAlgorithmRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the algorithm to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     */
    private String algorithmName;

    /**
     * <p>
     * The name of the algorithm to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @return <p>
     *         The name of the algorithm to describe.
     *         </p>
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm to describe.
     *            </p>
     */
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmRequest withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
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
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: " + getAlgorithmName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlgorithmRequest == false)
            return false;
        DescribeAlgorithmRequest other = (DescribeAlgorithmRequest) obj;

        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null
                && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        return true;
    }
}
