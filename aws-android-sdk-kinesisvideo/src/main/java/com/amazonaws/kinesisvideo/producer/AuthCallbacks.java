/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

import android.support.annotation.Nullable;

/**
 *
 * Interface to the Kinesis Video Streams Producer Authentication Callbacks functionality.
 *
 * These will be used to integrate with the Auth
 *
 *
 */
public interface AuthCallbacks
{
    /**
     * Returns the device certificate.
     * Null if not integrated through certificates.
     * @return Device certificate bits
     */
    @Nullable
    AuthInfo getDeviceCertificate();

    /**
     * Returns the device security token.
     * Null if not integrated through security tokens.
     * @return Device security token
     */
    @Nullable
    AuthInfo getSecurityToken();

    /**
     * Returns the device fingerprint uniquely identifying the device.
     * Null if no provisioning is allowed for the device in which case
     * the device should be integrated with either the Certificate
     * model or with the Security token model.
     * @return Device unique fingerprint.
     */
    @Nullable
    String getDeviceFingerprint();

}
