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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a summary for a dashboard.
 * </p>
 */
public class DescribeDashboardRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * describing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * The version number for the dashboard. If a version number isn't passed,
     * the latest published dashboard version is described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long versionNumber;

    /**
     * <p>
     * The alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     */
    private String aliasName;

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * describing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the dashboard that you're
     *         describing.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * describing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the dashboard that
     *            you're describing.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard that you're
     * describing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the dashboard that
     *            you're describing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the dashboard.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardRequest withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * The version number for the dashboard. If a version number isn't passed,
     * the latest published dashboard version is described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version number for the dashboard. If a version number isn't
     *         passed, the latest published dashboard version is described.
     *         </p>
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * <p>
     * The version number for the dashboard. If a version number isn't passed,
     * the latest published dashboard version is described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            The version number for the dashboard. If a version number
     *            isn't passed, the latest published dashboard version is
     *            described.
     *            </p>
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number for the dashboard. If a version number isn't passed,
     * the latest published dashboard version is described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            The version number for the dashboard. If a version number
     *            isn't passed, the latest published dashboard version is
     *            described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardRequest withVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @return <p>
     *         The alias name.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @param aliasName <p>
     *            The alias name.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @param aliasName <p>
     *            The alias name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getDashboardId() != null)
            sb.append("DashboardId: " + getDashboardId() + ",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: " + getVersionNumber() + ",");
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode
                + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDashboardRequest == false)
            return false;
        DescribeDashboardRequest other = (DescribeDashboardRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null
                && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null
                && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }
}
