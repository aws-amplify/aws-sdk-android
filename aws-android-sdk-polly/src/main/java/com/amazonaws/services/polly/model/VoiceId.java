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

package com.amazonaws.services.polly.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Voice Id
 */
public enum VoiceId {

    Geraint("Geraint"),
    Gwyneth("Gwyneth"),
    Mads("Mads"),
    Naja("Naja"),
    Hans("Hans"),
    Marlene("Marlene"),
    Nicole("Nicole"),
    Russell("Russell"),
    Amy("Amy"),
    Brian("Brian"),
    Emma("Emma"),
    Raveena("Raveena"),
    Ivy("Ivy"),
    Joanna("Joanna"),
    Joey("Joey"),
    Justin("Justin"),
    Kendra("Kendra"),
    Kimberly("Kimberly"),
    Matthew("Matthew"),
    Salli("Salli"),
    Conchita("Conchita"),
    Enrique("Enrique"),
    Miguel("Miguel"),
    Penelope("Penelope"),
    Chantal("Chantal"),
    Celine("Celine"),
    Lea("Lea"),
    Mathieu("Mathieu"),
    Dora("Dora"),
    Karl("Karl"),
    Carla("Carla"),
    Giorgio("Giorgio"),
    Mizuki("Mizuki"),
    Liv("Liv"),
    Lotte("Lotte"),
    Ruben("Ruben"),
    Ewa("Ewa"),
    Jacek("Jacek"),
    Jan("Jan"),
    Maja("Maja"),
    Ricardo("Ricardo"),
    Vitoria("Vitoria"),
    Cristiano("Cristiano"),
    Ines("Ines"),
    Carmen("Carmen"),
    Maxim("Maxim"),
    Tatyana("Tatyana"),
    Astrid("Astrid"),
    Filiz("Filiz"),
    Vicki("Vicki"),
    Takumi("Takumi"),
    Seoyeon("Seoyeon"),
    Aditi("Aditi"),
    Zhiyu("Zhiyu"),
    Bianca("Bianca"),
    Lucia("Lucia"),
    Mia("Mia");

    private String value;

    private VoiceId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VoiceId> enumMap;
    static {
        enumMap = new HashMap<String, VoiceId>();
        enumMap.put("Geraint", Geraint);
        enumMap.put("Gwyneth", Gwyneth);
        enumMap.put("Mads", Mads);
        enumMap.put("Naja", Naja);
        enumMap.put("Hans", Hans);
        enumMap.put("Marlene", Marlene);
        enumMap.put("Nicole", Nicole);
        enumMap.put("Russell", Russell);
        enumMap.put("Amy", Amy);
        enumMap.put("Brian", Brian);
        enumMap.put("Emma", Emma);
        enumMap.put("Raveena", Raveena);
        enumMap.put("Ivy", Ivy);
        enumMap.put("Joanna", Joanna);
        enumMap.put("Joey", Joey);
        enumMap.put("Justin", Justin);
        enumMap.put("Kendra", Kendra);
        enumMap.put("Kimberly", Kimberly);
        enumMap.put("Matthew", Matthew);
        enumMap.put("Salli", Salli);
        enumMap.put("Conchita", Conchita);
        enumMap.put("Enrique", Enrique);
        enumMap.put("Miguel", Miguel);
        enumMap.put("Penelope", Penelope);
        enumMap.put("Chantal", Chantal);
        enumMap.put("Celine", Celine);
        enumMap.put("Lea", Lea);
        enumMap.put("Mathieu", Mathieu);
        enumMap.put("Dora", Dora);
        enumMap.put("Karl", Karl);
        enumMap.put("Carla", Carla);
        enumMap.put("Giorgio", Giorgio);
        enumMap.put("Mizuki", Mizuki);
        enumMap.put("Liv", Liv);
        enumMap.put("Lotte", Lotte);
        enumMap.put("Ruben", Ruben);
        enumMap.put("Ewa", Ewa);
        enumMap.put("Jacek", Jacek);
        enumMap.put("Jan", Jan);
        enumMap.put("Maja", Maja);
        enumMap.put("Ricardo", Ricardo);
        enumMap.put("Vitoria", Vitoria);
        enumMap.put("Cristiano", Cristiano);
        enumMap.put("Ines", Ines);
        enumMap.put("Carmen", Carmen);
        enumMap.put("Maxim", Maxim);
        enumMap.put("Tatyana", Tatyana);
        enumMap.put("Astrid", Astrid);
        enumMap.put("Filiz", Filiz);
        enumMap.put("Vicki", Vicki);
        enumMap.put("Takumi", Takumi);
        enumMap.put("Seoyeon", Seoyeon);
        enumMap.put("Aditi", Aditi);
        enumMap.put("Zhiyu", Zhiyu);
        enumMap.put("Bianca", Bianca);
        enumMap.put("Lucia", Lucia);
        enumMap.put("Mia", Mia);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VoiceId corresponding to the value
     */
    public static VoiceId fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
