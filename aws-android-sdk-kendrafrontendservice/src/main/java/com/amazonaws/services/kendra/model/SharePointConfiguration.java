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
 * Provides configuration information for connecting to a Microsoft SharePoint
 * data source.
 * </p>
 */
public class SharePointConfiguration implements Serializable {
    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHAREPOINT_ONLINE
     */
    private String sharePointVersion;

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents
     * that should be indexed.
     * </p>
     */
    private java.util.List<String> urls;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     * >Using a Microsoft SharePoint Data Source</a>. For more information about
     * AWS Secrets Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
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
     * <code>TRUE</code> to include attachments to documents stored in your
     * Microsoft SharePoint site in the index; otherwise, <code>FALSE</code>.
     * </p>
     */
    private Boolean crawlAttachments;

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to
     * determine the documents that need to be updated in the index. Depending
     * on the size of the SharePoint change log, it may take longer for Amazon
     * Kendra to use the change log than it takes it to determine the changed
     * documents using the Amazon Kendra document crawler.
     * </p>
     */
    private Boolean useChangeLog;

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;

    /**
     * <p>
     * A list of regulary expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft SharePoint attributes to custom fields in the Amazon Kendra
     * index. You must first create the index fields using the operation before
     * you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     * >Mapping Data Source Fields</a>.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the
     * document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentTitleFieldName;

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHAREPOINT_ONLINE
     *
     * @return <p>
     *         The version of Microsoft SharePoint that you are using as a data
     *         source.
     *         </p>
     * @see SharePointVersion
     */
    public String getSharePointVersion() {
        return sharePointVersion;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHAREPOINT_ONLINE
     *
     * @param sharePointVersion <p>
     *            The version of Microsoft SharePoint that you are using as a
     *            data source.
     *            </p>
     * @see SharePointVersion
     */
    public void setSharePointVersion(String sharePointVersion) {
        this.sharePointVersion = sharePointVersion;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHAREPOINT_ONLINE
     *
     * @param sharePointVersion <p>
     *            The version of Microsoft SharePoint that you are using as a
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SharePointVersion
     */
    public SharePointConfiguration withSharePointVersion(String sharePointVersion) {
        this.sharePointVersion = sharePointVersion;
        return this;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHAREPOINT_ONLINE
     *
     * @param sharePointVersion <p>
     *            The version of Microsoft SharePoint that you are using as a
     *            data source.
     *            </p>
     * @see SharePointVersion
     */
    public void setSharePointVersion(SharePointVersion sharePointVersion) {
        this.sharePointVersion = sharePointVersion.toString();
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you are using as a data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHAREPOINT_ONLINE
     *
     * @param sharePointVersion <p>
     *            The version of Microsoft SharePoint that you are using as a
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SharePointVersion
     */
    public SharePointConfiguration withSharePointVersion(SharePointVersion sharePointVersion) {
        this.sharePointVersion = sharePointVersion.toString();
        return this;
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents
     * that should be indexed.
     * </p>
     *
     * @return <p>
     *         The URLs of the Microsoft SharePoint site that contains the
     *         documents that should be indexed.
     *         </p>
     */
    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents
     * that should be indexed.
     * </p>
     *
     * @param urls <p>
     *            The URLs of the Microsoft SharePoint site that contains the
     *            documents that should be indexed.
     *            </p>
     */
    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents
     * that should be indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            The URLs of the Microsoft SharePoint site that contains the
     *            documents that should be indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withUrls(String... urls) {
        if (getUrls() == null) {
            this.urls = new java.util.ArrayList<String>(urls.length);
        }
        for (String value : urls) {
            this.urls.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The URLs of the Microsoft SharePoint site that contains the documents
     * that should be indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            The URLs of the Microsoft SharePoint site that contains the
     *            documents that should be indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     * >Using a Microsoft SharePoint Data Source</a>. For more information about
     * AWS Secrets Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of credentials stored in AWS
     *         Secrets Manager. The credentials should be a user/password pair.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     *         >Using a Microsoft SharePoint Data Source</a>. For more
     *         information about AWS Secrets Manager, see <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"
     *         > What Is AWS Secrets Manager </a> in the <i>AWS Secrets
     *         Manager</i> user guide.
     *         </p>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     * >Using a Microsoft SharePoint Data Source</a>. For more information about
     * AWS Secrets Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of credentials stored in AWS
     *            Secrets Manager. The credentials should be a user/password
     *            pair. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     *            >Using a Microsoft SharePoint Data Source</a>. For more
     *            information about AWS Secrets Manager, see <a href=
     *            "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"
     *            > What Is AWS Secrets Manager </a> in the <i>AWS Secrets
     *            Manager</i> user guide.
     *            </p>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     * >Using a Microsoft SharePoint Data Source</a>. For more information about
     * AWS Secrets Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
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
     *            The Amazon Resource Name (ARN) of credentials stored in AWS
     *            Secrets Manager. The credentials should be a user/password
     *            pair. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html"
     *            >Using a Microsoft SharePoint Data Source</a>. For more
     *            information about AWS Secrets Manager, see <a href=
     *            "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"
     *            > What Is AWS Secrets Manager </a> in the <i>AWS Secrets
     *            Manager</i> user guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your
     * Microsoft SharePoint site in the index; otherwise, <code>FALSE</code>.
     * </p>
     *
     * @return <p>
     *         <code>TRUE</code> to include attachments to documents stored in
     *         your Microsoft SharePoint site in the index; otherwise,
     *         <code>FALSE</code>.
     *         </p>
     */
    public Boolean isCrawlAttachments() {
        return crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your
     * Microsoft SharePoint site in the index; otherwise, <code>FALSE</code>.
     * </p>
     *
     * @return <p>
     *         <code>TRUE</code> to include attachments to documents stored in
     *         your Microsoft SharePoint site in the index; otherwise,
     *         <code>FALSE</code>.
     *         </p>
     */
    public Boolean getCrawlAttachments() {
        return crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your
     * Microsoft SharePoint site in the index; otherwise, <code>FALSE</code>.
     * </p>
     *
     * @param crawlAttachments <p>
     *            <code>TRUE</code> to include attachments to documents stored
     *            in your Microsoft SharePoint site in the index; otherwise,
     *            <code>FALSE</code>.
     *            </p>
     */
    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include attachments to documents stored in your
     * Microsoft SharePoint site in the index; otherwise, <code>FALSE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlAttachments <p>
     *            <code>TRUE</code> to include attachments to documents stored
     *            in your Microsoft SharePoint site in the index; otherwise,
     *            <code>FALSE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to
     * determine the documents that need to be updated in the index. Depending
     * on the size of the SharePoint change log, it may take longer for Amazon
     * Kendra to use the change log than it takes it to determine the changed
     * documents using the Amazon Kendra document crawler.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to use the Microsoft SharePoint change
     *         log to determine the documents that need to be updated in the
     *         index. Depending on the size of the SharePoint change log, it may
     *         take longer for Amazon Kendra to use the change log than it takes
     *         it to determine the changed documents using the Amazon Kendra
     *         document crawler.
     *         </p>
     */
    public Boolean isUseChangeLog() {
        return useChangeLog;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to
     * determine the documents that need to be updated in the index. Depending
     * on the size of the SharePoint change log, it may take longer for Amazon
     * Kendra to use the change log than it takes it to determine the changed
     * documents using the Amazon Kendra document crawler.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to use the Microsoft SharePoint change
     *         log to determine the documents that need to be updated in the
     *         index. Depending on the size of the SharePoint change log, it may
     *         take longer for Amazon Kendra to use the change log than it takes
     *         it to determine the changed documents using the Amazon Kendra
     *         document crawler.
     *         </p>
     */
    public Boolean getUseChangeLog() {
        return useChangeLog;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to
     * determine the documents that need to be updated in the index. Depending
     * on the size of the SharePoint change log, it may take longer for Amazon
     * Kendra to use the change log than it takes it to determine the changed
     * documents using the Amazon Kendra document crawler.
     * </p>
     *
     * @param useChangeLog <p>
     *            Set to <code>TRUE</code> to use the Microsoft SharePoint
     *            change log to determine the documents that need to be updated
     *            in the index. Depending on the size of the SharePoint change
     *            log, it may take longer for Amazon Kendra to use the change
     *            log than it takes it to determine the changed documents using
     *            the Amazon Kendra document crawler.
     *            </p>
     */
    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to use the Microsoft SharePoint change log to
     * determine the documents that need to be updated in the index. Depending
     * on the size of the SharePoint change log, it may take longer for Amazon
     * Kendra to use the change log than it takes it to determine the changed
     * documents using the Amazon Kendra document crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useChangeLog <p>
     *            Set to <code>TRUE</code> to use the Microsoft SharePoint
     *            change log to determine the documents that need to be updated
     *            in the index. Depending on the size of the SharePoint change
     *            log, it may take longer for Amazon Kendra to use the change
     *            log than it takes it to determine the changed documents using
     *            the Amazon Kendra document crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
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
     * The regex is applied to the display URL of the SharePoint document.
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
     *         The regex is applied to the display URL of the SharePoint
     *         document.
     *         </p>
     */
    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     *
     * @param inclusionPatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are included in the index. Documents that don't
     *            match the patterns are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the display URL of the SharePoint
     *            document.
     *            </p>
     */
    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns
     * are included in the index. Documents that don't match the patterns are
     * excluded from the index. If a document matches both an inclusion pattern
     * and an exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusionPatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are included in the index. Documents that don't
     *            match the patterns are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the display URL of the SharePoint
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (getInclusionPatterns() == null) {
            this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns.length);
        }
        for (String value : inclusionPatterns) {
            this.inclusionPatterns.add(value);
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
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusionPatterns <p>
     *            A list of regular expression patterns. Documents that match
     *            the patterns are included in the index. Documents that don't
     *            match the patterns are excluded from the index. If a document
     *            matches both an inclusion pattern and an exclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the display URL of the SharePoint
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withInclusionPatterns(
            java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regulary expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     *
     * @return <p>
     *         A list of regulary expression patterns. Documents that match the
     *         patterns are excluded from the index. Documents that don't match
     *         the patterns are included in the index. If a document matches
     *         both an exclusion pattern and an inclusion pattern, the document
     *         is not included in the index.
     *         </p>
     *         <p>
     *         The regex is applied to the display URL of the SharePoint
     *         document.
     *         </p>
     */
    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regulary expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     *
     * @param exclusionPatterns <p>
     *            A list of regulary expression patterns. Documents that match
     *            the patterns are excluded from the index. Documents that don't
     *            match the patterns are included in the index. If a document
     *            matches both an exclusion pattern and an inclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the display URL of the SharePoint
     *            document.
     *            </p>
     */
    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of regulary expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusionPatterns <p>
     *            A list of regulary expression patterns. Documents that match
     *            the patterns are excluded from the index. Documents that don't
     *            match the patterns are included in the index. If a document
     *            matches both an exclusion pattern and an inclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the display URL of the SharePoint
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (getExclusionPatterns() == null) {
            this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns.length);
        }
        for (String value : exclusionPatterns) {
            this.exclusionPatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of regulary expression patterns. Documents that match the patterns
     * are excluded from the index. Documents that don't match the patterns are
     * included in the index. If a document matches both an exclusion pattern
     * and an inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the display URL of the SharePoint document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusionPatterns <p>
     *            A list of regulary expression patterns. Documents that match
     *            the patterns are excluded from the index. Documents that don't
     *            match the patterns are included in the index. If a document
     *            matches both an exclusion pattern and an inclusion pattern,
     *            the document is not included in the index.
     *            </p>
     *            <p>
     *            The regex is applied to the display URL of the SharePoint
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withExclusionPatterns(
            java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     *
     * @return <p>
     *         Provides information for connecting to an Amazon VPC.
     *         </p>
     */
    public DataSourceVpcConfiguration getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     *
     * @param vpcConfiguration <p>
     *            Provides information for connecting to an Amazon VPC.
     *            </p>
     */
    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfiguration <p>
     *            Provides information for connecting to an Amazon VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft SharePoint attributes to custom fields in the Amazon Kendra
     * index. You must first create the index fields using the operation before
     * you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     * >Mapping Data Source Fields</a>.
     * </p>
     *
     * @return <p>
     *         A list of <code>DataSourceToIndexFieldMapping</code> objects that
     *         map Microsoft SharePoint attributes to custom fields in the
     *         Amazon Kendra index. You must first create the index fields using
     *         the operation before you map SharePoint attributes. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     *         >Mapping Data Source Fields</a>.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft SharePoint attributes to custom fields in the Amazon Kendra
     * index. You must first create the index fields using the operation before
     * you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     * >Mapping Data Source Fields</a>.
     * </p>
     *
     * @param fieldMappings <p>
     *            A list of <code>DataSourceToIndexFieldMapping</code> objects
     *            that map Microsoft SharePoint attributes to custom fields in
     *            the Amazon Kendra index. You must first create the index
     *            fields using the operation before you map SharePoint
     *            attributes. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     *            >Mapping Data Source Fields</a>.
     *            </p>
     */
    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft SharePoint attributes to custom fields in the Amazon Kendra
     * index. You must first create the index fields using the operation before
     * you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     * >Mapping Data Source Fields</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            A list of <code>DataSourceToIndexFieldMapping</code> objects
     *            that map Microsoft SharePoint attributes to custom fields in
     *            the Amazon Kendra index. You must first create the index
     *            fields using the operation before you map SharePoint
     *            attributes. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     *            >Mapping Data Source Fields</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (getFieldMappings() == null) {
            this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    fieldMappings.length);
        }
        for (DataSourceToIndexFieldMapping value : fieldMappings) {
            this.fieldMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map
     * Microsoft SharePoint attributes to custom fields in the Amazon Kendra
     * index. You must first create the index fields using the operation before
     * you map SharePoint attributes. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     * >Mapping Data Source Fields</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            A list of <code>DataSourceToIndexFieldMapping</code> objects
     *            that map Microsoft SharePoint attributes to custom fields in
     *            the Amazon Kendra index. You must first create the index
     *            fields using the operation before you map SharePoint
     *            attributes. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"
     *            >Mapping Data Source Fields</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the
     * document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The Microsoft SharePoint attribute field that contains the title
     *         of the document.
     *         </p>
     */
    public String getDocumentTitleFieldName() {
        return documentTitleFieldName;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the
     * document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The Microsoft SharePoint attribute field that contains the
     *            title of the document.
     *            </p>
     */
    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the
     * document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The Microsoft SharePoint attribute field that contains the
     *            title of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharePointConfiguration withDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
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
        if (getSharePointVersion() != null)
            sb.append("SharePointVersion: " + getSharePointVersion() + ",");
        if (getUrls() != null)
            sb.append("Urls: " + getUrls() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn() + ",");
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: " + getCrawlAttachments() + ",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: " + getUseChangeLog() + ",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: " + getInclusionPatterns() + ",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: " + getExclusionPatterns() + ",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: " + getVpcConfiguration() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings() + ",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: " + getDocumentTitleFieldName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSharePointVersion() == null) ? 0 : getSharePointVersion().hashCode());
        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode
                + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode
                + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode
                + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode
                + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharePointConfiguration == false)
            return false;
        SharePointConfiguration other = (SharePointConfiguration) obj;

        if (other.getSharePointVersion() == null ^ this.getSharePointVersion() == null)
            return false;
        if (other.getSharePointVersion() != null
                && other.getSharePointVersion().equals(this.getSharePointVersion()) == false)
            return false;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null
                && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null
                && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null
                && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null
                && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null
                && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null
                && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null
                && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        return true;
    }
}
