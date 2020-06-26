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
 * Generates a URL and authorization code that you can embed in your web server
 * code. Before you use this command, make sure that you have configured the
 * dashboards and permissions.
 * </p>
 * <p>
 * Currently, you can use <code>GetDashboardEmbedURL</code> only from the
 * server, not from the user's browser. The following rules apply to the
 * combination of URL and authorization code:
 * </p>
 * <ul>
 * <li>
 * <p>
 * They must be used together.
 * </p>
 * </li>
 * <li>
 * <p>
 * They can be used one time only.
 * </p>
 * </li>
 * <li>
 * <p>
 * They are valid for 5 minutes after you run this command.
 * </p>
 * </li>
 * <li>
 * <p>
 * The resulting user session is valid for 10 hours.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/quicksight/latest/user/embedding-dashboards.html"
 * >Embedding Amazon QuickSight Dashboards</a> in the <i>Amazon QuickSight User
 * Guide</i> or <a href=
 * "https://docs.aws.amazon.com/quicksight/latest/APIReference/qs-dev-embedded-dashboards.html"
 * >Embedding Amazon QuickSight Dashboards</a> in the <i>Amazon QuickSight API
 * Reference</i>.
 * </p>
 */
public class GetDashboardEmbedUrlRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're
     * embedding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     */
    private String identityType;

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be
     * 15-600 minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>15 - 600<br/>
     */
    private Long sessionLifetimeInMinutes;

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is
     * FALSE, which enables the undo/redo button.
     * </p>
     */
    private Boolean undoRedoDisabled;

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE,
     * which enables the reset button.
     * </p>
     */
    private Boolean resetDisabled;

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with
     * <code>QUICKSIGHT</code> identity type. You can use this for any Amazon
     * QuickSight users in your account (readers, authors, or admins)
     * authenticated as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated
     * Single Sign-On using SAML, OpenID Connect, or IAM federation.
     * </p>
     * </li>
     * </ul>
     */
    private String userArn;

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're
     * embedding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID for the AWS account that contains the dashboard that
     *         you're embedding.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're
     * embedding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that contains the dashboard that
     *            you're embedding.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're
     * embedding.
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
     *            The ID for the AWS account that contains the dashboard that
     *            you're embedding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDashboardEmbedUrlRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the dashboard, also added to the IAM policy.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard, also added to the IAM policy.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
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
     *            The ID for the dashboard, also added to the IAM policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDashboardEmbedUrlRequest withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @return <p>
     *         The authentication method that the user uses to sign in.
     *         </p>
     * @see IdentityType
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The authentication method that the user uses to sign in.
     *            </p>
     * @see IdentityType
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The authentication method that the user uses to sign in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityType
     */
    public GetDashboardEmbedUrlRequest withIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The authentication method that the user uses to sign in.
     *            </p>
     * @see IdentityType
     */
    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The authentication method that the user uses to sign in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityType
     */
    public GetDashboardEmbedUrlRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be
     * 15-600 minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>15 - 600<br/>
     *
     * @return <p>
     *         How many minutes the session is valid. The session lifetime must
     *         be 15-600 minutes.
     *         </p>
     */
    public Long getSessionLifetimeInMinutes() {
        return sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be
     * 15-600 minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>15 - 600<br/>
     *
     * @param sessionLifetimeInMinutes <p>
     *            How many minutes the session is valid. The session lifetime
     *            must be 15-600 minutes.
     *            </p>
     */
    public void setSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be
     * 15-600 minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>15 - 600<br/>
     *
     * @param sessionLifetimeInMinutes <p>
     *            How many minutes the session is valid. The session lifetime
     *            must be 15-600 minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDashboardEmbedUrlRequest withSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
        return this;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is
     * FALSE, which enables the undo/redo button.
     * </p>
     *
     * @return <p>
     *         Remove the undo/redo button on the embedded dashboard. The
     *         default is FALSE, which enables the undo/redo button.
     *         </p>
     */
    public Boolean isUndoRedoDisabled() {
        return undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is
     * FALSE, which enables the undo/redo button.
     * </p>
     *
     * @return <p>
     *         Remove the undo/redo button on the embedded dashboard. The
     *         default is FALSE, which enables the undo/redo button.
     *         </p>
     */
    public Boolean getUndoRedoDisabled() {
        return undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is
     * FALSE, which enables the undo/redo button.
     * </p>
     *
     * @param undoRedoDisabled <p>
     *            Remove the undo/redo button on the embedded dashboard. The
     *            default is FALSE, which enables the undo/redo button.
     *            </p>
     */
    public void setUndoRedoDisabled(Boolean undoRedoDisabled) {
        this.undoRedoDisabled = undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is
     * FALSE, which enables the undo/redo button.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param undoRedoDisabled <p>
     *            Remove the undo/redo button on the embedded dashboard. The
     *            default is FALSE, which enables the undo/redo button.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDashboardEmbedUrlRequest withUndoRedoDisabled(Boolean undoRedoDisabled) {
        this.undoRedoDisabled = undoRedoDisabled;
        return this;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE,
     * which enables the reset button.
     * </p>
     *
     * @return <p>
     *         Remove the reset button on the embedded dashboard. The default is
     *         FALSE, which enables the reset button.
     *         </p>
     */
    public Boolean isResetDisabled() {
        return resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE,
     * which enables the reset button.
     * </p>
     *
     * @return <p>
     *         Remove the reset button on the embedded dashboard. The default is
     *         FALSE, which enables the reset button.
     *         </p>
     */
    public Boolean getResetDisabled() {
        return resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE,
     * which enables the reset button.
     * </p>
     *
     * @param resetDisabled <p>
     *            Remove the reset button on the embedded dashboard. The default
     *            is FALSE, which enables the reset button.
     *            </p>
     */
    public void setResetDisabled(Boolean resetDisabled) {
        this.resetDisabled = resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE,
     * which enables the reset button.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetDisabled <p>
     *            Remove the reset button on the embedded dashboard. The default
     *            is FALSE, which enables the reset button.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDashboardEmbedUrlRequest withResetDisabled(Boolean resetDisabled) {
        this.resetDisabled = resetDisabled;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with
     * <code>QUICKSIGHT</code> identity type. You can use this for any Amazon
     * QuickSight users in your account (readers, authors, or admins)
     * authenticated as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated
     * Single Sign-On using SAML, OpenID Connect, or IAM federation.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The Amazon QuickSight user's Amazon Resource Name (ARN), for use
     *         with <code>QUICKSIGHT</code> identity type. You can use this for
     *         any Amazon QuickSight users in your account (readers, authors, or
     *         admins) authenticated as one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Active Directory (AD) users or group members
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Invited nonfederated users
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IAM users and IAM role-based sessions authenticated through
     *         Federated Single Sign-On using SAML, OpenID Connect, or IAM
     *         federation.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getUserArn() {
        return userArn;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with
     * <code>QUICKSIGHT</code> identity type. You can use this for any Amazon
     * QuickSight users in your account (readers, authors, or admins)
     * authenticated as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated
     * Single Sign-On using SAML, OpenID Connect, or IAM federation.
     * </p>
     * </li>
     * </ul>
     *
     * @param userArn <p>
     *            The Amazon QuickSight user's Amazon Resource Name (ARN), for
     *            use with <code>QUICKSIGHT</code> identity type. You can use
     *            this for any Amazon QuickSight users in your account (readers,
     *            authors, or admins) authenticated as one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Active Directory (AD) users or group members
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Invited nonfederated users
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IAM users and IAM role-based sessions authenticated through
     *            Federated Single Sign-On using SAML, OpenID Connect, or IAM
     *            federation.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with
     * <code>QUICKSIGHT</code> identity type. You can use this for any Amazon
     * QuickSight users in your account (readers, authors, or admins)
     * authenticated as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated
     * Single Sign-On using SAML, OpenID Connect, or IAM federation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userArn <p>
     *            The Amazon QuickSight user's Amazon Resource Name (ARN), for
     *            use with <code>QUICKSIGHT</code> identity type. You can use
     *            this for any Amazon QuickSight users in your account (readers,
     *            authors, or admins) authenticated as one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Active Directory (AD) users or group members
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Invited nonfederated users
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IAM users and IAM role-based sessions authenticated through
     *            Federated Single Sign-On using SAML, OpenID Connect, or IAM
     *            federation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDashboardEmbedUrlRequest withUserArn(String userArn) {
        this.userArn = userArn;
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
        if (getIdentityType() != null)
            sb.append("IdentityType: " + getIdentityType() + ",");
        if (getSessionLifetimeInMinutes() != null)
            sb.append("SessionLifetimeInMinutes: " + getSessionLifetimeInMinutes() + ",");
        if (getUndoRedoDisabled() != null)
            sb.append("UndoRedoDisabled: " + getUndoRedoDisabled() + ",");
        if (getResetDisabled() != null)
            sb.append("ResetDisabled: " + getResetDisabled() + ",");
        if (getUserArn() != null)
            sb.append("UserArn: " + getUserArn());
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
                + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime
                * hashCode
                + ((getSessionLifetimeInMinutes() == null) ? 0 : getSessionLifetimeInMinutes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUndoRedoDisabled() == null) ? 0 : getUndoRedoDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getResetDisabled() == null) ? 0 : getResetDisabled().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDashboardEmbedUrlRequest == false)
            return false;
        GetDashboardEmbedUrlRequest other = (GetDashboardEmbedUrlRequest) obj;

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
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null
                && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getSessionLifetimeInMinutes() == null
                ^ this.getSessionLifetimeInMinutes() == null)
            return false;
        if (other.getSessionLifetimeInMinutes() != null
                && other.getSessionLifetimeInMinutes().equals(this.getSessionLifetimeInMinutes()) == false)
            return false;
        if (other.getUndoRedoDisabled() == null ^ this.getUndoRedoDisabled() == null)
            return false;
        if (other.getUndoRedoDisabled() != null
                && other.getUndoRedoDisabled().equals(this.getUndoRedoDisabled()) == false)
            return false;
        if (other.getResetDisabled() == null ^ this.getResetDisabled() == null)
            return false;
        if (other.getResetDisabled() != null
                && other.getResetDisabled().equals(this.getResetDisabled()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        return true;
    }
}
