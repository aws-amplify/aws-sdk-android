/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a set of temporary credentials for an AWS account or IAM user. The
 * credentials consist of an access key ID, a secret access key, and a security
 * token. Typically, you use <code>GetSessionToken</code> if you want to use MFA
 * to protect programmatic calls to specific AWS API operations like Amazon EC2
 * <code>StopInstances</code>. MFA-enabled IAM users would need to call
 * <code>GetSessionToken</code> and submit an MFA code that is associated with
 * their MFA device. Using the temporary security credentials that are returned
 * from the call, IAM users can then make programmatic calls to API operations
 * that require MFA authentication. If you do not supply a correct MFA code,
 * then the API returns an access denied error. For a comparison of
 * <code>GetSessionToken</code> with the other API operations that produce
 * temporary credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * The <code>GetSessionToken</code> operation must be called by using the
 * long-term AWS security credentials of the AWS account root user or an IAM
 * user. Credentials that are created by IAM users are valid for the duration
 * that you specify. This duration can range from 900 seconds (15 minutes) up to
 * a maximum of 129,600 seconds (36 hours), with a default of 43,200 seconds (12
 * hours). Credentials based on account credentials can range from 900 seconds
 * (15 minutes) up to 3,600 seconds (1 hour), with a default of 1 hour.
 * </p>
 * <p>
 * The temporary security credentials created by <code>GetSessionToken</code>
 * can be used to make API calls to any AWS service with the following
 * exceptions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You cannot call any IAM API operations unless MFA authentication information
 * is included in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot call any STS API <i>except</i> <code>AssumeRole</code> or
 * <code>GetCallerIdentity</code>.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * We recommend that you do not call <code>GetSessionToken</code> with AWS
 * account root user credentials. Instead, follow our <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users"
 * >best practices</a> by creating one or more IAM users, giving them the
 * necessary permissions, and using IAM users for everyday interaction with AWS.
 * </p>
 * </note>
 * <p>
 * The credentials that are returned by <code>GetSessionToken</code> are based
 * on permissions associated with the user whose credentials were used to call
 * the operation. If <code>GetSessionToken</code> is called using AWS account
 * root user credentials, the temporary credentials have root user permissions.
 * Similarly, if <code>GetSessionToken</code> is called using the credentials of
 * an IAM user, the temporary credentials have the same permissions as the IAM
 * user.
 * </p>
 * <p>
 * For more information about using <code>GetSessionToken</code> to create
 * temporary credentials, go to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"
 * >Temporary Credentials for Users in Untrusted Environments</a> in the <i>IAM
 * User Guide</i>.
 * </p>
 */
public class GetSessionTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as
     * the default. Sessions for AWS account owners are restricted to a maximum
     * of 3,600 seconds (one hour). If the duration is longer than one hour, the
     * session for AWS account owners defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * IAM user who is making the <code>GetSessionToken</code> call. Specify
     * this value if the IAM user has a policy that requires MFA authentication.
     * The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual
     * device (such as <code>arn:aws:iam::123456789012:mfa/user</code>). You can
     * find the device for an IAM user by going to the AWS Management Console
     * and viewing the user's security credentials.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy
     * requires the IAM user to submit an MFA code, specify this value. If MFA
     * authentication is required, the user must provide a code when requesting
     * a set of temporary security credentials. A user who fails to provide the
     * code receives an "access denied" response when requesting resources that
     * require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String tokenCode;

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as
     * the default. Sessions for AWS account owners are restricted to a maximum
     * of 3,600 seconds (one hour). If the duration is longer than one hour, the
     * session for AWS account owners defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return <p>
     *         The duration, in seconds, that the credentials should remain
     *         valid. Acceptable durations for IAM user sessions range from 900
     *         seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200
     *         seconds (12 hours) as the default. Sessions for AWS account
     *         owners are restricted to a maximum of 3,600 seconds (one hour).
     *         If the duration is longer than one hour, the session for AWS
     *         account owners defaults to one hour.
     *         </p>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as
     * the default. Sessions for AWS account owners are restricted to a maximum
     * of 3,600 seconds (one hour). If the duration is longer than one hour, the
     * session for AWS account owners defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, that the credentials should remain
     *            valid. Acceptable durations for IAM user sessions range from
     *            900 seconds (15 minutes) to 129,600 seconds (36 hours), with
     *            43,200 seconds (12 hours) as the default. Sessions for AWS
     *            account owners are restricted to a maximum of 3,600 seconds
     *            (one hour). If the duration is longer than one hour, the
     *            session for AWS account owners defaults to one hour.
     *            </p>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 900 seconds (15
     * minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as
     * the default. Sessions for AWS account owners are restricted to a maximum
     * of 3,600 seconds (one hour). If the duration is longer than one hour, the
     * session for AWS account owners defaults to one hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, that the credentials should remain
     *            valid. Acceptable durations for IAM user sessions range from
     *            900 seconds (15 minutes) to 129,600 seconds (36 hours), with
     *            43,200 seconds (12 hours) as the default. Sessions for AWS
     *            account owners are restricted to a maximum of 3,600 seconds
     *            (one hour). If the duration is longer than one hour, the
     *            session for AWS account owners defaults to one hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionTokenRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * IAM user who is making the <code>GetSessionToken</code> call. Specify
     * this value if the IAM user has a policy that requires MFA authentication.
     * The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual
     * device (such as <code>arn:aws:iam::123456789012:mfa/user</code>). You can
     * find the device for an IAM user by going to the AWS Management Console
     * and viewing the user's security credentials.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return <p>
     *         The identification number of the MFA device that is associated
     *         with the IAM user who is making the <code>GetSessionToken</code>
     *         call. Specify this value if the IAM user has a policy that
     *         requires MFA authentication. The value is either the serial
     *         number for a hardware device (such as <code>GAHT12345678</code>)
     *         or an Amazon Resource Name (ARN) for a virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>). You can find
     *         the device for an IAM user by going to the AWS Management Console
     *         and viewing the user's security credentials.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@:/-
     *         </p>
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * IAM user who is making the <code>GetSessionToken</code> call. Specify
     * this value if the IAM user has a policy that requires MFA authentication.
     * The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual
     * device (such as <code>arn:aws:iam::123456789012:mfa/user</code>). You can
     * find the device for an IAM user by going to the AWS Management Console
     * and viewing the user's security credentials.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber <p>
     *            The identification number of the MFA device that is associated
     *            with the IAM user who is making the
     *            <code>GetSessionToken</code> call. Specify this value if the
     *            IAM user has a policy that requires MFA authentication. The
     *            value is either the serial number for a hardware device (such
     *            as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN)
     *            for a virtual device (such as
     *            <code>arn:aws:iam::123456789012:mfa/user</code>). You can find
     *            the device for an IAM user by going to the AWS Management
     *            Console and viewing the user's security credentials.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@:/-
     *            </p>
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * IAM user who is making the <code>GetSessionToken</code> call. Specify
     * this value if the IAM user has a policy that requires MFA authentication.
     * The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual
     * device (such as <code>arn:aws:iam::123456789012:mfa/user</code>). You can
     * find the device for an IAM user by going to the AWS Management Console
     * and viewing the user's security credentials.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber <p>
     *            The identification number of the MFA device that is associated
     *            with the IAM user who is making the
     *            <code>GetSessionToken</code> call. Specify this value if the
     *            IAM user has a policy that requires MFA authentication. The
     *            value is either the serial number for a hardware device (such
     *            as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN)
     *            for a virtual device (such as
     *            <code>arn:aws:iam::123456789012:mfa/user</code>). You can find
     *            the device for an IAM user by going to the AWS Management
     *            Console and viewing the user's security credentials.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@:/-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionTokenRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy
     * requires the IAM user to submit an MFA code, specify this value. If MFA
     * authentication is required, the user must provide a code when requesting
     * a set of temporary security credentials. A user who fails to provide the
     * code receives an "access denied" response when requesting resources that
     * require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return <p>
     *         The value provided by the MFA device, if MFA is required. If any
     *         policy requires the IAM user to submit an MFA code, specify this
     *         value. If MFA authentication is required, the user must provide a
     *         code when requesting a set of temporary security credentials. A
     *         user who fails to provide the code receives an "access denied"
     *         response when requesting resources that require MFA
     *         authentication.
     *         </p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern,
     *         is a sequence of six numeric digits.
     *         </p>
     */
    public String getTokenCode() {
        return tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy
     * requires the IAM user to submit an MFA code, specify this value. If MFA
     * authentication is required, the user must provide a code when requesting
     * a set of temporary security credentials. A user who fails to provide the
     * code receives an "access denied" response when requesting resources that
     * require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode <p>
     *            The value provided by the MFA device, if MFA is required. If
     *            any policy requires the IAM user to submit an MFA code,
     *            specify this value. If MFA authentication is required, the
     *            user must provide a code when requesting a set of temporary
     *            security credentials. A user who fails to provide the code
     *            receives an "access denied" response when requesting resources
     *            that require MFA authentication.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a sequence of six numeric digits.
     *            </p>
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if MFA is required. If any policy
     * requires the IAM user to submit an MFA code, specify this value. If MFA
     * authentication is required, the user must provide a code when requesting
     * a set of temporary security credentials. A user who fails to provide the
     * code receives an "access denied" response when requesting resources that
     * require MFA authentication.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode <p>
     *            The value provided by the MFA device, if MFA is required. If
     *            any policy requires the IAM user to submit an MFA code,
     *            specify this value. If MFA authentication is required, the
     *            user must provide a code when requesting a set of temporary
     *            security credentials. A user who fails to provide the code
     *            receives an "access denied" response when requesting resources
     *            that require MFA authentication.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a sequence of six numeric digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionTokenRequest withTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
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
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getTokenCode() != null)
            sb.append("TokenCode: " + getTokenCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getTokenCode() == null) ? 0 : getTokenCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionTokenRequest == false)
            return false;
        GetSessionTokenRequest other = (GetSessionTokenRequest) obj;

        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getTokenCode() == null ^ this.getTokenCode() == null)
            return false;
        if (other.getTokenCode() != null
                && other.getTokenCode().equals(this.getTokenCode()) == false)
            return false;
        return true;
    }
}
