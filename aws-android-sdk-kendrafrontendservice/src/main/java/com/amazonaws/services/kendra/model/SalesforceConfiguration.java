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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration information for connecting to a Salesforce data
 * source.
 * </p>
 */
public class SalesforceConfiguration implements Serializable {
    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     */
    private String serverUrl;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the key/value pairs required to connect to your Salesforce
     * instance. The secret must contain a JSON structure with the following
     * keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get
     * an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your
     * Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created
     * your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the
     * Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to
     * the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String secretArn;

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     */
    private java.util.List<SalesforceStandardObjectConfiguration> standardObjectConfigurations;

    /**
     * <p>
     * Specifies configuration information for the knowlege article types that
     * Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles
     * and the standard fields of knowledge articles, or the custom fields of
     * custom knowledge articles, but not both.
     * </p>
     */
    private SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration;

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     */
    private SalesforceChatterFeedConfiguration chatterFeedConfiguration;

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce
     * objects.
     * </p>
     */
    private Boolean crawlAttachments;

    /**
     * <p>
     * Provides configuration information for processing attachments to
     * Salesforce standard objects.
     * </p>
     */
    private SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration;

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     */
    private java.util.List<String> includeAttachmentFilePatterns;

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     */
    private java.util.List<String> excludeAttachmentFilePatterns;

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     *
     * @return <p>
     *         The instance URL for the Salesforce site that you want to index.
     *         </p>
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     *
     * @param serverUrl <p>
     *            The instance URL for the Salesforce site that you want to
     *            index.
     *            </p>
     */
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     *
     * @param serverUrl <p>
     *            The instance URL for the Salesforce site that you want to
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the key/value pairs required to connect to your Salesforce
     * instance. The secret must contain a JSON structure with the following
     * keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get
     * an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your
     * Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created
     * your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the
     * Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to
     * the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Secrets Manager secret
     *         that contains the key/value pairs required to connect to your
     *         Salesforce instance. The secret must contain a JSON structure
     *         with the following keys:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         authenticationUrl - The OAUTH endpoint that Amazon Kendra
     *         connects to get an OAUTH token.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         consumerKey - The application public key generated when you
     *         created your Salesforce application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         consumerSecret - The application private key generated when you
     *         created your Salesforce application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         password - The password associated with the user logging in to
     *         the Salesforce instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         securityToken - The token associated with the user account
     *         logging in to the Salesforce instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         username - The user name of the user logging in to the Salesforce
     *         instance.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the key/value pairs required to connect to your Salesforce
     * instance. The secret must contain a JSON structure with the following
     * keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get
     * an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your
     * Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created
     * your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the
     * Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to
     * the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Secrets Manager
     *            secret that contains the key/value pairs required to connect
     *            to your Salesforce instance. The secret must contain a JSON
     *            structure with the following keys:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            authenticationUrl - The OAUTH endpoint that Amazon Kendra
     *            connects to get an OAUTH token.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            consumerKey - The application public key generated when you
     *            created your Salesforce application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            consumerSecret - The application private key generated when
     *            you created your Salesforce application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            password - The password associated with the user logging in to
     *            the Salesforce instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            securityToken - The token associated with the user account
     *            logging in to the Salesforce instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            username - The user name of the user logging in to the
     *            Salesforce instance.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     * contains the key/value pairs required to connect to your Salesforce
     * instance. The secret must contain a JSON structure with the following
     * keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get
     * an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your
     * Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created
     * your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the
     * Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to
     * the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Secrets Manager
     *            secret that contains the key/value pairs required to connect
     *            to your Salesforce instance. The secret must contain a JSON
     *            structure with the following keys:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            authenticationUrl - The OAUTH endpoint that Amazon Kendra
     *            connects to get an OAUTH token.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            consumerKey - The application public key generated when you
     *            created your Salesforce application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            consumerSecret - The application private key generated when
     *            you created your Salesforce application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            password - The password associated with the user logging in to
     *            the Salesforce instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            securityToken - The token associated with the user account
     *            logging in to the Salesforce instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            username - The user name of the user logging in to the
     *            Salesforce instance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     *
     * @return <p>
     *         Specifies the Salesforce standard objects that Amazon Kendra
     *         indexes.
     *         </p>
     */
    public java.util.List<SalesforceStandardObjectConfiguration> getStandardObjectConfigurations() {
        return standardObjectConfigurations;
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     *
     * @param standardObjectConfigurations <p>
     *            Specifies the Salesforce standard objects that Amazon Kendra
     *            indexes.
     *            </p>
     */
    public void setStandardObjectConfigurations(
            java.util.Collection<SalesforceStandardObjectConfiguration> standardObjectConfigurations) {
        if (standardObjectConfigurations == null) {
            this.standardObjectConfigurations = null;
            return;
        }

        this.standardObjectConfigurations = new java.util.ArrayList<SalesforceStandardObjectConfiguration>(
                standardObjectConfigurations);
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardObjectConfigurations <p>
     *            Specifies the Salesforce standard objects that Amazon Kendra
     *            indexes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withStandardObjectConfigurations(
            SalesforceStandardObjectConfiguration... standardObjectConfigurations) {
        if (getStandardObjectConfigurations() == null) {
            this.standardObjectConfigurations = new java.util.ArrayList<SalesforceStandardObjectConfiguration>(
                    standardObjectConfigurations.length);
        }
        for (SalesforceStandardObjectConfiguration value : standardObjectConfigurations) {
            this.standardObjectConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardObjectConfigurations <p>
     *            Specifies the Salesforce standard objects that Amazon Kendra
     *            indexes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withStandardObjectConfigurations(
            java.util.Collection<SalesforceStandardObjectConfiguration> standardObjectConfigurations) {
        setStandardObjectConfigurations(standardObjectConfigurations);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for the knowlege article types that
     * Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles
     * and the standard fields of knowledge articles, or the custom fields of
     * custom knowledge articles, but not both.
     * </p>
     *
     * @return <p>
     *         Specifies configuration information for the knowlege article
     *         types that Amazon Kendra indexes. Amazon Kendra indexes standard
     *         knowledge articles and the standard fields of knowledge articles,
     *         or the custom fields of custom knowledge articles, but not both.
     *         </p>
     */
    public SalesforceKnowledgeArticleConfiguration getKnowledgeArticleConfiguration() {
        return knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the knowlege article types that
     * Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles
     * and the standard fields of knowledge articles, or the custom fields of
     * custom knowledge articles, but not both.
     * </p>
     *
     * @param knowledgeArticleConfiguration <p>
     *            Specifies configuration information for the knowlege article
     *            types that Amazon Kendra indexes. Amazon Kendra indexes
     *            standard knowledge articles and the standard fields of
     *            knowledge articles, or the custom fields of custom knowledge
     *            articles, but not both.
     *            </p>
     */
    public void setKnowledgeArticleConfiguration(
            SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the knowlege article types that
     * Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles
     * and the standard fields of knowledge articles, or the custom fields of
     * custom knowledge articles, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param knowledgeArticleConfiguration <p>
     *            Specifies configuration information for the knowlege article
     *            types that Amazon Kendra indexes. Amazon Kendra indexes
     *            standard knowledge articles and the standard fields of
     *            knowledge articles, or the custom fields of custom knowledge
     *            articles, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withKnowledgeArticleConfiguration(
            SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     *
     * @return <p>
     *         Specifies configuration information for Salesforce chatter feeds.
     *         </p>
     */
    public SalesforceChatterFeedConfiguration getChatterFeedConfiguration() {
        return chatterFeedConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     *
     * @param chatterFeedConfiguration <p>
     *            Specifies configuration information for Salesforce chatter
     *            feeds.
     *            </p>
     */
    public void setChatterFeedConfiguration(
            SalesforceChatterFeedConfiguration chatterFeedConfiguration) {
        this.chatterFeedConfiguration = chatterFeedConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param chatterFeedConfiguration <p>
     *            Specifies configuration information for Salesforce chatter
     *            feeds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withChatterFeedConfiguration(
            SalesforceChatterFeedConfiguration chatterFeedConfiguration) {
        this.chatterFeedConfiguration = chatterFeedConfiguration;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce
     * objects.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon Kendra should index attachments to
     *         Salesforce objects.
     *         </p>
     */
    public Boolean isCrawlAttachments() {
        return crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce
     * objects.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon Kendra should index attachments to
     *         Salesforce objects.
     *         </p>
     */
    public Boolean getCrawlAttachments() {
        return crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce
     * objects.
     * </p>
     *
     * @param crawlAttachments <p>
     *            Indicates whether Amazon Kendra should index attachments to
     *            Salesforce objects.
     *            </p>
     */
    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlAttachments <p>
     *            Indicates whether Amazon Kendra should index attachments to
     *            Salesforce objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
        return this;
    }

    /**
     * <p>
     * Provides configuration information for processing attachments to
     * Salesforce standard objects.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for processing attachments to
     *         Salesforce standard objects.
     *         </p>
     */
    public SalesforceStandardObjectAttachmentConfiguration getStandardObjectAttachmentConfiguration() {
        return standardObjectAttachmentConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for processing attachments to
     * Salesforce standard objects.
     * </p>
     *
     * @param standardObjectAttachmentConfiguration <p>
     *            Provides configuration information for processing attachments
     *            to Salesforce standard objects.
     *            </p>
     */
    public void setStandardObjectAttachmentConfiguration(
            SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration) {
        this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for processing attachments to
     * Salesforce standard objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardObjectAttachmentConfiguration <p>
     *            Provides configuration information for processing attachments
     *            to Salesforce standard objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withStandardObjectAttachmentConfiguration(
            SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration) {
        this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     *
     * @return <p>
     *         A list of regular expression patterns. Documents that match the
     *         patterns are included in the index. Documents that don't match
     *         the patterns are excluded from the index. If a document matches
     *         both an inclusion pattern and an exclusion pattern, the document
     *         is not included in the index.
     *         </p>
     *         <p>
     *         The regex is applied to the name of the attached file.
     *         </p>
     */
    public java.util.List<String> getIncludeAttachmentFilePatterns() {
        return includeAttachmentFilePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     *
     * @param includeAttachmentFilePatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are included in the index. Documents that don't
     *            match the patterns are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the name of the attached file.
     *            </p>
     */
    public void setIncludeAttachmentFilePatterns(
            java.util.Collection<String> includeAttachmentFilePatterns) {
        if (includeAttachmentFilePatterns == null) {
            this.includeAttachmentFilePatterns = null;
            return;
        }

        this.includeAttachmentFilePatterns = new java.util.ArrayList<String>(
                includeAttachmentFilePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAttachmentFilePatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are included in the index. Documents that don't
     *            match the patterns are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the name of the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withIncludeAttachmentFilePatterns(
            String... includeAttachmentFilePatterns) {
        if (getIncludeAttachmentFilePatterns() == null) {
            this.includeAttachmentFilePatterns = new java.util.ArrayList<String>(
                    includeAttachmentFilePatterns.length);
        }
        for (String value : includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAttachmentFilePatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are included in the index. Documents that don't
     *            match the patterns are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the name of the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withIncludeAttachmentFilePatterns(
            java.util.Collection<String> includeAttachmentFilePatterns) {
        setIncludeAttachmentFilePatterns(includeAttachmentFilePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     *
     * @return <p>
     *         A list of regular expression patterns. Documents that match the
     *         patterns are excluded from the index. Documents that don't match
     *         the patterns are included in the index. If a document matches
     *         both an exclusion pattern and an inclusion pattern, the document
     *         is not included in the index.
     *         </p>
     *         <p>
     *         The regex is applied to the name of the attached file.
     *         </p>
     */
    public java.util.List<String> getExcludeAttachmentFilePatterns() {
        return excludeAttachmentFilePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     *
     * @param excludeAttachmentFilePatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are excluded from the index. Documents that don't
     *            match the patterns are included in the index. If a document
     *            matches both an exclusion pattern and an inclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the name of the attached file.
     *            </p>
     */
    public void setExcludeAttachmentFilePatterns(
            java.util.Collection<String> excludeAttachmentFilePatterns) {
        if (excludeAttachmentFilePatterns == null) {
            this.excludeAttachmentFilePatterns = null;
            return;
        }

        this.excludeAttachmentFilePatterns = new java.util.ArrayList<String>(
                excludeAttachmentFilePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeAttachmentFilePatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are excluded from the index. Documents that don't
     *            match the patterns are included in the index. If a document
     *            matches both an exclusion pattern and an inclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the name of the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withExcludeAttachmentFilePatterns(
            String... excludeAttachmentFilePatterns) {
        if (getExcludeAttachmentFilePatterns() == null) {
            this.excludeAttachmentFilePatterns = new java.util.ArrayList<String>(
                    excludeAttachmentFilePatterns.length);
        }
        for (String value : excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeAttachmentFilePatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are excluded from the index. Documents that don't
     *            match the patterns are included in the index. If a document
     *            matches both an exclusion pattern and an inclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the name of the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceConfiguration withExcludeAttachmentFilePatterns(
            java.util.Collection<String> excludeAttachmentFilePatterns) {
        setExcludeAttachmentFilePatterns(excludeAttachmentFilePatterns);
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
        if (getServerUrl() != null)
            sb.append("ServerUrl: " + getServerUrl() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn() + ",");
        if (getStandardObjectConfigurations() != null)
            sb.append("StandardObjectConfigurations: " + getStandardObjectConfigurations() + ",");
        if (getKnowledgeArticleConfiguration() != null)
            sb.append("KnowledgeArticleConfiguration: " + getKnowledgeArticleConfiguration() + ",");
        if (getChatterFeedConfiguration() != null)
            sb.append("ChatterFeedConfiguration: " + getChatterFeedConfiguration() + ",");
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: " + getCrawlAttachments() + ",");
        if (getStandardObjectAttachmentConfiguration() != null)
            sb.append("StandardObjectAttachmentConfiguration: "
                    + getStandardObjectAttachmentConfiguration() + ",");
        if (getIncludeAttachmentFilePatterns() != null)
            sb.append("IncludeAttachmentFilePatterns: " + getIncludeAttachmentFilePatterns() + ",");
        if (getExcludeAttachmentFilePatterns() != null)
            sb.append("ExcludeAttachmentFilePatterns: " + getExcludeAttachmentFilePatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getStandardObjectConfigurations() == null) ? 0
                        : getStandardObjectConfigurations().hashCode());
        hashCode = prime
                * hashCode
                + ((getKnowledgeArticleConfiguration() == null) ? 0
                        : getKnowledgeArticleConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getChatterFeedConfiguration() == null) ? 0 : getChatterFeedConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime
                * hashCode
                + ((getStandardObjectAttachmentConfiguration() == null) ? 0
                        : getStandardObjectAttachmentConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeAttachmentFilePatterns() == null) ? 0
                        : getIncludeAttachmentFilePatterns().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcludeAttachmentFilePatterns() == null) ? 0
                        : getExcludeAttachmentFilePatterns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceConfiguration == false)
            return false;
        SalesforceConfiguration other = (SalesforceConfiguration) obj;

        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null
                && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getStandardObjectConfigurations() == null
                ^ this.getStandardObjectConfigurations() == null)
            return false;
        if (other.getStandardObjectConfigurations() != null
                && other.getStandardObjectConfigurations().equals(
                        this.getStandardObjectConfigurations()) == false)
            return false;
        if (other.getKnowledgeArticleConfiguration() == null
                ^ this.getKnowledgeArticleConfiguration() == null)
            return false;
        if (other.getKnowledgeArticleConfiguration() != null
                && other.getKnowledgeArticleConfiguration().equals(
                        this.getKnowledgeArticleConfiguration()) == false)
            return false;
        if (other.getChatterFeedConfiguration() == null
                ^ this.getChatterFeedConfiguration() == null)
            return false;
        if (other.getChatterFeedConfiguration() != null
                && other.getChatterFeedConfiguration().equals(this.getChatterFeedConfiguration()) == false)
            return false;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null
                && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getStandardObjectAttachmentConfiguration() == null
                ^ this.getStandardObjectAttachmentConfiguration() == null)
            return false;
        if (other.getStandardObjectAttachmentConfiguration() != null
                && other.getStandardObjectAttachmentConfiguration().equals(
                        this.getStandardObjectAttachmentConfiguration()) == false)
            return false;
        if (other.getIncludeAttachmentFilePatterns() == null
                ^ this.getIncludeAttachmentFilePatterns() == null)
            return false;
        if (other.getIncludeAttachmentFilePatterns() != null
                && other.getIncludeAttachmentFilePatterns().equals(
                        this.getIncludeAttachmentFilePatterns()) == false)
            return false;
        if (other.getExcludeAttachmentFilePatterns() == null
                ^ this.getExcludeAttachmentFilePatterns() == null)
            return false;
        if (other.getExcludeAttachmentFilePatterns() != null
                && other.getExcludeAttachmentFilePatterns().equals(
                        this.getExcludeAttachmentFilePatterns()) == false)
            return false;
        return true;
    }
}
