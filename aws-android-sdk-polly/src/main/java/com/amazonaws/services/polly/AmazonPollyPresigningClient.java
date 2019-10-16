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

package com.amazonaws.services.polly;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Presigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.services.polly.internal.AmazonPollyCustomPresigner;
import com.amazonaws.services.polly.internal.PresigningRequest;
import com.amazonaws.services.polly.internal.ServiceUtils;
import com.amazonaws.services.polly.model.SynthesizeSpeechPresignRequest;
import com.amazonaws.services.polly.model.transform.SynthesizeSpeechPresignRequestMarshaller;

import java.net.URL;
import java.util.Date;

/**
 * Client for accessing Amazon Polly. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from
 * text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing
 * high-quality speech from plain text and Speech Synthesis Markup Language
 * (SSML), along with managing pronunciations lexicons that enable you to get
 * the best results for your application domain.
 * </p>
 */
public class AmazonPollyPresigningClient extends AmazonPollyClient implements AmazonPolly {
    private static final int DEFAULT_GET_REQUEST_EXPIRATION_MINUTES = 15;

    static{
        SignerFactory.registerSigner("AmazonPollyCustomPresigner", AmazonPollyCustomPresigner.class);
    }
    
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider.
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
     *         AmazonPollyPresigningClient client = new AmazonPollyPresigningClient(AWSMobileClient.getInstance());
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
    public AmazonPollyPresigningClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider and client configuration
     * options.
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
     *         AmazonPollyPresigningClient client = new AmazonPollyPresigningClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonPollyPresigningClient(AWSCredentialsProvider awsCredentialsProvider,
                              ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonPollyPresigningClient(AWSCredentialsProvider awsCredentialsProvider,
                              ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(awsCredentialsProvider, clientConfiguration, httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;
    }

    /**
     * <p>
     * Returns a pre-signed URL for accessing an Amazon Polly resource.
     * </p>
     * <p>
     * Pre-signed URLs allow clients to form a URL for an Amazon Polly
     * resource, and then sign it with the current AWS security credentials.
     * The pre-signed URL can be shared to other users, allowing access to
     * the resource without providing an account's AWS security credentials.
     * </p>
     * <p>
     * Pre-signed URLs are useful in many situations where AWS security
     * credentials aren't available from the client that needs to make the
     * actual request to Amazon Polly.
     * </p>
     * <p>
     * For example, a pre-signed URL to GET the synthesized speech audio stream
     * using the owner's AWS account can be generated and passed to a system
     * media player.
     * </p>
     *
     * @param synthesizeSpeechPresignRequest Object providing pre-signed synthesize speech
     *              request parameters.
     * @return Pre-signed URL of audio stream containing synthesized speech
     *              matching parameters provided in synthesizeSpeechPresignRequest
     *              that is possible to obtain using HTTP GET method.
     */
    public URL getPresignedSynthesizeSpeechUrl(SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest) {
        Request<PresigningRequest> request = new SynthesizeSpeechPresignRequestMarshaller()
                .marshall(synthesizeSpeechPresignRequest);

        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        if (synthesizeSpeechPresignRequest.getExpiration() == null) {
            synthesizeSpeechPresignRequest.setExpiration(
                    new Date(System.currentTimeMillis() + 1000 * 60 * DEFAULT_GET_REQUEST_EXPIRATION_MINUTES));
        }

        Signer signer = getSignerByURI(endpoint);
        if (!(signer instanceof Presigner)) {
            throw new AmazonClientException("Unsupported signer");
        }

        Presigner presigner = (Presigner) signer;
        Date expirationDate = synthesizeSpeechPresignRequest.getExpiration();
        AWSCredentials credentials = synthesizeSpeechPresignRequest.getRequestCredentials();
        if (credentials == null) {
            credentials = awsCredentialsProvider.getCredentials();
        }
        presigner.presignRequest(request, credentials, expirationDate);

        // Remove the leading slash (if any) in the resource-path
        return ServiceUtils.convertRequestToUrl(request, true);
    }
}
