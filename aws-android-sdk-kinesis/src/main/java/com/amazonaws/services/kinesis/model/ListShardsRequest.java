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
 * Lists the shards in a stream and provides information about each shard.
 * </p>
 * <important>
 * <p>
 * This API is a new operation that is used by the Amazon Kinesis Client Library
 * (KCL). If you have a fine-grained IAM policy that only allows specific
 * operations, you must update your policy to allow calls to this API. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/streams/latest/dev/controlling-access.html"
 * >Controlling Access to Amazon Kinesis Data Streams Resources Using IAM</a>.
 * </p>
 * </important>
 */
public class ListShardsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default
     * value for the <code>MaxResults</code> parameter, or if you explicitly
     * specify a value for <code>MaxResults</code> that is less than the number
     * of shards in the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListShards</code> to list the next
     * set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or
     * <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the
     * stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code>
     * parameter when you specify <code>NextToken</code>. If you specify a
     * <code>MaxResults</code> value that is less than the number of shards that
     * the operation returns if you don't specify <code>MaxResults</code>, the
     * response will contain a new <code>NextToken</code> value. You can use the
     * new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
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
     * The ID of the shard to start the list with.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for
     * <code>ListShards</code> to list the shards starting with the first one in
     * the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String exclusiveStartShardId;

    /**
     * <p>
     * The maximum number of shards to return in a single call to
     * <code>ListShards</code>. The minimum value you can specify for this
     * parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of
     * <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListShards</code> to
     * list the next set of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the
     * same name. For example, if you create a data stream and then delete it,
     * and you later create another data stream with the same name, you can use
     * this input parameter to specify which of the two streams you want to list
     * the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     */
    private java.util.Date streamCreationTimestamp;

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the data stream whose shards you want to list.
     *         </p>
     *         <p>
     *         You cannot specify this parameter if you specify the
     *         <code>NextToken</code> parameter.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the data stream whose shards you want to list.
     *            </p>
     *            <p>
     *            You cannot specify this parameter if you specify the
     *            <code>NextToken</code> parameter.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
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
     *            The name of the data stream whose shards you want to list.
     *            </p>
     *            <p>
     *            You cannot specify this parameter if you specify the
     *            <code>NextToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsRequest withStreamName(String streamName) {
        this.streamName = streamName;
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
     * set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or
     * <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the
     * stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code>
     * parameter when you specify <code>NextToken</code>. If you specify a
     * <code>MaxResults</code> value that is less than the number of shards that
     * the operation returns if you don't specify <code>MaxResults</code>, the
     * response will contain a new <code>NextToken</code> value. You can use the
     * new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
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
     *         of shards.
     *         </p>
     *         <p>
     *         Don't specify <code>StreamName</code> or
     *         <code>StreamCreationTimestamp</code> if you specify
     *         <code>NextToken</code> because the latter unambiguously
     *         identifies the stream.
     *         </p>
     *         <p>
     *         You can optionally specify a value for the
     *         <code>MaxResults</code> parameter when you specify
     *         <code>NextToken</code>. If you specify a <code>MaxResults</code>
     *         value that is less than the number of shards that the operation
     *         returns if you don't specify <code>MaxResults</code>, the
     *         response will contain a new <code>NextToken</code> value. You can
     *         use the new <code>NextToken</code> value in a subsequent call to
     *         the <code>ListShards</code> operation.
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
     * set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or
     * <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the
     * stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code>
     * parameter when you specify <code>NextToken</code>. If you specify a
     * <code>MaxResults</code> value that is less than the number of shards that
     * the operation returns if you don't specify <code>MaxResults</code>, the
     * response will contain a new <code>NextToken</code> value. You can use the
     * new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
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
     *            <code>ListShards</code> to list the next set of shards.
     *            </p>
     *            <p>
     *            Don't specify <code>StreamName</code> or
     *            <code>StreamCreationTimestamp</code> if you specify
     *            <code>NextToken</code> because the latter unambiguously
     *            identifies the stream.
     *            </p>
     *            <p>
     *            You can optionally specify a value for the
     *            <code>MaxResults</code> parameter when you specify
     *            <code>NextToken</code>. If you specify a
     *            <code>MaxResults</code> value that is less than the number of
     *            shards that the operation returns if you don't specify
     *            <code>MaxResults</code>, the response will contain a new
     *            <code>NextToken</code> value. You can use the new
     *            <code>NextToken</code> value in a subsequent call to the
     *            <code>ListShards</code> operation.
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
     * set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or
     * <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the
     * stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code>
     * parameter when you specify <code>NextToken</code>. If you specify a
     * <code>MaxResults</code> value that is less than the number of shards that
     * the operation returns if you don't specify <code>MaxResults</code>, the
     * response will contain a new <code>NextToken</code> value. You can use the
     * new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
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
     *            <code>ListShards</code> to list the next set of shards.
     *            </p>
     *            <p>
     *            Don't specify <code>StreamName</code> or
     *            <code>StreamCreationTimestamp</code> if you specify
     *            <code>NextToken</code> because the latter unambiguously
     *            identifies the stream.
     *            </p>
     *            <p>
     *            You can optionally specify a value for the
     *            <code>MaxResults</code> parameter when you specify
     *            <code>NextToken</code>. If you specify a
     *            <code>MaxResults</code> value that is less than the number of
     *            shards that the operation returns if you don't specify
     *            <code>MaxResults</code>, the response will contain a new
     *            <code>NextToken</code> value. You can use the new
     *            <code>NextToken</code> value in a subsequent call to the
     *            <code>ListShards</code> operation.
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
    public ListShardsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the shard to start the list with.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for
     * <code>ListShards</code> to list the shards starting with the first one in
     * the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The ID of the shard to start the list with.
     *         </p>
     *         <p>
     *         If you don't specify this parameter, the default behavior is for
     *         <code>ListShards</code> to list the shards starting with the
     *         first one in the stream.
     *         </p>
     *         <p>
     *         You cannot specify this parameter if you specify
     *         <code>NextToken</code>.
     *         </p>
     */
    public String getExclusiveStartShardId() {
        return exclusiveStartShardId;
    }

    /**
     * <p>
     * The ID of the shard to start the list with.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for
     * <code>ListShards</code> to list the shards starting with the first one in
     * the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartShardId <p>
     *            The ID of the shard to start the list with.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the default behavior is
     *            for <code>ListShards</code> to list the shards starting with
     *            the first one in the stream.
     *            </p>
     *            <p>
     *            You cannot specify this parameter if you specify
     *            <code>NextToken</code>.
     *            </p>
     */
    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }

    /**
     * <p>
     * The ID of the shard to start the list with.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for
     * <code>ListShards</code> to list the shards starting with the first one in
     * the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartShardId <p>
     *            The ID of the shard to start the list with.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the default behavior is
     *            for <code>ListShards</code> to list the shards starting with
     *            the first one in the stream.
     *            </p>
     *            <p>
     *            You cannot specify this parameter if you specify
     *            <code>NextToken</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsRequest withExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
        return this;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call to
     * <code>ListShards</code>. The minimum value you can specify for this
     * parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of
     * <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListShards</code> to
     * list the next set of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of shards to return in a single call to
     *         <code>ListShards</code>. The minimum value you can specify for
     *         this parameter is 1, and the maximum is 1,000, which is also the
     *         default.
     *         </p>
     *         <p>
     *         When the number of shards to be listed is greater than the value
     *         of <code>MaxResults</code>, the response contains a
     *         <code>NextToken</code> value that you can use in a subsequent
     *         call to <code>ListShards</code> to list the next set of shards.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call to
     * <code>ListShards</code>. The minimum value you can specify for this
     * parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of
     * <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListShards</code> to
     * list the next set of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of shards to return in a single call to
     *            <code>ListShards</code>. The minimum value you can specify for
     *            this parameter is 1, and the maximum is 1,000, which is also
     *            the default.
     *            </p>
     *            <p>
     *            When the number of shards to be listed is greater than the
     *            value of <code>MaxResults</code>, the response contains a
     *            <code>NextToken</code> value that you can use in a subsequent
     *            call to <code>ListShards</code> to list the next set of
     *            shards.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call to
     * <code>ListShards</code>. The minimum value you can specify for this
     * parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of
     * <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListShards</code> to
     * list the next set of shards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of shards to return in a single call to
     *            <code>ListShards</code>. The minimum value you can specify for
     *            this parameter is 1, and the maximum is 1,000, which is also
     *            the default.
     *            </p>
     *            <p>
     *            When the number of shards to be listed is greater than the
     *            value of <code>MaxResults</code>, the response contains a
     *            <code>NextToken</code> value that you can use in a subsequent
     *            call to <code>ListShards</code> to list the next set of
     *            shards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the
     * same name. For example, if you create a data stream and then delete it,
     * and you later create another data stream with the same name, you can use
     * this input parameter to specify which of the two streams you want to list
     * the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         Specify this input parameter to distinguish data streams that
     *         have the same name. For example, if you create a data stream and
     *         then delete it, and you later create another data stream with the
     *         same name, you can use this input parameter to specify which of
     *         the two streams you want to list the shards for.
     *         </p>
     *         <p>
     *         You cannot specify this parameter if you specify the
     *         <code>NextToken</code> parameter.
     *         </p>
     */
    public java.util.Date getStreamCreationTimestamp() {
        return streamCreationTimestamp;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the
     * same name. For example, if you create a data stream and then delete it,
     * and you later create another data stream with the same name, you can use
     * this input parameter to specify which of the two streams you want to list
     * the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     *
     * @param streamCreationTimestamp <p>
     *            Specify this input parameter to distinguish data streams that
     *            have the same name. For example, if you create a data stream
     *            and then delete it, and you later create another data stream
     *            with the same name, you can use this input parameter to
     *            specify which of the two streams you want to list the shards
     *            for.
     *            </p>
     *            <p>
     *            You cannot specify this parameter if you specify the
     *            <code>NextToken</code> parameter.
     *            </p>
     */
    public void setStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the
     * same name. For example, if you create a data stream and then delete it,
     * and you later create another data stream with the same name, you can use
     * this input parameter to specify which of the two streams you want to list
     * the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the
     * <code>NextToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamCreationTimestamp <p>
     *            Specify this input parameter to distinguish data streams that
     *            have the same name. For example, if you create a data stream
     *            and then delete it, and you later create another data stream
     *            with the same name, you can use this input parameter to
     *            specify which of the two streams you want to list the shards
     *            for.
     *            </p>
     *            <p>
     *            You cannot specify this parameter if you specify the
     *            <code>NextToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListShardsRequest withStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getExclusiveStartShardId() != null)
            sb.append("ExclusiveStartShardId: " + getExclusiveStartShardId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getStreamCreationTimestamp() != null)
            sb.append("StreamCreationTimestamp: " + getStreamCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getExclusiveStartShardId() == null) ? 0 : getExclusiveStartShardId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamCreationTimestamp() == null) ? 0 : getStreamCreationTimestamp()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListShardsRequest == false)
            return false;
        ListShardsRequest other = (ListShardsRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getExclusiveStartShardId() == null ^ this.getExclusiveStartShardId() == null)
            return false;
        if (other.getExclusiveStartShardId() != null
                && other.getExclusiveStartShardId().equals(this.getExclusiveStartShardId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStreamCreationTimestamp() == null ^ this.getStreamCreationTimestamp() == null)
            return false;
        if (other.getStreamCreationTimestamp() != null
                && other.getStreamCreationTimestamp().equals(this.getStreamCreationTimestamp()) == false)
            return false;
        return true;
    }
}
