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
 * Creates an IAM role that is linked to a specific AWS service. The service
 * controls the attached policies and when the role can be deleted. This helps
 * ensure that the service is not broken by an unexpectedly changed or deleted
 * role, which could put your AWS resources into an unknown state. Allowing the
 * service to control the role helps improve service stability and proper
 * cleanup when a service and its role are no longer needed. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html"
 * >Using Service-Linked Roles</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * To attach a policy to this service-linked role, you must make the request
 * using the AWS service that depends on this role.
 * </p>
 */
public class CreateServiceLinkedRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The service principal for the AWS service to which this role is attached.
     * You use a string similar to a URL but without the http:// in front. For
     * example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact
     * service principal for your service-linked role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     * >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i>. Look
     * for the services that have <b>Yes </b>in the <b>Service-Linked Role</b>
     * column. Choose the <b>Yes</b> link to view the service-linked role
     * documentation for that service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String aWSServiceName;

    /**
     * <p>
     * The description of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String description;

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name. If you make multiple requests for
     * the same service, then you must supply a different
     * <code>CustomSuffix</code> for each request. Otherwise the request fails
     * with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If
     * you provide an optional suffix and the operation fails, try the operation
     * again without the suffix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String customSuffix;

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached.
     * You use a string similar to a URL but without the http:// in front. For
     * example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact
     * service principal for your service-linked role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     * >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i>. Look
     * for the services that have <b>Yes </b>in the <b>Service-Linked Role</b>
     * column. Choose the <b>Yes</b> link to view the service-linked role
     * documentation for that service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The service principal for the AWS service to which this role is
     *         attached. You use a string similar to a URL but without the
     *         http:// in front. For example:
     *         <code>elasticbeanstalk.amazonaws.com</code>.
     *         </p>
     *         <p>
     *         Service principals are unique and case-sensitive. To find the
     *         exact service principal for your service-linked role, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     *         >AWS Services That Work with IAM</a> in the <i>IAM User
     *         Guide</i>. Look for the services that have <b>Yes </b>in the
     *         <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to
     *         view the service-linked role documentation for that service.
     *         </p>
     */
    public String getAWSServiceName() {
        return aWSServiceName;
    }

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached.
     * You use a string similar to a URL but without the http:// in front. For
     * example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact
     * service principal for your service-linked role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     * >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i>. Look
     * for the services that have <b>Yes </b>in the <b>Service-Linked Role</b>
     * column. Choose the <b>Yes</b> link to view the service-linked role
     * documentation for that service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param aWSServiceName <p>
     *            The service principal for the AWS service to which this role
     *            is attached. You use a string similar to a URL but without the
     *            http:// in front. For example:
     *            <code>elasticbeanstalk.amazonaws.com</code>.
     *            </p>
     *            <p>
     *            Service principals are unique and case-sensitive. To find the
     *            exact service principal for your service-linked role, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     *            >AWS Services That Work with IAM</a> in the <i>IAM User
     *            Guide</i>. Look for the services that have <b>Yes </b>in the
     *            <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link
     *            to view the service-linked role documentation for that
     *            service.
     *            </p>
     */
    public void setAWSServiceName(String aWSServiceName) {
        this.aWSServiceName = aWSServiceName;
    }

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached.
     * You use a string similar to a URL but without the http:// in front. For
     * example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact
     * service principal for your service-linked role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     * >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i>. Look
     * for the services that have <b>Yes </b>in the <b>Service-Linked Role</b>
     * column. Choose the <b>Yes</b> link to view the service-linked role
     * documentation for that service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param aWSServiceName <p>
     *            The service principal for the AWS service to which this role
     *            is attached. You use a string similar to a URL but without the
     *            http:// in front. For example:
     *            <code>elasticbeanstalk.amazonaws.com</code>.
     *            </p>
     *            <p>
     *            Service principals are unique and case-sensitive. To find the
     *            exact service principal for your service-linked role, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     *            >AWS Services That Work with IAM</a> in the <i>IAM User
     *            Guide</i>. Look for the services that have <b>Yes </b>in the
     *            <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link
     *            to view the service-linked role documentation for that
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceLinkedRoleRequest withAWSServiceName(String aWSServiceName) {
        this.aWSServiceName = aWSServiceName;
        return this;
    }

    /**
     * <p>
     * The description of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         The description of the role.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            The description of the role.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            The description of the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceLinkedRoleRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name. If you make multiple requests for
     * the same service, then you must supply a different
     * <code>CustomSuffix</code> for each request. Otherwise the request fails
     * with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If
     * you provide an optional suffix and the operation fails, try the operation
     * again without the suffix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p/>
     *         <p>
     *         A string that you provide, which is combined with the
     *         service-provided prefix to form the complete role name. If you
     *         make multiple requests for the same service, then you must supply
     *         a different <code>CustomSuffix</code> for each request. Otherwise
     *         the request fails with a duplicate role name error. For example,
     *         you could add <code>-1</code> or <code>-debug</code> to the
     *         suffix.
     *         </p>
     *         <p>
     *         Some services do not support the <code>CustomSuffix</code>
     *         parameter. If you provide an optional suffix and the operation
     *         fails, try the operation again without the suffix.
     *         </p>
     */
    public String getCustomSuffix() {
        return customSuffix;
    }

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name. If you make multiple requests for
     * the same service, then you must supply a different
     * <code>CustomSuffix</code> for each request. Otherwise the request fails
     * with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If
     * you provide an optional suffix and the operation fails, try the operation
     * again without the suffix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param customSuffix <p/>
     *            <p>
     *            A string that you provide, which is combined with the
     *            service-provided prefix to form the complete role name. If you
     *            make multiple requests for the same service, then you must
     *            supply a different <code>CustomSuffix</code> for each request.
     *            Otherwise the request fails with a duplicate role name error.
     *            For example, you could add <code>-1</code> or
     *            <code>-debug</code> to the suffix.
     *            </p>
     *            <p>
     *            Some services do not support the <code>CustomSuffix</code>
     *            parameter. If you provide an optional suffix and the operation
     *            fails, try the operation again without the suffix.
     *            </p>
     */
    public void setCustomSuffix(String customSuffix) {
        this.customSuffix = customSuffix;
    }

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided
     * prefix to form the complete role name. If you make multiple requests for
     * the same service, then you must supply a different
     * <code>CustomSuffix</code> for each request. Otherwise the request fails
     * with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If
     * you provide an optional suffix and the operation fails, try the operation
     * again without the suffix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param customSuffix <p/>
     *            <p>
     *            A string that you provide, which is combined with the
     *            service-provided prefix to form the complete role name. If you
     *            make multiple requests for the same service, then you must
     *            supply a different <code>CustomSuffix</code> for each request.
     *            Otherwise the request fails with a duplicate role name error.
     *            For example, you could add <code>-1</code> or
     *            <code>-debug</code> to the suffix.
     *            </p>
     *            <p>
     *            Some services do not support the <code>CustomSuffix</code>
     *            parameter. If you provide an optional suffix and the operation
     *            fails, try the operation again without the suffix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceLinkedRoleRequest withCustomSuffix(String customSuffix) {
        this.customSuffix = customSuffix;
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
        if (getAWSServiceName() != null)
            sb.append("AWSServiceName: " + getAWSServiceName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCustomSuffix() != null)
            sb.append("CustomSuffix: " + getCustomSuffix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAWSServiceName() == null) ? 0 : getAWSServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCustomSuffix() == null) ? 0 : getCustomSuffix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceLinkedRoleRequest == false)
            return false;
        CreateServiceLinkedRoleRequest other = (CreateServiceLinkedRoleRequest) obj;

        if (other.getAWSServiceName() == null ^ this.getAWSServiceName() == null)
            return false;
        if (other.getAWSServiceName() != null
                && other.getAWSServiceName().equals(this.getAWSServiceName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCustomSuffix() == null ^ this.getCustomSuffix() == null)
            return false;
        if (other.getCustomSuffix() != null
                && other.getCustomSuffix().equals(this.getCustomSuffix()) == false)
            return false;
        return true;
    }
}
