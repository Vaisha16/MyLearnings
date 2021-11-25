package com.myLearning.exceptionHandling;

interface Maths {
	void div() throws Exception; 
		
}
class calc{
	void process(Maths m)
	{
		try {
		m.div()	
		}
	}
}