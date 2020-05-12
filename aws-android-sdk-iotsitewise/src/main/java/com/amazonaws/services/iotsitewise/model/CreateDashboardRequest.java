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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a dashboard in an AWS IoT SiteWise Monitor project.
 * </p>
 */
public class CreateDashboardRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the project in which to create the dashboard.
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
     * A friendly name for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String dashboardName;

    /**
     * <p>
     * A description for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String dashboardDescription;

    /**
     * <p>
     * The dashboard definition specified in a JSON literal. For detailed
     * information, see <a href=
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
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the project in which to create the dashboard.
     *         </p>
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param projectId <p>
     *            The ID of the project in which to create the dashboard.
     *            </p>
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
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
     *            The ID of the project in which to create the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * <p>
     * A friendly name for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A friendly name for the dashboard.
     *         </p>
     */
    public String getDashboardName() {
        return dashboardName;
    }

    /**
     * <p>
     * A friendly name for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param dashboardName <p>
     *            A friendly name for the dashboard.
     *            </p>
     */
    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * A friendly name for the dashboard.
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
     *            A friendly name for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest withDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * <p>
     * A description for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A description for the dashboard.
     *         </p>
     */
    public String getDashboardDescription() {
        return dashboardDescription;
    }

    /**
     * <p>
     * A description for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param dashboardDescription <p>
     *            A description for the dashboard.
     *            </p>
     */
    public void setDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
    }

    /**
     * <p>
     * A description for the dashboard.
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
     *            A description for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest withDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
        return this;
    }

    /**
     * <p>
     * The dashboard definition specified in a JSON literal. For detailed
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     * >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 204800<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The dashboard definition specified in a JSON literal. For
     *         detailed information, see <a href=
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
     * The dashboard definition specified in a JSON literal. For detailed
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     * >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 204800<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param dashboardDefinition <p>
     *            The dashboard definition specified in a JSON literal. For
     *            detailed information, see <a href=
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
     * The dashboard definition specified in a JSON literal. For detailed
     * information, see <a href=
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
     *            The dashboard definition specified in a JSON literal. For
     *            detailed information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *            >Creating Dashboards (CLI)</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest withDashboardDefinition(String dashboardDefinition) {
        this.dashboardDefinition = dashboardDefinition;
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A unique case-sensitive identifier that you can provide to ensure
     *         the idempotency of the request. Don't reuse this client token if
     *         a new idempotent request is required.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that contain metadata for the
     *         dashboard. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *         >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the
     *            dashboard. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the
     *            dashboard. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDashboardRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateDashboardRequest cleartagsEntries() {
        this.tags = null;
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
        if (getProjectId() != null)
            sb.append("projectId: " + getProjectId() + ",");
        if (getDashboardName() != null)
            sb.append("dashboardName: " + getDashboardName() + ",");
        if (getDashboardDescription() != null)
            sb.append("dashboardDescription: " + getDashboardDescription() + ",");
        if (getDashboardDefinition() != null)
            sb.append("dashboardDefinition: " + getDashboardDefinition() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardDescription() == null) ? 0 : getDashboardDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardDefinition() == null) ? 0 : getDashboardDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDashboardRequest == false)
            return false;
        CreateDashboardRequest other = (CreateDashboardRequest) obj;

        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null
                && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null
                && other.getDashboardName().equals(this.getDashboardName()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
