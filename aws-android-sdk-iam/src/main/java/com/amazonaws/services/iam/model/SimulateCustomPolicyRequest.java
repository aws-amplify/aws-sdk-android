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
 * Simulate how a set of IAM policies and optionally a resource-based policy
 * works with a list of API operations and AWS resources to determine the
 * policies' effective permissions. The policies are provided as strings.
 * </p>
 * <p>
 * The simulation does not perform the API operations; it only checks the
 * authorization to determine if the simulated policies allow or deny the
 * operations.
 * </p>
 * <p>
 * If you want to simulate existing policies that are attached to an IAM user,
 * group, or role, use <a>SimulatePrincipalPolicy</a> instead.
 * </p>
 * <p>
 * Context keys are variables that are maintained by AWS and its services and
 * which provide details about the context of an API query request. You can use
 * the <code>Condition</code> element of an IAM policy to evaluate context keys.
 * To get the list of context keys that the policies require for correct
 * simulation, use <a>GetContextKeysForCustomPolicy</a>.
 * </p>
 * <p>
 * If the output is long, you can use <code>MaxItems</code> and
 * <code>Marker</code> parameters to paginate the results.
 * </p>
 */
public class SimulateCustomPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM
     * policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the
     * <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     * >GetFederationToken</a> or one of the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> API operations. In other words, do not use policies
     * designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> policyInputList;

    /**
     * <p>
     * The IAM permissions boundary policy to simulate. The permissions boundary
     * sets the maximum permissions that an IAM entity can have. You can input
     * only one permissions boundary when you pass a policy to this operation.
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Entities</a> in the <i>IAM User
     * Guide</i>. The policy input is specified as a string that contains the
     * complete, valid JSON text of a permissions boundary policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> permissionsBoundaryPolicyInputList;

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each
     * operation is evaluated against each resource. Each operation must include
     * the service identifier, such as <code>iam:CreateUser</code>. This
     * operation does not support using wildcards (*) in an action name.
     * </p>
     */
    private java.util.List<String> actionNames;

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided, then the value defaults to <code>*</code> (all
     * resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines the
     * access result (allowed or denied) of each combination and reports it in
     * the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified
     * resources. If you want to include a resource policy in the simulation,
     * then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable
     * to all of the resources included in the simulation or you receive an
     * invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> resourceArns;

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String resourcePolicy;

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any
     * simulated resource that does not identify its owner in the resource ARN.
     * Examples of resource ARNs include an S3 bucket or object. If
     * <code>ResourceOwner</code> is specified, it is also used as the account
     * owner of any <code>ResourcePolicy</code> included in the simulation. If
     * the <code>ResourceOwner</code> parameter is not specified, then the owner
     * of the resources and the resource policy defaults to the account of the
     * identity provided in <code>CallerArn</code>. This parameter is required
     * only if you specify a resource-based policy and account that owns the
     * resource is different from the account that owns the simulated calling
     * user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax:
     * <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For example, to
     * represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String resourceOwner;

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of
     * the API operations. <code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> so that the policy's <code>Principal</code>
     * element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN
     * of an assumed role, federated user, or a service principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String callerArn;

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated in one of the simulated IAM
     * permissions policies, the corresponding value is supplied.
     * </p>
     */
    private java.util.List<ContextEntry> contextEntries;

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that
     * support resource-based policies require different combinations of
     * resources. By specifying the type of simulation to run, you enable the
     * policy simulator to enforce the presence of the required resources to
     * ensure reliable simulation results. If your simulation does not match one
     * of the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume, then
     * you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes
     * an IP subnet, then you must specify the subnet resource. For more
     * information on the EC2 scenario options, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String resourceHandlingOption;

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

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
     * A list of policy documents to include in the simulation. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM
     * policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the
     * <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     * >GetFederationToken</a> or one of the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> API operations. In other words, do not use policies
     * designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of policy documents to include in the simulation. Each
     *         document is specified as a string containing the complete, valid
     *         JSON text of an IAM policy. Do not include any resource-based
     *         policies in this parameter. Any resource-based policy must be
     *         submitted with the <code>ResourcePolicy</code> parameter. The
     *         policies cannot be "scope-down" policies, such as you could
     *         include in a call to <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *         >GetFederationToken</a> or one of the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     *         >AssumeRole</a> API operations. In other words, do not use
     *         policies designed to restrict what a user can do while using the
     *         temporary credentials.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         used to validate this parameter is a string of characters
     *         consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1
     *         Supplement character set (through <code>\u00FF</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab (<code>\u0009</code>), line feed (
     *         <code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getPolicyInputList() {
        return policyInputList;
    }

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM
     * policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the
     * <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     * >GetFederationToken</a> or one of the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> API operations. In other words, do not use policies
     * designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     *
     * @param policyInputList <p>
     *            A list of policy documents to include in the simulation. Each
     *            document is specified as a string containing the complete,
     *            valid JSON text of an IAM policy. Do not include any
     *            resource-based policies in this parameter. Any resource-based
     *            policy must be submitted with the <code>ResourcePolicy</code>
     *            parameter. The policies cannot be "scope-down" policies, such
     *            as you could include in a call to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *            >GetFederationToken</a> or one of the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     *            >AssumeRole</a> API operations. In other words, do not use
     *            policies designed to restrict what a user can do while using
     *            the temporary credentials.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }

        this.policyInputList = new java.util.ArrayList<String>(policyInputList);
    }

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM
     * policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the
     * <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     * >GetFederationToken</a> or one of the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> API operations. In other words, do not use policies
     * designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyInputList <p>
     *            A list of policy documents to include in the simulation. Each
     *            document is specified as a string containing the complete,
     *            valid JSON text of an IAM policy. Do not include any
     *            resource-based policies in this parameter. Any resource-based
     *            policy must be submitted with the <code>ResourcePolicy</code>
     *            parameter. The policies cannot be "scope-down" policies, such
     *            as you could include in a call to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *            >GetFederationToken</a> or one of the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     *            >AssumeRole</a> API operations. In other words, do not use
     *            policies designed to restrict what a user can do while using
     *            the temporary credentials.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withPolicyInputList(String... policyInputList) {
        if (getPolicyInputList() == null) {
            this.policyInputList = new java.util.ArrayList<String>(policyInputList.length);
        }
        for (String value : policyInputList) {
            this.policyInputList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM
     * policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the
     * <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     * >GetFederationToken</a> or one of the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> API operations. In other words, do not use policies
     * designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyInputList <p>
     *            A list of policy documents to include in the simulation. Each
     *            document is specified as a string containing the complete,
     *            valid JSON text of an IAM policy. Do not include any
     *            resource-based policies in this parameter. Any resource-based
     *            policy must be submitted with the <code>ResourcePolicy</code>
     *            parameter. The policies cannot be "scope-down" policies, such
     *            as you could include in a call to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *            >GetFederationToken</a> or one of the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html"
     *            >AssumeRole</a> API operations. In other words, do not use
     *            policies designed to restrict what a user can do while using
     *            the temporary credentials.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withPolicyInputList(
            java.util.Collection<String> policyInputList) {
        setPolicyInputList(policyInputList);
        return this;
    }

    /**
     * <p>
     * The IAM permissions boundary policy to simulate. The permissions boundary
     * sets the maximum permissions that an IAM entity can have. You can input
     * only one permissions boundary when you pass a policy to this operation.
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Entities</a> in the <i>IAM User
     * Guide</i>. The policy input is specified as a string that contains the
     * complete, valid JSON text of a permissions boundary policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The IAM permissions boundary policy to simulate. The permissions
     *         boundary sets the maximum permissions that an IAM entity can
     *         have. You can input only one permissions boundary when you pass a
     *         policy to this operation. For more information about permissions
     *         boundaries, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *         >Permissions Boundaries for IAM Entities</a> in the <i>IAM User
     *         Guide</i>. The policy input is specified as a string that
     *         contains the complete, valid JSON text of a permissions boundary
     *         policy.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         used to validate this parameter is a string of characters
     *         consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1
     *         Supplement character set (through <code>\u00FF</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab (<code>\u0009</code>), line feed (
     *         <code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getPermissionsBoundaryPolicyInputList() {
        return permissionsBoundaryPolicyInputList;
    }

    /**
     * <p>
     * The IAM permissions boundary policy to simulate. The permissions boundary
     * sets the maximum permissions that an IAM entity can have. You can input
     * only one permissions boundary when you pass a policy to this operation.
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Entities</a> in the <i>IAM User
     * Guide</i>. The policy input is specified as a string that contains the
     * complete, valid JSON text of a permissions boundary policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     *
     * @param permissionsBoundaryPolicyInputList <p>
     *            The IAM permissions boundary policy to simulate. The
     *            permissions boundary sets the maximum permissions that an IAM
     *            entity can have. You can input only one permissions boundary
     *            when you pass a policy to this operation. For more information
     *            about permissions boundaries, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Entities</a> in the <i>IAM
     *            User Guide</i>. The policy input is specified as a string that
     *            contains the complete, valid JSON text of a permissions
     *            boundary policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPermissionsBoundaryPolicyInputList(
            java.util.Collection<String> permissionsBoundaryPolicyInputList) {
        if (permissionsBoundaryPolicyInputList == null) {
            this.permissionsBoundaryPolicyInputList = null;
            return;
        }

        this.permissionsBoundaryPolicyInputList = new java.util.ArrayList<String>(
                permissionsBoundaryPolicyInputList);
    }

    /**
     * <p>
     * The IAM permissions boundary policy to simulate. The permissions boundary
     * sets the maximum permissions that an IAM entity can have. You can input
     * only one permissions boundary when you pass a policy to this operation.
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Entities</a> in the <i>IAM User
     * Guide</i>. The policy input is specified as a string that contains the
     * complete, valid JSON text of a permissions boundary policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionsBoundaryPolicyInputList <p>
     *            The IAM permissions boundary policy to simulate. The
     *            permissions boundary sets the maximum permissions that an IAM
     *            entity can have. You can input only one permissions boundary
     *            when you pass a policy to this operation. For more information
     *            about permissions boundaries, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Entities</a> in the <i>IAM
     *            User Guide</i>. The policy input is specified as a string that
     *            contains the complete, valid JSON text of a permissions
     *            boundary policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withPermissionsBoundaryPolicyInputList(
            String... permissionsBoundaryPolicyInputList) {
        if (getPermissionsBoundaryPolicyInputList() == null) {
            this.permissionsBoundaryPolicyInputList = new java.util.ArrayList<String>(
                    permissionsBoundaryPolicyInputList.length);
        }
        for (String value : permissionsBoundaryPolicyInputList) {
            this.permissionsBoundaryPolicyInputList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IAM permissions boundary policy to simulate. The permissions boundary
     * sets the maximum permissions that an IAM entity can have. You can input
     * only one permissions boundary when you pass a policy to this operation.
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Entities</a> in the <i>IAM User
     * Guide</i>. The policy input is specified as a string that contains the
     * complete, valid JSON text of a permissions boundary policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionsBoundaryPolicyInputList <p>
     *            The IAM permissions boundary policy to simulate. The
     *            permissions boundary sets the maximum permissions that an IAM
     *            entity can have. You can input only one permissions boundary
     *            when you pass a policy to this operation. For more information
     *            about permissions boundaries, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Entities</a> in the <i>IAM
     *            User Guide</i>. The policy input is specified as a string that
     *            contains the complete, valid JSON text of a permissions
     *            boundary policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withPermissionsBoundaryPolicyInputList(
            java.util.Collection<String> permissionsBoundaryPolicyInputList) {
        setPermissionsBoundaryPolicyInputList(permissionsBoundaryPolicyInputList);
        return this;
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each
     * operation is evaluated against each resource. Each operation must include
     * the service identifier, such as <code>iam:CreateUser</code>. This
     * operation does not support using wildcards (*) in an action name.
     * </p>
     *
     * @return <p>
     *         A list of names of API operations to evaluate in the simulation.
     *         Each operation is evaluated against each resource. Each operation
     *         must include the service identifier, such as
     *         <code>iam:CreateUser</code>. This operation does not support
     *         using wildcards (*) in an action name.
     *         </p>
     */
    public java.util.List<String> getActionNames() {
        return actionNames;
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each
     * operation is evaluated against each resource. Each operation must include
     * the service identifier, such as <code>iam:CreateUser</code>. This
     * operation does not support using wildcards (*) in an action name.
     * </p>
     *
     * @param actionNames <p>
     *            A list of names of API operations to evaluate in the
     *            simulation. Each operation is evaluated against each resource.
     *            Each operation must include the service identifier, such as
     *            <code>iam:CreateUser</code>. This operation does not support
     *            using wildcards (*) in an action name.
     *            </p>
     */
    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }

        this.actionNames = new java.util.ArrayList<String>(actionNames);
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each
     * operation is evaluated against each resource. Each operation must include
     * the service identifier, such as <code>iam:CreateUser</code>. This
     * operation does not support using wildcards (*) in an action name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionNames <p>
     *            A list of names of API operations to evaluate in the
     *            simulation. Each operation is evaluated against each resource.
     *            Each operation must include the service identifier, such as
     *            <code>iam:CreateUser</code>. This operation does not support
     *            using wildcards (*) in an action name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withActionNames(String... actionNames) {
        if (getActionNames() == null) {
            this.actionNames = new java.util.ArrayList<String>(actionNames.length);
        }
        for (String value : actionNames) {
            this.actionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each
     * operation is evaluated against each resource. Each operation must include
     * the service identifier, such as <code>iam:CreateUser</code>. This
     * operation does not support using wildcards (*) in an action name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionNames <p>
     *            A list of names of API operations to evaluate in the
     *            simulation. Each operation is evaluated against each resource.
     *            Each operation must include the service identifier, such as
     *            <code>iam:CreateUser</code>. This operation does not support
     *            using wildcards (*) in an action name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withActionNames(java.util.Collection<String> actionNames) {
        setActionNames(actionNames);
        return this;
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided, then the value defaults to <code>*</code> (all
     * resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines the
     * access result (allowed or denied) of each combination and reports it in
     * the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified
     * resources. If you want to include a resource policy in the simulation,
     * then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable
     * to all of the resources included in the simulation or you receive an
     * invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     *
     * @return <p>
     *         A list of ARNs of AWS resources to include in the simulation. If
     *         this parameter is not provided, then the value defaults to
     *         <code>*</code> (all resources). Each API in the
     *         <code>ActionNames</code> parameter is evaluated for each resource
     *         in this list. The simulation determines the access result
     *         (allowed or denied) of each combination and reports it in the
     *         response.
     *         </p>
     *         <p>
     *         The simulation does not automatically retrieve policies for the
     *         specified resources. If you want to include a resource policy in
     *         the simulation, then you must include the policy as a string in
     *         the <code>ResourcePolicy</code> parameter.
     *         </p>
     *         <p>
     *         If you include a <code>ResourcePolicy</code>, then it must be
     *         applicable to all of the resources included in the simulation or
     *         you receive an invalid input error.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided, then the value defaults to <code>*</code> (all
     * resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines the
     * access result (allowed or denied) of each combination and reports it in
     * the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified
     * resources. If you want to include a resource policy in the simulation,
     * then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable
     * to all of the resources included in the simulation or you receive an
     * invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     *
     * @param resourceArns <p>
     *            A list of ARNs of AWS resources to include in the simulation.
     *            If this parameter is not provided, then the value defaults to
     *            <code>*</code> (all resources). Each API in the
     *            <code>ActionNames</code> parameter is evaluated for each
     *            resource in this list. The simulation determines the access
     *            result (allowed or denied) of each combination and reports it
     *            in the response.
     *            </p>
     *            <p>
     *            The simulation does not automatically retrieve policies for
     *            the specified resources. If you want to include a resource
     *            policy in the simulation, then you must include the policy as
     *            a string in the <code>ResourcePolicy</code> parameter.
     *            </p>
     *            <p>
     *            If you include a <code>ResourcePolicy</code>, then it must be
     *            applicable to all of the resources included in the simulation
     *            or you receive an invalid input error.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided, then the value defaults to <code>*</code> (all
     * resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines the
     * access result (allowed or denied) of each combination and reports it in
     * the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified
     * resources. If you want to include a resource policy in the simulation,
     * then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable
     * to all of the resources included in the simulation or you receive an
     * invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            A list of ARNs of AWS resources to include in the simulation.
     *            If this parameter is not provided, then the value defaults to
     *            <code>*</code> (all resources). Each API in the
     *            <code>ActionNames</code> parameter is evaluated for each
     *            resource in this list. The simulation determines the access
     *            result (allowed or denied) of each combination and reports it
     *            in the response.
     *            </p>
     *            <p>
     *            The simulation does not automatically retrieve policies for
     *            the specified resources. If you want to include a resource
     *            policy in the simulation, then you must include the policy as
     *            a string in the <code>ResourcePolicy</code> parameter.
     *            </p>
     *            <p>
     *            If you include a <code>ResourcePolicy</code>, then it must be
     *            applicable to all of the resources included in the simulation
     *            or you receive an invalid input error.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withResourceArns(String... resourceArns) {
        if (getResourceArns() == null) {
            this.resourceArns = new java.util.ArrayList<String>(resourceArns.length);
        }
        for (String value : resourceArns) {
            this.resourceArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided, then the value defaults to <code>*</code> (all
     * resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines the
     * access result (allowed or denied) of each combination and reports it in
     * the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified
     * resources. If you want to include a resource policy in the simulation,
     * then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable
     * to all of the resources included in the simulation or you receive an
     * invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            A list of ARNs of AWS resources to include in the simulation.
     *            If this parameter is not provided, then the value defaults to
     *            <code>*</code> (all resources). Each API in the
     *            <code>ActionNames</code> parameter is evaluated for each
     *            resource in this list. The simulation determines the access
     *            result (allowed or denied) of each combination and reports it
     *            in the response.
     *            </p>
     *            <p>
     *            The simulation does not automatically retrieve policies for
     *            the specified resources. If you want to include a resource
     *            policy in the simulation, then you must include the policy as
     *            a string in the <code>ResourcePolicy</code> parameter.
     *            </p>
     *            <p>
     *            If you include a <code>ResourcePolicy</code>, then it must be
     *            applicable to all of the resources included in the simulation
     *            or you receive an invalid input error.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         A resource-based policy to include in the simulation provided as
     *         a string. Each resource in the simulation is treated as if it had
     *         this policy attached. You can include only one resource-based
     *         policy in a simulation.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         used to validate this parameter is a string of characters
     *         consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1
     *         Supplement character set (through <code>\u00FF</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab (<code>\u0009</code>), line feed (
     *         <code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourcePolicy() {
        return resourcePolicy;
    }

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param resourcePolicy <p>
     *            A resource-based policy to include in the simulation provided
     *            as a string. Each resource in the simulation is treated as if
     *            it had this policy attached. You can include only one
     *            resource-based policy in a simulation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param resourcePolicy <p>
     *            A resource-based policy to include in the simulation provided
     *            as a string. Each resource in the simulation is treated as if
     *            it had this policy attached. You can include only one
     *            resource-based policy in a simulation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
        return this;
    }

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any
     * simulated resource that does not identify its owner in the resource ARN.
     * Examples of resource ARNs include an S3 bucket or object. If
     * <code>ResourceOwner</code> is specified, it is also used as the account
     * owner of any <code>ResourcePolicy</code> included in the simulation. If
     * the <code>ResourceOwner</code> parameter is not specified, then the owner
     * of the resources and the resource policy defaults to the account of the
     * identity provided in <code>CallerArn</code>. This parameter is required
     * only if you specify a resource-based policy and account that owns the
     * resource is different from the account that owns the simulated calling
     * user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax:
     * <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For example, to
     * represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         An ARN representing the AWS account ID that specifies the owner
     *         of any simulated resource that does not identify its owner in the
     *         resource ARN. Examples of resource ARNs include an S3 bucket or
     *         object. If <code>ResourceOwner</code> is specified, it is also
     *         used as the account owner of any <code>ResourcePolicy</code>
     *         included in the simulation. If the <code>ResourceOwner</code>
     *         parameter is not specified, then the owner of the resources and
     *         the resource policy defaults to the account of the identity
     *         provided in <code>CallerArn</code>. This parameter is required
     *         only if you specify a resource-based policy and account that owns
     *         the resource is different from the account that owns the
     *         simulated calling user <code>CallerArn</code>.
     *         </p>
     *         <p>
     *         The ARN for an account uses the following syntax:
     *         <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     *         example, to represent the account with the 112233445566 ID, use
     *         the following ARN: <code>arn:aws:iam::112233445566-ID:root</code>
     *         .
     *         </p>
     */
    public String getResourceOwner() {
        return resourceOwner;
    }

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any
     * simulated resource that does not identify its owner in the resource ARN.
     * Examples of resource ARNs include an S3 bucket or object. If
     * <code>ResourceOwner</code> is specified, it is also used as the account
     * owner of any <code>ResourcePolicy</code> included in the simulation. If
     * the <code>ResourceOwner</code> parameter is not specified, then the owner
     * of the resources and the resource policy defaults to the account of the
     * identity provided in <code>CallerArn</code>. This parameter is required
     * only if you specify a resource-based policy and account that owns the
     * resource is different from the account that owns the simulated calling
     * user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax:
     * <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For example, to
     * represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param resourceOwner <p>
     *            An ARN representing the AWS account ID that specifies the
     *            owner of any simulated resource that does not identify its
     *            owner in the resource ARN. Examples of resource ARNs include
     *            an S3 bucket or object. If <code>ResourceOwner</code> is
     *            specified, it is also used as the account owner of any
     *            <code>ResourcePolicy</code> included in the simulation. If the
     *            <code>ResourceOwner</code> parameter is not specified, then
     *            the owner of the resources and the resource policy defaults to
     *            the account of the identity provided in <code>CallerArn</code>
     *            . This parameter is required only if you specify a
     *            resource-based policy and account that owns the resource is
     *            different from the account that owns the simulated calling
     *            user <code>CallerArn</code>.
     *            </p>
     *            <p>
     *            The ARN for an account uses the following syntax:
     *            <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     *            example, to represent the account with the 112233445566 ID,
     *            use the following ARN:
     *            <code>arn:aws:iam::112233445566-ID:root</code>.
     *            </p>
     */
    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any
     * simulated resource that does not identify its owner in the resource ARN.
     * Examples of resource ARNs include an S3 bucket or object. If
     * <code>ResourceOwner</code> is specified, it is also used as the account
     * owner of any <code>ResourcePolicy</code> included in the simulation. If
     * the <code>ResourceOwner</code> parameter is not specified, then the owner
     * of the resources and the resource policy defaults to the account of the
     * identity provided in <code>CallerArn</code>. This parameter is required
     * only if you specify a resource-based policy and account that owns the
     * resource is different from the account that owns the simulated calling
     * user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax:
     * <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For example, to
     * represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param resourceOwner <p>
     *            An ARN representing the AWS account ID that specifies the
     *            owner of any simulated resource that does not identify its
     *            owner in the resource ARN. Examples of resource ARNs include
     *            an S3 bucket or object. If <code>ResourceOwner</code> is
     *            specified, it is also used as the account owner of any
     *            <code>ResourcePolicy</code> included in the simulation. If the
     *            <code>ResourceOwner</code> parameter is not specified, then
     *            the owner of the resources and the resource policy defaults to
     *            the account of the identity provided in <code>CallerArn</code>
     *            . This parameter is required only if you specify a
     *            resource-based policy and account that owns the resource is
     *            different from the account that owns the simulated calling
     *            user <code>CallerArn</code>.
     *            </p>
     *            <p>
     *            The ARN for an account uses the following syntax:
     *            <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     *            example, to represent the account with the 112233445566 ID,
     *            use the following ARN:
     *            <code>arn:aws:iam::112233445566-ID:root</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of
     * the API operations. <code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> so that the policy's <code>Principal</code>
     * element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN
     * of an assumed role, federated user, or a service principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the IAM user that you want to use as the simulated
     *         caller of the API operations. <code>CallerArn</code> is required
     *         if you include a <code>ResourcePolicy</code> so that the policy's
     *         <code>Principal</code> element has a value to use in evaluating
     *         the policy.
     *         </p>
     *         <p>
     *         You can specify only the ARN of an IAM user. You cannot specify
     *         the ARN of an assumed role, federated user, or a service
     *         principal.
     *         </p>
     */
    public String getCallerArn() {
        return callerArn;
    }

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of
     * the API operations. <code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> so that the policy's <code>Principal</code>
     * element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN
     * of an assumed role, federated user, or a service principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param callerArn <p>
     *            The ARN of the IAM user that you want to use as the simulated
     *            caller of the API operations. <code>CallerArn</code> is
     *            required if you include a <code>ResourcePolicy</code> so that
     *            the policy's <code>Principal</code> element has a value to use
     *            in evaluating the policy.
     *            </p>
     *            <p>
     *            You can specify only the ARN of an IAM user. You cannot
     *            specify the ARN of an assumed role, federated user, or a
     *            service principal.
     *            </p>
     */
    public void setCallerArn(String callerArn) {
        this.callerArn = callerArn;
    }

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of
     * the API operations. <code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> so that the policy's <code>Principal</code>
     * element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN
     * of an assumed role, federated user, or a service principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param callerArn <p>
     *            The ARN of the IAM user that you want to use as the simulated
     *            caller of the API operations. <code>CallerArn</code> is
     *            required if you include a <code>ResourcePolicy</code> so that
     *            the policy's <code>Principal</code> element has a value to use
     *            in evaluating the policy.
     *            </p>
     *            <p>
     *            You can specify only the ARN of an IAM user. You cannot
     *            specify the ARN of an assumed role, federated user, or a
     *            service principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withCallerArn(String callerArn) {
        this.callerArn = callerArn;
        return this;
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated in one of the simulated IAM
     * permissions policies, the corresponding value is supplied.
     * </p>
     *
     * @return <p>
     *         A list of context keys and corresponding values for the
     *         simulation to use. Whenever a context key is evaluated in one of
     *         the simulated IAM permissions policies, the corresponding value
     *         is supplied.
     *         </p>
     */
    public java.util.List<ContextEntry> getContextEntries() {
        return contextEntries;
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated in one of the simulated IAM
     * permissions policies, the corresponding value is supplied.
     * </p>
     *
     * @param contextEntries <p>
     *            A list of context keys and corresponding values for the
     *            simulation to use. Whenever a context key is evaluated in one
     *            of the simulated IAM permissions policies, the corresponding
     *            value is supplied.
     *            </p>
     */
    public void setContextEntries(java.util.Collection<ContextEntry> contextEntries) {
        if (contextEntries == null) {
            this.contextEntries = null;
            return;
        }

        this.contextEntries = new java.util.ArrayList<ContextEntry>(contextEntries);
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated in one of the simulated IAM
     * permissions policies, the corresponding value is supplied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contextEntries <p>
     *            A list of context keys and corresponding values for the
     *            simulation to use. Whenever a context key is evaluated in one
     *            of the simulated IAM permissions policies, the corresponding
     *            value is supplied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withContextEntries(ContextEntry... contextEntries) {
        if (getContextEntries() == null) {
            this.contextEntries = new java.util.ArrayList<ContextEntry>(contextEntries.length);
        }
        for (ContextEntry value : contextEntries) {
            this.contextEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated in one of the simulated IAM
     * permissions policies, the corresponding value is supplied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contextEntries <p>
     *            A list of context keys and corresponding values for the
     *            simulation to use. Whenever a context key is evaluated in one
     *            of the simulated IAM permissions policies, the corresponding
     *            value is supplied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withContextEntries(
            java.util.Collection<ContextEntry> contextEntries) {
        setContextEntries(contextEntries);
        return this;
    }

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that
     * support resource-based policies require different combinations of
     * resources. By specifying the type of simulation to run, you enable the
     * policy simulator to enforce the presence of the required resources to
     * ensure reliable simulation results. If your simulation does not match one
     * of the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume, then
     * you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes
     * an IP subnet, then you must specify the subnet resource. For more
     * information on the EC2 scenario options, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Specifies the type of simulation to run. Different API operations
     *         that support resource-based policies require different
     *         combinations of resources. By specifying the type of simulation
     *         to run, you enable the policy simulator to enforce the presence
     *         of the required resources to ensure reliable simulation results.
     *         If your simulation does not match one of the following scenarios,
     *         then you can omit this parameter. The following list shows each
     *         of the supported scenario values and the resources that you must
     *         define to run the simulation.
     *         </p>
     *         <p>
     *         Each of the EC2 scenarios requires that you specify instance,
     *         image, and security-group resources. If your scenario includes an
     *         EBS volume, then you must specify that volume as a resource. If
     *         the EC2 scenario includes VPC, then you must supply the
     *         network-interface resource. If it includes an IP subnet, then you
     *         must specify the subnet resource. For more information on the EC2
     *         scenario options, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *         >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>EC2-Classic-InstanceStore</b>
     *         </p>
     *         <p>
     *         instance, image, security-group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-Classic-EBS</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, volume
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-InstanceStore</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-InstanceStore-Subnet</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface, subnet
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-EBS</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface, volume
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-EBS-Subnet</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface, subnet,
     *         volume
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourceHandlingOption() {
        return resourceHandlingOption;
    }

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that
     * support resource-based policies require different combinations of
     * resources. By specifying the type of simulation to run, you enable the
     * policy simulator to enforce the presence of the required resources to
     * ensure reliable simulation results. If your simulation does not match one
     * of the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume, then
     * you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes
     * an IP subnet, then you must specify the subnet resource. For more
     * information on the EC2 scenario options, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceHandlingOption <p>
     *            Specifies the type of simulation to run. Different API
     *            operations that support resource-based policies require
     *            different combinations of resources. By specifying the type of
     *            simulation to run, you enable the policy simulator to enforce
     *            the presence of the required resources to ensure reliable
     *            simulation results. If your simulation does not match one of
     *            the following scenarios, then you can omit this parameter. The
     *            following list shows each of the supported scenario values and
     *            the resources that you must define to run the simulation.
     *            </p>
     *            <p>
     *            Each of the EC2 scenarios requires that you specify instance,
     *            image, and security-group resources. If your scenario includes
     *            an EBS volume, then you must specify that volume as a
     *            resource. If the EC2 scenario includes VPC, then you must
     *            supply the network-interface resource. If it includes an IP
     *            subnet, then you must specify the subnet resource. For more
     *            information on the EC2 scenario options, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *            >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>EC2-Classic-InstanceStore</b>
     *            </p>
     *            <p>
     *            instance, image, security-group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-Classic-EBS</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, volume
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-InstanceStore</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-InstanceStore-Subnet</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface, subnet
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-EBS</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface, volume
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-EBS-Subnet</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface, subnet,
     *            volume
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourceHandlingOption(String resourceHandlingOption) {
        this.resourceHandlingOption = resourceHandlingOption;
    }

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that
     * support resource-based policies require different combinations of
     * resources. By specifying the type of simulation to run, you enable the
     * policy simulator to enforce the presence of the required resources to
     * ensure reliable simulation results. If your simulation does not match one
     * of the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume, then
     * you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes
     * an IP subnet, then you must specify the subnet resource. For more
     * information on the EC2 scenario options, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceHandlingOption <p>
     *            Specifies the type of simulation to run. Different API
     *            operations that support resource-based policies require
     *            different combinations of resources. By specifying the type of
     *            simulation to run, you enable the policy simulator to enforce
     *            the presence of the required resources to ensure reliable
     *            simulation results. If your simulation does not match one of
     *            the following scenarios, then you can omit this parameter. The
     *            following list shows each of the supported scenario values and
     *            the resources that you must define to run the simulation.
     *            </p>
     *            <p>
     *            Each of the EC2 scenarios requires that you specify instance,
     *            image, and security-group resources. If your scenario includes
     *            an EBS volume, then you must specify that volume as a
     *            resource. If the EC2 scenario includes VPC, then you must
     *            supply the network-interface resource. If it includes an IP
     *            subnet, then you must specify the subnet resource. For more
     *            information on the EC2 scenario options, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *            >Supported Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>EC2-Classic-InstanceStore</b>
     *            </p>
     *            <p>
     *            instance, image, security-group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-Classic-EBS</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, volume
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-InstanceStore</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-InstanceStore-Subnet</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface, subnet
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-EBS</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface, volume
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EC2-VPC-EBS-Subnet</b>
     *            </p>
     *            <p>
     *            instance, image, security-group, network-interface, subnet,
     *            volume
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withResourceHandlingOption(String resourceHandlingOption) {
        this.resourceHandlingOption = resourceHandlingOption;
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use this only when paginating results to indicate the maximum
     *         number of items you want in the response. If additional items
     *         exist beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>.
     *         </p>
     *         <p>
     *         If you do not include this parameter, the number of items
     *         defaults to 100. Note that IAM might return fewer results, even
     *         when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns
     *         <code>true</code>, and <code>Marker</code> contains a value to
     *         include in the subsequent call that tells the service where to
     *         continue from.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems <p>
     *            Use this only when paginating results to indicate the maximum
     *            number of items you want in the response. If additional items
     *            exist beyond the maximum you specify, the
     *            <code>IsTruncated</code> response element is <code>true</code>
     *            .
     *            </p>
     *            <p>
     *            If you do not include this parameter, the number of items
     *            defaults to 100. Note that IAM might return fewer results,
     *            even when there are more results available. In that case, the
     *            <code>IsTruncated</code> response element returns
     *            <code>true</code>, and <code>Marker</code> contains a value to
     *            include in the subsequent call that tells the service where to
     *            continue from.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems <p>
     *            Use this only when paginating results to indicate the maximum
     *            number of items you want in the response. If additional items
     *            exist beyond the maximum you specify, the
     *            <code>IsTruncated</code> response element is <code>true</code>
     *            .
     *            </p>
     *            <p>
     *            If you do not include this parameter, the number of items
     *            defaults to 100. Note that IAM might return fewer results,
     *            even when there are more results available. In that case, the
     *            <code>IsTruncated</code> response element returns
     *            <code>true</code>, and <code>Marker</code> contains a value to
     *            include in the subsequent call that tells the service where to
     *            continue from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimulateCustomPolicyRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
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
    public SimulateCustomPolicyRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getPolicyInputList() != null)
            sb.append("PolicyInputList: " + getPolicyInputList() + ",");
        if (getPermissionsBoundaryPolicyInputList() != null)
            sb.append("PermissionsBoundaryPolicyInputList: "
                    + getPermissionsBoundaryPolicyInputList() + ",");
        if (getActionNames() != null)
            sb.append("ActionNames: " + getActionNames() + ",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: " + getResourceArns() + ",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: " + getResourcePolicy() + ",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: " + getResourceOwner() + ",");
        if (getCallerArn() != null)
            sb.append("CallerArn: " + getCallerArn() + ",");
        if (getContextEntries() != null)
            sb.append("ContextEntries: " + getContextEntries() + ",");
        if (getResourceHandlingOption() != null)
            sb.append("ResourceHandlingOption: " + getResourceHandlingOption() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyInputList() == null) ? 0 : getPolicyInputList().hashCode());
        hashCode = prime
                * hashCode
                + ((getPermissionsBoundaryPolicyInputList() == null) ? 0
                        : getPermissionsBoundaryPolicyInputList().hashCode());
        hashCode = prime * hashCode
                + ((getActionNames() == null) ? 0 : getActionNames().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode
                + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getCallerArn() == null) ? 0 : getCallerArn().hashCode());
        hashCode = prime * hashCode
                + ((getContextEntries() == null) ? 0 : getContextEntries().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceHandlingOption() == null) ? 0 : getResourceHandlingOption()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulateCustomPolicyRequest == false)
            return false;
        SimulateCustomPolicyRequest other = (SimulateCustomPolicyRequest) obj;

        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null)
            return false;
        if (other.getPolicyInputList() != null
                && other.getPolicyInputList().equals(this.getPolicyInputList()) == false)
            return false;
        if (other.getPermissionsBoundaryPolicyInputList() == null
                ^ this.getPermissionsBoundaryPolicyInputList() == null)
            return false;
        if (other.getPermissionsBoundaryPolicyInputList() != null
                && other.getPermissionsBoundaryPolicyInputList().equals(
                        this.getPermissionsBoundaryPolicyInputList()) == false)
            return false;
        if (other.getActionNames() == null ^ this.getActionNames() == null)
            return false;
        if (other.getActionNames() != null
                && other.getActionNames().equals(this.getActionNames()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null
                && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null
                && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null
                && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getCallerArn() == null ^ this.getCallerArn() == null)
            return false;
        if (other.getCallerArn() != null
                && other.getCallerArn().equals(this.getCallerArn()) == false)
            return false;
        if (other.getContextEntries() == null ^ this.getContextEntries() == null)
            return false;
        if (other.getContextEntries() != null
                && other.getContextEntries().equals(this.getContextEntries()) == false)
            return false;
        if (other.getResourceHandlingOption() == null ^ this.getResourceHandlingOption() == null)
            return false;
        if (other.getResourceHandlingOption() != null
                && other.getResourceHandlingOption().equals(this.getResourceHandlingOption()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
