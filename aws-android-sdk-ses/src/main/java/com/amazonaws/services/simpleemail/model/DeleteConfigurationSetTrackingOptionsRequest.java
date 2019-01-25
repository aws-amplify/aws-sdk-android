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
 * Deletes an association between a configuration set and a custom domain for
 * open and click event tracking.
 * </p>
 * <p>
 * By default, images and links used for tracking open and click events are
 * hosted on domains operated by Amazon SES. You can configure a subdomain of
 * your own to handle these events. For information about using custom domains,
 * see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * Deleting this kind of association will result in emails sent using the
 * specified configuration set to capture open and click events using the
 * standard, Amazon SES-operated domains.
 * </p>
 * </note>
 */
public class DeleteConfigurationSetTrackingOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the configuration set from which you want to delete the
     * tracking options.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The name of the configuration set from which you want to delete the
     * tracking options.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set from which you want to delete
     *         the tracking options.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set from which you want to delete the
     * tracking options.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set from which you want to
     *            delete the tracking options.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set from which you want to delete the
     * tracking options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set from which you want to
     *            delete the tracking options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConfigurationSetTrackingOptionsRequest withConfigurationSetName(
            String configurationSetName) {
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

        if (obj instanceof DeleteConfigurationSetTrackingOptionsRequest == false)
            return false;
        DeleteConfigurationSetTrackingOptionsRequest other = (DeleteConfigurationSetTrackingOptionsRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }
}
