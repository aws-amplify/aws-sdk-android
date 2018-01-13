/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad;

import com.amazon.blueshift.bluefront.android.vad.AbstractVAD;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.config.DnnVADConfig;
import com.google.common.base.Preconditions;

import java.nio.ByteBuffer;

/**
 * DNN VAD library.
 */
public class DnnVAD extends AbstractVAD<DnnVADConfig> {

    /**
     * Create a DNN VAD with the sample rate and configuration.
     *
     * @param sampleRate audio sample rate.
     * @param vadConfig DNN specific configuration.
     */
    public DnnVAD(final int sampleRate, final DnnVADConfig vadConfig) {
        super(sampleRate, vadConfig);
    }

    @Override
    protected ByteBuffer setupVAD(final DnnVADConfig vadConfig) {
        Preconditions.checkNotNull(vadConfig, "DnnVadConfig cannot be null.");

        final ByteBuffer vad = createVAD(true);
        if (vadConfig.getThreshold().isPresent()) {
            setDNNThreshold(vad, vadConfig.getThreshold().get().floatValue());
        }

        return vad;
    }
}
