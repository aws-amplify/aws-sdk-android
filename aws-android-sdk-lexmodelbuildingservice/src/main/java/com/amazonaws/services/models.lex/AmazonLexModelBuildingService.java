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

package com.amazonaws.services.models.lex;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.models.lex.model.*;

/**
 * Interface for accessing Amazon Lex Model Building Service <fullname>Amazon
 * Lex Build-Time Actions</fullname>
 * <p>
 * Amazon Lex is an AWS service for building conversational voice and text
 * interfaces. Use these actions to create, update, and delete conversational
 * bots for new and existing client applications.
 * </p>
 **/
public interface AmazonLexModelBuildingService {

    /**
     * Overrides the default endpoint for this client
     * ("https://models.lex.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "models.lex.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://models.lex.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "models.lex.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://models.lex.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to
     * {@link AmazonLexModelBuildingService#setEndpoint(String)}, sets the
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
     * Creates a new version of the bot based on the <code>$LATEST</code>
     * version. If the <code>$LATEST</code> version of this resource hasn't
     * changed since you created the last version, Amazon Lex doesn't create a
     * new version. It returns the last created version.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of the bot. You
     * can't update the numbered versions that you create with the
     * <code>CreateBotVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create the first version of a bot, Amazon Lex sets the version
     * to 1. Subsequent versions increment by 1. For more information, see
     * <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lex:CreateBotVersion</code> action.
     * </p>
     * 
     * @param createBotVersionRequest
     * @return createBotVersionResult The response from the CreateBotVersion
     *         service method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateBotVersionResult createBotVersion(CreateBotVersionRequest createBotVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new version of an intent based on the <code>$LATEST</code>
     * version of the intent. If the <code>$LATEST</code> version of this intent
     * hasn't changed since you last updated it, Amazon Lex doesn't create a new
     * version. It returns the last version you created.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of the intent. You
     * can't update the numbered versions that you create with the
     * <code>CreateIntentVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create a version of an intent, Amazon Lex sets the version to 1.
     * Subsequent versions increment by 1. For more information, see
     * <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>lex:CreateIntentVersion</code> action.
     * </p>
     * 
     * @param createIntentVersionRequest
     * @return createIntentVersionResult The response from the
     *         CreateIntentVersion service method, as returned by Amazon Lex
     *         Model Building Service.
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateIntentVersionResult createIntentVersion(
            CreateIntentVersionRequest createIntentVersionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new version of a slot type based on the <code>$LATEST</code>
     * version of the specified slot type. If the <code>$LATEST</code> version
     * of this resource has not changed since the last version that you created,
     * Amazon Lex doesn't create a new version. It returns the last version that
     * you created.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of a slot type. You
     * can't update the numbered versions that you create with the
     * <code>CreateSlotTypeVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create a version of a slot type, Amazon Lex sets the version to
     * 1. Subsequent versions increment by 1. For more information, see
     * <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:CreateSlotTypeVersion</code> action.
     * </p>
     * 
     * @param createSlotTypeVersionRequest
     * @return createSlotTypeVersionResult The response from the
     *         CreateSlotTypeVersion service method, as returned by Amazon Lex
     *         Model Building Service.
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateSlotTypeVersionResult createSlotTypeVersion(
            CreateSlotTypeVersionRequest createSlotTypeVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes all versions of the bot, including the <code>$LATEST</code>
     * version. To delete a specific version of the bot, use the
     * <a>DeleteBotVersion</a> operation. The <code>DeleteBot</code> operation
     * doesn't immediately remove the bot schema. Instead, it is marked for
     * deletion and removed later.
     * </p>
     * <p>
     * Amazon Lex stores utterances indefinitely for improving the ability of
     * your bot to respond to user inputs. These utterances are not removed when
     * the bot is deleted. To remove the utterances, use the
     * <a>DeleteUtterances</a> operation.
     * </p>
     * <p>
     * If a bot has an alias, you can't delete it. Instead, the
     * <code>DeleteBot</code> operation returns a
     * <code>ResourceInUseException</code> exception that includes a reference
     * to the alias that refers to the bot. To remove the reference to the bot,
     * delete the alias. If you get the same exception again, delete the
     * referring alias until the <code>DeleteBot</code> operation is successful.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBot</code>
     * action.
     * </p>
     * 
     * @param deleteBotRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteBot(DeleteBotRequest deleteBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an alias for the specified bot.
     * </p>
     * <p>
     * You can't delete an alias that is used in the association between a bot
     * and a messaging channel. If an alias is used in a channel association,
     * the <code>DeleteBot</code> operation returns a
     * <code>ResourceInUseException</code> exception that includes a reference
     * to the channel association that refers to the bot. You can remove the
     * reference to the alias by deleting the channel association. If you get
     * the same exception again, delete the referring association until the
     * <code>DeleteBotAlias</code> operation is successful.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteBotAlias(DeleteBotAliasRequest deleteBotAliasRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the association between an Amazon Lex bot and a messaging
     * platform.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lex:DeleteBotChannelAssociation</code> action.
     * </p>
     * 
     * @param deleteBotChannelAssociationRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteBotChannelAssociation(
            DeleteBotChannelAssociationRequest deleteBotChannelAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all versions of a bot, use
     * the <a>DeleteBot</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:DeleteBotVersion</code> action.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteBotVersion(DeleteBotVersionRequest deleteBotVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes all versions of the intent, including the <code>$LATEST</code>
     * version. To delete a specific version of the intent, use the
     * <a>DeleteIntentVersion</a> operation.
     * </p>
     * <p>
     * You can delete a version of an intent only if it is not referenced. To
     * delete an intent that is referred to in one or more bots (see
     * <a>how-it-works</a>), you must remove those references first.
     * </p>
     * <note>
     * <p>
     * If you get the <code>ResourceInUseException</code> exception, it provides
     * an example reference that shows where the intent is referenced. To remove
     * the reference to the intent, either update the bot or delete it. If you
     * get the same exception when you attempt to delete the intent again,
     * repeat until the intent has no references and the call to
     * <code>DeleteIntent</code> is successful.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>lex:DeleteIntent</code>
     * action.
     * </p>
     * 
     * @param deleteIntentRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteIntent(DeleteIntentRequest deleteIntentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a specific version of an intent. To delete all versions of a
     * intent, use the <a>DeleteIntent</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:DeleteIntentVersion</code> action.
     * </p>
     * 
     * @param deleteIntentVersionRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteIntentVersion(DeleteIntentVersionRequest deleteIntentVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes all versions of the slot type, including the <code>$LATEST</code>
     * version. To delete a specific version of the slot type, use the
     * <a>DeleteSlotTypeVersion</a> operation.
     * </p>
     * <p>
     * You can delete a version of a slot type only if it is not referenced. To
     * delete a slot type that is referred to in one or more intents, you must
     * remove those references first.
     * </p>
     * <note>
     * <p>
     * If you get the <code>ResourceInUseException</code> exception, the
     * exception provides an example reference that shows the intent where the
     * slot type is referenced. To remove the reference to the slot type, either
     * update the intent or delete it. If you get the same exception when you
     * attempt to delete the slot type again, repeat until the slot type has no
     * references and the <code>DeleteSlotType</code> call is successful.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the
     * <code>lex:DeleteSlotType</code> action.
     * </p>
     * 
     * @param deleteSlotTypeRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteSlotType(DeleteSlotTypeRequest deleteSlotTypeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a specific version of a slot type. To delete all versions of a
     * slot type, use the <a>DeleteSlotType</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:DeleteSlotTypeVersion</code> action.
     * </p>
     * 
     * @param deleteSlotTypeVersionRequest
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteSlotTypeVersion(DeleteSlotTypeVersionRequest deleteSlotTypeVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes stored utterances.
     * </p>
     * <p>
     * Amazon Lex stores the utterances that users send to your bot. Utterances
     * are stored for 15 days for use with the <a>GetUtterancesView</a>
     * operation, and then stored indefinitely for use in improving the ability
     * of your bot to respond to user input.
     * </p>
     * <p>
     * Use the <code>DeleteUtterances</code> operation to manually delete stored
     * utterances for a specific user. When you use the
     * <code>DeleteUtterances</code> operation, utterances stored for improving
     * your bot's ability to respond to user input are deleted immediately.
     * Utterances stored for use with the <code>GetUtterancesView</code>
     * operation are deleted after 15 days.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:DeleteUtterances</code> action.
     * </p>
     * 
     * @param deleteUtterancesRequest
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void deleteUtterances(DeleteUtterancesRequest deleteUtterancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata information for a specific bot. You must provide the bot
     * name and the bot version or alias.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBot</code>
     * action.
     * </p>
     * 
     * @param getBotRequest
     * @return getBotResult The response from the GetBot service method, as
     *         returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotResult getBot(GetBotRequest getBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about an Amazon Lex bot alias. For more information
     * about aliases, see <a>versioning-aliases</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAlias</code>
     * action.
     * </p>
     * 
     * @param getBotAliasRequest
     * @return getBotAliasResult The response from the GetBotAlias service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotAliasResult getBotAlias(GetBotAliasRequest getBotAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of aliases for a specified Amazon Lex bot.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:GetBotAliases</code> action.
     * </p>
     * 
     * @param getBotAliasesRequest
     * @return getBotAliasesResult The response from the GetBotAliases service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotAliasesResult getBotAliases(GetBotAliasesRequest getBotAliasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the association between an Amazon Lex bot and a
     * messaging platform.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:GetBotChannelAssociation</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationRequest
     * @return getBotChannelAssociationResult The response from the
     *         GetBotChannelAssociation service method, as returned by Amazon
     *         Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotChannelAssociationResult getBotChannelAssociation(
            GetBotChannelAssociationRequest getBotChannelAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all of the channels associated with the specified bot.
     * </p>
     * <p>
     * The <code>GetBotChannelAssociations</code> operation requires permissions
     * for the <code>lex:GetBotChannelAssociations</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationsRequest
     * @return getBotChannelAssociationsResult The response from the
     *         GetBotChannelAssociations service method, as returned by Amazon
     *         Lex Model Building Service.
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotChannelAssociationsResult getBotChannelAssociations(
            GetBotChannelAssociationsRequest getBotChannelAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about all of the versions of a bot.
     * </p>
     * <p>
     * The <code>GetBotVersions</code> operation returns a
     * <code>BotMetadata</code> object for each version of a bot. For example,
     * if a bot has three numbered versions, the <code>GetBotVersions</code>
     * operation returns four <code>BotMetadata</code> objects in the response,
     * one for each numbered version and one for the <code>$LATEST</code>
     * version.
     * </p>
     * <p>
     * The <code>GetBotVersions</code> operation always returns at least one
     * version, the <code>$LATEST</code> version.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:GetBotVersions</code> action.
     * </p>
     * 
     * @param getBotVersionsRequest
     * @return getBotVersionsResult The response from the GetBotVersions service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotVersionsResult getBotVersions(GetBotVersionsRequest getBotVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns bot information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the <code>nameContains</code> field, the response includes
     * information for the <code>$LATEST</code> version of all bots whose name
     * contains the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, the operation
     * returns information about the <code>$LATEST</code> version of all of your
     * bots.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permission for the <code>lex:GetBots</code>
     * action.
     * </p>
     * 
     * @param getBotsRequest
     * @return getBotsResult The response from the GetBots service method, as
     *         returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBotsResult getBots(GetBotsRequest getBotsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a built-in intent.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lex:GetBuiltinIntent</code> action.
     * </p>
     * 
     * @param getBuiltinIntentRequest
     * @return getBuiltinIntentResult The response from the GetBuiltinIntent
     *         service method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBuiltinIntentResult getBuiltinIntent(GetBuiltinIntentRequest getBuiltinIntentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of built-in intents that meet the specified criteria.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lex:GetBuiltinIntents</code> action.
     * </p>
     * 
     * @param getBuiltinIntentsRequest
     * @return getBuiltinIntentsResult The response from the GetBuiltinIntents
     *         service method, as returned by Amazon Lex Model Building Service.
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBuiltinIntentsResult getBuiltinIntents(GetBuiltinIntentsRequest getBuiltinIntentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of built-in slot types that meet the specified criteria.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lex:GetBuiltInSlotTypes</code> action.
     * </p>
     * 
     * @param getBuiltinSlotTypesRequest
     * @return getBuiltinSlotTypesResult The response from the
     *         GetBuiltinSlotTypes service method, as returned by Amazon Lex
     *         Model Building Service.
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBuiltinSlotTypesResult getBuiltinSlotTypes(
            GetBuiltinSlotTypesRequest getBuiltinSlotTypesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Exports the contents of a Amazon Lex resource in a specified format.
     * </p>
     * 
     * @param getExportRequest
     * @return getExportResult The response from the GetExport service method,
     *         as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetExportResult getExport(GetExportRequest getExportRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about an import job started with the
     * <code>StartImport</code> operation.
     * </p>
     * 
     * @param getImportRequest
     * @return getImportResult The response from the GetImport service method,
     *         as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetImportResult getImport(GetImportRequest getImportRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about an intent. In addition to the intent name, you
     * must specify the intent version.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>lex:GetIntent</code> action.
     * </p>
     * 
     * @param getIntentRequest
     * @return getIntentResult The response from the GetIntent service method,
     *         as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetIntentResult getIntent(GetIntentRequest getIntentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about all of the versions of an intent.
     * </p>
     * <p>
     * The <code>GetIntentVersions</code> operation returns an
     * <code>IntentMetadata</code> object for each version of an intent. For
     * example, if an intent has three numbered versions, the
     * <code>GetIntentVersions</code> operation returns four
     * <code>IntentMetadata</code> objects in the response, one for each
     * numbered version and one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetIntentVersions</code> operation always returns at least one
     * version, the <code>$LATEST</code> version.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:GetIntentVersions</code> action.
     * </p>
     * 
     * @param getIntentVersionsRequest
     * @return getIntentVersionsResult The response from the GetIntentVersions
     *         service method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetIntentVersionsResult getIntentVersions(GetIntentVersionsRequest getIntentVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns intent information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify the <code>nameContains</code> field, returns the
     * <code>$LATEST</code> version of all intents that contain the specified
     * string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, returns
     * information about the <code>$LATEST</code> version of all intents.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operation requires permission for the <code>lex:GetIntents</code>
     * action.
     * </p>
     * 
     * @param getIntentsRequest
     * @return getIntentsResult The response from the GetIntents service method,
     *         as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetIntentsResult getIntents(GetIntentsRequest getIntentsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a specific version of a slot type. In addition
     * to specifying the slot type name, you must specify the slot type version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetSlotType</code>
     * action.
     * </p>
     * 
     * @param getSlotTypeRequest
     * @return getSlotTypeResult The response from the GetSlotType service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetSlotTypeResult getSlotType(GetSlotTypeRequest getSlotTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about all versions of a slot type.
     * </p>
     * <p>
     * The <code>GetSlotTypeVersions</code> operation returns a
     * <code>SlotTypeMetadata</code> object for each version of a slot type. For
     * example, if a slot type has three numbered versions, the
     * <code>GetSlotTypeVersions</code> operation returns four
     * <code>SlotTypeMetadata</code> objects in the response, one for each
     * numbered version and one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetSlotTypeVersions</code> operation always returns at least
     * one version, the <code>$LATEST</code> version.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:GetSlotTypeVersions</code> action.
     * </p>
     * 
     * @param getSlotTypeVersionsRequest
     * @return getSlotTypeVersionsResult The response from the
     *         GetSlotTypeVersions service method, as returned by Amazon Lex
     *         Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetSlotTypeVersionsResult getSlotTypeVersions(
            GetSlotTypeVersionsRequest getSlotTypeVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns slot type information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify the <code>nameContains</code> field, returns the
     * <code>$LATEST</code> version of all slot types that contain the specified
     * string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, returns
     * information about the <code>$LATEST</code> version of all slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operation requires permission for the <code>lex:GetSlotTypes</code>
     * action.
     * </p>
     * 
     * @param getSlotTypesRequest
     * @return getSlotTypesResult The response from the GetSlotTypes service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetSlotTypesResult getSlotTypes(GetSlotTypesRequest getSlotTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use the <code>GetUtterancesView</code> operation to get information about
     * the utterances that your users have made to your bot. You can use this
     * list to tune the utterances that your bot responds to.
     * </p>
     * <p>
     * For example, say that you have created a bot to order flowers. After your
     * users have used your bot for a while, use the
     * <code>GetUtterancesView</code> operation to see the requests that they
     * have made and whether they have been successful. You might find that the
     * utterance "I want flowers" is not being recognized. You could add this
     * utterance to the <code>OrderFlowers</code> intent so that your bot
     * recognizes that utterance.
     * </p>
     * <p>
     * After you publish a new version of a bot, you can get information about
     * the old version and the new so that you can compare the performance
     * across the two versions.
     * </p>
     * <p>
     * Utterance statistics are generated once a day. Data is available for the
     * last 15 days. You can request information for up to 5 versions of your
     * bot in each request. Amazon Lex returns the most frequent utterances
     * received by the bot in the last 15 days. The response contains
     * information about a maximum of 100 utterances for each version.
     * </p>
     * <p>
     * If you set <code>childDirected</code> field to true when you created your
     * bot, or if you opted out of participating in improving Amazon Lex,
     * utterances are not available.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>lex:GetUtterancesView</code> action.
     * </p>
     * 
     * @param getUtterancesViewRequest
     * @return getUtterancesViewResult The response from the GetUtterancesView
     *         service method, as returned by Amazon Lex Model Building Service.
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetUtterancesViewResult getUtterancesView(GetUtterancesViewRequest getUtterancesViewRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of tags associated with the specified resource. Only bots,
     * bot aliases, and bot channels can have tags associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Lex
     *         Model Building Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Lex conversational bot or replaces an existing bot.
     * When you create or update a bot you are only required to specify a name,
     * a locale, and whether the bot is directed toward children under age 13.
     * You can use this to add intents later, or to remove intents from an
     * existing bot. When you create a bot with the minimum information, the bot
     * is created or updated but Amazon Lex returns the
     * <code/> response <code>FAILED</code>. You can build the bot after you add
     * one or more intents. For more information about Amazon Lex bots, see
     * <a>how-it-works</a>.
     * </p>
     * <p>
     * If you specify the name of an existing bot, the fields in the request
     * replace the existing values in the <code>$LATEST</code> version of the
     * bot. Amazon Lex removes any fields that you don't provide values for in
     * the request, except for the <code>idleTTLInSeconds</code> and
     * <code>privacySettings</code> fields, which are set to their default
     * values. If you don't specify values for required fields, Amazon Lex
     * throws an exception.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutBot</code>
     * action. For more information, see <a>security-iam</a>.
     * </p>
     * 
     * @param putBotRequest
     * @return putBotResult The response from the PutBot service method, as
     *         returned by Amazon Lex Model Building Service.
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PutBotResult putBot(PutBotRequest putBotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an alias for the specified version of the bot or replaces an
     * alias for the specified bot. To change the version of the bot that the
     * alias points to, replace the alias. For more information about aliases,
     * see <a>versioning-aliases</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutBotAlias</code>
     * action.
     * </p>
     * 
     * @param putBotAliasRequest
     * @return putBotAliasResult The response from the PutBotAlias service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PutBotAliasResult putBotAlias(PutBotAliasRequest putBotAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an intent or replaces an existing intent.
     * </p>
     * <p>
     * To define the interaction between the user and your bot, you use one or
     * more intents. For a pizza ordering bot, for example, you would create an
     * <code>OrderPizza</code> intent.
     * </p>
     * <p>
     * To create an intent or replace an existing intent, you must provide the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Intent name. For example, <code>OrderPizza</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sample utterances. For example, "Can I order a pizza, please." and
     * "I want to order a pizza."
     * </p>
     * </li>
     * <li>
     * <p>
     * Information to be gathered. You specify slot types for the information
     * that your bot will request from the user. You can specify standard slot
     * types, such as a date or a time, or custom slot types such as the size
     * and crust of a pizza.
     * </p>
     * </li>
     * <li>
     * <p>
     * How the intent will be fulfilled. You can provide a Lambda function or
     * configure the intent to return the intent information to the client
     * application. If you use a Lambda function, when all of the intent
     * information is available, Amazon Lex invokes your Lambda function. If you
     * configure your intent to return the intent information to the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify other optional information in the request, such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A confirmation prompt to ask the user to confirm an intent. For example,
     * "Shall I order your pizza?"
     * </p>
     * </li>
     * <li>
     * <p>
     * A conclusion statement to send to the user after the intent has been
     * fulfilled. For example, "I placed your pizza order."
     * </p>
     * </li>
     * <li>
     * <p>
     * A follow-up prompt that asks the user for additional activity. For
     * example, asking "Do you want to order a drink with your pizza?"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify an existing intent name to update the intent, Amazon Lex
     * replaces the values in the <code>$LATEST</code> version of the intent
     * with the values in the request. Amazon Lex removes fields that you don't
     * provide in the request. If you don't specify the required fields, Amazon
     * Lex throws an exception. When you update the <code>$LATEST</code> version
     * of an intent, the <code>status</code> field of any bot that uses the
     * <code>$LATEST</code> version of the intent is set to
     * <code>NOT_BUILT</code>.
     * </p>
     * <p>
     * For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutIntent</code>
     * action.
     * </p>
     * 
     * @param putIntentRequest
     * @return putIntentResult The response from the PutIntent service method,
     *         as returned by Amazon Lex Model Building Service.
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PutIntentResult putIntent(PutIntentRequest putIntentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a custom slot type or replaces an existing custom slot type.
     * </p>
     * <p>
     * To create a custom slot type, specify a name for the slot type and a set
     * of enumeration values, which are the values that a slot of this type can
     * assume. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * If you specify the name of an existing slot type, the fields in the
     * request replace the existing values in the <code>$LATEST</code> version
     * of the slot type. Amazon Lex removes the fields that you don't provide in
     * the request. If you don't specify required fields, Amazon Lex throws an
     * exception. When you update the <code>$LATEST</code> version of a slot
     * type, if a bot uses the <code>$LATEST</code> version of an intent that
     * contains the slot type, the bot's <code>status</code> field is set to
     * <code>NOT_BUILT</code>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutSlotType</code>
     * action.
     * </p>
     * 
     * @param putSlotTypeRequest
     * @return putSlotTypeResult The response from the PutSlotType service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    PutSlotTypeResult putSlotType(PutSlotTypeRequest putSlotTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a job to import a resource to Amazon Lex.
     * </p>
     * 
     * @param startImportRequest
     * @return startImportResult The response from the StartImport service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartImportResult startImport(StartImportRequest startImportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds the specified tags to the specified resource. If a tag key already
     * exists, the existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes tags from a bot, bot alias or bot channel.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Lex Model Building Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Model Building Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
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
