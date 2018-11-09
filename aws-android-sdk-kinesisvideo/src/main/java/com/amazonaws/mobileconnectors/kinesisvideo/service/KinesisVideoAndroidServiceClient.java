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

package com.amazonaws.mobileconnectors.kinesisvideo.service;

import static com.amazonaws.ClientConfiguration.DEFAULT_MAX_CONNECTIONS;
import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;

import java.io.InputStream;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import android.support.annotation.Nullable;

import android.support.annotation.NonNull;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentials;
import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.kinesisvideo.client.PutMediaClient;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.encoding.ChunkDecoder;
import com.amazonaws.kinesisvideo.model.ResponseStatus;
import com.amazonaws.kinesisvideo.producer.StreamDescription;
import com.amazonaws.kinesisvideo.producer.StreamStatus;
import com.amazonaws.kinesisvideo.internal.producer.client.KinesisVideoServiceClient;
import com.amazonaws.mobileconnectors.kinesisvideo.signing.KinesisVideoAndroidAWS4Signer;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesisvideo.AWSKinesisVideo;
import com.amazonaws.services.kinesisvideo.AWSKinesisVideoClient;
import com.amazonaws.services.kinesisvideo.model.CreateStreamRequest;
import com.amazonaws.services.kinesisvideo.model.CreateStreamResult;
import com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest;
import com.amazonaws.services.kinesisvideo.model.DeleteStreamResult;
import com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest;
import com.amazonaws.services.kinesisvideo.model.DescribeStreamResult;
import com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest;
import com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult;
import com.amazonaws.services.kinesisvideo.model.ResourceNotFoundException;
import com.amazonaws.services.kinesisvideo.model.TagStreamRequest;
import com.amazonaws.services.kinesisvideo.model.TagStreamResult;
import com.amazonaws.util.StringUtils;

public final class KinesisVideoAndroidServiceClient implements KinesisVideoServiceClient {
    private static final int RECEIVE_TIMEOUT_1HR = 60 * 60 * 1000;
    private static final String ABSOLUTE_TIMECODE = "ABSOLUTE";
    private static final String RELATIVE_TIMECODE = "RELATIVE";

    private final Log log;
    private KinesisVideoClientConfiguration configuration;

    private static AWSKinesisVideoClient createAwsKinesisVideoClient(final KinesisVideoCredentialsProvider credentialsProvider,
            final Region region,
            final String endpoint,
            final int timeoutInMillis)
            throws KinesisVideoException
    {

        final AWSCredentials credentials = createAwsCredentials(credentialsProvider);
        return createAwsKinesisVideoClient(credentials, region, endpoint, timeoutInMillis);
    }

    private static AWSKinesisVideoClient createAwsKinesisVideoClient(final AWSCredentialsProvider awsCredentialsProvider,
            final Region region,
            final String endpoint,
            final int timeoutInMillis)
            throws KinesisVideoException
    {

        final AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        return createAwsKinesisVideoClient(credentials, region, endpoint, timeoutInMillis);
    }

    private static AWSKinesisVideoClient createAwsKinesisVideoClient(final AWSCredentials credentials,
            final Region region,
            final String endpoint,
            final int timeoutInMillis)
            throws KinesisVideoException
    {

        final ClientConfiguration clientConfiguration = createClientConfiguration(timeoutInMillis);
        final AWSKinesisVideoClient awsKinesisVideoClient = new AWSKinesisVideoClient(credentials, clientConfiguration);

        awsKinesisVideoClient.setRegion(region);
        awsKinesisVideoClient.setSignerRegionOverride(region.getName());
        awsKinesisVideoClient.setServiceNameIntern("kinesisvideo");
        awsKinesisVideoClient.setEndpoint(endpoint);

        return awsKinesisVideoClient;
    }

    private static AWSCredentials createAwsCredentials(final @NonNull KinesisVideoCredentialsProvider credentialsProvider)
            throws KinesisVideoException
    {
        Preconditions.checkNotNull(credentialsProvider);
        final KinesisVideoCredentials kinesisVideoCredentials = credentialsProvider.getCredentials();

        final AWSCredentials credentials = new AWSSessionCredentials() {
            @Override
            public String getSessionToken() {
                return kinesisVideoCredentials.getSessionToken();
            }

            @Override
            public String getAWSAccessKeyId() {
                return kinesisVideoCredentials.getAccessKey();
            }

            @Override
            public String getAWSSecretKey() {
                return kinesisVideoCredentials.getSecretKey();
            }
        };

        return credentials;
    }

    private static ClientConfiguration createClientConfiguration(int timeoutInMillis) {
        return new ClientConfiguration()
                .withProtocol(Protocol.HTTPS)
                .withConnectionTimeout(timeoutInMillis)
                .withMaxConnections(DEFAULT_MAX_CONNECTIONS)
                .withSocketTimeout(timeoutInMillis);
    }

    public KinesisVideoAndroidServiceClient(@NonNull final Log log) {
        this.log = Preconditions.checkNotNull(log);
    }

    @NonNull
    public static AWSKinesisVideo getAwsKinesisVideoClient(final @NonNull AWSCredentialsProvider credentialsProvider,
            final @NonNull Region region,
            final @NonNull String endpoint,
            final int timeoutInMillis) throws KinesisVideoException {
        return createAwsKinesisVideoClient(credentialsProvider,
                region,
                endpoint,
                timeoutInMillis);
    }

    @Override
    public void initialize(@NonNull KinesisVideoClientConfiguration kinesisVideoClientConfiguration) throws KinesisVideoException {
        // We already got the configuration
        this.configuration = Preconditions.checkNotNull(kinesisVideoClientConfiguration);
    }

    @Override
    public String createStream(@NonNull final String streamName,
            @NonNull final String deviceName,
            @NonNull final String contentType,
            @Nullable final String kmsKeyId,
            long retentionPeriodInHours,
            long timeoutInMillis,
            @Nullable final KinesisVideoCredentialsProvider credentialsProvider)
            throws KinesisVideoException
    {
        final AWSKinesisVideoClient serviceClient = createAwsKinesisVideoClient(credentialsProvider,
                Region.getRegion(Regions.fromName(configuration.getRegion())),
                configuration.getEndpoint(),
                (int) timeoutInMillis);

        final CreateStreamRequest createStreamRequest = new CreateStreamRequest()
                .withStreamName(streamName)
                .withDeviceName(deviceName)
                .withMediaType(contentType)
                .withKmsKeyId(StringUtils.isBlank(kmsKeyId) ? null : kmsKeyId)
                .withDataRetentionInHours((int) retentionPeriodInHours);

        log.debug("calling create stream: " + createStreamRequest.toString());

        final CreateStreamResult createStreamResult;
        try {
            createStreamResult = serviceClient.createStream(createStreamRequest);
        } catch (final AmazonClientException e) {
            // Wrap into an KinesisVideoException object
            log.exception(e, "Service call failed.");
            throw new KinesisVideoException(e);
        }

        log.debug("create stream result: " + createStreamResult.toString());

        return createStreamResult.getStreamARN();
    }

    @Override
    public StreamDescription describeStream(@NonNull final String streamName,
            long timeoutInMillis,
            @Nullable final KinesisVideoCredentialsProvider credentialsProvider) throws KinesisVideoException
    {
        final AWSKinesisVideoClient serviceClient = createAwsKinesisVideoClient(credentialsProvider,
                Region.getRegion(Regions.fromName(configuration.getRegion())),
                configuration.getEndpoint(),
                (int) timeoutInMillis);

        final DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest()
                .withStreamName(streamName);

        log.debug("calling describe stream: " + describeStreamRequest.toString());

        final DescribeStreamResult describeStreamResult;
        try {
            describeStreamResult = serviceClient.describeStream(describeStreamRequest);
        } catch (final AmazonClientException e) {
            log.exception(e, "Service call failed.");
            throw new KinesisVideoException(e);
        }

        if (null == describeStreamResult) {
            log.debug("describe stream returned null");
            return null;
        }

        log.debug("describe stream result: " + describeStreamResult.toString());
        return toStreamDescription(describeStreamResult);
    }

    @Override
    public void deleteStream(@NonNull final String streamName,
            @NonNull final String version,
            final Date creationTime,
            long timeoutInMillis,
            @Nullable final KinesisVideoCredentialsProvider credentialsProvider) throws KinesisVideoException
    {
        final AWSKinesisVideoClient serviceClient = createAwsKinesisVideoClient(credentialsProvider,
                Region.getRegion(Regions.fromName(configuration.getRegion())),
                configuration.getEndpoint(),
                (int) timeoutInMillis);
        
        final StreamDescription streamDescription = describeStream(streamName, timeoutInMillis, credentialsProvider);

        final DeleteStreamRequest deleteStreamRequest = new DeleteStreamRequest()
                .withStreamARN(streamDescription.getStreamArn())
                .withCurrentVersion(streamDescription.getUpdateVersion());

        log.debug("calling delete stream: " + deleteStreamRequest.toString());

        final DeleteStreamResult deleteStreamResult;
        try {
            deleteStreamResult = serviceClient.deleteStream(deleteStreamRequest);
        } catch (final AmazonClientException e) {
            log.exception(e, "Service call failed.");
            throw new KinesisVideoException(e);
        }

        log.debug("delete stream result: " + deleteStreamResult.toString());
    }

    @Override
    public void tagStream(@NonNull final String streamArn,
            @Nullable final Map<String, String> tags,
            long timeoutInMillis,
            @Nullable final KinesisVideoCredentialsProvider credentialsProvider) throws KinesisVideoException
    {
        final AWSKinesisVideoClient serviceClient = createAwsKinesisVideoClient(credentialsProvider,
                Region.getRegion(Regions.fromName(configuration.getRegion())),
                configuration.getEndpoint(),
                (int) timeoutInMillis);

        final TagStreamRequest tagStreamRequest = new TagStreamRequest()
                .withStreamARN(streamArn)
                .withTags(tags);

        log.debug("calling tag resource: " + tagStreamRequest.toString());

        final TagStreamResult tagStreamResult;
        try {
            tagStreamResult = serviceClient.tagStream(tagStreamRequest);
        } catch (final AmazonClientException e) {
            log.exception(e, "Service call failed.");
            throw new KinesisVideoException(e);
        }

        log.debug("tag resource result: " + tagStreamResult.toString());
    }

    @Override
    public String getDataEndpoint(@NonNull final String streamName,
            @NonNull final String apiName,
            long timeoutInMillis,
            @Nullable final KinesisVideoCredentialsProvider credentialsProvider) throws KinesisVideoException
    {
        final AWSKinesisVideoClient serviceClient = createAwsKinesisVideoClient(credentialsProvider,
                Region.getRegion(Regions.fromName(configuration.getRegion())),
                configuration.getEndpoint(),
                (int) timeoutInMillis);

        final GetDataEndpointRequest getDataEndpointRequest = new GetDataEndpointRequest()
                .withStreamName(streamName)
                .withAPIName(apiName);

        log.debug("calling get data endpoint: " + getDataEndpointRequest.toString());

        final GetDataEndpointResult getDataEndpointResult;

        try {
            getDataEndpointResult = serviceClient.getDataEndpoint(getDataEndpointRequest);
        } catch (final AmazonClientException e) {
            log.exception(e, "Service call failed.");
            throw new KinesisVideoException(e);
        }

        log.debug("get data endpoint result: " + getDataEndpointResult.toString());

        return getDataEndpointResult.getDataEndpoint();
    }

    @Override
    public void putMedia(@NonNull final String streamName,
            @NonNull final String containerType,
            final long streamStartTimeInMillis,
            final boolean absoluteFragmentTimes,
            final boolean ackRequired,
            @NonNull final String dataEndpoint,
            long timeoutInMillis,
            @Nullable final KinesisVideoCredentialsProvider credentialsProvider,
            @NonNull final InputStream dataInputStream,
            @NonNull final Consumer<InputStream> acksConsumer,
            @Nullable final Consumer<Exception> completionCallback)
            throws KinesisVideoException
    {
        final AWSCredentials credentials = createAwsCredentials(credentialsProvider);
        final KinesisVideoAndroidAWS4Signer signer = new KinesisVideoAndroidAWS4Signer(credentials, configuration);
        final URI putMediaUri = URI.create(dataEndpoint + "/putMedia");
        final String timecodeType = absoluteFragmentTimes ? ABSOLUTE_TIMECODE : RELATIVE_TIMECODE;

        final PutMediaClient.Builder putMediaClientBuilder = PutMediaClient
                .builder()
                .receiveTimeout(RECEIVE_TIMEOUT_1HR)
                .timestamp(streamStartTimeInMillis)
                .signWith(signer)
                .receiveCompletion(completionCallback)
                .receiveAcks(acksConsumer)
                .streamName(streamName)
                .mkvStream(dataInputStream)
                .fragmentTimecodeType(timecodeType)
                .putMediaDestinationUri(putMediaUri);

        final PutMediaClient putMediaClient = putMediaClientBuilder.build();

        // Kick off execution
        putMediaClient.putMediaInBackground();

    }

    private static StreamDescription toStreamDescription(final @NonNull DescribeStreamResult result) {
        checkNotNull(result);
        return new StreamDescription(
                StreamDescription.STREAM_DESCRIPTION_CURRENT_VERSION,
                result.getStreamInfo().getDeviceName(),
                result.getStreamInfo().getStreamName(),
                result.getStreamInfo().getMediaType(),
                result.getStreamInfo().getVersion(),
                result.getStreamInfo().getStreamARN(),
                StreamStatus.valueOf(result.getStreamInfo().getStatus()),
                result.getStreamInfo().getCreationTime().getTime());
    }
}
