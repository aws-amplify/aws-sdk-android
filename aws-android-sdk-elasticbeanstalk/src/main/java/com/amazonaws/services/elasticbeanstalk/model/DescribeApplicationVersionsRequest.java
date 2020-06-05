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
 * Retrieve a list of application versions.
 * </p>
 */
public class DescribeApplicationVersionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specify an application name to show only application versions for that
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * Specify a version label to show a specific application version.
     * </p>
     */
    private java.util.List<String> versionLabels;

    /**
     * <p>
     * For a paginated request. Specify a maximum number of application versions
     * to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available application
     * versions are retrieved in a single response.
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
     * Specify an application name to show only application versions for that
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specify an application name to show only application versions for
     *         that application.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * Specify an application name to show only application versions for that
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            Specify an application name to show only application versions
     *            for that application.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Specify an application name to show only application versions for that
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            Specify an application name to show only application versions
     *            for that application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * Specify a version label to show a specific application version.
     * </p>
     *
     * @return <p>
     *         Specify a version label to show a specific application version.
     *         </p>
     */
    public java.util.List<String> getVersionLabels() {
        return versionLabels;
    }

    /**
     * <p>
     * Specify a version label to show a specific application version.
     * </p>
     *
     * @param versionLabels <p>
     *            Specify a version label to show a specific application
     *            version.
     *            </p>
     */
    public void setVersionLabels(java.util.Collection<String> versionLabels) {
        if (versionLabels == null) {
            this.versionLabels = null;
            return;
        }

        this.versionLabels = new java.util.ArrayList<String>(versionLabels);
    }

    /**
     * <p>
     * Specify a version label to show a specific application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionLabels <p>
     *            Specify a version label to show a specific application
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsRequest withVersionLabels(String... versionLabels) {
        if (getVersionLabels() == null) {
            this.versionLabels = new java.util.ArrayList<String>(versionLabels.length);
        }
        for (String value : versionLabels) {
            this.versionLabels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify a version label to show a specific application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionLabels <p>
     *            Specify a version label to show a specific application
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsRequest withVersionLabels(
            java.util.Collection<String> versionLabels) {
        setVersionLabels(versionLabels);
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of application versions
     * to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available application
     * versions are retrieved in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         For a paginated request. Specify a maximum number of application
     *         versions to include in each response.
     *         </p>
     *         <p>
     *         If no <code>MaxRecords</code> is specified, all available
     *         application versions are retrieved in a single response.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of application versions
     * to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available application
     * versions are retrieved in a single response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords <p>
     *            For a paginated request. Specify a maximum number of
     *            application versions to include in each response.
     *            </p>
     *            <p>
     *            If no <code>MaxRecords</code> is specified, all available
     *            application versions are retrieved in a single response.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of application versions
     * to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available application
     * versions are retrieved in a single response.
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
     *            application versions to include in each response.
     *            </p>
     *            <p>
     *            If no <code>MaxRecords</code> is specified, all available
     *            application versions are retrieved in a single response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsRequest withMaxRecords(Integer maxRecords) {
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
    public DescribeApplicationVersionsRequest withNextToken(String nextToken) {
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
        if (getVersionLabels() != null)
            sb.append("VersionLabels: " + getVersionLabels() + ",");
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
                + ((getVersionLabels() == null) ? 0 : getVersionLabels().hashCode());
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

        if (obj instanceof DescribeApplicationVersionsRequest == false)
            return false;
        DescribeApplicationVersionsRequest other = (DescribeApplicationVersionsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabels() == null ^ this.getVersionLabels() == null)
            return false;
        if (other.getVersionLabels() != null
                && other.getVersionLabels().equals(this.getVersionLabels()) == false)
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
