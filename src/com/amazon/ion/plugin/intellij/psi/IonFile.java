/*
 * Copyright 2015-[2016] Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. A copy of the License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */

package com.amazon.ion.plugin.intellij.psi;

import com.amazon.ion.plugin.intellij.IonFileType;
import com.amazon.ion.plugin.intellij.IonLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * A representation of an ion file.
 */
public class IonFile extends PsiFileBase {
    public IonFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, IonLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return IonFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ion File";
    }


}

