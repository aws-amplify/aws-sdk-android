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
 * Updates an AWS IoT SiteWise Monitor portal.
 * </p>
 */
public class UpdatePortalRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the portal to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String portalId;

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String portalName;

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String portalDescription;

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^@]+@[^@]+<br/>
     */
    private String portalContactEmail;

    /**
     * <p>
     * Contains an image that is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An image file. Choose this option to upload a new image.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ID of an existing image. Choose this option to keep an existing
     * image.
     * </p>
     * </li>
     * </ul>
     */
    private Image portalLogoImage;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of a service role that allows the portal's users to access your
     * AWS IoT SiteWise resources on your behalf. For more information, see <a
     * href=
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
     * The ID of the portal to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the portal to update.
     *         </p>
     */
    public String getPortalId() {
        return portalId;
    }

    /**
     * <p>
     * The ID of the portal to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param portalId <p>
     *            The ID of the portal to update.
     *            </p>
     */
    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the portal to update.
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
     * @param portalId <p>
     *            The ID of the portal to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalRequest withPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A new friendly name for the portal.
     *         </p>
     */
    public String getPortalName() {
        return portalName;
    }

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param portalName <p>
     *            A new friendly name for the portal.
     *            </p>
     */
    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param portalName <p>
     *            A new friendly name for the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalRequest withPortalName(String portalName) {
        this.portalName = portalName;
        return this;
    }

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A new description for the portal.
     *         </p>
     */
    public String getPortalDescription() {
        return portalDescription;
    }

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param portalDescription <p>
     *            A new description for the portal.
     *            </p>
     */
    public void setPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
    }

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param portalDescription <p>
     *            A new description for the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalRequest withPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
        return this;
    }

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^@]+@[^@]+<br/>
     *
     * @return <p>
     *         The AWS administrator's contact email address.
     *         </p>
     */
    public String getPortalContactEmail() {
        return portalContactEmail;
    }

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^@]+@[^@]+<br/>
     *
     * @param portalContactEmail <p>
     *            The AWS administrator's contact email address.
     *            </p>
     */
    public void setPortalContactEmail(String portalContactEmail) {
        this.portalContactEmail = portalContactEmail;
    }

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^@]+@[^@]+<br/>
     *
     * @param portalContactEmail <p>
     *            The AWS administrator's contact email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalRequest withPortalContactEmail(String portalContactEmail) {
        this.portalContactEmail = portalContactEmail;
        return this;
    }

    /**
     * <p>
     * Contains an image that is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An image file. Choose this option to upload a new image.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ID of an existing image. Choose this option to keep an existing
     * image.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Contains an image that is one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An image file. Choose this option to upload a new image.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ID of an existing image. Choose this option to keep an
     *         existing image.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Image getPortalLogoImage() {
        return portalLogoImage;
    }

    /**
     * <p>
     * Contains an image that is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An image file. Choose this option to upload a new image.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ID of an existing image. Choose this option to keep an existing
     * image.
     * </p>
     * </li>
     * </ul>
     *
     * @param portalLogoImage <p>
     *            Contains an image that is one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An image file. Choose this option to upload a new image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The ID of an existing image. Choose this option to keep an
     *            existing image.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPortalLogoImage(Image portalLogoImage) {
        this.portalLogoImage = portalLogoImage;
    }

    /**
     * <p>
     * Contains an image that is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An image file. Choose this option to upload a new image.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ID of an existing image. Choose this option to keep an existing
     * image.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalLogoImage <p>
     *            Contains an image that is one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An image file. Choose this option to upload a new image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The ID of an existing image. Choose this option to keep an
     *            existing image.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalRequest withPortalLogoImage(Image portalLogoImage) {
        this.portalLogoImage = portalLogoImage;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of a service role that allows the portal's users to access your
     * AWS IoT SiteWise resources on your behalf. For more information, see <a
     * href=
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
     *         >ARN</a> of a service role that allows the portal's users to
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
     * >ARN</a> of a service role that allows the portal's users to access your
     * AWS IoT SiteWise resources on your behalf. For more information, see <a
     * href=
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
     *            >ARN</a> of a service role that allows the portal's users to
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
     * >ARN</a> of a service role that allows the portal's users to access your
     * AWS IoT SiteWise resources on your behalf. For more information, see <a
     * href=
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
     *            >ARN</a> of a service role that allows the portal's users to
     *            access your AWS IoT SiteWise resources on your behalf. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html"
     *            >Using service roles for AWS IoT SiteWise Monitor</a> in the
     *            <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortalRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
    public UpdatePortalRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getPortalId() != null)
            sb.append("portalId: " + getPortalId() + ",");
        if (getPortalName() != null)
            sb.append("portalName: " + getPortalName() + ",");
        if (getPortalDescription() != null)
            sb.append("portalDescription: " + getPortalDescription() + ",");
        if (getPortalContactEmail() != null)
            sb.append("portalContactEmail: " + getPortalContactEmail() + ",");
        if (getPortalLogoImage() != null)
            sb.append("portalLogoImage: " + getPortalLogoImage() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getPortalName() == null) ? 0 : getPortalName().hashCode());
        hashCode = prime * hashCode
                + ((getPortalDescription() == null) ? 0 : getPortalDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPortalContactEmail() == null) ? 0 : getPortalContactEmail().hashCode());
        hashCode = prime * hashCode
                + ((getPortalLogoImage() == null) ? 0 : getPortalLogoImage().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortalRequest == false)
            return false;
        UpdatePortalRequest other = (UpdatePortalRequest) obj;

        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getPortalName() == null ^ this.getPortalName() == null)
            return false;
        if (other.getPortalName() != null
                && other.getPortalName().equals(this.getPortalName()) == false)
            return false;
        if (other.getPortalDescription() == null ^ this.getPortalDescription() == null)
            return false;
        if (other.getPortalDescription() != null
                && other.getPortalDescription().equals(this.getPortalDescription()) == false)
            return false;
        if (other.getPortalContactEmail() == null ^ this.getPortalContactEmail() == null)
            return false;
        if (other.getPortalContactEmail() != null
                && other.getPortalContactEmail().equals(this.getPortalContactEmail()) == false)
            return false;
        if (other.getPortalLogoImage() == null ^ this.getPortalLogoImage() == null)
            return false;
        if (other.getPortalLogoImage() != null
                && other.getPortalLogoImage().equals(this.getPortalLogoImage()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
