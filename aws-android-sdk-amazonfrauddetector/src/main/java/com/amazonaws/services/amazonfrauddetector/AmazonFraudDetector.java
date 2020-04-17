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

package com.amazonaws.services.amazonfrauddetector;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonfrauddetector.model.*;

/**
 * Interface for accessing Amazon Fraud Detector
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers
 * who need detailed information about Amazon Fraud Detector API actions, data
 * types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon
 * Fraud Detector User Guide</a>.
 * </p>
 **/
public interface AmazonFraudDetector {

    /**
     * Overrides the default endpoint for this client
     * ("https://frauddetector.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "frauddetector.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://frauddetector.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex:
     *            "frauddetector.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://frauddetector.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonFraudDetector#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @return batchCreateVariableResult The response from the
     *         BatchCreateVariable service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchCreateVariableResult batchCreateVariable(
            BatchCreateVariableRequest batchCreateVariableRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @return batchGetVariableResult The response from the BatchGetVariable
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchGetVariableResult batchGetVariable(BatchGetVariableRequest batchGetVariableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a detector version. The detector version starts in a
     * <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @return createDetectorVersionResult The response from the
     *         CreateDetectorVersion service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateDetectorVersionResult createDetectorVersion(
            CreateDetectorVersionRequest createDetectorVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a version of the model using the specified model type.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return createModelVersionResult The response from the CreateModelVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateModelVersionResult createModelVersion(CreateModelVersionRequest createModelVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @return createRuleResult The response from the CreateRule service method,
     *         as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @return createVariableResult The response from the CreateVariable service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateVariableResult createVariable(CreateVariableRequest createVariableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the detector. Before deleting a detector, you must first delete
     * all detector versions and rule versions associated with the detector.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return deleteDetectorResult The response from the DeleteDetector service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ConflictException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the detector version. You cannot delete detector versions that
     * are in <code>ACTIVE</code> status.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @return deleteDetectorVersionResult The response from the
     *         DeleteDetectorVersion service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteDetectorVersionResult deleteDetectorVersion(
            DeleteDetectorVersionRequest deleteDetectorVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * 
     * @param deleteEventRequest
     * @return deleteEventResult The response from the DeleteEvent service
     *         method, as returned by Amazon Fraud Detector.
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteEventResult deleteEvent(DeleteEventRequest deleteEventRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the rule version. You cannot delete a rule version if it is used
     * by an <code>ACTIVE</code> or <code>INACTIVE</code> detector version.
     * </p>
     * 
     * @param deleteRuleVersionRequest
     * @return deleteRuleVersionResult The response from the DeleteRuleVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ConflictException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteRuleVersionResult deleteRuleVersion(DeleteRuleVersionRequest deleteRuleVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @return describeDetectorResult The response from the DescribeDetector
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeDetectorResult describeDetector(DescribeDetectorRequest describeDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all of the model versions for the specified model type or for the
     * specified model type and model ID. You can also get details for a single,
     * specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @return describeModelVersionsResult The response from the
     *         DescribeModelVersions service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeModelVersionsResult describeModelVersions(
            DescribeModelVersionsRequest describeModelVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @return getDetectorVersionResult The response from the GetDetectorVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDetectorVersionResult getDetectorVersion(GetDetectorVersionRequest getDetectorVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all of detectors. This is a paginated API. If you provide a null
     * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10
     * records per page. If you provide a <code>maxSizePerPage</code>, the value
     * must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetEventTypesResponse</code> as part of
     * your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @return getDetectorsResult The response from the GetDetectors service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDetectorsResult getDetectors(GetDetectorsRequest getDetectorsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been
     * imported into the service. This is a paginated API. If you provide a null
     * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10
     * records per page. If you provide a <code>maxSizePerPage</code>, the value
     * must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetExternalModelsResult</code> as part of
     * your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @return getExternalModelsResult The response from the GetExternalModels
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetExternalModelsResult getExternalModels(GetExternalModelsRequest getExternalModelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @return getModelVersionResult The response from the GetModelVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetModelVersionResult getModelVersion(GetModelVersionRequest getModelVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all of the models for the AWS account, or the specified model type,
     * or gets a single model for the specified model type, model ID
     * combination.
     * </p>
     * 
     * @param getModelsRequest
     * @return getModelsResult The response from the GetModels service method,
     *         as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null
     * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10
     * records per page. If you provide a <code>maxSizePerPage</code>, the value
     * must be between 50 and 100. To get the next page results, provide the
     * pagination token from the <code>GetOutcomesResult</code> as part of your
     * request. A null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @return getOutcomesResult The response from the GetOutcomes service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetOutcomesResult getOutcomes(GetOutcomesRequest getOutcomesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not
     * provided, the detector’s (<code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getPredictionRequest
     * @return getPredictionResult The response from the GetPrediction service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetPredictionResult getPrediction(GetPredictionRequest getPredictionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all rules available for the specified detector.
     * </p>
     * 
     * @param getRulesRequest
     * @return getRulesResult The response from the GetRules service method, as
     *         returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetRulesResult getRules(GetRulesRequest getRulesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated
     * API. Providing null <code>maxSizePerPage</code> results in retrieving
     * maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get
     * the next page result, a provide a pagination token from
     * <code>GetVariablesResult</code> as part of your request. Null pagination
     * token fetches the records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @return getVariablesResult The response from the GetVariables service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetVariablesResult getVariables(GetVariablesRequest getVariablesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @return putDetectorResult The response from the PutDetector service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutDetectorResult putDetector(PutDetectorRequest putDetectorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use
     * this action to update the configuration of the model endpoint, including
     * the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @return putExternalModelResult The response from the PutExternalModel
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutExternalModelResult putExternalModel(PutExternalModelRequest putExternalModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a model.
     * </p>
     * 
     * @param putModelRequest
     * @return putModelResult The response from the PutModel service method, as
     *         returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutModelResult putModel(PutModelRequest putModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @return putOutcomeResult The response from the PutOutcome service method,
     *         as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutOutcomeResult putOutcome(PutOutcomeRequest putOutcomeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can
     * update include models, external model endpoints, rules, and description.
     * You can only update a <code>DRAFT</code> detector version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @return updateDetectorVersionResult The response from the
     *         UpdateDetectorVersion service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDetectorVersionResult updateDetectorVersion(
            UpdateDetectorVersionRequest updateDetectorVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata
     * for any detector version (<code>DRAFT, ACTIVE,</code> or
     * <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @return updateDetectorVersionMetadataResult The response from the
     *         UpdateDetectorVersionMetadata service method, as returned by
     *         Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDetectorVersionMetadataResult updateDetectorVersionMetadata(
            UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following
     * promotions or demotions using <code>UpdateDetectorVersionStatus</code>:
     * <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @return updateDetectorVersionStatusResult The response from the
     *         UpdateDetectorVersionStatus service method, as returned by Amazon
     *         Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDetectorVersionStatusResult updateDetectorVersionStatus(
            UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a model version. You can update the description and status
     * attributes using this action. You can perform the following status
     * updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code> back to <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionRequest
     * @return updateModelVersionResult The response from the UpdateModelVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateModelVersionResult updateModelVersion(UpdateModelVersionRequest updateModelVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a rule's metadata.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @return updateRuleMetadataResult The response from the UpdateRuleMetadata
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateRuleMetadataResult updateRuleMetadata(UpdateRuleMetadataRequest updateRuleMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a rule version resulting in a new rule version.
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @return updateRuleVersionResult The response from the UpdateRuleVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest updateRuleVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @return updateVariableResult The response from the UpdateVariable service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateVariableResult updateVariable(UpdateVariableRequest updateVariableRequest)
            throws AmazonClientException, AmazonServiceException;

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
