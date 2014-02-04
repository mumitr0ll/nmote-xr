/*
 * Copyright (c) Nmote Ltd. 2003-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.xr.samples;

import com.nmote.xr.XRMethod;

interface Examples {

	@XRMethod("examples.getStateName")
	public String getStateName(int n);
}