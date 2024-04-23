package org.testing.Runner;

import java.io.IOException;

import org.testing.TestScripts.*;

public class Runner {

	public static void main(String[] args) throws IOException {
		
//		TC1_PostRequest t1=new TC1_PostRequest();
//		t1.TC1();
//		
//		TC2_GetAllRequest t2=new TC2_GetAllRequest();
//		t2.TC2();
//		
//		TC3_GetParticular t3=new TC3_GetParticular();
//		t3.TC3();
//		
//		TC4_PutRequest t4=new TC4_PutRequest();
//		t4.TC4();
//		
//		TC5_DeletRequest t5=new TC5_DeletRequest();
//		t5.TC5();
		
//		TC6_PostReqOnline t6=new TC6_PostReqOnline();
//		t6.TC6();
//		
//		TC7_GetAllReqOnline t7=new TC7_GetAllReqOnline();
//		t7.TC7();
//		
//		TC8_GetPartiReqOnline t8=new TC8_GetPartiReqOnline();
//		t8.TC8();
		
		TC9_PutReqOnline t9=new TC9_PutReqOnline();
		t9.TC9();
		
		TC10_DelReqOnline t10=new TC10_DelReqOnline();
		t10.TC10();
	}
}