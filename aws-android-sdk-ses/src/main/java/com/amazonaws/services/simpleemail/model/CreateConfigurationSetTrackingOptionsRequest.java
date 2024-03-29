/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates an association between a configuration set and a custom domain for
 * open and click event tracking.
 * </p>
 * <p>
 * By default, images and links used for tracking open and click events are
 * hosted on domains operated by Amazon SES. You can configure a subdomain of
 * your own to handle these events. For information about using custom domains,
 * see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class CreateConfigurationSetTrackingOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the configuration set that the tracking options should be
     * associated with.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * A domain that is used to redirect email recipients to an Amazon
     * SES-operated domain. This domain captures open and click events generated
     * by Amazon SES emails.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Configuring Custom Domains to Handle Open and Click Tracking</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     */
    private TrackingOptions trackingOptions;

    /**
     * <p>
     * The name of the configuration set that the tracking options should be
     * associated with.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set that the tracking options
     *         should be associated with.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that the tracking options should be
     * associated with.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set that the tracking options
     *            should be associated with.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that the tracking options should be
     * associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set that the tracking options
     *            should be associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationSetTrackingOptionsRequest withConfigurationSetName(
            String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * A domain that is used to redirect email recipients to an Amazon
     * SES-operated domain. This domain captures open and click events generated
     * by Amazon SES emails.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Configuring Custom Domains to Handle Open and Click Tracking</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A domain that is used to redirect email recipients to an Amazon
     *         SES-operated domain. This domain captures open and click events
     *         generated by Amazon SES emails.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     *         >Configuring Custom Domains to Handle Open and Click Tracking</a>
     *         in the <i>Amazon SES Developer Guide</i>.
     *         </p>
     */
    public TrackingOptions getTrackingOptions() {
        return trackingOptions;
    }

    /**
     * <p>
     * A domain that is used to redirect email recipients to an Amazon
     * SES-operated domain. This domain captures open and click events generated
     * by Amazon SES emails.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Configuring Custom Domains to Handle Open and Click Tracking</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     *
     * @param trackingOptions <p>
     *            A domain that is used to redirect email recipients to an
     *            Amazon SES-operated domain. This domain captures open and
     *            click events generated by Amazon SES emails.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     *            >Configuring Custom Domains to Handle Open and Click
     *            Tracking</a> in the <i>Amazon SES Developer Guide</i>.
     *            </p>
     */
    public void setTrackingOptions(TrackingOptions trackingOptions) {
        this.trackingOptions = trackingOptions;
    }

    /**
     * <p>
     * A domain that is used to redirect email recipients to an Amazon
     * SES-operated domain. This domain captures open and click events generated
     * by Amazon SES emails.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Configuring Custom Domains to Handle Open and Click Tracking</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackingOptions <p>
     *            A domain that is used to redirect email recipients to an
     *            Amazon SES-operated domain. This domain captures open and
     *            click events generated by Amazon SES emails.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     *            >Configuring Custom Domains to Handle Open and Click
     *            Tracking</a> in the <i>Amazon SES Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationSetTrackingOptionsRequest withTrackingOptions(
            TrackingOptions trackingOptions) {
        this.trackingOptions = trackingOptions;
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
            sb.append("ConfigurationSetName: " + getConfigurationSetName() + ",");
        if (getTrackingOptions() != null)
            sb.append("TrackingOptions: " + getTrackingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode
                + ((getTrackingOptions() == null) ? 0 : getTrackingOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationSetTrackingOptionsRequest == false)
            return false;
        CreateConfigurationSetTrackingOptionsRequest other = (CreateConfigurationSetTrackingOptionsRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getTrackingOptions() == null ^ this.getTrackingOptions() == null)
            return false;
        if (other.getTrackingOptions() != null
                && other.getTrackingOptions().equals(this.getTrackingOptions()) == false)
            return false;
        return true;
    }
}
