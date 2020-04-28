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

package com.amazonaws.services.amazonkinesisvideostreamsarchivedmedia;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.amazonkinesisvideostreamsarchivedmedia.model.*;
import com.amazonaws.services.amazonkinesisvideostreamsarchivedmedia.model.transform.*;

/**
 * Client for accessing Amazon Kinesis Video Streams Archived Media. All service
 * calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p/>
 */
public class AmazonKinesisVideoStreamsArchivedMediaClient extends AmazonWebServiceClient implements
        AmazonKinesisVideoStreamsArchivedMedia {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Kinesis Video Streams
     * Archived Media exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonKinesisVideoStreamsArchivedMediaClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to
     *            AmazonKinesisVideoStreamsArchivedMedia (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonKinesisVideoStreamsArchivedMediaClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia using the specified AWS account
     * credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonKinesisVideoStreamsArchivedMediaClient client = new AmazonKinesisVideoStreamsArchivedMediaClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonKinesisVideoStreamsArchivedMediaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia using the specified AWS account
     * credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonKinesisVideoStreamsArchivedMediaClient client = new AmazonKinesisVideoStreamsArchivedMediaClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to
     *            AmazonKinesisVideoStreamsArchivedMedia (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonKinesisVideoStreamsArchivedMediaClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia using the specified AWS account
     * credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonKinesisVideoStreamsArchivedMediaClient client = new AmazonKinesisVideoStreamsArchivedMediaClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonKinesisVideoStreamsArchivedMediaClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia using the specified AWS account
     * credentials provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonKinesisVideoStreamsArchivedMediaClient client = new AmazonKinesisVideoStreamsArchivedMediaClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to
     *            AmazonKinesisVideoStreamsArchivedMedia (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonKinesisVideoStreamsArchivedMediaClient(
            AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia using the specified AWS account
     * credentials provider, client configuration options and request metric
     * collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to
     *            AmazonKinesisVideoStreamsArchivedMedia (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonKinesisVideoStreamsArchivedMediaClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonKinesisVideoStreamsArchivedMedia using the specified AWS account
     * credentials provider, client configuration options and request metric
     * collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonKinesisVideoStreamsArchivedMediaClient client = new AmazonKinesisVideoStreamsArchivedMediaClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to
     *            AmazonKinesisVideoStreamsArchivedMedia (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonKinesisVideoStreamsArchivedMediaClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ClientLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCodecPrivateDataExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMediaFrameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MissingCodecPrivateDataExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoDataRetentionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedStreamMediaTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("kinesisvideo.us-east-1.amazonaws.com");
        this.endpointPrefix = "kinesisvideo";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonkinesisvideostreamsarchivedmedia/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain(
                        "/com/amazonaws/services/amazonkinesisvideostreamsarchivedmedia/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Downloads an MP4 file (clip) containing the archived, on-demand media
     * from the specified video stream over the specified time range.
     * </p>
     * <p>
     * Both the StreamName and the StreamARN parameters are optional, but you
     * must specify either the StreamName or the StreamARN when invoking this
     * API operation.
     * </p>
     * <p>
     * As a prerequsite to using GetCLip API, you must obtain an endpoint using
     * <code>GetDataEndpoint</code>, specifying GET_CLIP for
     * <code/> the <code>APIName</code> parameter.
     * </p>
     * <p>
     * An Amazon Kinesis video stream has the following requirements for
     * providing data through MP4:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The media must contain h.264 or h.265 encoded video and, optionally, AAC
     * or G.711 encoded audio. Specifically, the codec ID of track 1 should be
     * <code>V_MPEG/ISO/AVC</code> (for h.264) or V_MPEGH/ISO/HEVC (for H.265).
     * Optionally, the codec ID of track 2 should be <code>A_AAC</code> (for
     * AAC) or A_MS/ACM (for G.711).
     * </p>
     * </li>
     * <li>
     * <p>
     * Data retention must be greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * The video track of each fragment must contain codec private data in the
     * Advanced Video Coding (AVC) for H.264 format and HEVC for H.265 format.
     * For more information, see <a
     * href="https://www.iso.org/standard/55980.html">MPEG-4 specification
     * ISO/IEC 14496-15</a>. For information about adapting stream data to a
     * given format, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html"
     * >NAL Adaptation Flags</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The audio track (if present) of each fragment must contain codec private
     * data in the AAC format (<a
     * href="https://www.iso.org/standard/43345.html">AAC specification ISO/IEC
     * 13818-7</a>) or the <a href=
     * "http://www-mmsp.ece.mcgill.ca/Documents/AudioFormats/WAVE/WAVE.html">MS
     * Wave format</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can monitor the amount of outgoing data by monitoring the
     * <code>GetClip.OutgoingBytes</code> Amazon CloudWatch metric. For
     * information about using CloudWatch to monitor Kinesis Video Streams, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/monitoring.html"
     * >Monitoring Kinesis Video Streams</a>. For pricing information, see <a
     * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Amazon
     * Kinesis Video Streams Pricing</a> and <a
     * href="https://aws.amazon.com/pricing/">AWS Pricing</a>. Charges for
     * outgoing AWS data apply.
     * </p>
     * 
     * @param getClipRequest
     * @return getClipResult The response from the GetClip service method, as
     *         returned by Amazon Kinesis Video Streams Archived Media.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws UnsupportedStreamMediaTypeException
     * @throws MissingCodecPrivateDataException
     * @throws InvalidCodecPrivateDataException
     * @throws InvalidMediaFrameException
     * @throws NoDataRetentionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Streams Archived Media indicating either a
     *             problem with the data in the request, or a server side issue.
     */
    public GetClipResult getClip(GetClipRequest getClipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClipRequest> request = null;
        Response<GetClipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClipRequestMarshaller().marshall(getClipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetClipResult, JsonUnmarshallerContext> unmarshaller = new GetClipResultJsonUnmarshaller();
            JsonResponseHandler<GetClipResult> responseHandler = new JsonResponseHandler<GetClipResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves an MPEG Dynamic Adaptive Streaming over HTTP (DASH) URL for the
     * stream. You can then open the URL in a media player to view the stream
     * contents.
     * </p>
     * <p>
     * Both the <code>StreamName</code> and the <code>StreamARN</code>
     * parameters are optional, but you must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code> when invoking this
     * API operation.
     * </p>
     * <p>
     * An Amazon Kinesis video stream has the following requirements for
     * providing data through MPEG-DASH:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The media must contain h.264 or h.265 encoded video and, optionally, AAC
     * or G.711 encoded audio. Specifically, the codec ID of track 1 should be
     * <code>V_MPEG/ISO/AVC</code> (for h.264) or V_MPEGH/ISO/HEVC (for H.265).
     * Optionally, the codec ID of track 2 should be <code>A_AAC</code> (for
     * AAC) or A_MS/ACM (for G.711).
     * </p>
     * </li>
     * <li>
     * <p>
     * Data retention must be greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * The video track of each fragment must contain codec private data in the
     * Advanced Video Coding (AVC) for H.264 format and HEVC for H.265 format.
     * For more information, see <a
     * href="https://www.iso.org/standard/55980.html">MPEG-4 specification
     * ISO/IEC 14496-15</a>. For information about adapting stream data to a
     * given format, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html"
     * >NAL Adaptation Flags</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The audio track (if present) of each fragment must contain codec private
     * data in the AAC format (<a
     * href="https://www.iso.org/standard/43345.html">AAC specification ISO/IEC
     * 13818-7</a>) or the <a href=
     * "http://www-mmsp.ece.mcgill.ca/Documents/AudioFormats/WAVE/WAVE.html">MS
     * Wave format</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following procedure shows how to use MPEG-DASH with Kinesis Video
     * Streams:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Get an endpoint using <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_GetDataEndpoint.html"
     * >GetDataEndpoint</a>, specifying
     * <code>GET_DASH_STREAMING_SESSION_URL</code> for the <code>APIName</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Retrieve the MPEG-DASH URL using <code>GetDASHStreamingSessionURL</code>.
     * Kinesis Video Streams creates an MPEG-DASH streaming session to be used
     * for accessing content in a stream using the MPEG-DASH protocol.
     * <code>GetDASHStreamingSessionURL</code> returns an authenticated URL
     * (that includes an encrypted session token) for the session's MPEG-DASH
     * <i>manifest</i> (the root resource needed for streaming with MPEG-DASH).
     * </p>
     * <note>
     * <p>
     * Don't share or store this token where an unauthorized entity could access
     * it. The token provides access to the content of the stream. Safeguard the
     * token with the same measures that you would use with your AWS
     * credentials.
     * </p>
     * </note>
     * <p>
     * The media that is made available through the manifest consists only of
     * the requested stream, time range, and format. No other media data (such
     * as frames outside the requested window or alternate bitrates) is made
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the URL (containing the encrypted session token) for the
     * MPEG-DASH manifest to a media player that supports the MPEG-DASH
     * protocol. Kinesis Video Streams makes the initialization fragment and
     * media fragments available through the manifest URL. The initialization
     * fragment contains the codec private data for the stream, and other data
     * needed to set up the video or audio decoder and renderer. The media
     * fragments contain encoded video frames or encoded audio samples.
     * </p>
     * </li>
     * <li>
     * <p>
     * The media player receives the authenticated URL and requests stream
     * metadata and media data normally. When the media player requests data, it
     * calls the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GetDASHManifest:</b> Retrieves an MPEG DASH manifest, which contains
     * the metadata for the media that you want to playback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GetMP4InitFragment:</b> Retrieves the MP4 initialization fragment. The
     * media player typically loads the initialization fragment before loading
     * any media fragments. This fragment contains the "<code>fytp</code>" and "
     * <code>moov</code>" MP4 atoms, and the child atoms that are needed to
     * initialize the media player decoder.
     * </p>
     * <p>
     * The initialization fragment does not correspond to a fragment in a
     * Kinesis video stream. It contains only the codec private data for the
     * stream and respective track, which the media player needs to decode the
     * media frames.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GetMP4MediaFragment:</b> Retrieves MP4 media fragments. These
     * fragments contain the "<code>moof</code>" and "<code>mdat</code>" MP4
     * atoms and their child atoms, containing the encoded fragment's media
     * frames and their timestamps.
     * </p>
     * <note>
     * <p>
     * After the first media fragment is made available in a streaming session,
     * any fragments that don't contain the same codec private data cause an
     * error to be returned when those different media fragments are loaded.
     * Therefore, the codec private data should not change between fragments in
     * a session. This also means that the session fails if the fragments in a
     * stream change from having only video to having both audio and video.
     * </p>
     * </note>
     * <p>
     * Data retrieved with this action is billable. See <a
     * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Pricing</a>
     * for details.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <note>
     * <p>
     * The following restrictions apply to MPEG-DASH sessions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A streaming session URL should not be shared between players. The service
     * might throttle a session if multiple media players are sharing it. For
     * connection limits, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     * >Kinesis Video Streams Limits</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Kinesis video stream can have a maximum of ten active MPEG-DASH
     * streaming sessions. If a new session is created when the maximum number
     * of sessions is already active, the oldest (earliest created) session is
     * closed. The number of active <code>GetMedia</code> connections on a
     * Kinesis video stream does not count against this limit, and the number of
     * active MPEG-DASH sessions does not count against the active
     * <code>GetMedia</code> connection limit.
     * </p>
     * <note>
     * <p>
     * The maximum limits for active HLS and MPEG-DASH streaming sessions are
     * independent of each other.
     * </p>
     * </note></li>
     * </ul>
     * </note>
     * <p>
     * You can monitor the amount of data that the media player consumes by
     * monitoring the <code>GetMP4MediaFragment.OutgoingBytes</code> Amazon
     * CloudWatch metric. For information about using CloudWatch to monitor
     * Kinesis Video Streams, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/monitoring.html"
     * >Monitoring Kinesis Video Streams</a>. For pricing information, see <a
     * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Amazon
     * Kinesis Video Streams Pricing</a> and <a
     * href="https://aws.amazon.com/pricing/">AWS Pricing</a>. Charges for both
     * HLS sessions and outgoing AWS data apply.
     * </p>
     * <p>
     * For more information about HLS, see <a
     * href="https://developer.apple.com/streaming/">HTTP Live Streaming</a> on
     * the <a href="https://developer.apple.com">Apple Developer site</a>.
     * </p>
     * <important>
     * <p>
     * If an error is thrown after invoking a Kinesis Video Streams archived
     * media API, in addition to the HTTP status code and the response body, it
     * includes the following pieces of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error
     * type in addition to what the HTTP status code provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue
     * to AWS, the support team can better diagnose the problem if given the
     * Request Id.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both the HTTP status code and the ErrorType header can be utilized to
     * make programmatic decisions about whether errors are retry-able and under
     * what conditions, as well as provide information on what actions the
     * client programmer might need to take in order to successfully try again.
     * </p>
     * <p>
     * For more information, see the <b>Errors</b> section at the bottom of this
     * topic, as well as <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     * </important>
     * 
     * @param getDASHStreamingSessionURLRequest
     * @return getDASHStreamingSessionURLResult The response from the
     *         GetDASHStreamingSessionURL service method, as returned by Amazon
     *         Kinesis Video Streams Archived Media.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws UnsupportedStreamMediaTypeException
     * @throws NoDataRetentionException
     * @throws MissingCodecPrivateDataException
     * @throws InvalidCodecPrivateDataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Streams Archived Media indicating either a
     *             problem with the data in the request, or a server side issue.
     */
    public GetDASHStreamingSessionURLResult getDASHStreamingSessionURL(
            GetDASHStreamingSessionURLRequest getDASHStreamingSessionURLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDASHStreamingSessionURLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDASHStreamingSessionURLRequest> request = null;
        Response<GetDASHStreamingSessionURLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDASHStreamingSessionURLRequestMarshaller()
                        .marshall(getDASHStreamingSessionURLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDASHStreamingSessionURLResult, JsonUnmarshallerContext> unmarshaller = new GetDASHStreamingSessionURLResultJsonUnmarshaller();
            JsonResponseHandler<GetDASHStreamingSessionURLResult> responseHandler = new JsonResponseHandler<GetDASHStreamingSessionURLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves an HTTP Live Streaming (HLS) URL for the stream. You can then
     * open the URL in a browser or media player to view the stream contents.
     * </p>
     * <p>
     * Both the <code>StreamName</code> and the <code>StreamARN</code>
     * parameters are optional, but you must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code> when invoking this
     * API operation.
     * </p>
     * <p>
     * An Amazon Kinesis video stream has the following requirements for
     * providing data through HLS:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The media must contain h.264 or h.265 encoded video and, optionally, AAC
     * encoded audio. Specifically, the codec ID of track 1 should be
     * <code>V_MPEG/ISO/AVC</code> (for h.264) or <code>V_MPEG/ISO/HEVC</code>
     * (for h.265). Optionally, the codec ID of track 2 should be
     * <code>A_AAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data retention must be greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * The video track of each fragment must contain codec private data in the
     * Advanced Video Coding (AVC) for H.264 format or HEVC for H.265 format (<a
     * href="https://www.iso.org/standard/55980.html">MPEG-4 specification
     * ISO/IEC 14496-15</a>). For information about adapting stream data to a
     * given format, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html"
     * >NAL Adaptation Flags</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The audio track (if present) of each fragment must contain codec private
     * data in the AAC format (<a
     * href="https://www.iso.org/standard/43345.html">AAC specification ISO/IEC
     * 13818-7</a>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Kinesis Video Streams HLS sessions contain fragments in the fragmented
     * MPEG-4 form (also called fMP4 or CMAF) or the MPEG-2 form (also called TS
     * chunks, which the HLS specification also supports). For more information
     * about HLS fragment types, see the <a
     * href="https://tools.ietf.org/html/draft-pantos-http-live-streaming-23"
     * >HLS specification</a>.
     * </p>
     * <p>
     * The following procedure shows how to use HLS with Kinesis Video Streams:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Get an endpoint using <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_GetDataEndpoint.html"
     * >GetDataEndpoint</a>, specifying
     * <code>GET_HLS_STREAMING_SESSION_URL</code> for the <code>APIName</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Retrieve the HLS URL using <code>GetHLSStreamingSessionURL</code>.
     * Kinesis Video Streams creates an HLS streaming session to be used for
     * accessing content in a stream using the HLS protocol.
     * <code>GetHLSStreamingSessionURL</code> returns an authenticated URL (that
     * includes an encrypted session token) for the session's HLS <i>master
     * playlist</i> (the root resource needed for streaming with HLS).
     * </p>
     * <note>
     * <p>
     * Don't share or store this token where an unauthorized entity could access
     * it. The token provides access to the content of the stream. Safeguard the
     * token with the same measures that you would use with your AWS
     * credentials.
     * </p>
     * </note>
     * <p>
     * The media that is made available through the playlist consists only of
     * the requested stream, time range, and format. No other media data (such
     * as frames outside the requested window or alternate bitrates) is made
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the URL (containing the encrypted session token) for the HLS
     * master playlist to a media player that supports the HLS protocol. Kinesis
     * Video Streams makes the HLS media playlist, initialization fragment, and
     * media fragments available through the master playlist URL. The
     * initialization fragment contains the codec private data for the stream,
     * and other data needed to set up the video or audio decoder and renderer.
     * The media fragments contain H.264-encoded video frames or AAC-encoded
     * audio samples.
     * </p>
     * </li>
     * <li>
     * <p>
     * The media player receives the authenticated URL and requests stream
     * metadata and media data normally. When the media player requests data, it
     * calls the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GetHLSMasterPlaylist:</b> Retrieves an HLS master playlist, which
     * contains a URL for the <code>GetHLSMediaPlaylist</code> action for each
     * track, and additional metadata for the media player, including estimated
     * bitrate and resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GetHLSMediaPlaylist:</b> Retrieves an HLS media playlist, which
     * contains a URL to access the MP4 initialization fragment with the
     * <code>GetMP4InitFragment</code> action, and URLs to access the MP4 media
     * fragments with the <code>GetMP4MediaFragment</code> actions. The HLS
     * media playlist also contains metadata about the stream that the player
     * needs to play it, such as whether the <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>ON_DEMAND</code>. The HLS media playlist is
     * typically static for sessions with a <code>PlaybackType</code> of
     * <code>ON_DEMAND</code>. The HLS media playlist is continually updated
     * with new fragments for sessions with a <code>PlaybackType</code> of
     * <code>LIVE</code>. There is a distinct HLS media playlist for the video
     * track and the audio track (if applicable) that contains MP4 media URLs
     * for the specific track.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GetMP4InitFragment:</b> Retrieves the MP4 initialization fragment. The
     * media player typically loads the initialization fragment before loading
     * any media fragments. This fragment contains the "<code>fytp</code>" and "
     * <code>moov</code>" MP4 atoms, and the child atoms that are needed to
     * initialize the media player decoder.
     * </p>
     * <p>
     * The initialization fragment does not correspond to a fragment in a
     * Kinesis video stream. It contains only the codec private data for the
     * stream and respective track, which the media player needs to decode the
     * media frames.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GetMP4MediaFragment:</b> Retrieves MP4 media fragments. These
     * fragments contain the "<code>moof</code>" and "<code>mdat</code>" MP4
     * atoms and their child atoms, containing the encoded fragment's media
     * frames and their timestamps.
     * </p>
     * <note>
     * <p>
     * After the first media fragment is made available in a streaming session,
     * any fragments that don't contain the same codec private data cause an
     * error to be returned when those different media fragments are loaded.
     * Therefore, the codec private data should not change between fragments in
     * a session. This also means that the session fails if the fragments in a
     * stream change from having only video to having both audio and video.
     * </p>
     * </note>
     * <p>
     * Data retrieved with this action is billable. See <a
     * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Pricing</a>
     * for details.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GetTSFragment:</b> Retrieves MPEG TS fragments containing both
     * initialization and media data for all tracks in the stream.
     * </p>
     * <note>
     * <p>
     * If the <code>ContainerFormat</code> is <code>MPEG_TS</code>, this API is
     * used instead of <code>GetMP4InitFragment</code> and
     * <code>GetMP4MediaFragment</code> to retrieve stream media.
     * </p>
     * </note>
     * <p>
     * Data retrieved with this action is billable. For more information, see <a
     * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Kinesis
     * Video Streams pricing</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <note>
     * <p>
     * The following restrictions apply to HLS sessions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A streaming session URL should not be shared between players. The service
     * might throttle a session if multiple media players are sharing it. For
     * connection limits, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     * >Kinesis Video Streams Limits</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Kinesis video stream can have a maximum of ten active HLS streaming
     * sessions. If a new session is created when the maximum number of sessions
     * is already active, the oldest (earliest created) session is closed. The
     * number of active <code>GetMedia</code> connections on a Kinesis video
     * stream does not count against this limit, and the number of active HLS
     * sessions does not count against the active <code>GetMedia</code>
     * connection limit.
     * </p>
     * <note>
     * <p>
     * The maximum limits for active HLS and MPEG-DASH streaming sessions are
     * independent of each other.
     * </p>
     * </note></li>
     * </ul>
     * </note>
     * <p>
     * You can monitor the amount of data that the media player consumes by
     * monitoring the <code>GetMP4MediaFragment.OutgoingBytes</code> Amazon
     * CloudWatch metric. For information about using CloudWatch to monitor
     * Kinesis Video Streams, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/monitoring.html"
     * >Monitoring Kinesis Video Streams</a>. For pricing information, see <a
     * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Amazon
     * Kinesis Video Streams Pricing</a> and <a
     * href="https://aws.amazon.com/pricing/">AWS Pricing</a>. Charges for both
     * HLS sessions and outgoing AWS data apply.
     * </p>
     * <p>
     * For more information about HLS, see <a
     * href="https://developer.apple.com/streaming/">HTTP Live Streaming</a> on
     * the <a href="https://developer.apple.com">Apple Developer site</a>.
     * </p>
     * <important>
     * <p>
     * If an error is thrown after invoking a Kinesis Video Streams archived
     * media API, in addition to the HTTP status code and the response body, it
     * includes the following pieces of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error
     * type in addition to what the HTTP status code provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue
     * to AWS, the support team can better diagnose the problem if given the
     * Request Id.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both the HTTP status code and the ErrorType header can be utilized to
     * make programmatic decisions about whether errors are retry-able and under
     * what conditions, as well as provide information on what actions the
     * client programmer might need to take in order to successfully try again.
     * </p>
     * <p>
     * For more information, see the <b>Errors</b> section at the bottom of this
     * topic, as well as <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     * </important>
     * 
     * @param getHLSStreamingSessionURLRequest
     * @return getHLSStreamingSessionURLResult The response from the
     *         GetHLSStreamingSessionURL service method, as returned by Amazon
     *         Kinesis Video Streams Archived Media.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws UnsupportedStreamMediaTypeException
     * @throws NoDataRetentionException
     * @throws MissingCodecPrivateDataException
     * @throws InvalidCodecPrivateDataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Streams Archived Media indicating either a
     *             problem with the data in the request, or a server side issue.
     */
    public GetHLSStreamingSessionURLResult getHLSStreamingSessionURL(
            GetHLSStreamingSessionURLRequest getHLSStreamingSessionURLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getHLSStreamingSessionURLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHLSStreamingSessionURLRequest> request = null;
        Response<GetHLSStreamingSessionURLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHLSStreamingSessionURLRequestMarshaller()
                        .marshall(getHLSStreamingSessionURLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetHLSStreamingSessionURLResult, JsonUnmarshallerContext> unmarshaller = new GetHLSStreamingSessionURLResultJsonUnmarshaller();
            JsonResponseHandler<GetHLSStreamingSessionURLResult> responseHandler = new JsonResponseHandler<GetHLSStreamingSessionURLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets media for a list of fragments (specified by fragment number) from
     * the archived data in an Amazon Kinesis video stream.
     * </p>
     * <note>
     * <p>
     * You must first call the <code>GetDataEndpoint</code> API to get an
     * endpoint. Then send the <code>GetMediaForFragmentList</code> requests to
     * this endpoint using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/">--endpoint-url
     * parameter</a>.
     * </p>
     * </note>
     * <p>
     * The following limits apply when using the
     * <code>GetMediaForFragmentList</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>GetMediaForFragmentList</code> up to five times
     * per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams sends media data at a rate of up to 25 megabytes
     * per second (or 200 megabits per second) during a
     * <code>GetMediaForFragmentList</code> session.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If an error is thrown after invoking a Kinesis Video Streams archived
     * media API, in addition to the HTTP status code and the response body, it
     * includes the following pieces of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error
     * type in addition to what the HTTP status code provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue
     * to AWS, the support team can better diagnose the problem if given the
     * Request Id.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both the HTTP status code and the ErrorType header can be utilized to
     * make programmatic decisions about whether errors are retry-able and under
     * what conditions, as well as provide information on what actions the
     * client programmer might need to take in order to successfully try again.
     * </p>
     * <p>
     * For more information, see the <b>Errors</b> section at the bottom of this
     * topic, as well as <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     * </important>
     * 
     * @param getMediaForFragmentListRequest
     * @return getMediaForFragmentListResult The response from the
     *         GetMediaForFragmentList service method, as returned by Amazon
     *         Kinesis Video Streams Archived Media.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Streams Archived Media indicating either a
     *             problem with the data in the request, or a server side issue.
     */
    public GetMediaForFragmentListResult getMediaForFragmentList(
            GetMediaForFragmentListRequest getMediaForFragmentListRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMediaForFragmentListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMediaForFragmentListRequest> request = null;
        Response<GetMediaForFragmentListResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMediaForFragmentListRequestMarshaller()
                        .marshall(getMediaForFragmentListRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMediaForFragmentListResult, JsonUnmarshallerContext> unmarshaller = new GetMediaForFragmentListResultJsonUnmarshaller();
            JsonResponseHandler<GetMediaForFragmentListResult> responseHandler = new JsonResponseHandler<GetMediaForFragmentListResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of <a>Fragment</a> objects from the specified stream and
     * timestamp range within the archived data.
     * </p>
     * <p>
     * Listing fragments is eventually consistent. This means that even if the
     * producer receives an acknowledgment that a fragment is persisted, the
     * result might not be returned immediately from a request to
     * <code>ListFragments</code>. However, results are typically available in
     * less than one second.
     * </p>
     * <note>
     * <p>
     * You must first call the <code>GetDataEndpoint</code> API to get an
     * endpoint. Then send the <code>ListFragments</code> requests to this
     * endpoint using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/">--endpoint-url
     * parameter</a>.
     * </p>
     * </note> <important>
     * <p>
     * If an error is thrown after invoking a Kinesis Video Streams archived
     * media API, in addition to the HTTP status code and the response body, it
     * includes the following pieces of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error
     * type in addition to what the HTTP status code provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue
     * to AWS, the support team can better diagnose the problem if given the
     * Request Id.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both the HTTP status code and the ErrorType header can be utilized to
     * make programmatic decisions about whether errors are retry-able and under
     * what conditions, as well as provide information on what actions the
     * client programmer might need to take in order to successfully try again.
     * </p>
     * <p>
     * For more information, see the <b>Errors</b> section at the bottom of this
     * topic, as well as <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     * </important>
     * 
     * @param listFragmentsRequest
     * @return listFragmentsResult The response from the ListFragments service
     *         method, as returned by Amazon Kinesis Video Streams Archived
     *         Media.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Video Streams Archived Media indicating either a
     *             problem with the data in the request, or a server side issue.
     */
    public ListFragmentsResult listFragments(ListFragmentsRequest listFragmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFragmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFragmentsRequest> request = null;
        Response<ListFragmentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFragmentsRequestMarshaller().marshall(listFragmentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFragmentsResult, JsonUnmarshallerContext> unmarshaller = new ListFragmentsResultJsonUnmarshaller();
            JsonResponseHandler<ListFragmentsResult> responseHandler = new JsonResponseHandler<ListFragmentsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
