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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the name and metadata of an <code>AppInstanceBot</code>.
 * </p>
 */
public class UpdateAppInstanceBotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceBotArn;

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String name;

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String metadata;

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     */
    private Configuration configuration;

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstanceBot</code>.
     *         </p>
     */
    public String getAppInstanceBotArn() {
        return appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceBotArn <p>
     *            The ARN of the <code>AppInstanceBot</code>.
     *            </p>
     */
    public void setAppInstanceBotArn(String appInstanceBotArn) {
        this.appInstanceBotArn = appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceBotArn <p>
     *            The ARN of the <code>AppInstanceBot</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceBotRequest withAppInstanceBotArn(String appInstanceBotArn) {
        this.appInstanceBotArn = appInstanceBotArn;
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the <code>AppInstanceBot</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the <code>AppInstanceBot</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the <code>AppInstanceBot</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceBotRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The metadata of the <code>AppInstanceBot</code>.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The metadata of the <code>AppInstanceBot</code>.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The metadata of the <code>AppInstanceBot</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceBotRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     *
     * @return <p>
     *         The configuration for the bot update.
     *         </p>
     */
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     *
     * @param configuration <p>
     *            The configuration for the bot update.
     *            </p>
     */
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            The configuration for the bot update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceBotRequest withConfiguration(Configuration configuration) {
        this.configuration = configuration;
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
        if (getAppInstanceBotArn() != null)
            sb.append("AppInstanceBotArn: " + getAppInstanceBotArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceBotArn() == null) ? 0 : getAppInstanceBotArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppInstanceBotRequest == false)
            return false;
        UpdateAppInstanceBotRequest other = (UpdateAppInstanceBotRequest) obj;

        if (other.getAppInstanceBotArn() == null ^ this.getAppInstanceBotArn() == null)
            return false;
        if (other.getAppInstanceBotArn() != null
                && other.getAppInstanceBotArn().equals(this.getAppInstanceBotArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }
}
