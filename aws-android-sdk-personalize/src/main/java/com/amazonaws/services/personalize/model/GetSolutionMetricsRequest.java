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
 * Gets the metrics for the specified solution version.
 * </p>
 */
public class GetSolutionMetricsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version for which to get
     * metrics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version for which to get
     * metrics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the solution version for which
     *         to get metrics.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version for which to get
     * metrics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version for
     *            which to get metrics.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version for which to get
     * metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version for
     *            which to get metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSolutionMetricsRequest withSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
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
        if (getSolutionVersionArn() != null)
            sb.append("solutionVersionArn: " + getSolutionVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolutionMetricsRequest == false)
            return false;
        GetSolutionMetricsRequest other = (GetSolutionMetricsRequest) obj;

        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null
                && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        return true;
    }
}
