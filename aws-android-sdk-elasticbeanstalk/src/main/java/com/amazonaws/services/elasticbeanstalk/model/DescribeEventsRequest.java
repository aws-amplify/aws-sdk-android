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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns list of event descriptions matching criteria up to the last 6 weeks.
 * </p>
 * <note>
 * <p>
 * This action returns the most recent 1,000 events from the specified
 * <code>NextToken</code>.
 * </p>
 * </note>
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those associated with this application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that are associated with this environment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The ARN of a custom platform version. If specified, AWS Elastic Beanstalk
     * restricts the returned descriptions to those associated with this custom
     * platform version.
     * </p>
     */
    private String platformArn;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * If specified, limits the events returned from this call to include only
     * those with the specified severity or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     */
    private String severity;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur on or after this time.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur up to, but not including, the <code>EndTime</code>.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxRecords;

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those associated with this application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those associated with this
     *         application.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those associated with this application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those associated with this
     *            application.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those associated with this application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those associated with this
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this application version.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those associated with this application
     *            version.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those associated with this application
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that are associated with this environment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that are associated with this environment
     *         configuration.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that are associated with this environment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those that are associated with this
     *            environment configuration.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that are associated with this environment configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those that are associated with this
     *            environment configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     *
     * @param environmentId <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those associated with this environment.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those associated with this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those associated with this environment.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those associated with this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those associated with this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The ARN of a custom platform version. If specified, AWS Elastic Beanstalk
     * restricts the returned descriptions to those associated with this custom
     * platform version.
     * </p>
     *
     * @return <p>
     *         The ARN of a custom platform version. If specified, AWS Elastic
     *         Beanstalk restricts the returned descriptions to those associated
     *         with this custom platform version.
     *         </p>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The ARN of a custom platform version. If specified, AWS Elastic Beanstalk
     * restricts the returned descriptions to those associated with this custom
     * platform version.
     * </p>
     *
     * @param platformArn <p>
     *            The ARN of a custom platform version. If specified, AWS
     *            Elastic Beanstalk restricts the returned descriptions to those
     *            associated with this custom platform version.
     *            </p>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of a custom platform version. If specified, AWS Elastic Beanstalk
     * restricts the returned descriptions to those associated with this custom
     * platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The ARN of a custom platform version. If specified, AWS
     *            Elastic Beanstalk restricts the returned descriptions to those
     *            associated with this custom platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the described
     *         events to include only those associated with this request ID.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     * </p>
     *
     * @param requestId <p>
     *            If specified, AWS Elastic Beanstalk restricts the described
     *            events to include only those associated with this request ID.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            If specified, AWS Elastic Beanstalk restricts the described
     *            events to include only those associated with this request ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only
     * those with the specified severity or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @return <p>
     *         If specified, limits the events returned from this call to
     *         include only those with the specified severity or higher.
     *         </p>
     * @see EventSeverity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only
     * those with the specified severity or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity <p>
     *            If specified, limits the events returned from this call to
     *            include only those with the specified severity or higher.
     *            </p>
     * @see EventSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only
     * those with the specified severity or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity <p>
     *            If specified, limits the events returned from this call to
     *            include only those with the specified severity or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSeverity
     */
    public DescribeEventsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only
     * those with the specified severity or higher.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity <p>
     *            If specified, limits the events returned from this call to
     *            include only those with the specified severity or higher.
     *            </p>
     * @see EventSeverity
     */
    public void setSeverity(EventSeverity severity) {
        this.severity = severity.toString();
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only
     * those with the specified severity or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity <p>
     *            If specified, limits the events returned from this call to
     *            include only those with the specified severity or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSeverity
     */
    public DescribeEventsRequest withSeverity(EventSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur on or after this time.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur on or after this time.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur on or after this time.
     * </p>
     *
     * @param startTime <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those that occur on or after this time.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur on or after this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those that occur on or after this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur up to, but not including, the <code>EndTime</code>.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur up to, but not including, the
     *         <code>EndTime</code>.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur up to, but not including, the <code>EndTime</code>.
     * </p>
     *
     * @param endTime <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those that occur up to, but not including, the
     *            <code>EndTime</code>.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to those that occur up to, but not including, the <code>EndTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to those that occur up to, but not including, the
     *            <code>EndTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Specifies the maximum number of events that can be returned,
     *         beginning with the most recent event.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords <p>
     *            Specifies the maximum number of events that can be returned,
     *            beginning with the most recent event.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords <p>
     *            Specifies the maximum number of events that can be returned,
     *            beginning with the most recent event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of
     * results.
     * </p>
     *
     * @return <p>
     *         Pagination token. If specified, the events return the next batch
     *         of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            Pagination token. If specified, the events return the next
     *            batch of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Pagination token. If specified, the events return the next
     *            batch of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventsRequest == false)
            return false;
        DescribeEventsRequest other = (DescribeEventsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null
                && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
