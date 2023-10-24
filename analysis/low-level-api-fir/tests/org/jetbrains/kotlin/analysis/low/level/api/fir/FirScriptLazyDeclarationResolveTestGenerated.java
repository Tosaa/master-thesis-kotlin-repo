/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/lazyResolve")
@TestDataPath("$PROJECT_ROOT")
public class FirScriptLazyDeclarationResolveTestGenerated extends AbstractFirScriptLazyDeclarationResolveTest {
    @Test
    public void testAllFilesPresentInLazyResolve() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
    }

    @Test
    @TestMetadata("annotationArgumentsMixScript.kts")
    public void testAnnotationArgumentsMixScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/annotationArgumentsMixScript.kts");
    }

    @Test
    @TestMetadata("annotationClassWithJavaTargetScript.kts")
    public void testAnnotationClassWithJavaTargetScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/annotationClassWithJavaTargetScript.kts");
    }

    @Test
    @TestMetadata("annotationOnLocalClassScript.kts")
    public void testAnnotationOnLocalClassScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/annotationOnLocalClassScript.kts");
    }

    @Test
    @TestMetadata("annotationParametersScript.kts")
    public void testAnnotationParametersScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/annotationParametersScript.kts");
    }

    @Test
    @TestMetadata("annotationWithTypeArgumentScript.kts")
    public void testAnnotationWithTypeArgumentScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/annotationWithTypeArgumentScript.kts");
    }

    @Test
    @TestMetadata("annotationsScript.kts")
    public void testAnnotationsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/annotationsScript.kts");
    }

    @Test
    @TestMetadata("anonymousFunctionWithAnnotatedParameter2Script.kts")
    public void testAnonymousFunctionWithAnnotatedParameter2Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/anonymousFunctionWithAnnotatedParameter2Script.kts");
    }

    @Test
    @TestMetadata("anonymousFunctionWithAnnotatedParameterOnImplicitTypePhaseScript.kts")
    public void testAnonymousFunctionWithAnnotatedParameterOnImplicitTypePhaseScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/anonymousFunctionWithAnnotatedParameterOnImplicitTypePhaseScript.kts");
    }

    @Test
    @TestMetadata("anonymousFunctionWithAnnotatedParameterScript.kts")
    public void testAnonymousFunctionWithAnnotatedParameterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/anonymousFunctionWithAnnotatedParameterScript.kts");
    }

    @Test
    @TestMetadata("classMembersScript.kts")
    public void testClassMembersScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/classMembersScript.kts");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationOnLocalClassScript.kts")
    public void testCompilerRequiredAnnotationOnLocalClassScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/compilerRequiredAnnotationOnLocalClassScript.kts");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationsOnConstructorPropertyScript.kts")
    public void testCompilerRequiredAnnotationsOnConstructorPropertyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/compilerRequiredAnnotationsOnConstructorPropertyScript.kts");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationsOnConstructorScript.kts")
    public void testCompilerRequiredAnnotationsOnConstructorScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/compilerRequiredAnnotationsOnConstructorScript.kts");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationsOnFunctionScript.kts")
    public void testCompilerRequiredAnnotationsOnFunctionScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/compilerRequiredAnnotationsOnFunctionScript.kts");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationsOnPropertyDelegateScript.kts")
    public void testCompilerRequiredAnnotationsOnPropertyDelegateScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/compilerRequiredAnnotationsOnPropertyDelegateScript.kts");
    }

    @Test
    @TestMetadata("compilerRequiredAnnotationsOnPropertyScript.kts")
    public void testCompilerRequiredAnnotationsOnPropertyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/compilerRequiredAnnotationsOnPropertyScript.kts");
    }

    @Test
    @TestMetadata("complexLocalHierarchyScript.kts")
    public void testComplexLocalHierarchyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/complexLocalHierarchyScript.kts");
    }

    @Test
    @TestMetadata("complexRedeclarationScript.kts")
    public void testComplexRedeclarationScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/complexRedeclarationScript.kts");
    }

    @Test
    @TestMetadata("cyclicHierarchy2Script.kts")
    public void testCyclicHierarchy2Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/cyclicHierarchy2Script.kts");
    }

    @Test
    @TestMetadata("cyclicHierarchy3Script.kts")
    public void testCyclicHierarchy3Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/cyclicHierarchy3Script.kts");
    }

    @Test
    @TestMetadata("cyclicHierarchyScript.kts")
    public void testCyclicHierarchyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/cyclicHierarchyScript.kts");
    }

    @Test
    @TestMetadata("cyclicNestedHierarchy2Script.kts")
    public void testCyclicNestedHierarchy2Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/cyclicNestedHierarchy2Script.kts");
    }

    @Test
    @TestMetadata("cyclicNestedHierarchyScript.kts")
    public void testCyclicNestedHierarchyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/cyclicNestedHierarchyScript.kts");
    }

    @Test
    @TestMetadata("dataClassCopyScript.kts")
    public void testDataClassCopyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/dataClassCopyScript.kts");
    }

    @Test
    @TestMetadata("dataComponent2Script.kts")
    public void testDataComponent2Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/dataComponent2Script.kts");
    }

    @Test
    @TestMetadata("delegateWithImplicitTypeScript.kts")
    public void testDelegateWithImplicitTypeScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/delegateWithImplicitTypeScript.kts");
    }

    @Test
    @TestMetadata("delegatedFieldScript.kts")
    public void testDelegatedFieldScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/delegatedFieldScript.kts");
    }

    @Test
    @TestMetadata("delegatesScript.kts")
    public void testDelegatesScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/delegatesScript.kts");
    }

    @Test
    @TestMetadata("enumEntriesScript.kts")
    public void testEnumEntriesScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/enumEntriesScript.kts");
    }

    @Test
    @TestMetadata("enumEntryScript.kts")
    public void testEnumEntryScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/enumEntryScript.kts");
    }

    @Test
    @TestMetadata("enumValueOfScript.kts")
    public void testEnumValueOfScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/enumValueOfScript.kts");
    }

    @Test
    @TestMetadata("enumValuesScript.kts")
    public void testEnumValuesScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/enumValuesScript.kts");
    }

    @Test
    @TestMetadata("fakeOverrideScript.kts")
    public void testFakeOverrideScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/fakeOverrideScript.kts");
    }

    @Test
    @TestMetadata("fakePrimaryConstructorScript.kts")
    public void testFakePrimaryConstructorScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/fakePrimaryConstructorScript.kts");
    }

    @Test
    @TestMetadata("fileAnnotationsScript.kts")
    public void testFileAnnotationsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/fileAnnotationsScript.kts");
    }

    @Test
    @TestMetadata("fromLocalHierarchyToOuterScript.kts")
    public void testFromLocalHierarchyToOuterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/fromLocalHierarchyToOuterScript.kts");
    }

    @Test
    @TestMetadata("functionWithImplicitTypeAndAnnotationsScript.kts")
    public void testFunctionWithImplicitTypeAndAnnotationsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/functionWithImplicitTypeAndAnnotationsScript.kts");
    }

    @Test
    @TestMetadata("functionWithImplicitTypeAndStringTemplateAsDefaultValueScript.kts")
    public void testFunctionWithImplicitTypeAndStringTemplateAsDefaultValueScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/functionWithImplicitTypeAndStringTemplateAsDefaultValueScript.kts");
    }

    @Test
    @TestMetadata("functionWithParameterScript.kts")
    public void testFunctionWithParameterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/functionWithParameterScript.kts");
    }

    @Test
    @TestMetadata("lambdaAsSAMInterfaceScript.kts")
    public void testLambdaAsSAMInterfaceScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/lambdaAsSAMInterfaceScript.kts");
    }

    @Test
    @TestMetadata("lazyPropertyScript.kts")
    public void testLazyPropertyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/lazyPropertyScript.kts");
    }

    @Test
    @TestMetadata("localConstructorScript.kts")
    public void testLocalConstructorScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localConstructorScript.kts");
    }

    @Test
    @TestMetadata("localFunctionInsideAnnotationCallScript.kts")
    public void testLocalFunctionInsideAnnotationCallScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localFunctionInsideAnnotationCallScript.kts");
    }

    @Test
    @TestMetadata("localFunctionInsideFunctionLiteralScript.kts")
    public void testLocalFunctionInsideFunctionLiteralScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localFunctionInsideFunctionLiteralScript.kts");
    }

    @Test
    @TestMetadata("localFunctionInsideLambdaCallInsideStringTemplateScript.kts")
    public void testLocalFunctionInsideLambdaCallInsideStringTemplateScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localFunctionInsideLambdaCallInsideStringTemplateScript.kts");
    }

    @Test
    @TestMetadata("localFunctionInsideStatement.kts")
    public void testLocalFunctionInsideStatement() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localFunctionInsideStatement.kts");
    }

    @Test
    @TestMetadata("localFunctionInsideStringTemplateScript.kts")
    public void testLocalFunctionInsideStringTemplateScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localFunctionInsideStringTemplateScript.kts");
    }

    @Test
    @TestMetadata("localFunctionInsideSuperEntryCallScript.kts")
    public void testLocalFunctionInsideSuperEntryCallScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localFunctionInsideSuperEntryCallScript.kts");
    }

    @Test
    @TestMetadata("localNestedClassScript.kts")
    public void testLocalNestedClassScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localNestedClassScript.kts");
    }

    @Test
    @TestMetadata("localParameterInsideSuperEntryCallScript.kts")
    public void testLocalParameterInsideSuperEntryCallScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/localParameterInsideSuperEntryCallScript.kts");
    }

    @Test
    @TestMetadata("nestedCompilerRequiredAnnotationsForMemberScript.kts")
    public void testNestedCompilerRequiredAnnotationsForMemberScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/nestedCompilerRequiredAnnotationsForMemberScript.kts");
    }

    @Test
    @TestMetadata("nestedCompilerRequiredAnnotationsInsideBodyScript.kts")
    public void testNestedCompilerRequiredAnnotationsInsideBodyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/nestedCompilerRequiredAnnotationsInsideBodyScript.kts");
    }

    @Test
    @TestMetadata("nestedCompilerRequiredAnnotationsScript.kts")
    public void testNestedCompilerRequiredAnnotationsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/nestedCompilerRequiredAnnotationsScript.kts");
    }

    @Test
    @TestMetadata("nestedTypeAlias2Script.kts")
    public void testNestedTypeAlias2Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/nestedTypeAlias2Script.kts");
    }

    @Test
    @TestMetadata("nestedTypeAliasScript.kts")
    public void testNestedTypeAliasScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/nestedTypeAliasScript.kts");
    }

    @Test
    @TestMetadata("parameterOfNonLocalSetterScript.kts")
    public void testParameterOfNonLocalSetterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/parameterOfNonLocalSetterScript.kts");
    }

    @Test
    @TestMetadata("parameterOfTopSetterScript.kts")
    public void testParameterOfTopSetterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/parameterOfTopSetterScript.kts");
    }

    @Test
    @TestMetadata("primaryConstructorParameterScript.kts")
    public void testPrimaryConstructorParameterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/primaryConstructorParameterScript.kts");
    }

    @Test
    @TestMetadata("primaryConstructorPropertyScript.kts")
    public void testPrimaryConstructorPropertyScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/primaryConstructorPropertyScript.kts");
    }

    @Test
    @TestMetadata("primaryConstructorScript.kts")
    public void testPrimaryConstructorScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/primaryConstructorScript.kts");
    }

    @Test
    @TestMetadata("propertyWithGetterAndSetterScript.kts")
    public void testPropertyWithGetterAndSetterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/propertyWithGetterAndSetterScript.kts");
    }

    @Test
    @TestMetadata("propertyWithGetterScript.kts")
    public void testPropertyWithGetterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/propertyWithGetterScript.kts");
    }

    @Test
    @TestMetadata("propertyWithImplicitTypeAndAnnotationsScript.kts")
    public void testPropertyWithImplicitTypeAndAnnotationsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/propertyWithImplicitTypeAndAnnotationsScript.kts");
    }

    @Test
    @TestMetadata("propertyWithImplicitTypeAndFieldAnnotationsScript.kts")
    public void testPropertyWithImplicitTypeAndFieldAnnotationsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/propertyWithImplicitTypeAndFieldAnnotationsScript.kts");
    }

    @Test
    @TestMetadata("propertyWithInitializerScript.kts")
    public void testPropertyWithInitializerScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/propertyWithInitializerScript.kts");
    }

    @Test
    @TestMetadata("redeclarationScript.kts")
    public void testRedeclarationScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/redeclarationScript.kts");
    }

    @Test
    @TestMetadata("resolveSuperTypeFromLocalClassScript.kts")
    public void testResolveSuperTypeFromLocalClassScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/resolveSuperTypeFromLocalClassScript.kts");
    }

    @Test
    @TestMetadata("resolveTypeFromLocalClassConstructorScript.kts")
    public void testResolveTypeFromLocalClassConstructorScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/resolveTypeFromLocalClassConstructorScript.kts");
    }

    @Test
    @TestMetadata("resolveTypeFromLocalFunctionScript.kts")
    public void testResolveTypeFromLocalFunctionScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/resolveTypeFromLocalFunctionScript.kts");
    }

    @Test
    @TestMetadata("script.kts")
    public void testScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/script.kts");
    }

    @Test
    @TestMetadata("script2.kts")
    public void testScript2() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/script2.kts");
    }

    @Test
    @TestMetadata("script3.kts")
    public void testScript3() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/script3.kts");
    }

    @Test
    @TestMetadata("script4.kts")
    public void testScript4() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/script4.kts");
    }

    @Test
    @TestMetadata("scriptArgument.kts")
    public void testScriptArgument() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/scriptArgument.kts");
    }

    @Test
    @TestMetadata("secondaryConstructorParameterScript.kts")
    public void testSecondaryConstructorParameterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/secondaryConstructorParameterScript.kts");
    }

    @Test
    @TestMetadata("secondaryConstructorScript.kts")
    public void testSecondaryConstructorScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/secondaryConstructorScript.kts");
    }

    @Test
    @TestMetadata("statement.kts")
    public void testStatement() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/statement.kts");
    }

    @Test
    @TestMetadata("statement2.kts")
    public void testStatement2() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/statement2.kts");
    }

    @Test
    @TestMetadata("statementTransformation.kts")
    public void testStatementTransformation() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/statementTransformation.kts");
    }

    @Test
    @TestMetadata("substitutionFakeOverrideScript.kts")
    public void testSubstitutionFakeOverrideScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/substitutionFakeOverrideScript.kts");
    }

    @Test
    @TestMetadata("substitutionFakeOverrideWithImplicitTypeScript.kts")
    public void testSubstitutionFakeOverrideWithImplicitTypeScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/substitutionFakeOverrideWithImplicitTypeScript.kts");
    }

    @Test
    @TestMetadata("superTypesLoopScript.kts")
    public void testSuperTypesLoopScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/superTypesLoopScript.kts");
    }

    @Test
    @TestMetadata("superTypesScript.kts")
    public void testSuperTypesScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/superTypesScript.kts");
    }

    @Test
    @TestMetadata("syntheticResultDeclaration.kts")
    public void testSyntheticResultDeclaration() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/syntheticResultDeclaration.kts");
    }

    @Test
    @TestMetadata("syntheticResultDeclarationWithBigBody.kts")
    public void testSyntheticResultDeclarationWithBigBody() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/syntheticResultDeclarationWithBigBody.kts");
    }

    @Test
    @TestMetadata("topLevelFunctionsScript.kts")
    public void testTopLevelFunctionsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/topLevelFunctionsScript.kts");
    }

    @Test
    @TestMetadata("topLevelFunctionsWithExpressionBodyAndExplicitTypeScript.kts")
    public void testTopLevelFunctionsWithExpressionBodyAndExplicitTypeScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/topLevelFunctionsWithExpressionBodyAndExplicitTypeScript.kts");
    }

    @Test
    @TestMetadata("topLevelFunctionsWithImplicitTypeScript.kts")
    public void testTopLevelFunctionsWithImplicitTypeScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/topLevelFunctionsWithImplicitTypeScript.kts");
    }

    @Test
    @TestMetadata("typeParameterBoundsScript.kts")
    public void testTypeParameterBoundsScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterBoundsScript.kts");
    }

    @Test
    @TestMetadata("typeParameterOfClass2Script.kts")
    public void testTypeParameterOfClass2Script() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterOfClass2Script.kts");
    }

    @Test
    @TestMetadata("typeParameterOfClassScript.kts")
    public void testTypeParameterOfClassScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterOfClassScript.kts");
    }

    @Test
    @TestMetadata("typeParameterOfNonLocalFunctionScript.kts")
    public void testTypeParameterOfNonLocalFunctionScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterOfNonLocalFunctionScript.kts");
    }

    @Test
    @TestMetadata("typeParameterOfTopFunctionScript.kts")
    public void testTypeParameterOfTopFunctionScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterOfTopFunctionScript.kts");
    }

    @Test
    @TestMetadata("typeParameterOfTopSetterScript.kts")
    public void testTypeParameterOfTopSetterScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterOfTopSetterScript.kts");
    }

    @Test
    @TestMetadata("typeParameterOfTypeAliasScript.kts")
    public void testTypeParameterOfTypeAliasScript() throws Exception {
        runTest("analysis/low-level-api-fir/testData/lazyResolve/typeParameterOfTypeAliasScript.kts");
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Classes {
        @Test
        public void testAllFilesPresentInClasses() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/classes"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("annotationWithTargetScript.kts")
        public void testAnnotationWithTargetScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/annotationWithTargetScript.kts");
        }

        @Test
        @TestMetadata("classWithTypeParametersScript.kts")
        public void testClassWithTypeParametersScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/classWithTypeParametersScript.kts");
        }

        @Test
        @TestMetadata("functionInValueClassScript.kts")
        public void testFunctionInValueClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/functionInValueClassScript.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass2Script.kts")
        public void testHierarchyWithOverrideAndNestedClass2Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/hierarchyWithOverrideAndNestedClass2Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass3Script.kts")
        public void testHierarchyWithOverrideAndNestedClass3Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/hierarchyWithOverrideAndNestedClass3Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass4Script.kts")
        public void testHierarchyWithOverrideAndNestedClass4Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/hierarchyWithOverrideAndNestedClass4Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClassScript.kts")
        public void testHierarchyWithOverrideAndNestedClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/hierarchyWithOverrideAndNestedClassScript.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideScript.kts")
        public void testHierarchyWithOverrideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/hierarchyWithOverrideScript.kts");
        }

        @Test
        @TestMetadata("nestedClassScript.kts")
        public void testNestedClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/nestedClassScript.kts");
        }

        @Test
        @TestMetadata("nestedClassWithPropertiesOverridesScript.kts")
        public void testNestedClassWithPropertiesOverridesScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/nestedClassWithPropertiesOverridesScript.kts");
        }

        @Test
        @TestMetadata("simpleLoopInOverride2Script.kts")
        public void testSimpleLoopInOverride2Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/simpleLoopInOverride2Script.kts");
        }

        @Test
        @TestMetadata("simpleLoopInOverrideScript.kts")
        public void testSimpleLoopInOverrideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/classes/simpleLoopInOverrideScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/errors")
    @TestDataPath("$PROJECT_ROOT")
    public class Errors {
        @Test
        public void testAllFilesPresentInErrors() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/errors"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/functions")
    @TestDataPath("$PROJECT_ROOT")
    public class Functions {
        @Test
        public void testAllFilesPresentInFunctions() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/functions"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("contractScript.kts")
        public void testContractScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/contractScript.kts");
        }

        @Test
        @TestMetadata("contractScript2.kts")
        public void testContractScript2() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/contractScript2.kts");
        }

        @Test
        @TestMetadata("functionCallWithGenericResultScript.kts")
        public void testFunctionCallWithGenericResultScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/functionCallWithGenericResultScript.kts");
        }

        @Test
        @TestMetadata("functionParameterScript.kts")
        public void testFunctionParameterScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/functionParameterScript.kts");
        }

        @Test
        @TestMetadata("functionWithGenericExpectedTypeInsideScript.kts")
        public void testFunctionWithGenericExpectedTypeInsideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/functionWithGenericExpectedTypeInsideScript.kts");
        }

        @Test
        @TestMetadata("functionWithTypeParametersScript.kts")
        public void testFunctionWithTypeParametersScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/functionWithTypeParametersScript.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass2Script.kts")
        public void testHierarchyWithOverrideAndNestedClass2Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/hierarchyWithOverrideAndNestedClass2Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass3Script.kts")
        public void testHierarchyWithOverrideAndNestedClass3Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/hierarchyWithOverrideAndNestedClass3Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClassScript.kts")
        public void testHierarchyWithOverrideAndNestedClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/hierarchyWithOverrideAndNestedClassScript.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideScript.kts")
        public void testHierarchyWithOverrideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/hierarchyWithOverrideScript.kts");
        }

        @Test
        @TestMetadata("simpleLoopInOverride2Script.kts")
        public void testSimpleLoopInOverride2Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/simpleLoopInOverride2Script.kts");
        }

        @Test
        @TestMetadata("simpleLoopInOverrideScript.kts")
        public void testSimpleLoopInOverrideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/functions/simpleLoopInOverrideScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/noRuntime")
    @TestDataPath("$PROJECT_ROOT")
    public class NoRuntime {
        @Test
        public void testAllFilesPresentInNoRuntime() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/noRuntime"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/properties")
    @TestDataPath("$PROJECT_ROOT")
    public class Properties {
        @Test
        public void testAllFilesPresentInProperties() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/properties"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("getterWithDelegationScript.kts")
        public void testGetterWithDelegationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/getterWithDelegationScript.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass2Script.kts")
        public void testHierarchyWithOverrideAndNestedClass2Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/hierarchyWithOverrideAndNestedClass2Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass3Script.kts")
        public void testHierarchyWithOverrideAndNestedClass3Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/hierarchyWithOverrideAndNestedClass3Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClass4Script.kts")
        public void testHierarchyWithOverrideAndNestedClass4Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/hierarchyWithOverrideAndNestedClass4Script.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideAndNestedClassScript.kts")
        public void testHierarchyWithOverrideAndNestedClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/hierarchyWithOverrideAndNestedClassScript.kts");
        }

        @Test
        @TestMetadata("hierarchyWithOverrideScript.kts")
        public void testHierarchyWithOverrideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/hierarchyWithOverrideScript.kts");
        }

        @Test
        @TestMetadata("propertyGetterWithExplicitTypeAndBodyScript.kts")
        public void testPropertyGetterWithExplicitTypeAndBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/propertyGetterWithExplicitTypeAndBodyScript.kts");
        }

        @Test
        @TestMetadata("propertyGetterWithExplicitTypeScript.kts")
        public void testPropertyGetterWithExplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/propertyGetterWithExplicitTypeScript.kts");
        }

        @Test
        @TestMetadata("propertyGetterWithImplicitTypeScript.kts")
        public void testPropertyGetterWithImplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/propertyGetterWithImplicitTypeScript.kts");
        }

        @Test
        @TestMetadata("propertySetterScript.kts")
        public void testPropertySetterScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/propertySetterScript.kts");
        }

        @Test
        @TestMetadata("propertyWithTypeParametersScript.kts")
        public void testPropertyWithTypeParametersScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/propertyWithTypeParametersScript.kts");
        }

        @Test
        @TestMetadata("simpleLoopInOverride2Script.kts")
        public void testSimpleLoopInOverride2Script() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/simpleLoopInOverride2Script.kts");
        }

        @Test
        @TestMetadata("simpleLoopInOverrideScript.kts")
        public void testSimpleLoopInOverrideScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/properties/simpleLoopInOverrideScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/syntheticProperties")
    @TestDataPath("$PROJECT_ROOT")
    public class SyntheticProperties {
        @Test
        public void testAllFilesPresentInSyntheticProperties() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/syntheticProperties"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolve/typeAliases")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeAliases {
        @Test
        public void testAllFilesPresentInTypeAliases() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolve/typeAliases"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("typeAliasWithTypeParametersScript.kts")
        public void testTypeAliasWithTypeParametersScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolve/typeAliases/typeAliasWithTypeParametersScript.kts");
        }
    }
}
