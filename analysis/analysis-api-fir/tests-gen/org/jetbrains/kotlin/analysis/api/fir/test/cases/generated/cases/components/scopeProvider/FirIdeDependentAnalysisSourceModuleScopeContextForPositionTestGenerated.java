/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.scopeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.scopeProvider.AbstractScopeContextForPositionTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleScopeContextForPositionTestGenerated extends AbstractScopeContextForPositionTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Dependent,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInScopeContextForPosition() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationWithoutDeclaration.kt")
    public void testAnnotationWithoutDeclaration() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/annotationWithoutDeclaration.kt");
    }

    @Test
    @TestMetadata("contextReceiver.kt")
    public void testContextReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/contextReceiver.kt");
    }

    @Test
    @TestMetadata("contextReceiverWithoutDeclaration.kt")
    public void testContextReceiverWithoutDeclaration() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/contextReceiverWithoutDeclaration.kt");
    }

    @Test
    @TestMetadata("emptyContextForPositionInImportDirective.kt")
    public void testEmptyContextForPositionInImportDirective() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/emptyContextForPositionInImportDirective.kt");
    }

    @Test
    @TestMetadata("emptyContextForPositionInPackageDirective.kt")
    public void testEmptyContextForPositionInPackageDirective() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/emptyContextForPositionInPackageDirective.kt");
    }

    @Test
    @TestMetadata("enumEntry.kt")
    public void testEnumEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/enumEntry.kt");
    }

    @Test
    @TestMetadata("errorType.kt")
    public void testErrorType() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/errorType.kt");
    }

    @Test
    @TestMetadata("kDocWithoutDeclaration.kt")
    public void testKDocWithoutDeclaration() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/kDocWithoutDeclaration.kt");
    }

    @Test
    @TestMetadata("localTypeScope.kt")
    public void testLocalTypeScope() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/localTypeScope.kt");
    }

    @Test
    @TestMetadata("notEnabledKotlinPackage.kt")
    public void testNotEnabledKotlinPackage() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/notEnabledKotlinPackage.kt");
    }

    @Test
    @TestMetadata("simpleScopeContextForPosition.kt")
    public void testSimpleScopeContextForPosition() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/simpleScopeContextForPosition.kt");
    }

    @Test
    @TestMetadata("smartCastInAnonymousFunction.kt")
    public void testSmartCastInAnonymousFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/smartCastInAnonymousFunction.kt");
    }

    @Test
    @TestMetadata("smartCastInAnonymousFunctionInWhenEntry.kt")
    public void testSmartCastInAnonymousFunctionInWhenEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/smartCastInAnonymousFunctionInWhenEntry.kt");
    }

    @Test
    @TestMetadata("smartCastInWhenEntryCondition.kt")
    public void testSmartCastInWhenEntryCondition() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/smartCastInWhenEntryCondition.kt");
    }

    @Test
    @TestMetadata("syntheticPropertiesScope.kt")
    public void testSyntheticPropertiesScope() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/scopeContextForPosition/syntheticPropertiesScope.kt");
    }
}
