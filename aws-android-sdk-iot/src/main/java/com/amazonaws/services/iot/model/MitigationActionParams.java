/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The set of parameters for this mitigation action. You can specify only one
 * type of parameter (in other words, you can apply only one action for each
 * defined mitigation action).
 * </p>
 */
public class MitigationActionParams implements Serializable {
    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the
     * device certificate to inactive.
     * </p>
     */
    private UpdateDeviceCertificateParams updateDeviceCertificateParams;

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA
     * certificate to inactive.
     * </p>
     */
    private UpdateCACertificateParams updateCACertificateParams;

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated
     * with a certificate to one or more specified thing groups, typically for
     * quarantine.
     * </p>
     */
    private AddThingsToThingGroupParams addThingsToThingGroupParams;

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to
     * restrict permissions.
     * </p>
     */
    private ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams;

    /**
     * <p>
     * Parameters to define a mitigation action that enables Amazon Web Services
     * IoT Core logging at a specified level of detail.
     * </p>
     */
    private EnableIoTLoggingParams enableIoTLoggingParams;

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to
     * Amazon Simple Notification Service (Amazon SNS. You can implement your
     * own custom actions in response to the Amazon SNS messages.
     * </p>
     */
    private PublishFindingToSnsParams publishFindingToSnsParams;

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the
     * device certificate to inactive.
     * </p>
     *
     * @return <p>
     *         Parameters to define a mitigation action that changes the state
     *         of the device certificate to inactive.
     *         </p>
     */
    public UpdateDeviceCertificateParams getUpdateDeviceCertificateParams() {
        return updateDeviceCertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the
     * device certificate to inactive.
     * </p>
     *
     * @param updateDeviceCertificateParams <p>
     *            Parameters to define a mitigation action that changes the
     *            state of the device certificate to inactive.
     *            </p>
     */
    public void setUpdateDeviceCertificateParams(
            UpdateDeviceCertificateParams updateDeviceCertificateParams) {
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the
     * device certificate to inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDeviceCertificateParams <p>
     *            Parameters to define a mitigation action that changes the
     *            state of the device certificate to inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionParams withUpdateDeviceCertificateParams(
            UpdateDeviceCertificateParams updateDeviceCertificateParams) {
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA
     * certificate to inactive.
     * </p>
     *
     * @return <p>
     *         Parameters to define a mitigation action that changes the state
     *         of the CA certificate to inactive.
     *         </p>
     */
    public UpdateCACertificateParams getUpdateCACertificateParams() {
        return updateCACertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA
     * certificate to inactive.
     * </p>
     *
     * @param updateCACertificateParams <p>
     *            Parameters to define a mitigation action that changes the
     *            state of the CA certificate to inactive.
     *            </p>
     */
    public void setUpdateCACertificateParams(UpdateCACertificateParams updateCACertificateParams) {
        this.updateCACertificateParams = updateCACertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA
     * certificate to inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateCACertificateParams <p>
     *            Parameters to define a mitigation action that changes the
     *            state of the CA certificate to inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionParams withUpdateCACertificateParams(
            UpdateCACertificateParams updateCACertificateParams) {
        this.updateCACertificateParams = updateCACertificateParams;
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated
     * with a certificate to one or more specified thing groups, typically for
     * quarantine.
     * </p>
     *
     * @return <p>
     *         Parameters to define a mitigation action that moves devices
     *         associated with a certificate to one or more specified thing
     *         groups, typically for quarantine.
     *         </p>
     */
    public AddThingsToThingGroupParams getAddThingsToThingGroupParams() {
        return addThingsToThingGroupParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated
     * with a certificate to one or more specified thing groups, typically for
     * quarantine.
     * </p>
     *
     * @param addThingsToThingGroupParams <p>
     *            Parameters to define a mitigation action that moves devices
     *            associated with a certificate to one or more specified thing
     *            groups, typically for quarantine.
     *            </p>
     */
    public void setAddThingsToThingGroupParams(
            AddThingsToThingGroupParams addThingsToThingGroupParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated
     * with a certificate to one or more specified thing groups, typically for
     * quarantine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addThingsToThingGroupParams <p>
     *            Parameters to define a mitigation action that moves devices
     *            associated with a certificate to one or more specified thing
     *            groups, typically for quarantine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionParams withAddThingsToThingGroupParams(
            AddThingsToThingGroupParams addThingsToThingGroupParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to
     * restrict permissions.
     * </p>
     *
     * @return <p>
     *         Parameters to define a mitigation action that adds a blank policy
     *         to restrict permissions.
     *         </p>
     */
    public ReplaceDefaultPolicyVersionParams getReplaceDefaultPolicyVersionParams() {
        return replaceDefaultPolicyVersionParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to
     * restrict permissions.
     * </p>
     *
     * @param replaceDefaultPolicyVersionParams <p>
     *            Parameters to define a mitigation action that adds a blank
     *            policy to restrict permissions.
     *            </p>
     */
    public void setReplaceDefaultPolicyVersionParams(
            ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams) {
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to
     * restrict permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceDefaultPolicyVersionParams <p>
     *            Parameters to define a mitigation action that adds a blank
     *            policy to restrict permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionParams withReplaceDefaultPolicyVersionParams(
            ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams) {
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that enables Amazon Web Services
     * IoT Core logging at a specified level of detail.
     * </p>
     *
     * @return <p>
     *         Parameters to define a mitigation action that enables Amazon Web
     *         Services IoT Core logging at a specified level of detail.
     *         </p>
     */
    public EnableIoTLoggingParams getEnableIoTLoggingParams() {
        return enableIoTLoggingParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that enables Amazon Web Services
     * IoT Core logging at a specified level of detail.
     * </p>
     *
     * @param enableIoTLoggingParams <p>
     *            Parameters to define a mitigation action that enables Amazon
     *            Web Services IoT Core logging at a specified level of detail.
     *            </p>
     */
    public void setEnableIoTLoggingParams(EnableIoTLoggingParams enableIoTLoggingParams) {
        this.enableIoTLoggingParams = enableIoTLoggingParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that enables Amazon Web Services
     * IoT Core logging at a specified level of detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableIoTLoggingParams <p>
     *            Parameters to define a mitigation action that enables Amazon
     *            Web Services IoT Core logging at a specified level of detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionParams withEnableIoTLoggingParams(
            EnableIoTLoggingParams enableIoTLoggingParams) {
        this.enableIoTLoggingParams = enableIoTLoggingParams;
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to
     * Amazon Simple Notification Service (Amazon SNS. You can implement your
     * own custom actions in response to the Amazon SNS messages.
     * </p>
     *
     * @return <p>
     *         Parameters to define a mitigation action that publishes findings
     *         to Amazon Simple Notification Service (Amazon SNS. You can
     *         implement your own custom actions in response to the Amazon SNS
     *         messages.
     *         </p>
     */
    public PublishFindingToSnsParams getPublishFindingToSnsParams() {
        return publishFindingToSnsParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to
     * Amazon Simple Notification Service (Amazon SNS. You can implement your
     * own custom actions in response to the Amazon SNS messages.
     * </p>
     *
     * @param publishFindingToSnsParams <p>
     *            Parameters to define a mitigation action that publishes
     *            findings to Amazon Simple Notification Service (Amazon SNS.
     *            You can implement your own custom actions in response to the
     *            Amazon SNS messages.
     *            </p>
     */
    public void setPublishFindingToSnsParams(PublishFindingToSnsParams publishFindingToSnsParams) {
        this.publishFindingToSnsParams = publishFindingToSnsParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to
     * Amazon Simple Notification Service (Amazon SNS. You can implement your
     * own custom actions in response to the Amazon SNS messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publishFindingToSnsParams <p>
     *            Parameters to define a mitigation action that publishes
     *            findings to Amazon Simple Notification Service (Amazon SNS.
     *            You can implement your own custom actions in response to the
     *            Amazon SNS messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MitigationActionParams withPublishFindingToSnsParams(
            PublishFindingToSnsParams publishFindingToSnsParams) {
        this.publishFindingToSnsParams = publishFindingToSnsParams;
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
        if (getUpdateDeviceCertificateParams() != null)
            sb.append("updateDeviceCertificateParams: " + getUpdateDeviceCertificateParams() + ",");
        if (getUpdateCACertificateParams() != null)
            sb.append("updateCACertificateParams: " + getUpdateCACertificateParams() + ",");
        if (getAddThingsToThingGroupParams() != null)
            sb.append("addThingsToThingGroupParams: " + getAddThingsToThingGroupParams() + ",");
        if (getReplaceDefaultPolicyVersionParams() != null)
            sb.append("replaceDefaultPolicyVersionParams: "
                    + getReplaceDefaultPolicyVersionParams() + ",");
        if (getEnableIoTLoggingParams() != null)
            sb.append("enableIoTLoggingParams: " + getEnableIoTLoggingParams() + ",");
        if (getPublishFindingToSnsParams() != null)
            sb.append("publishFindingToSnsParams: " + getPublishFindingToSnsParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getUpdateDeviceCertificateParams() == null) ? 0
                        : getUpdateDeviceCertificateParams().hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateCACertificateParams() == null) ? 0 : getUpdateCACertificateParams()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAddThingsToThingGroupParams() == null) ? 0
                        : getAddThingsToThingGroupParams().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplaceDefaultPolicyVersionParams() == null) ? 0
                        : getReplaceDefaultPolicyVersionParams().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableIoTLoggingParams() == null) ? 0 : getEnableIoTLoggingParams()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPublishFindingToSnsParams() == null) ? 0 : getPublishFindingToSnsParams()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MitigationActionParams == false)
            return false;
        MitigationActionParams other = (MitigationActionParams) obj;

        if (other.getUpdateDeviceCertificateParams() == null
                ^ this.getUpdateDeviceCertificateParams() == null)
            return false;
        if (other.getUpdateDeviceCertificateParams() != null
                && other.getUpdateDeviceCertificateParams().equals(
                        this.getUpdateDeviceCertificateParams()) == false)
            return false;
        if (other.getUpdateCACertificateParams() == null
                ^ this.getUpdateCACertificateParams() == null)
            return false;
        if (other.getUpdateCACertificateParams() != null
                && other.getUpdateCACertificateParams().equals(this.getUpdateCACertificateParams()) == false)
            return false;
        if (other.getAddThingsToThingGroupParams() == null
                ^ this.getAddThingsToThingGroupParams() == null)
            return false;
        if (other.getAddThingsToThingGroupParams() != null
                && other.getAddThingsToThingGroupParams().equals(
                        this.getAddThingsToThingGroupParams()) == false)
            return false;
        if (other.getReplaceDefaultPolicyVersionParams() == null
                ^ this.getReplaceDefaultPolicyVersionParams() == null)
            return false;
        if (other.getReplaceDefaultPolicyVersionParams() != null
                && other.getReplaceDefaultPolicyVersionParams().equals(
                        this.getReplaceDefaultPolicyVersionParams()) == false)
            return false;
        if (other.getEnableIoTLoggingParams() == null ^ this.getEnableIoTLoggingParams() == null)
            return false;
        if (other.getEnableIoTLoggingParams() != null
                && other.getEnableIoTLoggingParams().equals(this.getEnableIoTLoggingParams()) == false)
            return false;
        if (other.getPublishFindingToSnsParams() == null
                ^ this.getPublishFindingToSnsParams() == null)
            return false;
        if (other.getPublishFindingToSnsParams() != null
                && other.getPublishFindingToSnsParams().equals(this.getPublishFindingToSnsParams()) == false)
            return false;
        return true;
    }
}
