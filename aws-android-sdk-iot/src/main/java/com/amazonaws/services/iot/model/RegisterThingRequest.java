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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provisions a thing in the device registry. RegisterThing calls other IoT
 * control plane APIs. These calls might exceed your account level <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_iot"
 * > IoT Throttling Limits</a> and cause throttle errors. Please contact <a
 * href="https://console.aws.amazon.com/support/home">Amazon Web Services
 * Customer Support</a> to raise your throttling limits if necessary.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >RegisterThing</a> action.
 * </p>
 */
public class RegisterThingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The provisioning template. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     * >Provisioning Devices That Have Device Certificates</a> for more
     * information.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * The parameters for provisioning a thing. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     * >Provisioning Templates</a> for more information.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The provisioning template. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     * >Provisioning Devices That Have Device Certificates</a> for more
     * information.
     * </p>
     *
     * @return <p>
     *         The provisioning template. See <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     *         >Provisioning Devices That Have Device Certificates</a> for more
     *         information.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * The provisioning template. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     * >Provisioning Devices That Have Device Certificates</a> for more
     * information.
     * </p>
     *
     * @param templateBody <p>
     *            The provisioning template. See <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     *            >Provisioning Devices That Have Device Certificates</a> for
     *            more information.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The provisioning template. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     * >Provisioning Devices That Have Device Certificates</a> for more
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateBody <p>
     *            The provisioning template. See <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/provision-w-cert.html"
     *            >Provisioning Devices That Have Device Certificates</a> for
     *            more information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterThingRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     * >Provisioning Templates</a> for more information.
     * </p>
     *
     * @return <p>
     *         The parameters for provisioning a thing. See <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     *         >Provisioning Templates</a> for more information.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     * >Provisioning Templates</a> for more information.
     * </p>
     *
     * @param parameters <p>
     *            The parameters for provisioning a thing. See <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     *            >Provisioning Templates</a> for more information.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     * >Provisioning Templates</a> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The parameters for provisioning a thing. See <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     *            >Provisioning Templates</a> for more information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterThingRequest withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/provision-template.html"
     * >Provisioning Templates</a> for more information.
     * </p>
     * <p>
     * The method adds a new key-value pair into parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into parameters.
     * @param value The corresponding value of the entry to be added into
     *            parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterThingRequest addparametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RegisterThingRequest clearparametersEntries() {
        this.parameters = null;
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
        if (getTemplateBody() != null)
            sb.append("templateBody: " + getTemplateBody() + ",");
        if (getParameters() != null)
            sb.append("parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterThingRequest == false)
            return false;
        RegisterThingRequest other = (RegisterThingRequest) obj;

        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
