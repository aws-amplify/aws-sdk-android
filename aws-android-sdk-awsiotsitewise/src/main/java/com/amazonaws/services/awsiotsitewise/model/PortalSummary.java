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

/**
 * <p>
 * Contains a portal summary.
 * </p>
 */
public class PortalSummary implements Serializable {
    /**
     * <p>
     * The ID of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String name;

    /**
     * <p>
     * The portal's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String description;

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application
     * portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     */
    private String startUrl;

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the service role that allows the portal's users to access
     * your AWS IoT SiteWise resources on your behalf. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     * >Using service roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT
     * SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the portal.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the portal.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the portal.
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
     * @param id <p>
     *            The ID of the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the portal.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the portal.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The portal's description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param description <p>
     *            The portal's description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param description <p>
     *            The portal's description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application
     * portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     *
     * @return <p>
     *         The public root URL for the AWS IoT AWS IoT SiteWise Monitor
     *         application portal.
     *         </p>
     */
    public String getStartUrl() {
        return startUrl;
    }

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application
     * portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     *
     * @param startUrl <p>
     *            The public root URL for the AWS IoT AWS IoT SiteWise Monitor
     *            application portal.
     *            </p>
     */
    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application
     * portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     *
     * @param startUrl <p>
     *            The public root URL for the AWS IoT AWS IoT SiteWise Monitor
     *            application portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withStartUrl(String startUrl) {
        this.startUrl = startUrl;
        return this;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the portal was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     *
     * @param creationDate <p>
     *            The date the portal was created, in Unix epoch time.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the portal was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the portal was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     *
     * @param lastUpdateDate <p>
     *            The date the portal was last updated, in Unix epoch time.
     *            </p>
     */
    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateDate <p>
     *            The date the portal was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the service role that allows the portal's users to access
     * your AWS IoT SiteWise resources on your behalf. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     * >Using service roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT
     * SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >ARN</a> of the service role that allows the portal's users to
     *         access your AWS IoT SiteWise resources on your behalf. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     *         >Using service roles for AWS IoT SiteWise Monitor</a> in the
     *         <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the service role that allows the portal's users to access
     * your AWS IoT SiteWise resources on your behalf. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     * >Using service roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT
     * SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param roleArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the service role that allows the portal's users to
     *            access your AWS IoT SiteWise resources on your behalf. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     *            >Using service roles for AWS IoT SiteWise Monitor</a> in the
     *            <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the service role that allows the portal's users to access
     * your AWS IoT SiteWise resources on your behalf. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     * >Using service roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT
     * SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param roleArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the service role that allows the portal's users to
     *            access your AWS IoT SiteWise resources on your behalf. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     *            >Using service roles for AWS IoT SiteWise Monitor</a> in the
     *            <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortalSummary withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getStartUrl() != null)
            sb.append("startUrl: " + getStartUrl() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastUpdateDate() != null)
            sb.append("lastUpdateDate: " + getLastUpdateDate() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartUrl() == null) ? 0 : getStartUrl().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortalSummary == false)
            return false;
        PortalSummary other = (PortalSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartUrl() == null ^ this.getStartUrl() == null)
            return false;
        if (other.getStartUrl() != null && other.getStartUrl().equals(this.getStartUrl()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null
                && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
