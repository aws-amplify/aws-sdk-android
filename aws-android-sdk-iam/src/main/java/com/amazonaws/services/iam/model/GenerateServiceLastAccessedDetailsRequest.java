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
 * Generates a report that includes details about when an IAM resource (user,
 * group, role, or policy) was last used in an attempt to access AWS services.
 * Recent activity usually appears within four hours. IAM reports activity for
 * the last 365 days, or less if your Region began supporting this feature
 * within the last year. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
 * >Regions Where Data Is Tracked</a>.
 * </p>
 * <important>
 * <p>
 * The service last accessed data includes all attempts to access an AWS API,
 * not just the successful ones. This includes all attempts that were made using
 * the AWS Management Console, the AWS API through any of the SDKs, or any of
 * the command line tools. An unexpected entry in the service last accessed data
 * does not mean that your account has been compromised, because the request
 * might have been denied. Refer to your CloudTrail logs as the authoritative
 * source for information about all API calls and whether they were successful
 * or denied access. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html"
 * >Logging IAM Events with CloudTrail</a> in the <i>IAM User Guide</i>.
 * </p>
 * </important>
 * <p>
 * The <code>GenerateServiceLastAccessedDetails</code> operation returns a
 * <code>JobId</code>. Use this parameter in the following operations to
 * retrieve the following details from your report:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetServiceLastAccessedDetails</a> – Use this operation for users, groups,
 * roles, or policies to list every AWS service that the resource could access
 * using permissions policies. For each service, the response includes
 * information about the most recent access attempt.
 * </p>
 * <p>
 * The <code>JobId</code> returned by
 * <code>GenerateServiceLastAccessedDetail</code> must be used by the same role
 * within a session, or by the same user when used to call
 * <code>GetServiceLastAccessedDetail</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetServiceLastAccessedDetailsWithEntities</a> – Use this operation for
 * groups and policies to list information about the associated entities (users
 * or roles) that attempted to access a specific AWS service.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To check the status of the <code>GenerateServiceLastAccessedDetails</code>
 * request, use the <code>JobId</code> parameter in the same operations and test
 * the <code>JobStatus</code> response parameter.
 * </p>
 * <p>
 * For additional information about the permissions policies that allow an
 * identity (user, group, or role) to access specific services, use the
 * <a>ListPoliciesGrantingServiceAccess</a> operation.
 * </p>
 * <note>
 * <p>
 * Service last accessed data does not use other policy types when determining
 * whether a resource could access a service. These other policy types include
 * resource-based policies, access control lists, AWS Organizations policies,
 * IAM permissions boundaries, and AWS STS assume role policies. It only applies
 * permissions policy logic. For more about the evaluation of policy types, see
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
 * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * </note>
 * <p>
 * For more information about service and action last accessed data, see <a
 * href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
 * >Reducing Permissions Using Service Last Accessed Data</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 */
public class GenerateServiceLastAccessedDetailsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used
     * to generate information about when the resource was last used in an
     * attempt to access an AWS service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether
     * you want to generate information about the last attempt to access
     * services or actions. If you specify service-level granularity, this
     * operation generates only service data. If you specify action-level
     * granularity, it generates service and action data. If you don't include
     * this optional parameter, the operation generates service data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     */
    private String granularity;

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used
     * to generate information about when the resource was last used in an
     * attempt to access an AWS service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the IAM resource (user, group, role, or managed
     *         policy) used to generate information about when the resource was
     *         last used in an attempt to access an AWS service.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used
     * to generate information about when the resource was last used in an
     * attempt to access an AWS service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The ARN of the IAM resource (user, group, role, or managed
     *            policy) used to generate information about when the resource
     *            was last used in an attempt to access an AWS service.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used
     * to generate information about when the resource was last used in an
     * attempt to access an AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The ARN of the IAM resource (user, group, role, or managed
     *            policy) used to generate information about when the resource
     *            was last used in an attempt to access an AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateServiceLastAccessedDetailsRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether
     * you want to generate information about the last attempt to access
     * services or actions. If you specify service-level granularity, this
     * operation generates only service data. If you specify action-level
     * granularity, it generates service and action data. If you don't include
     * this optional parameter, the operation generates service data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @return <p>
     *         The level of detail that you want to generate. You can specify
     *         whether you want to generate information about the last attempt
     *         to access services or actions. If you specify service-level
     *         granularity, this operation generates only service data. If you
     *         specify action-level granularity, it generates service and action
     *         data. If you don't include this optional parameter, the operation
     *         generates service data.
     *         </p>
     * @see AccessAdvisorUsageGranularityType
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether
     * you want to generate information about the last attempt to access
     * services or actions. If you specify service-level granularity, this
     * operation generates only service data. If you specify action-level
     * granularity, it generates service and action data. If you don't include
     * this optional parameter, the operation generates service data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param granularity <p>
     *            The level of detail that you want to generate. You can specify
     *            whether you want to generate information about the last
     *            attempt to access services or actions. If you specify
     *            service-level granularity, this operation generates only
     *            service data. If you specify action-level granularity, it
     *            generates service and action data. If you don't include this
     *            optional parameter, the operation generates service data.
     *            </p>
     * @see AccessAdvisorUsageGranularityType
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether
     * you want to generate information about the last attempt to access
     * services or actions. If you specify service-level granularity, this
     * operation generates only service data. If you specify action-level
     * granularity, it generates service and action data. If you don't include
     * this optional parameter, the operation generates service data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param granularity <p>
     *            The level of detail that you want to generate. You can specify
     *            whether you want to generate information about the last
     *            attempt to access services or actions. If you specify
     *            service-level granularity, this operation generates only
     *            service data. If you specify action-level granularity, it
     *            generates service and action data. If you don't include this
     *            optional parameter, the operation generates service data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessAdvisorUsageGranularityType
     */
    public GenerateServiceLastAccessedDetailsRequest withGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether
     * you want to generate information about the last attempt to access
     * services or actions. If you specify service-level granularity, this
     * operation generates only service data. If you specify action-level
     * granularity, it generates service and action data. If you don't include
     * this optional parameter, the operation generates service data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param granularity <p>
     *            The level of detail that you want to generate. You can specify
     *            whether you want to generate information about the last
     *            attempt to access services or actions. If you specify
     *            service-level granularity, this operation generates only
     *            service data. If you specify action-level granularity, it
     *            generates service and action data. If you don't include this
     *            optional parameter, the operation generates service data.
     *            </p>
     * @see AccessAdvisorUsageGranularityType
     */
    public void setGranularity(AccessAdvisorUsageGranularityType granularity) {
        this.granularity = granularity.toString();
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether
     * you want to generate information about the last attempt to access
     * services or actions. If you specify service-level granularity, this
     * operation generates only service data. If you specify action-level
     * granularity, it generates service and action data. If you don't include
     * this optional parameter, the operation generates service data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param granularity <p>
     *            The level of detail that you want to generate. You can specify
     *            whether you want to generate information about the last
     *            attempt to access services or actions. If you specify
     *            service-level granularity, this operation generates only
     *            service data. If you specify action-level granularity, it
     *            generates service and action data. If you don't include this
     *            optional parameter, the operation generates service data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessAdvisorUsageGranularityType
     */
    public GenerateServiceLastAccessedDetailsRequest withGranularity(
            AccessAdvisorUsageGranularityType granularity) {
        this.granularity = granularity.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getGranularity() != null)
            sb.append("Granularity: " + getGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateServiceLastAccessedDetailsRequest == false)
            return false;
        GenerateServiceLastAccessedDetailsRequest other = (GenerateServiceLastAccessedDetailsRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null
                && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        return true;
    }
}
