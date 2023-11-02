/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// This file was generated automatically. See compiler/fir/tree/tree-generator/Readme.md.
// DO NOT MODIFY IT MANUALLY.

package org.jetbrains.kotlin.fir.visitors

import org.jetbrains.kotlin.fir.FirTargetElement
import org.jetbrains.kotlin.fir.contracts.FirEffectDeclaration
import org.jetbrains.kotlin.fir.contracts.FirLegacyRawContractDescription
import org.jetbrains.kotlin.fir.contracts.FirRawContractDescription
import org.jetbrains.kotlin.fir.contracts.FirResolvedContractDescription
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.expressions.*
import org.jetbrains.kotlin.fir.references.*
import org.jetbrains.kotlin.fir.types.*

abstract class FirDefaultVisitor<out R, in D> : FirVisitor<R, D>() {
    override fun visitTypeRef(typeRef: FirTypeRef, data: D): R = visitAnnotationContainer(typeRef, data)

    override fun visitResolvedDeclarationStatus(resolvedDeclarationStatus: FirResolvedDeclarationStatus, data: D): R = visitDeclarationStatus(resolvedDeclarationStatus, data)

    override fun visitStatement(statement: FirStatement, data: D): R = visitAnnotationContainer(statement, data)

    override fun visitExpression(expression: FirExpression, data: D): R = visitStatement(expression, data)

    override fun visitLazyExpression(lazyExpression: FirLazyExpression, data: D): R = visitExpression(lazyExpression, data)

    override fun visitTypeParametersOwner(typeParametersOwner: FirTypeParametersOwner, data: D): R = visitTypeParameterRefsOwner(typeParametersOwner, data)

    override fun visitCallableDeclaration(callableDeclaration: FirCallableDeclaration, data: D): R = visitMemberDeclaration(callableDeclaration, data)

    override fun visitConstructedClassTypeParameterRef(constructedClassTypeParameterRef: FirConstructedClassTypeParameterRef, data: D): R = visitTypeParameterRef(constructedClassTypeParameterRef, data)

    override fun visitOuterClassTypeParameterRef(outerClassTypeParameterRef: FirOuterClassTypeParameterRef, data: D): R = visitTypeParameterRef(outerClassTypeParameterRef, data)

    override fun visitReceiverParameter(receiverParameter: FirReceiverParameter, data: D): R = visitAnnotationContainer(receiverParameter, data)

    override fun visitEnumEntry(enumEntry: FirEnumEntry, data: D): R = visitVariable(enumEntry, data)

    override fun visitRegularClass(regularClass: FirRegularClass, data: D): R = visitClass(regularClass, data)

    override fun visitScript(script: FirScript, data: D): R = visitDeclaration(script, data)

    override fun visitCodeFragment(codeFragment: FirCodeFragment, data: D): R = visitDeclaration(codeFragment, data)

    override fun visitAnonymousFunctionExpression(anonymousFunctionExpression: FirAnonymousFunctionExpression, data: D): R = visitExpression(anonymousFunctionExpression, data)

    override fun visitAnonymousObject(anonymousObject: FirAnonymousObject, data: D): R = visitClass(anonymousObject, data)

    override fun visitAnonymousObjectExpression(anonymousObjectExpression: FirAnonymousObjectExpression, data: D): R = visitExpression(anonymousObjectExpression, data)

    override fun visitResolvedImport(resolvedImport: FirResolvedImport, data: D): R = visitImport(resolvedImport, data)

    override fun visitDoWhileLoop(doWhileLoop: FirDoWhileLoop, data: D): R = visitLoop(doWhileLoop, data)

    override fun visitWhileLoop(whileLoop: FirWhileLoop, data: D): R = visitLoop(whileLoop, data)

    override fun visitBlock(block: FirBlock, data: D): R = visitExpression(block, data)

    override fun visitLazyBlock(lazyBlock: FirLazyBlock, data: D): R = visitBlock(lazyBlock, data)

    override fun visitBinaryLogicExpression(binaryLogicExpression: FirBinaryLogicExpression, data: D): R = visitExpression(binaryLogicExpression, data)

    override fun <E : FirTargetElement> visitJump(jump: FirJump<E>, data: D): R = visitExpression(jump, data)

    override fun visitLoopJump(loopJump: FirLoopJump, data: D): R = visitJump(loopJump, data)

    override fun visitBreakExpression(breakExpression: FirBreakExpression, data: D): R = visitLoopJump(breakExpression, data)

    override fun visitContinueExpression(continueExpression: FirContinueExpression, data: D): R = visitLoopJump(continueExpression, data)

    override fun <T> visitConstExpression(constExpression: FirConstExpression<T>, data: D): R = visitExpression(constExpression, data)

    override fun visitStarProjection(starProjection: FirStarProjection, data: D): R = visitTypeProjection(starProjection, data)

    override fun visitPlaceholderProjection(placeholderProjection: FirPlaceholderProjection, data: D): R = visitTypeProjection(placeholderProjection, data)

    override fun visitTypeProjectionWithVariance(typeProjectionWithVariance: FirTypeProjectionWithVariance, data: D): R = visitTypeProjection(typeProjectionWithVariance, data)

    override fun visitCall(call: FirCall, data: D): R = visitStatement(call, data)

    override fun visitAnnotation(annotation: FirAnnotation, data: D): R = visitExpression(annotation, data)

    override fun visitComparisonExpression(comparisonExpression: FirComparisonExpression, data: D): R = visitExpression(comparisonExpression, data)

    override fun visitAssignmentOperatorStatement(assignmentOperatorStatement: FirAssignmentOperatorStatement, data: D): R = visitStatement(assignmentOperatorStatement, data)

    override fun visitIncrementDecrementExpression(incrementDecrementExpression: FirIncrementDecrementExpression, data: D): R = visitExpression(incrementDecrementExpression, data)

    override fun visitAugmentedArraySetCall(augmentedArraySetCall: FirAugmentedArraySetCall, data: D): R = visitStatement(augmentedArraySetCall, data)

    override fun visitClassReferenceExpression(classReferenceExpression: FirClassReferenceExpression, data: D): R = visitExpression(classReferenceExpression, data)

    override fun visitPropertyAccessExpression(propertyAccessExpression: FirPropertyAccessExpression, data: D): R = visitQualifiedAccessExpression(propertyAccessExpression, data)

    override fun visitIntegerLiteralOperatorCall(integerLiteralOperatorCall: FirIntegerLiteralOperatorCall, data: D): R = visitFunctionCall(integerLiteralOperatorCall, data)

    override fun visitImplicitInvokeCall(implicitInvokeCall: FirImplicitInvokeCall, data: D): R = visitFunctionCall(implicitInvokeCall, data)

    override fun visitMultiDelegatedConstructorCall(multiDelegatedConstructorCall: FirMultiDelegatedConstructorCall, data: D): R = visitDelegatedConstructorCall(multiDelegatedConstructorCall, data)

    override fun visitComponentCall(componentCall: FirComponentCall, data: D): R = visitFunctionCall(componentCall, data)

    override fun visitCallableReferenceAccess(callableReferenceAccess: FirCallableReferenceAccess, data: D): R = visitQualifiedAccessExpression(callableReferenceAccess, data)

    override fun visitThisReceiverExpression(thisReceiverExpression: FirThisReceiverExpression, data: D): R = visitQualifiedAccessExpression(thisReceiverExpression, data)

    override fun visitSmartCastExpression(smartCastExpression: FirSmartCastExpression, data: D): R = visitExpression(smartCastExpression, data)

    override fun visitSafeCallExpression(safeCallExpression: FirSafeCallExpression, data: D): R = visitExpression(safeCallExpression, data)

    override fun visitCheckedSafeCallSubject(checkedSafeCallSubject: FirCheckedSafeCallSubject, data: D): R = visitExpression(checkedSafeCallSubject, data)

    override fun visitWrappedExpression(wrappedExpression: FirWrappedExpression, data: D): R = visitExpression(wrappedExpression, data)

    override fun visitWrappedArgumentExpression(wrappedArgumentExpression: FirWrappedArgumentExpression, data: D): R = visitWrappedExpression(wrappedArgumentExpression, data)

    override fun visitLambdaArgumentExpression(lambdaArgumentExpression: FirLambdaArgumentExpression, data: D): R = visitWrappedArgumentExpression(lambdaArgumentExpression, data)

    override fun visitSpreadArgumentExpression(spreadArgumentExpression: FirSpreadArgumentExpression, data: D): R = visitWrappedArgumentExpression(spreadArgumentExpression, data)

    override fun visitNamedArgumentExpression(namedArgumentExpression: FirNamedArgumentExpression, data: D): R = visitWrappedArgumentExpression(namedArgumentExpression, data)

    override fun visitVarargArgumentsExpression(varargArgumentsExpression: FirVarargArgumentsExpression, data: D): R = visitExpression(varargArgumentsExpression, data)

    override fun visitResolvedQualifier(resolvedQualifier: FirResolvedQualifier, data: D): R = visitExpression(resolvedQualifier, data)

    override fun visitResolvedReifiedParameterReference(resolvedReifiedParameterReference: FirResolvedReifiedParameterReference, data: D): R = visitExpression(resolvedReifiedParameterReference, data)

    override fun visitReturnExpression(returnExpression: FirReturnExpression, data: D): R = visitJump(returnExpression, data)

    override fun visitThrowExpression(throwExpression: FirThrowExpression, data: D): R = visitExpression(throwExpression, data)

    override fun visitVariableAssignment(variableAssignment: FirVariableAssignment, data: D): R = visitStatement(variableAssignment, data)

    override fun visitWhenSubjectExpression(whenSubjectExpression: FirWhenSubjectExpression, data: D): R = visitExpression(whenSubjectExpression, data)

    override fun visitDesugaredAssignmentValueReferenceExpression(desugaredAssignmentValueReferenceExpression: FirDesugaredAssignmentValueReferenceExpression, data: D): R = visitExpression(desugaredAssignmentValueReferenceExpression, data)

    override fun visitWrappedDelegateExpression(wrappedDelegateExpression: FirWrappedDelegateExpression, data: D): R = visitWrappedExpression(wrappedDelegateExpression, data)

    override fun visitEnumEntryDeserializedAccessExpression(enumEntryDeserializedAccessExpression: FirEnumEntryDeserializedAccessExpression, data: D): R = visitExpression(enumEntryDeserializedAccessExpression, data)

    override fun visitNamedReference(namedReference: FirNamedReference, data: D): R = visitReference(namedReference, data)

    override fun visitNamedReferenceWithCandidateBase(namedReferenceWithCandidateBase: FirNamedReferenceWithCandidateBase, data: D): R = visitNamedReference(namedReferenceWithCandidateBase, data)

    override fun visitFromMissingDependenciesNamedReference(fromMissingDependenciesNamedReference: FirFromMissingDependenciesNamedReference, data: D): R = visitNamedReference(fromMissingDependenciesNamedReference, data)

    override fun visitSuperReference(superReference: FirSuperReference, data: D): R = visitReference(superReference, data)

    override fun visitThisReference(thisReference: FirThisReference, data: D): R = visitReference(thisReference, data)

    override fun visitControlFlowGraphReference(controlFlowGraphReference: FirControlFlowGraphReference, data: D): R = visitReference(controlFlowGraphReference, data)

    override fun visitResolvedNamedReference(resolvedNamedReference: FirResolvedNamedReference, data: D): R = visitNamedReference(resolvedNamedReference, data)

    override fun visitResolvedErrorReference(resolvedErrorReference: FirResolvedErrorReference, data: D): R = visitResolvedNamedReference(resolvedErrorReference, data)

    override fun visitDelegateFieldReference(delegateFieldReference: FirDelegateFieldReference, data: D): R = visitResolvedNamedReference(delegateFieldReference, data)

    override fun visitBackingFieldReference(backingFieldReference: FirBackingFieldReference, data: D): R = visitResolvedNamedReference(backingFieldReference, data)

    override fun visitResolvedCallableReference(resolvedCallableReference: FirResolvedCallableReference, data: D): R = visitResolvedNamedReference(resolvedCallableReference, data)

    override fun visitResolvedTypeRef(resolvedTypeRef: FirResolvedTypeRef, data: D): R = visitTypeRef(resolvedTypeRef, data)

    override fun visitTypeRefWithNullability(typeRefWithNullability: FirTypeRefWithNullability, data: D): R = visitTypeRef(typeRefWithNullability, data)

    override fun visitUserTypeRef(userTypeRef: FirUserTypeRef, data: D): R = visitTypeRefWithNullability(userTypeRef, data)

    override fun visitDynamicTypeRef(dynamicTypeRef: FirDynamicTypeRef, data: D): R = visitTypeRefWithNullability(dynamicTypeRef, data)

    override fun visitFunctionTypeRef(functionTypeRef: FirFunctionTypeRef, data: D): R = visitTypeRefWithNullability(functionTypeRef, data)

    override fun visitIntersectionTypeRef(intersectionTypeRef: FirIntersectionTypeRef, data: D): R = visitTypeRefWithNullability(intersectionTypeRef, data)

    override fun visitImplicitTypeRef(implicitTypeRef: FirImplicitTypeRef, data: D): R = visitTypeRef(implicitTypeRef, data)

    override fun visitEffectDeclaration(effectDeclaration: FirEffectDeclaration, data: D): R = visitContractElementDeclaration(effectDeclaration, data)

    override fun visitLegacyRawContractDescription(legacyRawContractDescription: FirLegacyRawContractDescription, data: D): R = visitContractDescription(legacyRawContractDescription, data)

    override fun visitRawContractDescription(rawContractDescription: FirRawContractDescription, data: D): R = visitContractDescription(rawContractDescription, data)

    override fun visitResolvedContractDescription(resolvedContractDescription: FirResolvedContractDescription, data: D): R = visitContractDescription(resolvedContractDescription, data)

}
