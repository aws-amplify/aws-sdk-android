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
 * Creates a portal, which can contain projects and dashboards. Before you can
 * create a portal, you must configure AWS Single Sign-On in the current Region.
 * AWS IoT SiteWise Monitor uses AWS SSO to manage user permissions. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso"
 * >Enabling AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 * <note>
 * <p>
 * Before you can sign in to a new portal, you must add at least one AWS SSO
 * user or group to that portal. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
 * >Adding or Removing Portal Administrators</a> in the <i>AWS IoT SiteWise User
 * Guide</i>.
 * </p>
 * </note>
 */
public class CreatePortalRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String portalName;

    /**
     * <p>
     * A description for the portal.
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
     * A logo image to display in the portal. Upload a square, high-resolution
     * image. The image is displayed on a dark background.
     * </p>
     */
    private ImageFile portalLogoImageFile;

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
     * A list of key-value pairs that contain metadata for the portal. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A friendly name for the portal.
     *         </p>
     */
    public String getPortalName() {
        return portalName;
    }

    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param portalName <p>
     *            A friendly name for the portal.
     *            </p>
     */
    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    /**
     * <p>
     * A friendly name for the portal.
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
     *            A friendly name for the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalRequest withPortalName(String portalName) {
        this.portalName = portalName;
        return this;
    }

    /**
     * <p>
     * A description for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A description for the portal.
     *         </p>
     */
    public String getPortalDescription() {
        return portalDescription;
    }

    /**
     * <p>
     * A description for the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param portalDescription <p>
     *            A description for the portal.
     *            </p>
     */
    public void setPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
    }

    /**
     * <p>
     * A description for the portal.
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
     *            A description for the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalRequest withPortalDescription(String portalDescription) {
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
    public CreatePortalRequest withPortalContactEmail(String portalContactEmail) {
        this.portalContactEmail = portalContactEmail;
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
    public CreatePortalRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution
     * image. The image is displayed on a dark background.
     * </p>
     *
     * @return <p>
     *         A logo image to display in the portal. Upload a square,
     *         high-resolution image. The image is displayed on a dark
     *         background.
     *         </p>
     */
    public ImageFile getPortalLogoImageFile() {
        return portalLogoImageFile;
    }

    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution
     * image. The image is displayed on a dark background.
     * </p>
     *
     * @param portalLogoImageFile <p>
     *            A logo image to display in the portal. Upload a square,
     *            high-resolution image. The image is displayed on a dark
     *            background.
     *            </p>
     */
    public void setPortalLogoImageFile(ImageFile portalLogoImageFile) {
        this.portalLogoImageFile = portalLogoImageFile;
    }

    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution
     * image. The image is displayed on a dark background.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalLogoImageFile <p>
     *            A logo image to display in the portal. Upload a square,
     *            high-resolution image. The image is displayed on a dark
     *            background.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalRequest withPortalLogoImageFile(ImageFile portalLogoImageFile) {
        this.portalLogoImageFile = portalLogoImageFile;
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
    public CreatePortalRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the portal. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that contain metadata for the portal.
     *         For more information, see <a href=
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
     * A list of key-value pairs that contain metadata for the portal. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the
     *            portal. For more information, see <a href=
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
     * A list of key-value pairs that contain metadata for the portal. For more
     * information, see <a href=
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
     *            portal. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the portal. For more
     * information, see <a href=
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
    public CreatePortalRequest addtagsEntry(String key, String value) {
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
    public CreatePortalRequest cleartagsEntries() {
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
        if (getPortalName() != null)
            sb.append("portalName: " + getPortalName() + ",");
        if (getPortalDescription() != null)
            sb.append("portalDescription: " + getPortalDescription() + ",");
        if (getPortalContactEmail() != null)
            sb.append("portalContactEmail: " + getPortalContactEmail() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getPortalLogoImageFile() != null)
            sb.append("portalLogoImageFile: " + getPortalLogoImageFile() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalName() == null) ? 0 : getPortalName().hashCode());
        hashCode = prime * hashCode
                + ((getPortalDescription() == null) ? 0 : getPortalDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPortalContactEmail() == null) ? 0 : getPortalContactEmail().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getPortalLogoImageFile() == null) ? 0 : getPortalLogoImageFile().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortalRequest == false)
            return false;
        CreatePortalRequest other = (CreatePortalRequest) obj;

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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPortalLogoImageFile() == null ^ this.getPortalLogoImageFile() == null)
            return false;
        if (other.getPortalLogoImageFile() != null
                && other.getPortalLogoImageFile().equals(this.getPortalLogoImageFile()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
