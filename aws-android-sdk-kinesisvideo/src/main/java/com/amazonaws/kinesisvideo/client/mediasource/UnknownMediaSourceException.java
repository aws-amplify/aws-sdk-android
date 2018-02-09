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

package com.amazonaws.kinesisvideo.client.mediasource;

/**
 * Thrown when trying to create the media source of type unknown to the MediaSourceService.
 */
public class UnknownMediaSourceException extends RuntimeException {

    public UnknownMediaSourceException(final String mediaSourceType) {
        super("Unknown media source type '" + mediaSourceType
                + "'. Cannot create instance from the configuration");
    }
}
