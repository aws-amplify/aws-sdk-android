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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

public class DescribeDashboardResult implements Serializable {
    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String dashboardArn;

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String dashboardName;

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String projectId;

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String dashboardDescription;

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     * >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 204800<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String dashboardDefinition;

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date dashboardCreationDate;

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date dashboardLastUpdateDate;

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the dashboard.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param dashboardId <p>
     *            The ID of the dashboard.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param dashboardId <p>
     *            The ID of the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >ARN</a> of the dashboard, which has the following format.
     *         </p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     *         </p>
     */
    public String getDashboardArn() {
        return dashboardArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param dashboardArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the dashboard, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     *            </p>
     */
    public void setDashboardArn(String dashboardArn) {
        this.dashboardArn = dashboardArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the dashboard, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param dashboardArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the dashboard, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardArn(String dashboardArn) {
        this.dashboardArn = dashboardArn;
        return this;
    }

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the dashboard.
     *         </p>
     */
    public String getDashboardName() {
        return dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param dashboardName <p>
     *            The name of the dashboard.
     *            </p>
     */
    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * The name of the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param dashboardName <p>
     *            The name of the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the project that the dashboard is in.
     *         </p>
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param projectId <p>
     *            The ID of the project that the dashboard is in.
     *            </p>
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project that the dashboard is in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param projectId <p>
     *            The ID of the project that the dashboard is in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The dashboard's description.
     *         </p>
     */
    public String getDashboardDescription() {
        return dashboardDescription;
    }

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param dashboardDescription <p>
     *            The dashboard's description.
     *            </p>
     */
    public void setDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
    }

    /**
     * <p>
     * The dashboard's description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param dashboardDescription <p>
     *            The dashboard's description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
        return this;
    }

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     * >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 204800<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The dashboard's definition JSON literal. For detailed
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *         >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User
     *         Guide</i>.
     *         </p>
     */
    public String getDashboardDefinition() {
        return dashboardDefinition;
    }

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     * >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 204800<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param dashboardDefinition <p>
     *            The dashboard's definition JSON literal. For detailed
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *            >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     */
    public void setDashboardDefinition(String dashboardDefinition) {
        this.dashboardDefinition = dashboardDefinition;
    }

    /**
     * <p>
     * The dashboard's definition JSON literal. For detailed information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     * >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 204800<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param dashboardDefinition <p>
     *            The dashboard's definition JSON literal. For detailed
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *            >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardDefinition(String dashboardDefinition) {
        this.dashboardDefinition = dashboardDefinition;
        return this;
    }

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the dashboard was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getDashboardCreationDate() {
        return dashboardCreationDate;
    }

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     *
     * @param dashboardCreationDate <p>
     *            The date the dashboard was created, in Unix epoch time.
     *            </p>
     */
    public void setDashboardCreationDate(java.util.Date dashboardCreationDate) {
        this.dashboardCreationDate = dashboardCreationDate;
    }

    /**
     * <p>
     * The date the dashboard was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashboardCreationDate <p>
     *            The date the dashboard was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardCreationDate(java.util.Date dashboardCreationDate) {
        this.dashboardCreationDate = dashboardCreationDate;
        return this;
    }

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the dashboard was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getDashboardLastUpdateDate() {
        return dashboardLastUpdateDate;
    }

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     *
     * @param dashboardLastUpdateDate <p>
     *            The date the dashboard was last updated, in Unix epoch time.
     *            </p>
     */
    public void setDashboardLastUpdateDate(java.util.Date dashboardLastUpdateDate) {
        this.dashboardLastUpdateDate = dashboardLastUpdateDate;
    }

    /**
     * <p>
     * The date the dashboard was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashboardLastUpdateDate <p>
     *            The date the dashboard was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDashboardResult withDashboardLastUpdateDate(
            java.util.Date dashboardLastUpdateDate) {
        this.dashboardLastUpdateDate = dashboardLastUpdateDate;
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
        if (getDashboardId() != null)
            sb.append("dashboardId: " + getDashboardId() + ",");
        if (getDashboardArn() != null)
            sb.append("dashboardArn: " + getDashboardArn() + ",");
        if (getDashboardName() != null)
            sb.append("dashboardName: " + getDashboardName() + ",");
        if (getProjectId() != null)
            sb.append("projectId: " + getProjectId() + ",");
        if (getDashboardDescription() != null)
            sb.append("dashboardDescription: " + getDashboardDescription() + ",");
        if (getDashboardDefinition() != null)
            sb.append("dashboardDefinition: " + getDashboardDefinition() + ",");
        if (getDashboardCreationDate() != null)
            sb.append("dashboardCreationDate: " + getDashboardCreationDate() + ",");
        if (getDashboardLastUpdateDate() != null)
            sb.append("dashboardLastUpdateDate: " + getDashboardLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardArn() == null) ? 0 : getDashboardArn().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardDescription() == null) ? 0 : getDashboardDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardDefinition() == null) ? 0 : getDashboardDefinition().hashCode());
        hashCode = prime
                * hashCode
                + ((getDashboardCreationDate() == null) ? 0 : getDashboardCreationDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getDashboardLastUpdateDate() == null) ? 0 : getDashboardLastUpdateDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDashboardResult == false)
            return false;
        DescribeDashboardResult other = (DescribeDashboardResult) obj;

        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null
                && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getDashboardArn() == null ^ this.getDashboardArn() == null)
            return false;
        if (other.getDashboardArn() != null
                && other.getDashboardArn().equals(this.getDashboardArn()) == false)
            return false;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null
                && other.getDashboardName().equals(this.getDashboardName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null
                && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getDashboardDescription() == null ^ this.getDashboardDescription() == null)
            return false;
        if (other.getDashboardDescription() != null
                && other.getDashboardDescription().equals(this.getDashboardDescription()) == false)
            return false;
        if (other.getDashboardDefinition() == null ^ this.getDashboardDefinition() == null)
            return false;
        if (other.getDashboardDefinition() != null
                && other.getDashboardDefinition().equals(this.getDashboardDefinition()) == false)
            return false;
        if (other.getDashboardCreationDate() == null ^ this.getDashboardCreationDate() == null)
            return false;
        if (other.getDashboardCreationDate() != null
                && other.getDashboardCreationDate().equals(this.getDashboardCreationDate()) == false)
            return false;
        if (other.getDashboardLastUpdateDate() == null ^ this.getDashboardLastUpdateDate() == null)
            return false;
        if (other.getDashboardLastUpdateDate() != null
                && other.getDashboardLastUpdateDate().equals(this.getDashboardLastUpdateDate()) == false)
            return false;
        return true;
    }
}
