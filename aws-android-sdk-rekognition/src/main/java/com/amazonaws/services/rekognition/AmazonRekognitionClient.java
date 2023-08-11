/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition;

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

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.services.rekognition.model.transform.*;

/**
 * Client for accessing Amazon Rekognition. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * This is the API Reference for <a
 * href="https://docs.aws.amazon.com/rekognition/latest/dg/images.html">Amazon
 * Rekognition Image</a>, <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/what-is.html"
 * >Amazon Rekognition Custom Labels</a>, <a
 * href="https://docs.aws.amazon.com/rekognition/latest/dg/video.html">Amazon
 * Rekognition Stored Video</a>, <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/dg/streaming-video.html"
 * >Amazon Rekognition Streaming Video</a>. It provides descriptions of actions,
 * data types, common parameters, and common errors.
 * </p>
 * <p>
 * <b>Amazon Rekognition Image</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_AssociateFaces.html"
 * >AssociateFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CompareFaces.html"
 * >CompareFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateCollection.html"
 * >CreateCollection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateUser.html"
 * >CreateUser</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteCollection.html"
 * >DeleteCollection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteFaces.html"
 * >DeleteFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteUser.html"
 * >DeleteUser</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeCollection.html"
 * >DescribeCollection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectFaces.html"
 * >DetectFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectLabels.html"
 * >DetectLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectModerationLabels.html"
 * >DetectModerationLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectProtectiveEquipment.html"
 * >DetectProtectiveEquipment</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectText.html"
 * >DetectText</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DisassociateFaces.html"
 * >DisassociateFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetCelebrityInfo.html"
 * >GetCelebrityInfo</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_IndexFaces.html"
 * >IndexFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListCollections.html"
 * >ListCollections</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListFaces.html"
 * >ListFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListFaces.html"
 * >ListUsers</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RecognizeCelebrities.html"
 * >RecognizeCelebrities</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_SearchFaces.html"
 * >SearchFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_SearchFacesByImage.html"
 * >SearchFacesByImage</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_SearchUsers.html"
 * >SearchUsers</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_SearchUsersByImage.html"
 * >SearchUsersByImage</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Rekognition Custom Labels</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CopyProjectVersion.html"
 * >CopyProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateDataset.html"
 * >CreateDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateProject.html"
 * >CreateProject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateProjectVersion.html"
 * >CreateProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteDataset.html"
 * >DeleteDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteProject.html"
 * >DeleteProject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteProjectPolicy.html"
 * >DeleteProjectPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteProjectVersion.html"
 * >DeleteProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeDataset.html"
 * >DescribeDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeProjects.html"
 * >DescribeProjects</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeProjectVersions.html"
 * >DescribeProjectVersions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectCustomLabels.html"
 * >DetectCustomLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DistributeDatasetEntries.html"
 * >DistributeDatasetEntries</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListDatasetEntries.html"
 * >ListDatasetEntries</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListDatasetLabels.html"
 * >ListDatasetLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListProjectPolicies.html"
 * >ListProjectPolicies</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_PutProjectPolicy.html"
 * >PutProjectPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartProjectVersion.html"
 * >StartProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StopProjectVersion.html"
 * >StopProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_UpdateDatasetEntries.html"
 * >UpdateDatasetEntries</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Rekognition Video Stored Video</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetCelebrityRecognition.html"
 * >GetCelebrityRecognition</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetContentModeration.html"
 * >GetContentModeration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetFaceDetection.html"
 * >GetFaceDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetFaceSearch.html"
 * >GetFaceSearch</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetLabelDetection.html"
 * >GetLabelDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetPersonTracking.html"
 * >GetPersonTracking</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetSegmentDetection.html"
 * >GetSegmentDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetTextDetection.html"
 * >GetTextDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartCelebrityRecognition.html"
 * >StartCelebrityRecognition</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartContentModeration.html"
 * >StartContentModeration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartFaceDetection.html"
 * >StartFaceDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartFaceSearch.html"
 * >StartFaceSearch</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartLabelDetection.html"
 * >StartLabelDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartPersonTracking.html"
 * >StartPersonTracking</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartSegmentDetection.html"
 * >StartSegmentDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartTextDetection.html"
 * >StartTextDetection</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Rekognition Video Streaming Video</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor.html"
 * >CreateStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteStreamProcessor.html"
 * >DeleteStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeStreamProcessor.html"
 * >DescribeStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListStreamProcessors.html"
 * >ListStreamProcessors</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartStreamProcessor.html"
 * >StartStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StopStreamProcessor.html"
 * >StopStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/APIReference/API_UpdateStreamProcessor.html"
 * >UpdateStreamProcessor</a>
 * </p>
 * </li>
 * </ul>
 */
public class AmazonRekognitionClient extends AmazonWebServiceClient implements AmazonRekognition {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Rekognition exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonRekognitionClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRekognitionClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials.
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
     *         AmazonRekognitionClient client = new AmazonRekognitionClient(AWSMobileClient.getInstance());
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
    public AmazonRekognitionClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials and client configuration
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
     *         AmazonRekognitionClient client = new AmazonRekognitionClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRekognitionClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials provider.
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
     *         AmazonRekognitionClient client = new AmazonRekognitionClient(AWSMobileClient.getInstance());
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
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *         AmazonRekognitionClient client = new AmazonRekognitionClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
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
     *         AmazonRekognitionClient client = new AmazonRekognitionClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HumanLoopQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ImageTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidImageFormatExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPaginationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPolicyRevisionIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidS3ObjectExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotReadyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SessionNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VideoTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("rekognition.us-east-1.amazonaws.com");
        this.endpointPrefix = "rekognition";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/rekognition/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/rekognition/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates one or more faces with an existing UserID. Takes an array of
     * <code>FaceIds</code>. Each <code>FaceId</code> that are present in the
     * <code>FaceIds</code> list is associated with the provided UserID. The
     * maximum number of total <code>FaceIds</code> per UserID is 100.
     * </p>
     * <p>
     * The <code>UserMatchThreshold</code> parameter specifies the minimum user
     * match confidence required for the face to be associated with a UserID
     * that has at least one <code>FaceID</code> already associated. This
     * ensures that the <code>FaceIds</code> are associated with the right
     * UserID. The value ranges from 0-100 and default value is 75.
     * </p>
     * <p>
     * If successful, an array of <code>AssociatedFace</code> objects containing
     * the associated <code>FaceIds</code> is returned. If a given face is
     * already associated with the given <code>UserID</code>, it will be ignored
     * and will not be returned in the response. If a given face is already
     * associated to a different <code>UserID</code>, isn't found in the
     * collection, doesn’t meet the <code>UserMatchThreshold</code>, or there
     * are already 100 faces associated with the <code>UserID</code>, it will be
     * returned as part of an array of
     * <code>UnsuccessfulFaceAssociations.</code>
     * </p>
     * <p>
     * The <code>UserStatus</code> reflects the status of an operation which
     * updates a UserID representation with a list of given faces. The
     * <code>UserStatus</code> can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVE - All associations or disassociations of FaceID(s) for a UserID
     * are complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATED - A UserID has been created, but has no FaceID(s) associated with
     * it.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING - A UserID is being updated and there are current associations
     * or disassociations of FaceID(s) taking place.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateFacesRequest
     * @return associateFacesResult The response from the AssociateFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws IdempotentParameterMismatchException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateFacesResult associateFaces(AssociateFacesRequest associateFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateFacesRequest> request = null;
        Response<AssociateFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateFacesRequestMarshaller().marshall(associateFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateFacesResult, JsonUnmarshallerContext> unmarshaller = new AssociateFacesResultJsonUnmarshaller();
            JsonResponseHandler<AssociateFacesResult> responseHandler = new JsonResponseHandler<AssociateFacesResult>(
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
     * Compares a face in the <i>source</i> input image with each of the 100
     * largest faces detected in the <i>target</i> input image.
     * </p>
     * <p>
     * If the source image contains multiple faces, the service detects the
     * largest face and compares it with each face detected in the target image.
     * </p>
     * <note>
     * <p>
     * CompareFaces uses machine learning algorithms, which are probabilistic. A
     * false negative is an incorrect prediction that a face in the target image
     * has a low similarity confidence score when compared to the face in the
     * source image. To reduce the probability of false negatives, we recommend
     * that you compare the target image against multiple source images. If you
     * plan to use <code>CompareFaces</code> to make a decision that impacts an
     * individual's rights, privacy, or access to services, we recommend that
     * you pass the result to a human for review and further validation before
     * taking action.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes
     * or as references to images in an Amazon S3 bucket. If you use the AWS CLI
     * to call Amazon Rekognition operations, passing image bytes isn't
     * supported. The image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by
     * similarity score in descending order. For each face match, the response
     * provides a bounding box of the face, facial landmarks, pose details
     * (pitch, roll, and yaw), quality (brightness and sharpness), and
     * confidence value (indicating the level of confidence that the bounding
     * box contains a face). The response also provides a similarity score,
     * which indicates how closely the faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal
     * to 80% are returned in the response. You can change this value by
     * specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match
     * the source image. For each face, it returns a bounding box, confidence
     * value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding
     * box of the face and confidence value.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out
     * detected faces that don’t meet a required quality bar. The quality bar is
     * based on a variety of common use cases. Use <code>QualityFilter</code> to
     * set the quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>,
     * or <code>HIGH</code>. If you do not want to filter detected faces,
     * specify <code>NONE</code>. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code>
     * returns orientation information for the source and target images. Use
     * these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images,
     * <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this
     * operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see Comparing Faces in Images in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @return compareFacesResult The response from the CompareFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CompareFacesResult compareFaces(CompareFacesRequest compareFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(compareFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompareFacesRequest> request = null;
        Response<CompareFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompareFacesRequestMarshaller().marshall(compareFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CompareFacesResult, JsonUnmarshallerContext> unmarshaller = new CompareFacesResultJsonUnmarshaller();
            JsonResponseHandler<CompareFacesResult> responseHandler = new JsonResponseHandler<CompareFacesResult>(
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
     * Copies a version of an Amazon Rekognition Custom Labels model from a
     * source project to a destination project. The source and destination
     * projects can be in different AWS accounts but must be in the same AWS
     * Region. You can't copy a model to another AWS service.
     * </p>
     * <p>
     * To copy a model version to a different AWS account, you need to create a
     * resource-based policy known as a <i>project policy</i>. You attach the
     * project policy to the source project by calling <a>PutProjectPolicy</a>.
     * The project policy gives permission to copy the model version from a
     * trusting AWS account to a trusted account.
     * </p>
     * <p>
     * For more information creating and attaching a project policy, see
     * Attaching a project policy (SDK) in the <i>Amazon Rekognition Custom
     * Labels Developer Guide</i>.
     * </p>
     * <p>
     * If you are copying a model version to a project in the same AWS account,
     * you don't need to create a project policy.
     * </p>
     * <note>
     * <p>
     * To copy a model, the destination project, source project, and source
     * model version must already exist.
     * </p>
     * </note>
     * <p>
     * Copying a model version takes a while to complete. To get the current
     * status, call <a>DescribeProjectVersions</a> and check the value of
     * <code>Status</code> in the <a>ProjectVersionDescription</a> object. The
     * copy operation has finished when the value of <code>Status</code> is
     * <code>COPYING_COMPLETED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CopyProjectVersion</code> action.
     * </p>
     * 
     * @param copyProjectVersionRequest
     * @return copyProjectVersionResult The response from the CopyProjectVersion
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CopyProjectVersionResult copyProjectVersion(
            CopyProjectVersionRequest copyProjectVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyProjectVersionRequest> request = null;
        Response<CopyProjectVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyProjectVersionRequestMarshaller()
                        .marshall(copyProjectVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CopyProjectVersionResult, JsonUnmarshallerContext> unmarshaller = new CopyProjectVersionResultJsonUnmarshaller();
            JsonResponseHandler<CopyProjectVersionResult> responseHandler = new JsonResponseHandler<CopyProjectVersionResult>(
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
     * Creates a collection in an AWS Region. You can add faces to the
     * collection using the <a>IndexFaces</a> operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your
     * application users. A user can then index faces using the
     * <code>IndexFaces</code> operation and persist results in a specific
     * collection. Then, a user can search the collection for faces in the
     * user-specific container.
     * </p>
     * <p>
     * When you create a collection, it is associated with the latest version of
     * the face model version.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateCollection</code> action. If you want to tag your
     * collection, you also require permission to perform the
     * <code>rekognition:TagResource</code> operation.
     * </p>
     * 
     * @param createCollectionRequest
     * @return createCollectionResult The response from the CreateCollection
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCollectionResult createCollection(CreateCollectionRequest createCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCollectionRequest> request = null;
        Response<CreateCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCollectionRequestMarshaller().marshall(createCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCollectionResult, JsonUnmarshallerContext> unmarshaller = new CreateCollectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateCollectionResult> responseHandler = new JsonResponseHandler<CreateCollectionResult>(
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
     * Creates a new Amazon Rekognition Custom Labels dataset. You can create a
     * dataset by using an Amazon Sagemaker format manifest file or by copying
     * an existing Amazon Rekognition Custom Labels dataset.
     * </p>
     * <p>
     * To create a training dataset for a project, specify <code>TRAIN</code>
     * for the value of <code>DatasetType</code>. To create the test dataset for
     * a project, specify <code>TEST</code> for the value of
     * <code>DatasetType</code>.
     * </p>
     * <p>
     * The response from <code>CreateDataset</code> is the Amazon Resource Name
     * (ARN) for the dataset. Creating a dataset takes a while to complete. Use
     * <a>DescribeDataset</a> to check the current status. The dataset created
     * successfully if the value of <code>Status</code> is
     * <code>CREATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occurred, call
     * <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset creation fails if a terminal error occurs (<code>Status</code> =
     * <code>CREATE_FAILED</code>). Currently, you can't access the terminal
     * error information.
     * </p>
     * <p>
     * For more information, see Creating dataset in the <i>Amazon Rekognition
     * Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateDataset</code> action. If you want to copy an
     * existing dataset, you also require permission to perform the
     * <code>rekognition:ListDatasetEntries</code> action.
     * </p>
     * 
     * @param createDatasetRequest
     * @return createDatasetResult The response from the CreateDataset service
     *         method, as returned by Amazon Rekognition.
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws LimitExceededException
     * @throws InvalidS3ObjectException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestMarshaller().marshall(createDatasetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDatasetResult, JsonUnmarshallerContext> unmarshaller = new CreateDatasetResultJsonUnmarshaller();
            JsonResponseHandler<CreateDatasetResult> responseHandler = new JsonResponseHandler<CreateDatasetResult>(
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
     * This API operation initiates a Face Liveness session. It returns a
     * <code>SessionId</code>, which you can use to start streaming Face
     * Liveness video and get the results for a Face Liveness session.
     * </p>
     * <p>
     * You can use the <code>OutputConfig</code> option in the Settings
     * parameter to provide an Amazon S3 bucket location. The Amazon S3 bucket
     * stores reference images and audit images. If no Amazon S3 bucket is
     * defined, raw bytes are sent instead.
     * </p>
     * <p>
     * You can use <code>AuditImagesLimit</code> to limit the number of audit
     * images returned when <code>GetFaceLivenessSessionResults</code> is
     * called. This number is between 0 and 4. By default, it is set to 0. The
     * limit is best effort and based on the duration of the selfie-video.
     * </p>
     * 
     * @param createFaceLivenessSessionRequest
     * @return createFaceLivenessSessionResult The response from the
     *         CreateFaceLivenessSession service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateFaceLivenessSessionResult createFaceLivenessSession(
            CreateFaceLivenessSessionRequest createFaceLivenessSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFaceLivenessSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFaceLivenessSessionRequest> request = null;
        Response<CreateFaceLivenessSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFaceLivenessSessionRequestMarshaller()
                        .marshall(createFaceLivenessSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFaceLivenessSessionResult, JsonUnmarshallerContext> unmarshaller = new CreateFaceLivenessSessionResultJsonUnmarshaller();
            JsonResponseHandler<CreateFaceLivenessSessionResult> responseHandler = new JsonResponseHandler<CreateFaceLivenessSessionResult>(
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
     * Creates a new Amazon Rekognition Custom Labels project. A project is a
     * group of resources (datasets, model versions) that you use to create and
     * manage Amazon Rekognition Custom Labels models.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateProject</code> action.
     * </p>
     * 
     * @param createProjectRequest
     * @return createProjectResult The response from the CreateProject service
     *         method, as returned by Amazon Rekognition.
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProjectResult createProject(CreateProjectRequest createProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestMarshaller().marshall(createProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProjectResult, JsonUnmarshallerContext> unmarshaller = new CreateProjectResultJsonUnmarshaller();
            JsonResponseHandler<CreateProjectResult> responseHandler = new JsonResponseHandler<CreateProjectResult>(
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
     * Creates a new version of a model and begins training. Models are managed
     * as part of an Amazon Rekognition Custom Labels project. The response from
     * <code>CreateProjectVersion</code> is an Amazon Resource Name (ARN) for
     * the version of the model.
     * </p>
     * <p>
     * Training uses the training and test datasets associated with the project.
     * For more information, see Creating training and test dataset in the
     * <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can train a model in a project that doesn't have associated datasets
     * by specifying manifest files in the <code>TrainingData</code> and
     * <code>TestingData</code> fields.
     * </p>
     * <p>
     * If you open the console after training a model with manifest files,
     * Amazon Rekognition Custom Labels creates the datasets for you using the
     * most recent manifest files. You can no longer train a model version for
     * the project by specifying manifest files.
     * </p>
     * <p>
     * Instead of training with a project without associated datasets, we
     * recommend that you use the manifest files to create training and test
     * datasets for the project.
     * </p>
     * </note>
     * <p>
     * Training takes a while to complete. You can get the current status by
     * calling <a>DescribeProjectVersions</a>. Training completed successfully
     * if the value of the <code>Status</code> field is
     * <code>TRAINING_COMPLETED</code>.
     * </p>
     * <p>
     * If training fails, see Debugging a failed model training in the <i>Amazon
     * Rekognition Custom Labels</i> developer guide.
     * </p>
     * <p>
     * Once training has successfully completed, call
     * <a>DescribeProjectVersions</a> to get the training results and evaluate
     * the model. For more information, see Improving a trained Amazon
     * Rekognition Custom Labels model in the <i>Amazon Rekognition Custom
     * Labels</i> developers guide.
     * </p>
     * <p>
     * After evaluating the model, you start the model by calling
     * <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateProjectVersion</code> action.
     * </p>
     * 
     * @param createProjectVersionRequest
     * @return createProjectVersionResult The response from the
     *         CreateProjectVersion service method, as returned by Amazon
     *         Rekognition.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProjectVersionResult createProjectVersion(
            CreateProjectVersionRequest createProjectVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectVersionRequest> request = null;
        Response<CreateProjectVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectVersionRequestMarshaller()
                        .marshall(createProjectVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProjectVersionResult, JsonUnmarshallerContext> unmarshaller = new CreateProjectVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreateProjectVersionResult> responseHandler = new JsonResponseHandler<CreateProjectVersionResult>(
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
     * Creates an Amazon Rekognition stream processor that you can use to detect
     * and recognize faces or to detect labels in a streaming video.
     * </p>
     * <p>
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis
     * Video Streams. There are two different settings for stream processors in
     * Amazon Rekognition: detecting faces and detecting labels.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are creating a stream processor for detecting faces, you provide
     * as input a Kinesis video stream (<code>Input</code>) and a Kinesis data
     * stream (<code>Output</code>) stream for receiving the output. You must
     * use the <code>FaceSearch</code> option in <code>Settings</code>,
     * specifying the collection that contains the faces you want to recognize.
     * After you have finished analyzing a streaming video, use
     * <a>StopStreamProcessor</a> to stop processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are creating a stream processor to detect labels, you provide as
     * input a Kinesis video stream (<code>Input</code>), Amazon S3 bucket
     * information (<code>Output</code>), and an Amazon SNS topic ARN (
     * <code>NotificationChannel</code>). You can also provide a KMS key ID to
     * encrypt the data sent to your Amazon S3 bucket. You specify what you want
     * to detect by using the <code>ConnectedHome</code> option in settings, and
     * selecting one of the following: <code>PERSON</code>, <code>PET</code>,
     * <code>PACKAGE</code>, <code>ALL</code> You can also specify where in the
     * frame you want Amazon Rekognition to monitor with
     * <code>RegionsOfInterest</code>. When you run the
     * <a>StartStreamProcessor</a> operation on a label detection stream
     * processor, you input start and stop information to determine the length
     * of the processing time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>Name</code> to assign an identifier for the stream processor.
     * You use <code>Name</code> to manage the stream processor. For example,
     * you can start processing the source video by calling
     * <a>StartStreamProcessor</a> with the <code>Name</code> field.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateStreamProcessor</code> action. If you want to tag
     * your stream processor, you also require permission to perform the
     * <code>rekognition:TagResource</code> operation.
     * </p>
     * 
     * @param createStreamProcessorRequest
     * @return createStreamProcessorResult The response from the
     *         CreateStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateStreamProcessorResult createStreamProcessor(
            CreateStreamProcessorRequest createStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamProcessorRequest> request = null;
        Response<CreateStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamProcessorRequestMarshaller()
                        .marshall(createStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new CreateStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<CreateStreamProcessorResult> responseHandler = new JsonResponseHandler<CreateStreamProcessorResult>(
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
     * Creates a new User within a collection specified by
     * <code>CollectionId</code>. Takes <code>UserId</code> as a parameter,
     * which is a user provided ID which should be unique within the collection.
     * The provided <code>UserId</code> will alias the system generated UUID to
     * make the <code>UserId</code> more user friendly.
     * </p>
     * <p>
     * Uses a <code>ClientToken</code>, an idempotency token that ensures a call
     * to <code>CreateUser</code> completes only once. If the value is not
     * supplied, the AWS SDK generates an idempotency token for the requests.
     * This prevents retries after a network error results from making multiple
     * <code>CreateUser</code> calls.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ProvisionedThroughputExceededException
     * @throws IdempotentParameterMismatchException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUserResult createUser(CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(createUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserResult, JsonUnmarshallerContext> unmarshaller = new CreateUserResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserResult> responseHandler = new JsonResponseHandler<CreateUserResult>(
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
     * Deletes the specified collection. Note that this operation removes all
     * faces in the collection. For an example, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/delete-collection-procedure.html"
     * >Deleting a collection</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return deleteCollectionResult The response from the DeleteCollection
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCollectionResult deleteCollection(DeleteCollectionRequest deleteCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCollectionRequest> request = null;
        Response<DeleteCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCollectionRequestMarshaller().marshall(deleteCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCollectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteCollectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCollectionResult> responseHandler = new JsonResponseHandler<DeleteCollectionResult>(
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
     * Deletes an existing Amazon Rekognition Custom Labels dataset. Deleting a
     * dataset might take while. Use <a>DescribeDataset</a> to check the current
     * status. The dataset is still deleting if the value of <code>Status</code>
     * is <code>DELETE_IN_PROGRESS</code>. If you try to access the dataset
     * after it is deleted, you get a <code>ResourceNotFoundException</code>
     * exception.
     * </p>
     * <p>
     * You can't delete a dataset while it is creating (<code>Status</code> =
     * <code>CREATE_IN_PROGRESS</code>) or if the dataset is updating (
     * <code>Status</code> = <code>UPDATE_IN_PROGRESS</code>).
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteDataset</code> action.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return deleteDatasetResult The response from the DeleteDataset service
     *         method, as returned by Amazon Rekognition.
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestMarshaller().marshall(deleteDatasetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDatasetResult, JsonUnmarshallerContext> unmarshaller = new DeleteDatasetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDatasetResult> responseHandler = new JsonResponseHandler<DeleteDatasetResult>(
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
     * Deletes faces from a collection. You specify a collection ID and an array
     * of face IDs to remove from the collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @return deleteFacesResult The response from the DeleteFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteFacesResult deleteFaces(DeleteFacesRequest deleteFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFacesRequest> request = null;
        Response<DeleteFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFacesRequestMarshaller().marshall(deleteFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFacesResult, JsonUnmarshallerContext> unmarshaller = new DeleteFacesResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFacesResult> responseHandler = new JsonResponseHandler<DeleteFacesResult>(
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
     * Deletes an Amazon Rekognition Custom Labels project. To delete a project
     * you must first delete all models associated with the project. To delete a
     * model, see <a>DeleteProjectVersion</a>.
     * </p>
     * <p>
     * <code>DeleteProject</code> is an asynchronous operation. To check if the
     * project is deleted, call <a>DescribeProjects</a>. The project is deleted
     * when the project no longer appears in the response. Be aware that
     * deleting a given project will also delete any
     * <code>ProjectPolicies</code> associated with that project.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteProject</code> action.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return deleteProjectResult The response from the DeleteProject service
     *         method, as returned by Amazon Rekognition.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestMarshaller().marshall(deleteProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProjectResult, JsonUnmarshallerContext> unmarshaller = new DeleteProjectResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProjectResult> responseHandler = new JsonResponseHandler<DeleteProjectResult>(
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
     * Deletes an existing project policy.
     * </p>
     * <p>
     * To get a list of project policies attached to a project, call
     * <a>ListProjectPolicies</a>. To attach a project policy to a project, call
     * <a>PutProjectPolicy</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteProjectPolicy</code> action.
     * </p>
     * 
     * @param deleteProjectPolicyRequest
     * @return deleteProjectPolicyResult The response from the
     *         DeleteProjectPolicy service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidPolicyRevisionIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProjectPolicyResult deleteProjectPolicy(
            DeleteProjectPolicyRequest deleteProjectPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProjectPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectPolicyRequest> request = null;
        Response<DeleteProjectPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectPolicyRequestMarshaller()
                        .marshall(deleteProjectPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProjectPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteProjectPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProjectPolicyResult> responseHandler = new JsonResponseHandler<DeleteProjectPolicyResult>(
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
     * Deletes an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You can't delete a model if it is running or if it is training. To check
     * the status of a model, use the <code>Status</code> field returned from
     * <a>DescribeProjectVersions</a>. To stop a running model call
     * <a>StopProjectVersion</a>. If the model is training, wait until it
     * finishes.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteProjectVersion</code> action.
     * </p>
     * 
     * @param deleteProjectVersionRequest
     * @return deleteProjectVersionResult The response from the
     *         DeleteProjectVersion service method, as returned by Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProjectVersionResult deleteProjectVersion(
            DeleteProjectVersionRequest deleteProjectVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectVersionRequest> request = null;
        Response<DeleteProjectVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectVersionRequestMarshaller()
                        .marshall(deleteProjectVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProjectVersionResult, JsonUnmarshallerContext> unmarshaller = new DeleteProjectVersionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProjectVersionResult> responseHandler = new JsonResponseHandler<DeleteProjectVersionResult>(
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
     * Deletes the stream processor identified by <code>Name</code>. You assign
     * the value for <code>Name</code> when you create the stream processor with
     * <a>CreateStreamProcessor</a>. You might not be able to use the same name
     * for a stream processor for a few seconds after calling
     * <code>DeleteStreamProcessor</code>.
     * </p>
     * 
     * @param deleteStreamProcessorRequest
     * @return deleteStreamProcessorResult The response from the
     *         DeleteStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteStreamProcessorResult deleteStreamProcessor(
            DeleteStreamProcessorRequest deleteStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamProcessorRequest> request = null;
        Response<DeleteStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamProcessorRequestMarshaller()
                        .marshall(deleteStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new DeleteStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<DeleteStreamProcessorResult> responseHandler = new JsonResponseHandler<DeleteStreamProcessorResult>(
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
     * Deletes the specified UserID within the collection. Faces that are
     * associated with the UserID are disassociated from the UserID before
     * deleting the specified UserID. If the specified <code>Collection</code>
     * or <code>UserID</code> is already deleted or not found, a
     * <code>ResourceNotFoundException</code> will be thrown. If the action is
     * successful with a 200 response, an empty HTTP body is returned.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws IdempotentParameterMismatchException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserResult> responseHandler = new JsonResponseHandler<DeleteUserResult>(
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
     * Describes the specified collection. You can use
     * <code>DescribeCollection</code> to get information, such as the number of
     * faces indexed into a collection and the version of the model used by the
     * collection for face detection.
     * </p>
     * <p>
     * For more information, see Describing a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param describeCollectionRequest
     * @return describeCollectionResult The response from the DescribeCollection
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCollectionResult describeCollection(
            DescribeCollectionRequest describeCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCollectionRequest> request = null;
        Response<DescribeCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCollectionRequestMarshaller()
                        .marshall(describeCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCollectionResult, JsonUnmarshallerContext> unmarshaller = new DescribeCollectionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCollectionResult> responseHandler = new JsonResponseHandler<DescribeCollectionResult>(
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
     * Describes an Amazon Rekognition Custom Labels dataset. You can get
     * information such as the current status of a dataset and statistics about
     * the images and labels in a dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DescribeDataset</code> action.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return describeDatasetResult The response from the DescribeDataset
     *         service method, as returned by Amazon Rekognition.
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestMarshaller().marshall(describeDatasetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> unmarshaller = new DescribeDatasetResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDatasetResult> responseHandler = new JsonResponseHandler<DescribeDatasetResult>(
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
     * Lists and describes the versions of a model in an Amazon Rekognition
     * Custom Labels project. You can specify up to 10 model versions in
     * <code>ProjectVersionArns</code>. If you don't specify a value,
     * descriptions for all model versions in the project are returned.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DescribeProjectVersions</code> action.
     * </p>
     * 
     * @param describeProjectVersionsRequest
     * @return describeProjectVersionsResult The response from the
     *         DescribeProjectVersions service method, as returned by Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     * @throws InvalidPaginationTokenException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeProjectVersionsResult describeProjectVersions(
            DescribeProjectVersionsRequest describeProjectVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProjectVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectVersionsRequest> request = null;
        Response<DescribeProjectVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectVersionsRequestMarshaller()
                        .marshall(describeProjectVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProjectVersionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeProjectVersionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProjectVersionsResult> responseHandler = new JsonResponseHandler<DescribeProjectVersionsResult>(
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
     * Gets information about your Amazon Rekognition Custom Labels projects.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DescribeProjects</code> action.
     * </p>
     * 
     * @param describeProjectsRequest
     * @return describeProjectsResult The response from the DescribeProjects
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidPaginationTokenException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeProjectsResult describeProjects(DescribeProjectsRequest describeProjectsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectsRequest> request = null;
        Response<DescribeProjectsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectsRequestMarshaller().marshall(describeProjectsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProjectsResult, JsonUnmarshallerContext> unmarshaller = new DescribeProjectsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProjectsResult> responseHandler = new JsonResponseHandler<DescribeProjectsResult>(
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
     * Provides information about a stream processor created by
     * <a>CreateStreamProcessor</a>. You can get information about the input and
     * output streams, the input parameters for the face recognition being
     * performed, and the current status of the stream processor.
     * </p>
     * 
     * @param describeStreamProcessorRequest
     * @return describeStreamProcessorResult The response from the
     *         DescribeStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeStreamProcessorResult describeStreamProcessor(
            DescribeStreamProcessorRequest describeStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamProcessorRequest> request = null;
        Response<DescribeStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamProcessorRequestMarshaller()
                        .marshall(describeStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new DescribeStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStreamProcessorResult> responseHandler = new JsonResponseHandler<DescribeStreamProcessorResult>(
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
     * Detects custom labels in a supplied image by using an Amazon Rekognition
     * Custom Labels model.
     * </p>
     * <p>
     * You specify which version of a model version to use by using the
     * <code>ProjectVersionArn</code> input parameter.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference
     * to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
     * Rekognition operations, passing image bytes is not supported. The image
     * must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object that the model version detects on an image, the API
     * returns a (<code>CustomLabel</code>) object in an array (
     * <code>CustomLabels</code>). Each <code>CustomLabel</code> object provides
     * the label name (<code>Name</code>), the level of confidence that the
     * image contains the object (<code>Confidence</code>), and object location
     * information, if it exists, for the label on the image (
     * <code>Geometry</code>).
     * </p>
     * <p>
     * To filter labels that are returned, specify a value for
     * <code>MinConfidence</code>. <code>DetectCustomLabelsLabels</code> only
     * returns labels with a confidence that's higher than the specified value.
     * The value of <code>MinConfidence</code> maps to the assumed threshold
     * values created during training. For more information, see <i>Assumed
     * threshold</i> in the Amazon Rekognition Custom Labels Developer Guide.
     * Amazon Rekognition Custom Labels metrics expresses an assumed threshold
     * as a floating point value between 0-1. The range of
     * <code>MinConfidence</code> normalizes the threshold value to a percentage
     * value (0-100). Confidence responses from <code>DetectCustomLabels</code>
     * are also returned as a percentage. You can use <code>MinConfidence</code>
     * to change the precision and recall or your model. For more information,
     * see <i>Analyzing an image</i> in the Amazon Rekognition Custom Labels
     * Developer Guide.
     * </p>
     * <p>
     * If you don't specify a value for <code>MinConfidence</code>,
     * <code>DetectCustomLabels</code> returns labels based on the assumed
     * threshold of each label.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DetectCustomLabels</code> action.
     * </p>
     * <p>
     * For more information, see <i>Analyzing an image</i> in the Amazon
     * Rekognition Custom Labels Developer Guide.
     * </p>
     * 
     * @param detectCustomLabelsRequest
     * @return detectCustomLabelsResult The response from the DetectCustomLabels
     *         service method, as returned by Amazon Rekognition.
     * @throws ResourceNotFoundException
     * @throws ResourceNotReadyException
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws LimitExceededException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectCustomLabelsResult detectCustomLabels(
            DetectCustomLabelsRequest detectCustomLabelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectCustomLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectCustomLabelsRequest> request = null;
        Response<DetectCustomLabelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectCustomLabelsRequestMarshaller()
                        .marshall(detectCustomLabelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectCustomLabelsResult, JsonUnmarshallerContext> unmarshaller = new DetectCustomLabelsResultJsonUnmarshaller();
            JsonResponseHandler<DetectCustomLabelsResult> responseHandler = new JsonResponseHandler<DetectCustomLabelsResult>(
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
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For
     * each face detected, the operation returns face details. These details
     * include a bounding box of the face, a confidence value (that the bounding
     * box contains a face), and a fixed set of attributes such as facial
     * landmarks (for example, coordinates of eye and mouth), pose, presence of
     * facial occlusion, and so on.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For
     * non-frontal or obscured faces, the algorithm might not detect the faces
     * or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to
     * call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @return detectFacesResult The response from the DetectFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectFacesResult detectFaces(DetectFacesRequest detectFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectFacesRequest> request = null;
        Response<DetectFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectFacesRequestMarshaller().marshall(detectFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectFacesResult, JsonUnmarshallerContext> unmarshaller = new DetectFacesResultJsonUnmarshaller();
            JsonResponseHandler<DetectFacesResult> responseHandler = new JsonResponseHandler<DetectFacesResult>(
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
     * Detects instances of real-world entities within an image (JPEG or PNG)
     * provided as input. This includes objects like flower, tree, and table;
     * events like wedding, graduation, and birthday party; and concepts like
     * landscape, evening, and nature.
     * </p>
     * <p>
     * For an example, see Analyzing images stored in an Amazon S3 bucket in the
     * Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference
     * to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
     * Rekognition operations, passing image bytes is not supported. The image
     * must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * <b>Optional Parameters</b>
     * </p>
     * <p>
     * You can specify one or both of the <code>GENERAL_LABELS</code> and
     * <code>IMAGE_PROPERTIES</code> feature types when calling the DetectLabels
     * API. Including <code>GENERAL_LABELS</code> will ensure the response
     * includes the labels detected in the input image, while including
     * <code>IMAGE_PROPERTIES </code>will ensure the response includes
     * information about the image quality and color.
     * </p>
     * <p>
     * When using <code>GENERAL_LABELS</code> and/or
     * <code>IMAGE_PROPERTIES</code> you can provide filtering criteria to the
     * Settings parameter. You can filter with sets of individual labels or with
     * label categories. You can specify inclusive filters, exclusive filters,
     * or a combination of inclusive and exclusive filters. For more information
     * on filtering see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/labels-detect-labels-image.html"
     * >Detecting Labels in an Image</a>.
     * </p>
     * <p>
     * When getting labels, you can specify <code>MinConfidence</code> to
     * control the confidence threshold for the labels returned. The default is
     * 55%. You can also add the <code>MaxLabels</code> parameter to limit the
     * number of labels returned. The default and upper limit is 1000 labels.
     * These arguments are only valid when supplying GENERAL_LABELS as a feature
     * type.
     * </p>
     * <p>
     * <b>Response Elements</b>
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels.
     * The API returns the following types of information about labels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name - The name of the detected label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Confidence - The level of confidence in the label assigned to a detected
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parents - The ancestor labels for a detected label. DetectLabels returns
     * a hierarchical taxonomy of detected labels. For example, a detected car
     * might be assigned the label car. The label car has two parent labels:
     * Vehicle (its parent) and Transportation (its grandparent). The response
     * includes the all ancestors for a label, where every ancestor is a unique
     * label. In the previous example, Car, Vehicle, and Transportation are
     * returned as unique labels in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aliases - Possible Aliases for the label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Categories - The label categories that the detected label belongs to.
     * </p>
     * </li>
     * <li>
     * <p>
     * BoundingBox — Bounding boxes are described for all instances of detected
     * common object labels, returned in an array of Instance objects. An
     * Instance object contains a BoundingBox object, describing the location of
     * the label on the input image. It also includes the confidence for the
     * accuracy of the detected bounding box.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API returns the following information regarding the image, as part of
     * the ImageProperties structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Quality - Information about the Sharpness, Brightness, and Contrast of
     * the input image, scored between 0 to 100. Image quality is returned for
     * the entire image, as well as the background and the foreground.
     * </p>
     * </li>
     * <li>
     * <p>
     * Dominant Color - An array of the dominant colors in the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * Foreground - Information about the sharpness, brightness, and dominant
     * colors of the input image’s foreground.
     * </p>
     * </li>
     * <li>
     * <p>
     * Background - Information about the sharpness, brightness, and dominant
     * colors of the input image’s background.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The list of returned labels will include at least one label for every
     * detected object, along with information about that label. In the
     * following example, suppose the input image has a lighthouse, the sea, and
     * a rock. The response includes all three labels, one for each object, as
     * well as the confidence in the label:
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * The list of labels can include multiple labels for the same object. For
     * example, if the input image shows a flower (for example, a tulip), the
     * operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the
     * flower as a tulip.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the
     * same facial details that the <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation that doesn't return any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @return detectLabelsResult The response from the DetectLabels service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectLabelsResult detectLabels(DetectLabelsRequest detectLabelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectLabelsRequest> request = null;
        Response<DetectLabelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectLabelsRequestMarshaller().marshall(detectLabelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectLabelsResult, JsonUnmarshallerContext> unmarshaller = new DetectLabelsResultJsonUnmarshaller();
            JsonResponseHandler<DetectLabelsResult> responseHandler = new JsonResponseHandler<DetectLabelsResult>(
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
     * Detects unsafe content in a specified JPEG or PNG format image. Use
     * <code>DetectModerationLabels</code> to moderate images depending on your
     * requirements. For example, you might want to filter images that contain
     * nudity, but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by
     * <code>DetectModerationLabels</code> to determine which types of content
     * are appropriate.
     * </p>
     * <p>
     * For information about moderation labels, see Detecting Unsafe Content in
     * the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to
     * call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @return detectModerationLabelsResult The response from the
     *         DetectModerationLabels service method, as returned by Amazon
     *         Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws HumanLoopQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectModerationLabelsResult detectModerationLabels(
            DetectModerationLabelsRequest detectModerationLabelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectModerationLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectModerationLabelsRequest> request = null;
        Response<DetectModerationLabelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectModerationLabelsRequestMarshaller()
                        .marshall(detectModerationLabelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectModerationLabelsResult, JsonUnmarshallerContext> unmarshaller = new DetectModerationLabelsResultJsonUnmarshaller();
            JsonResponseHandler<DetectModerationLabelsResult> responseHandler = new JsonResponseHandler<DetectModerationLabelsResult>(
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
     * Detects Personal Protective Equipment (PPE) worn by people detected in an
     * image. Amazon Rekognition can detect the following types of PPE.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Face cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Hand cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Head cover
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference
     * to an image in an Amazon S3 bucket. The image must be either a PNG or JPG
     * formatted file.
     * </p>
     * <p>
     * <code>DetectProtectiveEquipment</code> detects PPE worn by up to 15
     * persons detected in an image.
     * </p>
     * <p>
     * For each person detected in the image the API returns an array of body
     * parts (face, head, left-hand, right-hand). For each body part, an array
     * of detected items of PPE is returned, including an indicator of whether
     * or not the PPE covers the body part. The API returns the confidence it
     * has in each detection (person, PPE, body part and body part coverage). It
     * also returns a bounding box (<a>BoundingBox</a>) for each detected person
     * and each detected item of PPE.
     * </p>
     * <p>
     * You can optionally request a summary of detected PPE items with the
     * <code>SummarizationAttributes</code> input parameter. The summary
     * provides the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The persons detected as wearing all of the types of PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected as not wearing all of the types PPE that you
     * specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected where PPE adornment could not be determined.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DetectProtectiveEquipment</code> action.
     * </p>
     * 
     * @param detectProtectiveEquipmentRequest
     * @return detectProtectiveEquipmentResult The response from the
     *         DetectProtectiveEquipment service method, as returned by Amazon
     *         Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectProtectiveEquipmentResult detectProtectiveEquipment(
            DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectProtectiveEquipmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectProtectiveEquipmentRequest> request = null;
        Response<DetectProtectiveEquipmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectProtectiveEquipmentRequestMarshaller()
                        .marshall(detectProtectiveEquipmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectProtectiveEquipmentResult, JsonUnmarshallerContext> unmarshaller = new DetectProtectiveEquipmentResultJsonUnmarshaller();
            JsonResponseHandler<DetectProtectiveEquipmentResult> responseHandler = new JsonResponseHandler<DetectProtectiveEquipmentResult>(
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
     * Detects text in the input image and converts it into machine-readable
     * text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to
     * an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
     * Rekognition operations, you must pass it as a reference to an image in an
     * Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported.
     * The image must be either a .png or .jpeg formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of
     * <a>TextDetection</a> elements, <code>TextDetections</code>. Each
     * <code>TextDetection</code> element provides information about a single
     * word or line of text that was detected in the image.
     * </p>
     * <p>
     * A word is one or more script characters that are not separated by spaces.
     * <code>DetectText</code> can detect up to 100 words in an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a
     * complete sentence. For example, a driver's license number is detected as
     * a line. A line ends when there is no aligned text after it. Also, a line
     * ends when there is a large gap between words, relative to the length of
     * the words. This means, depending on the gap between words, Amazon
     * Rekognition may detect multiple lines in text aligned in the same
     * direction. Periods don't represent the end of a line. If a sentence spans
     * multiple lines, the <code>DetectText</code> operation returns multiple
     * lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of
     * text or a word, use the <code>TextDetection</code> object
     * <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 90 degrees orientation of the
     * horizontal axis.
     * </p>
     * <p>
     * For more information, see Detecting text in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * 
     * @param detectTextRequest
     * @return detectTextResult The response from the DetectText service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectTextResult detectText(DetectTextRequest detectTextRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectTextRequest> request = null;
        Response<DetectTextResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectTextRequestMarshaller().marshall(detectTextRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectTextResult, JsonUnmarshallerContext> unmarshaller = new DetectTextResultJsonUnmarshaller();
            JsonResponseHandler<DetectTextResult> responseHandler = new JsonResponseHandler<DetectTextResult>(
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
     * Removes the association between a <code>Face</code> supplied in an array
     * of <code>FaceIds</code> and the User. If the User is not present already,
     * then a <code>ResourceNotFound</code> exception is thrown. If successful,
     * an array of faces that are disassociated from the User is returned. If a
     * given face is already disassociated from the given UserID, it will be
     * ignored and not be returned in the response. If a given face is already
     * associated with a different User or not found in the collection it will
     * be returned as part of <code>UnsuccessfulDisassociations</code>. You can
     * remove 1 - 100 face IDs from a user at one time.
     * </p>
     * 
     * @param disassociateFacesRequest
     * @return disassociateFacesResult The response from the DisassociateFaces
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws IdempotentParameterMismatchException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateFacesResult disassociateFaces(
            DisassociateFacesRequest disassociateFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFacesRequest> request = null;
        Response<DisassociateFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFacesRequestMarshaller()
                        .marshall(disassociateFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateFacesResult, JsonUnmarshallerContext> unmarshaller = new DisassociateFacesResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateFacesResult> responseHandler = new JsonResponseHandler<DisassociateFacesResult>(
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
     * Distributes the entries (images) in a training dataset across the
     * training dataset and the test dataset for a project.
     * <code>DistributeDatasetEntries</code> moves 20% of the training dataset
     * images to the test dataset. An entry is a JSON Line that describes an
     * image.
     * </p>
     * <p>
     * You supply the Amazon Resource Names (ARN) of a project's training
     * dataset and test dataset. The training dataset must contain the images
     * that you want to split. The test dataset must be empty. The datasets must
     * belong to the same project. To create training and test datasets for a
     * project, call <a>CreateDataset</a>.
     * </p>
     * <p>
     * Distributing a dataset takes a while to complete. To check the status
     * call <code>DescribeDataset</code>. The operation is complete when the
     * <code>Status</code> field for the training dataset and the test dataset
     * is <code>UPDATE_COMPLETE</code>. If the dataset split fails, the value of
     * <code>Status</code> is <code>UPDATE_FAILED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DistributeDatasetEntries</code> action.
     * </p>
     * 
     * @param distributeDatasetEntriesRequest
     * @return distributeDatasetEntriesResult The response from the
     *         DistributeDatasetEntries service method, as returned by Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DistributeDatasetEntriesResult distributeDatasetEntries(
            DistributeDatasetEntriesRequest distributeDatasetEntriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(distributeDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DistributeDatasetEntriesRequest> request = null;
        Response<DistributeDatasetEntriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DistributeDatasetEntriesRequestMarshaller()
                        .marshall(distributeDatasetEntriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DistributeDatasetEntriesResult, JsonUnmarshallerContext> unmarshaller = new DistributeDatasetEntriesResultJsonUnmarshaller();
            JsonResponseHandler<DistributeDatasetEntriesResult> responseHandler = new JsonResponseHandler<DistributeDatasetEntriesResult>(
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
     * Gets the name and additional information about a celebrity based on their
     * Amazon Rekognition ID. The additional information is returned as an array
     * of URLs. If there is no additional information about the celebrity, this
     * list is empty.
     * </p>
     * <p>
     * For more information, see Getting information about a celebrity in the
     * Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @return getCelebrityInfoResult The response from the GetCelebrityInfo
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCelebrityInfoResult getCelebrityInfo(GetCelebrityInfoRequest getCelebrityInfoRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCelebrityInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCelebrityInfoRequest> request = null;
        Response<GetCelebrityInfoResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCelebrityInfoRequestMarshaller().marshall(getCelebrityInfoRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCelebrityInfoResult, JsonUnmarshallerContext> unmarshaller = new GetCelebrityInfoResultJsonUnmarshaller();
            JsonResponseHandler<GetCelebrityInfoResult> responseHandler = new JsonResponseHandler<GetCelebrityInfoResult>(
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
     * Gets the celebrity recognition results for a Amazon Rekognition Video
     * analysis started by <a>StartCelebrityRecognition</a>.
     * </p>
     * <p>
     * Celebrity recognition in a video is an asynchronous operation. Analysis
     * is started by a call to <a>StartCelebrityRecognition</a> which returns a
     * job identifier (<code>JobId</code>).
     * </p>
     * <p>
     * When the celebrity recognition operation finishes, Amazon Rekognition
     * Video publishes a completion status to the Amazon Simple Notification
     * Service topic registered in the initial call to
     * <code>StartCelebrityRecognition</code>. To get the results of the
     * celebrity recognition analysis, first check that the status value
     * published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetCelebrityDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working With Stored Videos in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the
     * time(s) they are detected in an array (<code>Celebrities</code>) of
     * <a>CelebrityRecognition</a> objects. Each
     * <code>CelebrityRecognition</code> contains information about the
     * celebrity in a <a>CelebrityDetail</a> object and the time,
     * <code>Timestamp</code>, the celebrity was detected. This
     * <a>CelebrityDetail</a> object stores information about the detected
     * celebrity's face attributes, a face bounding box, known gender, the
     * celebrity's name, and a confidence estimate.
     * </p>
     * <note>
     * <p>
     * <code>GetCelebrityRecognition</code> only returns the default facial
     * attributes (<code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * <code>BoundingBox</code> field only applies to the detected face
     * instance. The other facial attributes listed in the <code>Face</code>
     * object of the following response syntax are not returned. For more
     * information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Celebrities</code> array is sorted by time
     * (milliseconds from the start of the video). You can also sort the array
     * by celebrity by specifying the value <code>ID</code> in the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The <code>CelebrityDetail</code> object includes the celebrity identifer
     * and additional information urls. If you don't store the additional
     * information urls, you can get them later by calling
     * <a>GetCelebrityInfo</a> with the celebrity identifer.
     * </p>
     * <p>
     * No information is returned for faces not recognized as celebrities.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there
     * are more results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetCelebrityDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetCelebrityRecognition</code>.
     * </p>
     * 
     * @param getCelebrityRecognitionRequest
     * @return getCelebrityRecognitionResult The response from the
     *         GetCelebrityRecognition service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCelebrityRecognitionResult getCelebrityRecognition(
            GetCelebrityRecognitionRequest getCelebrityRecognitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCelebrityRecognitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCelebrityRecognitionRequest> request = null;
        Response<GetCelebrityRecognitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCelebrityRecognitionRequestMarshaller()
                        .marshall(getCelebrityRecognitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCelebrityRecognitionResult, JsonUnmarshallerContext> unmarshaller = new GetCelebrityRecognitionResultJsonUnmarshaller();
            JsonResponseHandler<GetCelebrityRecognitionResult> responseHandler = new JsonResponseHandler<GetCelebrityRecognitionResult>(
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
     * Gets the inappropriate, unwanted, or offensive content analysis results
     * for a Amazon Rekognition Video analysis started by
     * <a>StartContentModeration</a>. For a list of moderation labels in Amazon
     * Rekognition, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api"
     * >Using the image and video moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video inappropriate or offensive content detection in
     * a stored video is an asynchronous operation. You start analysis by
     * calling <a>StartContentModeration</a> which returns a job identifier (
     * <code>JobId</code>). When analysis finishes, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service
     * topic registered in the initial call to
     * <code>StartContentModeration</code>. To get the results of the content
     * analysis, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetContentModeration</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Working with Stored Videos in the Amazon
     * Rekognition Devlopers Guide.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected inappropriate,
     * unwanted, or offensive content moderation labels, and the time they are
     * detected, in an array, <code>ModerationLabels</code>, of
     * <a>ContentModerationDetection</a> objects.
     * </p>
     * <p>
     * By default, the moderated labels are returned sorted by time, in
     * milliseconds from the start of the video. You can also sort them by
     * moderated label by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Since video analysis can return a large number of results, use the
     * <code>MaxResults</code> parameter to limit the number of labels returned
     * in a single call to <code>GetContentModeration</code>. If there are more
     * results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetContentModeration</code> and populate the
     * <code>NextToken</code> request parameter with the value of
     * <code>NextToken</code> returned from the previous call to
     * <code>GetContentModeration</code>.
     * </p>
     * <p>
     * For more information, see moderating content in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * 
     * @param getContentModerationRequest
     * @return getContentModerationResult The response from the
     *         GetContentModeration service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetContentModerationResult getContentModeration(
            GetContentModerationRequest getContentModerationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getContentModerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContentModerationRequest> request = null;
        Response<GetContentModerationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContentModerationRequestMarshaller()
                        .marshall(getContentModerationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetContentModerationResult, JsonUnmarshallerContext> unmarshaller = new GetContentModerationResultJsonUnmarshaller();
            JsonResponseHandler<GetContentModerationResult> responseHandler = new JsonResponseHandler<GetContentModerationResult>(
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
     * Gets face detection results for a Amazon Rekognition Video analysis
     * started by <a>StartFaceDetection</a>.
     * </p>
     * <p>
     * Face detection with Amazon Rekognition Video is an asynchronous
     * operation. You start face detection by calling <a>StartFaceDetection</a>
     * which returns a job identifier (<code>JobId</code>). When the face
     * detection operation finishes, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartFaceDetection</code>. To get
     * the results of the face detection operation, first check that the status
     * value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <a>GetFaceDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <code>GetFaceDetection</code> returns an array of detected faces (
     * <code>Faces</code>) sorted by the time the faces were detected.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there
     * are more results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetFaceDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetFaceDetection</code>.
     * </p>
     * <p>
     * Note that for the <code>GetFaceDetection</code> operation, the returned
     * values for <code>FaceOccluded</code> and <code>EyeDirection</code> will
     * always be "null".
     * </p>
     * 
     * @param getFaceDetectionRequest
     * @return getFaceDetectionResult The response from the GetFaceDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFaceDetectionResult getFaceDetection(GetFaceDetectionRequest getFaceDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFaceDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceDetectionRequest> request = null;
        Response<GetFaceDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceDetectionRequestMarshaller().marshall(getFaceDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFaceDetectionResult, JsonUnmarshallerContext> unmarshaller = new GetFaceDetectionResultJsonUnmarshaller();
            JsonResponseHandler<GetFaceDetectionResult> responseHandler = new JsonResponseHandler<GetFaceDetectionResult>(
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
     * Retrieves the results of a specific Face Liveness session. It requires
     * the <code>sessionId</code> as input, which was created using
     * <code>CreateFaceLivenessSession</code>. Returns the corresponding Face
     * Liveness confidence score, a reference image that includes a face
     * bounding box, and audit images that also contain face bounding boxes. The
     * Face Liveness confidence score ranges from 0 to 100.
     * </p>
     * <p>
     * The number of audit images returned by
     * <code>GetFaceLivenessSessionResults</code> is defined by the
     * <code>AuditImagesLimit</code> paramater when calling
     * <code>CreateFaceLivenessSession</code>. Reference images are always
     * returned when possible.
     * </p>
     * 
     * @param getFaceLivenessSessionResultsRequest
     * @return getFaceLivenessSessionResultsResult The response from the
     *         GetFaceLivenessSessionResults service method, as returned by
     *         Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws SessionNotFoundException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFaceLivenessSessionResultsResult getFaceLivenessSessionResults(
            GetFaceLivenessSessionResultsRequest getFaceLivenessSessionResultsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFaceLivenessSessionResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceLivenessSessionResultsRequest> request = null;
        Response<GetFaceLivenessSessionResultsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceLivenessSessionResultsRequestMarshaller()
                        .marshall(getFaceLivenessSessionResultsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFaceLivenessSessionResultsResult, JsonUnmarshallerContext> unmarshaller = new GetFaceLivenessSessionResultsResultJsonUnmarshaller();
            JsonResponseHandler<GetFaceLivenessSessionResultsResult> responseHandler = new JsonResponseHandler<GetFaceLivenessSessionResultsResult>(
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
     * Gets the face search results for Amazon Rekognition Video face search
     * started by <a>StartFaceSearch</a>. The search returns faces in a
     * collection that match the faces of persons detected in a video. It also
     * includes the time(s) that faces are matched in the video.
     * </p>
     * <p>
     * Face search in a video is an asynchronous operation. You start face
     * search by calling to <a>StartFaceSearch</a> which returns a job
     * identifier (<code>JobId</code>). When the search operation finishes,
     * Amazon Rekognition Video publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to
     * <code>StartFaceSearch</code>. To get the search results, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <code>GetFaceSearch</code> and pass
     * the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceSearch</code>.
     * </p>
     * <p>
     * For more information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * The search results are retured in an array, <code>Persons</code>, of
     * <a>PersonMatch</a> objects. Each<code>PersonMatch</code> element contains
     * details about the matching faces in the input collection, person
     * information (facial attributes, bounding boxes, and person identifer) for
     * the matched person, and the time the person was matched in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetFaceSearch</code> only returns the default facial attributes (
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following
     * response syntax are not returned. For more information, see FaceDetail in
     * the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Persons</code> array is sorted by the time, in
     * milliseconds from the start of the video, persons are matched. You can
     * also sort by persons by specifying <code>INDEX</code> for the
     * <code>SORTBY</code> input parameter.
     * </p>
     * 
     * @param getFaceSearchRequest
     * @return getFaceSearchResult The response from the GetFaceSearch service
     *         method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFaceSearchResult getFaceSearch(GetFaceSearchRequest getFaceSearchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFaceSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceSearchRequest> request = null;
        Response<GetFaceSearchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceSearchRequestMarshaller().marshall(getFaceSearchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFaceSearchResult, JsonUnmarshallerContext> unmarshaller = new GetFaceSearchResultJsonUnmarshaller();
            JsonResponseHandler<GetFaceSearchResult> responseHandler = new JsonResponseHandler<GetFaceSearchResult>(
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
     * Gets the label detection results of a Amazon Rekognition Video analysis
     * started by <a>StartLabelDetection</a>.
     * </p>
     * <p>
     * The label detection operation is started by a call to
     * <a>StartLabelDetection</a> which returns a job identifier (
     * <code>JobId</code>). When the label detection operation finishes, Amazon
     * Rekognition publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to
     * <code>StartlabelDetection</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call <a>GetLabelDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (
     * <code>Labels</code>) sorted by the time the labels were detected. You can
     * also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter. If there is no <code>NAME</code>
     * specified, the default sort is by timestamp.
     * </p>
     * <p>
     * You can select how results are aggregated by using the
     * <code>AggregateBy</code> input parameter. The default aggregation method
     * is <code>TIMESTAMPS</code>. You can also aggregate by
     * <code>SEGMENTS</code>, which aggregates all instances of labels detected
     * in a given segment.
     * </p>
     * <p>
     * The returned Labels array may include the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name - The name of the detected label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Confidence - The level of confidence in the label assigned to a detected
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parents - The ancestor labels for a detected label. GetLabelDetection
     * returns a hierarchical taxonomy of detected labels. For example, a
     * detected car might be assigned the label car. The label car has two
     * parent labels: Vehicle (its parent) and Transportation (its grandparent).
     * The response includes the all ancestors for a label, where every ancestor
     * is a unique label. In the previous example, Car, Vehicle, and
     * Transportation are returned as unique labels in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aliases - Possible Aliases for the label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Categories - The label categories that the detected label belongs to.
     * </p>
     * </li>
     * <li>
     * <p>
     * BoundingBox — Bounding boxes are described for all instances of detected
     * common object labels, returned in an array of Instance objects. An
     * Instance object contains a BoundingBox object, describing the location of
     * the label on the input image. It also includes the confidence for the
     * accuracy of the detected bounding box.
     * </p>
     * </li>
     * <li>
     * <p>
     * Timestamp - Time, in milliseconds from the start of the video, that the
     * label was detected. For aggregation by <code>SEGMENTS</code>, the
     * <code>StartTimestampMillis</code>, <code>EndTimestampMillis</code>, and
     * <code>DurationMillis</code> structures are what define a segment.
     * Although the “Timestamp” structure is still returned with each label, its
     * value is set to be the same as <code>StartTimestampMillis</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Timestamp and Bounding box information are returned for detected
     * Instances, only if aggregation is done by <code>TIMESTAMPS</code>. If
     * aggregating by <code>SEGMENTS</code>, information about detected
     * instances isn’t returned.
     * </p>
     * <p>
     * The version of the label model used for the detection is also returned.
     * </p>
     * <p>
     * <b>Note <code>DominantColors</code> isn't returned for
     * <code>Instances</code>, although it is shown as part of the response in
     * the sample seen below.</b>
     * </p>
     * <p>
     * Use <code>MaxResults</code> parameter to limit the number of labels
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetlabelDetection</code> and populate the <code>NextToken</code>
     * request parameter with the token value returned from the previous call to
     * <code>GetLabelDetection</code>.
     * </p>
     * 
     * @param getLabelDetectionRequest
     * @return getLabelDetectionResult The response from the GetLabelDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLabelDetectionResult getLabelDetection(
            GetLabelDetectionRequest getLabelDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLabelDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLabelDetectionRequest> request = null;
        Response<GetLabelDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLabelDetectionRequestMarshaller()
                        .marshall(getLabelDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLabelDetectionResult, JsonUnmarshallerContext> unmarshaller = new GetLabelDetectionResultJsonUnmarshaller();
            JsonResponseHandler<GetLabelDetectionResult> responseHandler = new JsonResponseHandler<GetLabelDetectionResult>(
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
     * Gets the path tracking results of a Amazon Rekognition Video analysis
     * started by <a>StartPersonTracking</a>.
     * </p>
     * <p>
     * The person path tracking operation is started by a call to
     * <code>StartPersonTracking</code> which returns a job identifier (
     * <code>JobId</code>). When the operation finishes, Amazon Rekognition
     * Video publishes a completion status to the Amazon Simple Notification
     * Service topic registered in the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * To get the results of the person path tracking operation, first check
     * that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the
     * job identifier (<code>JobId</code>) from the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * <code>GetPersonTracking</code> returns an array, <code>Persons</code>, of
     * tracked persons and the time(s) their paths were tracked in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetPersonTracking</code> only returns the default facial attributes
     * (<code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * other facial attributes listed in the <code>Face</code> object of the
     * following response syntax are not returned.
     * </p>
     * <p>
     * For more information, see FaceDetail in the Amazon Rekognition Developer
     * Guide.
     * </p>
     * </note>
     * <p>
     * By default, the array is sorted by the time(s) a person's path is tracked
     * in the video. You can sort by tracked persons by specifying
     * <code>INDEX</code> for the <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of items
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetPersonTracking</code> and populate the <code>NextToken</code>
     * request parameter with the token value returned from the previous call to
     * <code>GetPersonTracking</code>.
     * </p>
     * 
     * @param getPersonTrackingRequest
     * @return getPersonTrackingResult The response from the GetPersonTracking
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPersonTrackingResult getPersonTracking(
            GetPersonTrackingRequest getPersonTrackingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPersonTrackingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPersonTrackingRequest> request = null;
        Response<GetPersonTrackingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPersonTrackingRequestMarshaller()
                        .marshall(getPersonTrackingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPersonTrackingResult, JsonUnmarshallerContext> unmarshaller = new GetPersonTrackingResultJsonUnmarshaller();
            JsonResponseHandler<GetPersonTrackingResult> responseHandler = new JsonResponseHandler<GetPersonTrackingResult>(
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
     * Gets the segment detection results of a Amazon Rekognition Video analysis
     * started by <a>StartSegmentDetection</a>.
     * </p>
     * <p>
     * Segment detection with Amazon Rekognition Video is an asynchronous
     * operation. You start segment detection by calling
     * <a>StartSegmentDetection</a> which returns a job identifier (
     * <code>JobId</code>). When the segment detection operation finishes,
     * Amazon Rekognition publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to
     * <code>StartSegmentDetection</code>. To get the results of the segment
     * detection operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. if so, call
     * <code>GetSegmentDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call of
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * <code>GetSegmentDetection</code> returns detected segments in an array (
     * <code>Segments</code>) of <a>SegmentDetection</a> objects.
     * <code>Segments</code> is sorted by the segment types specified in the
     * <code>SegmentTypes</code> input parameter of
     * <code>StartSegmentDetection</code>. Each element of the array includes
     * the detected segment, the precentage confidence in the acuracy of the
     * detected segment, the type of the segment, and the frame in which the
     * segment was detected.
     * </p>
     * <p>
     * Use <code>SelectedSegmentTypes</code> to find out the type of segment
     * detection requested in the call to <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of segment
     * detections returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetSegmentDetection</code> and populate the <code>NextToken</code>
     * request parameter with the token value returned from the previous call to
     * <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting video segments in stored video in the
     * Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getSegmentDetectionRequest
     * @return getSegmentDetectionResult The response from the
     *         GetSegmentDetection service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSegmentDetectionResult getSegmentDetection(
            GetSegmentDetectionRequest getSegmentDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentDetectionRequest> request = null;
        Response<GetSegmentDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentDetectionRequestMarshaller()
                        .marshall(getSegmentDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentDetectionResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentDetectionResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentDetectionResult> responseHandler = new JsonResponseHandler<GetSegmentDetectionResult>(
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
     * Gets the text detection results of a Amazon Rekognition Video analysis
     * started by <a>StartTextDetection</a>.
     * </p>
     * <p>
     * Text detection with Amazon Rekognition Video is an asynchronous
     * operation. You start text detection by calling <a>StartTextDetection</a>
     * which returns a job identifier (<code>JobId</code>) When the text
     * detection operation finishes, Amazon Rekognition publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the
     * initial call to <code>StartTextDetection</code>. To get the results of
     * the text detection operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. if so, call
     * <code>GetTextDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call of
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetTextDetection</code> returns an array of detected text (
     * <code>TextDetections</code>) sorted by the time the text was detected, up
     * to 100 words per frame of video.
     * </p>
     * <p>
     * Each element of the array includes the detected text, the precentage
     * confidence in the acuracy of the detected text, the time the text was
     * detected, bounding box information for where the text was located, and
     * unique identifiers for words and their lines.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of text detections returned.
     * If there are more results than specified in <code>MaxResults</code>, the
     * value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next
     * page of results, call <code>GetTextDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetTextDetection</code>.
     * </p>
     * 
     * @param getTextDetectionRequest
     * @return getTextDetectionResult The response from the GetTextDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTextDetectionResult getTextDetection(GetTextDetectionRequest getTextDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTextDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTextDetectionRequest> request = null;
        Response<GetTextDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTextDetectionRequestMarshaller().marshall(getTextDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTextDetectionResult, JsonUnmarshallerContext> unmarshaller = new GetTextDetectionResultJsonUnmarshaller();
            JsonResponseHandler<GetTextDetectionResult> responseHandler = new JsonResponseHandler<GetTextDetectionResult>(
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
     * Detects faces in the input image and adds them to the specified
     * collection.
     * </p>
     * <p>
     * Amazon Rekognition doesn't save the actual faces that are detected.
     * Instead, the underlying detection algorithm first detects the faces in
     * the input image. For each face, the algorithm extracts facial features
     * into a feature vector, and stores it in the backend database. Amazon
     * Rekognition uses feature vectors when it performs face match and search
     * operations using the <a>SearchFaces</a> and <a>SearchFacesByImage</a>
     * operations.
     * </p>
     * <p>
     * For more information, see Adding faces to a collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * To get the number of faces in a collection, call
     * <a>DescribeCollection</a>.
     * </p>
     * <p>
     * If you're using version 1.0 of the face detection model,
     * <code>IndexFaces</code> indexes the 15 largest faces in the input image.
     * Later versions of the face detection model index the 100 largest faces in
     * the input image.
     * </p>
     * <p>
     * If you're using version 4 or later of the face model, image orientation
     * information is not returned in the <code>OrientationCorrection</code>
     * field.
     * </p>
     * <p>
     * To determine which version of the model you're using, call
     * <a>DescribeCollection</a> and supply the collection ID. You can also get
     * the model version from the value of <code>FaceModelVersion</code> in the
     * response from <code>IndexFaces</code>
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageId</code> for the input
     * image you provided, Amazon Rekognition associates this ID with all faces
     * that it detects. When you call the <a>ListFaces</a> operation, the
     * response returns the external ID. You can use this external image ID to
     * create a client-side index to associate the faces with each image. You
     * can then use the index to find all faces in an image.
     * </p>
     * <p>
     * You can specify the maximum number of faces to index with the
     * <code>MaxFaces</code> input parameter. This is useful when you want to
     * index the largest faces in an image and don't want to index smaller
     * faces, such as those belonging to people standing in the background.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out
     * detected faces that don’t meet a required quality bar. The quality bar is
     * based on a variety of common use cases. By default,
     * <code>IndexFaces</code> chooses the quality bar that's used to filter
     * faces. You can also explicitly choose the quality bar. Use
     * <code>QualityFilter</code>, to set the quality bar by specifying
     * <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do
     * not want to filter detected faces, specify <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3
     * of the face model or higher. To get the version of the face model
     * associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * Information about faces detected in an image, but not indexed, is
     * returned in an array of <a>UnindexedFace</a> objects,
     * <code>UnindexedFaces</code>. Faces aren't indexed for reasons such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The number of faces detected exceeds the value of the
     * <code>MaxFaces</code> request parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too small compared to the image dimensions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face has an extreme pose.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face doesn’t have enough detail to be suitable for face search.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In response, the <code>IndexFaces</code> operation returns an array of
     * metadata for all detected faces, <code>FaceRecords</code>. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bounding box, <code>BoundingBox</code>, of the detected face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confidence value, <code>Confidence</code>, which indicates the
     * confidence that the bounding box contains a face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A face ID, <code>FaceId</code>, assigned by the service for each face
     * that's detected and stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * An image ID, <code>ImageId</code>, assigned by the service for the input
     * image.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you request <code>ALL</code> or specific facial attributes (e.g.,
     * <code>FACE_OCCLUDED</code>) by using the detectionAttributes parameter,
     * Amazon Rekognition returns detailed facial attributes, such as facial
     * landmarks (for example, location of eye and mouth), facial occlusion, and
     * other facial attributes.
     * </p>
     * <p>
     * If you provide the same image, specify the same collection, and use the
     * same external ID in the <code>IndexFaces</code> operation, Amazon
     * Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p/>
     * <p>
     * The input image is passed either as base64-encoded image bytes, or as a
     * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to
     * call Amazon Rekognition operations, passing image bytes isn't supported.
     * The image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @return indexFacesResult The response from the IndexFaces service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidImageFormatException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public IndexFacesResult indexFaces(IndexFacesRequest indexFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(indexFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IndexFacesRequest> request = null;
        Response<IndexFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IndexFacesRequestMarshaller().marshall(indexFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<IndexFacesResult, JsonUnmarshallerContext> unmarshaller = new IndexFacesResultJsonUnmarshaller();
            JsonResponseHandler<IndexFacesResult> responseHandler = new JsonResponseHandler<IndexFacesResult>(
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
     * Returns list of collection IDs in your account. If the result is
     * truncated, the response also provides a <code>NextToken</code> that you
     * can use in the subsequent request to fetch the next set of collection
     * IDs.
     * </p>
     * <p>
     * For an example, see Listing collections in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @return listCollectionsResult The response from the ListCollections
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCollectionsResult listCollections(ListCollectionsRequest listCollectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollectionsRequest> request = null;
        Response<ListCollectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollectionsRequestMarshaller().marshall(listCollectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCollectionsResult, JsonUnmarshallerContext> unmarshaller = new ListCollectionsResultJsonUnmarshaller();
            JsonResponseHandler<ListCollectionsResult> responseHandler = new JsonResponseHandler<ListCollectionsResult>(
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
     * Lists the entries (images) within a dataset. An entry is a JSON Line that
     * contains the information for a single image, including the image
     * location, assigned labels, and object location bounding boxes. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-manifest-files.html"
     * >Creating a manifest file</a>.
     * </p>
     * <p>
     * JSON Lines in the response include information about non-terminal errors
     * found in the dataset. Non terminal errors are reported in
     * <code>errors</code> lists within each JSON Line. The same information is
     * reported in the training and testing validation result manifests that
     * Amazon Rekognition Custom Labels creates during model training.
     * </p>
     * <p>
     * You can filter the response in variety of ways, such as choosing which
     * labels to return and returning JSON Lines created after a specific date.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListDatasetEntries</code> action.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @return listDatasetEntriesResult The response from the ListDatasetEntries
     *         service method, as returned by Amazon Rekognition.
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDatasetEntriesResult listDatasetEntries(
            ListDatasetEntriesRequest listDatasetEntriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetEntriesRequest> request = null;
        Response<ListDatasetEntriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetEntriesRequestMarshaller()
                        .marshall(listDatasetEntriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDatasetEntriesResult, JsonUnmarshallerContext> unmarshaller = new ListDatasetEntriesResultJsonUnmarshaller();
            JsonResponseHandler<ListDatasetEntriesResult> responseHandler = new JsonResponseHandler<ListDatasetEntriesResult>(
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
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses
     * labels to describe images. For more information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-labeling-images.html"
     * >Labeling images</a>.
     * </p>
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses
     * labels to describe images. For more information, see Labeling images in
     * the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * 
     * @param listDatasetLabelsRequest
     * @return listDatasetLabelsResult The response from the ListDatasetLabels
     *         service method, as returned by Amazon Rekognition.
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDatasetLabelsResult listDatasetLabels(
            ListDatasetLabelsRequest listDatasetLabelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDatasetLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetLabelsRequest> request = null;
        Response<ListDatasetLabelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetLabelsRequestMarshaller()
                        .marshall(listDatasetLabelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDatasetLabelsResult, JsonUnmarshallerContext> unmarshaller = new ListDatasetLabelsResultJsonUnmarshaller();
            JsonResponseHandler<ListDatasetLabelsResult> responseHandler = new JsonResponseHandler<ListDatasetLabelsResult>(
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
     * Returns metadata for faces in the specified collection. This metadata
     * includes information such as the bounding box coordinates, the confidence
     * (that the bounding box contains a face), and face ID. For an example, see
     * Listing Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @return listFacesResult The response from the ListFaces service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFacesResult listFaces(ListFacesRequest listFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFacesRequest> request = null;
        Response<ListFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFacesRequestMarshaller().marshall(listFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFacesResult, JsonUnmarshallerContext> unmarshaller = new ListFacesResultJsonUnmarshaller();
            JsonResponseHandler<ListFacesResult> responseHandler = new JsonResponseHandler<ListFacesResult>(
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
     * Gets a list of the project policies attached to a project.
     * </p>
     * <p>
     * To attach a project policy to a project, call <a>PutProjectPolicy</a>. To
     * remove a project policy from a project, call <a>DeleteProjectPolicy</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListProjectPolicies</code> action.
     * </p>
     * 
     * @param listProjectPoliciesRequest
     * @return listProjectPoliciesResult The response from the
     *         ListProjectPolicies service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidPaginationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProjectPoliciesResult listProjectPolicies(
            ListProjectPoliciesRequest listProjectPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProjectPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectPoliciesRequest> request = null;
        Response<ListProjectPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectPoliciesRequestMarshaller()
                        .marshall(listProjectPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProjectPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListProjectPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListProjectPoliciesResult> responseHandler = new JsonResponseHandler<ListProjectPoliciesResult>(
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
     * Gets a list of stream processors that you have created with
     * <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param listStreamProcessorsRequest
     * @return listStreamProcessorsResult The response from the
     *         ListStreamProcessors service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListStreamProcessorsResult listStreamProcessors(
            ListStreamProcessorsRequest listStreamProcessorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStreamProcessorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamProcessorsRequest> request = null;
        Response<ListStreamProcessorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamProcessorsRequestMarshaller()
                        .marshall(listStreamProcessorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListStreamProcessorsResult, JsonUnmarshallerContext> unmarshaller = new ListStreamProcessorsResultJsonUnmarshaller();
            JsonResponseHandler<ListStreamProcessorsResult> responseHandler = new JsonResponseHandler<ListStreamProcessorsResult>(
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
     * Returns a list of tags in an Amazon Rekognition collection, stream
     * processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListTagsForResource</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
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
     * Returns metadata of the User such as <code>UserID</code> in the specified
     * collection. Anonymous User (to reserve faces without any identity) is not
     * returned as part of this request. The results are sorted by system
     * generated primary key ID. If the response is truncated,
     * <code>NextToken</code> is returned in the response that can be used in
     * the subsequent request to retrieve the next set of identities.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller().marshall(listUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUsersResult, JsonUnmarshallerContext> unmarshaller = new ListUsersResultJsonUnmarshaller();
            JsonResponseHandler<ListUsersResult> responseHandler = new JsonResponseHandler<ListUsersResult>(
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
     * Attaches a project policy to a Amazon Rekognition Custom Labels project
     * in a trusting AWS account. A project policy specifies that a trusted AWS
     * account can copy a model version from a trusting AWS account to a project
     * in the trusted AWS account. To copy a model version you use the
     * <a>CopyProjectVersion</a> operation.
     * </p>
     * <p>
     * For more information about the format of a project policy document, see
     * Attaching a project policy (SDK) in the <i>Amazon Rekognition Custom
     * Labels Developer Guide</i>.
     * </p>
     * <p>
     * The response from <code>PutProjectPolicy</code> is a revision ID for the
     * project policy. You can attach multiple project policies to a project.
     * You can also update an existing project policy by specifying the policy
     * revision ID of the existing policy.
     * </p>
     * <p>
     * To remove a project policy from a project, call
     * <a>DeleteProjectPolicy</a>. To get a list of project policies attached to
     * a project, call <a>ListProjectPolicies</a>.
     * </p>
     * <p>
     * You copy a model version by calling <a>CopyProjectVersion</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:PutProjectPolicy</code> action.
     * </p>
     * 
     * @param putProjectPolicyRequest
     * @return putProjectPolicyResult The response from the PutProjectPolicy
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPolicyRevisionIdException
     * @throws MalformedPolicyDocumentException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutProjectPolicyResult putProjectPolicy(PutProjectPolicyRequest putProjectPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putProjectPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProjectPolicyRequest> request = null;
        Response<PutProjectPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProjectPolicyRequestMarshaller().marshall(putProjectPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutProjectPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutProjectPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutProjectPolicyResult> responseHandler = new JsonResponseHandler<PutProjectPolicyResult>(
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
     * Returns an array of celebrities recognized in the input image. For more
     * information, see Recognizing celebrities in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 64 largest faces in the
     * image. It lists the recognized celebrities in the
     * <code>CelebrityFaces</code> array and any unrecognized faces in the
     * <code>UnrecognizedFaces</code> array. <code>RecognizeCelebrities</code>
     * doesn't return celebrities whose faces aren't among the largest 64 faces
     * in the image.
     * </p>
     * <p>
     * For each celebrity recognized, <code>RecognizeCelebrities</code> returns
     * a <code>Celebrity</code> object. The <code>Celebrity</code> object
     * contains the celebrity name, ID, URL links to additional information,
     * match confidence, and a <code>ComparedFace</code> object that you can use
     * to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Amazon Rekognition doesn't retain information about which images a
     * celebrity has been recognized in. Your application must store this
     * information and use the <code>Celebrity</code> ID property as a unique
     * identifier for the celebrity. If you don't store the celebrity name or
     * additional information URLs returned by <code>RecognizeCelebrities</code>
     * , you will need the ID to identify the celebrity in a call to the
     * <a>GetCelebrityInfo</a> operation.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to
     * call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see Recognizing celebrities in an image in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @return recognizeCelebritiesResult The response from the
     *         RecognizeCelebrities service method, as returned by Amazon
     *         Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws InvalidImageFormatException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RecognizeCelebritiesResult recognizeCelebrities(
            RecognizeCelebritiesRequest recognizeCelebritiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(recognizeCelebritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecognizeCelebritiesRequest> request = null;
        Response<RecognizeCelebritiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecognizeCelebritiesRequestMarshaller()
                        .marshall(recognizeCelebritiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RecognizeCelebritiesResult, JsonUnmarshallerContext> unmarshaller = new RecognizeCelebritiesResultJsonUnmarshaller();
            JsonResponseHandler<RecognizeCelebritiesResult> responseHandler = new JsonResponseHandler<RecognizeCelebritiesResult>(
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
     * For a given input face ID, searches for matching faces in the collection
     * the face belongs to. You get a face ID when you add a face to the
     * collection using the <a>IndexFaces</a> operation. The operation compares
     * the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the
     * <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by
     * similarity score with the highest similarity first. More specifically, it
     * is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for
     * each face match, indicating the confidence that the specific face matches
     * the input face.
     * </p>
     * <p>
     * For an example, see Searching for a face using its face ID in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @return searchFacesResult The response from the SearchFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchFacesResult searchFaces(SearchFacesRequest searchFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFacesRequest> request = null;
        Response<SearchFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFacesRequestMarshaller().marshall(searchFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchFacesResult, JsonUnmarshallerContext> unmarshaller = new SearchFacesResultJsonUnmarshaller();
            JsonResponseHandler<SearchFacesResult> responseHandler = new JsonResponseHandler<SearchFacesResult>(
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
     * For a given input image, first detects the largest face in the image, and
     * then searches the specified collection for matching faces. The operation
     * compares the features of the input face with faces in the specified
     * collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the
     * <a>IndexFaces</a> operation, and then use the face IDs returned in
     * subsequent calls to the <a>SearchFaces</a> operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the
     * bounding boxes in the response to make face crops, which then you can
     * pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the AWS CLI to
     * call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity
     * score with the highest similarity first. More specifically, it is an
     * array of metadata for each face match found. Along with the metadata, the
     * response also includes a <code>similarity</code> indicating how similar
     * the face is to the input face. In the response, the operation also
     * returns the bounding box (and a confidence level that the bounding box
     * contains a face) of the face that Amazon Rekognition used for the input
     * image.
     * </p>
     * <p>
     * If no faces are detected in the input image,
     * <code>SearchFacesByImage</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * For an example, Searching for a Face Using an Image in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out
     * detected faces that don’t meet a required quality bar. The quality bar is
     * based on a variety of common use cases. Use <code>QualityFilter</code> to
     * set the quality bar for filtering by specifying <code>LOW</code>,
     * <code>MEDIUM</code>, or <code>HIGH</code>. If you do not want to filter
     * detected faces, specify <code>NONE</code>. The default value is
     * <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3
     * of the face model or higher. To get the version of the face model
     * associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @return searchFacesByImageResult The response from the SearchFacesByImage
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchFacesByImageResult searchFacesByImage(
            SearchFacesByImageRequest searchFacesByImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchFacesByImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFacesByImageRequest> request = null;
        Response<SearchFacesByImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFacesByImageRequestMarshaller()
                        .marshall(searchFacesByImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchFacesByImageResult, JsonUnmarshallerContext> unmarshaller = new SearchFacesByImageResultJsonUnmarshaller();
            JsonResponseHandler<SearchFacesByImageResult> responseHandler = new JsonResponseHandler<SearchFacesByImageResult>(
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
     * Searches for UserIDs within a collection based on a <code>FaceId</code>
     * or <code>UserId</code>. This API can be used to find the closest UserID
     * (with a highest similarity) to associate a face. The request must be
     * provided with either <code>FaceId</code> or <code>UserId</code>. The
     * operation returns an array of UserID that match the <code>FaceId</code>
     * or <code>UserId</code>, ordered by similarity score with the highest
     * similarity first.
     * </p>
     * 
     * @param searchUsersRequest
     * @return searchUsersResult The response from the SearchUsers service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchUsersResult searchUsers(SearchUsersRequest searchUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchUsersRequest> request = null;
        Response<SearchUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchUsersRequestMarshaller().marshall(searchUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchUsersResult, JsonUnmarshallerContext> unmarshaller = new SearchUsersResultJsonUnmarshaller();
            JsonResponseHandler<SearchUsersResult> responseHandler = new JsonResponseHandler<SearchUsersResult>(
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
     * Searches for UserIDs using a supplied image. It first detects the largest
     * face in the image, and then searches a specified collection for matching
     * UserIDs.
     * </p>
     * <p>
     * The operation returns an array of UserIDs that match the face in the
     * supplied image, ordered by similarity score with the highest similarity
     * first. It also returns a bounding box for the face found in the input
     * image.
     * </p>
     * <p>
     * Information about faces detected in the supplied image, but not used for
     * the search, is returned in an array of <code>UnsearchedFace</code>
     * objects. If no valid face is detected in the image, the response will
     * contain an empty <code>UserMatches</code> list and no
     * <code>SearchedFace</code> object.
     * </p>
     * 
     * @param searchUsersByImageRequest
     * @return searchUsersByImageResult The response from the SearchUsersByImage
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidImageFormatException
     * @throws InvalidS3ObjectException
     * @throws ImageTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchUsersByImageResult searchUsersByImage(
            SearchUsersByImageRequest searchUsersByImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchUsersByImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchUsersByImageRequest> request = null;
        Response<SearchUsersByImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchUsersByImageRequestMarshaller()
                        .marshall(searchUsersByImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchUsersByImageResult, JsonUnmarshallerContext> unmarshaller = new SearchUsersByImageResultJsonUnmarshaller();
            JsonResponseHandler<SearchUsersByImageResult> responseHandler = new JsonResponseHandler<SearchUsersByImageResult>(
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
     * Starts asynchronous recognition of celebrities in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect celebrities in a video must be stored
     * in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and
     * the filename of the video. <code>StartCelebrityRecognition</code> returns
     * a job identifier (<code>JobId</code>) which you use to get the results of
     * the analysis. When celebrity recognition analysis is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in
     * <code>NotificationChannel</code>. To get the results of the celebrity
     * recognition analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetCelebrityRecognition</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * For more information, see Recognizing celebrities in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param startCelebrityRecognitionRequest
     * @return startCelebrityRecognitionResult The response from the
     *         StartCelebrityRecognition service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartCelebrityRecognitionResult startCelebrityRecognition(
            StartCelebrityRecognitionRequest startCelebrityRecognitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCelebrityRecognitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCelebrityRecognitionRequest> request = null;
        Response<StartCelebrityRecognitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCelebrityRecognitionRequestMarshaller()
                        .marshall(startCelebrityRecognitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCelebrityRecognitionResult, JsonUnmarshallerContext> unmarshaller = new StartCelebrityRecognitionResultJsonUnmarshaller();
            JsonResponseHandler<StartCelebrityRecognitionResult> responseHandler = new JsonResponseHandler<StartCelebrityRecognitionResult>(
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
     * Starts asynchronous detection of inappropriate, unwanted, or offensive
     * content in a stored video. For a list of moderation labels in Amazon
     * Rekognition, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api"
     * >Using the image and video moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video can moderate content in a video stored in an
     * Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the
     * filename of the video. <code>StartContentModeration</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the
     * analysis. When content analysis is finished, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service
     * topic that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content analysis, first check that the status
     * value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <a>GetContentModeration</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Moderating content in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * 
     * @param startContentModerationRequest
     * @return startContentModerationResult The response from the
     *         StartContentModeration service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartContentModerationResult startContentModeration(
            StartContentModerationRequest startContentModerationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startContentModerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContentModerationRequest> request = null;
        Response<StartContentModerationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContentModerationRequestMarshaller()
                        .marshall(startContentModerationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartContentModerationResult, JsonUnmarshallerContext> unmarshaller = new StartContentModerationResultJsonUnmarshaller();
            JsonResponseHandler<StartContentModerationResult> responseHandler = new JsonResponseHandler<StartContentModerationResult>(
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
     * Starts asynchronous detection of faces in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect faces in a video stored in an Amazon
     * S3 bucket. Use <a>Video</a> to specify the bucket name and the filename
     * of the video. <code>StartFaceDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When face detection is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the face detection operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetFaceDetection</a> and pass the job identifier (<code>JobId</code>)
     * from the initial call to <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting faces in a stored video in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param startFaceDetectionRequest
     * @return startFaceDetectionResult The response from the StartFaceDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartFaceDetectionResult startFaceDetection(
            StartFaceDetectionRequest startFaceDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startFaceDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFaceDetectionRequest> request = null;
        Response<StartFaceDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFaceDetectionRequestMarshaller()
                        .marshall(startFaceDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartFaceDetectionResult, JsonUnmarshallerContext> unmarshaller = new StartFaceDetectionResultJsonUnmarshaller();
            JsonResponseHandler<StartFaceDetectionResult> responseHandler = new JsonResponseHandler<StartFaceDetectionResult>(
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
     * Starts the asynchronous search for faces in a collection that match the
     * faces of persons detected in a stored video.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video.
     * <code>StartFaceSearch</code> returns a job identifier (<code>JobId</code>
     * ) which you use to get the search results once the search has completed.
     * When searching is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>. To get the search
     * results, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceSearch</a> and
     * pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceSearch</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/procedure-person-search-videos.html"
     * >Searching stored videos for faces</a>.
     * </p>
     * 
     * @param startFaceSearchRequest
     * @return startFaceSearchResult The response from the StartFaceSearch
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartFaceSearchResult startFaceSearch(StartFaceSearchRequest startFaceSearchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startFaceSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFaceSearchRequest> request = null;
        Response<StartFaceSearchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFaceSearchRequestMarshaller().marshall(startFaceSearchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartFaceSearchResult, JsonUnmarshallerContext> unmarshaller = new StartFaceSearchResultJsonUnmarshaller();
            JsonResponseHandler<StartFaceSearchResult> responseHandler = new JsonResponseHandler<StartFaceSearchResult>(
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
     * Starts asynchronous detection of labels in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect labels in a video. Labels are
     * instances of real-world entities. This includes objects like flower,
     * tree, and table; events like wedding, graduation, and birthday party;
     * concepts like landscape, evening, and nature; and activities like a
     * person getting out of a car or a person skiing.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video.
     * <code>StartLabelDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation.
     * When label detection is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call <a>GetLabelDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <i>Optional Parameters</i>
     * </p>
     * <p>
     * <code>StartLabelDetection</code> has the <code>GENERAL_LABELS</code>
     * Feature applied by default. This feature allows you to provide filtering
     * criteria to the <code>Settings</code> parameter. You can filter with sets
     * of individual labels or with label categories. You can specify inclusive
     * filters, exclusive filters, or a combination of inclusive and exclusive
     * filters. For more information on filtering, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/labels-detecting-labels-video.html"
     * >Detecting labels in a video</a>.
     * </p>
     * <p>
     * You can specify <code>MinConfidence</code> to control the confidence
     * threshold for the labels returned. The default is 50.
     * </p>
     * 
     * @param startLabelDetectionRequest
     * @return startLabelDetectionResult The response from the
     *         StartLabelDetection service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartLabelDetectionResult startLabelDetection(
            StartLabelDetectionRequest startLabelDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startLabelDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLabelDetectionRequest> request = null;
        Response<StartLabelDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLabelDetectionRequestMarshaller()
                        .marshall(startLabelDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartLabelDetectionResult, JsonUnmarshallerContext> unmarshaller = new StartLabelDetectionResultJsonUnmarshaller();
            JsonResponseHandler<StartLabelDetectionResult> responseHandler = new JsonResponseHandler<StartLabelDetectionResult>(
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
     * Starts the asynchronous tracking of a person's path in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can track the path of people in a video stored
     * in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and
     * the filename of the video. <code>StartPersonTracking</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the
     * operation. When label detection is finished, Amazon Rekognition publishes
     * a completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the person detection operation, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the
     * job identifier (<code>JobId</code>) from the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param startPersonTrackingRequest
     * @return startPersonTrackingResult The response from the
     *         StartPersonTracking service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartPersonTrackingResult startPersonTracking(
            StartPersonTrackingRequest startPersonTrackingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startPersonTrackingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPersonTrackingRequest> request = null;
        Response<StartPersonTrackingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPersonTrackingRequestMarshaller()
                        .marshall(startPersonTrackingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartPersonTrackingResult, JsonUnmarshallerContext> unmarshaller = new StartPersonTrackingResultJsonUnmarshaller();
            JsonResponseHandler<StartPersonTrackingResult> responseHandler = new JsonResponseHandler<StartPersonTrackingResult>(
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
     * Starts the running of the version of a model. Starting a model takes a
     * while to complete. To check the current state of the model, use
     * <a>DescribeProjectVersions</a>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by
     * calling <a>DetectCustomLabels</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop
     * a running model, call <a>StopProjectVersion</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <i>Running a trained Amazon Rekognition Custom
     * Labels model</i> in the Amazon Rekognition Custom Labels Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:StartProjectVersion</code> action.
     * </p>
     * 
     * @param startProjectVersionRequest
     * @return startProjectVersionResult The response from the
     *         StartProjectVersion service method, as returned by Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartProjectVersionResult startProjectVersion(
            StartProjectVersionRequest startProjectVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartProjectVersionRequest> request = null;
        Response<StartProjectVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartProjectVersionRequestMarshaller()
                        .marshall(startProjectVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartProjectVersionResult, JsonUnmarshallerContext> unmarshaller = new StartProjectVersionResultJsonUnmarshaller();
            JsonResponseHandler<StartProjectVersionResult> responseHandler = new JsonResponseHandler<StartProjectVersionResult>(
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
     * Starts asynchronous detection of segment detection in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect segments in a video stored in an
     * Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the
     * filename of the video. <code>StartSegmentDetection</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the
     * operation. When segment detection is finished, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service
     * topic that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * You can use the <code>Filters</code>
     * (<a>StartSegmentDetectionFilters</a>) input parameter to specify the
     * minimum detection confidence returned in the response. Within
     * <code>Filters</code>, use <code>ShotFilter</code>
     * (<a>StartShotDetectionFilter</a>) to filter detected shots. Use
     * <code>TechnicalCueFilter</code> (<a>StartTechnicalCueDetectionFilter</a>)
     * to filter technical cues.
     * </p>
     * <p>
     * To get the results of the segment detection operation, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. if so, call <a>GetSegmentDetection</a> and pass
     * the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting video segments in stored video in the
     * Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startSegmentDetectionRequest
     * @return startSegmentDetectionResult The response from the
     *         StartSegmentDetection service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartSegmentDetectionResult startSegmentDetection(
            StartSegmentDetectionRequest startSegmentDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startSegmentDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSegmentDetectionRequest> request = null;
        Response<StartSegmentDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSegmentDetectionRequestMarshaller()
                        .marshall(startSegmentDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartSegmentDetectionResult, JsonUnmarshallerContext> unmarshaller = new StartSegmentDetectionResultJsonUnmarshaller();
            JsonResponseHandler<StartSegmentDetectionResult> responseHandler = new JsonResponseHandler<StartSegmentDetectionResult>(
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
     * Starts processing a stream processor. You create a stream processor by
     * calling <a>CreateStreamProcessor</a>. To tell
     * <code>StartStreamProcessor</code> which stream processor to start, use
     * the value of the <code>Name</code> field specified in the call to
     * <code>CreateStreamProcessor</code>.
     * </p>
     * <p>
     * If you are using a label detection stream processor to detect labels, you
     * need to provide a <code>Start selector</code> and a
     * <code>Stop selector</code> to determine the length of the stream
     * processing time.
     * </p>
     * 
     * @param startStreamProcessorRequest
     * @return startStreamProcessorResult The response from the
     *         StartStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartStreamProcessorResult startStreamProcessor(
            StartStreamProcessorRequest startStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStreamProcessorRequest> request = null;
        Response<StartStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStreamProcessorRequestMarshaller()
                        .marshall(startStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new StartStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<StartStreamProcessorResult> responseHandler = new JsonResponseHandler<StartStreamProcessorResult>(
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
     * Starts asynchronous detection of text in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect text in a video stored in an Amazon
     * S3 bucket. Use <a>Video</a> to specify the bucket name and the filename
     * of the video. <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation.
     * When text detection is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the text detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * if so, call <a>GetTextDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartTextDetection</code>.
     * </p>
     * 
     * @param startTextDetectionRequest
     * @return startTextDetectionResult The response from the StartTextDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartTextDetectionResult startTextDetection(
            StartTextDetectionRequest startTextDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startTextDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTextDetectionRequest> request = null;
        Response<StartTextDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTextDetectionRequestMarshaller()
                        .marshall(startTextDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartTextDetectionResult, JsonUnmarshallerContext> unmarshaller = new StartTextDetectionResultJsonUnmarshaller();
            JsonResponseHandler<StartTextDetectionResult> responseHandler = new JsonResponseHandler<StartTextDetectionResult>(
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
     * Stops a running model. The operation might take a while to complete. To
     * check the current status, call <a>DescribeProjectVersions</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:StopProjectVersion</code> action.
     * </p>
     * 
     * @param stopProjectVersionRequest
     * @return stopProjectVersionResult The response from the StopProjectVersion
     *         service method, as returned by Amazon Rekognition.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopProjectVersionResult stopProjectVersion(
            StopProjectVersionRequest stopProjectVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopProjectVersionRequest> request = null;
        Response<StopProjectVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopProjectVersionRequestMarshaller()
                        .marshall(stopProjectVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopProjectVersionResult, JsonUnmarshallerContext> unmarshaller = new StopProjectVersionResultJsonUnmarshaller();
            JsonResponseHandler<StopProjectVersionResult> responseHandler = new JsonResponseHandler<StopProjectVersionResult>(
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
     * Stops a running stream processor that was created by
     * <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param stopStreamProcessorRequest
     * @return stopStreamProcessorResult The response from the
     *         StopStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopStreamProcessorResult stopStreamProcessor(
            StopStreamProcessorRequest stopStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamProcessorRequest> request = null;
        Response<StopStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamProcessorRequestMarshaller()
                        .marshall(stopStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new StopStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<StopStreamProcessorResult> responseHandler = new JsonResponseHandler<StopStreamProcessorResult>(
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
     * Adds one or more key-value tags to an Amazon Rekognition collection,
     * stream processor, or Custom Labels model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging AWS Resources</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Rekognition.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
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
     * Removes one or more tags from an Amazon Rekognition collection, stream
     * processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Rekognition.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
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
     * Adds or updates one or more entries (images) in a dataset. An entry is a
     * JSON Line which contains the information for a single image, including
     * the image location, assigned labels, and object location bounding boxes.
     * For more information, see Image-Level labels in manifest files and Object
     * localization in manifest files in the <i>Amazon Rekognition Custom Labels
     * Developer Guide</i>.
     * </p>
     * <p>
     * If the <code>source-ref</code> field in the JSON line references an
     * existing image, the existing image in the dataset is updated. If
     * <code>source-ref</code> field doesn't reference an existing image, the
     * image is added as a new image to the dataset.
     * </p>
     * <p>
     * You specify the changes that you want to make in the <code>Changes</code>
     * input parameter. There isn't a limit to the number JSON Lines that you
     * can change, but the size of <code>Changes</code> must be less than 5MB.
     * </p>
     * <p>
     * <code>UpdateDatasetEntries</code> returns immediatly, but the dataset
     * update might take a while to complete. Use <a>DescribeDataset</a> to
     * check the current status. The dataset updated successfully if the value
     * of <code>Status</code> is <code>UPDATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occured, call
     * <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset update fails if a terminal error occurs (<code>Status</code> =
     * <code>UPDATE_FAILED</code>). Currently, you can't access the terminal
     * error information from the Amazon Rekognition Custom Labels SDK.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:UpdateDatasetEntries</code> action.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @return updateDatasetEntriesResult The response from the
     *         UpdateDatasetEntries service method, as returned by Amazon
     *         Rekognition.
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDatasetEntriesResult updateDatasetEntries(
            UpdateDatasetEntriesRequest updateDatasetEntriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetEntriesRequest> request = null;
        Response<UpdateDatasetEntriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetEntriesRequestMarshaller()
                        .marshall(updateDatasetEntriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDatasetEntriesResult, JsonUnmarshallerContext> unmarshaller = new UpdateDatasetEntriesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDatasetEntriesResult> responseHandler = new JsonResponseHandler<UpdateDatasetEntriesResult>(
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
     * Allows you to update a stream processor. You can change some settings and
     * regions of interest and delete certain parameters.
     * </p>
     * 
     * @param updateStreamProcessorRequest
     * @return updateStreamProcessorResult The response from the
     *         UpdateStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateStreamProcessorResult updateStreamProcessor(
            UpdateStreamProcessorRequest updateStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamProcessorRequest> request = null;
        Response<UpdateStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamProcessorRequestMarshaller()
                        .marshall(updateStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new UpdateStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<UpdateStreamProcessorResult> responseHandler = new JsonResponseHandler<UpdateStreamProcessorResult>(
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
