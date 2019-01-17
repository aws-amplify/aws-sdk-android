/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the tags for the specified Kinesis data stream. This operation has a
 * limit of five transactions per second per account.
 * </p>
 */
public class ListTagsForStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this
     * parameter is set, <code>ListTagsForStream</code> gets all tags that occur
     * after <code>ExclusiveStartTagKey</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String exclusiveStartTagKey;

    /**
     * <p>
     * The number of tags to return. If this number is less than the total
     * number of tags associated with the stream, <code>HasMoreTags</code> is
     * set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this
     * parameter is set, <code>ListTagsForStream</code> gets all tags that occur
     * after <code>ExclusiveStartTagKey</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The key to use as the starting point for the list of tags. If
     *         this parameter is set, <code>ListTagsForStream</code> gets all
     *         tags that occur after <code>ExclusiveStartTagKey</code>.
     *         </p>
     */
    public String getExclusiveStartTagKey() {
        return exclusiveStartTagKey;
    }

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this
     * parameter is set, <code>ListTagsForStream</code> gets all tags that occur
     * after <code>ExclusiveStartTagKey</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param exclusiveStartTagKey <p>
     *            The key to use as the starting point for the list of tags. If
     *            this parameter is set, <code>ListTagsForStream</code> gets all
     *            tags that occur after <code>ExclusiveStartTagKey</code>.
     *            </p>
     */
    public void setExclusiveStartTagKey(String exclusiveStartTagKey) {
        this.exclusiveStartTagKey = exclusiveStartTagKey;
    }

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this
     * parameter is set, <code>ListTagsForStream</code> gets all tags that occur
     * after <code>ExclusiveStartTagKey</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param exclusiveStartTagKey <p>
     *            The key to use as the starting point for the list of tags. If
     *            this parameter is set, <code>ListTagsForStream</code> gets all
     *            tags that occur after <code>ExclusiveStartTagKey</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForStreamRequest withExclusiveStartTagKey(String exclusiveStartTagKey) {
        this.exclusiveStartTagKey = exclusiveStartTagKey;
        return this;
    }

    /**
     * <p>
     * The number of tags to return. If this number is less than the total
     * number of tags associated with the stream, <code>HasMoreTags</code> is
     * set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The number of tags to return. If this number is less than the
     *         total number of tags associated with the stream,
     *         <code>HasMoreTags</code> is set to <code>true</code>. To list
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the
     *         last key in the response.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The number of tags to return. If this number is less than the total
     * number of tags associated with the stream, <code>HasMoreTags</code> is
     * set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param limit <p>
     *            The number of tags to return. If this number is less than the
     *            total number of tags associated with the stream,
     *            <code>HasMoreTags</code> is set to <code>true</code>. To list
     *            additional tags, set <code>ExclusiveStartTagKey</code> to the
     *            last key in the response.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of tags to return. If this number is less than the total
     * number of tags associated with the stream, <code>HasMoreTags</code> is
     * set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param limit <p>
     *            The number of tags to return. If this number is less than the
     *            total number of tags associated with the stream,
     *            <code>HasMoreTags</code> is set to <code>true</code>. To list
     *            additional tags, set <code>ExclusiveStartTagKey</code> to the
     *            last key in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForStreamRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getExclusiveStartTagKey() != null)
            sb.append("ExclusiveStartTagKey: " + getExclusiveStartTagKey() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveStartTagKey() == null) ? 0 : getExclusiveStartTagKey().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForStreamRequest == false)
            return false;
        ListTagsForStreamRequest other = (ListTagsForStreamRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getExclusiveStartTagKey() == null ^ this.getExclusiveStartTagKey() == null)
            return false;
        if (other.getExclusiveStartTagKey() != null
                && other.getExclusiveStartTagKey().equals(this.getExclusiveStartTagKey()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
