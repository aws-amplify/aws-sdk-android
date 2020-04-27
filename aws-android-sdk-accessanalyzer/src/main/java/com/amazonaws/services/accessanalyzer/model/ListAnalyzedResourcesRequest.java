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
 * Retrieves a list of resources of the specified type that have been analyzed
 * by the specified analyzer..
 * </p>
 */
public class ListAnalyzedResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the analyzer to retrieve a list of analyzed resources from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     */
    private String analyzerArn;

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     */
    private String resourceType;

    /**
     * <p>
     * The ARN of the analyzer to retrieve a list of analyzed resources from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @return <p>
     *         The ARN of the analyzer to retrieve a list of analyzed resources
     *         from.
     *         </p>
     */
    public String getAnalyzerArn() {
        return analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer to retrieve a list of analyzed resources from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer to retrieve a list of analyzed
     *            resources from.
     *            </p>
     */
    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer to retrieve a list of analyzed resources from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer to retrieve a list of analyzed
     *            resources from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzedResourcesRequest withAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in the response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzedResourcesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @return <p>
     *         A token used for pagination of results returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzedResourcesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @return <p>
     *         The type of resource.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ListAnalyzedResourcesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ListAnalyzedResourcesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnalyzedResourcesRequest == false)
            return false;
        ListAnalyzedResourcesRequest other = (ListAnalyzedResourcesRequest) obj;

        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null
                && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
