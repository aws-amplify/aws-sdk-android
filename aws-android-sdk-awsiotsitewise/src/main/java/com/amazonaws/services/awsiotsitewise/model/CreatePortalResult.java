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

public class CreatePortalResult implements Serializable {
    /**
     * <p>
     * The ID of the created portal.
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
     * The public URL for the AWS IoT SiteWise Monitor portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     */
    private String portalStartUrl;

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     */
    private PortalStatus portalStatus;

    /**
     * <p>
     * The associated AWS SSO application Id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     */
    private String ssoApplicationId;

    /**
     * <p>
     * The ID of the created portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the created portal.
     *         </p>
     */
    public String getPortalId() {
        return portalId;
    }

    /**
     * <p>
     * The ID of the created portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param portalId <p>
     *            The ID of the created portal.
     *            </p>
     */
    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the created portal.
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
     *            The ID of the created portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalResult withPortalId(String portalId) {
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
    public CreatePortalResult withPortalArn(String portalArn) {
        this.portalArn = portalArn;
        return this;
    }

    /**
     * <p>
     * The public URL for the AWS IoT SiteWise Monitor portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     *
     * @return <p>
     *         The public URL for the AWS IoT SiteWise Monitor portal.
     *         </p>
     */
    public String getPortalStartUrl() {
        return portalStartUrl;
    }

    /**
     * <p>
     * The public URL for the AWS IoT SiteWise Monitor portal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^(http|https)\://\S+<br/>
     *
     * @param portalStartUrl <p>
     *            The public URL for the AWS IoT SiteWise Monitor portal.
     *            </p>
     */
    public void setPortalStartUrl(String portalStartUrl) {
        this.portalStartUrl = portalStartUrl;
    }

    /**
     * <p>
     * The public URL for the AWS IoT SiteWise Monitor portal.
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
     *            The public URL for the AWS IoT SiteWise Monitor portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalResult withPortalStartUrl(String portalStartUrl) {
        this.portalStartUrl = portalStartUrl;
        return this;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @return <p>
     *         The status of the portal, which contains a state (
     *         <code>CREATING</code> after successfully calling this action) and
     *         any error message.
     *         </p>
     */
    public PortalStatus getPortalStatus() {
        return portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @param portalStatus <p>
     *            The status of the portal, which contains a state (
     *            <code>CREATING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     */
    public void setPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portalStatus <p>
     *            The status of the portal, which contains a state (
     *            <code>CREATING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalResult withPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
        return this;
    }

    /**
     * <p>
     * The associated AWS SSO application Id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     *
     * @return <p>
     *         The associated AWS SSO application Id.
     *         </p>
     */
    public String getSsoApplicationId() {
        return ssoApplicationId;
    }

    /**
     * <p>
     * The associated AWS SSO application Id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     *
     * @param ssoApplicationId <p>
     *            The associated AWS SSO application Id.
     *            </p>
     */
    public void setSsoApplicationId(String ssoApplicationId) {
        this.ssoApplicationId = ssoApplicationId;
    }

    /**
     * <p>
     * The associated AWS SSO application Id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[!-~]*<br/>
     *
     * @param ssoApplicationId <p>
     *            The associated AWS SSO application Id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortalResult withSsoApplicationId(String ssoApplicationId) {
        this.ssoApplicationId = ssoApplicationId;
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
        if (getPortalStartUrl() != null)
            sb.append("portalStartUrl: " + getPortalStartUrl() + ",");
        if (getPortalStatus() != null)
            sb.append("portalStatus: " + getPortalStatus() + ",");
        if (getSsoApplicationId() != null)
            sb.append("ssoApplicationId: " + getSsoApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode
                + ((getPortalStartUrl() == null) ? 0 : getPortalStartUrl().hashCode());
        hashCode = prime * hashCode
                + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSsoApplicationId() == null) ? 0 : getSsoApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortalResult == false)
            return false;
        CreatePortalResult other = (CreatePortalResult) obj;

        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null
                && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        if (other.getPortalStartUrl() == null ^ this.getPortalStartUrl() == null)
            return false;
        if (other.getPortalStartUrl() != null
                && other.getPortalStartUrl().equals(this.getPortalStartUrl()) == false)
            return false;
        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null
                && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        if (other.getSsoApplicationId() == null ^ this.getSsoApplicationId() == null)
            return false;
        if (other.getSsoApplicationId() != null
                && other.getSsoApplicationId().equals(this.getSsoApplicationId()) == false)
            return false;
        return true;
    }
}
