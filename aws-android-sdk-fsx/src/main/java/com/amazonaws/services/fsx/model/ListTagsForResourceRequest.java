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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists tags for an Amazon FSx file systems and backups in the case of Amazon
 * FSx for Windows File Server.
 * </p>
 * <p>
 * When retrieving all tags, you can optionally specify the
 * <code>MaxResults</code> parameter to limit the number of tags in a response.
 * If more tags remain, Amazon FSx returns a <code>NextToken</code> value in the
 * response. In this case, send a later request with the <code>NextToken</code>
 * request parameter set to the value of <code>NextToken</code> from the last
 * response.
 * </p>
 * <p>
 * This action is used in an iterative process to retrieve a list of your tags.
 * <code>ListTagsForResource</code> is called first without a
 * <code>NextToken</code>value. Then the action continues to be called with the
 * <code>NextToken</code> parameter set to the value of the last
 * <code>NextToken</code> value until a response has no <code>NextToken</code>.
 * </p>
 * <p>
 * When using this action, keep the following in mind:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The implementation might return fewer than <code>MaxResults</code> file
 * system descriptions while still including a <code>NextToken</code> value.
 * </p>
 * </li>
 * <li>
 * <p>
 * The order of tags returned in the response of one
 * <code>ListTagsForResource</code> call and the order of tags returned across
 * the responses of a multi-call iteration is unspecified.
 * </p>
 * </li>
 * </ul>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * Maximum number of tags to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>ListTagsForResource</code> operation (String). If a token present,
     * the action continues the list from where the returning call left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @return <p>
     *         The ARN of the Amazon FSx resource that will have its tags
     *         listed.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The ARN of the Amazon FSx resource that will have its tags
     *            listed.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The ARN of the Amazon FSx resource that will have its tags
     *            listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * Maximum number of tags to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return <p>
     *         Maximum number of tags to return in the response (integer). This
     *         parameter value must be greater than 0. The number of items that
     *         Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *         parameter specified in the request and the service's internal
     *         maximum number of items per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of tags to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param maxResults <p>
     *            Maximum number of tags to return in the response (integer).
     *            This parameter value must be greater than 0. The number of
     *            items that Amazon FSx returns is the minimum of the
     *            <code>MaxResults</code> parameter specified in the request and
     *            the service's internal maximum number of items per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of tags to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param maxResults <p>
     *            Maximum number of tags to return in the response (integer).
     *            This parameter value must be greater than 0. The number of
     *            items that Amazon FSx returns is the minimum of the
     *            <code>MaxResults</code> parameter specified in the request and
     *            the service's internal maximum number of items per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>ListTagsForResource</code> operation (String). If a token present,
     * the action continues the list from where the returning call left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @return <p>
     *         Opaque pagination token returned from a previous
     *         <code>ListTagsForResource</code> operation (String). If a token
     *         present, the action continues the list from where the returning
     *         call left off.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>ListTagsForResource</code> operation (String). If a token present,
     * the action continues the list from where the returning call left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            Opaque pagination token returned from a previous
     *            <code>ListTagsForResource</code> operation (String). If a
     *            token present, the action continues the list from where the
     *            returning call left off.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>ListTagsForResource</code> operation (String). If a token present,
     * the action continues the list from where the returning call left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            Opaque pagination token returned from a previous
     *            <code>ListTagsForResource</code> operation (String). If a
     *            token present, the action continues the list from where the
     *            returning call left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
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
        return true;
    }
}
