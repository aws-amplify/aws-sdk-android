/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.rekognition.model.*;

/**
 * Interface for accessing Amazon Rekognition
 * <p>
 * This is the Amazon Rekognition API reference.
 * </p>
 **/
public interface AmazonRekognition {

    /**
     * Overrides the default endpoint for this client
     * ("https://rekognition.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "rekognition.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://rekognition.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "rekognition.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://rekognition.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonRekognition#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100
     * largest faces detected in the <i>target</i> input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the
     * largest face and compares it with each face detected in the target image.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes
     * or as a references to images in an Amazon S3 bucket. If you use the
     * Amazon CLI to call Amazon Rekognition operations, passing image bytes is
     * not supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by
     * similarity score in descending order. For each face match, the response
     * provides a bounding box of the face, facial landmarks, pose details
     * (pitch, role, and yaw), quality (brightness and sharpness), and
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
     * For an example, see <a>faces-compare-images</a>.
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
    CompareFacesResult compareFaces(CompareFacesRequest compareFacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the
     * collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your
     * application users. A user can then index faces using the
     * <code>IndexFaces</code> operation and persist results in a specific
     * collection. Then, a user can search the collection for faces in the
     * user-specific container.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateCollection</code> action.
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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCollectionResult createCollection(CreateCollectionRequest createCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Rekognition stream processor that you can use to detect
     * and recognize faces in a streaming video.
     * </p>
     * <p>
     * Rekognition Video is a consumer of live video from Amazon Kinesis Video
     * Streams. Rekognition Video sends analysis results to Amazon Kinesis Data
     * Streams.
     * </p>
     * <p>
     * You provide as input a Kinesis video stream (<code>Input</code>) and a
     * Kinesis data stream (<code>Output</code>) stream. You also specify the
     * face recognition criteria in <code>Settings</code>. For example, the
     * collection containing faces that you want to recognize. Use
     * <code>Name</code> to assign an identifier for the stream processor. You
     * use <code>Name</code> to manage the stream processor. For example, you
     * can start processing the source video by calling with the
     * <code>Name</code> field.
     * </p>
     * <p>
     * After you have finished analyzing a streaming video, use to stop
     * processing. You can delete the stream processor by calling .
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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateStreamProcessorResult createStreamProcessor(
            CreateStreamProcessorRequest createStreamProcessorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all
     * faces in the collection. For an example, see
     * <a>delete-collection-procedure</a>.
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
    DeleteCollectionResult deleteCollection(DeleteCollectionRequest deleteCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

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
    DeleteFacesResult deleteFaces(DeleteFacesRequest deleteFacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the stream processor identified by <code>Name</code>. You assign
     * the value for <code>Name</code> when you create the stream processor with
     * . You might not be able to use the same name for a stream processor for a
     * few seconds after calling <code>DeleteStreamProcessor</code>.
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
    DeleteStreamProcessorResult deleteStreamProcessor(
            DeleteStreamProcessorRequest deleteStreamProcessorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about a stream processor created by . You can get
     * information about the input and output streams, the input parameters for
     * the face recognition being performed, and the current status of the
     * stream processor.
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
    DescribeStreamProcessorResult describeStreamProcessor(
            DescribeStreamProcessorRequest describeStreamProcessorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For
     * each face detected, the operation returns face details including a
     * bounding box of the face, a confidence value (that the bounding box
     * contains a face), and a fixed set of attributes such as facial landmarks
     * (for example, coordinates of eye and mouth), gender, presence of beard,
     * sunglasses, etc.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For
     * non-frontal or obscured faces, the algorithm may not detect the faces or
     * might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>procedure-detecting-faces-in-images</a>.
     * </p>
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
    DetectFacesResult detectFaces(DetectFacesRequest detectFacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detects instances of real-world entities within an image (JPEG or PNG)
     * provided as input. This includes objects like flower, tree, and table;
     * events like wedding, graduation, and birthday party; and concepts like
     * landscape, evening, and nature. For an example, see <a>images-s3</a>.
     * </p>
     * <note>
     * <p>
     * <code>DetectLabels</code> does not support the detection of activities.
     * However, activity detection is supported for label detection in videos.
     * For more information, see .
     * </p>
     * </note>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference
     * to an image in an Amazon S3 bucket. If you use the Amazon CLI to call
     * Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels.
     * Each label provides the object name, and the level of confidence that the
     * image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response will include all three
     * labels, one for each object.
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
     * In the preceding example, the operation returns one label for each of the
     * three objects. The operation can also return multiple labels for the same
     * object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
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
     * <p>
     * In response, the API returns an array of labels. In addition, the
     * response also includes the orientation correction. Optionally, you can
     * specify <code>MinConfidence</code> to control the confidence threshold
     * for the labels returned. The default is 50%. You can also add the
     * <code>MaxLabels</code> parameter to limit the number of labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the
     * same facial details that the <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
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
    DetectLabelsResult detectLabels(DetectLabelsRequest detectLabelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detects explicit or suggestive adult content in a specified JPEG or PNG
     * format image. Use <code>DetectModerationLabels</code> to moderate images
     * depending on your requirements. For example, you might want to filter
     * images that contain nudity, but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by
     * <code>DetectModerationLabels</code> to determine which types of content
     * are appropriate. For information about moderation labels, see
     * <a>moderation</a>.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DetectModerationLabelsResult detectModerationLabels(
            DetectModerationLabelsRequest detectModerationLabelsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * elements, <code>TextDetections</code>. Each <code>TextDetection</code>
     * element provides information about a single word or line of text that was
     * detected in the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not
     * separated by spaces. <code>DetectText</code> can detect up to 50 words in
     * an image.
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
     * To be detected, text must be within +/- 30 degrees orientation of the
     * horizontal axis.
     * </p>
     * <p>
     * For more information, see <a>text-detection</a>.
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
    DetectTextResult detectText(DetectTextRequest detectTextRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on his
     * or her Rekognition ID. The additional information is returned as an array
     * of URLs. If there is no additional information about the celebrity, this
     * list is empty. For more information, see
     * <a>get-celebrity-info-procedure</a>.
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
    GetCelebrityInfoResult getCelebrityInfo(GetCelebrityInfoRequest getCelebrityInfoRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the celebrity recognition results for a Rekognition Video analysis
     * started by .
     * </p>
     * <p>
     * Celebrity recognition in a video is an asynchronous operation. Analysis
     * is started by a call to which returns a job identifier (
     * <code>JobId</code>). When the celebrity recognition operation finishes,
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to
     * <code>StartCelebrityRecognition</code>. To get the results of the
     * celebrity recognition analysis, first check that the status value
     * published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetCelebrityDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartCelebrityDetection</code>. For more information, see
     * <a>video</a>.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the
     * time(s) they are detected in an array (<code>Celebrities</code>) of
     * objects. Each <code>CelebrityRecognition</code> contains information
     * about the celebrity in a object and the time, <code>Timestamp</code>, the
     * celebrity was detected.
     * </p>
     * <p>
     * By default, the <code>Celebrities</code> array is sorted by time
     * (milliseconds from the start of the video). You can also sort the array
     * by celebrity by specifying the value <code>ID</code> in the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The <code>CelebrityDetail</code> object includes the celebrity identifer
     * and additional information urls. If you don't store the additional
     * information urls, you can get them later by calling with the celebrity
     * identifer.
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
    GetCelebrityRecognitionResult getCelebrityRecognition(
            GetCelebrityRecognitionRequest getCelebrityRecognitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the content moderation analysis results for a Rekognition Video
     * analysis started by .
     * </p>
     * <p>
     * Content moderation analysis of a video is an asynchronous operation. You
     * start analysis by calling . which returns a job identifier (
     * <code>JobId</code>). When analysis finishes, Rekognition Video publishes
     * a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartContentModeration</code>. To
     * get the results of the content moderation analysis, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call <code>GetCelebrityDetection</code> and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartCelebrityDetection</code>. For more information, see
     * <a>video</a>.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected content moderation
     * labels, and the time they are detected, in an array,
     * <code>ModerationLabels</code>, of objects.
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
     * For more information, see <a>moderation</a>.
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
    GetContentModerationResult getContentModeration(
            GetContentModerationRequest getContentModerationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets face detection results for a Rekognition Video analysis started by .
     * </p>
     * <p>
     * Face detection with Rekognition Video is an asynchronous operation. You
     * start face detection by calling which returns a job identifier (
     * <code>JobId</code>). When the face detection operation finishes,
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to
     * <code>StartFaceDetection</code>. To get the results of the face detection
     * operation, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. If so, call and pass the job identifier
     * (<code>JobId</code>) from the initial call to
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
    GetFaceDetectionResult getFaceDetection(GetFaceDetectionRequest getFaceDetectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the face search results for Rekognition Video face search started by
     * . The search returns faces in a collection that match the faces of
     * persons detected in a video. It also includes the time(s) that faces are
     * matched in the video.
     * </p>
     * <p>
     * Face search in a video is an asynchronous operation. You start face
     * search by calling to which returns a job identifier (<code>JobId</code>).
     * When the search operation finishes, Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartFaceSearch</code>. To get
     * the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetFaceSearch</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>
     * . For more information, see <a>collections</a>.
     * </p>
     * <p>
     * The search results are retured in an array, <code>Persons</code>, of
     * objects. Each<code>PersonMatch</code> element contains details about the
     * matching faces in the input collection, person information for the
     * matched person, and the time the person was matched in the video.
     * </p>
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
    GetFaceSearchResult getFaceSearch(GetFaceSearchRequest getFaceSearchRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the label detection results of a Rekognition Video analysis started
     * by .
     * </p>
     * <p>
     * The label detection operation is started by a call to which returns a job
     * identifier (<code>JobId</code>). When the label detection operation
     * finishes, Amazon Rekognition publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to
     * <code>StartlabelDetection</code>. To get the results of the label
     * detection operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (
     * <code>Labels</code>) sorted by the time the labels were detected. You can
     * also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The labels returned include the label name, the percentage confidence in
     * the accuracy of the detected label, and the time the label was detected
     * in the video.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there
     * are more results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetlabelDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetLabelDetection</code>.
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
    GetLabelDetectionResult getLabelDetection(GetLabelDetectionRequest getLabelDetectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the person tracking results of a Rekognition Video analysis started
     * by .
     * </p>
     * <p>
     * The person detection operation is started by a call to
     * <code>StartPersonTracking</code> which returns a job identifier (
     * <code>JobId</code>). When the person detection operation finishes,
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * To get the results of the person tracking operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call and pass the job identifier (<code>JobId</code>) from the
     * initial call to <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * <code>GetPersonTracking</code> returns an array, <code>Persons</code>, of
     * tracked persons and the time(s) they were tracked in the video.
     * </p>
     * <p>
     * By default, the array is sorted by the time(s) a person is tracked in the
     * video. You can sort by tracked persons by specifying <code>INDEX</code>
     * for the <code>SortBy</code> input parameter.
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
    GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest getPersonTrackingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified
     * collection.
     * </p>
     * <p>
     * Amazon Rekognition does not save the actual faces detected. Instead, the
     * underlying detection algorithm first detects the faces in the input
     * image, and for each face extracts facial features into a feature vector,
     * and stores it in the back-end database. Amazon Rekognition uses feature
     * vectors when performing face match and search operations using the and
     * operations.
     * </p>
     * <p>
     * If you are using version 1.0 of the face detection model,
     * <code>IndexFaces</code> indexes the 15 largest faces in the input image.
     * Later versions of the face detection model index the 100 largest faces in
     * the input image. To determine which version of the model you are using,
     * check the the value of <code>FaceModelVersion</code> in the response from
     * <code>IndexFaces</code>. For more information, see
     * <a>face-detection-model</a>.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageID</code> for the input
     * image you provided, Amazon Rekognition associates this ID with all faces
     * that it detects. When you call the operation, the response returns the
     * external ID. You can use this external image ID to create a client-side
     * index to associate the faces with each image. You can then use the index
     * to find all faces in an image.
     * </p>
     * <p>
     * In response, the operation returns an array of metadata for all detected
     * faces. This includes, the bounding box of the detected face, confidence
     * value (indicating the bounding box contains a face), a face ID assigned
     * by the service for each face that is detected and stored, and an image ID
     * assigned by the service for the input image. If you request all facial
     * attributes (using the <code>detectionAttributes</code> parameter, Amazon
     * Rekognition returns detailed facial attributes such as facial landmarks
     * (for example, location of eye and mount) and other facial attributes such
     * gender. If you provide the same image, specify the same collection, and
     * use the same external ID in the <code>IndexFaces</code> operation, Amazon
     * Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * The input image is passed either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    IndexFacesResult indexFaces(IndexFacesRequest indexFacesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is
     * truncated, the response also provides a <code>NextToken</code> that you
     * can use in the subsequent request to fetch the next set of collection
     * IDs.
     * </p>
     * <p>
     * For an example, see <a>list-collection-procedure</a>.
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
    ListCollectionsResult listCollections(ListCollectionsRequest listCollectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata
     * includes information such as the bounding box coordinates, the confidence
     * (that the bounding box contains a face), and face ID. For an example, see
     * <a>list-faces-in-collection-procedure</a>.
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
    ListFacesResult listFaces(ListFacesRequest listFacesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a list of stream processors that you have created with .
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
    ListStreamProcessorsResult listStreamProcessors(
            ListStreamProcessorsRequest listStreamProcessorsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more
     * information, see <a>celebrities</a>.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 100 largest faces in the
     * image. It lists recognized celebrities in the <code>CelebrityFaces</code>
     * array and unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces
     * are not amongst the largest 100 faces in the image.
     * </p>
     * <p>
     * For each celebrity recognized, the <code>RecognizeCelebrities</code>
     * returns a <code>Celebrity</code> object. The <code>Celebrity</code>
     * object contains the celebrity name, ID, URL links to additional
     * information, match confidence, and a <code>ComparedFace</code> object
     * that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Rekognition does not retain information about which images a celebrity
     * has been recognized in. Your application must store this information and
     * use the <code>Celebrity</code> ID property as a unique identifier for the
     * celebrity. If you don't store the celebrity name or additional
     * information URLs returned by <code>RecognizeCelebrities</code>, you will
     * need the ID to identify the celebrity in a call to the operation.
     * </p>
     * <p>
     * You pass the imput image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see <a>celebrities-procedure-image</a>.
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
    RecognizeCelebritiesResult recognizeCelebrities(
            RecognizeCelebritiesRequest recognizeCelebritiesRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * For an example, see <a>search-face-with-id-procedure</a>.
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
    SearchFacesResult searchFaces(SearchFacesRequest searchFacesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * operation, and then use the face IDs returned in subsequent calls to the
     * operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the
     * bounding boxes in the response to make face crops, which then you can
     * pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
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
     * For an example, see <a>search-face-with-image-procedure</a>.
     * </p>
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
    SearchFacesByImageResult searchFacesByImage(SearchFacesByImageRequest searchFacesByImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts asynchronous recognition of celebrities in a stored video.
     * </p>
     * <p>
     * Rekognition Video can detect celebrities in a video must be stored in an
     * Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the
     * filename of the video. <code>StartCelebrityRecognition</code> returns a
     * job identifier (<code>JobId</code>) which you use to get the results of
     * the analysis. When celebrity recognition analysis is finished,
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in
     * <code>NotificationChannel</code>. To get the results of the celebrity
     * recognition analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartCelebrityRecognition</code>. For more information, see
     * <a>celebrities</a>.
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
    StartCelebrityRecognitionResult startCelebrityRecognition(
            StartCelebrityRecognitionRequest startCelebrityRecognitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts asynchronous detection of explicit or suggestive adult content in
     * a stored video.
     * </p>
     * <p>
     * Rekognition Video can moderate content in a video stored in an Amazon S3
     * bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartContentModeration</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the analysis.
     * When content moderation analysis is finished, Rekognition Video publishes
     * a completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content moderation analysis, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartContentModeration</code>. For more information, see
     * <a>moderation</a>.
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
    StartContentModerationResult startContentModeration(
            StartContentModerationRequest startContentModerationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts asynchronous detection of faces in a stored video.
     * </p>
     * <p>
     * Rekognition Video can detect faces in a video stored in an Amazon S3
     * bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartFaceDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When face detection is finished, Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>. To get the results of the label
     * detection operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>. For more information, see
     * <a>faces-video</a>.
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
    StartFaceDetectionResult startFaceDetection(StartFaceDetectionRequest startFaceDetectionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * When searching is finished, Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>. To get the search results, first
     * check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>
     * . For more information, see <a>collections-search-person</a>.
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
    StartFaceSearchResult startFaceSearch(StartFaceSearchRequest startFaceSearchRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts asynchronous detection of labels in a stored video.
     * </p>
     * <p>
     * Rekognition Video can detect labels in a video. Labels are instances of
     * real-world entities. This includes objects like flower, tree, and table;
     * events like wedding, graduation, and birthday party; concepts like
     * landscape, evening, and nature; and activities like a person getting out
     * of a car or a person skiing.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video.
     * <code>StartLabelDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation.
     * When label detection is finished, Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call and pass the job identifier (<code>JobId</code>) from the
     * initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p/>
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
    StartLabelDetectionResult startLabelDetection(
            StartLabelDetectionRequest startLabelDetectionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts the asynchronous tracking of persons in a stored video.
     * </p>
     * <p>
     * Rekognition Video can track persons in a video stored in an Amazon S3
     * bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartPersonTracking</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation.
     * When label detection is finished, Amazon Rekognition publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the person detection operation, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call and pass the job identifier (
     * <code>JobId</code>) from the initial call to
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
    StartPersonTrackingResult startPersonTracking(
            StartPersonTrackingRequest startPersonTrackingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts processing a stream processor. You create a stream processor by
     * calling . To tell <code>StartStreamProcessor</code> which stream
     * processor to start, use the value of the <code>Name</code> field
     * specified in the call to <code>CreateStreamProcessor</code>.
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
    StartStreamProcessorResult startStreamProcessor(
            StartStreamProcessorRequest startStreamProcessorRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops a running stream processor that was created by .
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
    StopStreamProcessorResult stopStreamProcessor(
            StopStreamProcessorRequest stopStreamProcessorRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
