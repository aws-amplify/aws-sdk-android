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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies Amazon Pinpoint configuration settings for retrieving and
 * processing recommendation data from a recommender model.
 * </p>
 */
public class CreateRecommenderConfiguration implements Serializable {
    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user
     * attributes, depending on the value for the RecommendationProviderIdType
     * property. Each of these attributes temporarily stores a recommended item
     * that's retrieved from the recommender model and sent to an AWS Lambda
     * function for additional processing. Each attribute can be used as a
     * message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a
     * custom display name for that attribute. The display name appears in the
     * <b>Attribute finder</b> of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain
     * up to 50 characters. The characters can be letters, numbers, underscores
     * (_), or hyphens (-). Attribute names are case sensitive and must be
     * unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can
     * contain up to 25 characters. The characters can be letters, numbers,
     * spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda
     * function (RecommendationTransformerUri) to process recommendation data.
     * Otherwise, don't include this object in your request.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The
     * description can contain up to 128 characters. The characters can be
     * letters, numbers, spaces, or the following symbols: _ ; () , ‐.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name
     * must start with a letter or number and it can contain up to 128
     * characters. The characters can be letters, numbers, spaces, underscores
     * (_), or hyphens (-).
     * </p>
     */
    private String name;

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the
     * recommender model. This value enables the model to use attribute and
     * event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular
     * endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs
     * in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular
     * user and endpoint in Amazon Pinpoint. The data is correlated based on
     * user IDs in Amazon Pinpoint. If you specify this value, an endpoint
     * definition in Amazon Pinpoint has to specify both a user ID (UserId) and
     * an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     */
    private String recommendationProviderIdType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation
     * data from the recommender model.
     * </p>
     */
    private String recommendationProviderRoleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve
     * recommendation data from. This value must match the ARN of an Amazon
     * Personalize campaign.
     * </p>
     */
    private String recommendationProviderUri;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to
     * invoke for additional processing of recommendation data that's retrieved
     * from the recommender model.
     * </p>
     */
    private String recommendationTransformerUri;

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute
     * (RecommendationItems) that temporarily stores recommended items for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This value is required if the
     * configuration doesn't invoke an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> of the template editor
     * on the Amazon Pinpoint console. The name can contain up to 25 characters.
     * The characters can be letters, numbers, spaces, underscores (_), or
     * hyphens (-). These restrictions don't apply to attribute values.
     * </p>
     */
    private String recommendationsDisplayName;

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This number determines how many
     * recommended items are available for use in message variables. The minimum
     * value is 1. The maximum value is 5. The default value is 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message
     * variables, you have to use an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     */
    private Integer recommendationsPerMessage;

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user
     * attributes, depending on the value for the RecommendationProviderIdType
     * property. Each of these attributes temporarily stores a recommended item
     * that's retrieved from the recommender model and sent to an AWS Lambda
     * function for additional processing. Each attribute can be used as a
     * message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a
     * custom display name for that attribute. The display name appears in the
     * <b>Attribute finder</b> of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain
     * up to 50 characters. The characters can be letters, numbers, underscores
     * (_), or hyphens (-). Attribute names are case sensitive and must be
     * unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can
     * contain up to 25 characters. The characters can be letters, numbers,
     * spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda
     * function (RecommendationTransformerUri) to process recommendation data.
     * Otherwise, don't include this object in your request.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that defines 1-10 custom endpoint or
     *         user attributes, depending on the value for the
     *         RecommendationProviderIdType property. Each of these attributes
     *         temporarily stores a recommended item that's retrieved from the
     *         recommender model and sent to an AWS Lambda function for
     *         additional processing. Each attribute can be used as a message
     *         variable in a message template.
     *         </p>
     *         <p>
     *         In the map, the key is the name of a custom attribute and the
     *         value is a custom display name for that attribute. The display
     *         name appears in the <b>Attribute finder</b> of the template
     *         editor on the Amazon Pinpoint console. The following restrictions
     *         apply to these names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An attribute name must start with a letter or number and it can
     *         contain up to 50 characters. The characters can be letters,
     *         numbers, underscores (_), or hyphens (-). Attribute names are
     *         case sensitive and must be unique.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An attribute display name must start with a letter or number and
     *         it can contain up to 25 characters. The characters can be
     *         letters, numbers, spaces, underscores (_), or hyphens (-).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This object is required if the configuration invokes an AWS
     *         Lambda function (RecommendationTransformerUri) to process
     *         recommendation data. Otherwise, don't include this object in your
     *         request.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user
     * attributes, depending on the value for the RecommendationProviderIdType
     * property. Each of these attributes temporarily stores a recommended item
     * that's retrieved from the recommender model and sent to an AWS Lambda
     * function for additional processing. Each attribute can be used as a
     * message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a
     * custom display name for that attribute. The display name appears in the
     * <b>Attribute finder</b> of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain
     * up to 50 characters. The characters can be letters, numbers, underscores
     * (_), or hyphens (-). Attribute names are case sensitive and must be
     * unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can
     * contain up to 25 characters. The characters can be letters, numbers,
     * spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda
     * function (RecommendationTransformerUri) to process recommendation data.
     * Otherwise, don't include this object in your request.
     * </p>
     *
     * @param attributes <p>
     *            A map of key-value pairs that defines 1-10 custom endpoint or
     *            user attributes, depending on the value for the
     *            RecommendationProviderIdType property. Each of these
     *            attributes temporarily stores a recommended item that's
     *            retrieved from the recommender model and sent to an AWS Lambda
     *            function for additional processing. Each attribute can be used
     *            as a message variable in a message template.
     *            </p>
     *            <p>
     *            In the map, the key is the name of a custom attribute and the
     *            value is a custom display name for that attribute. The display
     *            name appears in the <b>Attribute finder</b> of the template
     *            editor on the Amazon Pinpoint console. The following
     *            restrictions apply to these names:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An attribute name must start with a letter or number and it
     *            can contain up to 50 characters. The characters can be
     *            letters, numbers, underscores (_), or hyphens (-). Attribute
     *            names are case sensitive and must be unique.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An attribute display name must start with a letter or number
     *            and it can contain up to 25 characters. The characters can be
     *            letters, numbers, spaces, underscores (_), or hyphens (-).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This object is required if the configuration invokes an AWS
     *            Lambda function (RecommendationTransformerUri) to process
     *            recommendation data. Otherwise, don't include this object in
     *            your request.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user
     * attributes, depending on the value for the RecommendationProviderIdType
     * property. Each of these attributes temporarily stores a recommended item
     * that's retrieved from the recommender model and sent to an AWS Lambda
     * function for additional processing. Each attribute can be used as a
     * message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a
     * custom display name for that attribute. The display name appears in the
     * <b>Attribute finder</b> of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain
     * up to 50 characters. The characters can be letters, numbers, underscores
     * (_), or hyphens (-). Attribute names are case sensitive and must be
     * unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can
     * contain up to 25 characters. The characters can be letters, numbers,
     * spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda
     * function (RecommendationTransformerUri) to process recommendation data.
     * Otherwise, don't include this object in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A map of key-value pairs that defines 1-10 custom endpoint or
     *            user attributes, depending on the value for the
     *            RecommendationProviderIdType property. Each of these
     *            attributes temporarily stores a recommended item that's
     *            retrieved from the recommender model and sent to an AWS Lambda
     *            function for additional processing. Each attribute can be used
     *            as a message variable in a message template.
     *            </p>
     *            <p>
     *            In the map, the key is the name of a custom attribute and the
     *            value is a custom display name for that attribute. The display
     *            name appears in the <b>Attribute finder</b> of the template
     *            editor on the Amazon Pinpoint console. The following
     *            restrictions apply to these names:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An attribute name must start with a letter or number and it
     *            can contain up to 50 characters. The characters can be
     *            letters, numbers, underscores (_), or hyphens (-). Attribute
     *            names are case sensitive and must be unique.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An attribute display name must start with a letter or number
     *            and it can contain up to 25 characters. The characters can be
     *            letters, numbers, spaces, underscores (_), or hyphens (-).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This object is required if the configuration invokes an AWS
     *            Lambda function (RecommendationTransformerUri) to process
     *            recommendation data. Otherwise, don't include this object in
     *            your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user
     * attributes, depending on the value for the RecommendationProviderIdType
     * property. Each of these attributes temporarily stores a recommended item
     * that's retrieved from the recommender model and sent to an AWS Lambda
     * function for additional processing. Each attribute can be used as a
     * message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a
     * custom display name for that attribute. The display name appears in the
     * <b>Attribute finder</b> of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain
     * up to 50 characters. The characters can be letters, numbers, underscores
     * (_), or hyphens (-). Attribute names are case sensitive and must be
     * unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can
     * contain up to 25 characters. The characters can be letters, numbers,
     * spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda
     * function (RecommendationTransformerUri) to process recommendation data.
     * Otherwise, don't include this object in your request.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateRecommenderConfiguration clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The
     * description can contain up to 128 characters. The characters can be
     * letters, numbers, spaces, or the following symbols: _ ; () , ‐.
     * </p>
     *
     * @return <p>
     *         A custom description of the configuration for the recommender
     *         model. The description can contain up to 128 characters. The
     *         characters can be letters, numbers, spaces, or the following
     *         symbols: _ ; () , ‐.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The
     * description can contain up to 128 characters. The characters can be
     * letters, numbers, spaces, or the following symbols: _ ; () , ‐.
     * </p>
     *
     * @param description <p>
     *            A custom description of the configuration for the recommender
     *            model. The description can contain up to 128 characters. The
     *            characters can be letters, numbers, spaces, or the following
     *            symbols: _ ; () , ‐.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The
     * description can contain up to 128 characters. The characters can be
     * letters, numbers, spaces, or the following symbols: _ ; () , ‐.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A custom description of the configuration for the recommender
     *            model. The description can contain up to 128 characters. The
     *            characters can be letters, numbers, spaces, or the following
     *            symbols: _ ; () , ‐.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name
     * must start with a letter or number and it can contain up to 128
     * characters. The characters can be letters, numbers, spaces, underscores
     * (_), or hyphens (-).
     * </p>
     *
     * @return <p>
     *         A custom name of the configuration for the recommender model. The
     *         name must start with a letter or number and it can contain up to
     *         128 characters. The characters can be letters, numbers, spaces,
     *         underscores (_), or hyphens (-).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name
     * must start with a letter or number and it can contain up to 128
     * characters. The characters can be letters, numbers, spaces, underscores
     * (_), or hyphens (-).
     * </p>
     *
     * @param name <p>
     *            A custom name of the configuration for the recommender model.
     *            The name must start with a letter or number and it can contain
     *            up to 128 characters. The characters can be letters, numbers,
     *            spaces, underscores (_), or hyphens (-).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name
     * must start with a letter or number and it can contain up to 128
     * characters. The characters can be letters, numbers, spaces, underscores
     * (_), or hyphens (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A custom name of the configuration for the recommender model.
     *            The name must start with a letter or number and it can contain
     *            up to 128 characters. The characters can be letters, numbers,
     *            spaces, underscores (_), or hyphens (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the
     * recommender model. This value enables the model to use attribute and
     * event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular
     * endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs
     * in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular
     * user and endpoint in Amazon Pinpoint. The data is correlated based on
     * user IDs in Amazon Pinpoint. If you specify this value, an endpoint
     * definition in Amazon Pinpoint has to specify both a user ID (UserId) and
     * an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The type of Amazon Pinpoint ID to associate with unique user IDs
     *         in the recommender model. This value enables the model to use
     *         attribute and event data that’s specific to a particular endpoint
     *         or user in an Amazon Pinpoint application. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PINPOINT_ENDPOINT_ID - Associate each user in the model with a
     *         particular endpoint in Amazon Pinpoint. The data is correlated
     *         based on endpoint IDs in Amazon Pinpoint. This is the default
     *         value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PINPOINT_USER_ID - Associate each user in the model with a
     *         particular user and endpoint in Amazon Pinpoint. The data is
     *         correlated based on user IDs in Amazon Pinpoint. If you specify
     *         this value, an endpoint definition in Amazon Pinpoint has to
     *         specify both a user ID (UserId) and an endpoint ID. Otherwise,
     *         messages won’t be sent to the user's endpoint.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRecommendationProviderIdType() {
        return recommendationProviderIdType;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the
     * recommender model. This value enables the model to use attribute and
     * event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular
     * endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs
     * in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular
     * user and endpoint in Amazon Pinpoint. The data is correlated based on
     * user IDs in Amazon Pinpoint. If you specify this value, an endpoint
     * definition in Amazon Pinpoint has to specify both a user ID (UserId) and
     * an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     *
     * @param recommendationProviderIdType <p>
     *            The type of Amazon Pinpoint ID to associate with unique user
     *            IDs in the recommender model. This value enables the model to
     *            use attribute and event data that’s specific to a particular
     *            endpoint or user in an Amazon Pinpoint application. Valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PINPOINT_ENDPOINT_ID - Associate each user in the model with a
     *            particular endpoint in Amazon Pinpoint. The data is correlated
     *            based on endpoint IDs in Amazon Pinpoint. This is the default
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PINPOINT_USER_ID - Associate each user in the model with a
     *            particular user and endpoint in Amazon Pinpoint. The data is
     *            correlated based on user IDs in Amazon Pinpoint. If you
     *            specify this value, an endpoint definition in Amazon Pinpoint
     *            has to specify both a user ID (UserId) and an endpoint ID.
     *            Otherwise, messages won’t be sent to the user's endpoint.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRecommendationProviderIdType(String recommendationProviderIdType) {
        this.recommendationProviderIdType = recommendationProviderIdType;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the
     * recommender model. This value enables the model to use attribute and
     * event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular
     * endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs
     * in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular
     * user and endpoint in Amazon Pinpoint. The data is correlated based on
     * user IDs in Amazon Pinpoint. If you specify this value, an endpoint
     * definition in Amazon Pinpoint has to specify both a user ID (UserId) and
     * an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationProviderIdType <p>
     *            The type of Amazon Pinpoint ID to associate with unique user
     *            IDs in the recommender model. This value enables the model to
     *            use attribute and event data that’s specific to a particular
     *            endpoint or user in an Amazon Pinpoint application. Valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PINPOINT_ENDPOINT_ID - Associate each user in the model with a
     *            particular endpoint in Amazon Pinpoint. The data is correlated
     *            based on endpoint IDs in Amazon Pinpoint. This is the default
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PINPOINT_USER_ID - Associate each user in the model with a
     *            particular user and endpoint in Amazon Pinpoint. The data is
     *            correlated based on user IDs in Amazon Pinpoint. If you
     *            specify this value, an endpoint definition in Amazon Pinpoint
     *            has to specify both a user ID (UserId) and an endpoint ID.
     *            Otherwise, messages won’t be sent to the user's endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withRecommendationProviderIdType(
            String recommendationProviderIdType) {
        this.recommendationProviderIdType = recommendationProviderIdType;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation
     * data from the recommender model.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that authorizes Amazon Pinpoint to retrieve
     *         recommendation data from the recommender model.
     *         </p>
     */
    public String getRecommendationProviderRoleArn() {
        return recommendationProviderRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation
     * data from the recommender model.
     * </p>
     *
     * @param recommendationProviderRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorizes Amazon Pinpoint to
     *            retrieve recommendation data from the recommender model.
     *            </p>
     */
    public void setRecommendationProviderRoleArn(String recommendationProviderRoleArn) {
        this.recommendationProviderRoleArn = recommendationProviderRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation
     * data from the recommender model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationProviderRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorizes Amazon Pinpoint to
     *            retrieve recommendation data from the recommender model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withRecommendationProviderRoleArn(
            String recommendationProviderRoleArn) {
        this.recommendationProviderRoleArn = recommendationProviderRoleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve
     * recommendation data from. This value must match the ARN of an Amazon
     * Personalize campaign.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the recommender model to
     *         retrieve recommendation data from. This value must match the ARN
     *         of an Amazon Personalize campaign.
     *         </p>
     */
    public String getRecommendationProviderUri() {
        return recommendationProviderUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve
     * recommendation data from. This value must match the ARN of an Amazon
     * Personalize campaign.
     * </p>
     *
     * @param recommendationProviderUri <p>
     *            The Amazon Resource Name (ARN) of the recommender model to
     *            retrieve recommendation data from. This value must match the
     *            ARN of an Amazon Personalize campaign.
     *            </p>
     */
    public void setRecommendationProviderUri(String recommendationProviderUri) {
        this.recommendationProviderUri = recommendationProviderUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve
     * recommendation data from. This value must match the ARN of an Amazon
     * Personalize campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationProviderUri <p>
     *            The Amazon Resource Name (ARN) of the recommender model to
     *            retrieve recommendation data from. This value must match the
     *            ARN of an Amazon Personalize campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withRecommendationProviderUri(
            String recommendationProviderUri) {
        this.recommendationProviderUri = recommendationProviderUri;
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to
     * invoke for additional processing of recommendation data that's retrieved
     * from the recommender model.
     * </p>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the AWS Lambda function
     *         to invoke for additional processing of recommendation data that's
     *         retrieved from the recommender model.
     *         </p>
     */
    public String getRecommendationTransformerUri() {
        return recommendationTransformerUri;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to
     * invoke for additional processing of recommendation data that's retrieved
     * from the recommender model.
     * </p>
     *
     * @param recommendationTransformerUri <p>
     *            The name or Amazon Resource Name (ARN) of the AWS Lambda
     *            function to invoke for additional processing of recommendation
     *            data that's retrieved from the recommender model.
     *            </p>
     */
    public void setRecommendationTransformerUri(String recommendationTransformerUri) {
        this.recommendationTransformerUri = recommendationTransformerUri;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to
     * invoke for additional processing of recommendation data that's retrieved
     * from the recommender model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationTransformerUri <p>
     *            The name or Amazon Resource Name (ARN) of the AWS Lambda
     *            function to invoke for additional processing of recommendation
     *            data that's retrieved from the recommender model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withRecommendationTransformerUri(
            String recommendationTransformerUri) {
        this.recommendationTransformerUri = recommendationTransformerUri;
        return this;
    }

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute
     * (RecommendationItems) that temporarily stores recommended items for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This value is required if the
     * configuration doesn't invoke an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> of the template editor
     * on the Amazon Pinpoint console. The name can contain up to 25 characters.
     * The characters can be letters, numbers, spaces, underscores (_), or
     * hyphens (-). These restrictions don't apply to attribute values.
     * </p>
     *
     * @return <p>
     *         A custom display name for the standard endpoint or user attribute
     *         (RecommendationItems) that temporarily stores recommended items
     *         for each endpoint or user, depending on the value for the
     *         RecommendationProviderIdType property. This value is required if
     *         the configuration doesn't invoke an AWS Lambda function
     *         (RecommendationTransformerUri) to perform additional processing
     *         of recommendation data.
     *         </p>
     *         <p>
     *         This name appears in the <b>Attribute finder</b> of the template
     *         editor on the Amazon Pinpoint console. The name can contain up to
     *         25 characters. The characters can be letters, numbers, spaces,
     *         underscores (_), or hyphens (-). These restrictions don't apply
     *         to attribute values.
     *         </p>
     */
    public String getRecommendationsDisplayName() {
        return recommendationsDisplayName;
    }

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute
     * (RecommendationItems) that temporarily stores recommended items for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This value is required if the
     * configuration doesn't invoke an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> of the template editor
     * on the Amazon Pinpoint console. The name can contain up to 25 characters.
     * The characters can be letters, numbers, spaces, underscores (_), or
     * hyphens (-). These restrictions don't apply to attribute values.
     * </p>
     *
     * @param recommendationsDisplayName <p>
     *            A custom display name for the standard endpoint or user
     *            attribute (RecommendationItems) that temporarily stores
     *            recommended items for each endpoint or user, depending on the
     *            value for the RecommendationProviderIdType property. This
     *            value is required if the configuration doesn't invoke an AWS
     *            Lambda function (RecommendationTransformerUri) to perform
     *            additional processing of recommendation data.
     *            </p>
     *            <p>
     *            This name appears in the <b>Attribute finder</b> of the
     *            template editor on the Amazon Pinpoint console. The name can
     *            contain up to 25 characters. The characters can be letters,
     *            numbers, spaces, underscores (_), or hyphens (-). These
     *            restrictions don't apply to attribute values.
     *            </p>
     */
    public void setRecommendationsDisplayName(String recommendationsDisplayName) {
        this.recommendationsDisplayName = recommendationsDisplayName;
    }

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute
     * (RecommendationItems) that temporarily stores recommended items for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This value is required if the
     * configuration doesn't invoke an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> of the template editor
     * on the Amazon Pinpoint console. The name can contain up to 25 characters.
     * The characters can be letters, numbers, spaces, underscores (_), or
     * hyphens (-). These restrictions don't apply to attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationsDisplayName <p>
     *            A custom display name for the standard endpoint or user
     *            attribute (RecommendationItems) that temporarily stores
     *            recommended items for each endpoint or user, depending on the
     *            value for the RecommendationProviderIdType property. This
     *            value is required if the configuration doesn't invoke an AWS
     *            Lambda function (RecommendationTransformerUri) to perform
     *            additional processing of recommendation data.
     *            </p>
     *            <p>
     *            This name appears in the <b>Attribute finder</b> of the
     *            template editor on the Amazon Pinpoint console. The name can
     *            contain up to 25 characters. The characters can be letters,
     *            numbers, spaces, underscores (_), or hyphens (-). These
     *            restrictions don't apply to attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withRecommendationsDisplayName(
            String recommendationsDisplayName) {
        this.recommendationsDisplayName = recommendationsDisplayName;
        return this;
    }

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This number determines how many
     * recommended items are available for use in message variables. The minimum
     * value is 1. The maximum value is 5. The default value is 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message
     * variables, you have to use an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     *
     * @return <p>
     *         The number of recommended items to retrieve from the model for
     *         each endpoint or user, depending on the value for the
     *         RecommendationProviderIdType property. This number determines how
     *         many recommended items are available for use in message
     *         variables. The minimum value is 1. The maximum value is 5. The
     *         default value is 5.
     *         </p>
     *         <p>
     *         To use multiple recommended items and custom attributes with
     *         message variables, you have to use an AWS Lambda function
     *         (RecommendationTransformerUri) to perform additional processing
     *         of recommendation data.
     *         </p>
     */
    public Integer getRecommendationsPerMessage() {
        return recommendationsPerMessage;
    }

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This number determines how many
     * recommended items are available for use in message variables. The minimum
     * value is 1. The maximum value is 5. The default value is 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message
     * variables, you have to use an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     *
     * @param recommendationsPerMessage <p>
     *            The number of recommended items to retrieve from the model for
     *            each endpoint or user, depending on the value for the
     *            RecommendationProviderIdType property. This number determines
     *            how many recommended items are available for use in message
     *            variables. The minimum value is 1. The maximum value is 5. The
     *            default value is 5.
     *            </p>
     *            <p>
     *            To use multiple recommended items and custom attributes with
     *            message variables, you have to use an AWS Lambda function
     *            (RecommendationTransformerUri) to perform additional
     *            processing of recommendation data.
     *            </p>
     */
    public void setRecommendationsPerMessage(Integer recommendationsPerMessage) {
        this.recommendationsPerMessage = recommendationsPerMessage;
    }

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each
     * endpoint or user, depending on the value for the
     * RecommendationProviderIdType property. This number determines how many
     * recommended items are available for use in message variables. The minimum
     * value is 1. The maximum value is 5. The default value is 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message
     * variables, you have to use an AWS Lambda function
     * (RecommendationTransformerUri) to perform additional processing of
     * recommendation data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationsPerMessage <p>
     *            The number of recommended items to retrieve from the model for
     *            each endpoint or user, depending on the value for the
     *            RecommendationProviderIdType property. This number determines
     *            how many recommended items are available for use in message
     *            variables. The minimum value is 1. The maximum value is 5. The
     *            default value is 5.
     *            </p>
     *            <p>
     *            To use multiple recommended items and custom attributes with
     *            message variables, you have to use an AWS Lambda function
     *            (RecommendationTransformerUri) to perform additional
     *            processing of recommendation data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfiguration withRecommendationsPerMessage(
            Integer recommendationsPerMessage) {
        this.recommendationsPerMessage = recommendationsPerMessage;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRecommendationProviderIdType() != null)
            sb.append("RecommendationProviderIdType: " + getRecommendationProviderIdType() + ",");
        if (getRecommendationProviderRoleArn() != null)
            sb.append("RecommendationProviderRoleArn: " + getRecommendationProviderRoleArn() + ",");
        if (getRecommendationProviderUri() != null)
            sb.append("RecommendationProviderUri: " + getRecommendationProviderUri() + ",");
        if (getRecommendationTransformerUri() != null)
            sb.append("RecommendationTransformerUri: " + getRecommendationTransformerUri() + ",");
        if (getRecommendationsDisplayName() != null)
            sb.append("RecommendationsDisplayName: " + getRecommendationsDisplayName() + ",");
        if (getRecommendationsPerMessage() != null)
            sb.append("RecommendationsPerMessage: " + getRecommendationsPerMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationProviderIdType() == null) ? 0
                        : getRecommendationProviderIdType().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationProviderRoleArn() == null) ? 0
                        : getRecommendationProviderRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationProviderUri() == null) ? 0 : getRecommendationProviderUri()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationTransformerUri() == null) ? 0
                        : getRecommendationTransformerUri().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationsDisplayName() == null) ? 0 : getRecommendationsDisplayName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationsPerMessage() == null) ? 0 : getRecommendationsPerMessage()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRecommenderConfiguration == false)
            return false;
        CreateRecommenderConfiguration other = (CreateRecommenderConfiguration) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecommendationProviderIdType() == null
                ^ this.getRecommendationProviderIdType() == null)
            return false;
        if (other.getRecommendationProviderIdType() != null
                && other.getRecommendationProviderIdType().equals(
                        this.getRecommendationProviderIdType()) == false)
            return false;
        if (other.getRecommendationProviderRoleArn() == null
                ^ this.getRecommendationProviderRoleArn() == null)
            return false;
        if (other.getRecommendationProviderRoleArn() != null
                && other.getRecommendationProviderRoleArn().equals(
                        this.getRecommendationProviderRoleArn()) == false)
            return false;
        if (other.getRecommendationProviderUri() == null
                ^ this.getRecommendationProviderUri() == null)
            return false;
        if (other.getRecommendationProviderUri() != null
                && other.getRecommendationProviderUri().equals(this.getRecommendationProviderUri()) == false)
            return false;
        if (other.getRecommendationTransformerUri() == null
                ^ this.getRecommendationTransformerUri() == null)
            return false;
        if (other.getRecommendationTransformerUri() != null
                && other.getRecommendationTransformerUri().equals(
                        this.getRecommendationTransformerUri()) == false)
            return false;
        if (other.getRecommendationsDisplayName() == null
                ^ this.getRecommendationsDisplayName() == null)
            return false;
        if (other.getRecommendationsDisplayName() != null
                && other.getRecommendationsDisplayName().equals(
                        this.getRecommendationsDisplayName()) == false)
            return false;
        if (other.getRecommendationsPerMessage() == null
                ^ this.getRecommendationsPerMessage() == null)
            return false;
        if (other.getRecommendationsPerMessage() != null
                && other.getRecommendationsPerMessage().equals(this.getRecommendationsPerMessage()) == false)
            return false;
        return true;
    }
}
