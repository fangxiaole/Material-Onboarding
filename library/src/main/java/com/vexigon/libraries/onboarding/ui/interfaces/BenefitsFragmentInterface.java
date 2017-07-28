package com.vexigon.libraries.onboarding.ui.interfaces;

/*
 * Copyright 2017 Vexigon, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by Andrew Quebe on 3/2/2017.
 */

public interface BenefitsFragmentInterface {
    String getTitleText(int position);

    String getSubtitleText(int position);

    String getButtonText(int position);

    int getIllustrationResource(int position);

    String getBackgroundColor(int position);

    void setButtonVisible(int position);

    int getBackgroundResource(int position);

    int getButtonBackroundRes(int position);
}
