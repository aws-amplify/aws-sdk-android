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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a list of policies that the IAM identity (user, group, or role) can
 * use to access each specified service.
 * </p>
 * <note>
 * <p>
 * This operation does not use other policy types when determining whether a
 * resource could access a service. These other policy types include
 * resource-based policies, access control lists, AWS Organizations policies,
 * IAM permissions boundaries, and AWS STS assume role policies. It only applies
 * permissions policy logic. For more about the evaluation of policy types, see
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
 * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * </note>
 * <p>
 * The list of policies returned by the operation depends on the ARN of the
 * identity that you provide.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>User</b> – The list of policies includes the managed and inline policies
 * that are attached to the user directly. The list also includes any additional
 * managed and inline policies that are attached to the group to which the user
 * belongs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Group</b> – The list of policies includes only the managed and inline
 * policies that are attached to the group directly. Policies that are attached
 * to the group’s user are not included.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Role</b> – The list of policies includes only the managed and inline
 * policies that are attached to the role.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For each managed policy, this operation returns the ARN and policy name. For
 * each inline policy, it returns the policy name and the entity to which it is
 * attached. Inline policies do not have an ARN. For more information about
 * these policy types, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * Policies that are attached to users and roles as permissions boundaries are
 * not returned. To view which managed policy is currently used to set the
 * permissions boundary for a user or role, use the <a>GetUser</a> or
 * <a>GetRole</a> operations.
 * </p>
 */
public class ListPoliciesGrantingServiceAccessRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String marker;

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you
     * want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to
     * list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> serviceNamespaces;

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         Use this parameter only when paginating results and only after
     *         you receive a response indicating that the results are truncated.
     *         Set it to the value of the <code>Marker</code> element in the
     *         response that you received to indicate where the next call should
     *         start.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only after
     *            you receive a response indicating that the results are
     *            truncated. Set it to the value of the <code>Marker</code>
     *            element in the response that you received to indicate where
     *            the next call should start.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only after
     *            you receive a response indicating that the results are
     *            truncated. Set it to the value of the <code>Marker</code>
     *            element in the response that you received to indicate where
     *            the next call should start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you
     * want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the IAM identity (user, group, or role) whose policies
     *         you want to list.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you
     * want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The ARN of the IAM identity (user, group, or role) whose
     *            policies you want to list.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you
     * want to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The ARN of the IAM identity (user, group, or role) whose
     *            policies you want to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to
     * list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     *
     * @return <p>
     *         The service namespace for the AWS services whose policies you
     *         want to list.
     *         </p>
     *         <p>
     *         To learn the service namespace for a service, go to <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, Resources, and Condition Keys for AWS Services</a> in
     *         the <i>IAM User Guide</i>. Choose the name of the service to view
     *         details for that service. In the first paragraph, find the
     *         service prefix. For example, <code>(service prefix: a4b)</code>.
     *         For more information about service namespaces, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     *         </p>
     */
    public java.util.List<String> getServiceNamespaces() {
        return serviceNamespaces;
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to
     * list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     *
     * @param serviceNamespaces <p>
     *            The service namespace for the AWS services whose policies you
     *            want to list.
     *            </p>
     *            <p>
     *            To learn the service namespace for a service, go to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *            >Actions, Resources, and Condition Keys for AWS Services</a>
     *            in the <i>IAM User Guide</i>. Choose the name of the service
     *            to view details for that service. In the first paragraph, find
     *            the service prefix. For example,
     *            <code>(service prefix: a4b)</code>. For more information about
     *            service namespaces, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a> in the <i>AWS General
     *            Reference</i>.
     *            </p>
     */
    public void setServiceNamespaces(java.util.Collection<String> serviceNamespaces) {
        if (serviceNamespaces == null) {
            this.serviceNamespaces = null;
            return;
        }

        this.serviceNamespaces = new java.util.ArrayList<String>(serviceNamespaces);
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to
     * list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceNamespaces <p>
     *            The service namespace for the AWS services whose policies you
     *            want to list.
     *            </p>
     *            <p>
     *            To learn the service namespace for a service, go to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *            >Actions, Resources, and Condition Keys for AWS Services</a>
     *            in the <i>IAM User Guide</i>. Choose the name of the service
     *            to view details for that service. In the first paragraph, find
     *            the service prefix. For example,
     *            <code>(service prefix: a4b)</code>. For more information about
     *            service namespaces, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a> in the <i>AWS General
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessRequest withServiceNamespaces(
            String... serviceNamespaces) {
        if (getServiceNamespaces() == null) {
            this.serviceNamespaces = new java.util.ArrayList<String>(serviceNamespaces.length);
        }
        for (String value : serviceNamespaces) {
            this.serviceNamespaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to
     * list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceNamespaces <p>
     *            The service namespace for the AWS services whose policies you
     *            want to list.
     *            </p>
     *            <p>
     *            To learn the service namespace for a service, go to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *            >Actions, Resources, and Condition Keys for AWS Services</a>
     *            in the <i>IAM User Guide</i>. Choose the name of the service
     *            to view details for that service. In the first paragraph, find
     *            the service prefix. For example,
     *            <code>(service prefix: a4b)</code>. For more information about
     *            service namespaces, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a> in the <i>AWS General
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessRequest withServiceNamespaces(
            java.util.Collection<String> serviceNamespaces) {
        setServiceNamespaces(serviceNamespaces);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getServiceNamespaces() != null)
            sb.append("ServiceNamespaces: " + getServiceNamespaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getServiceNamespaces() == null) ? 0 : getServiceNamespaces().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesGrantingServiceAccessRequest == false)
            return false;
        ListPoliciesGrantingServiceAccessRequest other = (ListPoliciesGrantingServiceAccessRequest) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getServiceNamespaces() == null ^ this.getServiceNamespaces() == null)
            return false;
        if (other.getServiceNamespaces() != null
                && other.getServiceNamespaces().equals(this.getServiceNamespaces()) == false)
            return false;
        return true;
    }
}
