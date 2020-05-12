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

public class DescribePortalResult implements Serializable {
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
    private String portalId;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the portal, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String portalArn;

    /**
     * <p>
     * The name of the portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String portalName;

    /**
     * <p>
     * The portal's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String portalDescription;

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     */
    private String portalClientId;

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
    private String portalStartUrl;

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
     * The current status of the portal, which contains a state and any error
     * message.
     * </p>
     */
    private PortalStatus portalStatus;

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date portalCreationDate;

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date portalLastUpdateDate;

    /**
     * <p>
     * The portal's logo image.
     * </p>
     */
    private Image portalLogoImage;

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
    public String getPortalId() {
        return portalId;
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
     * @param portalId <p>
     *            The ID of the portal.
     *            </p>
     */
    public void setPortalId(String portalId) {
        this.portalId = portalId;
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
     * @param portalId <p>
     *            The ID of the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the portal, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >ARN</a> of the portal, which has the following format.
     *         </p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     *         </p>
     */
    public String getPortalArn() {
        return portalArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the portal, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param portalArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the portal, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     *            </p>
     */
    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the portal, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param portalArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the portal, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalArn(String portalArn) {
        this.portalArn = portalArn;
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
    public String getPortalName() {
        return portalName;
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
     * @param portalName <p>
     *            The name of the portal.
     *            </p>
     */
    public void setPortalName(String portalName) {
        this.portalName = portalName;
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
     * @param portalName <p>
     *            The name of the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalName(String portalName) {
        this.portalName = portalName;
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
    public String getPortalDescription() {
        return portalDescription;
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
     * @param portalDescription <p>
     *            The portal's description.
     *            </p>
     */
    public void setPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
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
     * @param portalDescription <p>
     *            The portal's description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
        return this;
    }

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     *
     * @return <p>
     *         The AWS SSO application generated client ID (used with AWS SSO
     *         APIs).
     *         </p>
     */
    public String getPortalClientId() {
        return portalClientId;
    }

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     *
     * @param portalClientId <p>
     *            The AWS SSO application generated client ID (used with AWS SSO
     *            APIs).
     *            </p>
     */
    public void setPortalClientId(String portalClientId) {
        this.portalClientId = portalClientId;
    }

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     *
     * @param portalClientId <p>
     *            The AWS SSO application generated client ID (used with AWS SSO
     *            APIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalClientId(String portalClientId) {
        this.portalClientId = portalClientId;
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
    public String getPortalStartUrl() {
        return portalStartUrl;
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
     * @param portalStartUrl <p>
     *            The public root URL for the AWS IoT AWS IoT SiteWise Monitor
     *            application portal.
     *            </p>
     */
    public void setPortalStartUrl(String portalStartUrl) {
        this.portalStartUrl = portalStartUrl;
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
     * @param portalStartUrl <p>
     *            The public root URL for the AWS IoT AWS IoT SiteWise Monitor
     *            application portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalStartUrl(String portalStartUrl) {
        this.portalStartUrl = portalStartUrl;
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
    public DescribePortalResult withPortalContactEmail(String portalContactEmail) {
        this.portalContactEmail = portalContactEmail;
        return this;
    }

    /**
     * <p>
     * The current status of the portal, which contains a state and any error
     * message.
     * </p>
     *
     * @return <p>
     *         The current status of the portal, which contains a state and any
     *         error message.
     *         </p>
     */
    public PortalStatus getPortalStatus() {
        return portalStatus;
    }

    /**
     * <p>
     * The current status of the portal, which contains a state and any error
     * message.
     * </p>
     *
     * @param portalStatus <p>
     *            The current status of the portal, which contains a state and
     *            any error message.
     *            </p>
     */
    public void setPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The current status of the portal, which contains a state and any error
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalStatus <p>
     *            The current status of the portal, which contains a state and
     *            any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
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
    public java.util.Date getPortalCreationDate() {
        return portalCreationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     *
     * @param portalCreationDate <p>
     *            The date the portal was created, in Unix epoch time.
     *            </p>
     */
    public void setPortalCreationDate(java.util.Date portalCreationDate) {
        this.portalCreationDate = portalCreationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalCreationDate <p>
     *            The date the portal was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalCreationDate(java.util.Date portalCreationDate) {
        this.portalCreationDate = portalCreationDate;
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
    public java.util.Date getPortalLastUpdateDate() {
        return portalLastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     *
     * @param portalLastUpdateDate <p>
     *            The date the portal was last updated, in Unix epoch time.
     *            </p>
     */
    public void setPortalLastUpdateDate(java.util.Date portalLastUpdateDate) {
        this.portalLastUpdateDate = portalLastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalLastUpdateDate <p>
     *            The date the portal was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalLastUpdateDate(java.util.Date portalLastUpdateDate) {
        this.portalLastUpdateDate = portalLastUpdateDate;
        return this;
    }

    /**
     * <p>
     * The portal's logo image.
     * </p>
     *
     * @return <p>
     *         The portal's logo image.
     *         </p>
     */
    public Image getPortalLogoImage() {
        return portalLogoImage;
    }

    /**
     * <p>
     * The portal's logo image.
     * </p>
     *
     * @param portalLogoImage <p>
     *            The portal's logo image.
     *            </p>
     */
    public void setPortalLogoImage(Image portalLogoImage) {
        this.portalLogoImage = portalLogoImage;
    }

    /**
     * <p>
     * The portal's logo image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalLogoImage <p>
     *            The portal's logo image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePortalResult withPortalLogoImage(Image portalLogoImage) {
        this.portalLogoImage = portalLogoImage;
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
    public DescribePortalResult withRoleArn(String roleArn) {
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
        if (getPortalId() != null)
            sb.append("portalId: " + getPortalId() + ",");
        if (getPortalArn() != null)
            sb.append("portalArn: " + getPortalArn() + ",");
        if (getPortalName() != null)
            sb.append("portalName: " + getPortalName() + ",");
        if (getPortalDescription() != null)
            sb.append("portalDescription: " + getPortalDescription() + ",");
        if (getPortalClientId() != null)
            sb.append("portalClientId: " + getPortalClientId() + ",");
        if (getPortalStartUrl() != null)
            sb.append("portalStartUrl: " + getPortalStartUrl() + ",");
        if (getPortalContactEmail() != null)
            sb.append("portalContactEmail: " + getPortalContactEmail() + ",");
        if (getPortalStatus() != null)
            sb.append("portalStatus: " + getPortalStatus() + ",");
        if (getPortalCreationDate() != null)
            sb.append("portalCreationDate: " + getPortalCreationDate() + ",");
        if (getPortalLastUpdateDate() != null)
            sb.append("portalLastUpdateDate: " + getPortalLastUpdateDate() + ",");
        if (getPortalLogoImage() != null)
            sb.append("portalLogoImage: " + getPortalLogoImage() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode + ((getPortalName() == null) ? 0 : getPortalName().hashCode());
        hashCode = prime * hashCode
                + ((getPortalDescription() == null) ? 0 : getPortalDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPortalClientId() == null) ? 0 : getPortalClientId().hashCode());
        hashCode = prime * hashCode
                + ((getPortalStartUrl() == null) ? 0 : getPortalStartUrl().hashCode());
        hashCode = prime * hashCode
                + ((getPortalContactEmail() == null) ? 0 : getPortalContactEmail().hashCode());
        hashCode = prime * hashCode
                + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        hashCode = prime * hashCode
                + ((getPortalCreationDate() == null) ? 0 : getPortalCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getPortalLastUpdateDate() == null) ? 0 : getPortalLastUpdateDate().hashCode());
        hashCode = prime * hashCode
                + ((getPortalLogoImage() == null) ? 0 : getPortalLogoImage().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortalResult == false)
            return false;
        DescribePortalResult other = (DescribePortalResult) obj;

        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null
                && other.getPortalArn().equals(this.getPortalArn()) == false)
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
        if (other.getPortalClientId() == null ^ this.getPortalClientId() == null)
            return false;
        if (other.getPortalClientId() != null
                && other.getPortalClientId().equals(this.getPortalClientId()) == false)
            return false;
        if (other.getPortalStartUrl() == null ^ this.getPortalStartUrl() == null)
            return false;
        if (other.getPortalStartUrl() != null
                && other.getPortalStartUrl().equals(this.getPortalStartUrl()) == false)
            return false;
        if (other.getPortalContactEmail() == null ^ this.getPortalContactEmail() == null)
            return false;
        if (other.getPortalContactEmail() != null
                && other.getPortalContactEmail().equals(this.getPortalContactEmail()) == false)
            return false;
        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null
                && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        if (other.getPortalCreationDate() == null ^ this.getPortalCreationDate() == null)
            return false;
        if (other.getPortalCreationDate() != null
                && other.getPortalCreationDate().equals(this.getPortalCreationDate()) == false)
            return false;
        if (other.getPortalLastUpdateDate() == null ^ this.getPortalLastUpdateDate() == null)
            return false;
        if (other.getPortalLastUpdateDate() != null
                && other.getPortalLastUpdateDate().equals(this.getPortalLastUpdateDate()) == false)
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
        return true;
    }
}
