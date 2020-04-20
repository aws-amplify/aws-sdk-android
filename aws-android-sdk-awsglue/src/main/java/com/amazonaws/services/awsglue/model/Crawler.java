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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a crawler program that examines a data source and uses classifiers
 * to try to determine its schema. If successful, the crawler records metadata
 * concerning the data source in the AWS Glue Data Catalog.
 * </p>
 */
public class Crawler implements Serializable {
    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that's used to access
     * customer resources, such as Amazon Simple Storage Service (Amazon S3)
     * data.
     * </p>
     */
    private String role;

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     */
    private CrawlerTargets targets;

    /**
     * <p>
     * The name of the database in which the crawler's output is stored.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * A description of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * A list of UTF-8 strings that specify the custom classifiers that are
     * associated with the crawler.
     * </p>
     */
    private java.util.List<String> classifiers;

    /**
     * <p>
     * The policy that specifies update and delete behaviors for the crawler.
     * </p>
     */
    private SchemaChangePolicy schemaChangePolicy;

    /**
     * <p>
     * Indicates whether the crawler is running, or whether a run is pending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, RUNNING, STOPPING
     */
    private String state;

    /**
     * <p>
     * The prefix added to the names of tables that are created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String tablePrefix;

    /**
     * <p>
     * For scheduled crawlers, the schedule when the crawler runs.
     * </p>
     */
    private Schedule schedule;

    /**
     * <p>
     * If the crawler is running, contains the total time elapsed since the last
     * crawl began.
     * </p>
     */
    private Long crawlElapsedTime;

    /**
     * <p>
     * The time that the crawler was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time that the crawler was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an
     * error occurred.
     * </p>
     */
    private LastCrawlInfo lastCrawl;

    /**
     * <p>
     * The version of the crawler.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows
     * users to specify aspects of a crawler's behavior. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     * >Configuring a Crawler</a>.
     * </p>
     */
    private String configuration;

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String crawlerSecurityConfiguration;

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the crawler.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the crawler.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that's used to access
     * customer resources, such as Amazon Simple Storage Service (Amazon S3)
     * data.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that's used to
     *         access customer resources, such as Amazon Simple Storage Service
     *         (Amazon S3) data.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that's used to access
     * customer resources, such as Amazon Simple Storage Service (Amazon S3)
     * data.
     * </p>
     *
     * @param role <p>
     *            The Amazon Resource Name (ARN) of an IAM role that's used to
     *            access customer resources, such as Amazon Simple Storage
     *            Service (Amazon S3) data.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that's used to access
     * customer resources, such as Amazon Simple Storage Service (Amazon S3)
     * data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The Amazon Resource Name (ARN) of an IAM role that's used to
     *            access customer resources, such as Amazon Simple Storage
     *            Service (Amazon S3) data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     *
     * @return <p>
     *         A collection of targets to crawl.
     *         </p>
     */
    public CrawlerTargets getTargets() {
        return targets;
    }

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     *
     * @param targets <p>
     *            A collection of targets to crawl.
     *            </p>
     */
    public void setTargets(CrawlerTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A collection of targets to crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withTargets(CrawlerTargets targets) {
        this.targets = targets;
        return this;
    }

    /**
     * <p>
     * The name of the database in which the crawler's output is stored.
     * </p>
     *
     * @return <p>
     *         The name of the database in which the crawler's output is stored.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the database in which the crawler's output is stored.
     * </p>
     *
     * @param databaseName <p>
     *            The name of the database in which the crawler's output is
     *            stored.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database in which the crawler's output is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name of the database in which the crawler's output is
     *            stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * A description of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the crawler.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the crawler.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of UTF-8 strings that specify the custom classifiers that are
     * associated with the crawler.
     * </p>
     *
     * @return <p>
     *         A list of UTF-8 strings that specify the custom classifiers that
     *         are associated with the crawler.
     *         </p>
     */
    public java.util.List<String> getClassifiers() {
        return classifiers;
    }

    /**
     * <p>
     * A list of UTF-8 strings that specify the custom classifiers that are
     * associated with the crawler.
     * </p>
     *
     * @param classifiers <p>
     *            A list of UTF-8 strings that specify the custom classifiers
     *            that are associated with the crawler.
     *            </p>
     */
    public void setClassifiers(java.util.Collection<String> classifiers) {
        if (classifiers == null) {
            this.classifiers = null;
            return;
        }

        this.classifiers = new java.util.ArrayList<String>(classifiers);
    }

    /**
     * <p>
     * A list of UTF-8 strings that specify the custom classifiers that are
     * associated with the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiers <p>
     *            A list of UTF-8 strings that specify the custom classifiers
     *            that are associated with the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withClassifiers(String... classifiers) {
        if (getClassifiers() == null) {
            this.classifiers = new java.util.ArrayList<String>(classifiers.length);
        }
        for (String value : classifiers) {
            this.classifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of UTF-8 strings that specify the custom classifiers that are
     * associated with the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiers <p>
     *            A list of UTF-8 strings that specify the custom classifiers
     *            that are associated with the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withClassifiers(java.util.Collection<String> classifiers) {
        setClassifiers(classifiers);
        return this;
    }

    /**
     * <p>
     * The policy that specifies update and delete behaviors for the crawler.
     * </p>
     *
     * @return <p>
     *         The policy that specifies update and delete behaviors for the
     *         crawler.
     *         </p>
     */
    public SchemaChangePolicy getSchemaChangePolicy() {
        return schemaChangePolicy;
    }

    /**
     * <p>
     * The policy that specifies update and delete behaviors for the crawler.
     * </p>
     *
     * @param schemaChangePolicy <p>
     *            The policy that specifies update and delete behaviors for the
     *            crawler.
     *            </p>
     */
    public void setSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    /**
     * <p>
     * The policy that specifies update and delete behaviors for the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaChangePolicy <p>
     *            The policy that specifies update and delete behaviors for the
     *            crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
        return this;
    }

    /**
     * <p>
     * Indicates whether the crawler is running, or whether a run is pending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, RUNNING, STOPPING
     *
     * @return <p>
     *         Indicates whether the crawler is running, or whether a run is
     *         pending.
     *         </p>
     * @see CrawlerState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Indicates whether the crawler is running, or whether a run is pending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, RUNNING, STOPPING
     *
     * @param state <p>
     *            Indicates whether the crawler is running, or whether a run is
     *            pending.
     *            </p>
     * @see CrawlerState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether the crawler is running, or whether a run is pending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, RUNNING, STOPPING
     *
     * @param state <p>
     *            Indicates whether the crawler is running, or whether a run is
     *            pending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CrawlerState
     */
    public Crawler withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Indicates whether the crawler is running, or whether a run is pending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, RUNNING, STOPPING
     *
     * @param state <p>
     *            Indicates whether the crawler is running, or whether a run is
     *            pending.
     *            </p>
     * @see CrawlerState
     */
    public void setState(CrawlerState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * Indicates whether the crawler is running, or whether a run is pending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, RUNNING, STOPPING
     *
     * @param state <p>
     *            Indicates whether the crawler is running, or whether a run is
     *            pending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CrawlerState
     */
    public Crawler withState(CrawlerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The prefix added to the names of tables that are created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The prefix added to the names of tables that are created.
     *         </p>
     */
    public String getTablePrefix() {
        return tablePrefix;
    }

    /**
     * <p>
     * The prefix added to the names of tables that are created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param tablePrefix <p>
     *            The prefix added to the names of tables that are created.
     *            </p>
     */
    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * <p>
     * The prefix added to the names of tables that are created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param tablePrefix <p>
     *            The prefix added to the names of tables that are created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }

    /**
     * <p>
     * For scheduled crawlers, the schedule when the crawler runs.
     * </p>
     *
     * @return <p>
     *         For scheduled crawlers, the schedule when the crawler runs.
     *         </p>
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * For scheduled crawlers, the schedule when the crawler runs.
     * </p>
     *
     * @param schedule <p>
     *            For scheduled crawlers, the schedule when the crawler runs.
     *            </p>
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * For scheduled crawlers, the schedule when the crawler runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            For scheduled crawlers, the schedule when the crawler runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * If the crawler is running, contains the total time elapsed since the last
     * crawl began.
     * </p>
     *
     * @return <p>
     *         If the crawler is running, contains the total time elapsed since
     *         the last crawl began.
     *         </p>
     */
    public Long getCrawlElapsedTime() {
        return crawlElapsedTime;
    }

    /**
     * <p>
     * If the crawler is running, contains the total time elapsed since the last
     * crawl began.
     * </p>
     *
     * @param crawlElapsedTime <p>
     *            If the crawler is running, contains the total time elapsed
     *            since the last crawl began.
     *            </p>
     */
    public void setCrawlElapsedTime(Long crawlElapsedTime) {
        this.crawlElapsedTime = crawlElapsedTime;
    }

    /**
     * <p>
     * If the crawler is running, contains the total time elapsed since the last
     * crawl began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlElapsedTime <p>
     *            If the crawler is running, contains the total time elapsed
     *            since the last crawl began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withCrawlElapsedTime(Long crawlElapsedTime) {
        this.crawlElapsedTime = crawlElapsedTime;
        return this;
    }

    /**
     * <p>
     * The time that the crawler was created.
     * </p>
     *
     * @return <p>
     *         The time that the crawler was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that the crawler was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time that the crawler was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the crawler was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that the crawler was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time that the crawler was last updated.
     * </p>
     *
     * @return <p>
     *         The time that the crawler was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * The time that the crawler was last updated.
     * </p>
     *
     * @param lastUpdated <p>
     *            The time that the crawler was last updated.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time that the crawler was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            The time that the crawler was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an
     * error occurred.
     * </p>
     *
     * @return <p>
     *         The status of the last crawl, and potentially error information
     *         if an error occurred.
     *         </p>
     */
    public LastCrawlInfo getLastCrawl() {
        return lastCrawl;
    }

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an
     * error occurred.
     * </p>
     *
     * @param lastCrawl <p>
     *            The status of the last crawl, and potentially error
     *            information if an error occurred.
     *            </p>
     */
    public void setLastCrawl(LastCrawlInfo lastCrawl) {
        this.lastCrawl = lastCrawl;
    }

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an
     * error occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastCrawl <p>
     *            The status of the last crawl, and potentially error
     *            information if an error occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withLastCrawl(LastCrawlInfo lastCrawl) {
        this.lastCrawl = lastCrawl;
        return this;
    }

    /**
     * <p>
     * The version of the crawler.
     * </p>
     *
     * @return <p>
     *         The version of the crawler.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the crawler.
     * </p>
     *
     * @param version <p>
     *            The version of the crawler.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows
     * users to specify aspects of a crawler's behavior. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     * >Configuring a Crawler</a>.
     * </p>
     *
     * @return <p>
     *         Crawler configuration information. This versioned JSON string
     *         allows users to specify aspects of a crawler's behavior. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     *         >Configuring a Crawler</a>.
     *         </p>
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows
     * users to specify aspects of a crawler's behavior. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     * >Configuring a Crawler</a>.
     * </p>
     *
     * @param configuration <p>
     *            Crawler configuration information. This versioned JSON string
     *            allows users to specify aspects of a crawler's behavior. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     *            >Configuring a Crawler</a>.
     *            </p>
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows
     * users to specify aspects of a crawler's behavior. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     * >Configuring a Crawler</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            Crawler configuration information. This versioned JSON string
     *            allows users to specify aspects of a crawler's behavior. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     *            >Configuring a Crawler</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The name of the <code>SecurityConfiguration</code> structure to
     *         be used by this crawler.
     *         </p>
     */
    public String getCrawlerSecurityConfiguration() {
        return crawlerSecurityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param crawlerSecurityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used by this crawler.
     *            </p>
     */
    public void setCrawlerSecurityConfiguration(String crawlerSecurityConfiguration) {
        this.crawlerSecurityConfiguration = crawlerSecurityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * by this crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param crawlerSecurityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used by this crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawler withCrawlerSecurityConfiguration(String crawlerSecurityConfiguration) {
        this.crawlerSecurityConfiguration = crawlerSecurityConfiguration;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClassifiers() != null)
            sb.append("Classifiers: " + getClassifiers() + ",");
        if (getSchemaChangePolicy() != null)
            sb.append("SchemaChangePolicy: " + getSchemaChangePolicy() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTablePrefix() != null)
            sb.append("TablePrefix: " + getTablePrefix() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getCrawlElapsedTime() != null)
            sb.append("CrawlElapsedTime: " + getCrawlElapsedTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getLastCrawl() != null)
            sb.append("LastCrawl: " + getLastCrawl() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getCrawlerSecurityConfiguration() != null)
            sb.append("CrawlerSecurityConfiguration: " + getCrawlerSecurityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getClassifiers() == null) ? 0 : getClassifiers().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaChangePolicy() == null) ? 0 : getSchemaChangePolicy().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getTablePrefix() == null) ? 0 : getTablePrefix().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getCrawlElapsedTime() == null) ? 0 : getCrawlElapsedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getLastCrawl() == null) ? 0 : getLastCrawl().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getCrawlerSecurityConfiguration() == null) ? 0
                        : getCrawlerSecurityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Crawler == false)
            return false;
        Crawler other = (Crawler) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClassifiers() == null ^ this.getClassifiers() == null)
            return false;
        if (other.getClassifiers() != null
                && other.getClassifiers().equals(this.getClassifiers()) == false)
            return false;
        if (other.getSchemaChangePolicy() == null ^ this.getSchemaChangePolicy() == null)
            return false;
        if (other.getSchemaChangePolicy() != null
                && other.getSchemaChangePolicy().equals(this.getSchemaChangePolicy()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTablePrefix() == null ^ this.getTablePrefix() == null)
            return false;
        if (other.getTablePrefix() != null
                && other.getTablePrefix().equals(this.getTablePrefix()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getCrawlElapsedTime() == null ^ this.getCrawlElapsedTime() == null)
            return false;
        if (other.getCrawlElapsedTime() != null
                && other.getCrawlElapsedTime().equals(this.getCrawlElapsedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getLastCrawl() == null ^ this.getLastCrawl() == null)
            return false;
        if (other.getLastCrawl() != null
                && other.getLastCrawl().equals(this.getLastCrawl()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCrawlerSecurityConfiguration() == null
                ^ this.getCrawlerSecurityConfiguration() == null)
            return false;
        if (other.getCrawlerSecurityConfiguration() != null
                && other.getCrawlerSecurityConfiguration().equals(
                        this.getCrawlerSecurityConfiguration()) == false)
            return false;
        return true;
    }
}
