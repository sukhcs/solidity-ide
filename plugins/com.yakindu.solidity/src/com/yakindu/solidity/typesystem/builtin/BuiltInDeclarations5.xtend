/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Andreas Muelder - Itemis AG - initial API and implementation
 * 	Karsten Thoms   - Itemis AG - initial API and implementation
 * 	Florian Antony  - Itemis AG - initial API and implementation
 * 	committers of YAKINDU 
 * 
 */
package com.yakindu.solidity.typesystem.builtin

import com.google.inject.Inject
import com.google.inject.Singleton
import com.yakindu.solidity.solidity.SolidityFactory
import org.yakindu.base.types.Operation
import org.yakindu.base.types.Property
import org.yakindu.base.types.TypesFactory
import org.yakindu.base.types.typesystem.ITypeSystem
import com.yakindu.solidity.typesystem.SolidityTypeSystem5

/**
 * @author Florian Antony - initial contribution and API.
 * 
 */
@Singleton
class BuiltInDeclarations5 extends BuiltInDeclarations {

	protected Property abi

	@Inject
	protected new(ITypeSystem typeSystem, TypesFactory typesFactory, SolidityFactory solidityFactory) {
		super(typeSystem, typesFactory, solidityFactory)
	}

	override protected initialize() {
		super.initialize()
		abi = createConstant("abi", SolidityTypeSystem5.ABI.typeForName)
	}

	override all() {
		#[abi, msg, assert_, require, revert, addmod, mulmod, keccak256, sha256, length, push, ripemd160, ecrecover,
			block, selfdestruct, this_, super_, now, tx, owned, mortal]
	}

	override protected Operation keccak256() {
		createOperation("keccak256", BYTES32) => [
			parameters += createParameter("argument", SolidityTypeSystem5.BYTES.typeForName) => [
				optional = false
				varArgs = false
			]
		]
	}
	override protected Operation sha256() {
		createOperation("sha256", BYTES32) => [
			parameters += createParameter("argument", SolidityTypeSystem5.BYTES.typeForName) => [
				optional = false
				varArgs = false
			]
		]
	}
	override protected Operation ripemd160() {
		createOperation("ripemd160", BYTES32) => [
			parameters += createParameter("argument", SolidityTypeSystem5.BYTES.typeForName) => [
				optional = false
				varArgs = false
			]
		]
	}
}
