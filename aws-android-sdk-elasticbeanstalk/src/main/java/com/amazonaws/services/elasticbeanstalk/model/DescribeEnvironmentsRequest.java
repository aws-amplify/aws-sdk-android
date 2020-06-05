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
 * Returns descriptions for existing environments.
 * </p>
 */
public class DescribeEnvironmentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified IDs.
     * </p>
     */
    private java.util.List<String> environmentIds;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified names.
     * </p>
     */
    private java.util.List<String> environmentNames;

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     */
    private Boolean includeDeleted;

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>
     * , then environments deleted after this date are displayed.
     * </p>
     */
    private java.util.Date includedDeletedBackTo;

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to
     * include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments
     * are retrieved in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxRecords;

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that are associated with
     *            this application.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application.
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
     *            descriptions to include only those that are associated with
     *            this application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that are associated with this
     *         application version.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that are associated with
     *            this application version.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that are associated with this application version.
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
     *            descriptions to include only those that are associated with
     *            this application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified IDs.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified IDs.
     *         </p>
     */
    public java.util.List<String> getEnvironmentIds() {
        return environmentIds;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified IDs.
     * </p>
     *
     * @param environmentIds <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that have the specified
     *            IDs.
     *            </p>
     */
    public void setEnvironmentIds(java.util.Collection<String> environmentIds) {
        if (environmentIds == null) {
            this.environmentIds = null;
            return;
        }

        this.environmentIds = new java.util.ArrayList<String>(environmentIds);
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentIds <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that have the specified
     *            IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withEnvironmentIds(String... environmentIds) {
        if (getEnvironmentIds() == null) {
            this.environmentIds = new java.util.ArrayList<String>(environmentIds.length);
        }
        for (String value : environmentIds) {
            this.environmentIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentIds <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that have the specified
     *            IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withEnvironmentIds(
            java.util.Collection<String> environmentIds) {
        setEnvironmentIds(environmentIds);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified names.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those that have the specified names.
     *         </p>
     */
    public java.util.List<String> getEnvironmentNames() {
        return environmentNames;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified names.
     * </p>
     *
     * @param environmentNames <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that have the specified
     *            names.
     *            </p>
     */
    public void setEnvironmentNames(java.util.Collection<String> environmentNames) {
        if (environmentNames == null) {
            this.environmentNames = null;
            return;
        }

        this.environmentNames = new java.util.ArrayList<String>(environmentNames);
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentNames <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that have the specified
     *            names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withEnvironmentNames(String... environmentNames) {
        if (getEnvironmentNames() == null) {
            this.environmentNames = new java.util.ArrayList<String>(environmentNames.length);
        }
        for (String value : environmentNames) {
            this.environmentNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to include only those that have the specified names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentNames <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to include only those that have the specified
     *            names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withEnvironmentNames(
            java.util.Collection<String> environmentNames) {
        setEnvironmentNames(environmentNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     *
     * @return <p>
     *         Indicates whether to include deleted environments:
     *         </p>
     *         <p>
     *         <code>true</code>: Environments that have been deleted after
     *         <code>IncludedDeletedBackTo</code> are displayed.
     *         </p>
     *         <p>
     *         <code>false</code>: Do not include deleted environments.
     *         </p>
     */
    public Boolean isIncludeDeleted() {
        return includeDeleted;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     *
     * @return <p>
     *         Indicates whether to include deleted environments:
     *         </p>
     *         <p>
     *         <code>true</code>: Environments that have been deleted after
     *         <code>IncludedDeletedBackTo</code> are displayed.
     *         </p>
     *         <p>
     *         <code>false</code>: Do not include deleted environments.
     *         </p>
     */
    public Boolean getIncludeDeleted() {
        return includeDeleted;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     *
     * @param includeDeleted <p>
     *            Indicates whether to include deleted environments:
     *            </p>
     *            <p>
     *            <code>true</code>: Environments that have been deleted after
     *            <code>IncludedDeletedBackTo</code> are displayed.
     *            </p>
     *            <p>
     *            <code>false</code>: Do not include deleted environments.
     *            </p>
     */
    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after
     * <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeDeleted <p>
     *            Indicates whether to include deleted environments:
     *            </p>
     *            <p>
     *            <code>true</code>: Environments that have been deleted after
     *            <code>IncludedDeletedBackTo</code> are displayed.
     *            </p>
     *            <p>
     *            <code>false</code>: Do not include deleted environments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>
     * , then environments deleted after this date are displayed.
     * </p>
     *
     * @return <p>
     *         If specified when <code>IncludeDeleted</code> is set to
     *         <code>true</code>, then environments deleted after this date are
     *         displayed.
     *         </p>
     */
    public java.util.Date getIncludedDeletedBackTo() {
        return includedDeletedBackTo;
    }

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>
     * , then environments deleted after this date are displayed.
     * </p>
     *
     * @param includedDeletedBackTo <p>
     *            If specified when <code>IncludeDeleted</code> is set to
     *            <code>true</code>, then environments deleted after this date
     *            are displayed.
     *            </p>
     */
    public void setIncludedDeletedBackTo(java.util.Date includedDeletedBackTo) {
        this.includedDeletedBackTo = includedDeletedBackTo;
    }

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>
     * , then environments deleted after this date are displayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includedDeletedBackTo <p>
     *            If specified when <code>IncludeDeleted</code> is set to
     *            <code>true</code>, then environments deleted after this date
     *            are displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withIncludedDeletedBackTo(
            java.util.Date includedDeletedBackTo) {
        this.includedDeletedBackTo = includedDeletedBackTo;
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to
     * include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments
     * are retrieved in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         For a paginated request. Specify a maximum number of environments
     *         to include in each response.
     *         </p>
     *         <p>
     *         If no <code>MaxRecords</code> is specified, all available
     *         environments are retrieved in a single response.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to
     * include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments
     * are retrieved in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords <p>
     *            For a paginated request. Specify a maximum number of
     *            environments to include in each response.
     *            </p>
     *            <p>
     *            If no <code>MaxRecords</code> is specified, all available
     *            environments are retrieved in a single response.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to
     * include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments
     * are retrieved in a single response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords <p>
     *            For a paginated request. Specify a maximum number of
     *            environments to include in each response.
     *            </p>
     *            <p>
     *            If no <code>MaxRecords</code> is specified, all available
     *            environments are retrieved in a single response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     *
     * @return <p>
     *         For a paginated request. Specify a token from a previous response
     *         page to retrieve the next response page. All other parameter
     *         values must be identical to the ones specified in the initial
     *         request.
     *         </p>
     *         <p>
     *         If no <code>NextToken</code> is specified, the first page is
     *         retrieved.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     *
     * @param nextToken <p>
     *            For a paginated request. Specify a token from a previous
     *            response page to retrieve the next response page. All other
     *            parameter values must be identical to the ones specified in
     *            the initial request.
     *            </p>
     *            <p>
     *            If no <code>NextToken</code> is specified, the first page is
     *            retrieved.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            For a paginated request. Specify a token from a previous
     *            response page to retrieve the next response page. All other
     *            parameter values must be identical to the ones specified in
     *            the initial request.
     *            </p>
     *            <p>
     *            If no <code>NextToken</code> is specified, the first page is
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsRequest withNextToken(String nextToken) {
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
        if (getEnvironmentIds() != null)
            sb.append("EnvironmentIds: " + getEnvironmentIds() + ",");
        if (getEnvironmentNames() != null)
            sb.append("EnvironmentNames: " + getEnvironmentNames() + ",");
        if (getIncludeDeleted() != null)
            sb.append("IncludeDeleted: " + getIncludeDeleted() + ",");
        if (getIncludedDeletedBackTo() != null)
            sb.append("IncludedDeletedBackTo: " + getIncludedDeletedBackTo() + ",");
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
                + ((getEnvironmentIds() == null) ? 0 : getEnvironmentIds().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentNames() == null) ? 0 : getEnvironmentNames().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeDeleted() == null) ? 0 : getIncludeDeleted().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludedDeletedBackTo() == null) ? 0 : getIncludedDeletedBackTo().hashCode());
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

        if (obj instanceof DescribeEnvironmentsRequest == false)
            return false;
        DescribeEnvironmentsRequest other = (DescribeEnvironmentsRequest) obj;

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
        if (other.getEnvironmentIds() == null ^ this.getEnvironmentIds() == null)
            return false;
        if (other.getEnvironmentIds() != null
                && other.getEnvironmentIds().equals(this.getEnvironmentIds()) == false)
            return false;
        if (other.getEnvironmentNames() == null ^ this.getEnvironmentNames() == null)
            return false;
        if (other.getEnvironmentNames() != null
                && other.getEnvironmentNames().equals(this.getEnvironmentNames()) == false)
            return false;
        if (other.getIncludeDeleted() == null ^ this.getIncludeDeleted() == null)
            return false;
        if (other.getIncludeDeleted() != null
                && other.getIncludeDeleted().equals(this.getIncludeDeleted()) == false)
            return false;
        if (other.getIncludedDeletedBackTo() == null ^ this.getIncludedDeletedBackTo() == null)
            return false;
        if (other.getIncludedDeletedBackTo() != null
                && other.getIncludedDeletedBackTo().equals(this.getIncludedDeletedBackTo()) == false)
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
