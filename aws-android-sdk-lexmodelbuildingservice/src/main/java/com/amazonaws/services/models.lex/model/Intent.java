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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

/**
 * <p>
 * Identifies the specific version of an intent.
 * </p>
 */
public class Intent implements Serializable {
    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String intentName;

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String intentVersion;

    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the intent.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param intentName <p>
     *            The name of the intent.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param intentName <p>
     *            The name of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Intent withIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the intent.
     *         </p>
     */
    public String getIntentVersion() {
        return intentVersion;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param intentVersion <p>
     *            The version of the intent.
     *            </p>
     */
    public void setIntentVersion(String intentVersion) {
        this.intentVersion = intentVersion;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param intentVersion <p>
     *            The version of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Intent withIntentVersion(String intentVersion) {
        this.intentVersion = intentVersion;
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
        if (getIntentName() != null)
            sb.append("intentName: " + getIntentName() + ",");
        if (getIntentVersion() != null)
            sb.append("intentVersion: " + getIntentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode
                + ((getIntentVersion() == null) ? 0 : getIntentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Intent == false)
            return false;
        Intent other = (Intent) obj;

        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null
                && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getIntentVersion() == null ^ this.getIntentVersion() == null)
            return false;
        if (other.getIntentVersion() != null
                && other.getIntentVersion().equals(this.getIntentVersion()) == false)
            return false;
        return true;
    }
}
