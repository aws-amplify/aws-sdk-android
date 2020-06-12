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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a crawler. If a crawler is running, you must stop it using
 * <code>StopCrawler</code> before updating it.
 * </p>
 */
public class UpdateCrawlerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the new crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by
     * the new crawler to access customer resources.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The AWS Glue database where results are stored, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * A description of the new crawler.
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
     * A list of targets to crawl.
     * </p>
     */
    private CrawlerTargets targets;

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default,
     * all built-in classifiers are included in a crawl, but these custom
     * classifiers always override the default classifiers for a given
     * classification.
     * </p>
     */
    private java.util.List<String> classifiers;

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String tablePrefix;

    /**
     * <p>
     * The policy for the crawler's update and deletion behavior.
     * </p>
     */
    private SchemaChangePolicy schemaChangePolicy;

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows
     * users to specify aspects of a crawler's behavior. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
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
     * Name of the new crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the new crawler.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the new crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            Name of the new crawler.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the new crawler.
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
     *            Name of the new crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by
     * the new crawler to access customer resources.
     * </p>
     *
     * @return <p>
     *         The IAM role or Amazon Resource Name (ARN) of an IAM role that is
     *         used by the new crawler to access customer resources.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by
     * the new crawler to access customer resources.
     * </p>
     *
     * @param role <p>
     *            The IAM role or Amazon Resource Name (ARN) of an IAM role that
     *            is used by the new crawler to access customer resources.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by
     * the new crawler to access customer resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The IAM role or Amazon Resource Name (ARN) of an IAM role that
     *            is used by the new crawler to access customer resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The AWS Glue database where results are stored, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     *
     * @return <p>
     *         The AWS Glue database where results are stored, such as:
     *         <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The AWS Glue database where results are stored, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     *
     * @param databaseName <p>
     *            The AWS Glue database where results are stored, such as:
     *            <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The AWS Glue database where results are stored, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The AWS Glue database where results are stored, such as:
     *            <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * A description of the new crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the new crawler.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the new crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the new crawler.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the new crawler.
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
     *            A description of the new crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of targets to crawl.
     * </p>
     *
     * @return <p>
     *         A list of targets to crawl.
     *         </p>
     */
    public CrawlerTargets getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of targets to crawl.
     * </p>
     *
     * @param targets <p>
     *            A list of targets to crawl.
     *            </p>
     */
    public void setTargets(CrawlerTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * A list of targets to crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of targets to crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withTargets(CrawlerTargets targets) {
        this.targets = targets;
        return this;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @return <p>
     *         A <code>cron</code> expression used to specify the schedule (see
     *         <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *         >Time-Based Schedules for Jobs and Crawlers</a>. For example, to
     *         run something every day at 12:15 UTC, you would specify:
     *         <code>cron(15 12 * * ? *)</code>.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @param schedule <p>
     *            A <code>cron</code> expression used to specify the schedule
     *            (see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, you would specify:
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            A <code>cron</code> expression used to specify the schedule
     *            (see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, you would specify:
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default,
     * all built-in classifiers are included in a crawl, but these custom
     * classifiers always override the default classifiers for a given
     * classification.
     * </p>
     *
     * @return <p>
     *         A list of custom classifiers that the user has registered. By
     *         default, all built-in classifiers are included in a crawl, but
     *         these custom classifiers always override the default classifiers
     *         for a given classification.
     *         </p>
     */
    public java.util.List<String> getClassifiers() {
        return classifiers;
    }

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default,
     * all built-in classifiers are included in a crawl, but these custom
     * classifiers always override the default classifiers for a given
     * classification.
     * </p>
     *
     * @param classifiers <p>
     *            A list of custom classifiers that the user has registered. By
     *            default, all built-in classifiers are included in a crawl, but
     *            these custom classifiers always override the default
     *            classifiers for a given classification.
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
     * A list of custom classifiers that the user has registered. By default,
     * all built-in classifiers are included in a crawl, but these custom
     * classifiers always override the default classifiers for a given
     * classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiers <p>
     *            A list of custom classifiers that the user has registered. By
     *            default, all built-in classifiers are included in a crawl, but
     *            these custom classifiers always override the default
     *            classifiers for a given classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withClassifiers(String... classifiers) {
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
     * A list of custom classifiers that the user has registered. By default,
     * all built-in classifiers are included in a crawl, but these custom
     * classifiers always override the default classifiers for a given
     * classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiers <p>
     *            A list of custom classifiers that the user has registered. By
     *            default, all built-in classifiers are included in a crawl, but
     *            these custom classifiers always override the default
     *            classifiers for a given classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withClassifiers(java.util.Collection<String> classifiers) {
        setClassifiers(classifiers);
        return this;
    }

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The table prefix used for catalog tables that are created.
     *         </p>
     */
    public String getTablePrefix() {
        return tablePrefix;
    }

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param tablePrefix <p>
     *            The table prefix used for catalog tables that are created.
     *            </p>
     */
    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param tablePrefix <p>
     *            The table prefix used for catalog tables that are created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }

    /**
     * <p>
     * The policy for the crawler's update and deletion behavior.
     * </p>
     *
     * @return <p>
     *         The policy for the crawler's update and deletion behavior.
     *         </p>
     */
    public SchemaChangePolicy getSchemaChangePolicy() {
        return schemaChangePolicy;
    }

    /**
     * <p>
     * The policy for the crawler's update and deletion behavior.
     * </p>
     *
     * @param schemaChangePolicy <p>
     *            The policy for the crawler's update and deletion behavior.
     *            </p>
     */
    public void setSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    /**
     * <p>
     * The policy for the crawler's update and deletion behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaChangePolicy <p>
     *            The policy for the crawler's update and deletion behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
        return this;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows
     * users to specify aspects of a crawler's behavior. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     * >Configuring a Crawler</a>.
     * </p>
     *
     * @return <p>
     *         Crawler configuration information. This versioned JSON string
     *         allows users to specify aspects of a crawler's behavior. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
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
     * "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     * >Configuring a Crawler</a>.
     * </p>
     *
     * @param configuration <p>
     *            Crawler configuration information. This versioned JSON string
     *            allows users to specify aspects of a crawler's behavior. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
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
     * "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
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
     *            "https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html"
     *            >Configuring a Crawler</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerRequest withConfiguration(String configuration) {
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
    public UpdateCrawlerRequest withCrawlerSecurityConfiguration(String crawlerSecurityConfiguration) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getClassifiers() != null)
            sb.append("Classifiers: " + getClassifiers() + ",");
        if (getTablePrefix() != null)
            sb.append("TablePrefix: " + getTablePrefix() + ",");
        if (getSchemaChangePolicy() != null)
            sb.append("SchemaChangePolicy: " + getSchemaChangePolicy() + ",");
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
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getClassifiers() == null) ? 0 : getClassifiers().hashCode());
        hashCode = prime * hashCode
                + ((getTablePrefix() == null) ? 0 : getTablePrefix().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaChangePolicy() == null) ? 0 : getSchemaChangePolicy().hashCode());
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

        if (obj instanceof UpdateCrawlerRequest == false)
            return false;
        UpdateCrawlerRequest other = (UpdateCrawlerRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
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
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getClassifiers() == null ^ this.getClassifiers() == null)
            return false;
        if (other.getClassifiers() != null
                && other.getClassifiers().equals(this.getClassifiers()) == false)
            return false;
        if (other.getTablePrefix() == null ^ this.getTablePrefix() == null)
            return false;
        if (other.getTablePrefix() != null
                && other.getTablePrefix().equals(this.getTablePrefix()) == false)
            return false;
        if (other.getSchemaChangePolicy() == null ^ this.getSchemaChangePolicy() == null)
            return false;
        if (other.getSchemaChangePolicy() != null
                && other.getSchemaChangePolicy().equals(this.getSchemaChangePolicy()) == false)
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
