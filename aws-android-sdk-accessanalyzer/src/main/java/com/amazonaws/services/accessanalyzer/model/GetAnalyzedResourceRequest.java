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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about a resource that was analyzed.
 * </p>
 */
public class GetAnalyzedResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the analyzer to retrieve information from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     */
    private String analyzerArn;

    /**
     * <p>
     * The ARN of the resource to retrieve information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The ARN of the analyzer to retrieve information from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @return <p>
     *         The ARN of the analyzer to retrieve information from.
     *         </p>
     */
    public String getAnalyzerArn() {
        return analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer to retrieve information from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer to retrieve information from.
     *            </p>
     */
    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer to retrieve information from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer to retrieve information from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAnalyzedResourceRequest withAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the resource to retrieve information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @return <p>
     *         The ARN of the resource to retrieve information about.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to retrieve information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource to retrieve information about.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to retrieve information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource to retrieve information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAnalyzedResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getAnalyzerArn() != null)
            sb.append("analyzerArn: " + getAnalyzerArn() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnalyzedResourceRequest == false)
            return false;
        GetAnalyzedResourceRequest other = (GetAnalyzedResourceRequest) obj;

        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null
                && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
