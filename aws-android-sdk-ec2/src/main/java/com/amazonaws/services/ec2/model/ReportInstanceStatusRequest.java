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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Submits feedback about the status of an instance. The instance must be in the
 * <code>running</code> state. If your experience with the instance differs from
 * the instance status returned by <a>DescribeInstanceStatus</a>, use
 * <a>ReportInstanceStatus</a> to report your experience with the instance.
 * Amazon EC2 collects this information to improve the accuracy of status
 * checks.
 * </p>
 * <p>
 * Use of this action does not change the value returned by
 * <a>DescribeInstanceStatus</a>.
 * </p>
 */
public class ReportInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The instances.
     * </p>
     */
    private java.util.List<String> instances;

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my
     * credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance
     * problems that I believe are network related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing
     * performance problems that I believe are related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing
     * performance problems that I believe are related to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance
     * problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> reasonCodes;

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     */
    private String status;

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     *
     * @return <p>
     *         Descriptive text about the health state of your instance.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     *
     * @param description <p>
     *            Descriptive text about the health state of your instance.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            Descriptive text about the health state of your instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     *
     * @return <p>
     *         The time at which the reported instance health state ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     *
     * @param endTime <p>
     *            The time at which the reported instance health state ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time at which the reported instance health state ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     *
     * @return <p>
     *         The instances.
     *         </p>
     */
    public java.util.List<String> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The instances.
     * </p>
     *
     * @param instances <p>
     *            The instances.
     *            </p>
     */
    public void setInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<String>(instances);
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withInstances(String... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<String>(instances.length);
        }
        for (String value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withInstances(java.util.Collection<String> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my
     * credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance
     * problems that I believe are network related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing
     * performance problems that I believe are related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing
     * performance problems that I believe are related to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance
     * problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The reason codes that describe the health state of your instance.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-stuck-in-state</code>: My instance is stuck in a
     *         state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unresponsive</code>: My instance is unresponsive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>not-accepting-credentials</code>: My instance is not
     *         accepting my credentials.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>password-not-available</code>: A password is not available
     *         for my instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-network</code>: My instance is experiencing
     *         performance problems that I believe are network related.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-instance-store</code>: My instance is
     *         experiencing performance problems that I believe are related to
     *         the instance stores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-ebs-volume</code>: My instance is experiencing
     *         performance problems that I believe are related to an EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-other</code>: My instance is experiencing
     *         performance problems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>other</code>: [explain using the description parameter]
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getReasonCodes() {
        return reasonCodes;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my
     * credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance
     * problems that I believe are network related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing
     * performance problems that I believe are related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing
     * performance problems that I believe are related to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance
     * problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     *
     * @param reasonCodes <p>
     *            The reason codes that describe the health state of your
     *            instance.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-stuck-in-state</code>: My instance is stuck in
     *            a state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unresponsive</code>: My instance is unresponsive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>not-accepting-credentials</code>: My instance is not
     *            accepting my credentials.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>password-not-available</code>: A password is not
     *            available for my instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-network</code>: My instance is experiencing
     *            performance problems that I believe are network related.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-instance-store</code>: My instance is
     *            experiencing performance problems that I believe are related
     *            to the instance stores.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-ebs-volume</code>: My instance is
     *            experiencing performance problems that I believe are related
     *            to an EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-other</code>: My instance is experiencing
     *            performance problems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>other</code>: [explain using the description parameter]
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setReasonCodes(java.util.Collection<String> reasonCodes) {
        if (reasonCodes == null) {
            this.reasonCodes = null;
            return;
        }

        this.reasonCodes = new java.util.ArrayList<String>(reasonCodes);
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my
     * credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance
     * problems that I believe are network related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing
     * performance problems that I believe are related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing
     * performance problems that I believe are related to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance
     * problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasonCodes <p>
     *            The reason codes that describe the health state of your
     *            instance.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-stuck-in-state</code>: My instance is stuck in
     *            a state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unresponsive</code>: My instance is unresponsive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>not-accepting-credentials</code>: My instance is not
     *            accepting my credentials.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>password-not-available</code>: A password is not
     *            available for my instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-network</code>: My instance is experiencing
     *            performance problems that I believe are network related.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-instance-store</code>: My instance is
     *            experiencing performance problems that I believe are related
     *            to the instance stores.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-ebs-volume</code>: My instance is
     *            experiencing performance problems that I believe are related
     *            to an EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-other</code>: My instance is experiencing
     *            performance problems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>other</code>: [explain using the description parameter]
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withReasonCodes(String... reasonCodes) {
        if (getReasonCodes() == null) {
            this.reasonCodes = new java.util.ArrayList<String>(reasonCodes.length);
        }
        for (String value : reasonCodes) {
            this.reasonCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my
     * credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance
     * problems that I believe are network related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing
     * performance problems that I believe are related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing
     * performance problems that I believe are related to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance
     * problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasonCodes <p>
     *            The reason codes that describe the health state of your
     *            instance.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-stuck-in-state</code>: My instance is stuck in
     *            a state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unresponsive</code>: My instance is unresponsive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>not-accepting-credentials</code>: My instance is not
     *            accepting my credentials.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>password-not-available</code>: A password is not
     *            available for my instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-network</code>: My instance is experiencing
     *            performance problems that I believe are network related.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-instance-store</code>: My instance is
     *            experiencing performance problems that I believe are related
     *            to the instance stores.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-ebs-volume</code>: My instance is
     *            experiencing performance problems that I believe are related
     *            to an EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>performance-other</code>: My instance is experiencing
     *            performance problems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>other</code>: [explain using the description parameter]
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withReasonCodes(java.util.Collection<String> reasonCodes) {
        setReasonCodes(reasonCodes);
        return this;
    }

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     *
     * @return <p>
     *         The time at which the reported instance health state began.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     *
     * @param startTime <p>
     *            The time at which the reported instance health state began.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time at which the reported instance health state began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportInstanceStatusRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @return <p>
     *         The status of all instances listed.
     *         </p>
     * @see ReportStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status <p>
     *            The status of all instances listed.
     *            </p>
     * @see ReportStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status <p>
     *            The status of all instances listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportStatusType
     */
    public ReportInstanceStatusRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status <p>
     *            The status of all instances listed.
     *            </p>
     * @see ReportStatusType
     */
    public void setStatus(ReportStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status <p>
     *            The status of all instances listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportStatusType
     */
    public ReportInstanceStatusRequest withStatus(ReportStatusType status) {
        this.status = status.toString();
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getReasonCodes() != null)
            sb.append("ReasonCodes: " + getReasonCodes() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode
                + ((getReasonCodes() == null) ? 0 : getReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportInstanceStatusRequest == false)
            return false;
        ReportInstanceStatusRequest other = (ReportInstanceStatusRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getReasonCodes() == null ^ this.getReasonCodes() == null)
            return false;
        if (other.getReasonCodes() != null
                && other.getReasonCodes().equals(this.getReasonCodes()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
