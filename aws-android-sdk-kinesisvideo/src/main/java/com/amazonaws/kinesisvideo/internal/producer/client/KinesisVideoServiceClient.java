/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.internal.producer.client;

import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.producer.StreamDescription;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

public interface KinesisVideoServiceClient {

    /**
     * Initialize with the network configuration.
     *
     * @param configuration - Client configuration to initialize with
     */
    void initialize(@NonNull final KinesisVideoClientConfiguration configuration)
            throws KinesisVideoException;

    /**
     * Create a stream on KinesisVideo frontend
     *
     * @param streamName             - Name of stream to create
     * @param deviceName             - Device name of stream to create
     * @param contentType            - Content type of stream to create
     * @param kmsKeyId               - KMS Key Id
     * @param retentionPeriodInHours - Stream retention period in hours
     * @param timeoutInMillis        - Timeout in milliseconds
     * @param kinesisVideoCredentialsProvider - Credentials to use
     * @return StreamArn of stream just created
     */
    String createStream(@NonNull final String streamName,
                        @NonNull final String deviceName,
                        @NonNull final String contentType,
                        @Nullable final String kmsKeyId,
                        long retentionPeriodInHours,
                        long timeoutInMillis,
                        @Nullable final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider)
            throws KinesisVideoException;

    /**
     * Describe the status of a stream
     *
     * @param streamName             - Name of stream to describe
     * @param timeoutInMillis        - Timeout in milliseconds
     * @param kinesisVideoCredentialsProvider - Credentials to use
     * @return Stream description
     */
    StreamDescription describeStream(@NonNull final String streamName,
                                     long timeoutInMillis,
                                     @Nullable final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider)
            throws KinesisVideoException;

    /**
     * Delete stream with name and version
     *
     * @param streamName             - Name of stream to delete
     * @param version                - Version of stream to delete
     * @param creationTime           - Creation time of stream to delete
     * @param timeoutInMillis        - Timeout in milliseconds
     * @param kinesisVideoCredentialsProvider - Credentials to use
     */
    void deleteStream(@NonNull final String streamName,
                      @NonNull final String version,
                      final Date creationTime,
                      long timeoutInMillis,
                      @Nullable final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider)
            throws KinesisVideoException;

    /**
     * Tag a stream of a specified ARN with a list of tags.
     *
     * @param streamArn              - ARN of the stream to be tagged
     * @param tags                   - Map of key-value pair
     * @param timeoutInMillis        - Timeout in milliseconds
     * @param kinesisVideoCredentialsProvider - Credentials to use
     */
    void tagStream(@NonNull final String streamArn,
                   @Nullable final Map<String, String> tags,
                   long timeoutInMillis,
                   @Nullable final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider)
            throws KinesisVideoException;

    /**
     * Get data endpoint to be used by PutMedia for the specified stream.
     *
     * @param streamName             - Name of the stream
     * @param apiName                - Api name to call
     * @param timeoutInMillis        - Timeout in milliseconds
     * @param kinesisVideoCredentialsProvider - Credentials to use
     * @return endpoint to which PutMedia API is sent
     */
    String getDataEndpoint(@NonNull final String streamName,
                           @NonNull final String apiName,
                           long timeoutInMillis,
                           @Nullable final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider)
            throws KinesisVideoException;

    /**
     * Puts media as a long-running operation.
     * <p>
     * NOTE: The call will be 'prompt' and will return the IO streams which will be used for the actual streaming.
     *
     * @param streamName                - Name of the stream
     * @param containerType             - Container type
     * @param streamStartTimeInMillis   - Stream start time
     * @param absoluteFragmentTimes     - Whether to use absolute fragment times
     * @param ackRequired               - Whether acks are required
     * @param dataEndpoint              - The data endpoint to use
     * @param timeoutInMillis           - Timeout in milliseconds
     * @param kinesisVideoCredentialsProvider - Credentials to use
     * @param dataStream                - Data {@link InputStream}
     * @param acksConsumer              - Consumer of the ACK input stream
     * @param completionCallback        - Consumer of an Exception for reporting stream termination
     */
    void putMedia(@NonNull final String streamName,
                  @NonNull final String containerType,
                  final long streamStartTimeInMillis,
                  final boolean absoluteFragmentTimes,
                  final boolean ackRequired,
                  @NonNull final String dataEndpoint,
                  long timeoutInMillis,
                  @Nullable final KinesisVideoCredentialsProvider kinesisVideoCredentialsProvider,
                  @NonNull final InputStream dataStream,
                  @NonNull final Consumer<InputStream> acksConsumer,
                  @Nullable final Consumer<Exception> completionCallback)
            throws KinesisVideoException;
}
