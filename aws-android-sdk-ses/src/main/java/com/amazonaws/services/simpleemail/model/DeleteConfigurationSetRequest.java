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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a configuration set. Configuration sets enable you to publish email
 * sending events. For information about using configuration sets, see the <a
 * href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class DeleteConfigurationSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the configuration set to delete.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The name of the configuration set to delete.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set to delete.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to delete.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to delete.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConfigurationSetRequest withConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfigurationSetRequest == false)
            return false;
        DeleteConfigurationSetRequest other = (DeleteConfigurationSetRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }
}
