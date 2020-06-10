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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Authorizes the DDoS Response Team (DRT), using the specified role, to access
 * your AWS account to assist with DDoS attack mitigation during potential
 * attacks. This enables the DRT to inspect your AWS WAF configuration and
 * create or update AWS WAF rules and web ACLs.
 * </p>
 * <p>
 * You can associate only one <code>RoleArn</code> with your subscription. If
 * you submit an <code>AssociateDRTRole</code> request for an account that
 * already has an associated role, the new <code>RoleArn</code> will replace the
 * existing <code>RoleArn</code>.
 * </p>
 * <p>
 * Prior to making the <code>AssociateDRTRole</code> request, you must attach
 * the <a href=
 * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
 * >AWSShieldDRTAccessPolicy</a> managed policy to the role you will specify in
 * the request. For more information see <a href=
 * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
 * >Attaching and Detaching IAM Policies</a>. The role must also trust the
 * service principal <code> drt.shield.amazonaws.com</code>. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html"
 * >IAM JSON Policy Elements: Principal</a>.
 * </p>
 * <p>
 * The DRT will have access only to your AWS WAF and Shield resources. By
 * submitting this request, you authorize the DRT to inspect your AWS WAF and
 * Shield configuration and create and update AWS WAF rules and web ACLs on your
 * behalf. The DRT takes these actions only if explicitly authorized by you.
 * </p>
 * <p>
 * You must have the <code>iam:PassRole</code> permission to make an
 * <code>AssociateDRTRole</code> request. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html"
 * >Granting a User Permissions to Pass a Role to an AWS Service</a>.
 * </p>
 * <p>
 * To use the services of the DRT and make an <code>AssociateDRTRole</code>
 * request, you must be subscribed to the <a
 * href="https://aws.amazon.com/premiumsupport/business-support/">Business
 * Support plan</a> or the <a
 * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise
 * Support plan</a>.
 * </p>
 */
public class AssociateDRTRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT will use to access
     * your AWS account.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must
     * attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to this role. For more
     * information see <a href=
     * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     * >Attaching and Detaching IAM Policies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT will use to access
     * your AWS account.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must
     * attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to this role. For more
     * information see <a href=
     * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     * >Attaching and Detaching IAM Policies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role the DRT will use to
     *         access your AWS account.
     *         </p>
     *         <p>
     *         Prior to making the <code>AssociateDRTRole</code> request, you
     *         must attach the <a href=
     *         "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     *         >AWSShieldDRTAccessPolicy</a> managed policy to this role. For
     *         more information see <a href=
     *         " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     *         >Attaching and Detaching IAM Policies</a>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT will use to access
     * your AWS account.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must
     * attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to this role. For more
     * information see <a href=
     * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     * >Attaching and Detaching IAM Policies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role the DRT will use to
     *            access your AWS account.
     *            </p>
     *            <p>
     *            Prior to making the <code>AssociateDRTRole</code> request, you
     *            must attach the <a href=
     *            "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     *            >AWSShieldDRTAccessPolicy</a> managed policy to this role. For
     *            more information see <a href=
     *            " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     *            >Attaching and Detaching IAM Policies</a>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT will use to access
     * your AWS account.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must
     * attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to this role. For more
     * information see <a href=
     * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     * >Attaching and Detaching IAM Policies</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role the DRT will use to
     *            access your AWS account.
     *            </p>
     *            <p>
     *            Prior to making the <code>AssociateDRTRole</code> request, you
     *            must attach the <a href=
     *            "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     *            >AWSShieldDRTAccessPolicy</a> managed policy to this role. For
     *            more information see <a href=
     *            " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     *            >Attaching and Detaching IAM Policies</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateDRTRoleRequest withRoleArn(String roleArn) {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDRTRoleRequest == false)
            return false;
        AssociateDRTRoleRequest other = (AssociateDRTRoleRequest) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
