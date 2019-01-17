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

public class ListShardsResult implements Serializable {
    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies
     * the IDs of the shard, the shard's parent, and the shard that's adjacent
     * to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     */
    private java.util.List<Shard> shards = new java.util.ArrayList<Shard>();

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default
     * value for the <code>MaxResults</code> parameter, or if you explicitly
     * specify a value for <code>MaxResults</code> that is less than the number
     * of shards in the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListShards</code> to list the next
     * set of shards. For more information about the use of this pagination
     * token when calling the <code>ListShards</code> operation, see
     * <a>ListShardsInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for
     * <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you
     * specify an expired token in a call to <code>ListShards</code>, you get
     * <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies
     * the IDs of the shard, the shard's parent, and the shard that's adjacent
     * to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     *
     * @return <p>
     *         An array of JSON objects. Each object represents one shard and
     *         specifies the IDs of the shard, the shard's parent, and the shard
     *         that's adjacent to the shard's parent. Each object also contains
     *         the starting and ending hash keys and the starting and ending
     *         sequence numbers for the shard.
     *         </p>
     */
    public java.util.List<Shard> getShards() {
        return shards;
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies
     * the IDs of the shard, the shard's parent, and the shard that's adjacent
     * to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     *
     * @param shards <p>
     *            An array of JSON objects. Each object represents one shard and
     *            specifies the IDs of the shard, the shard's parent, and the
     *            shard that's adjacent to the shard's parent. Each object also
     *            contains the starting and ending hash keys and the starting
     *            and ending sequence numbers for the shard.
     *            </p>
     */
    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new java.util.ArrayList<Shard>(shards);
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies
     * the IDs of the shard, the shard's parent, and the shard that's adjacent
     * to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shards <p>
     *            An array of JSON objects. Each object represents one shard and
     *            specifies the IDs of the shard, the shard's parent, and the
     *            shard that's adjacent to the shard's parent. Each object also
     *            contains the starting and ending hash keys and the starting
     *            and ending sequence numbers for the shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsResult withShards(Shard... shards) {
        if (getShards() == null) {
            this.shards = new java.util.ArrayList<Shard>(shards.length);
        }
        for (Shard value : shards) {
            this.shards.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies
     * the IDs of the shard, the shard's parent, and the shard that's adjacent
     * to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shards <p>
     *            An array of JSON objects. Each object represents one shard and
     *            specifies the IDs of the shard, the shard's parent, and the
     *            shard that's adjacent to the shard's parent. Each object also
     *            contains the starting and ending hash keys and the starting
     *            and ending sequence numbers for the shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsResult withShards(java.util.Collection<Shard> shards) {
        setShards(shards);
        return this;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default
     * value for the <code>MaxResults</code> parameter, or if you explicitly
     * specify a value for <code>MaxResults</code> that is less than the number
     * of shards in the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListShards</code> to list the next
     * set of shards. For more information about the use of this pagination
     * token when calling the <code>ListShards</code> operation, see
     * <a>ListShardsInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for
     * <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you
     * specify an expired token in a call to <code>ListShards</code>, you get
     * <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     *
     * @return <p>
     *         When the number of shards in the data stream is greater than the
     *         default value for the <code>MaxResults</code> parameter, or if
     *         you explicitly specify a value for <code>MaxResults</code> that
     *         is less than the number of shards in the data stream, the
     *         response includes a pagination token named <code>NextToken</code>
     *         . You can specify this <code>NextToken</code> value in a
     *         subsequent call to <code>ListShards</code> to list the next set
     *         of shards. For more information about the use of this pagination
     *         token when calling the <code>ListShards</code> operation, see
     *         <a>ListShardsInput$NextToken</a>.
     *         </p>
     *         <important>
     *         <p>
     *         Tokens expire after 300 seconds. When you obtain a value for
     *         <code>NextToken</code> in the response to a call to
     *         <code>ListShards</code>, you have 300 seconds to use that value.
     *         If you specify an expired token in a call to
     *         <code>ListShards</code>, you get
     *         <code>ExpiredNextTokenException</code>.
     *         </p>
     *         </important>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default
     * value for the <code>MaxResults</code> parameter, or if you explicitly
     * specify a value for <code>MaxResults</code> that is less than the number
     * of shards in the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListShards</code> to list the next
     * set of shards. For more information about the use of this pagination
     * token when calling the <code>ListShards</code> operation, see
     * <a>ListShardsInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for
     * <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you
     * specify an expired token in a call to <code>ListShards</code>, you get
     * <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     *
     * @param nextToken <p>
     *            When the number of shards in the data stream is greater than
     *            the default value for the <code>MaxResults</code> parameter,
     *            or if you explicitly specify a value for
     *            <code>MaxResults</code> that is less than the number of shards
     *            in the data stream, the response includes a pagination token
     *            named <code>NextToken</code>. You can specify this
     *            <code>NextToken</code> value in a subsequent call to
     *            <code>ListShards</code> to list the next set of shards. For
     *            more information about the use of this pagination token when
     *            calling the <code>ListShards</code> operation, see
     *            <a>ListShardsInput$NextToken</a>.
     *            </p>
     *            <important>
     *            <p>
     *            Tokens expire after 300 seconds. When you obtain a value for
     *            <code>NextToken</code> in the response to a call to
     *            <code>ListShards</code>, you have 300 seconds to use that
     *            value. If you specify an expired token in a call to
     *            <code>ListShards</code>, you get
     *            <code>ExpiredNextTokenException</code>.
     *            </p>
     *            </important>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default
     * value for the <code>MaxResults</code> parameter, or if you explicitly
     * specify a value for <code>MaxResults</code> that is less than the number
     * of shards in the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListShards</code> to list the next
     * set of shards. For more information about the use of this pagination
     * token when calling the <code>ListShards</code> operation, see
     * <a>ListShardsInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for
     * <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you
     * specify an expired token in a call to <code>ListShards</code>, you get
     * <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     *
     * @param nextToken <p>
     *            When the number of shards in the data stream is greater than
     *            the default value for the <code>MaxResults</code> parameter,
     *            or if you explicitly specify a value for
     *            <code>MaxResults</code> that is less than the number of shards
     *            in the data stream, the response includes a pagination token
     *            named <code>NextToken</code>. You can specify this
     *            <code>NextToken</code> value in a subsequent call to
     *            <code>ListShards</code> to list the next set of shards. For
     *            more information about the use of this pagination token when
     *            calling the <code>ListShards</code> operation, see
     *            <a>ListShardsInput$NextToken</a>.
     *            </p>
     *            <important>
     *            <p>
     *            Tokens expire after 300 seconds. When you obtain a value for
     *            <code>NextToken</code> in the response to a call to
     *            <code>ListShards</code>, you have 300 seconds to use that
     *            value. If you specify an expired token in a call to
     *            <code>ListShards</code>, you get
     *            <code>ExpiredNextTokenException</code>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsResult withNextToken(String nextToken) {
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
        if (getShards() != null)
            sb.append("Shards: " + getShards() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListShardsResult == false)
            return false;
        ListShardsResult other = (ListShardsResult) obj;

        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
