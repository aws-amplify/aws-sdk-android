/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List all the messages in a channel. Returns a paginated list of
 * <code>ChannelMessages</code>. By default, sorted by creation timestamp in
 * descending order.
 * </p>
 * <note>
 * <p>
 * Redacted messages appear in the results as empty, since they are only
 * redacted, not deleted. Deleted messages do not appear in the results. This
 * action always returns the latest version of an edited message.
 * </p>
 * <p>
 * Also, the x-amz-chime-bearer request header is mandatory. Use the
 * <code>AppInstanceUserArn</code> of the user that makes the API call as the
 * value in the header.
 * </p>
 * </note>
 */
public class ListChannelMessagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelArn;

    /**
     * <p>
     * The order in which you want messages sorted. Default is Descending, based
     * on time created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * The initial or starting time stamp for your requested messages.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * The final or ending time stamp for your requested messages.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The maximum number of messages that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String chimeBearer;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMessagesRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The order in which you want messages sorted. Default is Descending, based
     * on time created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The order in which you want messages sorted. Default is
     *         Descending, based on time created.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The order in which you want messages sorted. Default is Descending, based
     * on time created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order in which you want messages sorted. Default is
     *            Descending, based on time created.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which you want messages sorted. Default is Descending, based
     * on time created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order in which you want messages sorted. Default is
     *            Descending, based on time created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListChannelMessagesRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The order in which you want messages sorted. Default is Descending, based
     * on time created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order in which you want messages sorted. Default is
     *            Descending, based on time created.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The order in which you want messages sorted. Default is Descending, based
     * on time created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order in which you want messages sorted. Default is
     *            Descending, based on time created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListChannelMessagesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The initial or starting time stamp for your requested messages.
     * </p>
     *
     * @return <p>
     *         The initial or starting time stamp for your requested messages.
     *         </p>
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }

    /**
     * <p>
     * The initial or starting time stamp for your requested messages.
     * </p>
     *
     * @param notBefore <p>
     *            The initial or starting time stamp for your requested
     *            messages.
     *            </p>
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The initial or starting time stamp for your requested messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notBefore <p>
     *            The initial or starting time stamp for your requested
     *            messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMessagesRequest withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * <p>
     * The final or ending time stamp for your requested messages.
     * </p>
     *
     * @return <p>
     *         The final or ending time stamp for your requested messages.
     *         </p>
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }

    /**
     * <p>
     * The final or ending time stamp for your requested messages.
     * </p>
     *
     * @param notAfter <p>
     *            The final or ending time stamp for your requested messages.
     *            </p>
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The final or ending time stamp for your requested messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notAfter <p>
     *            The final or ending time stamp for your requested messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMessagesRequest withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * <p>
     * The maximum number of messages that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of messages that you want returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of messages that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of messages that you want returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of messages that you want returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of messages that you want returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMessagesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token passed by previous API calls until all requested
     *         messages are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            messages are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            messages are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMessagesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code> of the user that makes the
     *         API call.
     *         </p>
     */
    public String getChimeBearer() {
        return chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     */
    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMessagesRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getNotBefore() != null)
            sb.append("NotBefore: " + getNotBefore() + ",");
        if (getNotAfter() != null)
            sb.append("NotAfter: " + getNotAfter() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMessagesRequest == false)
            return false;
        ListChannelMessagesRequest other = (ListChannelMessagesRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null
                && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
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
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        return true;
    }
}
